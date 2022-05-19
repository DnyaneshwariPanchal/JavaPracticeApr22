package dnyan;

public class Assignment26 {
	int num1 = 0;
	int num2 = 1;
	int temp;
	int count = 0;

	void fab(int firstNnumber) {
		while (count <= firstNnumber) {
			System.out.println(num1);
			temp = num1 + num2;
			num1 = num2;
			num2 = temp;
			count++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment26 assignment26 = new Assignment26();
		assignment26.fab(12);

	}

}
