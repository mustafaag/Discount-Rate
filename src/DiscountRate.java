
public class DiscountRate {
	public static double serviceDiscountPremium= 0.2;
	public static double serviceDiscountGold= 0.15;
	public static double serviceDiscountSilver= 0.1;

	public static double productDiscount = 0.1;

	public static double getServiceDiscountRate(String memberType) {
		switch (memberType)  {
			case "Premium": 
				return  serviceDiscountPremium;
			case "Gold":
				return serviceDiscountGold;
			case"Silver":
				return serviceDiscountSilver;
			default:
				throw new IllegalStateException("Unexpected value: " + memberType);
		}
	}

	public static double getProductDiscount(boolean isMember){
		if(isMember ){
			return  productDiscount;
		}
		return 0;
	}
}
