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
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("___________________________________________Задача 1______________________________________");

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
//        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("___________________________________________Задача 2______________________________________");
        int[] arr = generateRandomArray();
        int min = 999999;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
//        System.out.println(Arrays.toString(arr));

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        System.out.println("___________________________________________Задача 3______________________________________");
        int[] arr = generateRandomArray();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
//            System.out.println(sum);
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / arr.length + " рублей");
    }
}
