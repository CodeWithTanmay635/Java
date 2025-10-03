public class Constructor {
    public static void main(String[] args) {
        // Creating an instance of the Constructor class
        Student stud = new Student(132 , "Rocks");
        stud.display();
        Teacher te = new Teacher(21323, "VVP");
        te.display();
    }
}
class Student {
    int rno;
    String name;
    Student(int r, String n){
        rno = r;
        name = n;
    }
    void display()
    {
        System.out.println("Student Name :"+name);
        System.out.println("Student Id :"+rno);
    }

}
class Teacher{
    int ID;
    String name;
    Teacher(int i, String n){
        ID = i;
        name = n;
    }
    void display(){
        System.out.println("Teacher Id:"+ID);
        System.out.println("Teacher Name:"+name);
    }
}