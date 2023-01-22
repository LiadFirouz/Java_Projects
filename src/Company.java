/**
 * This class represents a Company object
 * @version 28-01-22
 * @author Liad Firouz
 */
public class Company
{
    private RentNode _head;

    /**
     * Constructor
     * initialize the list to null
     */
    public Company()
    {
        this._head = null;
    }

    /**
     * Adding a rent to company list,
     * adding rents by order of the pick-up date,
     * if there are two rents with the same pick-up date
     * the one longer rent time will appear first.
     * @param name - renter name
     * @param car - car Object
     * @param pick - rental start date
     * @param ret - return car date
     * @return - true if the rent added successfully to the list, otherwise false
     */
    public boolean addRent(String name, Car car, Date pick, Date ret)
    {
        RentNode pointer = this._head;
        Rent newRent = new Rent(name, car, pick, ret);
        RentNode newRentNode = new RentNode(newRent);

        if(isNull(pointer))
        {
            this._head = newRentNode;
            return true;
        }

        if(isListed(newRent))
            return false;

        while(!isNull(pointer))
        {
            Date pointerDate = new Date(pointer.getRent().getPickDate());

            if (pick.after(pointerDate))
            {
                newRentNode.setNext(pointer.getNext());
                pointer.setNext(newRentNode);
                return true;
            }

            else if(pick.equals(pointerDate))
            {
                if(newRent.howManyDays() > pointer.getRent().howManyDays())
                {
                    newRentNode.setNext(pointer.getNext());
                    pointer.setNext(newRentNode);
                    this._head=pointer;
                    return true;
                }
            }
            pointer = pointer.getNext();
        }

        if(pick.before(_head.getRent().getPickDate()))
        {
            newRentNode.setNext(_head);
            _head = newRentNode;
            return true;
        }
        return false;
    }

    // checks if the sent pointer is point to null
    // return true - if the current pointer is point to null, otherwise false
    private boolean isNull(RentNode rentNode)
    {
        return rentNode == null;
    }

    //checks if the rent object is already listed in the company
    // return - true if so, otherwise false
    private boolean isListed(Rent rent)
    {
        // point to the start of the list
        RentNode pointer = this._head;

        // run all over the list
        while (!isNull(pointer))
        {
            // if exist return true;
            if(pointer.getRent().equals(rent))
                return true;
            // if not move to the next rent
            pointer = pointer.getNext();
        }

        // couldn't find the rent on the list
        return false;
    }


    /**
     * Gets a return date of a rent and delete the first
     * appears of the given return date on the list.
     *
     * @param ret - return date to delete
     * @return - true if successfully deleted, otherwise false
     */
    public boolean removeRent(Date ret)
    {
        // initialize the pointer to the start of the list
        RentNode pointer = this._head;

        // loop on company list
        while(pointer != null)
        {
            // saving the return date of the next rent
            Date pointerReturnDate = pointer.getNext().getRent().getReturnDate();

            // checks if the given return date equals to the point one
            if(pointerReturnDate.equals(ret))
            {
                // removing the given date from the list
                pointer.setNext(pointer.getNext().getNext());
                return true;
            }

            // couldn't find, moving to the next rent
            pointer = pointer.getNext();
        }

        // couldn't find in all list
        return false;
    }

    /**
     * Calculate the number of rents in the list
     * @return - the number of rents in the list
     */
    public int getNumOfRents()
    {
        // initialize the pointer to the start of the list
        RentNode pointer = this._head;

        int counter = 0;

        // loop on the list, for every rent counter increases by one
        while(pointer != null)
        {
            counter++;
            pointer = pointer.getNext();
        }

        // return number of the rents
        return counter;
    }

    /**
     * Calculate the profit from all the rents in the list
     * @return - profit from all the rents
     */
    public int getSumOfPrices()
    {
        // initialize the pointer to the head of the list
        RentNode pointer = this._head;
        int sum = 0;

        // loop on the list, adding to sum each profit
        while(pointer != null)
        {
            sum += pointer.getRent().getPrice();
            pointer = pointer.getNext();
        }

        // return the total profit
        return sum;
    }

    /**
     * Calculates the total rental days
     * @return - total rental days
     */
    public int getSumOfDays()
    {
        // initialize pointer to the head of the list
        RentNode pointer = this._head;
        int sum = 0;

        //loop on the list
        while(pointer != null)
        {
            // adding to sum for each rent the rental days
            sum += pointer.getRent().howManyDays();
            pointer = pointer.getNext();
        }

        // return the total rental days
        return sum;
    }

    /**
     * Calculates the average rental days,
     * if the list is empty return 0.
     * @return - average rental days, if the list is empty return 0.
     */
    public double averageRent()
    {
        // checks is the list empty
        if(isNull(this._head))
            return 0;
        // calculate and return the average rent
        return((double)this.getSumOfDays()/(double)this.getNumOfRents());
    }

    /**
     * Searching for the latest return date car,
     * if the list is empty return null.
     * @return - the latest car return date, if the list is empty return null
     */
    public Car lastCarRent()
    {
        // check for empty list, if so return null
        if(isNull(this._head))
            return null;
        // initialize the pointer to the first rent
        RentNode pointer = this._head;
        Rent lastCarRent = pointer.getRent();

        //loop on the list
        while(!isNull(pointer))
        {
            // checks for the latest car rent, if it is save it in lastCarRent
            if(pointer.getRent().getReturnDate().after(lastCarRent.getReturnDate()))
                lastCarRent = pointer.getRent();

            // step up to the next rent in the list
            pointer = pointer.getNext();
        }//while

        // return the latest return date car
        return lastCarRent.getCar();
    }

    /**
     * Search for the max rent days,
     * if list is empty return null.
     * @return - the rent with the max rent days, if list is empty return null.
     */
    public Rent longestRent()
    {
        //checks for empty list
        if(isNull(this._head))
            return null;

        // initialize the pointers to the head of the list
        RentNode pointer = this._head;
        Rent maxRent = pointer.getRent();

        //loop on the list
        while(!isNull(pointer))
        {
            //checks for the max rent
            if(pointer.getRent().howManyDays() > maxRent.howManyDays())
                maxRent = pointer.getRent();

            // set up to the next rent
            pointer = pointer.getNext();
        }//while

        // return the max rent
        return maxRent;
    }

    /**
     * Calculates the most rated type in the rents and return its type,
     * if there is none return 'N'.
     * @return - the popular type, if there isn't a rent return 'N'
     */
    public char mostCommonRate()
    {
        //initialize finals
        final char RATE_A = 'A';
        final char RATE_B = 'B';
        final char RATE_C = 'C';
        final char RATE_D = 'D';

        //checks for an empty list
        if(isNull(this._head))
            return 'N';

        // initialize the total sum for each rate type
        int rateA = 0, rateB = 0, rateC = 0, rateD = 0;

        // setting pointer to the head of the list
        RentNode pointer = this._head;

        // loop on the list
        while(!isNull(pointer))
        {
            // saving increasing the sum of the matching type
            int currentRate = pointer.getRent().getCar().getType();
            if(currentRate == RATE_A)
                rateA ++;
            if(currentRate == RATE_B)
                rateB++;
            if(currentRate == RATE_C)
                rateC++;
            else
                rateD++;

            // set up for the next rent
            pointer = pointer.getNext();
        }

        ////////////////////////////////fix/////////////////////
        int max = Math.max(Math.max(rateA, rateB),Math.max(rateC, rateD));
        if(max == rateA)
            return RATE_A;
        if(max == rateB)
            return RATE_B;
        if(max == rateC)
            return RATE_C;

        return RATE_D;

    }

    /**
     * Checks if the given list is all listed in the current list,
     * if so return true, otherwise return false.
     * according to rent class.
     * @param other - the given listed
     * @return true - if the whole list is listed, otherwise return false.
     */
    public boolean includes(Company other)
    {
        // checks if the given listed if empty
        if(other.isNull(other._head))
            return true;

        // checks if the list is empty
        if(isNull(this._head))
            return false;

        // initialize pointer of the given list to the start
        RentNode otherPointer = other._head;
        boolean thisOneIn = false;

        // loop on the whole given list
        while(!isNull(otherPointer))
        {
            // initialize pointer for the list
            RentNode pointer = this._head;

            // loop on the whole list
            while (!isNull(pointer)) {

                //checks if the rent from the given list is in the company
                if (pointer.getRent().equals(otherPointer.getRent()))
                    thisOneIn = true;
                pointer = pointer.getNext();
            }//while

            // couldn't find the rent
            if (!thisOneIn)
                return false;

            //set up the pointer of the given list
            otherPointer = otherPointer.getNext();

        }//while
        return true;
    }

    /**
     * Merge the given list with the current list by order.
     * @param other - the given list
     */
    public void merge(Company other)
    {
        // initialize pointer for the given list
        RentNode otherPointer = other._head;

        // loop on the given list
        while (!isNull(otherPointer))
            {
                // saving rent parts
                String name = otherPointer.getRent().getName();
                Car car = otherPointer.getRent().getCar();
                Date pick = otherPointer.getRent().getPickDate();
                Date ret = otherPointer.getRent().getReturnDate();

                //adding rent to list
                addRent(name, car, pick, ret);

                // set up the pointer
                otherPointer = otherPointer.getNext();
            }//while
    }

    /**
     * Returns a string with all the list,
     * if list empty return: The company has 0 rents.
     * @return - the list
     */
    public String toString()
    {
        // initialize string for the list
        String s = "The company has " + getNumOfRents() + " rents:\n";

        // checks if list is empty
        if(isNull(_head))
            s = ("The company has 0 rents.");
        else
        {
            // initialize pointer to the head of the list
            RentNode pointer = this._head;

            //loop for the whole list
            while(pointer != null)
            {
                // saving the rent data, and set up the pointer
                s += pointer.getRent().toString() +"\n";
                pointer = pointer.getNext();
            }//while
        } //else

        return s;
    }
}



















