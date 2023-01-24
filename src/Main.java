import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;
    }

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("___________________________________________Задача 1______________________________________");
        int[] arr = generateRandomArray();
        int sum = 0;
        int min = 999999;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
}
