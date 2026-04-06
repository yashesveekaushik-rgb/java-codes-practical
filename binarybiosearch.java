class binarybiosearch {
    public static void main (string[]args) {

        int[]a= {25,45,55,65,75};
        int key = 45;
                int l = 0, h = a.length - 1;
        while (l <= h) {
            int m = (l + h) / 2;

            int l = 0, h = a.length-1;
        while (l <= h) {
            int m = (l + h) / 2;

            if (key < a[m])
                h = m-1;
            else
                l = m + 1;
        }

        System.out.println("Not Found");
    }
}

}
      

