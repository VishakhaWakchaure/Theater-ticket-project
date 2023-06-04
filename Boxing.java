package DesignBlue;
import java.util.Scanner;
public class Boxing {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
Theater theatre=new Theater("INXO",500);
boolean flag=true;
while(flag) {
	System.out.println("Enter 1.Availibility Status "+"2.Book your ticket"+"3.Show booking details"+"4.Cancel ticket"+"5.Thankyou");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:
	{
		theatre.checkAvailability();
	}break;
	case 2:{
		System.out.println("Enter the number of seats");
		int seats=sc.nextInt();
		System.out.println("Enter the moive name");
		String moive=sc.next();
		theatre.setTicket(new Ticket(moive,seats));
		theatre.bookTicket();
	   }break;
	case 3:{
		theatre.showTicketDetails();
	}break;
	case 4:{
		System.out.println("Enter the number");
		int cancel=sc.nextInt();
		theatre.cancelTicket(cancel);
	}break;
	case 5:{
		System.out.println("Thank You");
		flag=false;
	}break;
	default:{
		System.out.println("Wrong input");
	}
	}
}


}
}
