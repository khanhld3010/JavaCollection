package ComparableAndComparator;

public class Student implements Comparable<Student> {
    private String name;
    private Integer age;
    private String adress;
    private Integer score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(String name, Integer age, String adress, int score) {
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, Integer age, String adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.score =0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }
}
