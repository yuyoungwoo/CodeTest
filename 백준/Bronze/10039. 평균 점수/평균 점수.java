import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []a = {0,1,2,3,4};
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		a[3] = sc.nextInt();
		a[4] = sc.nextInt();
		
		if (a[0]<40) {
			a[0]=40;
		}
		if (a[1]<40) {
			a[1]=40;
		}
		if (a[2]<40) {
			a[2]=40;
		}
		if (a[3]<40) {
			a[3]=40;
		}
		if (a[4]<40) {
			a[4]=40;
		}
		System.out.println((a[0]+a[1]+a[2]+a[3]+a[4])/5); 
	}
}


