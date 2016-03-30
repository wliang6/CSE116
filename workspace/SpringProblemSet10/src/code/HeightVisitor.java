package code;

import brstruct.BRStruct;
import brstruct.BRStruct.IAlgo;

public class HeightVisitor<E> implements IAlgo<Integer, E, Object> {

	@Override
	public Integer emptyCase(BRStruct<E> host, Object arg) {
		return -1;
	}

	@Override
	public Integer nonEmptyCase(BRStruct<E> host, Object arg) {
		int leftHeight = host.getLeft().execute(this, arg);
		int rightHeight = host.getRight().execute(this, arg);
		return 1 + Math.max(leftHeight, rightHeight);
	
	}
	

}
