package ATM.service;

import ATM.dao.ATMDao;

public class ATMService {
	

	
	ATMDao atmDao = new ATMDao();
	
	public boolean checkPinService(int pin) {
		return atmDao.checkPin(pin);
	}
	public double checkBalService() {
		return atmDao.checkBal();
	}
	public boolean dipositeMoneyService(double bal) {
		return atmDao.dipositeMoney(bal);
	}
	public boolean withdrawMoneyService(double bal) {
		
		return atmDao.withdrawMoney(bal);
	}
}
