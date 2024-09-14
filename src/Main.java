public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 13, 7, 8, 2, 5, 9, 3, 1};
        int temp = 0;
        System.out.println("Изначальный массив: ");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);

            }
        }
        System.out.println();
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }


        }
    }


}








