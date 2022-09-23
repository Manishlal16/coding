package org.sample;

public  class MobileApplication extends BusinessTemplate {

	@Override
	public void login() {
		System.out.println("MOBILE LOGIN");
	}
	public  void fligntsearch() {
        
System.out.println("MOBILE FLIGHT SEARCH");
	}
	public void signup() {
		System.out.println();

	}
	public static void main(String[] args) {
		MobileApplication m = new MobileApplication();
		m.login();
		m.fligntsearch();
		m.signup();
	}

}
