public class DemoArray {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[3];

        arr[0] = 3;
        arr[1] = 10;
        arr[2] = 11;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 10)
                System.out.println(arr[i]);
        }

        // for (int i : arr) {
        //     System.out.println(i);
        // }

        double[] arr2 = new double[5];
        arr2[0] = 10.4;
        arr2[1] = 4.3;
        arr2[2] = 3.3;
        arr2[3] = 1.9;
        arr2[4] = 9.9;

        double total = 0.0;
        for (int i = 0; i < arr2.length; i++) {
            total += arr2[i];
        }
        System.out.println(total);

        String[] arr3 = new String[5];
        arr3[0] = "abc";
        arr3[1] = "def";
        arr3[2] = "ghi";
        arr3[3] = "jkl";
        arr3[4] = "mno";

        String target = "def";
        boolean exist = false;
        for (int i = 0; i < arr3.length; i++) {
            if (target.equals(arr3[i])) {
                exist = true;
                break;
            }
        }
        System.out.println(exist);

        char[] arr4 = new char[] {'b', 'v', 'a'};
        int[] arr5 = new int[arr4.length];
        for (int i = 0; i < arr4.length; i++) {
            arr5[i] = arr4[i];
        }

        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i] + " = " + arr5[i]);
        }

        int max = arr5[0];
        for (int i = 1; i < arr5.length; i++) {
            if (arr5[i] > max)
                max = arr5[i];
        }
        System.out.println(max);
    }
}
