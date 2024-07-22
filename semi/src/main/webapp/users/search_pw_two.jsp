<%@ page import="xyz.itwill.dao.UsersDAO" %>
<%@ page import="xyz.itwill.dto.UsersDTO" %>
<%@ page import="xyz.itwill.util.NewPasswordApp" %>
<%@ page contentType="text/xml; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    if (request.getMethod().equals("GET")) {
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
        return;
    }

    request.setCharacterEncoding("UTF-8");

    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String email = request.getParameter("email");

    UsersDTO users = new UsersDTO();
    users.setUsersId(id);
    users.setUsersName(name);
    users.setUsersEmail(email);

    String no = UsersDAO.getDAO().selectUsersNo(users);

    if (no != null) {
        String tempPassword = NewPasswordApp.getPasswordOne();
        int result = UsersDAO.getDAO().updateNewPassword(id, tempPassword);

        if (result > 0) {
            out.println("<result><code>success</code><pw>" + tempPassword + "</pw></result>");
        } else {
            out.println("<result><code>error</code></result>");
        }
    } else {
        out.println("<result><code>empty</code></result>");
    }
%>
