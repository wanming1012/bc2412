import java.util.Arrays;

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

        int[] arr7 = new int[] {9, -8, 109, 99, 98};
        for (int i = 0; i < arr7.length - 1; i++) {
            if (arr7[i] > arr7[i + 1]) {
                int temp = arr7[i];
                arr7[i] = arr7[i + 1];
                arr7[i + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr7));

        Integer[] arr8 = new Integer[] {4, 3, 9, 2};
        Integer result = 1;
        for (Integer i = 0; i < arr8.length; i++) {
            result *= arr8[i];
        }

        System.out.println(result);

        String str = "hello";
        char[] arr9 = str.toCharArray();
        System.out.println(arr9.toString());

        for (int i = 0; i < arr9.length; i++)
            arr9[i]++;

        for (int i = 0; i < arr9.length; i++)
            System.out.println(arr9[i]);

        char[] arr12 = new char[] {'p', 'a', 'p', 'b', 'a', 'p'};
        int maxNumChar = 0;
        char maxChar = 0;
        for (char c = 0; c < Character.MAX_VALUE; c++) {
            int numChar = 0;
            for (int i = 0; i < arr12.length; i++) {
                if (arr12[i] == c)
                    numChar++;
            }
            if (numChar > maxNumChar) {
                maxNumChar = numChar;
                maxChar = c;
            }
        }
        System.out.println(maxChar + ", " + maxNumChar);

        maxNumChar = 0;
        maxChar = 0;
        int[] numChar = new int[Character.MAX_VALUE];
        for (int i = 0; i < arr12.length; i++) {
            numChar[arr12[i]]++;
            if (numChar[arr12[i]] > maxNumChar) {
                maxNumChar = numChar[arr12[i]];
                maxChar = arr12[i];
            }
        }
        System.out.println(maxChar + ", " + maxNumChar);

        int[] arr20 = new int[] {20, -20, 90, 50, -40};

        for (int i = 0; i < arr20.length - 1; i++) {
            for (int j = 0; j < arr20.length - i - 1; j++) {
                if (arr20[j] > arr20[j + 1]) {
                    int temp = arr20[j];
                    arr20[j] = arr20[j + 1];
                    arr20[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr20));
    }
}
