import java.util.Date;

public class Visit {
	Customer customer;
	Date date;
	double serviceExpense;
	double productExpense;
	
	Visit(Customer customer, Date d ){
		this.customer = customer;
		this.date = d;
	}
	
	String getName() {
		return this.customer.getName();
	}
	
	double getServiceExpense() {
		return this.serviceExpense;
	}
	
	double getProductExpense() {
		return this.productExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = this.serviceExpense + serviceExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = this.productExpense + productExpense;
	}

		//It shall compute the total bill if a customer purchases $x of products and $y of services, for a visit.
	double getTotalExpense() {
		String memberType = this.customer.getMemberType();
		double serviceDiscount = DiscountRate.getServiceDiscountRate(memberType);
		double productDiscount = DiscountRate.getProductDiscount(customer.isMember());

		return  ( this.serviceExpense - (this.serviceExpense * serviceDiscount)) + (this.productExpense- (this.productExpense * productDiscount));
	}


	@Override
	public String toString() {
		return "Visit{" +
				"Customer Name=" + customer.getName() +
				", Is member=" + customer.isMember() +
				", Member Type=" + customer.getMemberType() +
				", Date=" + date +
				", Service Expense=" + serviceExpense +
				", Product Expense=" + productExpense +
				'}';
	}

}
