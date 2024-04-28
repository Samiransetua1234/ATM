package ATM.dao;

import ATM.dto.ATM;

public class ATMDao {
	
	ATM atm = new ATM();
	
	public boolean checkPin(int pin) {
		return atm.getPin() == pin;
	}
	
	public double checkBal() {
		return atm.getBal();
	}
	
	public boolean dipositeMoney(double bal) {
		atm.setBal(atm.getBal()+bal);
		return true;
	}
	public boolean withdrawMoney(double bal) {
		atm.setBal(atm.getBal()-bal);
		return true;
	}
}
