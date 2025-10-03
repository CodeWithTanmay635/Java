public class StudentGradeManage {
    public static void main(String[] args) {
        int[] grades = {56, 56, 78, 89, 67, 78, 98};
        String[] subjects = {"Java", "Operating System", "Software Engineering", "Startup Management", "Statistics", "Oracle", "C++"};
        System.out.println("====== Student Grades ======");
        System.out.println("Total Subjects :" + grades.length);
        System.out.println("====== Grades By Subjects ======");
        for (int i = 0; i < grades.length; i++) {
            System.out.println(subjects[i] + " : " + grades[i]);
        }
        System.out.println("====== New Student Record ======");
        int[] newGrades = new int[5];
        String[] newSubjects = {"AI", "ML", "Calculus", "Python", "Cloud"};
        newGrades[0] = 98;
        newGrades[1] = 78;
        newGrades[2] = 88;
        newGrades[3] = 76;
        newGrades[4] = 94;
        int index = 0;
        for (int grade : newGrades) {
            System.out.println(newSubjects[index] + " : " + grade);
            index++;
        }
        int max = grades[0];
        int min = grades[0];
        int total = 0;
        for (int grade : grades) {
            if (grade > max) max = grade;
            if (grade < min) min = grade;
            total += grade;

        }
        double average = (double) total / grades.length;

        System.out.println("====== Statics Of The Grades ====== ");
        System.out.println("Highest grade : " + max);
        System.out.println("lowest grade : " + min);
        System.out.println("Average Of The All Grades :" + String.format("%.2f", average));

        System.out.println("====== Array Properties ======");
        System.out.println("Length Of the Array : "+grades.length);
        System.out.println("First Element Of The Array : "+ grades[0]);
        System.out.println("Last Element Of The Array (index : "+ (grades.length - 1)+") : "+ grades [grades.length-1]);
        try {
            System.out.println("Trying To access Index : "+grades.length +" : "+  grades[grades.length]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error :"+ e.getMessage());

        }
    }
}