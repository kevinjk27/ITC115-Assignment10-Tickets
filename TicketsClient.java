package assignment10;

public class TicketsClient {

	public static void main(String[] args) {
		WalkupTickets ticket1 = new WalkupTickets();
		WalkupTickets ticket2 = new WalkupTickets();
		StudentAdvanceTickets ticket3 = new StudentAdvanceTickets(2);
		AdvanceTickets ticket4 = new AdvanceTickets(5);
		StudentAdvanceTickets ticket5 = new StudentAdvanceTickets(5);
		System.out.println(ticket1.toString());
		System.out.println(ticket2.toString());
		System.out.println(ticket3.toString());
		System.out.println(ticket4.toString());
		System.out.println(ticket5.toString());
		

	}

}
