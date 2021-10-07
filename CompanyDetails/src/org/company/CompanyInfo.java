package org.company;

public class CompanyInfo {

	public void companyName() {
		System.out.println("Company Name is printed");
	}

	public void companyId() {
		System.out.println("Company Id is printed");
	}

	public void companyAddress() {
		System.out.println("Company Address is printed");
	}

	public static void main(String[] args) {
		CompanyInfo companyInfo = new CompanyInfo();
		companyInfo.companyName();
		companyInfo.companyId();
		companyInfo.companyAddress();
		System.out.println(" Program Executed Successfully");
	}
}
