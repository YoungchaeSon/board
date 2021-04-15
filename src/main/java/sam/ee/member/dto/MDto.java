package sam.ee.member.dto;

public class MDto {

	String mId;
	String mPassword; 
	String mName;
	String mEmail;
	int mZipNo;
	String mAddr1;
	String mAddr2;
	String mIdentity;
	int mYear;
	int mMonth;
	int mDate;
	String mInterest ;
	String mIntroduce ;
	
	public MDto() {}
	
	public MDto(String mId, String mPassword, String mName, String mEmail, int mZipNo, String mAddr1, String mAddr2,
			String mIdentity, int mYear, int mMonth, int mDate, String mInterest, String mIntroduce) {
		super();
		this.mId = mId;
		this.mPassword = mPassword;
		this.mName = mName;
		this.mEmail = mEmail;
		this.mZipNo = mZipNo;
		this.mAddr1 = mAddr1;
		this.mAddr2 = mAddr2;
		this.mIdentity = mIdentity;
		this.mYear = mYear;
		this.mMonth = mMonth;
		this.mDate = mDate;
		this.mInterest = mInterest;
		this.mIntroduce = mIntroduce;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getmPassword() {
		return mPassword;
	}
	public void setmPassword(String mPassword) {
		this.mPassword = mPassword;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmEmail() {
		return mEmail;
	}
	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}
	public int getmZipNo() {
		return mZipNo;
	}
	public void setmZipNo(int mZipNo) {
		this.mZipNo = mZipNo;
	}
	public String getmAddr1() {
		return mAddr1;
	}
	public void setmAddr1(String mAddr1) {
		this.mAddr1 = mAddr1;
	}
	public String getmAddr2() {
		return mAddr2;
	}
	public void setmAddr2(String mAddr2) {
		this.mAddr2 = mAddr2;
	}
	public String getmIdentity() {
		return mIdentity;
	}
	public void setmIdentity(String mIdentity) {
		this.mIdentity = mIdentity;
	}
	public int getmYear() {
		return mYear;
	}
	public void setmYear(int mYear) {
		this.mYear = mYear;
	}
	public int getmMonth() {
		return mMonth;
	}
	public void setmMonth(int mMonth) {
		this.mMonth = mMonth;
	}
	public int getmDate() {
		return mDate;
	}
	public void setmDate(int mDate) {
		this.mDate = mDate;
	}
	public String getmInterest() {
		return mInterest;
	}
	public void setmInterest(String mInterest) {
		this.mInterest = mInterest;
	}
	public String getmIntroduce() {
		return mIntroduce;
	}
	public void setmIntroduce(String mIntroduce) {
		this.mIntroduce = mIntroduce;
	}
	
	
}
