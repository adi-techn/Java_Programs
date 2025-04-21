
public class constructors{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Aditya";
        s1.roll=441;
        s1.password="@ditya";
        s1.marks=new int[3];
        s1.marks[0]= 100;
        s1.marks[1]= 90;
        s1.marks[2]= 80;

        Student s2=new Student(s1);
        s2.password="adity@";
        s1.marks[2]=70;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    //Shallow copy constructor
    // Student(Student s1){       //Copy constructor
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     this.marks=s1.marks;
    // }

    //Deep copy constructor
    Student(Student s1){       
        this.name=s1.name;
        this.roll=s1.roll;
        marks =new int[3];
        for(int i=0;i<3;i++){
            this.marks[i]=s1.marks[i];
        }
    }
    
    Student(){           //Non-Parameterized constructor
        System.out.println("Constructor is called...");
    }

    Student(String name){   //Parameterized constructor
        this.name=name;
    }
}