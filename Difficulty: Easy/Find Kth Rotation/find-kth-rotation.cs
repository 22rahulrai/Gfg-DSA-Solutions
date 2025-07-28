class Solution {
    public int findKRotation(int[] arr) {
        // code here
        int s=0,e=arr.Length-1;
        int ans=int.MaxValue;
        int index=-1;
        
        while(s<=e){
            int mid=(s+e)/2;
            
            // if array is sorted
            if(arr[s]<=arr[e]){
                if(arr[s]<ans){
                    index=s;
                    ans=arr[s];
                }
                break;
            }
            
            //left part is sorted
            if(arr[s]<=arr[mid]){
                if(arr[s]<ans){
                    index=s;
                    ans=arr[s];
                }
                // Eliminate left half:
                s=mid+1;
            }
            
            else{ // if right part is sorted
                if(arr[mid]<ans){
                    index=mid;
                    ans=arr[mid];
                }
                // Eliminate right half:
                e=mid-1;
            }
        }
        
        return index;
        
    }
}
