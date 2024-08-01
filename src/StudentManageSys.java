public class StudentManageSys {
    /*Create a class Student with the following fields: studentId, name, age, and
grade.
● Include methods to set and get the values of these fields.
● Write a method to display the details of the student.
● In the Main class, create multiple Student objects, set their details, and display
them*/
    int studentId;
    String name;
    int age;
    char grade;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
    public  void method(){
        System.out.println(getName());
        System.out.println(getStudentId());
        System.out.println(getAge());
        System.out.println(getGrade());

    }

    public static void main(String[] args) {
        StudentManageSys st = new StudentManageSys();
        st.setName("Harsha");
        st.setAge(9);
        st.setStudentId(6009);
        st.setGrade('A');
        st.method();

    }

}
