package com.prep.adapter.dp;

public class AdapterDPTest {
	
	public static void main(String[] args) {
		SocketAdapter adapter = new SocketAdapterImpl();
		System.out.println(adapter.get120Vvolt());
		System.out.println(adapter.get3Vvolt());
	}

}
