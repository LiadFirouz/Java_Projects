/**
 * This class represents a RentNode object
 * @version 28-01-22
 * @author Liad Firouz
 */
public class RentNode
{
    // the rented object
    private Rent _rent;
    // the pointer to next rent
    private RentNode _next;

    /**
     * Creates a new RentNode object
     * setting the RentNode rent into the rent from the client,
     * setting the next pointer to null.
     * @param r - the client's rent object
     */
    public RentNode (Rent r)
    {
        // setting the rent to the new rent object
        this._rent = new Rent(r);
        // setting the pointer to null
        this._next = null;
    }

    /**
     * Copy constructor
     * @param r - the rent to be copied
     * @param next - the list to be linked to
     */
    public RentNode (Rent r, RentNode next)
    {
        // setting the rent to the new rent object
        this._rent = new Rent(r);
        // setting the pointer to the next rent object
        this._next = next;
    }

    /**
     * Copy constructor
     * @param other - the RentNode object to be copied
     */
    public RentNode (RentNode other)
    {
        // copying the rent object from the other object
        this._rent = new Rent(other._rent);
        // copying the pointer to the next rent object from the other object
        this._next = other._next;
    }

    /**
     * Gets the return date
     * @return the rent
     */
    public Rent getRent()
    {
        // returns current rent object
        return new Rent(this._rent);
    }

    /**
     * Gets the return next
     * @return the next
     */
    public RentNode getNext()
    {
        // returns current pointer
        return this._next;
    }

    /**
     * Sets the rent
     * @param r - the rent object
     */
    public void setRent(Rent r)
    {
        // setting the rent to the new rent object
        this._rent = new Rent(r);
    }

    /**
     * Sets the next
     * @param next - the next object
     */
    public void setNext(RentNode next)
    {
        // setting the pointer to the next rent object
        this._next = next;
    }
}
