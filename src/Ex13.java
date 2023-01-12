/**
 * This class represent 4 answers of mamman 13.
 *
 * @author (Liad Firouz)
 * @version 21-01-2022
 */
public class Ex13
{
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
        final String ALTERNATING_OPTION_1 = "10";
        final String ALTERNATING_OPTION_2 = "01";
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

        // run on s until the end of the string
        // incensing the i + 2 to check each time for two bytes are different from "10" or "01"
        for(int i = 0; i <= s.length()-1; i += 2)
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

    public static int what(int [] a)
    {
        // initialize
        int max = 0;
        int totalSum = 0;
        int cellAmount = a.length;
        int totalSumMinusStart = 0;
        int totalSumMinusEnd = 0;
        int totalSumBetween = 0;


        // summarize all the array
        for(int i = 0; i < a.length; i++)
            totalSum += a[i];

        // if the total sum is even, this is the biggest even sum
        if(totalSum % 2 == 0)
            return a.length;

        for(int i = 0, j = a.length-1; i <= j; i++, j--)
        {
            //check if the sum minus the start is even
            if((totalSum - a[i]) % 2 == 0)
                totalSumMinusStart = totalSum - a[i];

            //check if the sum minus the end is even
            if((totalSum - a[j]) % 2 == 0)
                totalSumMinusEnd = totalSum - a[j];

            //check if the between sum is even
            if((totalSum - a[i] - a[j]) % 2 == 0)
                totalSumBetween = totalSum - a[i] - a[j];

            if(totalSumMinusStart == 0 && totalSumMinusEnd == 0 && totalSumBetween ==0)
                return cellAmount;

            // if the sum minus the start is bigger than all the options
            if(totalSumMinusStart > max && totalSumMinusStart >= Math.max(totalSumMinusEnd,totalSumBetween)) {
                cellAmount--;
                max = totalSumMinusStart;
            }

            // if the sum minus the end is bigger than all the options
            if(totalSumMinusEnd > max && totalSumMinusEnd >= Math.max(totalSumMinusStart,totalSumBetween)) {
                cellAmount--;
                max = totalSumMinusEnd;
            }

            // if the sum in between is bigger than all the options
            if(totalSumBetween > max && totalSumBetween >= Math.max(totalSumMinusEnd,totalSumBetween)) {
                cellAmount -= 2;
                max = totalSumBetween;
            }
        }
        return cellAmount;
    }


    /*{
        int max = 0;
        int sum = 0;
        int count = 0;
        int lastEvenIndex = -1;

        int RTLsum = 0;
        int RTLcounter = 0;
        int RTLlastEvenIndex = -1;
        int RTLmax = 0;
        int j = a.length-1;

        for(int i =0; i< a.length; i++)
        {
            sum += a[i];
            RTLsum += a[j];

            if(sum % 2 == 0)
            {
                count++;
                if(lastEvenIndex < 0)
                    lastEvenIndex = i;

                if(i == a.length -1)
                    return a.length;
            }

            if(count + lastEvenIndex >= max)
                max = count+lastEvenIndex;

            if(RTLsum % 2 == 0)
            {
                RTLcounter++;

                if (RTLlastEvenIndex < 0)
                    RTLlastEvenIndex = i;
            }

            if(RTLcounter + RTLlastEvenIndex >= RTLmax)
                RTLmax = RTLcounter+RTLlastEvenIndex;


            j--;
        }
        return Math.max(max, RTLmax);
    }

  /*  public static int what (int [] a)
    {
        int temp = 0;
        for(int i = 0; i < a.length; i++)
        {
            for(int j = i; j < a.length; j++)
            {
                int c = 0;
                for(int f = i; f <= j; f++)
                    c += a[i];

                int c = f(a, i, j);
                if (c%2 == 0)
                {
                    if (j-i+1 > temp)
                        temp = j-i+1;
                }
            }
        }
        return temp;
    }


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
*/

/*----------------------------------------------- Question 3: isWay --------------------------------------------------*/

    public static boolean isWay(int [] a)
    {
        // calling for private overloading method with array and the starting index - 0
        return isWay(a, 0);
    }

    private static boolean isWay(int [] a, int i)
    {
        final int BEEN_HERE = -1;

        // i is at the end of the array, there is a way - true
        if(i == a.length-1)
            return true;
        // checking if the i is over the array bounds or if current cell was checked already
        if(i < 0 || i >= a.length || a[i] == BEEN_HERE)
            return false;

        // saving current cell value and marking the current cell
        int cellValue = a[i];
        a[i] = BEEN_HERE;

        // checking the movement options left or right by current cell value
        boolean validWay = (isWay(a, i + cellValue) || isWay(a, i - cellValue));

        // setting current cell with the original value after checking
        a[i] = cellValue;
        return validWay;

    }

/*----------------------------------------------- Question 4: prince -------------------------------------------------*/

    public static int prince(int [][] drm, int i, int j)
    {
        return prince(drm, i, j, 0);
    }

    private static int prince(int [][] drm, int i, int j, int k)
    {
        final int BEEN_HERE = -10;

        if (drm[i][j] == -1)
            return 1;

        // avoid repeat a cell
        int temp = drm[i][j];
        drm[i][j] = BEEN_HERE;

        // recursion for all neighbors
        int up = Integer.MAX_VALUE, down = Integer.MAX_VALUE, left = Integer.MAX_VALUE, right = Integer.MAX_VALUE;

        if (i - 1 >= 0 &&
                (drm[i-1][j] - temp == 0 || drm[i-1][j] - temp == 1  || drm[i-1][j] == temp + 1|| drm[i-1][j] == -1))
            up = prince(drm, i - 1, j, k);

        if (i + 1 < drm.length &&
                (drm[i+1][j] - temp == 0  || drm[i+1][j]  - temp == 1  || drm[i+1][j] == temp + 1 || drm[i+1][j] == -1))
            down = prince(drm, i + 1, j,k);

        if (j - 1 >= 0 &&
                (drm[i][j-1]  - temp == 0  || drm[i][j-1]  - temp == 1  || drm[i][j-1] == temp +1 || drm[i][j-1] == -1))
            left = prince(drm, i, j - 1,k);

        if (j + 1 < drm[0].length &&
                (drm[i][j+1]  - temp == 0  || drm[i][j+1]  - temp == 1  || drm[i][j+1] == temp + 1 || drm[i][j+1] == -1))
            right = prince(drm, i, j + 1,k);

        drm[i][j] = temp;

        if (up == Integer.MAX_VALUE && down == Integer.MAX_VALUE && left == Integer.MAX_VALUE && right == Integer.MAX_VALUE)
            return -1;


        int min = Math.min(Math.min(up, down), Math.min(left, right));
        return min + 1;
    }

}