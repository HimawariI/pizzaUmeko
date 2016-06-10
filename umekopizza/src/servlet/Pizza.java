package servlet;

import javax.jdo.annotations.*;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Pizza {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	@Persistent
	private String userName;
	@Persistent
	private int pizza1;
	@Persistent
	private int pizza2;
	@Persistent
	private int pizza3;
	@Persistent
	private int pizza4;
	@Persistent
	private int pizza5;
	@Persistent
	private int pizza6;
	@Persistent
	private int sum;

	public Pizza(String userName, int pizza1, int pizza2, int pizza3, int pizza4, int pizza5, int pizza6, int sum) {
		super();
		this.userName = userName;
		this.pizza1 = pizza1;
		this.pizza2 = pizza2;
		this.pizza3 = pizza3;
		this.pizza4 = pizza4;
		this.pizza5 = pizza5;
		this.pizza6 = pizza6;
		this.sum = sum;
	}
	public Pizza(){
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPizza1() {
		return pizza1;
	}

	public int getPizza2() {
		return pizza2;
	}

	public int getPizza3() {
		return pizza3;
	}

	public int getPizza4() {
		return pizza4;
	}

	public int getPizza5() {
		return pizza5;
	}

	public int getPizza6() {
		return pizza6;
	}

	public int getSum() {
		return sum;
	}

	public void setPizza1(int pizza1) {
		this.pizza1 = pizza1;
	}

	public void setPizza2(int pizza2) {
		this.pizza2 = pizza2;
	}

	public void setPizza3(int pizza3) {
		this.pizza3 = pizza3;
	}

	public void setPizza4(int pizza4) {
		this.pizza4 = pizza4;
	}

	public void setPizza5(int pizza5) {
		this.pizza5 = pizza5;
	}

	public void setPizza6(int pizza6) {
		this.pizza6 = pizza6;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
}
