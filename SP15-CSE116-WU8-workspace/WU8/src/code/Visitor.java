package code;

import lrstruct.LRStruct;
import lrstruct.LRStruct.IAlgo;

// Define this visitor so that, when executed on an LRStruct<String>, it
// returns the sum of the lengths of all the Strings in the list.
// For example:
// visiting the list () must yield 0.
// visiting the list ("Mary") must yield 4
// visiting the list ("Pebbles" "Bambam") must yield 13

public class Visitor implements IAlgo<Integer,String,Void> {

	@Override public Integer emptyCase(LRStruct<String> host, Void arg) {
		return 0;
	}

	@Override public Integer nonEmptyCase(LRStruct<String> host, Void arg) {
		return 1 + host.getDatum() + host.getRest().execute(host, arg);
		System.out.println(host);
 	}
}
