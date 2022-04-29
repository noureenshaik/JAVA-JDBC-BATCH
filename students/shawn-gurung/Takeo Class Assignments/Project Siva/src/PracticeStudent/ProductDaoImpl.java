package PracticeStudent;
import java.util.Scanner;
import PracticeStudent.Student;
public class StudentDaoImpl {
	Scanner sc = new Scanner(System.in);

	static Student student[] = null;

	public void addStudents() {

		System.out.println("How Many Students Are Joining ?");
		int size = sc.nextInt();// 3
		student = new Student[size];

		for (int i = 0; i < size; ++i) {
			System.out.println("Enter Student Number ");
			int sno = sc.nextInt();
			System.out.println("Enter Student Name ");
			String sname = sc.next();
			System.out.println("Enter Student Address");
			String sadd = sc.next();

			Student stu = new Student(sno, sname, sadd);
			student[i] = stu;
			System.out.println("Student Record Added Success Fully");

		} // end of for loop

	}// end of addStudents();

	public Student[] viewAllStudents() {

		return student;
	}// end of viewAll Students

	public Student viewStudent(int sno) {
		if (student != null) {
			for (Student stu : student) {

				if (stu.getSno() == sno) {
					return stu;
				}
			}
		}
		return null;
	}// end of viewStudent

	public void delete(int sno) {

		int j = 0;
		int k = 0;
		if (student != null) {
			for (Student stu : student) {

				if (stu.getSno() == sno) {

					student[k] = null;
					System.out.println("Record is deleted SuccessFully");
					++j;
					break;
				}
				++k;
			}

		} else {
			System.out.println("Records not exist");
		}
		if (j == 0)
			System.out.println("Given Record Not Found");

	}// end of delete Method

	public void update(int sno) {

		int j = 0;
		if (student != null) {
			for (Student stu : student) {
				if (stu.getSno() == sno) {
					++j;
					System.out.println("Do You Want to update 1)Student Name 2)StudentAddress");
					System.out.println("Enter The Choice");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						System.out.println("Enter Student Name");
						String name = sc.next();
						stu.setSname(name);// updating a name
						System.out.println("Student Name updated SuccessFully");
						break;
					case 2:
						System.out.println("Enter Student Address");
						String sadd = sc.next();
						stu.setSadd(sadd);
						System.out.println("Student Address is updated SuccessFully");
						break;
					default:
						System.out.println("Choose 1 to 2 between ");
					}// end of switch

				} // end of if

			}

		} // end of if
		else {
			System.out.println("Records are Not Exisit");
		}

		if (j == 0)
			System.out.println("Given Record Not Found");

	}// end of update

}
