package labreport3;

public class LabReport3_Q2ck {
    
    public static void main(String[] args) {
        Song_ck s1 = new Song_ck("title1", "a.mp4", "singer1", 3.27, 2013);
        Song_ck s2 = new Song_ck("title2", "b.mp4", "singer2", 3.00, 2014);
        Song_ck s3 = new Song_ck("title3", "c.mp4", "singer1", 3.32, 2016);
        
//        Song_ck.sortTitle();
//        Song_ck.sortDuration();

        Song_ck.searchTitle("title2");
        Song_ck.searchSinger("singer1");
        
        System.out.println(s1.toString());
        
        Song_ck.previous();
        System.out.println(s1.toString());
        
        Song_ck.next();
        System.out.println(s1.toString());
        
        Song_ck.next();
        System.out.println(s1.toString());
        
        Song_ck.next();
        System.out.println(s1.toString());
        
        Song_ck.next();
        System.out.println(s3.toString());
    }
}
