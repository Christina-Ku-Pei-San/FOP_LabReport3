package labreport3_ld;

import java.util.Scanner;

public class Labreport3_Q2ld {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] title={"Shivers","My Head & My Heart","Cold Heart","Bad Habits","abc"};
        String[] filename={"Shivers.mp3","My Head & My Heart.mp3","Cold Heart.mp3","Bad Habits.mp3","abc.mp3"};
        String[] singer={"Ed Sheeran","Ava Max","Elton John & Dua Lipa","Ed Sheeran","Gayle"};
        int[] duration={207,179,183,189,182};
        int[] year={2020,2019,2018,2021,2021};

        Song s=new Song(title, filename, singer, duration, year);
        s.titleSort();
        System.out.println("Title Sorting");
        for(int i=0; i< title.length; i++){
            System.out.println(s.toString()+"\n");
            s.next();
        }
        s.durationSort();
        System.out.println("Duration Sorting");
        for(int i=0; i<title.length; i++){
            System.out.println(s.toString()+"\n");
            s.next();
        }
        s.setPosition(0);
        System.out.println("Current Song");
        s.play();
        System.out.println("\nPrevious Song");
        s.previous();
        System.out.println(s.toString());
        System.out.println("\nNext Song");
        s.next();
        System.out.println(s.toString());

        System.out.print("\nSearch with title: ");
        if(s.titleSearch(sc.nextLine())!=-1)
            System.out.println("\n"+s.toString());
        else System.out.println("NOT FOUND!");

        System.out.print("\nSearch with singer: ");
        if(s.singerSearch(sc.nextLine())== singer.length)
            System.out.println("NOT FOUND!");
    }
}