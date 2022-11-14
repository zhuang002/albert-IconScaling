import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] icon = {"*x*"," xx", "* *"};
		int scale = sc.nextInt();
		
		for (int i=0;i<icon.length;i++) {
			String row = icon[i];
			String newRow = getScaledRow(row, scale);
			for (int j=0;j<scale;j++) {
				System.out.println(newRow);
			}
		}
	}

	private static String getScaledRow(String row, int scale) {
		// TODO Auto-generated method stub
		String newRow = "";
		for (int i=0;i<row.length();i++) {
			char c = row.charAt(i);
			for (int j=0;j<scale;j++) {
				newRow += c;
			}
		}
		return newRow;
	}

}
