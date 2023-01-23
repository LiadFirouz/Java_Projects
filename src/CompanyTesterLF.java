public class CompanyTesterLF
{
    public static  void main(String [] args)
    {
        Car cr1 = new Car(1234567, 'A', "Toyota", true);
        Car cr2 = new Car(1000001,'C',"Citroen", false);
        Car cr3 = new Car(1002001,'D',"Citroen", true);
        Car cr4 = new Car(1111111,'C',"Renault", true);
        Car cr5 = new Car(1233215, 'B',"Bentley", false);

        Date d1 = new Date (10,5,2018);
        Date d2 = new Date(15,5,2018);

        Date d3 = new Date(2,7,2022);
        Date d4 = new Date(27,7,2022);
        Date d5 = new Date(29,7,2022);

        Date d6 = new Date(1,1,2023);
        Date d7 = new Date(8,1,2023);
        Date d8 = new Date(9,1,2023);
        Date d9 = new Date(16,1,2023);

        Rent liadRent = new Rent("Liad", cr1, d1, d2);
        Rent alfredRent = new Rent("Alfred", cr3, d3, d4);
        Rent yosefRent = new Rent("Yosef", cr1, d6, d7);




        /*                                                Test For RentNode                                               */

        /*                                                 Test For Company                                               */
        System.out.println("\t------------------------Testing Constructor------------------------");
        Company c1 = new Company();
        System.out.println("empty constructor creation (Passed): ");
        if(c1.toString().equals("The company has 0 rents."))
            System.out.print("Passed");
        else
            System.out.print("Failed");

        System.out.println("\n\t------------------------Testing addRent------------------------");
        //fix it
        System.out.print("* adding to empty list (Passed): ");
        if(c1.addRent("Liad", cr1, d1, d2))
            System.out.println("Passed");
        else
            System.out.println("Failed");
        System.out.print(c1.toString()+"\n");

        System.out.print("* adding new with the same pick-up date: Yosef -> Liad \n");
        c1.addRent("Yosef", cr1, d1, d4);
        System.out.print(c1.toString()+"\n");

        System.out.print("* adding existed rent list (Failed): ");
        if(c1.addRent("Liad", cr1, d1, d2))
            System.out.println("Passed");
        else
            System.out.println("Failed");
        System.out.print(c1.toString()+"\n");

        System.out.println("\t------------------------Testing removeRent------------------------");
        boolean t = c1.removeRent(d4);
        System.out.println("removing Yosef from the list (true): " + t);
        System.out.print(c1.toString()+"\n");

        t= c1.removeRent(d7);
        System.out.println("removing none-exist from the list (false): " + t);
        System.out.print(c1.toString()+"\n");

        System.out.println("\t------------------------Testing getNumOfRents------------------------");
        System.out.println("test1 (1): " + c1.getNumOfRents());
        System.out.print(c1.toString()+"\n");

        t = c1.addRent("Yosef Firouz", cr1, d1, d4);
        System.out.println("test2 (2): " + c1.getNumOfRents());
        System.out.print(c1.toString()+"\n");

        t = c1.removeRent(d4);
        System.out.println("test3 (1): " + c1.getNumOfRents());
        System.out.print(c1.toString()+"\n");

        System.out.println("\t------------------------Testing getNumOfPrices------------------------");
        t = c1.addRent("Yosef", cr1, d3, d4);
        t = c1.addRent("Alfred", cr3, d6, d7);
        System.out.println("sum (4302): " + c1.getSumOfPrices());
        System.out.print(c1.toString()+"\n");

        System.out.println("\t------------------------Testing getNumOfDays------------------------");
        System.out.println("sum (37): " + c1.getSumOfDays());
        System.out.print(c1.toString()+"\n");

        t = c1.addRent("Rachel", cr1, d1, d2);
        System.out.println("sum (38): " + c1.getSumOfDays());
        System.out.print(c1.toString()+"\n");

        System.out.println("\t------------------------Testing lastCarRent------------------------");
        System.out.println("last ("+cr3+"): " + c1.lastCarRent());
        System.out.print(c1.toString()+"\n");

        t= c1.removeRent(d7);
        System.out.println("last ("+cr1+"): " + c1.lastCarRent());
        System.out.print(c1.toString()+"\n");

        t= c1.removeRent(d2);
        t= c1.removeRent(d4);
        t= c1.removeRent(d1);
        System.out.println("last (null): " + c1.lastCarRent());
        System.out.print(c1.toString()+"\n");

        t = c1.addRent("Tal", cr2, d6, d8);
        t = c1.addRent("Ziv", cr3, d7, d8);
        System.out.println("last ("+cr2+"): " + c1.lastCarRent());
        System.out.print(c1.toString()+"\n");

        System.out.println("\t------------------------Testing longestRent------------------------");
        System.out.println("longestRent (Tal): " + c1.longestRent());
        System.out.print(c1.toString()+"\n");
        t = c1.addRent("Shoshi", cr1, d7, d9);
        System.out.println("longestRent (Tal): " + c1.longestRent());
        System.out.print(c1.toString()+"\n");

        System.out.println("\t------------------------Testing mostCommonRate------------------------");
        System.out.println("mostCommonRate (Tal): " + c1.mostCommonRate());
        System.out.print(c1.toString()+"\n");
        t = c1.addRent("Shoshi", cr1, d7, d9);
        System.out.println("mostCommonRate (Tal): " + c1.mostCommonRate());
        System.out.print(c1.toString()+"\n");

        System.out.println("\t------------------------Testing includes------------------------");
        //fix it
        Company c2 = new Company();
        t = c2.addRent("Shoshi", cr1, d7, d9);
        System.out.println("includes (true): " + c1.includes(c2));
        System.out.println("includes (false): " + c2.includes(c1));

        System.out.println("\t------------------------Testing merge------------------------");
        //fix it
        t = c2.addRent("Stav", cr1, d3, d6);
        t = c2.addRent("Zoey", cr1, d8, d9);
        c1.merge(c2);
        System.out.print(c1.toString()+"\n");
    }

}
