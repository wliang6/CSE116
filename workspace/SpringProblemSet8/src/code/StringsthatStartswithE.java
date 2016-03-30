package code;

import lrstruct.LRStruct;
import lrstruct.LRStruct.IAlgo;

public class StringsthatStartswithE implements IAlgo<LRStruct<String>, String, Object>{
//question 4
	
	@Override
	public LRStruct<String> emptyCase(LRStruct<String> host, Object arg) {
		return new LRStruct<String>();
	}
	@Override
	public LRStruct<String> nonEmptyCase(LRStruct<String> host, Object arg) {
		LRStruct<String> rest = host.getRest().execute(this, arg);
		char c = host.getDatum().toString().charAt(0);
		if(c == 'e' || c == 'E'){
			return rest.insertFront(host.getDatum());
		}
		return rest;
		}
	}
