package BusTicketBookingApp;

public class Bus {

	private String busNo;
	private int capacity;
	private boolean ac;

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bus(String busNo, int capacity, boolean ac) {
		super();
		this.busNo = busNo;
		this.capacity = capacity;
		this.ac = ac;
	}

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", capacity=" + capacity + ", ac=" + ac + "]";
	}

}
