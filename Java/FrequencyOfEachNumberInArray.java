// import java.util.*;
// public class SortArrayByFrequency {
//     public static void main (String[] args)
//     {
//         int[] arr={1,1,2,2,2,3};
        
//         int length=arr.length;
//         int[] arr1=new int[length];
//         HashMap<Integer,Integer> hm=new HashMap<>();
//         for(int i: arr)
//         {
//             hm.put(i, hm.getOrDefault(i,0 )+1);
//         }
//      System.out.println(hm);
//     //  {1=2, 2=3, 3=1}
//      int max=0;
//      int temp=0;
//      int num=0;

//      while(!hm.isEmpty())
//      {
//         for(Map.Entry<Integer,Integer> e:hm.entrySet())
//         {
//              temp=e.getValue();
//              if (temp>max)
//              {
//                 max=temp;
//                 num=e.getKey();
                
//              }
             
//         }
//             // System.out.print(max);
//             for(int i=0;i<max;i++)
//             {
//                 arr1[i]=num;
//             }
//         hm.remove(num);
//         System.out.println(hm);
//      }
//      for(int nums1:arr1)
//      {
//         System.out.print(nums1);
//      }
//     }
// }

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachNumberInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3 };

        int length = arr.length;
        int[] arr1 = new int[length];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        // {1=2, 2=3, 3=1}
        int index = 0;

        while (!hm.isEmpty()) {
            int max = 0;
            int num = 0;

            for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
                int temp = e.getValue();
                if (temp > max) {
                    max = temp;
                    num = e.getKey();
                }
            }

            for (int i = 0; i < max; i++) {
                arr1[index++] = num;
            }

            hm.remove(num);

        }

        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}