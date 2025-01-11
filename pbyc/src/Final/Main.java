package Final;

import consumer.Accountant;
import consumer.Employee;
import consumer.Manager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager man = new Manager();
		System.out.println(man.cal(500000, 1000));

		Employee emp = new Employee();
		System.out.println(emp.cal(5000));

		Accountant acc = new Accountant();
		System.out.println(acc.cal(700000, 5000, 1000));
	}

}
