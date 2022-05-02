package model;

import java.util.Date;

public class PremiumUser extends User {

	private Date subscriptionDate;
	private Discount discount;

	public PremiumUser(String name, String lastname, String id, String email, String phone, int day, int month,
			int year) {
		super(name, lastname, id, email, phone);
		this.subscriptionDate = new Date(day, month, year);
		this.discount = Discount.PREMIUM;
	}

	public Date getSubscriptionDate() {
		return subscriptionDate;
	}

	public void setSubscriptionDate(Date subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

}
