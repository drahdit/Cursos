package aula82.entities;

public class BankAccount {
	
	private int numberAccount;
	private String nameAccount;
	private double depositAmount;
	
	public BankAccount(int numberAccount, String nameAccount, double depositAmount) {
		this.numberAccount = numberAccount;
		this.nameAccount = nameAccount;
		this.depositAmount = depositAmount;
	}
	
	public int getNumberAccount() {
		return numberAccount;
	}
	
	public String getNameAccount() {
		return nameAccount;
	}
	
	public void setNameAccount(String nameAccount) {
		this.nameAccount = nameAccount;
	}
	
	public Double getDepositAmount() {
		return depositAmount;
	}
	
	public void addDepositAmount(double amount) {
		this.depositAmount += amount;
	}
	
	public void withdraw(double amount) {
		if((depositAmount - amount) < 0) {
			System.err.println("Without amount for withdraw");
		}else {	
			depositAmount -= amount;
			depositAmount -= 5.0;
		}
	}
	
	public String toString() {
		String resultado = "Account " + getNumberAccount() + ", Holder: " + getNameAccount() + ", Balance: $" + getDepositAmount();
		return resultado;
	}

}
