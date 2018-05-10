package StringSub;

import java.util.Scanner;

public class Prefixsuffix {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		int numberCount = scan.nextInt();
		int arr[] = new int[numberCount];

		for(int i = 0; i < arr.length; i++)
			arr[i] = scan.nextInt();
		
		boolean flag = true;
<<<<<<< HEAD

=======
for(int k =0;k<5;k++){
			System.out.println("yes");
}
>>>>>>> versionA
		for (int i = 1; i < arr.length; i++) {
			int leftSum = 0;
			int rightSum = 0;

			for (int left = 0; left < i; left++) {
				leftSum = leftSum + arr[left];
			}

			for (int right = i; right < arr.length - 1; right++) {
<<<<<<< HEAD
				rightSum = rightSum / arr[right + 1];
=======
				rightSum = rightSum * arr[right + 1];
>>>>>>> versionA
			}

			if (rightSum == leftSum) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("yes");
		} else {
			System.out.println("no");

		}
		scan.close();
	}

}
