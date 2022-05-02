package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Booking implements Payment {

	private Property bookedProperty;
	private User bookedUser;
	private LocalDate startingDate;
	private LocalDate finishingDate;
	private double payment;

	public Booking(Property bookedProperty, User bookedUser, int startingDay, int startingMonth, int startingYear,
			int finishingDay, int finishingMonth, int finishingYear) {
		super();
		this.bookedProperty = bookedProperty;
		this.bookedUser = bookedUser;
		this.startingDate = LocalDate.of(startingYear, startingMonth, startingDay);
		this.finishingDate = LocalDate.of(finishingYear, finishingMonth, finishingDay);
		this.payment = calculatePayment(bookedProperty, bookedUser) * calculateBookingDays(startingDate, finishingDate);
	}

	@Override
	public double calculatePayment(Property property, User user) {

		double nightValue = 0;

		if (property instanceof House) {

			nightValue += houseM2Value * property.getArea() + houseRoomValue * property.getRooms();

		} else if (property instanceof Apartment) {

			nightValue += apartmentM2Value * property.getArea() + apartmentRoomValue * property.getRooms();

		}

		if (user instanceof PremiumUser) {

			PremiumUser temp = (PremiumUser) user;

			nightValue *= (1 - temp.getDiscount().percentage);

		}

		return nightValue;
	}

	public double calculateBookingDays(LocalDate startingDate, LocalDate finishingDate) {

		return ChronoUnit.DAYS.between(startingDate, finishingDate);

	}

	@Override
	public String toString() {
		return "Booking summary:\n\n" + bookedUser.toString() + "\n\n" + bookedProperty.toString()
				+ "\n\nStarting Date: " + startingDate.toString() + "\nFinishing Date: " + finishingDate.toString()
				+ "\nTotal days: " + calculateBookingDays(startingDate, finishingDate) + "\n\nTotal to pay: " + payment;
	}

	public Property getBookedProperty() {
		return bookedProperty;
	}

	public void setBookedProperty(Property bookedProperty) {
		this.bookedProperty = bookedProperty;
	}

	public User getBookedUser() {
		return bookedUser;
	}

	public void setBookedUser(User bookedUser) {
		this.bookedUser = bookedUser;
	}

	public LocalDate getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(LocalDate startingDate) {
		this.startingDate = startingDate;
	}

	public LocalDate getFinishingDate() {
		return finishingDate;
	}

	public void setFinishingDate(LocalDate finishingDate) {
		this.finishingDate = finishingDate;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

}
