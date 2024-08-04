public class MatrixRotationNintyDegree{
    public static void main(String[] args) {
    int[][] matrix1={   
        {1, 2, 3},
        {4, 5, 6},
        {7, 8 ,9}};
        int[][] matrix2=new int[3][3];
    // {7,4,1},
    // {8,5,2},
    // {9,6,3}
    for(int j=0;j<3;j++)
    {
        matrix2[j][2]=matrix1[0][j];
        matrix2[j][1]=matrix1[1][j];
        matrix2[j][0]=matrix1[2][j];
    }
    
    for(int i=0;i<3;i++)
    {
        for (int j=0;j<3;j++)
        {
            System.out.print(matrix2[i][j] +" ");
        }
        System.out.println();
    }
    

    }
}   