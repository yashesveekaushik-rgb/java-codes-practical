public class average {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;

        // find sum
        for (int n : arr) sum += n;

        double avg = (double) sum / arr.length; // calculate average

        // print numbers > average
        for (int n : arr) {
            if (n > avg) System.out.print(n + " ");
        }
    }
}