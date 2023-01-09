package Backtracking;

public class IntVector
{
    private int[] _arr;

    public IntVector(int size) {
        _arr = new int[size];
    }

    /*עליכם לכתוב שיטה רקורסיבית (לא סטטית) השייכת למחלקה,
     המחזירה את האינדקס של התא במערך בו סכום האיברים עד לתא הזה (כולל אותו)
     שווה לסכום האיברים מהתא שאחריו עד לסוף המערך. אם אין אינדקס כזה השיטה תחזיר 1-. */


    public int equalSum()
    {
        return sum(0);
    }

    private int sum(int start)
    {
        if(start == _arr.length-1)
            return _arr[start];

        return _arr[start] + sum(start++);
    }

    /*private int equalSum(int i, int end)
    {
        if(i == end)
            return -1;

        if(sum(0,i) == sum(i+1,_arr.length-1))
            return i;

        return equalSum(i++, end);
    }*/


    private int max(int start, int end)
    {
        if(start == end)
            return _arr[start];
        return _arr[start] + max(start +1,end);
    }
}
