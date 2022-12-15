package patterns;


public class Main {
    public static void main(String[] args) {
        pattern8(5);

    }

    static void pattern1(int n) {
        /*
         * * * *
         * * * *
         * * * *
         * * * *
         */
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= n; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n) {
        /*
         *
         * *
         * * *
         * * * *
         */
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n) {
        /*
         * * * *
         * * *
         * *
         *
         */
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= (n +1)-rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n) {
        for (int rows = 1; rows <2 * n; rows++) {
            int totalCols = rows > n ? 2* n - rows : rows;
            for (int cols = 1; cols <= totalCols; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n) {
        for (int rows = 1; rows <= n; rows++) {

            for (int space = 1; space <=n - rows; space++) {
                System.out.print("  ");
            }


            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern7(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int space = 1; space <= rows; space++) {
                System.out.print("  ");
            }
            for (int cols = 1; cols <= n+1 - rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern8(int n) {

        int TotalCols = 1 ;
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n -row; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <=TotalCols; col++) {
                System.out.print("*");
            }
            TotalCols = TotalCols + 2;
            System.out.println();
        }
    }
    static void pattern9(int n) {
        int TotalCols = n + 2 ;
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= TotalCols; col++) {
                System.out.print("*");
            }
            TotalCols = TotalCols - 2;
            System.out.println();
        }
    }
    static void pattern10(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int space = 1; space <= n-rows; space++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern11(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int space = 1; space <= rows; space++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= n+1 - rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern12(int n) {
        for (int rows = 1; rows <= 2 * n; rows++) {
            int totalSpace = rows>n? 2*n -rows+1 : rows;
            for (int space = 1; space <=  totalSpace; space++) {
                System.out.print(" ");
            }

            int totalCols = rows>n ? rows -n :n+1 - rows;
            for (int cols = 1; cols <= totalCols; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern13(int n) {
        int TotalCols = 1 ;
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n -row; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <=TotalCols; col++) {
                if(col==1||row==n||col==TotalCols) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            TotalCols = TotalCols + 2;
            System.out.println();
        }
    }
    static void pattern14(int n) {
        int TotalCols = n + 2 ;
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= TotalCols; col++) {
                if(row==1||col==1||col==TotalCols) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            TotalCols = TotalCols - 2;
            System.out.println();
        }
    }
    static void pattern15(int n) {
        int TotalCols =1 ;
        for (int row = 1; row < 2*n; row++) {
            int totalSpace = row>n?row-n:n-row;
            for (int space = 1; space <= totalSpace; space++) {
                System.out.print(" ");
            }

            TotalCols = row>n?n+2:TotalCols;
            for (int col = 1; col <=TotalCols; col++) {
                if(col==1||col==TotalCols) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            TotalCols = row>n?TotalCols-2:TotalCols + 2;
            System.out.println();
        }
    }

    static void pattern20(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= n; cols++) {
                if (cols ==1 || rows ==1 || rows == n || cols == n){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void pattern31(int n) {
        for (int rows = 1; rows < 2 * n; rows++) {
            for(int cols = 1 ; cols< 2 * n ; cols++){
                int printValue = n+1 - Math.min(Math.min(cols, rows) , Math.min( (2* n) - rows , (2 * n) - cols));
                System.out.print(printValue + " ");
            }
            System.out.println();
        }
    }
    static void pattern35(int n) {
        for(int rows=1;rows<=n ;rows++){
            int totalCols = 0;
            for (int cols = 1; cols < totalCols; cols++) {

            }
        }
    }
}
