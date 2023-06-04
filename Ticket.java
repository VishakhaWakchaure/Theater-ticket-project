package DesignBlue;

public class Ticket {
private String movie_name;
private int no_of_ticket;

public Ticket(String movie_name,int no_of_ticket) {
	this.movie_name=movie_name;
	this.no_of_ticket=no_of_ticket;
}

public String getMovie_name() {
	return movie_name;
}

public void setMovie_name(String movie_name) {
	this.movie_name = movie_name;
}

public int getNo_of_ticket() {
	return no_of_ticket;
}

public void setNo_of_ticket(int no_of_ticket) {
	this.no_of_ticket = no_of_ticket;
}
public void printTicketDetails() {
	System.out.println("===================Ticket===================");
	System.out.println(movie_name);
	System.out.println(no_of_ticket);
}
}
