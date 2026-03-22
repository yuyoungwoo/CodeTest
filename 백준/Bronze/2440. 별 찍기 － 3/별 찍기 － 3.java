import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=0 ; i<N ; i=i+1)
        {
		for(int j=0; j<N-i;j=j+1) {
			System.out.print("*");
}
		System.out.println();
        }
	}
}