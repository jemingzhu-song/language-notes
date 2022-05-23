package DesignPatterns;
/*
    Notes:
    1.  Model-View-Controller (MVC) Pattern is used to separate an application's concerns:
            Model:      represents an object or Java POJO carrying data. It can also have logic to
                        update a controller if its data changes.
            View:       represents the visualisation of the data that model contains
            Controller: acts on both the Model and View. It controlls the data flow into the Model
                        object and updates the View whenver data changes. It keeps the Model and View
                        separate.
*/

public class MVC_Pattern {
    
}

/* ------------------------------ Implementation ------------------------------ */
/*
    We will create (practically, this will be done in separate files)
        - "Student" object - acting as a Model
        - "StudentView" object - acting as a View (which can print Student details on console)
        - "StudentController" object - controller class responsible to store data in the "Student"
                                       object and update view "StudentView" accordingly.
*/

// 1. Model - Student.java
class Student {
    private String rollNo;
    private String name;
    
    public String getRollNo() {
       return rollNo;
    }
    
    public void setRollNo(String rollNo) {
       this.rollNo = rollNo;
    }
    
    public String getName() {
       return name;
    }
    
    public void setName(String name) {
       this.name = name;
    }
}

// 2. View - StudentView.java
class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
       System.out.println("Student: ");
       System.out.println("Name: " + studentName);
       System.out.println("Roll No: " + studentRollNo);
    }
}

// 3. Controller
class StudentController {
    private Student model;
    private StudentView view;
 
    public StudentController(Student model, StudentView view){
       this.model = model;
       this.view = view;
    }
 
    public void setStudentName(String name){
       model.setName(name);		
    }
 
    public String getStudentName(){
       return model.getName();		
    }
 
    public void setStudentRollNo(String rollNo){
       model.setRollNo(rollNo);		
    }
 
    public String getStudentRollNo(){
       return model.getRollNo();		
    }
 
    public void updateView(){				
       view.printStudentDetails(model.getName(), model.getRollNo());
    }	
}

// 4. Demostration of MVC Pattern
class MVCPatternDemo {
    public static void main(String[] args) {
 
       //fetch student record based on his roll no from the database
       Student model  = retriveStudentFromDatabase();
 
       //Create a view : to write student details on console
       StudentView view = new StudentView();
 
       StudentController controller = new StudentController(model, view);
 
       controller.updateView();
 
       //update model data
       controller.setStudentName("John");
 
       controller.updateView();
    }
 
    private static Student retriveStudentFromDatabase(){
       Student student = new Student();
       student.setName("Robert");
       student.setRollNo("10");
       return student;
    }
}