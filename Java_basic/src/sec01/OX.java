package sec01;
import java.util.Scanner;
public class OX {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		int score[] = new int[10];
		
		int ans[] = new int [10];
		
		int count = 0;
		
//		int num = in.nextInt();
//		for(int j = 1; j <= num; j++) {	
			for(int i = 0; i<ans.length; i++) {
				ans[i] = in.nextInt();
				if(ans[i] == 0) {
					count++;
				}
//			}
		}
			System.out.println(count);
			for(int i = 0; i<ans.length; i++) {
				System.out.println(ans[i]);
			}
//			System.out.printf("%d 번째 테스트 케이스에서 맞은 개수는 %d이다.", j+1, count);	
	}

}
