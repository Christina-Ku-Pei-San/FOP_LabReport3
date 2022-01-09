package labreport3;

public class LabReport3_Q2ck {
    
    public static void main(String[] args) {
        Song_ck s1 = new Song_ck("GHI", "GHI.mp4", "Ben", "3:27", "2013");
        Song_ck s2 = new Song_ck("ABC", "ABC.mp4", "Aaron", "3:00", "2014");
        Song_ck s3 = new Song_ck("DEF", "DEF.mp4", "Ben", "3:32", "2016");
        
//        Song_ck.sortTitle();
//        Song_ck.sortDuration();

        Song_ck.searchTitle("DEF");
        Song_ck.searchSinger("Ben");
        
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
