/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hadi
 */
public class Ex13Test {

    //Dont' change anything, your input must be equal to the output
    //Add your methods to this class or add this method to your class :)
    //Good luck :)
    public static void main(String[] args) {

        // *******************************************TEST STARTED**************************************************
      System.out.println("**************************************************************************************************");
        System.out.println("\nExercise 1: Test for (alternating method) STARTED!\n");
        System.out.println("| Test result | Your answer| Expected answer | Test for this sequence");
        System.out.println("---------------------------------------------------------------------");
        if (Ex13.alternating("0101") == 0) {
            System.out.println(" Test passed :)       " + Ex13.alternating("0101") + "                0\t    0101 "); // (1.1)
        } else {
            System.out.println(" Test failed :(       " + Ex13.alternating("0101") + "                0\t    0101 ");
        }
        System.out.println("---------------------------------------------------------------------");
        if (Ex13.alternating("1010") == 0) {
            System.out.println(" Test passed :)       " + Ex13.alternating("1010") + "                0\t    1010"); // (1.2)
        } else {
            System.out.println(" Test failed :(       " + Ex13.alternating("1010") + "                0\t    1010");
        }
        System.out.println("---------------------------------------------------------------------");
        if (Ex13.alternating("00011011") == 2) {
            System.out.println(" Test passed :)       " + Ex13.alternating("00011011") + "                2\t    00011011"); // (1.3)
        } else {
            System.out.println(" Test failed :(       " + Ex13.alternating("00011011") + "                2\t    00011011");
        }
        System.out.println("---------------------------------------------------------------------");
        if (Ex13.alternating("00101011") == 1) {
            System.out.println(" Test passed :)       " + Ex13.alternating("00101011") + "                1\t    00101011"); // (1.4)
        } else {
            System.out.println(" Test failed :(       " + Ex13.alternating("00101011") + "                1\t    00101011");
        }
        System.out.println("---------------------------------------------------------------------");
        if (Ex13.alternating("1100") == 1) {
            System.out.println(" Test passed :)       " + Ex13.alternating("1100") + "                1\t    1100"); // (1.5)
        } else {
            System.out.println(" Test failed :(       " + Ex13.alternating("1100") + "                1\t    1100");
        }
        System.out.println("---------------------------------------------------------------------");
        if (Ex13.alternating("10") == 0) {
            System.out.println(" Test passed :)       " + Ex13.alternating("10") + "                0\t    10"); // (1.6)
        } else {
            System.out.println(" Test failed :(       " + Ex13.alternating("10") + "                0\t    10");
        }
        System.out.println("---------------------------------------------------------------------");
        if (Ex13.alternating("01") == 0) {
            System.out.println(" Test passed :)       " + Ex13.alternating("01") + "                0\t    01"); // (1.7)
        } else {
            System.out.println(" Test failed :(       " + Ex13.alternating("01") + "                0\t    01");
        }
        System.out.println("---------------------------------------------------------------------");
       if (Ex13.alternating("11001") == 1) {
            System.out.println(" Test passed :)       " + Ex13.alternating("11001") + "                1\t    11001"); // (1.8)
        } else {
            System.out.println(" Test failed :(       " + Ex13.alternating("11001") + "                1\t    11001");
        }
        System.out.println("---------------------------------------------------------------------");
        if (Ex13.alternating("001100") == 1) {
            System.out.println(" Test passed :)       " + Ex13.alternating("001100") + "                1\t    001100"); // (1.9)
        } else {
            System.out.println(" Test failed :(       " + Ex13.alternating("001100") + "                1\t    001100");
        }
        System.out.println("---------------------------------------------------------------------");
        if (Ex13.alternating("001100111010") == 2) {
            System.out.println(" Test passed :)       " + Ex13.alternating("001100111010") + "                2\t    001100111010"); // (1.10)
        } else {
            System.out.println(" Test failed :(       " + Ex13.alternating("001100111010") + "                2\t    001100111010");
        }
        System.out.println("---------------------------------------------------------------------");
        if (Ex13.alternating("10110011101000") == 2) {
            System.out.println(" Test passed :)       " + Ex13.alternating("10110011101000") + "                2\t    10110011101000"); // (1.11)
        } else {
            System.out.println("Test failed :(        " + Ex13.alternating("10110011101000") + "                2\t    10110011101000");
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println("\nExercise 1: Test for (alternating method) FINISHED!");
        System.out.println("**************************************************************************************************");
        System.out.println("\nExercise 2: Test for (what method) STARTED!\n");

        int[] a1 = {}; // (2.1)
        int[] a2 = {1}; // (2.2)
        int[] a3 = {0}; // (2.3)
        int[] a4 = {1, 1, 1}; // (2.4)
        int[] a5 = {1, 1, 1, 0, 0, 1, 1}; // (2.5)
        int[] a6 = {0, 1, 1, 0, 0, 1, 0}; // (2.6)
        int[] a7 = {0, 1, 1, 0, 0, 1, 1, 1}; // (2.7)
        int[] a8 = {0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1}; // (2.8)
        int[] a9 = {1, 0}; // 1 // (2.9)
        int[] a10 = {1, 1}; // 2 // (2.10)
        int[] a11 = {0, 0}; // 2 // (2.11)

        System.out.println("| Test result | Your answer | Expected answer | Tested for this array |");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        if (Ex13.what(a1) == 0) {
            System.out.println(" Test passed :)       " + Ex13.what(a1) + "                0\t    {}");
        } else {
            System.out.println(" Test failed :(       " + Ex13.what(a1) + "                0\t    {}");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
        if (Ex13.what(a2) == 0) {
            System.out.println(" Test passed :)       " + Ex13.what(a2) + "                0\t    {1}");
        } else {
            System.out.println(" Test failed :(       " + Ex13.what(a2) + "                0\t    {1}");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
        if (Ex13.what(a3) == 1) {
            System.out.println(" Test passed :)       " + Ex13.what(a3) + "                1\t    {0}");
        } else {
            System.out.println(" Test failed :(       " + Ex13.what(a3) + "                1\t    {0}");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
        if (Ex13.what(a4) == 2) {
            System.out.println(" Test passed :)       " + Ex13.what(a4) + "                2\t    {1, 1, 1}");
        } else {
            System.out.println(" Test failed :(       " + Ex13.what(a4) + "                2\t    {1, 1, 1}");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
        if (Ex13.what(a5) == 6) {
            System.out.println(" Test passed :)       " + Ex13.what(a5) + "                6\t    {1, 1, 1, 0, 0, 1, 1}");
        } else {
            System.out.println(" Test failed :(       " + Ex13.what(a5) + "                6\t    {1, 1, 1, 0, 0, 1, 1}");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
        if (Ex13.what(a6) == 5) {
            System.out.println(" Test passed :)       " + Ex13.what(a6) + "                5\t    {0, 1, 1, 0, 0, 1, 0}");
        } else {
            System.out.println(" Test failed :(       " + Ex13.what(a6) + "                5\t    {0, 1, 1, 0, 0, 1, 0}");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
        if (Ex13.what(a7) == 7) {
            System.out.println(" Test passed :)       " + Ex13.what(a7) + "                7\t    {0, 1, 1, 0, 0, 1, 1, 1}");
        } else {
            System.out.println(" Test failed :(       " + Ex13.what(a7) + "                7\t    {0, 1, 1, 0, 0, 1, 1, 1}");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
        if (Ex13.what(a8) == 17) {
            System.out.println(" Test passed :)       " + Ex13.what(a8) + "               17\t    {0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1}");
        } else {
            System.out.println(" Test failed :(       " + Ex13.what(a8) + "               17\t    {0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1}");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
        if (Ex13.what(a9) == 1) {
            System.out.println(" Test passed :)       " + Ex13.what(a9) + "                1\t    {1, 0}");
        } else {
            System.out.println(" Test failed :(       " + Ex13.what(a9) + "                1\t    {1, 0}");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
        if (Ex13.what(a10) == 2) {
            System.out.println(" Test passed :)       " + Ex13.what(a10) + "                2\t    {1, 1}");
        } else {
            System.out.println(" Test failed :(       " + Ex13.what(a10) + "                2\t    {1, 1}");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
        if (Ex13.what(a11) == 2) {
            System.out.println(" Test passed :)       " + Ex13.what(a11) + "                2\t    {0, 0}");
        } else {
            System.out.println(" Test failed :(       " + Ex13.what(a11) + "                2\t    {0, 0}");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");

        System.out.println("\n\nExercise 2: Test for (what method) FINISHED!");
        System.out.println("**************************************************************************************************");

        int[] way1 = {2, 4, 1, 6, 4, 2, 4, 3, 5}; // (3.1)
        int[] way2 = {4, 2, 3, 4, 4, 5, 5, 2, 5, 6}; // (3.2)
        int[] way3 = {1, 4, 3, 1, 2, 4, 3}; // (3.3)
        int[] way4 = {7, 4, 3, 1, 2, 4, 3}; // (3.4)
        int[] way5 = {6, 4, 3, 1, 2, 4, 3}; // (3.5)
        int[] way6 = {1}; // (3.6)
        int[] way7 = {2, 1, 2, 1, 2, 1}; // (3.7)
        int[] way8 = {4, 4, 1, 3, 2, 1}; // (3.8)
        int[] way9 = {4, 3, 1, 3, 2, 1}; // (3.9)
        int[] way10 = {4, 2, 1, 3, 2, 1}; // (3.10)
        int[] way11 = {1, 1, 1}; // (3.11)
        int[] way12 = {1, 1}; // (3.12)
        int[] way13 = {2, 1}; // (3.13)
        int[] way14 = {9, 7, 5, 3, 1, 5, 2, 4, 6, 8, 1}; // (3.14)
        int[] way15 = {9, 7, 5, 3, 1, 1, 2, 4, 6, 8, 1}; // (3.15)
        int[] way16 = {5, 1, 1, 1, 1, 5, 1}; // (3.16)

        System.out.println("\nExercise 3: Test for (isWay method) STARTED!\n");
        System.out.println("| Test result | Your answer | Expected answer | Tested for this array |");
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.isWay(way1) == true)
            System.out.println(" Test passed :)       " + Ex13.isWay(way1) + "         true\t\t{2, 4, 1, 6, 4, 2, 4, 3, 5}"); // true
        else {
            System.out.println(" Test failed :(       " + Ex13.isWay(way1) + "         true\t\t{2, 4, 1, 6, 4, 2, 4, 3, 5}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.isWay(way2) == true) {
            System.out.println(" Test passed :)       " + Ex13.isWay(way2) + "         true\t\t{4, 2, 3, 4, 4, 5, 5, 2, 5, 6}"); // true
        } else {
            System.out.println(" Test failed :(       " + Ex13.isWay(way2) + "         true\t{4, 2, 3, 4, 4, 5, 5, 2, 5, 6}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.isWay(way3) == false) {
            System.out.println(" Test passed :)       " + Ex13.isWay(way3) + "        false\t{1, 4, 3, 1, 2, 4, 3}"); // false
        } else {
            System.out.println(" Test failed :(       " + Ex13.isWay(way3) + "        false\t{1, 4, 3, 1, 2, 4, 3}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.isWay(way4) == false) {
            System.out.println(" Test passed :)       " + Ex13.isWay(way4) + "        false\t{7, 4, 3, 1, 2, 4, 3}"); // false
        } else {
            System.out.println(" Test failed :(       " + Ex13.isWay(way4) + "        false\t{7, 4, 3, 1, 2, 4, 3}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.isWay(way5) == true) {
            System.out.println(" Test passed :)       " + Ex13.isWay(way5) + "         true\t\t{6, 4, 3, 1, 2, 4, 3} "); // true
        } else {
            System.out.println(" Test failed :(       " + Ex13.isWay(way5) + "         true\t\t{6, 4, 3, 1, 2, 4, 3} ");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.isWay(way6) == true) {
            System.out.println(" Test passed :)       " + Ex13.isWay(way6) + "         true\t\t{1}"); // true
        } else {
            System.out.println(" Test failed :(       " + Ex13.isWay(way6) + "         true\t\t{1}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.isWay(way7) == false) {
            System.out.println(" Test passed :)       " + Ex13.isWay(way7) + "        false\t{2, 1, 2, 1, 2, 1}"); // false
        } else {
            System.out.println(" Test failed :(       " + Ex13.isWay(way7) + "        false\t{2, 1, 2, 1, 2, 1}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.isWay(way8) == true) {
            System.out.println(" Test passed :)       " + Ex13.isWay(way8) + "         true\t\t{4, 4, 1, 3, 2, 1}"); // true
        } else {
            System.out.println(" Test failed :(       " + Ex13.isWay(way8) + "         true\t\t{4, 4, 1, 3, 2, 1}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.isWay(way9) == false) {
            System.out.println(" Test passed :)       " + Ex13.isWay(way9) + "        false\t{4, 3, 1, 3, 2, 1}"); // false
        } else {
            System.out.println(" Test failed :(       " + Ex13.isWay(way9) + "        false\t{4, 3, 1, 3, 2, 1}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.isWay(way10) == false) {
            System.out.println(" Test passed :)       " + Ex13.isWay(way10) + "        false\t{4, 2, 1, 3, 2, 1}"); // false
        } else {
            System.out.println(" Test failed :(       " + Ex13.isWay(way10) + "        false\t{4, 2, 1, 3, 2, 1}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.isWay(way11) == true) {
            System.out.println(" Test passed :)       " + Ex13.isWay(way11) + "         true\t\t{1, 1, 1}"); // true
        } else {
            System.out.println(" Test failed :(       " + Ex13.isWay(way11) + "         true\t\t{1, 1, 1}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.isWay(way12) == true) {
            System.out.println(" Test passed :)       " + Ex13.isWay(way12) + "         true\t\t{1, 1} "); // true
        } else {
            System.out.println(" Test failed :(       " + Ex13.isWay(way12) + "         true\t\t{1, 1} "); // true
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.isWay(way13) == false) {
            System.out.println(" Test passed :)       " + Ex13.isWay(way13) + "        false\t{2, 1}"); // false
        } else {
            System.out.println(" Test failed :(       " + Ex13.isWay(way13) + "        false\t{2, 1}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.isWay(way14) == true) {
            System.out.println(" Test passed :)       " + Ex13.isWay(way14) + "         true\t\t{9, 7, 5, 3, 1, 5, 2, 4, 6, 8, 1}"); // true
        } else {
            System.out.println(" Test failed :(       " + Ex13.isWay(way14) + "         true\t\t{9, 7, 5, 3, 1, 5, 2, 4, 6, 8, 1}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.isWay(way15) == false) {
            System.out.println(" Test passed :)       " + Ex13.isWay(way15) + "        false\t{9, 7, 5, 3, 1, 1, 2, 4, 6, 8, 1}"); // false
        } else {
            System.out.println(" Test failed :(       " + Ex13.isWay(way15) + "        false\t{9, 7, 5, 3, 1, 1, 2, 4, 6, 8, 1}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.isWay(way16) == false) {
            System.out.println(" Test passed :)       " + Ex13.isWay(way16) + "        false\t{5, 1, 1, 1, 1, 5, 1} "); // false
        } else {
            System.out.println(" Test failed :(       " + Ex13.isWay(way16) + "        false\t{5, 1, 1, 1, 1, 5, 1} ");
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("\nCheck if array (3.15) is not changed after using the method:\n");
        System.out.println("Original array: {9, 7, 5, 3, 1, 1, 2, 4, 6, 8, 1}");
        System.out.print("Your array:     {");
        for (int i = 0; i < way15.length - 1; i++) {
            System.out.print(way15[i] + ", ");
        }
        System.out.println(way15[way15.length - 1] + "}");
        System.out.println("\n*if your array is the same as the original array then Test passed! otherwise failed.");
        System.out.println("\nExercise 3: Test for (isWay method) FINISHED!");
        System.out.println("**************************************************************************************************");

       System.out.println("\nExercise 4: Test for (prince method) STARTED!\n");

        int[][] p1 = {
            //(0,0) > 4 // (4,4) > -1
            {2, 0, 1, 2, 3},
            {2, 3, 5, 5, 4},
            {8, -1, 6, 8, 7},
            {3, 4, 7, 2, 4},
            {2, 4, 3, 1, 2}};

        int[][] p2 = {
            //(0,0) > 4 // (0,4) > 6
            {1, 1, 1, 1, 1},
            {2, 2, 2, 2, 2},
            {3, -1, 3, 3, 3}};

        int[][] p3 = {
            //(0,0) > 4 // (3,3) > 6 // (2,3) > - 1
            //(1,2) > 1
            {2, 6, 3, 1},
            {1, 2, -1, 1},
            {2, 4, 0, 10},
            {0, 3, 4, 5}
        };

        int[][] p4 = {
            //(0,0) , (2,2) , (3,3) , (1,2) > -1
            {2, 6, 3, 1},
            {1, 2, 0, 1},
            {2, 4, 0, 10},
            {0, 3, 4, 5}
        };

        System.out.println("| Test result | Your answer | Expected answer | Tested for this array |");
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.prince(p1, 0, 0) == 4) {
            System.out.println(" Test passed :)       " + Ex13.prince(p1, 0, 0) + "         4\n" +
                      "            \t\t\t\t\t{2 0 1 2 3}  tested for: i = 0, j = 0\n"
                    + "            \t\t\t\t\t{2 3 5 5 4}\n"
                    + "            \t\t\t\t\t{8 -1 6 8 7}\n"
                    + "            \t\t\t\t\t{3 4 7 2 4}\n"
                    + "            \t\t\t\t\t{2 4 3 1 2}");

        } else {
            System.out.println(" Test failed :(       " + Ex13.prince(p1, 0, 0) + "         4\n" +
                    "              \t\t\t\t\t{2 0 1 2 3}  tested for: i = 0, j = 0\n"
                    + "            \t\t\t\t\t{2 3 5 5 4}\n"
                    + "            \t\t\t\t\t{8 -1 6 8 7}\n"
                    + "            \t\t\t\t\t{3 4 7 2 4}\n"
                    + "            \t\t\t\t\t{2 4 3 1 2}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.prince(p1, 4, 4) == -1) {
            System.out.println(" Test passed :)       " + Ex13.prince(p1, 4, 4) + "         -1\n" +
                    "              \t\t\t\t\t{2 0 1 2 3}  tested for: i = 4, j = 4\n"
                    + "            \t\t\t\t\t{2 3 5 5 4}\n"
                    + "            \t\t\t\t\t{8 -1 6 8 7}\n"
                    + "            \t\t\t\t\t{3 4 7 2 4}\n"
                    + "            \t\t\t\t\t{2 4 3 1 2}");

        } else {
            System.out.println(" Test failed :(       " + Ex13.prince(p1, 4, 4) + "         -1\n" +
                    "              \t\t\t\t\t{2 0 1 2 3}\n  tested for: i = 4, j = 4\n"
                    + "            \t\t\t\t\t{2 3 5 5 4}\n"
                    + "            \t\t\t\t\t{8 -1 6 8 7}\n"
                    + "            \t\t\t\t\t{3 4 7 2 4}\n"
                    + "            \t\t\t\t\t{2 4 3 1 2}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.prince(p2, 0, 0) == 4) {
            System.out.println(" Test passed :)       " + Ex13.prince(p2, 0, 0) + "         4\n" +
                    "              \t\t\t\t\t{1 1 1 1 1}  tested for: i = 0, j = 0\n"
                    + "            \t\t\t\t\t{2 2 2 2 2}\n"
                    + "            \t\t\t\t\t{3 -1 3 3 3}");
        } else {
            System.out.println(" Test failed :(       " + Ex13.prince(p2, 0, 0) + "         4\n" +
                    "              \t\t\t\t\t{1 1 1 1 1}  tested for: i = 0, j = 0\n"
                    + "            \t\t\t\t\t{2 2 2 2 2}\n"
                    + "            \t\t\t\t\t{3 -1 3 3 3}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.prince(p2, 0, 4) == 6) {
            System.out.println(" Test passed :)       " + Ex13.prince(p2, 0, 4) + "         6\n" +
                    "              \t\t\t\t\t{1 1 1 1 1}  tested for: i = 0, j = 4\n"
                    + "            \t\t\t\t\t{2 2 2 2 2}\n"
                    + "            \t\t\t\t\t{3 -1 3 3 3}");
        } else {
            System.out.println(" Test failed :(       " + Ex13.prince(p2, 0, 4) + "         6\n" +
                    "              \t\t\t\t\t{1 1 1 1 1}  tested for: i = 0, j = 4\n"
                    + "            \t\t\t\t\t{2 2 2 2 2}\n"
                    + "            \t\t\t\t\t{3 -1 3 3 3}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.prince(p3, 0, 0) == 4) {
            System.out.println(" Test passed :)       " + Ex13.prince(p3, 0, 0) + "         4\n" +
                    "              \t\t\t\t\t{2 6 3 1}  tested for: i = 0, j = 0\n"
                    + "            \t\t\t\t\t{1 2 -1 1}\n"
                    + "            \t\t\t\t\t{2 4 0 10}\n"
                    + "            \t\t\t\t\t{0 3 4 5}");
        } else {
            System.out.println(" Test failed :(       " + Ex13.prince(p3, 0, 0) + "         4\n" +
                    "              \t\t\t\t\t{2 6 3 1}  tested for: i = 0, j = 0\n"
                    + "            \t\t\t\t\t{1 2 -1 1}\n"
                    + "            \t\t\t\t\t{2 4 0 10}\n"
                    + "            \t\t\t\t\t{0 3 4 5}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.prince(p3, 3, 3) == 6) {
            System.out.println(" Test passed :)       " + Ex13.prince(p3, 3, 3) + "         6\n" +
                    "              \t\t\t\t\t{2 6 3 1}  tested for: i = 3, j = 3\n"
                    + "            \t\t\t\t\t{1 2 -1 1}\n"
                    + "            \t\t\t\t\t{2 4 0 10}\n"
                    + "            \t\t\t\t\t{0 3 4 5}");
        } else {
            System.out.println(" Test failed :(       " + Ex13.prince(p3, 3, 3) + "         6\n" +
                    "              \t\t\t\t\t{2 6 3 1}  tested for: i = 3, j = 3\n"
                    + "            \t\t\t\t\t{1 2 -1 1}\n"
                    + "            \t\t\t\t\t{2 4 0 10}\n"
                    + "            \t\t\t\t\t{0 3 4 5}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.prince(p3, 2, 3) == -1) {
            System.out.println(" Test passed :)       " + Ex13.prince(p3, 2, 3) + "         -1\n" +
                    "              \t\t\t\t\t{2 6 3 1}  tested for: i = 2, j = 3\n"
                    + "            \t\t\t\t\t{1 2 -1 1}\n"
                    + "            \t\t\t\t\t{2 4 0 10}\n"
                    + "            \t\t\t\t\t{0 3 4 5}");
        } else {
            System.out.println(" Test failed :(       " + Ex13.prince(p3, 2, 3) + "         -1\n" +
                    "              \t\t\t\t\t{2 6 3 1}  tested for: i = 2, j = 3\n"
                    + "            \t\t\t\t\t{1 2 -1 1}\n"
                    + "            \t\t\t\t\t{2 4 0 10}\n"
                    + "            \t\t\t\t\t{0 3 4 5}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.prince(p3, 1, 2) == 1) {
            System.out.println(" Test passed :)       " + Ex13.prince(p3, 1, 2) + "         1\n" +
                    "              \t\t\t\t\t{2 6 3 1}  tested for: i = 1, j = 2\n"
                    + "            \t\t\t\t\t{1 2 -1 1}\n"
                    + "            \t\t\t\t\t{2 4 0 10}\n"
                    + "            \t\t\t\t\t{0 3 4 5}");
        } else {
            System.out.println(" Test failed :(       " + Ex13.prince(p3, 1, 2) + "         1\n" +
                    "              \t\t\t\t\t{2 6 3 1}  tested for: i = 1, j = 2\n"
                    + "            \t\t\t\t\t{1 2 -1 1}\n"
                    + "            \t\t\t\t\t{2 4 0 10}\n"
                    + "            \t\t\t\t\t{0 3 4 5}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
       if (Ex13.prince(p4, 0, 0) == -1) {
            System.out.println(" Test passed :)       " + Ex13.prince(p4, 0, 0) + "         -1\t\t{2 6 3 1}  tested for: i = 0, j = 0\n"
                    + "            \t\t\t\t\t{1 2 0 1}\n"
                    + "            \t\t\t\t\t{2 4 0 10}\n"
                    + "            \t\t\t\t\t{0 3 4 5}");
        } else {
            System.out.println(" Test failed :(       " + Ex13.prince(p4, 0, 0) + "         -1\t\t{2 6 3 1}  tested for: i = 0, j = 0\n"
                    + "            \t\t\t\t\t{1 2 0 1}\n"
                    + "            \t\t\t\t\t{2 4 0 10}\n"
                    + "            \t\t\t\t\t{0 3 4 5}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.prince(p4, 2, 2) == -1) {
            System.out.println(" Test passed :)       " + Ex13.prince(p4, 2, 2) + "         -1\t\t{2 6 3 1}  tested for: i = 2, j = 2\n"
                    + "            \t\t\t\t\t{1 2 0 1}\n"
                    + "            \t\t\t\t\t{2 4 0 10}\n"
                    + "            \t\t\t\t\t{0 3 4 5}");
        } else {
            System.out.println(" Test failed :(       " + Ex13.prince(p4, 2, 2) + "         -1\t\t{2 6 3 1}  tested for: i = 2, j = 2\n"
                    + "            \t\t\t\t\t{1 2 0 1}\n"
                    + "            \t\t\t\t\t{2 4 0 10}\n"
                    + "            \t\t\t\t\t{0 3 4 5}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.prince(p4, 3, 3) == -1) {
            System.out.println(" Test passed :)       " + Ex13.prince(p4, 3, 3) + "         -1\t\t{2 6 3 1}  tested for: i = 3, j = 3\n"
                    + "            \t\t\t\t\t{1 2 0 1}\n"
                    + "            \t\t\t\t\t{2 4 0 10}\n"
                    + "            \t\t\t\t\t{0 3 4 5}");
        } else {
            System.out.println(" Test failed :(       " + Ex13.prince(p4, 3, 3) + "         -1\t\t{2 6 3 1}  tested for: i = 3, j = 3\n"
                    + "            \t\t\t\t\t{1 2 0 1}\n"
                    + "            \t\t\t\t\t{2 4 0 10}\n"
                    + "            \t\t\t\t\t{0 3 4 5}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        if (Ex13.prince(p4, 1, 2) == -1) {
            System.out.println(" Test passed :)       " + Ex13.prince(p4, 1, 2) + "         -1\t\t{2 6 3 1}  tested for: i = 1, j = 2\n"
                    + "            \t\t\t\t\t{1 2 0 1}\n"
                    + "            \t\t\t\t\t{2 4 0 10}\n"
                    + "            \t\t\t\t\t{0 3 4 5}");
        } else {
            System.out.println(" Test failed :(       " + Ex13.prince(p4, 1, 2) + "         -1\t\t{2 6 3 1}  tested for: i = 1, j = 2\n"
                    + "            \t\t\t\t\t{1 2 0 1}\n"
                    + "            \t\t\t\t\t{2 4 0 10}\n"
                    + "            \t\t\t\t\t{0 3 4 5}");
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("\nExercise 4: Test for (prince method) FINISHED!");
        System.out.println("**************************************************************************************************");

    // *******************************************TEST FINISHED***************************************************/

    }
}
