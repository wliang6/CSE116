package code;

import lrstruct.LRStruct;
import lrstruct.LRStruct.IAlgo;

public class SumofSquares implements IAlgo<Integer, Integer, Object>{
//question 2
	@Override
	public Integer emptyCase(LRStruct<Integer> host, Object arg) {
		return 0;
	}

	@Override
	public Integer nonEmptyCase(LRStruct<Integer> host, Object arg) {
		return host.getDatum() * host.getDatum() + host.getRest().execute(this, arg);
	}

}
