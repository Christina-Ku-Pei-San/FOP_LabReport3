package labreport3_ck;

public class LabReport3_Q1 {

    public static void main(String[] args) {
        Money m1 = new Money(81350);
        System.out.println(m1.toString());
        
        Money m2 = new Money(18212);
        System.out.println(m2.toString());
        
        Money m3 = new Money();
        System.out.println(m3.toString());
        
        int[] amounts = {32534,633264};
        Money m4 = new Money(amounts);
        System.out.println(m4.toString());
        
        // not sure how is the add method work
        Money.add(m3);
    }
    
}
