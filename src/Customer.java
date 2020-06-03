import java.util.List;

public class Customer {
	private String name;
	private boolean member;
	private String memberType;
	private List<Visit> visitList;

	Customer(String clientName) {
		this.name = clientName;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean isMember() {
		return this.member;
	}
	
	public void setMember(boolean m) {
		this.member = m;
	}
	
	public String getMemberType() {
		return this.memberType;
	}
	
	public void setMemberType(String mt) {
		this.memberType = mt;
	}

	@Override
	public String toString() {
		return 	"Customer{" +
				"Name='" + name + '\'' +
				", Member=" + member +
				", MemberType='" + memberType + '\'' +
				'}';
	}
}
