package sorting_algo;

public class Insertion {
    int[] arr = { 2, 1, 4, 6, -1, 0 };

    void insertSort() {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
                j = j - 1;

            }

        }
    }

    void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Insertion insert = new Insertion();
        insert.insertSort();
        insert.print();
    }
}
