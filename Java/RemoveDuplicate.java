
// import java.util.*; 
// public class RemoveDuplicate{
//     public static void main(String[] args) {
//         String str="ProminentPixel";
//         char[] arr=str.toCharArray();
//         Arrays.sort(arr);
//         StringBuilder sb=new StringBuilder();
//         for(int i=0;i<arr.length;i++)
//         {
//             int j=i+1;
//             if(arr[i]!=arr[j])
//             {
//                 sb.append(arr[i]);
//             }
//         }
//         System.out.print(sb);

//     }
// }import java.util.HashMap;
import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "ProminentPixel";
        
        // Step 1: Count occurrences of each character
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Build the result with characters that appear exactly once
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                sb.append(c);
            }
        }

        // Print the result
        System.out.print(sb);
    }
}
