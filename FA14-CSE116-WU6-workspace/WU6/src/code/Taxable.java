package code;

public class Taxable {

	public static int RATE = 0;
	
	private int _salePrice;

	public Taxable(int p) {
		_salePrice = p;
	}
		
	public Taxable(int p, int rate) {
		_salePrice = p;
		rate = RATE;
	}

	public int taxDue() {
		return (_salePrice * RATE) / 100;
	}
	
	public int price() {
		return _salePrice;
	}
}
