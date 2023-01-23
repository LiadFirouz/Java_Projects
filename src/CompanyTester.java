public class CompanyTester
{
    public static  void main(String [] args) {

        Car cr1 = new Car(1234567, 'A', "Toyota", true);
        Car cr2 = new Car(1000001,'C',"Citroen", false);
        Car cr3 = new Car(1002001,'D',"Citroen", true);
        Car cr4 = new Car(1111111,'C',"Renault", true);
        Car cr5 = new Car(1233215, 'B',"Bentley", false);

        Date d1 = new Date (10,5,2022);
        Date d2 = new Date(15,5,2022);

        Date d3 = new Date(2,7,2018);
        Date d4 = new Date(29,7,2018);

        Date d5 = new Date(1,1,2023);
        Date d6 = new Date(8,1,2023);
        Date d7 = new Date(9,1,2023);
        Date d8 = new Date(27,7,2018);

        Company c1 = new Company();
        Company c2 = new Company();
        System.out.println("\t******Testing addRent method******");
        if (c1.addRent("Tal", cr1, d1, d2)) System.out.println("Successfully added: (expecting 1)\n"+c1+"\n");
        System.out.println("Double-listing: (expecting false) "+c1.addRent("Tal", cr1, d1, d2)+"\n");
        if (c1.addRent("Thomas", cr2, d5, d6)) System.out.println("Successfully added: (expecting 2)\n"+c1+"\n");
        System.out.println("\t*MIND THE ORDER!: Arthur > Tal > Thomas*\n");
        if (c1.addRent("Arthur", cr3, d3,d4)) System.out.println("Successfully added: (expecting 3)\n"+c1+"\n");
        System.out.println("\t******Testing removeRent method******");
        System.out.println("Trying to remove non-existent rent: (false expected) => "+c1.removeRent(d7));
        System.out.println("\n"+c1+"\n");

        c1.addRent("Arthur the II", cr4, d8,d4);
        System.out.println("Adding Arthur the II:\n"+c1);
        System.out.println("\nTrying to remove Arthur's rent: "+c1.removeRent(d4));
        System.out.println(c1);

        System.out.println("\n\t******Testing getNumOfRents method******");
        if (c1.getNumOfRents() == 3)
            System.out.println("Test Passed: returned; "+c1.getNumOfRents());
        else
            System.out.println("Test FAILED!: expected 3; returned: "+c1.getNumOfRents()+"\n"+c1);
        c1.addRent("Arthur", cr3, d3,d4);


        if (c1.getNumOfRents() == 4)
            System.out.println("Test Passed: returned; "+c1.getNumOfRents());
        else
            System.out.println("Test FAILED!: expected 4; returned: "+c1.getNumOfRents()+"\n"+c1);

        System.out.println("\n\t******Testing getSumOfPrices method******");
        if (c1.getSumOfPrices() == 7970)
            System.out.println("Test Passed: returned; "+c1.getSumOfPrices());
        else
            System.out.println("Test FAILED!: expected 7970; returned: "+c1.getSumOfPrices());

        System.out.println("\n\t******Testing getSumOfDays method******");
        if (c1.getSumOfDays() == 41)
            System.out.println("Test Passed: returned; "+c1.getSumOfDays());
        else
            System.out.println("Test FAILED!: expected 41; returned "+c1.getSumOfDays());

        System.out.println("\n\t******Testing averageRent method******");
        if (c1.averageRent() == 10.25)
            System.out.println("Test Passed: returned; "+c1.averageRent());
        else
            System.out.println("Test FAILED!: expected 10.25; returned: "+c1.averageRent());

        System.out.println("\n\t******Testing lastCarRent method******");
        if (c1.lastCarRent().equals(cr2))
            System.out.println("Test Passed: returned; "+c1.lastCarRent());
        else
            System.out.println("Test FAILED!: expected "+cr2+" returned: "+c1.lastCarRent());

        System.out.println("\n\t******Testing longestRent method******");
        System.out.println("Expecting Arthur: "+c1.longestRent());

        System.out.println("\n\t******Testing mostCommonRate method******");
        if (c1.mostCommonRate() == 'C')
            System.out.println("Test Passed: returned; "+c1.mostCommonRate());
        else
            System.out.println("Test FAILED!: expected 'C'; returned: "+c1.mostCommonRate());

        System.out.println("\n\t******Testing includes method******");
        c2.addRent("Thomas", cr2, d5, d6);
        c2.addRent("Tal", cr1, d1, d2);
        System.out.println("Checking if new list c2:\n"+c2+"\n\tincluded in c1:\n"+c1);
        if (c1.includes(c2))
            System.out.println("Test Passed: returned; "+c1.includes(c2));
        else
            System.out.println("Test FAILED!: expected true; returned: "+c1.includes(c2));

        System.out.println("\nSetting c3 empty list:");
        Company c3 = new Company();
        System.out.println("C3 included in C1?: "+ c1.includes(c3) +"; "+ ((c1.includes(c3)) ?  "TEST PASSED" : "TEST FAILED!"));
        System.out.println("C3 included in C2?: "+ c2.includes(c3) +"; "+ ((c2.includes(c3)) ?  "TEST PASSED" : "TEST FAILED!"));
        System.out.println("C1 included in C3?: "+ c3.includes(c1) +"; "+ (!(c3.includes(c1)) ?  "TEST PASSED" : "TEST FAILED!"));

        System.out.println("\n\t******Testing merge method******");
        c3.addRent("Yankee", cr1, d3, d4);
        System.out.println("C3:\n"+c3+"\n\n"+"C1:\n"+c1);
        c1.merge(c3);
        System.out.println("\nMerge C3 in C1:\n"+c1);

        // System.out.println("\n\t******Testing unifyRents method******");
        // c1.addRent("Tal", cr1, new Date(12,05,2022), new Date(19,05,2022));
        // System.out.println("Expecting Tal to be united to a rent from 10/05 to 19/05:\n"+c1);
        // c1.unifyRents();
        // System.out.println("\nAfter unifyRents method:\n"+c1);

        System.out.println("\n\t******Testing toString method******");
        System.out.println("\n\tPAY CLOSE ATTENTION TO PRINTS\n");
        c3.removeRent(new Date(29,07,2018));
        System.out.println("-----------------------------------------------");
        System.out.println(c3+"\n");
        System.out.println("Total active rents: "+c3.getNumOfRents()+"\nTotal Price: "+c3.getSumOfPrices()+"\nTotal sum of days: "+c3.getSumOfDays());
        System.out.println("Average rent: "+c3.averageRent()+"\nlastCarRent: "+c3.lastCarRent()+"\nLongest rent: "+c3.longestRent()+"\nMost Common Rate: "+c3.mostCommonRate());
        System.out.println("-----------------------------------------------\n");
        c3.addRent("Tal", cr1, new Date(12,05,2022), new Date(19,05,2022));
        System.out.println("-----------------------------------------------");
        System.out.println(c3+"\n");
        System.out.println("Total active rents: "+c3.getNumOfRents()+"\nTotal Price: "+c3.getSumOfPrices()+"\nTotal sum of days: "+c3.getSumOfDays());
        System.out.println("Average rent: "+c3.averageRent()+"\nlastCarRent: "+c3.lastCarRent()+"\nLongest rent: "+c3.longestRent()+"\nMost Common Rate: "+c3.mostCommonRate());
        System.out.println("-----------------------------------------------\n");
        // c3.removeRent(new Date(18,05,2022));
        // System.out.println(c3.removeRent(new Date(18,05,2022)));
        c3.addRent("Yaakov", cr3, d1, d2);
        System.out.println("-----------------------------------------------");
        System.out.println(c3+"\n");
        System.out.println("Total active rents: "+c3.getNumOfRents()+"\nTotal Price: "+c3.getSumOfPrices()+"\nTotal sum of days: "+c3.getSumOfDays());
        System.out.println("Average rent: "+c3.averageRent()+"\nlastCarRent: "+c3.lastCarRent()+"\nLongest rent: "+c3.longestRent()+"\nMost Common Rate: "+c3.mostCommonRate());
        System.out.println("-----------------------------------------------\n");
        c3.addRent("Dima", cr4, d3, d7);
        System.out.println("-----------------------------------------------");
        System.out.println(c3+"\n");
        System.out.println("Total active rents: "+c3.getNumOfRents()+"\nTotal Price: "+c3.getSumOfPrices()+"\nTotal sum of days: "+c3.getSumOfDays());
        System.out.println("Average rent: "+c3.averageRent()+"\nlastCarRent: "+c3.lastCarRent()+"\nLongest rent: "+c3.longestRent()+"\nMost Common Rate: "+c3.mostCommonRate());
        System.out.println("-----------------------------------------------\n");

        // aliasing test contributed by @Yedidya Darshan
        System.out.println("\n\t******Testing for aliasing******");
        Car testCar = c2.lastCarRent();
        cr3.setType('A');
        System.out.println("\nTesting aliasing for lastCarRent method \n");
        if (testCar.getType() != cr3.getType())
            System.out.println("Test Passed");
        else
            System.out.println("Test FAILED, please fix aliasing issue");

        System.out.println("\nTesting aliasing for longestRent method \n");
        Rent testRent = c2.longestRent();
        testRent.setPickDate(new Date(4,5,2006));
        if (! testRent.equals(c2.longestRent()))
            System.out.println("Passed!");
        else
            System.out.println("FAILED, please check for aliasing");
    }
}