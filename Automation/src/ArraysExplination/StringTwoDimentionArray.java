package ArraysExplination;

public class StringTwoDimentionArray {

	public static void main(String[] args) {

		String[][] arr = { { "Mayur", "Saykhede", "mayurs@gmail.com", "MS@7387" },
				{ "Kunal", "Kulkarni", "kunalk@gmail.com", "KK@9545" },
				{ "Tejas", "Pawar", "tejasp@gmail.com", "TP@7620" },
				{ "Kartikesh", "Sawant", "kartikeshs@gmail.com", "KS@8788" } };

		String[][] result = new String[arr.length][];
		for (int i = 0; i < arr.length; i++) {
			result[i] = new String[arr[i].length];
			for (int j = 0; j < arr[i].length; j++) {
				result[i][j] = arr[i][j];
			}
		}

		for (int i = 0; i < result.length; i++) {	
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();

		}
	}
}
