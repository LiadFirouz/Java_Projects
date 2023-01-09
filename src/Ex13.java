/**
 * This class represent 4 answers of mamman 13.
 *
 * @author (Liad Firouz)
 * @version 21-01-2022
 */
public class Ex13
{
    final static String ALTERNATING_OPTION_1 = "10";
    final static String ALTERNATING_OPTION_2 = "01";

    /*----------------------------------------------- Question 1: Alternating-----------------------------------------*/

    /**
     * Gets a string of bits from the user,
     * compare the minimum swaps of bytes in the bits to get into alternating sequence,
     * alternating sequence is a bits that is complex with "10" or "01" n times.
     *
     * @param s - the given bits
     * @return the minimum swaps.
     */
    public static int alternating(String s)
    {
        //send the string s into a private method that counts the swaps for each alternating sequence option
        //check and return the minimum swaps
        return Math.min(alternating(s, ALTERNATING_OPTION_1), alternating(s, ALTERNATING_OPTION_2));
    }

    /**
     * Gets an alternating option and string of bits,
     * count the minimum swaps of bytes in the bits to get into alternating sequence,
     * alternating sequence is a bits that is complex with "10" or "01" n times.
     *
     * @param s - the given bits
     * @return the swaps
     */
    private static int alternating(String s, String alternatingOption)
    {
        //count the different bytes in s - the given string
        int numberOfDifferentBytes = 0;

        // run on the s until the end of the end of the string
        // incensing the i + 2 to check each time on two bytes different from "10" or "01"
        for(int i = 0; i <= s.length()-1; i+= 2)
        {
            if(s.charAt(i) != alternatingOption.charAt(0))
                numberOfDifferentBytes ++;
            if(s.charAt(i+1) != alternatingOption.charAt(1))
                numberOfDifferentBytes ++;
        }//for

        // returns the changes divide by two for each swap
        return numberOfDifferentBytes/2;
    }

    /*----------------------------------------------- Question 2: what -----------------------------------------------*/

    private static int f (int [] a, int low, int high)
    {
      int res = 0;
      for(int i = low; i <= high; i++)
          res += a[i];
      return res;
    }

    public static int what (int [] a)
    {
        int temp = 0;
        for(int i = 0; i < a.length; i++)
        {
            for(int j = i; j < a.length; j++)
            {
                int c = 0;
                for(int f = i; f <= j; f++)
                    c += a[i];
                //int c = f(a, i, j);
                if (c%2 == 0)
                {
                    if (j-i+1 > temp)
                        temp = j-i+1;
                }
            }
        }
        return temp;
    }

/*
      a - what function returns the amount of indexes that creates the biggest even sum in the array
      b - Time complexity: O(n^3)
          Space complexity: O(1)



    public static int what(int [] a)
    {
        int indexCounter = 0;
        int low = 0;
        int high = a.length-1;
        int all = 0;

        for(int i = low; i <= high; i++) {
            all += a[i];
            if(a[i]%2==0 && a[i] > all)
                indexCounter = i;
        }

        if(all%2==0)
            indexCounter = a.length;

        while(low <= high)
        {
            if((all-a[low])%2 == 0 && all < (all-a[low])) {
                indexCounter = high - low + 1;

            }
            else if((all-a[high])%2 == 0 && all < (all-a[high])) {
                indexCounter = high - low + 1;

            }
            all = all-a[high]-a[low];
            low++;
            high--;
        }
        return indexCounter;
    }
*/

    private static int binarySearch(int [] a, int x)
    {
        int low = 0 , high = a.length-1, mid;
        while (low <= high)
        {
            mid = (low + high)/2;
            if(a[mid] == x)
                return mid;
            if(a[mid] < x)
                low = mid + 1;
            else
                low = mid -1;
        }
        return -1;
    }
}

