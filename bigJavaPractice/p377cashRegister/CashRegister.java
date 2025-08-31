//package p377cashRegister;
/*
 * 1 Class name
 * 2 Private member variables
 * 3 Constructor
 * 4 public member functions 💥 getters and setters
 */

// 1 Class name
public class CashRegister {

    // 2 Private member variables
    private int itemCount;
    private double totalPrice;

    // 3 Default constructor we really dont need this because the book put 0 for the
    // constructor, I just did it for my purpose
    // public CashRegister() {
    // }

    // 3.1 constructor
    public CashRegister() {
        itemCount = 0;
        totalPrice = 0;
    }

    /*
     * adds an item to the cash register
     * 
     * @return the totalamont
     */
    // 4 getters
    public double getTotal() {
        return totalPrice;
    }

    public int getItemCount() {
        return itemCount;
    }

    // 4.1 setters
    // so its coming back. void is used for not returning things but settings to 0,
    // using ++, -- etc
    public void addItem(double price) {
        itemCount++;
        totalPrice += price;
    }

    // clears all values, like, it resets
    public void clear() {
        itemCount = 0;
        totalPrice = 0;
    }
}
