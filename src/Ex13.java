/**
 * This class represent four answers to the questions on mamman 13.
 *
 * @author (Liad Firouz)
 * @version 21-01-2022
 */
public class Ex13 {
    /*----------------------------------------------- Question 1: Alternating-----------------------------------------*/
    /**
     * Gets a string of bits from the user,
     * compare the minimum swaps of bytes in the bits to get into alternating sequence,
     * alternating sequence is a bits that is complex with "10" or "01" n times.
     * <p>
     * Time Complexity: O(N):
     * there is a return the call for a private function twice for each time the time complexity is O(N),
     * plus the Math.min function that is O(1)
     * therefore O(2N + 1) is a linear function that considered as O(N).
     * <p>
     * Auxiliary Space: O(1):
     * there is only one time creation for each final variable: ALTERNATING_OPTION_1, ALTERNATING_OPTION_2
     * therefore O(2) is constant function that is O(1)
     *
     * @param s - the given bits
     * @return the minimum swaps.
     */
    public static int alternating(String s) {
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
     * <p>
     * Time Complexity: O(N):
     * the for runs all over the array therefore O(N).
     * <p>
     * Auxiliary Space: O(1):
     * there is only one time creation for each variable: numberOfDifferentBytes, i
     * therefore O(2) is constant function that considered שs O(1)
     *
     * @param s - the given bits
     * @return the swaps
     */
    private static int alternating(String s, String alternatingOption) {
        //count the different bytes in s - the given string
        int numberOfDifferentBytes = 0;

        // run on s until the end of the string
        // incensing the i by 2 to check each time for two bytes are different from "10" or "01"
        for (int i = 0; i <= s.length() - 1; i += 2) {
            if (s.charAt(i) != alternatingOption.charAt(0))
                numberOfDifferentBytes++;
            if (s.charAt(i + 1) != alternatingOption.charAt(1))
                numberOfDifferentBytes++;
        }//for

        // returns the changes divide by two for each swap
        return numberOfDifferentBytes / 2;
    }

    /*----------------------------------------------- Question 2: what -----------------------------------------------*/
    private static int f(int[] a, int low, int high) {
        int res = 0;
        for (int i = low; i <= high; i++)
            res += a[i];
        return res;
    }

    /**
     * Gets an array, and calculate for the maximum length of the max even sub-array.
     *
     * @return temp - max length of the biggest sub-array
     * <p>
     * a - Gets an array, and calculate for the maximum length of the max even sub-array.
     * <p>
     * Original what function:
     * b - Time Complexity: O(N^3):
     * the first for run all over the array O(N),
     * inside the first for there is another for that runs all over the array until now O(N^2),
     * also there is an f function inside the second for that runs in the worst case O(N) all over the array O(N^3).
     * <p>
     * Auxiliary Space: O(1):
     * there is only one time creation for each variable: temp, i, j, c
     * therefore O(4) is constant function that considered as O(1)
     * <p>
     * Fixed complexity what function:
     * Time Complexity: O(N):
     * the first for runs all over the array therefore O(N),
     * after the that there is another for that runs also all over the array O(N),
     * therefore the biggest complexity is O(N).
     * <p>
     * Auxiliary Space: O(1):
     * there is only one time creation for each variable: TWO, totalSum, length, i
     * therefore O(4) is constant function that considered as O(1)
     * @return length - max length of the biggest sub-array
     */
    public static int what(int[] a) {
        //Divider to check even/odd
        final int TWO = 2;

        //initialize variables
        int totalSum = 0;
        int length = 0;

        //summarize all the array
        for (int i = 0; i < a.length; i++)
            totalSum += a[i];

        //checks if the total sum is even
        if (totalSum % TWO == 0)
            return a.length;

        //finds the odd cell
        for (int i = 0; i < a.length; i++) {
            //checks if the current cell is odd
            if (a[i] % TWO == 1)
                //save the max length and compares the current max length to the length exclude the current index
                // and to this index
                length = Math.max(length, Math.max(a.length - i - 1, i));
        }//for

        //returns the max length
        return length;
    }

    /*public static int what(int [] a)
    {
        int temp = 0;
        for(int i = 0; i<a.length; i++)
        {
            for(int j = i; j<a.length; j++)
            {
                int c = f(a, i , j);
                if (c%2 == 0)
                {
                    if(j-i+1 > temp)
                        temp = j-i+1;
                }

            }
        }
        return temp;
    }*/


    /*----------------------------------------------- Question 3: isWay --------------------------------------------------*/

    /**
     * Gets an array, and check if the array has a legit road.
     * legit road - a series of positive number, start at 0 index
     * and moves as the cell value left or right to the last cell.
     *
     * @param a - array to check
     * @return if the array has a legit road
     */
    public static boolean isWay(int[] a) {
        // calling for private overloading method with array and the starting index - 0
        return isWay(a, 0);
    }

    /**
     * Gets an array, and check if the array has a legit road.
     * legit road - a series of positive number, start at 0 index
     * and moves as the cell value left or right to the last cell.
     *
     * @param a - array to check
     * @param i - pointer index
     * @return validWay - if the array has a legit road
     */
    private static boolean isWay(int[] a, int i) {
        final int BEEN_HERE = -1;

        // is the index at the end of the array, there is a way - true
        if (i == a.length - 1)
            return true;
        // checking if the index is over the array bounds or if current cell was checked already
        if (i < 0 || i >= a.length || a[i] == BEEN_HERE)
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

    /**
     * Gets a matrix that represent roof map, i for the row index and j for the column index,
     * search for the minimum track for the prince to the villain to save the princes.
     * The prince can move up, down, left, right, each move he can only jump one higher step from his current roof level
     * or get down two steps lower.
     *
     * @param drm - matrix - roof map
     * @param i   - the rows
     * @param j   - the columns
     * @return minimum path to the bad guy
     */
    public static int prince(int[][] drm, int i, int j) {
        int value =  prince(drm, i, j, 0);
        if(value  == Integer.MAX_VALUE)
            return -1;
        return value;
    }

    /**
     * Gets a matrix that represent roof map, i for the row index and j for the column index,
     * search for the minimum track for the prince to the villain to save the princes.
     * The prince can move up, down, left, right, each move he can only jump one higher step from his current roof level
     * or get down two steps lower.
     *
     * @param drm - matrix - roof map
     * @param i   - the rows
     * @param j   - the columns
     * @return minimum path to the villain
     */

    private static int prince(int [][] drm, int i, int j, int pathCounter)
    {
        final int BEEN_HERE = -10;

        // made to the villain and return the path
        if (drm[i][j] == -1)
            return pathCounter + 1;

        // avoid repeat a cell
        int temp = drm[i][j];
        drm[i][j] = BEEN_HERE;

        // recursion for all neighbors and initialize 4 moves options: up, down, left, right
        int up = Integer.MAX_VALUE, down = Integer.MAX_VALUE, left = Integer.MAX_VALUE, right = Integer.MAX_VALUE;

        // checks the row bounds and if the prince can move up or down
        if (i - 1 >= 0 &&
                (drm[i-1][j] == temp || drm[i-1][j] == temp - 1 ||
                        drm[i-1][j] == temp - 2 || drm[i-1][j] == temp + 1 || drm[i-1][j] == -1))
            up = prince(drm, i - 1, j, pathCounter + 1);

        if (i + 1 < drm.length &&
                (drm[i+1][j] == temp  || drm[i+1][j] == temp - 1  ||
                        drm[i+1][j] == temp - 2 || drm[i+1][j] == temp + 1 || drm[i+1][j] == -1))
            down = prince(drm, i + 1, j,pathCounter + 1);

        // checks the column bounds and if the prince can move left or right
        if (j - 1 >= 0 &&
                (drm[i][j-1]  == temp  || drm[i][j-1] == temp - 1  ||
                        drm[i][j-1] == temp - 2 || drm[i][j-1]  == temp  + 1 || drm[i][j-1] == -1))
            left = prince(drm, i, j - 1,pathCounter + 1);

        if (j + 1 < drm[0].length &&
                (drm[i][j+1]  == temp  || drm[i][j+1] == temp - 1  ||
                        drm[i][j+1] == temp - 2 || drm[i][j+1]  == temp + 1 || drm[i][j+1] == -1))
            right = prince(drm, i, j + 1,pathCounter + 1);

        // setting cell value to the original value
        drm[i][j] = temp;

        // return the minimum path from all four moves
        return Math.min(Math.min(up, down), Math.min(left, right));
    }
}
