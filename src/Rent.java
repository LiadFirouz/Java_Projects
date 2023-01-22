//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Rent {
    private String _name;
    private Car _car;
    private Date _pickDate;
    private Date _returnDate;
    private final int PRICE_A = 100;
    private final int PRICE_B = 150;
    private final int PRICE_C = 180;
    private final int PRICE_D = 240;
    private final int WEEK = 7;
    private final double DISCOUNT = 0.9;

    public Rent(String name, Car car, Date pick, Date ret) {
        this._name = name;
        this._car = new Car(car);
        this._pickDate = new Date(pick);
        this._returnDate = ret.after(pick) ? new Date(ret) : pick.tomorrow();
    }

    public Rent(Rent other) {
        this._name = other._name;
        this._car = new Car(other._car);
        this._pickDate = new Date(other._pickDate);
        this._returnDate = new Date(other._returnDate);
    }

    public String getName() {
        return this._name;
    }

    public Car getCar() {
        return new Car(this._car);
    }

    public Date getPickDate() {
        return new Date(this._pickDate);
    }

    public Date getReturnDate() {
        return new Date(this._returnDate);
    }

    public void setName(String name) {
        this._name = name;
    }

    public void setCar(Car car) {
        this._car = new Car(car);
    }

    public void setPickDate(Date pick) {
        if (pick.before(this._returnDate)) {
            this._pickDate = new Date(pick);
        }

    }

    public void setReturnDate(Date ret) {
        if (ret.after(this._pickDate)) {
            this._returnDate = new Date(ret);
        }

    }

    public boolean equals(Rent other) {
        return this._name.equals(other._name) && this._pickDate.equals(other._pickDate) && this._returnDate.equals(other._returnDate) && this._car.equals(other._car);
    }

    public int howManyDays() {
        return this._returnDate.difference(this._pickDate);
    }

    public int getPrice() {
        short price;
        switch (this._car.getType()) {
            case 'A':
                price = 100;
                break;
            case 'B':
                price = 150;
                break;
            case 'C':
                price = 180;
                break;
            default:
                price = 240;
        }

        int days = this.howManyDays();
        return (int)(((double)(days / 7 * 7) * 0.9 + (double)(days % 7)) * (double)price);
    }

    public int upgrade(Car newCar) {
        if (!newCar.better(this._car)) {
            return 0;
        } else {
            int old = this.getPrice();
            this._car = new Car(newCar);
            return this.getPrice() - old;
        }
    }

    public String toString() {
        return "Name:" + this._name + " From:" + this._pickDate + " To:" + this._returnDate + " Type:" + this._car.getType() + " Days:" + this.howManyDays() + " Price:" + this.getPrice();
    }

    public Rent overlap(Rent other) {
        if (this._name.equals(other._name) && this._car.equals(other._car)) {
            Date start = this._pickDate.before(other._pickDate) ? this._pickDate : other._pickDate;
            Date end = this._returnDate.after(other._returnDate) ? this._returnDate : other._returnDate;
            return start.difference(end) <= this.howManyDays() + other.howManyDays() ? new Rent(this._name, new Car(this._car), new Date(start), new Date(end)) : null;
        } else {
            return null;
        }
    }
}
