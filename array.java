public class array {

    public static boolean either24(int[] nums) {
        boolean has22 = false, has44 = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {   // check same consecutive numbers
                if (nums[i] == 2) has22 = true;
                if (nums[i] == 4) has44 = true;
            }
        }

        return has22 ^ has44; // true only if one is present
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3};
        System.out.println(either24(arr));
    }
}