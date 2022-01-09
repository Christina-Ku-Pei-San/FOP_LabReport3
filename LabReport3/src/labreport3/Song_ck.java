package labreport3;

public class Song_ck {
    private static String[][] info = new String[20][5];
    private String title, filename, singer, duration, year;
    private static int cnt = 0, cur = 0;

    public Song_ck(String title, String filename, String singer, String duration, String year) {
        info[cnt][0] = title;
        info[cnt][1] = filename;
        info[cnt][2] = singer;
        info[cnt][3] = duration;
        info[cnt][4] = year;
        cnt++;
    }
    
    public static void sortTitle() {
        for (int i = 0; i < cnt-1; i++) {
            for (int j = 0; j < cnt-1; j++) {
                if (info[j][0].compareTo(info[j+1][0]) > 0) {
                    String[] temp = info[j];
                    info[j] = info[j+1];
                    info[j+1] = temp;
                }
            }
        }
    }
    
    public static void sortDuration() {
        for (int i = 0; i < cnt-1; i++) {
            for (int j = 0; j < cnt-1; j++) {
                if (info[j][3].compareTo(info[j+1][3]) > 0) {
                    String[] temp = info[j];
                    info[j] = info[j+1];
                    info[j+1] = temp;
                }
            }
        }
    }
    
    public static void searchTitle(String title) {
        for (int i = 0; i < cnt; i++) {
            if (info[i][0].equals(title)) {
                System.out.println("Title\t\t: " + info[i][0]);
                System.out.println("Filename\t: " + info[i][1]);
                System.out.println("Singer\t\t: " + info[i][2]);
                System.out.println("Duration\t: " + info[i][3]);
                System.out.println("Year\t\t: " + info[i][4]);
                System.out.println("");
            }
        }
    }
    
    public static void searchSinger(String singer) {
        for (int i = 0; i < cnt; i++) {
            if (info[i][2].equals(singer)) {
                System.out.println("Title\t\t: " + info[i][0]);
                System.out.println("Filename\t: " + info[i][1]);
                System.out.println("Singer\t\t: " + info[i][2]);
                System.out.println("Duration\t: " + info[i][3]);
                System.out.println("Year\t\t: " + info[i][4]);
                System.out.println("");
            }
        }
    }
    
    public void play() {
        title = info[cur][0];
        filename = info[cur][1];
        singer = info[cur][2];
        duration = info[cur][3];
        year = info[cur][4];
    }
    
    public static void next() {
        if (cur == cnt-1)
            cur = 0;
        else 
            cur++;
    }
    
    public static void previous() {
        if (cur == 0)
            cur = cnt-1;
        else 
            cur--;
    }

    public String toString() {
        play();
        return "Title\t\t: " + title +
                "\nFilename\t: " + filename +
                "\nSinger\t\t: " + singer +
                "\nDuration\t: " + duration +
                "\nYear\t\t: " + year + "\n";   
    }
}
