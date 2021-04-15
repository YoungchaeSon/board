package sam.ee.member;

import java.util.ArrayList;
import java.util.List;

public class MemberBean {
	private String name, password, id, email;
	private String zipNo, addr1,addr2;
	private String identity;
	private int bYear,bMonth,bDate;
	private String[] interest;
	private String introduce;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getZipNo() {
		return zipNo;
	}
	public void setZipNo(String zipNo) {
		this.zipNo = zipNo;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public int getbYear() {
		return bYear;
	}
	public void setbYear(int bYear) {
		this.bYear = bYear;
	}
	public int getbMonth() {
		return bMonth;
	}
	public void setbMonth(int bMonth) {
		this.bMonth = bMonth;
	}
	public int getbDate() {
		return bDate;
	}
	public void setbDate(int bDate) {
		this.bDate = bDate;
	}
	public String[] getInterest() {
		return interest;
	}
	public void setInterest(String[] interest) {
		this.interest = interest;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	
	
	
}
