import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int asc = 1;
		int dec = 1;
		int[] a= {0,1,2,3,4,5,6,7,};
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		a[3] = sc.nextInt();
		a[4] = sc.nextInt();
		a[5] = sc.nextInt();
		a[6] = sc.nextInt();
		a[7] = sc.nextInt();
		
		for (int i=0; i<7; i++) {
			if(a[i]<=a[i+1]) {
				dec =0;
		} 
			 if(a[i]>=a[i+1]) {
				 asc=0;
			 }
	}
			 if(asc==1) {
				 System.out.println("ascending");
			 }
			 else if(dec==1) {
				 System.out.println("descending");
			 }
			 else if(asc==0 && dec==0) {
				 System.out.println("mixed");
			 }
  }

}