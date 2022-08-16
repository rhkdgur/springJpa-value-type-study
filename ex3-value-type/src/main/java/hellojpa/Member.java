package hellojpa;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany; 
@Entity
public class Member{
	
	@Id
	@GeneratedValue
	@Column(name="MEMBER_ID")
	private Long id;
	
	private String name;
	
	@Embedded
	private Period period;
	
	@Embedded
	private Address address;
	
	//���� Address�� Ÿ���� ��ü�� ���̺� ���ο� �÷����� ������ ���
//	@Embedded
//	@AttributeOverrides({
//		@AttributeOverride(name="city",column=@Column(name="WORK_CITY")),
//		@AttributeOverride(name="street",column=@Column(name="WORK_STREET")),
//		@AttributeOverride(name="zipcode",column=@Column(name="WORK_ZIPCODE"))
//	})
//	private Address workAddress;
	
	@OneToMany(mappedBy = "member")
	private List<Order> orderList = new ArrayList<Order>();
	
	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

//	public Address getWorkAddress() {
//		return workAddress;
//	}
//
//	public void setWorkAddress(Address workAddress) {
//		this.workAddress = workAddress;
//	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
