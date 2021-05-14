package sec01;
import java.util.Scanner;
public class His {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 10개 입력하세요 : ");
		int arr[] = new int[10];
		int c9=0,c8=0,c7=0,c6=0,c5=0,c4=0,c3=0,c2=0,c1=0,c0=0;
		for(int i = 0; i<arr.length; i++) {
			arr[i] = in.nextInt();
			if(arr[i] >= 90) c9++;
			else if(arr[i]>=80) c8++;
			else if(arr[i] >= 70) c7++;
			else if(arr[i] >= 60) c6++;
			else if(arr[i] >= 50) c5++;
			else if(arr[i] >= 40) c4++;
			else if(arr[i] >= 30) c3++;
			else if(arr[i] >= 20) c2++;
			else if(arr[i] >= 10) c1++;
			else if(arr[i] >= 0) c0++;
		}
		int arr2[] = {c0,c1,c2,c3,c4,c5,c6,c7,c8,c9};

		for(int i =0; i<arr.length; i++) {
			System.out.print(i+"0 ~ "+ i+"9 : ");
			for(int j = 0; j<arr2[i]; j++)
					System.out.print("*");
			System.out.print("\n");
			
		}
	}

}
