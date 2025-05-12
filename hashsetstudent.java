import java.util.*;
public class hashsetstudent{
    public static void main(String[] args) {
        HashSet<Integer> gradeA=new HashSet<>();
        gradeA.add(3);
        gradeA.add(7);
        gradeA.add(14);
        gradeA.add(17);
        gradeA.add(22);
        gradeA.add(23);
        System.out.println("The roll no of student having A grade"+gradeA);
        HashSet<Integer> conference=new HashSet<>();
        conference.add(3);
        conference.add(7);
        conference.add(9);
        conference.add(2);
        conference.add(43);
        conference.add(22);
        System.out.println("The students selected for international conference"+conference);
        HashSet<Integer> both=new HashSet<>();
        for (var roll : gradeA) {
            if(conference.contains(roll))
            both.add(roll);
        }
        System.out.println("The roll no of students who have A  grade in math and selected for international conference"+both);
    }
}