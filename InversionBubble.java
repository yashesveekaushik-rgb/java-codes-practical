class InversionBubble {

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        int n = arr.length;
        int count = 0;
               // Bubble Sort logic
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    // inversion count increase
                    count++;
                }
            }
        }

        System.out.println("Inversion Count = " + count);
    }
}

        





    

