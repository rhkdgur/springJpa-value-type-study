package hellojpa;


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id; 
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
	
	//같은 Address의 타입의 객체를 테이블에 새로운 컬럼으로 선언할 경우
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="city",column=@Column(name="WORK_CITY")),
		@AttributeOverride(name="street",column=@Column(name="WORK_STREET")),
		@AttributeOverride(name="zipcode",column=@Column(name="WORK_ZIPCODE"))
	})
	private Address workAddress;
	
	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

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
