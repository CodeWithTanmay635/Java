public class Cons {
    public static void main(String[] args){
    Emp e1 = new Emp();
    e1.age=26;
    e1.name="Rock";
    e1.salary=235.56;
    e1.display();
    S stud = new S(18, "Tanmay", 8.65);
    stud.display();
    }
}
class Emp{
    int age;
    String name;
    double salary;
    void display() {
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary :"+salary);
    }
}
class S
{
    int age;
    String name;
    double cgpa;
    S(int a, String n, double c)
    {
        age = a;
        name = n;
        cgpa = c;
    }
    void display()
    {
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("CGPA"+cgpa);
    }
    }

