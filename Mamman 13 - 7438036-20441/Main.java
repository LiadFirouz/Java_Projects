
public class Main {
    public static void main(String[] args) {
        /*System.out.println(Ex13.alternating("0010001111"));*/

        int[][] p1 = {
                //(0,0) > 4 // (4,4) > -1
                {2, 0, 1, 2, 3},
                {2, 3, 5, 5, 4},
                {8, -1, 6, 8, 7},
                {3, 4, 7, 2, 4},
                {2, 4, 3, 1, 2}};


        /*System.out.println(Ex13.what(new int[]{10, -5, 0, 16, -1}));
        System.out.println(Ex13.what(new int[]{1, 100}));*/
        System.out.println("For i: 0, j: 0\tResult is : "+Ex13.prince(p1,0,0));
        System.out.println("For i: 4, j: 4\tResult is : "+Ex13.prince(p1, 4, 4));
    }
}