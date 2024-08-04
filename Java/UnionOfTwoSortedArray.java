import java.util.*;
public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,6,7};
        Integer[] arr1Integer = Arrays.stream(arr1).boxed().toArray(Integer[]::new);

        List<Integer> list=new ArrayList<>(Arrays.asList(arr1Integer));
        for(int i=0;i<arr2.length;i++)
        {
          if(!list.contains(arr2[i]))
          {
            list.add(arr2[i]);
          }  
        }
        for(int num:list)
        {
            System.out.print(num +" ");
        }
    }
}
