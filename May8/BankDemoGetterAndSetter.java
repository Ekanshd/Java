package com.may8;
class SBI{
	private String bankAddress;
	private String bankEmail;
	public String getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	public String getBankEmail() {
		return bankEmail;
	}
	public void setBankEmail(String bankEmail) {
		this.bankEmail = bankEmail;
	}
}
public class BankDemoGetterAndSetter {

	public static void main(String[] args) {
		SBI s1=new SBI();
		s1.setBankAddress("Thane");

		s1.setBankEmail("sbi@gmail.com");
System.out.println("Bank address:"+s1.getBankAddress()+"\nBank Email:"+s1.getBankEmail());
	}

}
