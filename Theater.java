package DesignBlue;

public class Theater {
private String theater_name;
private int seating_capacity;
private Ticket ticket;

public Theater(String theater_name,int seating_capacity) {
	this.theater_name=theater_name;
	this.seating_capacity=seating_capacity;
}

public String getTheater_name() {
	return theater_name;
}

public void setTheater_name(String theater_name) {
	this.theater_name = theater_name;
}

public int getSeating_capacity() {
	return seating_capacity;
}

public void setSeating_capacity(int seating_capacity) {
	this.seating_capacity = seating_capacity;
}

public Ticket getTicket() {
	return ticket;
}

public void setTicket(Ticket ticket) {
	this.ticket = ticket;
}
//funcanality
//my book ticke
public void bookTicket() {
	if(ticket.getNo_of_ticket()!=0&& ticket.getNo_of_ticket()<=seating_capacity) {
		seating_capacity=seating_capacity-ticket.getNo_of_ticket();
		System.out.println("Your Booking of"+
				  ticket.getNo_of_ticket()+" has been booked");
				}else {
					System.out.println("Booking not successfull");
				}
	}
//
//check availability

public void checkAvailability() {
	System.out.println(seating_capacity);
}
//cancel
public void cancelTicket(int cancel_tickets) {
	if(cancel_tickets!=0&& cancel_tickets<=ticket.getNo_of_ticket()) {
		seating_capacity=seating_capacity+cancel_tickets;
		ticket.setNo_of_ticket(ticket.getNo_of_ticket()-cancel_tickets);
		
		System.out.println("Tickets cancelled");
	}else {
		System.out.println("Technical issue..");
	}
}

public void showTicketDetails() {
	System.out.println("Your Ticket Details are as follows");
	System.out.println(ticket.getMovie_name());
	System.out.println(ticket.getNo_of_ticket());
}

}
