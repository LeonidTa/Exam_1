package arrays;

public class NumberHelper {
    public static void main(String[] args) {

        int [] arraySort = {1, 2, 4, 3, 5};

        System.out.println(isSortedArray(arraySort));

        int [] arrayDuplicate = {1, 5, 3, 1, 9, 2, 5};
        int [] arrayRemDuplicates = removeDuplicates(arrayDuplicate);
        for (int n : arrayRemDuplicates) {
            System.out.println(n);
        }
    }

    public static boolean isSortedArray(int[] number) {
        int current = 0;
        for (int n : number) {
            if (n > current) {
                current = n;
            }
            else return false;
        }
        return true;
    }


    public static int[] removeDuplicates(int [] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[i] == numbers[j]) {
                    numbers[j] = -1;
                }
            }
        }
        return numbers;
    }
}
