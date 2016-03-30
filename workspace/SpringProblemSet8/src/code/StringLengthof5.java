package code;

import lrstruct.LRStruct;
import lrstruct.LRStruct.IAlgo;

public class StringLengthof5 implements IAlgo<LRStruct<String>, String, Object>{

	@Override
	public LRStruct<String> emptyCase(LRStruct<String> host, Object arg) {
		return new LRStruct<String>();
	}

	@Override
	public LRStruct<String> nonEmptyCase(LRStruct<String> host, Object arg) {
		LRStruct<String> rest = host.getRest().execute(this, arg);
		if(host.getDatum().toString().length() >= 5){
			rest.insertFront(host.getDatum());}
		return rest;
	}
}


	



