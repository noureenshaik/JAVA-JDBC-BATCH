package PracticeStudent;
import java.util.Scanner;
import PracticeStudent.StudentClient;
import PracticeStudent.StudentDaoImpl;
import PracticeStudent.Student;
public class StudentDetails {
	Scanner sc = new Scanner(System.in);

	StudentDaoImpl daoImpl = new StudentDaoImpl();

	public void stuMenu()

	{
		while (true) {
			System.out.println("*************************************************");

			System.out.println("           1)AddStudent                          ");
			System.out.println("           2)ViewAllStudent                          ");
			System.out.println("           3)ViewStudent                          ");
			System.out.println("           4)deleteStudent                          ");
			System.out.println("           5)UpdateStudent                                         ");
			System.out.println("           6)Back                          ");

			System.out.println("*************************************************");

			System.out.println("Enter The Choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				daoImpl.addStudents();
				break;
			case 2:
				Student[] viewAllStudents = daoImpl.viewAllStudents();

				System.out.println("*************************************************");
				System.out.println("SNO \t SNAME \t SADD");
				System.out.println("*************************************************");
				if (viewAllStudents != null) {
					for (Student stu : viewAllStudents) {
						if (stu != null)
							System.out.println(stu.getSno() + "\t" + stu.getSname() + "\t" + stu.getSadd());
					}
				} // end of if
				else
					System.out.println("Records Not found");
				break;
			case 3:
				System.out.println("Enter Student Number");
				Student stu = daoImpl.viewStudent(sc.nextInt());
				System.out.println("*************************************************");
				System.out.println("SNO \t SNAME \t SADD");
				System.out.println("*************************************************");

				if (stu != null)
					System.out.println(stu.getSno() + "\t" + stu.getSname() + "\t" + stu.getSadd());
				else
					System.out.println("Given Record Not Found");
				break;
			case 4:
				System.out.println("Enter Student Number");
				daoImpl.delete(sc.nextInt());
				break;
			case 5:
				System.out.println("Enter Student Number");
daoImpl.update(sc.nextInt());
break;
				
			case 6:
				
				StudentClient.main(null);
				break;

			default:
				System.out.println("Choose 1 to 4 Between");

			}// end of switch

		} // end of while
	}
}
