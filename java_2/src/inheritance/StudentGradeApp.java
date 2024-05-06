package inheritance;

public class StudentGradeApp {
	public static void main(String[] args) {
		StudentGrade[] students= {new StudentGrade(1000, "홍길동",90,80,70),
				new StudentGrade(2000, "임꺽정",40,50,60),new StudentGrade(3000, "전우치",90,100,80),
				new StudentGrade(4000, "일지매",90,90,90),new StudentGrade(5000, "장길산",30,40,50)};
		
		int total = 0; 
        for (StudentGrade student : students) {
            student.display();
            total += student.getTot(); 
        }
		System.out.println("총합계 = "+StudentGrade.getTotal());	
		System.out.println("총평균 = "+StudentGrade.getAverage());	
	}
	
}
