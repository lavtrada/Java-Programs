    import java.util.*;
    public class SortCharacterByFrequency {
        public static void main(String[] args)
        {
            String str="tree";
            Map<Character,Integer> hm=new HashMap<>();
            List<Character>[] arr=new ArrayList[str.length()+1];
            StringBuilder sb= new StringBuilder();

            //input String str="tree";
            //Output String="eert"
            int count=1;
            for(char c : str.toCharArray())
            {
                hm.put(c,hm.getOrDefault(c, 0)+1);
            }
            
        System.out.println(hm.get(t));
    }
}