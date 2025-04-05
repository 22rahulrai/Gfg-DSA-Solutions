//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        
        // Arrays.sort(arr);
        // return arr[arr.length-2];
        return secondlargest(arr);
    }
    
    public int secondlargest(int [] arr){
        int l=-1;
        int sl=-1;
        
        for(int i: arr){
            if(i>l){
                sl=l;
                l=i;
            }
            else if(i<l && i>sl){
            sl=i;
            }
        }
        return sl;
    }
}