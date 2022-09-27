import java.util.Arrays;
import java.util.Random;

public class SPTV21_ulesanne4_KeplastBogdan {
    public static void main(String[] args) {
        int[] nums;
        int avg = 0, sum = 0;
        nums = new int[100];
        Random random = new Random();
        int min = 1, max = 100;
        int i;
        for (i = 0; i < nums.length; i++) 
        {
        nums[i] = random.nextInt(max - min + 1) - min;
        sum +=nums[i];
        }
        avg = sum/100;
        Arrays.sort(nums);
        for (int s = 0; s < 10; s++) {
        for (int v = 0; v < 10; v++) {
        System.out.print(nums[s * 10 + v] + " ");
        }
        System.out.print("\n");
        }
        System.out.println("Среднее арифметическое: " + avg);   
    }
}
