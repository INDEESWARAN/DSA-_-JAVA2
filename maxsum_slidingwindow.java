class Main {
    public static int maxsum(int[] arr,int k) {
        int maxsum=Integer.MIN_VALUE;
        int n=arr.length;
        int r=0;
        int l=0;
        int currsum=0;
        
        while(r<=n-1){
            currsum=currsum+arr[r];
            
            if(r-l+1<k){
                r++;
            }
            else if(r-l+1==k){
                maxsum=Math.max(maxsum,currsum);
                currsum=currsum-arr[l];
                l++;
                r++;
            }
        }
        return maxsum;

    }
    public static void main (String[] args){
        int[] arr={100,200,300,400};
        int k=2;
        System.out.print(maxsum(arr,k));
    }
}
