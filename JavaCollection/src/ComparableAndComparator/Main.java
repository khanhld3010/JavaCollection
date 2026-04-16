package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT", 70);
        Student student1 = new Student("Nam", 26, "HN", 30);
        Student student2 = new Student("Anh", 38, "HT", 90);
        Student student3 = new Student("Tung", 38, "HT", 50);
        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student st : lists) {
            System.out.println(st);
        }
        System.out.println("-----------------------------------------");
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sánh theo tuổi");
        for (Student st : lists) {
            System.out.println(st);
        }
        System.out.println("-----------------------------------------");
        Collections.sort(lists, ((o1, o2) -> {
            if (o1.getScore() > o2.getScore()) {
                return 1;
            } else if (o1.getScore() == o2.getScore()) {
                return 0;
            } else {
                return -1;
            }
        }));
        System.out.println("So sánh theo điểm");
        for (Student st : lists) {
            System.out.println(st);
        }
        System.out.println("-----------------------------------------");
        Collections.sort(lists, Comparator.comparing(Student::getName).reversed());
        System.out.println("So sánh theo điểm giảm dần");
        for (Student st : lists) {
            System.out.println(st);
        }
    }
}
