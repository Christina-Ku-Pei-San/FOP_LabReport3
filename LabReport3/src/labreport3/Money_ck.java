package labreport3;

import java.util.Random;

public class Money_ck {
    private int amount;
    private int[] amounts;
    private static int totalAmount;
    static final int[] notesCents = {10000, 5000, 2000, 1000, 500, 100, 50, 20, 10, 5, 1};
    private int[] amount_notesCents = new int[notesCents.length];
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
        System.out.printf("Total amounts of all Money objects = %dcents (RM%.2f)\n", object.getTotalAmount(), object.getTotalAmount()/100.0);
    }
    
    public String toString() {
        if (amounts == null) {
            // int parameter
            int tmp = amount;
            for (int i = 0; i < notesCents.length; i++) {
                int cnt = tmp / notesCents[i];
                tmp -= notesCents[i] * cnt;
                amount_notesCents[i] = cnt;
            }
            System.out.printf("Amount = %dcents (RM%.2f)\n", amount, (double)amount/100);
            for (int i = 0; i < amount_notesCents.length; i++) {
                if (i <= 5) {
                    System.out.printf("RM%d\t\tquantity=\t%d\n", notesCents[i]/100, amount_notesCents[i]);
                }
                else
                    System.out.printf("%dcents\t\tquantity=\t%d\n", notesCents[i], amount_notesCents[i]);
            }
        }
        else {
            // int array parameter
            // not sure whether the int array work like this
            for (int i = 0; i < amounts.length; i++) {
                int temp = amounts[i];
                for (int j = 0; j < notesCents.length; j++) {
                    int cnt = temp / notesCents[j];
                    temp -= notesCents[j] * cnt;
                    amount_notesCents[j] = cnt;
                }
                System.out.printf("Amount = %dcents (RM%.2f)\n", amounts[i], (double)amounts[i]/100);
                for (int j = 0; j < amount_notesCents.length; j++) {
                    if (j <= 5) {
                        System.out.printf("RM%d\t\tquantity=\t%d\n", notesCents[j]/100, amount_notesCents[j]);
                    }
                    else
                        System.out.printf("%dcents\t\tquantity=\t%d\n", notesCents[j], amount_notesCents[j]);
                }
                if (i < amounts.length-1)
                    System.out.println("");
            }
        }
        return "";
    }
}
