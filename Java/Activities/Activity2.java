package activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		int[] numArr = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(numArr));
        
        int num = 10;
        int total = 30;


        System.out.println("Result: " + result(numArr, num, total));
    }

    public static boolean result(int[] numbers, int num, int total) {
        int temp = 0;
 
        for (int number : numbers) {
            if (number == num) {
                temp += num;
            }

  
            if (num > total) {
                break;
            }
        }

        //Return true if condition satisfies
        return temp == total;
    }


	}


