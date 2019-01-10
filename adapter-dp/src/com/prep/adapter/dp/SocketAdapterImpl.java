package com.prep.adapter.dp;

public class SocketAdapterImpl extends Socket implements SocketAdapter {

	@Override
	public int get3Vvolt() {
		return 3;
	}

	@Override
	public int get12Vvolt() {
		return 12;
	}

	@Override
	public int get120Vvolt() {
		return getVolt();
	}

}
