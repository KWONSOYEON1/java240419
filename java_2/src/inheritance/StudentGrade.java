package inheritance;

public class StudentGrade {
	private int num;
	private String name;
	private int kor, eng, mat, tot;
	
	private static int total;
	private static int count;
	
	public StudentGrade() {
		// TODO Auto-generated constructor stub
	}

	public StudentGrade(int num, String name, int kor, int eng, int mat) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		calcTot();
		total += tot;
	    count++;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}
	public void calcTot() {
		tot=kor+eng+mat;
	}
	public void display() {
		System.out.print("["+name+"]님의 성적 >> ");
		System.out.println("국어 = "+kor+", 영어 = "+eng+", 수학 = "+mat+", 총점 = "+tot);
	}

	
	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		StudentGrade.total = total;
	}
	public static double getAverage() {
        return (double) total / count;
    }
	
}