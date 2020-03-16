package assignment10;

public abstract class Tickets {
	protected int ticketNumber;
	private static int nextTicketNumber = 1;
	double ticketPrice = 50.00;
	protected static int daysBeforeEvent;

	public abstract int getTicketNumber(int ticketNumber);

	{
		ticketNumber = nextTicketNumber;
		nextTicketNumber++;

	}

	abstract public double getTicketPrice(double ticketPrice);

	{
		this.setTicketPrice(ticketPrice);
	}

	static int getDaysBeforeEvent(int daysBeforeEvent) {
		return daysBeforeEvent;
	}

	public String toString() {
		return "Ticket number: " + ticketNumber + ", Price: $" + getTicketPrice();
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

}
