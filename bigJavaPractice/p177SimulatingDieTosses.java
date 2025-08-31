public class p177SimulatingDieTosses {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            // math.random computes 0.0 to <1.0. ex 0.56274665792642
            // important, the (int) conversion is NOT only for the Math.random()
            // say Math.rando() was
            // Math.random(0.988) * 6 = 5.988 +1
            // now we have (int)(5.988) = 5 💥remember integer doesnt round. it just removes
            // the decimals
            // then you have the plus 1 = 6
            // so the +1 is important bacause withiut it, we go to 5.9999 max. the dices
            // goes from 1 to 6
            double d1 = (int) (Math.random() * 6 + 1);// curiousity
            int d2 = (int) (Math.random() * 6) + 1;
            System.out.println("dice 1: " + d1 + "\ndice 2: " + d2);
        }
    }
}
   