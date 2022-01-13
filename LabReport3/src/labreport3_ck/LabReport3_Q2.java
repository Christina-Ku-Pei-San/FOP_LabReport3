package labreport3_ck;

public class LabReport3_Q2 {
    
    public static void main(String[] args) {
        Song s1 = new Song("title1", "a.mp4", "singer1", 3.27, 2013);
        Song s2 = new Song("title2", "b.mp4", "singer2", 3.00, 2014);
        Song s3 = new Song("title3", "c.mp4", "singer1", 3.32, 2016);
        
//        Song.sortTitle();
//        Song.sortDuration();

        Song.searchTitle("title2");
        Song.searchSinger("singer1");
        
        System.out.println(s1.toString());
        
        Song.previous();
        System.out.println(s1.toString());
        
        Song.next();
        System.out.println(s1.toString());
        
        Song.next();
        System.out.println(s1.toString());
        
        Song.next();
        System.out.println(s1.toString());
        
        Song.next();
        System.out.println(s3.toString());
    }
}
