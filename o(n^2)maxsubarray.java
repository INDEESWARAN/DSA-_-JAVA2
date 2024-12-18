class Main {
    public static void main(String[] args) {
        int[] arr={1,0,-3,7};
        int n= arr.length;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int currentsum=0;
            for(int j=i;j<n;j++){
                    currentsum+=arr[j];
                    maxsum=Math.max(maxsum,currentsum);
            }
           
        }
        System.out.print(maxsum);
 }

}
