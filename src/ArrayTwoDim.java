public class ArrayTwoDim {
    public static void main(String[] args)
    {
        int a[] = {1, 2,3};
        int b[] = {1, 5,3};
        int c[] = {1, 2,9};

        int d[][] ={
                {1, 2,3},
                {1, 5,3},
                {1, 2,9}

        };
        for (int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("" +d[i][j]);

            }
            System.out.println();
        }
    }
}
