package code;

import brstruct.BRStruct;
import brstruct.BRStruct.IAlgo;

public class SumVisitor implements IAlgo<Integer, Integer, Object> {

	@Override
	public Integer emptyCase(BRStruct<Integer> host, Object arg) {
		return 0;
	}

	@Override
	public Integer nonEmptyCase(BRStruct<Integer> host, Object arg) {
		return host.getDatum() + host.getLeft().execute(this, arg) + host.getRight().execute(this, arg);
	}

}
