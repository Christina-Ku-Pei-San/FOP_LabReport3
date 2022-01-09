package labreport3;

import java.util.Random;

public class Money_ck {
    private int amount = 0;
    private int[] amounts = null;
    private static int totalAmount;
    static final int[] notes = {10000, 5000, 2000, 1000, 500, 100};
    static final int[] cents = {50, 20, 10, 5, 1};
    private int[] amount_notes = new int[notes.length];
    private int[] amount_cents = new int[cents.length];
    Random r = new Random();

    public Money_ck() {
        amount = r.nextInt(99001)+1000;
        totalAmount += amount;
    }

    public Money_ck(int amount) {
        this.amount = amount;
        totalAmount += amount;
    }

    public Money_ck(int[] amounts) {
        this.amounts = amounts;
        for (int i = 0; i < amounts.length; i++) {
            totalAmount += amounts[i];
        }
    }

    public int getAmount() {
        return amount;
    }

    public int[] getAmounts() {
        return amounts;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setAmounts(int[] amounts) {
        this.amounts = amounts;
    }
    
    public static void add(Money_ck object) {
        System.out.println("Total amounts of all Money objects = " + object.getTotalAmount());
    }
    
    // maybe can divide into calc and toString methods, not sure how to write toString
    public void display() {
        if (amounts == null) {
            // int parameter
            int tmp = amount;
            for (int i = 0; i < notes.length; i++) {
                int cnt = tmp / notes[i];
                tmp -= notes[i] * cnt;
                amount_notes[i] = cnt;
            }
            for (int i = 0; i < cents.length; i++) {
                int cnt = tmp / cents[i];
                tmp -= cents[i] * cnt;
                amount_cents[i] = cnt;
            }
            System.out.printf("Amount = %dcents (RM%.2f)\n", this.amount, (double)this.amount/100);
            for (int i = 0; i < amount_notes.length; i++) {
                System.out.printf("RM%d\t\tquantity=\t%d\n", notes[i]/100, amount_notes[i]);
            }
            for (int i = 0; i < amount_cents.length; i++) {
                System.out.printf("%dcents\t\tquantity=\t%d\n", cents[i], amount_cents[i]);
            }
            System.out.println("");
        }
        else {
            // int array parameter
            for (int i = 0; i < amounts.length; i++) {
                int temp = amounts[i];
                for (int j = 0; j < notes.length; j++) {
                    int cnt = temp / notes[j];
                    temp -= notes[j] * cnt;
                    amount_notes[j] = cnt;
                }
                for (int j = 0; j < cents.length; j++) {
                    int cnt = temp / cents[j];
                    temp -= cents[j] * cnt;
                    amount_cents[j] = cnt;
                }
                System.out.printf("Amount = %dcents (RM%.2f)\n", this.amounts[i], (double)this.amounts[i]/100);
                for (int j = 0; j < amount_notes.length; j++) {
                    System.out.printf("RM%d\t\tquantity=\t%d\n", notes[j]/100, amount_notes[j]);
                }
                for (int j = 0; j < amount_cents.length; j++) {
                    System.out.printf("%dcents\t\tquantity=\t%d\n", cents[j], amount_cents[j]);
                }
                System.out.println("");
            }
        }
    }
}
