package com.sivadas.anand.util;

/**
 * The Enum SortEnum.
 */
public enum SortEnum {
	
	status("status"),
	activityDate("activityDate"),
	creationDate("creationDate"),
	totalJobs("totalJobs"),
	firstName("firstName"),
	lastName("lastName"),
	id("id"),
	city("city"),
	employer("employer"),
	jobTitle("jobTitle"),
	institution("institution"),
	degree("degree"),
	areaOfMajorStudy("areaOfMajorStudy"),
	primarySource("primarySource"),
    lastUpdated("lastUpdated"),
	contactVendorType("contactVendorType"),
	INT("INT"),
	TAW("TAW"),
	EXT("EXT"),
	REF("REF"),
	TER("TER"),
	TTW("TTW");
	
	/** The enum name. */
	private String enumName;
	
	/**
	 * Gets the enum name.
	 *
	 * @return the enum name
	 */
	public String getEnumName() {
		return enumName;
	}

	/**
	 * Sets the enum name.
	 *
	 * @param enumName the new enum name
	 */
	public void setEnumName(String enumName) {
		this.enumName = enumName;
	}

	/**
	 * Instantiates a new sort enum.
	 *
	 * @param name the name
	 */
	SortEnum (String name) {
		this.setEnumName(name);
	}
	
	/**
	 * From value.
	 *
	 * @param pValue the value
	 * @return the sort enum
	 */
	public static SortEnum fromValue(final String pValue) {
		return SortEnum.valueOf(pValue);
	}
	
	/**
	 * Value.
	 *
	 * @return the string
	 */
	public String value() {
		return this.name();
	}
}
