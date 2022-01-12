package labreport3;

public class LabReport3_Q1ck {

    public static void main(String[] args) {
        Money_ck m1 = new Money_ck(81350);
        System.out.println(m1.toString());
        
        Money_ck m2 = new Money_ck(18212);
        System.out.println(m2.toString());
        
        Money_ck m3 = new Money_ck();
        System.out.println(m3.toString());
        
        int[] amounts = {32534,633264};
        Money_ck m4 = new Money_ck(amounts);
        System.out.println(m4.toString());
        
        // not sure how is the add method work
        Money_ck.add(m3);
    }
    
}
