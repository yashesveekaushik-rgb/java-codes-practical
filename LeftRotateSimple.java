class LeftRotateSimple {
    public static void main(String[] args) {

        int arr[] = {20, 30, 40};
        int n = arr.length;

        int first = arr[0]; // first element store

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1]; // shift left
        }

        arr[n - 1] = first; // first ko last me daal diya

        // print array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
