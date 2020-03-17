package assignment10;

public class WalkupTickets extends Tickets {

	@Override
	public int getTicketNumber(int ticketNumber) {
		return ticketNumber;
	}

	@Override
	public double getTicketPrice(double ticketPrice) {
		return ticketPrice;
	}

	public String toString() {
		return "Walkup Ticket -> Ticket #" + ticketNumber + ", Price: $" + getTicketPrice();
	}

}
