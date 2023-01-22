
public class Car {
    private final char TYPE_A = 'A';
    private final char TYPE_B = 'B';
    private final char TYPE_C = 'C';
    private final char TYPE_D = 'D';
    private final int MAX_ID = 9999999;
    private final int MIN_ID = 1000000;
    private final char DEFAULT_TYPE = 'A';
    private int _id;
    private char _type;
    private String _brand;
    private boolean _isManual;

    public Car(int id, char type, String brand, boolean isManual) {
        this._id = id >= 1000000 && id <= 9999999 ? id : 9999999;
        this._type = type >= 'A' && type <= 'D' ? type : 65;
        this._brand = brand;
        this._isManual = isManual;
    }

    public Car(Car other) {
        this._id = other._id;
        this._type = other._type;
        this._brand = other._brand;
        this._isManual = other._isManual;
    }

    public int getId() {
        return this._id;
    }

    public char getType() {
        return this._type;
    }

    public String getBrand() {
        return this._brand;
    }

    public boolean isManual() {
        return this._isManual;
    }

    public void setId(int id) {
        if (id >= 1000000 && id <= 9999999) {
            this._id = id;
        }

    }

    public void setType(char type) {
        if (type >= 'A' && type <= 'D') {
            this._type = type;
        }

    }

    public void setBrand(String brand) {
        this._brand = brand;
    }

    public void setIsManual(boolean manual) {
        this._isManual = manual;
    }

    public String toString() {
        return "id:" + this._id + " type:" + this._type + " brand:" + this._brand + " gear:" + (this._isManual ? "manual" : "auto");
    }

    public boolean equals(Car other) {
        return this._type == other._type && this._brand.equals(other._brand) && this._isManual == other._isManual;
    }

    public boolean better(Car other) {
        return this._type > other._type || this._type == other._type && !this._isManual && other._isManual;
    }

    public boolean worse(Car other) {
        return other.better(this);
    }
}
