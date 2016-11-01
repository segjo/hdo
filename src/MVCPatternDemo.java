import controller.StudentController;
import model.Student;
import view.StudentView;

public class MVCPatternDemo {
   public static void main(String[] args) {

      //fetch student record based on his roll no from the database
      Student model  = retriveStudentFromDatabase();

      //Create a view : to write student details on console
      StudentView view = new StudentView();

      StudentController controller = new StudentController(model, view);

      controller.updateView();

      //update model data
      controller.setStudentName("Denis");
      controller.updateView();
      controller.setStudentName("Daniel");
      controller.updateView();
      controller.setStudentName("Adrian");
      controller.updateView();
   }

   private static Student retriveStudentFromDatabase(){
      Student student = new Student();
      student.setName("Jonas");
      student.setRollNo("10");
      return student;
   }
}