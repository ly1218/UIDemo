package JavaPractise;

@SxtTable("woshivalue")
public class LurayStudent {
    @SxFiled(columnName = "id",type ="varchar",length = 10)
    private String student;
    @SxFiled(columnName = "age",type ="int",length = 10)
    private int age;

    @SxFiled(columnName = "id",type ="int",length = 3)
    private int id;

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
