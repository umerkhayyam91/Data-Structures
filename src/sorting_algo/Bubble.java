package sorting_algo;

public class Bubble {
    int[] arr = { 99, 31, 44, 23 };

    void bubbleSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void print(){
        for (int i = 0; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Bubble sort = new Bubble();
        sort.bubbleSort();
        sort.print();
    }
}
