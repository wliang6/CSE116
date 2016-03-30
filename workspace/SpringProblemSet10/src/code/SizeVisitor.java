package code;

import brstruct.BRStruct;
import brstruct.BRStruct.IAlgo;


//BRStruct
public class SizeVisitor<E> implements IAlgo<Integer, Integer, Object>{


	@Override
	public Integer emptyCase(BRStruct<Integer> host, Object arg) {
		return 0;
	}

	@Override
	public Integer nonEmptyCase(BRStruct<Integer> host, Object arg) {
		return 1 + host.getLeft().execute(this, arg) + host.getRight().execute(this, arg);
	}
}
