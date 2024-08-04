package VarArgs;

public class Addition2 {
	
	public static int add(int... n) {
		int sum = 0;
		for(int i=0; i<n.length; i++)
		{
			sum+=n[i]; // sum = sum + n[i]
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println(add());
		System.out.println(add(1));
		System.out.println(add(10,20,30));
		int[] arr = {1,2,3,4,5};
		System.out.println(add(arr));
	}

}
