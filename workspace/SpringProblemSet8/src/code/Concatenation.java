package code;

import lrstruct.LRStruct;
import lrstruct.LRStruct.IAlgo;

public class Concatenation implements IAlgo <String, String, Object > {
//question 1
	
	public String emptyCase (LRStruct<String> host, Object a){
		return "";
	}
	
	public String nonEmptyCase (LRStruct<String> host, Object a){
		return host.getDatum() + host.getRest().execute(this, a);
	}

}
