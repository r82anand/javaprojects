package com.sivadas.anand.util;

public enum VendorType {
	/**
	 the internal vendor type 
	 */
	INT(0),
	/**
	 * taw vendor type 
	 * 
	 */
	TAW(1),
	/**
	 * external vendor type 
	 * 
	 */
	EXT(2),
	/**
	 * lead vendor type 
	 * 
	 */
	LEAD(3),
	/**
	 * referral vendor type 
	 * 
	 */
	REF(4),
	/**
	 * terminated vendor type 
	 * 
	 */
	TER(5),
	/**
	 * terminatedtaw vendor type 
	 * 
	 */
	TTW(6);

	/** The enum name. */
	private int sortOrder;
	
	VendorType(int sortOrder){
		this.sortOrder = sortOrder;
	}
	/**
	 * Gets the enum name.
	 *
	 * @return the enum name
	 */
	public int getSortOrder() {
		return sortOrder;
	}
	/**
	 * From value.
	 *
	 * @param pValue the value
	 * @return the sort enum
	 */
	public static VendorType fromValue(final String typeName) {
		return VendorType.valueOf(typeName);
	}

}
