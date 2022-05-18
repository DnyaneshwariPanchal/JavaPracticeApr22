package dnyan;

public class Practice {
 void add(int num1,int num2) {
	 System.out.println("sum is "+(num1+num2));
 }
	// 0,1,1,2,3,5,8,13,21,34,55,89
	public static void main(String[] args) {
		System.out.println("project created");
		Practice practice=new Practice();
		practice.add(2,10);
	}
}
