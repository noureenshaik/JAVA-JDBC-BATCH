package abstraction;

import java.util.Scanner;

/*class NotSelectedExdeption extends RuntimeException{//creating user defined exception NotSelectedExdeption(String s){
super(s); }
}*/
abstract class Recruitment {
	abstract void procedure();
}

class ExternalRp extends Recruitment {
	Scanner erp = new Scanner(System.in);
	static String submissionstatus, shortlistedstatus;
	int submission, passed;

void procedure(){
System.out.println("Submit your Personal and Professional Information for Desired Position "); 
System.out.println("Submission Status"+"\n"+"1.Submitted"+"\n"+"2.Not Submitted");
submission=erp.nextInt(); 
if(submission==1){submissionstatus="Submitted";
System.out.println("Submitted"); 
System.out.println("Shortlisted?"); 
passed=erp.nextInt(); 
if(passed==1){
shortlistedstatus="Shortlisted"; 
//System.out.println("You are Shortlisted for interview"); 
System.out.println("Results of interview are recorded");
System.out.println(RecruitmentProcess.RecruitmentProcess+"\n"+ExternalRp.submissionstatus+"\n"+ExternalRp.shortlistedstatus);
} 
else {
	try {
		System.out.println(10/0);
		} catch (Exception e) { 
			System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("Better luck next time");
		}
	//throw new NotSelectedExdeption("You are not Shortlisted");
}
}else if(submission==2){submissionstatus="Not Submitted";
System.out.println("Not Submitted");
		System.out.println(RecruitmentProcess.RecruitmentProcess+"\n"+ExternalRp.submissionstatus); }
		} 
		}

class EmployeeRp extends Recruitment {
	Scanner emrp = new Scanner(System.in);
	int submission;
	static String submittedstatus;

	void procedure() {
		System.out.println("Submit your Personal and Professional Information for Given Position");
		System.out.println("Submission Status" + "\n" + "1.Submitted" + "\n" + "2.Not Submitted");
		submission = emrp.nextInt();
		if (submission == 1) {
			submittedstatus = "Submitted";
			System.out.println("Submitted");
			System.out.println("Interview");
			System.out.println(RecruitmentProcess.RecruitmentProcess + "\n" + EmployeeRp.submittedstatus);
		} else if (submission == 2) {
			submittedstatus = "Submitted";
			System.out.println("Not Submitted");
		}
	}
}

public class RecruitmentProcess { static String RecruitmentProcess;
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Recruitment Process"+"\n"+"1.ExternalRp"+"\n"+"2.EmployeeRp"); int Process = sc.nextInt();
if (Process== 1) {
Recruitment rp = new ExternalRp(); RecruitmentProcess="External RecruitmentProcess "; rp.procedure();
} else if (Process == 2) {//here inheritence is used we can say that as same object is used to call all the sub classes
Recruitment rp = new EmployeeRp(); RecruitmentProcess="Employee Rreferal Process"; rp.procedure();

} 
}
}