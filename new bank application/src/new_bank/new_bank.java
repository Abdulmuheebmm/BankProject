package new_bank;

import java.util.Scanner;

public class new_bank {
	String name;
	String pwd;
	long phone;
	String email;
	int balance = 5000;

	static Scanner sc = new Scanner(System.in);
	// new_bank n=new new_bank();

	void signup(String name, String pwd, long phone, String email) {
		this.name = name;
		this.pwd = pwd;
		this.phone = phone;
		this.email = email;

		System.out.println("ACCOUNT CREATED");
	}

	void login(String name, String pwd) {
		if (name.equals(this.name) && pwd.equals(this.pwd)) {
			boolean flag1 = true;
			while (flag1) {
				System.out.println("1 BALANCE\n2 UPDATE NUMBER\n3 WITHDRAW\n4 UPDATE PWD\n5 DETAILS\n6 EXIT");
				switch (sc.nextInt()) {
				case 1: {
					System.out.println("ENTER THE PWD");
					String x = sc.next();
					balance(x);
				}
					break;
				case 2: {
					System.out.println("ENTER THE PWD");
					String x = sc.next();
					update_number(x);

				}
					break;

				case 3: {
					System.out.println("ENTER THE PWD");
					String x = sc.next();
					withdraw(x);
				}
					break;

				case 4: {

					update_pwd();
				}
					break;

				case 5: {
					System.out.println("ENTER THE PWD");
					String x = sc.next();
					check_details(x);
				}
					break;
				case 6: {
					flag1 = false;
				}

				}
			}

		} else {

			System.out.println("ENTER CRT PWD");

		}
	}

	void balance(String pwd) {
		if (pwd.equals(this.pwd)) {
			System.out.println(balance);
		} else {
			System.out.println("enter valid password");
		}
	}

	void update_number(String pwd) {
		if (pwd.equals(this.pwd)) {
			System.out.println("ENTER THE NEW PHONE NUMBER");
			long phone = sc.nextLong();

			this.phone = phone;
		} else {
			System.out.println("ENTER THE CRT PWD");
		}
	}

	void withdraw(String pwd) {
		if (pwd.equals(this.pwd)) {
			System.out.println("ENTER THE AMOUTN TO WITHDRAW");
			int balance = sc.nextInt();
			if (balance <= this.balance) {
				this.balance = this.balance - balance;
			} else {
				System.out.println("IN SUFFIECNT BALANCE");
			}

		}

		else {
			System.out.println("ENTER CTR PWD");
		}
	}

	void update_pwd() {
		System.out.println("ENTER THE OLD PWD");
		String pwd = sc.next();
		if (pwd.equals(this.pwd)) {
			System.out.println("ENTER THE NEW PASSWORD");
			String password = sc.next();
			this.pwd = password;
		} else {
			System.out.println("ENTER THE CRT PWD");
		}
	}

	void check_details(String pwd) {
		if (pwd.equals(this.pwd)) {
			System.out.println("NAME-->" + this.name);
			System.out.println("PHONE-->" + this.phone);
			System.out.println("PASSWORD-->" + this.pwd);
			System.out.println("BALANCE-->" + this.balance);
		} else {
			System.out.println("ENTER THE CRT PWD");
		}
	}

	public static void main(String[] args) {
		new_bank nb = new new_bank();
		boolean flag = true;
		while (true) {
			System.out.println("1 SIGN UP  \n2 LOGIN IN \n3EXIT");
			switch (sc.nextInt()) {

			case 1: {
				System.out.println("ENTER THE NAME ");
				String a = sc.next();
				System.out.println("ENTER THE PASSWORD ");
				String b = sc.next();
				System.out.println("ENTER THE PHONE ");
				long c = sc.nextLong();
				System.out.println("ENTER THE EMAIL ");
				String d = sc.next();
				nb.signup(a, b, c, d);

			}
				break;

			case 2: {
				System.out.println("ENTER THE NAME ");
				String x = sc.next();
				System.out.println("ENTER THE PASSWORD ");
				String y = sc.next();
				nb.login(x, y);
			}
				break;

			case 3: {
				System.out.println("thank you");
				System.exit(0);
			}

			}
		}
	}

}
