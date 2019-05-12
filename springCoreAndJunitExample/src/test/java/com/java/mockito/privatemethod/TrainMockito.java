package com.java.mockito.privatemethod;

public class TrainMockito {

	public int compose(){
		for(int i=0;i<getWagonsCount();i++){
			addWagon(0);
		}
		return getWagonsCount();
	}
	
	int getWagonsCount(){
		throw new UnsupportedOperationException("Fail if not mocked");
	}
	void addWagon(int position){
		throw new UnsupportedOperationException("Fail if not mocked! [position ="+position+"]");
	}
}
