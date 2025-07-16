class Solution {

    static int findFloor(int[] arr, int x) {
        // write code here
        int e=arr.length-1,s=0;
        int index=-1;
        
        
        
        while(s<=e){
            int mid=(e+s)/2;
            
            if(arr[mid]<=x){
                index=mid;
                s=mid+1;
            }
            else {
                e=mid-1;
            }
        }
        
        
        return index;
    }
}
