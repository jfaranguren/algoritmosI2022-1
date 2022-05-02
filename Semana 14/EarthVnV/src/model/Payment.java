package model;

public interface Payment {

	final double houseM2Value = 100;
	final double houseRoomValue = 50000;

	final double apartmentM2Value = 80;
	final double apartmentRoomValue = 30000;

	public double calculatePayment(Property property, User user);

}
