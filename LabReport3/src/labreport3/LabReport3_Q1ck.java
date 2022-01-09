package labreport3;

public class LabReport3_Q1ck {

    public static void main(String[] args) {
        Money_ck m1 = new Money_ck(81350);
        m1.display();
        Money_ck m2 = new Money_ck(18212);
        m2.display();
        Money_ck m3 = new Money_ck();
        m3.display();
        // not sure whether the int array work like this
        int[] amounts = {32534,633264};
        Money_ck m4 = new Money_ck(amounts);
        m4.display();
        // not sure how is the add method work
        Money_ck.add(m3);
    }
    
}
