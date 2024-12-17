class Main {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int  n = arr.length;
        int evenrow=0;
        int oddrow=1;
        while(evenrow<n){
        for(int i=0;i<n;i++){
            System.out.print(arr[evenrow][i]+" ");
        }
        evenrow=evenrow+2;
        if(oddrow<n){
            for(int j=n-1;j>=0;j--){
                System.out.print(arr[oddrow][j]+" ");
            }
            
        }
        oddrow=oddrow+2;
        }
    }
}
