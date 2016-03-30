package code;

import lrstruct.LRStruct;
import lrstruct.LRStruct.IAlgo;

public class SumofAllLengthofStrings implements IAlgo<Integer, String, Object>{
//question 7

	@Override
	public Integer emptyCase(LRStruct<String> host, Object arg) {
		return 0;
	}

	@Override
	public Integer nonEmptyCase(LRStruct<String> host, Object arg) {
		return host.getDatum().length() + host.getRest().execute(this, arg);
	}

	
	
}
