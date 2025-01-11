package consumer;

import companyimps.Company;

public class Accountant extends Company {

	@Override
	public double cal(double salary) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double cal(double salary, double bonus) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double cal(double salary, double bonus, double tax) {
		// TODO Auto-generated method stub
		return salary+bonus-tax;
	}

}
