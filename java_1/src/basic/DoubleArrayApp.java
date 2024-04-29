package basic;

public class DoubleArrayApp {
	public static void main(String[] args) {
		int[][] numArray=new int[2][3];
		
		System.out.println("numArray="+numArray);
		System.out.println("numArray[0]="+numArray[0]);
		System.out.println("numArray[1]="+numArray[1]);
		
		System.out.println("numArray[0][0]="+numArray[0][0]);
		System.out.println("numArray[0][1]="+numArray[0][1]);
		System.out.println("numArray[0][2]="+numArray[0][2]);
		
		System.out.println("numArray[1][0]="+numArray[1][0]);
		System.out.println("numArray[1][1]="+numArray[1][1]);
		System.out.println("numArray[1][2]="+numArray[1][2]);
		
		System.out.println("numArray.length = "+numArray.length);
		System.out.println("numArray[0].length = "+numArray[0].length);
		System.out.println("numArray[1].length = "+numArray[1].length);
		for(int i=0;i<numArray.length;i++) {
			for(int j=0;j<numArray[i].length;j++) {
				System.out.print(numArray[i][j]+"\t");
				
			}
			System.out.println();
			
			
		}
		//int[][] suArray=new int[][] {{10,20,30},{40,50,60},{70,80,90}};
		int[][] suArray={{10,20,30},{40,50,60},{70,80,90}};
		
		for(int[] array : suArray) {
			for(int num : array) {
				System.out.print(num+"\t");
				}
			System.out.println();
		}
		
		int[][]valueArray=new int[3][];
		System.out.println("valueArray="+valueArray);
		System.out.println("valueArray[0]="+valueArray[0]);
		System.out.println("valueArray[1]="+valueArray[1]);
		System.out.println("valueArray[2]="+valueArray[2]);
		
		
		valueArray[0]=new int[3];
		valueArray[1]=new int[2];
		valueArray[2]=new int[4];
		
		System.out.println("valueArray[0]="+valueArray[0]);
		System.out.println("valueArray[1]="+valueArray[1]);
		System.out.println("valueArray[2]="+valueArray[2]);
		int[][] doubleArray= {{10,20,30},{40,50,60},{70,80,90}};
		for(int[] array : suArray) {
			for(int num : array) {
				System.out.print(num+"\t");
				}
			System.out.println();
		}
	}
}
