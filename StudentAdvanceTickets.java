package assignment10;

public class StudentAdvanceTickets extends AdvanceTickets {

	public StudentAdvanceTickets(int daysBeforeEvent) {
		super(daysBeforeEvent);
		this.daysBeforeEvent = daysBeforeEvent;
		if (daysBeforeEvent >= 10) {
			setTicketPrice((getTicketPrice() / 2.0));
		} else if (daysBeforeEvent < 10 || daysBeforeEvent > 0) {
			setTicketPrice((getTicketPrice() / 2.0));
		}
	}

	public String toString() {
		return "Student Advance Ticket -> Ticket #" + ticketNumber + ", Price: $" + super.getTicketPrice() + " ID required!";
	}
}
