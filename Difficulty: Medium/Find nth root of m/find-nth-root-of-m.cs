class Solution {
    // public int nthRoot(int n, int m) {
    //     // Code here
    //     if(n==1){
    //         return m;
    //     }
        
    //     for(int i=2;i*i<=m;i++){
    //         if(Math.Pow(i,n)==m){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    
    public int nthRoot(int n, int m) {
        int s=1, e=m;
        
        while(s<=e){
            int mid=(s+e)/2;
            
            double pow=Math.Pow(mid,n);
            
            if(pow==m){
                return mid;
            }
            else if(pow>m){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        
        return -1;
    }
}