package org.company;

public class CompanyInfo {
	public CompanyInfo(String Word) {
		System.out.println(Word);
		String word2 = " welcome to our company";

		String word3 = Word.concat(word2);
		System.out.println(word3);
	}

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
		CompanyInfo companyInfo = new CompanyInfo("GreensTech!!!");
		companyInfo.companyName();
		companyInfo.companyId();
		companyInfo.companyAddress();
		System.out.println(" Program Executed Successfully");
	}
}
