class Main {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        int n= arr.length;
    for(int st=0;st<n;st++){
        for(int end=st;end<n;end++){
           printSubarray(arr,st,end);
        }
    }
    }
    private static void printSubarray(int[] arr,int st,int end){
        System.out.print("{");
        for(int i= st;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("}");
    }
}
