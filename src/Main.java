import java.util.Date;

public class Main {

     public static void main(String[] args){
        Customer newCust = new Customer("Customer 1");
        Customer newCust1 = new Customer("Customer 2");
        newCust.setMember(true);
        newCust1.setMember(true);
        newCust.setMemberType("Premium");
        System.out.println(newCust.toString());
        System.out.println(newCust1.toString());

        Visit newVisit = new Visit(newCust, new Date());
        System.out.println(newVisit.toString());

        newVisit.setProductExpense(4.5);
        newVisit.setServiceExpense(8.5);
        newVisit.setProductExpense(1.5);
        System.out.println(newVisit.toString());
        System.out.println("Total expense made by " + newVisit.getName() + " = " + newVisit.getTotalExpense());
    }

}

