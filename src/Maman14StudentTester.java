
/**
 * Tester for Maman 14
 */
public class Maman14StudentTester
{


    public static void main (String[] args)
    {
        //-----------------------RentNode---------------------
        System.out.println("\n-----Testing RentNode Class:-----\n");         

        Rent r1 = new Rent ("David Cohen", new Car(1122233,'B',"Mercedes", false), new Date(12,3,2004), new Date(6,7,2004));
        Rent r2 = new Rent ("Israel Israeli", new Car(1234567, 'A', "Mazda", true), new Date(2,8,2017), new Date(12,8,2017));
        Rent r4 = new Rent ("Noy Zohar", new Car(6666666, 'A', "Mazda", true), new Date(6,6,2066), new Date(12,8,2066));

         //Test Constructor(Rent r)
        System.out.println("Testing constructor(Rent r) with pick date of 12/3/2004 and printing the date using the getRent() and toString() methods:");
        RentNode rent1= new RentNode (r1);
        System.out.println(rent1.getRent().getPickDate());

        //Test Constructor(Rent r)
        System.out.println("\nTesting constructor(Rent r, RentNode n) with pick date of 2/8/2017 and printing the date using the getRent() and toString() methods:");
        RentNode rent2= new RentNode (r2,rent1);
        System.out.println(rent2.getRent().getPickDate());

        //Test getNext()
        System.out.println("\nTesting the getNext() method by using it to print the next RentNode pick date that should be 12/3/2004:");
        System.out.println(rent2.getNext().getRent().getPickDate());

        //Test Constructor(Rent r)
        System.out.println("\nTesting constructor(RentNode other) with pick date of 2/8/2017 and printing the date using the getRent() and toString() methods:");
        RentNode rent3= new RentNode (rent2);
        System.out.println(rent3.getRent().getPickDate());

        //Test setNext()
        RentNode rent4= new RentNode (r4);
        System.out.println("\nTesting the setNext() method by setting a new RentNode and then print the next RentNode pick date that should be 6/6/2066:");
        rent3.setNext(rent4);
        System.out.println(rent3.getNext().getRent().getPickDate());

        //-----------------------Company---------------------
       System.out.println("\n-----Testing Company Class:-----\n");

        //Test Constructor()
        Company comp1 = new Company();
        System.out.println("Testing default constructor and printing using the toString() method:");
        System.out.println(comp1);

        //Test addRent()
        boolean success;
        System.out.println("\nTesting addRent - adding one Rent");

        //adding one rent
        success= comp1.addRent("David Cohen", new Car(1122233,'B',"Mercedes", false), new Date(2,7,2018), new Date(6,7,2018));
        if(success == false)  
            System.out.println("Error in addRnt: failed to add one rent to an empty list.");
        else
            System.out.print("Success to add one rent to an empty list (print below):\n"+comp1);

       //Test toString()
        System.out.println("\nTesting toString after adding 4 more Rent(one is a Rent duplacte!) \norder of rents is important - early pickDate should be first:");
        comp1.addRent("Moshe Levy", new Car(1000001,'C',"Citroen", false), new Date(2,7,2018), new Date(17,7,2018));
        comp1.addRent("Moshe Levy", new Car(1000001,'C',"Citroen", false), new Date(2,7,2018), new Date(17,7,2018));
        comp1.addRent("Ron Balon", new Car(1111111,'C',"Renault", true), new Date(2,7,2018), new Date(9,7,2018));
        comp1.addRent("Israel Israeli", new Car(1234567, 'A', "Mazda", true), new Date(2,8,2017), new Date(11,8,2017));
        System.out.println(comp1);

          //test getNumOfRents() - should be 4
        System.out.println("Testing getNumOfRents():");
        System.out.println("The number of rents in this company is: " + comp1.getNumOfRents());

       //test getSumOfPrices() -  should be 5012
        System.out.println("\nTesting getSumOfPrices():");
        System.out.println("The sum of all prices of rents in this company is: " + comp1.getSumOfPrices());

        //test getSumOfDays() -  should be 35
        System.out.println("\nTesting getSumOfDays():");
        System.out.println("The total sum of rent days in this company is: " + comp1.getSumOfDays());

        //test averageRent() -  should be 8.75
        System.out.println("\nTesting averageRent():");
        System.out.println("The average rent duration in this company is: " + comp1.averageRent());        

        //test lastCarRent()  -  should be
        System.out.println("\nTesting lastCarRent():");
        Car lastToComp = new Car(1000001,'C',"Citroen", false);
        Car last = comp1.lastCarRent();
        System.out.println("The car in the company that its return date is the latest:\n" + comp1.lastCarRent());     
        System.out.println("Where it should be:\nid:1000001 type:C brand:Citroen gear:auto");

        //test longestRent()  -  should be 15
        System.out.println("\nTesting longestRent():");
        Rent longRent = comp1.longestRent();
        System.out.println("The longest rent duration in this company is: " + longRent.howManyDays());       

        //test mostCommonRate() -  should be 'C'
        System.out.println("\nTesting mostCommonRate():");
        System.out.println("The most common rate in this company is: " + comp1.mostCommonRate()); 

         //test removeRent(Date d) - removing one rent
        System.out.println("\nTesting removeRent(Date d):");
        success = comp1.removeRent(new Date(9,7,2018));             
        if(success == false)  
            System.out.println("Error in removeRent: failed to remove a rent that exists in the list.");
        else
            System.out.println("Succeeded removing a rent from the list (print below):\n");
        System.out.println("after removing a rent from the list (Ron Balon should be removed):");
        System.out.println(comp1);

     //test includes() - case where comp2 is included in comp1
        Company comp2 = new Company();        
        comp2.addRent("Moshe Levy", new Car(1000001,'C',"Citroen", false), new Date(2,7,2018), new Date(17,7,2018));
        comp2.addRent("Israel Israeli", new Car(1234567, 'A', "Mazda", true), new Date(2,8,2017), new Date(11,8,2017));
        System.out.println("Testing includes():");
        System.out.println("Testing includes with company that is included in another one should return true while student code returns: " + comp1.includes(comp2)); 

          //test merge() - merge comp1 with comp3
        Company comp3 = new Company();        
        comp3.addRent("Moshe Levy", new Car(1000001,'C',"Citroen", false), new Date(2,7,2018), new Date(17,7,2018));
        comp3.addRent("Johnatan Blum", new Car(1222221,'B',"Renault", false), new Date(13,9,2018), new Date(16,9,2018));
        comp3.addRent("Israel Israeli", new Car(1234567, 'A', "Mazda", true), new Date(2,8,2017), new Date(11,8,2017));
        comp1.merge(comp3);
        System.out.println("\nTesting merge() - Only \"Johnatan Blum\" should be added since the other three rents already exists:");
        System.out.println(comp1);
        /* */
    }
}   

