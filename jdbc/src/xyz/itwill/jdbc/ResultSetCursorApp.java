package xyz.itwill.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetCursorApp {
	public static void main(String[] args) throws SQLException {
		Connection con=ConnectionFactory.getConnection();
		
		//Connection.createStatement() : SQL 명령을 전달하여 실행하기 위한 Statement 객체를 생성하여
		
		Statement stmt=con.createStatement();
		
		String sql="select no,name,phone,address,birthday from student order by no";
		//Statement.executeQuery(String sql) : SELECT 명령을 전달하여 실행하고 검색된 모든 
		//행이 저장된 ResultSet 객체를 반환하는 메소드
		// => Connection.createStatement() 메소드에 의해 생성된 Statement 객체로 SELECT 명령을
		//전달해 반환받은 ResultSet 객체는 커서를 다음행으로만 이동 가능하며 커서 위치의
		//처리행에 대한 조작 불가능
		ResultSet rs=stmt.executeQuery(sql);
		//System.out.println("rs= "+rs);
		
		//ResultSet.next() : ResultSet 객체에 저장된 검색행을 처리하기 위한 커서를 다음행으로
		// => 이동된 커서 위치에 처리행이 없는 경우 [false]를 반환하고 처리행이 있는 경우 [true]를 반환
		while(rs.next()) {
			//ResultSet.getRow() : ResultSet 객체에서 커서 위치의 처리행에 대한 행번호(RowIndex)
			System.out.println(rs.getRow()+"행 : 학번 = "+rs.getInt("no")+", 이름 = "+rs.getString("name"));
		}
		//Connection.createStatement(int resultSetType, int resultSetConcurrency)
		// => SQL 명령을 전달하여 실행하기 위한 Statement 객체를 생성하여 반환하는 메소드
		// => 매개변수에 저장되는 정수값에 따라 Statement 객체로 생성되어 반환하는 ResultSet
		//객체의 커서에 대한 이동 설정 및 커서가 위치한 처리행의 조작 설정 가능
		//resultSetType : ResultSet 객체의 커서 이동 관련 속성값(ResultSet 인터페이스의 상수 사용
		// => 
		stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY );
		
		sql="select no,name,phone,address,birthday from student order by no";
		rs=stmt.executeQuery(sql);
		
		System.out.println("rs = "+rs);
		
		
		
		
		ConnectionFactory.close(con,stmt,rs);
		
		
		
	
	}
}
