package assignment10;

public class AdvanceTickets extends Tickets {

	@Override
	public int getTicketNumber(int ticketNumber) {
		// TODO Auto-generated method stub
		return ticketNumber;
	}

	@Override
	public double getTicketPrice(double ticketPrice) {
		// TODO Auto-generated method stub
		return ticketPrice;
	}

	public AdvanceTickets(int daysBeforeEvent) {
		super();
		this.daysBeforeEvent = daysBeforeEvent;
		if (daysBeforeEvent >= 10) {
			setTicketPrice(getTicketPrice() - 20.00);
		} else if (daysBeforeEvent < 10 || daysBeforeEvent > 0) {
			setTicketPrice(getTicketPrice() - 10.00);
		}
	}

	public String toString() {
		return "Advance Ticket Category Ticket number: " + ticketNumber + ", Price: $" + super.getTicketPrice();
	}

}
