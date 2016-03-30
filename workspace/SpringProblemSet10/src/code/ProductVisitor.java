package code;

import brstruct.BRStruct;
import brstruct.BRStruct.IAlgo;

public class ProductVisitor implements IAlgo<Integer, Integer, Object> {


@Override
public Integer emptyCase(BRStruct<Integer> host, Object arg) {
	return 1;
}

@Override
public Integer nonEmptyCase(BRStruct<Integer> host, Object arg) {
	return host.getLeft().execute(this, arg) * host.getRight().execute(this, arg);
}
}