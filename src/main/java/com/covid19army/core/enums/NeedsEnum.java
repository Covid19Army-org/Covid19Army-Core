package com.covid19army.core.enums;

public enum NeedsEnum {
	OXYGEN(1),
	BED(2),
	TRANSPORT(3),
	FOOD(4);
	
	private int numVal;

	NeedsEnum(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
}
