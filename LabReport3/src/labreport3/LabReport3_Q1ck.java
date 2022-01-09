package labreport3;

public class LabReport3_Q1ck {

    public static void main(String[] args) {
        Money m1 = new Money(81350);
        m1.display();
        Money m2 = new Money(18212);
        m2.display();
        Money m3 = new Money();
        m3.display();
        // not sure whether the int array work like this
        int[] amounts = {32534,633264};
        Money m4 = new Money(amounts);
        m4.display();
        // not sure how is the add method work
        Money.add(m3);
    }
    
}
