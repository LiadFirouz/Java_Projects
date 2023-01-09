/**
 * This class represents a Rent object
 * @version 03-12-22
 * @author Liad Firouz
 */
public class Rent
{
    // 10% discount
    private static final double DISCOUNT_PER_WEEK = 0.9;
    // week in days
    private static final int WEEK = 7;

    // car rent price by type
    private static final int TYPE_A_PRICE = 100;
    private static final int TYPE_B_PRICE = 150;
    private static final int TYPE_C_PRICE = 180;
    private static final int TYPE_D_PRICE = 240;

    private String _name;
    private Car _car;
    private Date _pickDate;
    private Date _returnDate;

    /**
     * Creates a new Rent object
     * The return date must be at least one day after the pickup date,
     * otherwise set it to one day after the pickup date.
     *
     * @param name - the client's name
     * @param car - the rented car
     * @param pick - the pickup date
     * @param ret - the return date
     */
    public Rent (String name, Car car, Date pick, Date ret)
    {
        _name = name;
        _car = new Car(car);

        if (pick.before(ret))
        {
            _pickDate = new Date(pick);
            _returnDate = new Date(ret);
        }//if

        else
        {
            _pickDate = new Date(pick);
            _returnDate = new Date(pick.tomorrow());
        }//else
    }

    /**
     * Copy constructor
     * @param other - the rent to be copied
     */
    public Rent(Rent other)
    {
        _name = other._name;
        _car = new Car(other._car);
        _pickDate = new Date(other._pickDate);
        _returnDate = new Date(other._returnDate);
    }

    /**
     * Gets the car
     * @return the car
     */
    public Car getCar()
    {
        return new Car(_car);
    }

    /**
     * Gets the name
     * @return the name
     */
    public String getName()
    {
        return _name;
    }

    /**
     * Gets the pickup date
     * @return the pickup date
     */
    public Date getPickDate()
    {
        return new Date(_pickDate);
    }

    /**
     * Gets the return date
     * @return the return date
     */
    public Date getReturnDate()
    {
        return new Date(_returnDate);
    }

    /**
     * Sets the rented car
     * @param car - the rented car (You can assume that car is not null)
     */
    public void setCar(Car car)
    {
        _car = new Car(car);
    }

    /**
     * Sets the client name
     * @param name - the client name (You can assume that the name is a valid name)
     */
    public void setName(String name)
    {
        _name = name;
    }

    /**
     * Sets the pickup date
     * The pickup date must be at least one day before the return date, otherwise - don't change the pickup date
     * @param pickDate - the pickup date (You can assume that pick up date is not null)
     */
    public void setPickDate(Date pickDate)
    {
        if(pickDate.before(_returnDate))
            _pickDate = new Date(pickDate);
    }

    /**
     * Sets the return date
     * The return date must be at least one day after the pickup date, otherwise - don't change the return date
     * @param returnDate - the return date (You can assume that return date is not null)
     */
    public void setReturnDate(Date returnDate)
    {
        if(returnDate.after(_pickDate))
            _returnDate = new Date(returnDate);
    }

    /**
     * Check if 2 rents are the same
     * @param other - the rent to compare this rent to
     * @return true if the rents are the same
     */
    public boolean equals(Rent other)
    {
        return _name.equals(other._name) && _pickDate.equals(other._pickDate)
                && _returnDate.equals(other._returnDate) && _car.equals(other._car);
    }

    /**
     * Returns the number of rent days
     * @return the number of rent days
     */
    public int howManyDays()
    {
        return _pickDate.difference(_returnDate);
    }

    /**
     * Returns the rent total price
     * @return the rent total price
     */
    public int getPrice()
    {
        int rentalDays = howManyDays();
        int weeksAmount = rentalDays / WEEK;
        int daysAmount = rentalDays % WEEK;

        char type = _car.getType();
        int price = TYPE_A_PRICE;

        if (type == 'B')
            price = TYPE_B_PRICE;
        if (type == 'C')
            price = TYPE_C_PRICE;
        if (type == 'D')
            price = TYPE_D_PRICE;

        return (int) ((daysAmount * price) + (weeksAmount * WEEK * price  * DISCOUNT_PER_WEEK));
    }

    /**
     * Try to upgrade the car to a better car
     * If the given car is better than the current car of the rent,
     * upgrade it and return the upgrade additional cost, otherwise - don't upgrade
     *
     * @param newCar - the car to upgrade to
     * @return the upgrade cost
     */
    public int upgrade(Car newCar)
    {
        if(newCar.better(_car))
        {
            int originalPrice = getPrice();
            _car = new Car(newCar);
            return getPrice() - originalPrice;
        }//if

        return 0;
    }

    /**
     * Check if there is a double listing of a rent for the same person and car with an overlap in the rental days
     * If there is - return a new rent object with the unified dates, otherwise - return null.
     *
     * @param other - the other rent
     * @return the unified rent or null
     */
    public Rent overlap(Rent other)
    {
        if(_name.equals(other._name) && _car.equals(other._car))
        {
            if(_pickDate.equals(other._returnDate ) || (_pickDate.after(other._pickDate) && _returnDate.before(other._returnDate)) ||
                    _returnDate.equals(other._pickDate) || (_returnDate.after(other._pickDate) && _pickDate.before(other._returnDate)))
            {
                Date unitedPickDate = new Date(_pickDate);
                if(_pickDate.after(other._pickDate))
                    unitedPickDate = new Date(other._pickDate);

                Date unitedReturnDate = new Date(other._returnDate);
                if(_returnDate.after(other._returnDate))
                    unitedReturnDate = new Date(_returnDate);

                return new Rent(_name, new Car(_car), unitedPickDate, unitedReturnDate);
            }//if
        }//if

        return null;
    }

    /**
     * Returns a String that represents this rent
     * @return String that represents this rent in the following format:
     * Name:Rama From:30/10/2022 To:12/11/2022 Type:B Days:13 Price:1845
     */
    public String toString()
    {
        return "Name:" + _name + " From:" + _pickDate + " To:" + _returnDate +
                " Type:" + _car.getType() + " Days:" + _returnDate.difference(_pickDate) + " Price:" + getPrice();
    }

}//Rent class
