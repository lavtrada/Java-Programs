public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        int space = 0;
        for (int i = 1; i <=n; i++) {
            if(i==1){
                for(int k=n;k>i;k--){
                    System.out.print("*");
                }
            }
           else{
            for (int j = n; j >=i ; j--) {
           
                System.out.print('*');
            }
           }
            if(i==1){
                System.out.print("*");
            }
            else{
  for (int j = 1; j <space; j++) {
                
                
                System.out.print(" ");

              

            }
            }
          
            if(i==1){
                for(int k=n;k>i;k--){
                    
                    System.out.print("*");
                }
            }
           else{
            for (int j = n; j >=i ; j--) {
           
                System.out.print('*');
            }
           }
            space += 2;
            System.out.println();
        }
    }
}