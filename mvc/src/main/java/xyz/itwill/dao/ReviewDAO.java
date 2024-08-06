package xyz.itwill.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import xyz.itwill.dto.ReviewDTO;

public class ReviewDAO extends JdbcDAO {
    private static ReviewDAO _dao;

    private ReviewDAO() {
    	// TODO Auto-generated constructor stub
    }

    static {
        _dao = new ReviewDAO();
    }

    public static ReviewDAO getDAO() {
        return _dao;
    }
  
    public int selectTotalReview() throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        int count = 0;
        try {
            con = getConnection();
            String sql = "SELECT COUNT(*) FROM review";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }    
        } finally {
            close(con, pstmt, rs);
        }
        return count;
    }
    
    public ReviewDTO selectReviewByNum(int reviewNum) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ReviewDTO review = null; 
        try {
            con = getConnection();
            String sql = "SELECT review_num, review_subject, review_content, review_status"
            		+ ", review_date, review_id FROM review WHERE review_num=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, reviewNum);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                review = new ReviewDTO(); 
                review.setReviewNum(rs.getInt("review_num"));
                review.setReviewSubject(rs.getString("review_subject"));
                review.setReviewContent(rs.getString("review_content"));
                review.setReviewStatus(rs.getInt("review_status"));
                review.setReviewDate(rs.getString("review_date"));
                review.setReviewId(rs.getString("review_id"));
            }    
        } finally {
            close(con, pstmt, rs);
        }
        return review;
    }
   
    public int insertReview(ReviewDTO review) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        int rows = 0;
        try {
            con = getConnection();            
            String sql = "INSERT INTO review (review_num, review_subject, review_content, review_status"
            		+ ", review_date, review_id) VALUES (?, ?, ?, ?, ?, ?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, review.getReviewNum());
            pstmt.setString(2, review.getReviewSubject());
            pstmt.setString(3, review.getReviewContent());
            pstmt.setInt(4, review.getReviewStatus());
            pstmt.setString(5, review.getReviewDate());
            pstmt.setString(6, review.getReviewId());            
            rows = pstmt.executeUpdate();    
        } finally {
            close(con, pstmt);
        }
        return rows;
    }
  
    public int updateReview(ReviewDTO review) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        int rows = 0;
        try {
            con = getConnection();
            String sql = "UPDATE review SET review_subject=?, review_content=?, review_status=? WHERE review_num=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, review.getReviewSubject());
            pstmt.setString(2, review.getReviewContent());
            pstmt.setInt(3, review.getReviewStatus());
            pstmt.setInt(4, review.getReviewNum());
            rows = pstmt.executeUpdate();   
        } finally {
            close(con, pstmt);
        }
        return rows;
    }
    
    public int deleteReview(int reviewNum) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        int rows = 0;
        try {
            con = getConnection();
            String sql = "DELETE FROM review WHERE review_num=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, reviewNum);
            rows = pstmt.executeUpdate();   
        } finally {
            close(con, pstmt);
        }
        return rows;
    }
   
    public List<ReviewDTO> selectAllReviews() throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<ReviewDTO> reviews = new ArrayList<>();
        try {
            con = getConnection();
            String sql = "SELECT review_num, review_subject, review_content, review_status, review_date"
            		+ ", review_id FROM review ORDER BY review_num";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                ReviewDTO review = new ReviewDTO();
                review.setReviewNum(rs.getInt("review_num"));
                review.setReviewSubject(rs.getString("review_subject"));
                review.setReviewContent(rs.getString("review_content"));
                review.setReviewStatus(rs.getInt("review_status"));
                review.setReviewDate(rs.getString("review_date"));
                review.setReviewId(rs.getString("review_id"));
                reviews.add(review);
            }
        } finally {
            close(con, pstmt, rs);
        }
        return reviews;
    }
}
