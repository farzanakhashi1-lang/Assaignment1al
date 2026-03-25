
import java.util.Scanner;
public class Assignment1a {
    /*task1
    public static int sumOfSquares(int n) {
        if (n <= 1) return n * n; // Base case
        return (n * n) + sumOfSquares(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Sample Output: " + sumOfSquares(n)); // For n=4, output is 30 [cite: 7]
    }

     */
       /*task2
        public static int sumArray(int[] arr, int n) {
            if (n <= 0) return 0;
            return arr[n - 1] + sumArray(arr, n - 1);
        }

        public static void main(String[] args) {
            int[] myArr = {10, 20, 30, 40, 50};
            int n = 3;
            System.out.println("Sum of first " + n + " elements: " + sumArray(myArr, n));
        }

        */

       /*task3  public static int sumFirstN(int n) {
            if (n <= 1) return n;
            return n + sumFirstN(n - 1);
        }

        public static void main(String[] args) {
            int n = 10;
            System.out.println("Sum of first " + n + " integers: " + sumFirstN(n));
        }

        */

          /*task4 public static long sumPowers(int b, int n) {
               if (n == 0) return 1; // b^0 = 1 [cite: 13]
               return (long)Math.pow(b, n) + sumPowers(b, n - 1);
           }

           public static void main(String[] args) {
               // Sample Input: b=4, n=3 -> Output: 85 [cite: 14, 15]
               System.out.println("Result: " + sumPowers(4, 3));
           }
       }

           */




   /*task5 public static void reverseSequence(int n, Scanner sc) {
            if (n <= 0) return;
            int val = sc.nextInt();
            reverseSequence(n - 1, sc);
            System.out.print(val + " ");
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter N: ");
            int n = sc.nextInt();
            reverseSequence(n, sc);
        }
    }

    */



        /*task6public static void reverseStrings(int n, Scanner sc) {
            if (n <= 0) return;
            String s = sc.next();
            reverseStrings(n - 1, sc);
            System.out.println(s);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            reverseStrings(n, sc);
        }
    }

         */



        /*public static void fillSpiral(int[][] matrix, int value, int row, int col, int size) {
            if (size <= 0) return;
            if (size == 1) {
                matrix[row][col] = value;
                return;
            }


            for (int i = 0; i < size - 1; i++) matrix[row][col + i] = value++;

            for (int i = 0; i < size - 1; i++) matrix[row + i][col + size - 1] = value++;

            for (int i = 0; i < size - 1; i++) matrix[row + size - 1][col + size - 1 - i] = value++;

            for (int i = 0; i < size - 1; i++) matrix[row + size - 1 - i][col] = value++;


            fillSpiral(matrix, value, row + 1, col + 1, size - 2);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); // Sample input: 3 or 4 [cite: 40, 46]
            int[][] matrix = new int[n][n];

            fillSpiral(matrix, 1, 0, 0, n);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + (matrix[i][j] < 10 ? "  " : " "));
                }
                System.out.println();
            }
        }
    }

         */

        /*public static void generateSequences(int n, int k, String current) {

            if (current.length() == n) {
                System.out.println(current);
                return;
            }


            for (int i = 1; i <= k; i++) {
                generateSequences(n, k, current + i);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int input = sc.nextInt();
            int n = input / 10;
            int k = input % 10;

            generateSequences(n, k, "");
        }
    }

         */



       /* public static void permute(char[] chars, int left, int right) {
            if (left == right) {
                System.out.print(String.valueOf(chars));
                return;
            }

            for (int i = left; i <= right; i++) {
                swap(chars, left, i);
                permute(chars, left + 1, right);
                swap(chars, left, i); // Backtrack
            }
        }

        private static void swap(char[] chars, int i, int j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            if (sc.hasNext()) {
                String s = sc.next();
                permute(s.toCharArray(), 0, s.length() - 1);
            }
        }
    }

        */




        public static boolean isPowerOfTwo(int n) {

            if (n <= 0) {
                return false;
            }
            if (n == 1) {
                return true;
            }
            if (n % 2 != 0) {
                return false;
            }


            return isPowerOfTwo(n / 2);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number to check: ");

            if (sc.hasNextInt()) {
                int n = sc.nextInt();


                if (isPowerOfTwo(n)) {
                    System.out.println(n + " is a power of two");
                } else {
                    System.out.println(n + " is not a power of two");
                }
            }

            sc.close();
        }
    }




    public static boolean isPowerOfTwo(int n) {

        if (n <= 0) return false;
        if (n == 1) return true; // 2^0 = 1
        if (n % 2 != 0) return false;

        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {

        for (int i = 0; i <= 9; i++) {
            printStatus(i);
        }


        System.out.println("---------------------------");


        for (int i = 10; i <= 32; i += 2) {
            printStatus(i);
        }
    }


    private static void printStatus(int n) {
        if (isPowerOfTwo(n)) {
            System.out.println(n + " is a power of two");
        } else {
            System.out.println(n + " is not a power of two");
        }
    }
