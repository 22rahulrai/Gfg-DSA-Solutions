class Solution {
    public int countFreq(int[] arr, int target) {
        // code here
        int n=arr.Length;
        int[] ans=Findfirstandlast(arr,n,target);
        if(ans[0]==-1){
            return 0;
        }
        return (ans[1]-ans[0]+1);
    }
    
    public static int[] Findfirstandlast(int []arr,int n,int k){
        int first=Firstposition(arr,n,k);
        if(first==-1){
            return new int[]{-1,-1};
        }
        int last=Lastposition(arr,n,k);
        return new int[]{first,last};
    }
    
    public static int Firstposition(int []arr,int n,int k){
        int s=0,e=n-1,first=-1;
        
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==k){
                first=mid;
                e=mid-1;
            }
            else if(arr[mid]<k){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return first;
    }
    
    public static int Lastposition(int []arr,int n,int k){
        int s=0,e=n-1,last=-1;
        
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==k){
                last=mid;
                s=mid+1;
            }
            else if(arr[mid]<k){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return last;
    }
}