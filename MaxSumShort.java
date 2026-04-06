import java.util.Arrays;

class MaxSumShort {
    
    public static void main(String[] args) {

        int arr[] = {10, 5, 20, 8};

        Arrays.sort(arr); // array sort ho jayega

        int n = arr.length;
        int sum = arr[n-1] + arr[n-2]; // last 2 elements largest hote hain

        System.out.println("Sum = " + sum);
    }
}