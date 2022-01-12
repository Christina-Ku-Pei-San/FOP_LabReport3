package labreport3_ld;

import java.util.ArrayList;
import java.util.Arrays;

public class Song {
    private String[] title, filename, singer;
    private int[] year, duration;
    private int position;

    public Song(){
        title=new String[20];
        filename=new String[20];
        singer=new String[20];
        year=new int[20];
        duration=new int[20];
    }

    public Song(String[] title, String[] filename, String[] singer, int[] duration, int[] year){
        this.title=title;
        this.filename=filename;
        this.singer=singer;
        this.duration=duration;
        this.year=year;
        position=0;
    }

    public String[] getTitle() {return title;}
    public String[] getFilename() {return filename;}
    public String[] getSinger() {return singer;}
    public int[] getYear() {return year;}
    public int[] getDuration() {return duration;}
    public int getPosition() {return position;}

    public void setTitle(String[] title) {this.title = title;}
    public void setFilename(String[] filename) {this.filename = filename;}
    public void setSinger(String[] singer) {this.singer = singer;}
    public void setYear(int[] year) {this.year = year;}
    public void setDuration(int[] duration) {this.duration = duration;}
    public void setPosition(int position) {this.position = position;}

    public void titleSort(){
        for(int i=0; i<title.length;i++){
            for(int j=0; j<title.length-1;j++){
                if(title[j].compareToIgnoreCase(title[j+1])>0) {
                    String temp_title=title[j];
                    title[j]=title[j+1];
                    title[j+1]=temp_title;
                    String temp_fileName=filename[j];
                    filename[j]=filename[j+1];
                    filename[j+1]=temp_fileName;
                    String temp_singer=singer[j];
                    singer[j]=singer[j+1];
                    singer[j+1]=temp_singer;
                    int temp_duration=duration[j];
                    duration[j]=duration[j+1];
                    duration[j+1]=temp_duration;
                    int temp_year=year[j];
                    year[j]=year[j+1];
                    year[j+1]=temp_year;
                }
            }
        }
    }

    public void durationSort(){
        for (int i = 0; i < duration.length; i++) {
            for (int j = 0; j < duration.length-1; j++) {
                if (duration[j]>duration[j+1]) {
                    String temp_title=title[j];
                    title[j]=title[j+1];
                    title[j+1]=temp_title;
                    String temp_fileName=filename[j];
                    filename[j]=filename[j+1];
                    filename[j+1]=temp_fileName;
                    String temp_singer=singer[j];
                    singer[j]=singer[j+1];
                    singer[j+1]=temp_singer;
                    int temp_duration=duration[j];
                    duration[j]=duration[j+1];
                    duration[j+1]=temp_duration;
                    int temp_year=year[j];
                    year[j]=year[j+1];
                    year[j+1]=temp_year;
                }
            }
        }
    }

    public int titleSearch(String x) {
        int n = title.length;
        // Traverse array arr[]
        for (int i = 0; i < n; i++) {
            // If element found then
            // return that index
            if (title[i].equalsIgnoreCase(x)){
                position=i;
                return i;
            }
        }
        return -1;
    }

    public int singerSearch(String x) {
        int n = singer.length;
        int found=-1;
        // Traverse array arr[]
        for (int i = 0; i < n; i++) {
            // If element found then
            // return that index
            if (singer[i].equalsIgnoreCase(x)){
                position=i;
                System.out.println("\n"+toString());
            }
            else found++;
        }
        return found;
    }

    public void play(){
        System.out.println(toString());
    }

    public int next(){
        int n = title.length;
        if (position==(n-1)) position=0;
        else position++;
        return position;
    }

    public int previous(){
        int n = title.length;
        if (position==0) position=n-1;
        else position--;
        return position;
    }

    @Override
    public String toString() {
        return "Song No."+ (position+1) +
                "\nTitle:" + title[position] +
                "\nFilename:" + filename[position] +
                "\nSinger:" + singer[position] +
                "\nDuration:" + duration[position]+
                "\nYear:" + year[position];
    }
}
