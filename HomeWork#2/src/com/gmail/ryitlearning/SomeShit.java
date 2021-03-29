import java.util.Arrays;
import java.util.Scanner;

public class ProgramArray {
    public static int sumElemArr(int[] arr) {
        int sum = 0;
        for (int elem : arr) {
            sum += elem;
        }
        return sum;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
    }
    public static void printReverseArr(int[] arr) {
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
    }
    public static void main(String[] args) {
        int a = 1;
        int[] arr = new int[10];
        System.out.println(arr);
        fillFromConsole(arr);
//        int sumResult = sumElemArr(arr);
//        System.out.println(sumResult);
        printArr(arr);

    }

    public static void fillArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * i;
        }
    }
    public static int getMark(int n){
        if (n>3 && n<12){
            return n;
        }
        else{
            throw new IllegalArgumentException("Not Mark");
        }

    }
    public static void fillFromConsole(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"]=");
            int mark = validateMark(sc);
            arr[i] = mark;
        }
        sc.close();
    }

    private static int validateMark(Scanner sc) {
        while(true){
            try{
                int valueInt = validateInt(sc);
                return getMark(valueInt);
            }catch (IllegalArgumentException e){
                System.err.println("Not Mark");
            }
        }
    }

    private static int validateInt(Scanner sc) {
        while (true) {
            try {
                System.out.println("Enter value=");
                return sc.nextInt();
            } catch (Exception e) {
                System.err.println("Error input not int");
                sc.nextLine();
            }

        }
    }
}
public class ProgramDynamicArray {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("Enter value");
            if (sc.hasNextInt()) {
                if (count>=arr.length){
//                    int [] t = new int[arr.length*2];
//                    for (int i = 0; i < arr.length; i++) {
//                        t[i] = arr[i];
//                    }
//                    arr=t;

                    arr=Arrays.copyOf(arr,arr.length*2);
                }
                arr[count] = sc.nextInt();
                count++;
            } else {
                System.err.println("Not int");
                sc.nextLine();
            }
            System.out.println("enter again[y]");
            String answer = sc.next();
            if (!answer.equals("y")) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
public class ProgramMatrix {
    public static void main(String[] args) {
        int [][] matrix = new int[][]{{1,2,3,-1},
                {4,5,6},
                {7,8,9,3,4}};
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(matrix[1].length);
        System.out.println(matrix[2].length);
        printMatrix(matrix);
        int [] rowSum = new int[matrix.length];
        int sum = 0; int allSum=0;
        for (int i = 0; i < matrix.length; i++) {
            sum=0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum+=matrix[i][j];
            }
            System.out.println(sum);
            allSum+=sum;
            rowSum[i]=sum;
        }
        System.out.println(allSum);
        System.out.println(Arrays.toString(rowSum));
        System.out.println(Arrays.deepToString(matrix));

        int[] arr= {3,5,2,23,54,3,4,3,5,54};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}