 class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[0][j]+" ");
          }
          
        for (int i=1;i<arr.length;i++){
            System.out.print(arr[i][2]+" ");
        }
         if (3 > 1) {
            for (int j = 2 - 1; j >= 0; j--) {
                System.out.print(arr[3 - 1][j] + " ");
            }
         if (3>1){
               for (int i = 3 - 2; i > 0; i--) {
                System.out.print(arr[i][0] + " ");
             }
         }
        }
    }
  }
