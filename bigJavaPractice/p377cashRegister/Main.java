//package p377cashRegister;

//important when having more than one file , you have to use javac on all of them one by one or all at once
/*
 * When you’re in the same folder and you’ve got no package lines (or you commented them out), you gotta compile both files together, like:
 * javac Main.java CashRegister.java
 *      or  javac *.java
*/
public class Main {
    public static void main(String[] args) {
        CashRegister cashRegister1 = new CashRegister();
        // System.out.print(cashRegister1.getTotal());

        cashRegister1.addItem(9.99);
        System.out.println(cashRegister1.getTotal());
        System.out.println(cashRegister1.getItemCount());

        cashRegister1.addItem(24.79);
        cashRegister1.addItem(56.01);
        System.out.println(cashRegister1.getTotal());
        System.out.println(cashRegister1.getItemCount());

    }
}
