package caseStudy;

import java.util.Scanner;

class RequestedTicket {
	void request() {
		Scanner rt = new Scanner(System.in);
		System.out.println("Check Available Tickets");
		int avalibility = rt.nextInt();
		if (avalibility == 1) {
			System.out.println("First Class Available");
			System.out.println("Enter your Name");
			String pname = rt.next();
			System.out.println("Enter your Phone Number");
			double pno = rt.nextDouble();
			System.out.println("Your ticket is Requested");
		} else if (avalibility == 2) {
			System.out.println("Not Available");
		}
	}
}

class ConformedTicket extends RequestedTicket {
	static int seatno;
	static double Phonenumber;
	static String name;

	void conformed() {
		Scanner ct = new Scanner(System.in);
		ConformedTicket bc = new ConformedTicket();
		System.out.println("Check Available Tickets");
		int avalibility = ct.nextInt();
		if (avalibility == 1) {
			System.out.println("Enter your Name");
			String pname = ct.next();
			name = pname;
			System.out.println("Enter your Phone Number");
			double pno = ct.nextDouble();
			Phonenumber = pno;
			System.out.println("Available seat numbers are 20" + "\n" + "Enter your Desired Seat Number");
			int sno = ct.nextInt();
			if (sno >= 1 && sno <= 20) {
				seatno = sno;
				System.out.println("Your ticket is Conformed");
				System.out.println(KaveriTravels.sdestination + "\n" + KaveriTravels.stime + "\n" + KaveriTravels.sdate
						+ "\n" + ConformedTicket.seatno);
				System.out.println(ConformedTicket.name + "\n" + ConformedTicket.Phonenumber);
			} else {
				System.out.println("Not applicable");
			}
		} else if (avalibility == 2) {
			System.out.println("Tickets not Available" + "\n" + "Waiting list");
			bc.request();// calling request method
		}
	}
}

public class KaveriTravels extends ConformedTicket {
	static int destination, date, time;
	static String sdestination, stime, sdate;

	public static void main(String[] args) {
		Scanner bt = new Scanner(System.in);
		KaveriTravels ab = new KaveriTravels();
		System.out.println("Welcome to KaveriTravels" + "\n" + "Avalible Busses" + "\n" + "1.Hyderabad" + "\n"
				+ "2.Nizamabad" + "\n" + "Give your Destination Choice");
		destination = bt.nextInt();
		if (destination == 1) {
			sdestination = "Hyderabad";
			System.out.println("Dates of Bus");
			System.out.println("1.7/sep/2015" + "\n" + "2.12/sep/2015" + "\n" + "3.14/sep/2015");
// System.out.println("Enter j");
			date = bt.nextInt();
			if (date == 1) {
				sdate = "Sep 7 2015";
				System.out.println("Sep 7 2015" + "\n" + "Timings of Bus" + "\n" + "1.9Am" + "\n" + "2.12Am" + "\n"
						+ "Give your Desired Time");
				time = bt.nextInt();
				if (time == 1) {
					stime = "9Am";
					System.out.println("Bus No:500" + "\n" + "Reserve Tickets");
					ab.conformed();
				} else if (time == 2) {
					stime = "2.12Am";
					System.out.println("Bus No:501" + "\n" + "Reserve Tickets");
					ab.conformed();
				} else {
					System.out.println("Stop");
				}
			} else if (date == 2) {
				sdate = "12/sep/2015";
				System.out.println("Sep 12 2015" + "\n" + "Timings of Bus" + "\n" + "5Am" + "\n" + "11AM" + "\n"
						+ "Give your Desired Time");
				time = bt.nextInt();
				if (time == 1) {
					stime = "5Am";
					System.out.println("Bus No:600" + "\n" + "Reserve Tickets");
					ab.conformed();
				} else if (time == 2) {
					stime = "11AM";
					System.out.println("Bus No:601" + "\n" + "Reserve Tickets");
					ab.conformed();
				} else {
					System.out.println("Stop");
				}
			}
		} else if (destination == 2) {
			sdestination = "Nizamabad";
			System.out.println("Busses Not Avaliable");
		}
	}
}
