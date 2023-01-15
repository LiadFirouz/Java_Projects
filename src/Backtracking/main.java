package Backtracking;

public class main {
    public void main(String [] args)
    {
        //System.out.println(IntVector.);
    }

    public static boolean cover(int [] values, int a)
    {
        return cover(values, 0,a);
    }

    private static boolean cover(int [] values, int i, int a)
    {
        if(i == values.length)
            return false;
        if(values[i]==a)
            return true;
        return(cover(values,i+1,a) || cover(values,i+1, a-values[i]));
    }

    /**********************************************KnightToKing********************************************************/
    public static int minPath(char[][] minChess, int i, int j, int count)
    {
        if(i<0 || j<0 || i>=minChess.length || j>=minChess.length || minChess[i][j]=='x')
            return -1;
        if(minChess[i][j] =='K')
            return count;

        char x = minChess[i][j];
        minChess[i][j] = 'x';
        int res = minOfEight(minPath(minChess,i+2,j+1,count+1),
                            minPath(minChess,i+2,j-1,count+1),
                            minPath(minChess,i-2,j+1,count+1),
                            minPath(minChess,i-2,j-1,count+1),
                            minPath(minChess,i+1,j+2,count+1),
                            minPath(minChess,i-1,j+2,count+1),
                            minPath(minChess,i+1,j-2,count+1),
                            minPath(minChess,i-1,j-2,count+1));
        minChess[i][j]=x;
        return res;
    }

    public static int minOfEight(int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8)
    {
        int min=a1;

        if(min<0 || (a2>0 && a2<min))
            min=a2;
        if(min<0 || (a3>0 && a3<min))
            min=a3;
        if(min<0 || (a4>0 && a4<min))
            min=a4;
        if(min<0 || (a5>0 && a5<min))
            min=a5;
        if(min<0 || (a6>0 && a6<min))
            min=a6;
        if(min<0 || (a7>0 && a7<min))
            min=a7;
        if(min<0 || (a8>0 && a8<min))
            min=a8;

        return min;
    }

    public static int what(int [] a)
    {

        int sum = 0, len = 0;
        int n = a.length;
        // Check if sum of complete array is even
        for (int i = 0; i < n; i++)
        {
            sum += a[i];
        }

        if (sum % 2 == 0) // total sum is already even
        {
            return n;
        }

        // Find an index i such the a[i] is odd
        // and compare length of both halfs excluding
        // a[i] to find max length subarray
        for (int i = 0; i < n; i++)
        {
            if (a[i] % 2 == 1)
            {
                len = Math.max(len, Math.max(n - i - 1, i));
            }
        }

        return len;
    }
}
