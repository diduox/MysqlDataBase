package homework;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("001", "王向晚", false, "2011-11-11");
        System.out.println(student.toString());
    }
}

class Student{
    String id;
    String name;
    boolean isMale;
    String birth;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String id, String name, boolean isMale, String birth) {
        this.id = id;
        this.name = name;
        this.isMale = isMale;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", isMale=" + isMale +
                ", birth='" + birth + '\'' +
                '}';
    }

}
