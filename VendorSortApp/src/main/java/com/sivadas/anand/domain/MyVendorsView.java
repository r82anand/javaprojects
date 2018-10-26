package com.sivadas.anand.domain;

import java.math.BigDecimal;

import com.sivadas.anand.util.VendorType;

public class MyVendorsView {

    /** The employer. */
    private String employer = "";

    /** The job title. */
    private String jobTitle = "";

    /** The modfd date. */
    private String modfdDate = "";

    /** The city. */
    private String city = "";

    /** The state. */
    private String state = "";

    /** The country. */
    private String country = "";

    /** The institution. */
    private String institution = "";

    /** The degree. */
    private String degree = "";

    /** The area of major study. */
    private String major = "";

    /** The vendor id. */
    private BigDecimal vendorId = null;

    /** The primary source. */
    private String primarySource = "";

    /** The status. */
    private String status = "";

    /** The global status. */
    private String globalStatus = "";

    /** The first name. */
    private String firstName = "";

    /** The last name. */
    private String lastName = "";

    /** The vendor name. */
    private String vendorName = "";

    /** The creation date. */
    private String creationDate = "";

    /** The flagtype. */
    private String flagtype = "";

    /** The search term. */
    private String searchTerm = null;

    /** The query text. */
    private String queryText;

    /** The modified date. */
    private String modifiedDate = "";

    /** The find me. */
    private String findMe = "";

    /** The phone screen count. */
    private String phoneScreenCount = "";

    /** The interview count. */
    private String interviewCount = "";

    /** The vendor type. */
    private String vendorType = "";

    /** The total jobs. */
    private String noOfJobs = "";

    /** The activity date. */
    private String lastActivityDate = "";

    /** The vendor code id. */
    private BigDecimal vendorCodeId = null;

    /** The primary email. */
    private String prmryEmail = "";

    /** The primary phone. */
    private String primaryPhone = "";

    /** The address line1. */
    private String addressLine1 = "";

    /** The address line2. */
    private String addressLine2 = "";

    /** The snippet. */
    private String snippet;

    /** The sort vendor Type **/
    private VendorType sortVendorType;
    
    
    /** The vendor activity date. */
    private String vendorLastActivityDate = "";
    
    /** The sortFirstName. */
    private String sortFirstName = "";
    
    /** The activeIndicator. */
    private String activeIndicator="";
 
	/**
     * Gets the sortFirstName.
     * 
     * @return the sortFirstName
     */
    public String getSortFirstName() {
		return sortFirstName;
	}
    
    /**
     * Sets the sortFirstName.
     * 
     * @param sortFirstName
     *            the sortFirstName to set
     */

	public void setSortFirstName(String sortFirstName) {
		this.sortFirstName = sortFirstName;
	}
    
    private String languageSkills = "";
    
    

    public String getLanguageSkills() {
		return languageSkills;
	}

	public void setLanguageSkills(String languageSkills) {
		this.languageSkills = languageSkills;
	}

    public String getVendorLastActivityDate() {
		return vendorLastActivityDate;
	}

	public void setVendorLastActivityDate(String vendorLastActivityDate) {
		this.vendorLastActivityDate = vendorLastActivityDate;
	}

	/**
     * Gets the snippet.
     * 
     * @return the snippet
     */
    public String getSnippet() {
        return this.snippet;
    }

    /**
     * Sets the snippet.
     * 
     * @param snippet
     *            the snippet to set
     */
    public void setSnippet(final String snippet) {
        this.snippet = snippet;
    }

    /**
     * Gets the modified date.
     * 
     * @return the modified date
     */
    public String getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Sets the modified date.
     * 
     * @param modifiedDate
     *            the new modified date
     */
    public void setModifiedDate(final String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
    
    /**
     * Gets the active Indicator .
     * 
     * @return the active Indicator 
     */
    public String getActiveIndicator() {
		return activeIndicator;
	}

    /**
     * Sets the active Indicator.
     * 
     * @param activeIndicator
     *            the new active Indicator
     */
	public void setActiveIndicator(String activeIndicator) {
		this.activeIndicator = activeIndicator;
	}

    /**
     * Instantiates a new my vendor view.
     */
    public MyVendorsView() {
    }

    /**
     * Instantiates a new my vendor view.
     * 
     * @param employer
     *            the employer
     * @param jobTitle
     *            the job title
     * @param modfdDate
     *            the modfd date
     * @param city
     *            the city
     * @param state
     *            the state
     * @param country
     *            the country
     * @param degree
     *            the degree
     * @param institution
     *            the institution
     * @param areaOfMajorStudy
     *            the area of major study
     * @param primarySource
     *            the primary source
     * @param globalStatus
     *            the global status
     * @param firstName
     *            the first name
     * @param lastName
     *            the last name
     * @param creationDate
     *            the creation date
     * @param flagType
     *            the flag type
     * @param vendorType
     *            the vendor type
     * @param vendorId
     *            the vendor id
     * @param findMe
     *            the find me
     * @param searchTerms
     *            the search terms
     * @param activityDate
     *            the activity date
     * @param vendorCodeId
     *            the vendor code id
     * @param totalJobs
     *            the total jobs
     * @param phoneScreenCount
     *            the phone screen count
     * @param interviewCount
     *            the interview count
     */
    public MyVendorsView(final String employer, final String jobTitle,
        final String modfdDate, final String city, final String state,
        final String country, final String degree, final String institution,
        final String areaOfMajorStudy, final String primarySource,
        final String globalStatus, final String firstName,
        final String lastName, final String creationDate,
        final String flagType, final String vendorType, final BigDecimal vendorId,
        final String findMe, final String searchTerms,
        final String activityDate,final String vendorActivityDate, final BigDecimal vendorCodeId,
        final String totalJobs, final String phoneScreenCount,
        final String interviewCount, final String addressLine1,
        final String addressLine2, final String primaryEmail,
        final String primaryPhone, final String languageSkills,final String activeIndicator) {
        if (employer != null) {
            this.employer = employer;
        }
        if (jobTitle != null) {
            this.jobTitle = jobTitle;
        }
        if (modfdDate != null) {
            this.modifiedDate = modfdDate;
        }
        if (city != null) {
            this.city = city;
        }
        if (state != null) {
            this.state = state;
        }
        if (country != null) {
            this.country = country;
        }
        if (institution != null) {
            this.institution = institution;
        }
        if (degree != null) {
            this.degree = degree;
        }
        if (areaOfMajorStudy != null) {
            this.major = areaOfMajorStudy;
        }
        if (vendorId != null) {
            this.vendorId = vendorId;
        }
        if (primarySource != null) {
            this.primarySource = primarySource;
        }
        if (globalStatus != null) {
            this.globalStatus = globalStatus;
        }
        if (firstName != null) {
            this.firstName = firstName;
        }
        if (lastName != null) {
            this.lastName = lastName;
        }
        if (creationDate != null) {
            this.creationDate = creationDate;
        }
        this.vendorName = firstName + " " + lastName;
        if (flagType != null) {
            this.flagtype = flagType;
        }
        if (vendorType != null) {
            this.vendorType = vendorType;
        }
        if (findMe != null) {
            this.findMe = findMe;
        }
        if (searchTerms != null) {
            this.searchTerm = searchTerms;
        }
        if (activityDate != null) {
            this.lastActivityDate = activityDate;
        }
        if (vendorActivityDate != null) {
            this.vendorLastActivityDate = vendorActivityDate;
        }
        if (vendorCodeId != null) {
            this.vendorCodeId = vendorCodeId;
        }
        if (totalJobs != null) {
            this.noOfJobs = totalJobs;
        }
        if (phoneScreenCount != null) {
            this.phoneScreenCount = phoneScreenCount;
        }
        if (interviewCount != null) {
            this.interviewCount = interviewCount;
        }
        if (addressLine1 != null) {
            this.addressLine1 = addressLine1;
        }
        if (addressLine2 != null) {
            this.addressLine2 = addressLine2;
        }
        if (primaryEmail != null) {
            this.prmryEmail = primaryEmail;
        }
        if (primaryPhone != null) {
            this.primaryPhone = primaryPhone;
        }
        if(languageSkills != null){
        	this.languageSkills = languageSkills;
        }
        if(activeIndicator != null){
        	this.activeIndicator = activeIndicator;
        }
    }

    /**
     * Gets the employer.
     * 
     * @return the employer
     */
    public String getEmployer() {
        return this.employer;
    }

    /**
     * Sets the employer.
     * 
     * @param employer
     *            the employer to set
     */
    public void setEmployer(final String employer) {
        this.employer = employer;
    }

    /**
     * Gets the job title.
     * 
     * @return the jobTitle
     */
    public String getJobTitle() {
        return this.jobTitle;
    }

    /**
     * Sets the job title.
     * 
     * @param jobTitle
     *            the jobTitle to set
     */
    public void setJobTitle(final String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * Gets the modfd date.
     * 
     * @return the modfdDate
     */
    public String getModfdDate() {
        return this.modfdDate;
    }

    /**
     * Sets the modfd date.
     * 
     * @param modfdDate
     *            the modfdDate to set
     */
    public void setModfdDate(final String modfdDate) {
        this.modfdDate = modfdDate;
    }

    /**
     * Gets the country.
     * 
     * @return the country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Sets the country.
     * 
     * @param country
     *            the country to set
     */
    public void setCountry(final String country) {
        this.country = country;
    }

    /**
     * Gets the institution.
     * 
     * @return the institution
     */
    public String getInstitution() {
        return this.institution;
    }

    /**
     * Sets the institution.
     * 
     * @param institution
     *            the institution to set
     */
    public void setInstitution(final String institution) {
        this.institution = institution;
    }

    /**
     * Gets the degree.
     * 
     * @return the degree
     */
    public String getDegree() {
        return this.degree;
    }

    /**
     * Sets the degree.
     * 
     * @param degree
     *            the degree to set
     */
    public void setDegree(final String degree) {
        this.degree = degree;
    }

    /**
     * Gets the area of major study.
     * 
     * @return the areaOfMajorStudy
     */
    public String getAreaOfMajorStudy() {
        return this.major;
    }

    /**
     * Sets the area of major study.
     * 
     * @param areaOfMajorStudy
     *            the areaOfMajorStudy to set
     */
    public void setAreaOfMajorStudy(final String areaOfMajorStudy) {
        this.major = areaOfMajorStudy;
    }

    /**
     * Gets the vendor id.
     * 
     * @return the vendorId
     */
    public BigDecimal getVendorId() {
        return this.vendorId;
    }

    /**
     * Sets the vendor id.
     * 
     * @param vendorId
     *            the vendorId to set
     */
    public void setVendorId(final BigDecimal vendorId) {
        this.vendorId = vendorId;
    }

    /**
     * Gets the primary source.
     * 
     * @return the primarySource
     */
    public String getPrimarySource() {
        return this.primarySource;
    }

    /**
     * Sets the primary source.
     * 
     * @param primarySource
     *            the primarySource to set
     */
    public void setPrimarySource(final String primarySource) {
        this.primarySource = primarySource;
    }

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Sets the status.
     * 
     * @param status
     *            the status to set
     */
    public void setStatus(final String status) {
        this.status = status;
    }

    /**
     * Gets the global status.
     * 
     * @return the globalStatus
     */
    public String getGlobalStatus() {
        return this.globalStatus;
    }

    /**
     * Sets the global status.
     * 
     * @param globalStatus
     *            the globalStatus to set
     */
    public void setGlobalStatus(final String globalStatus) {
        this.globalStatus = globalStatus;
    }

    /**
     * Gets the first name.
     * 
     * @return the firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Sets the first name.
     * 
     * @param firstName
     *            the firstName to set
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name.
     * 
     * @return the lastName
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Sets the last name.
     * 
     * @param lastName
     *            the lastName to set
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the vendor name.
     * 
     * @return the vendorName
     */
    public String getVendorName() {
        return this.vendorName;
    }

    /**
     * Sets the vendor name.
     * 
     * @param vendor
     *            the vendorName to set
     */
    public void setVendorName(final String vendor) {
        this.vendorName = this.firstName + " " + this.lastName;
    }

    /**
     * Gets the creation date.
     * 
     * @return the creationDate
     */
    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * Sets the creation date.
     * 
     * @param creationDate
     *            the creationDate to set
     */
    public void setCreationDate(final String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Gets the city.
     * 
     * @return the city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Sets the city.
     * 
     * @param city
     *            the city to set
     */
    public void setCity(final String city) {
        this.city = city;
    }

    /**
     * Gets the state.
     * 
     * @return the state
     */
    public String getState() {
        return this.state;
    }

    /**
     * Sets the state.
     * 
     * @param state
     *            the state to set
     */
    public void setState(final String state) {
        this.state = state;
    }

    /**
     * Gets the flagtype.
     * 
     * @return the flagtype
     */
    public String getFlagtype() {
        return this.flagtype;
    }

    /**
     * Sets the flagtype.
     * 
     * @param flagtype
     *            the flagtype to set
     */
    public void setFlagtype(final String flagtype) {
        this.flagtype = flagtype;
    }

    /**
     * Gets the search term.
     * 
     * @return the searchTerm
     */
    public String getSearchTerm() {
        return this.searchTerm;
    }

    /**
     * Sets the search term.
     * 
     * @param searchTerm
     *            the searchTerm to set
     */
    public void setSearchTerm(final String searchTerm) {
        this.searchTerm = searchTerm;
    }

    /**
     * Gets the query text.
     * 
     * @return the queryText
     */
    public String getQueryText() {
        return this.queryText;
    }

    /**
     * Sets the query text.
     * 
     * @param queryText
     *            the queryText to set
     */
    public void setQueryText(final String queryText) {
        this.queryText = queryText;
    }

    /**
     * Gets the find me.
     * 
     * @return the findMe
     */
    public String getFindMe() {
        return this.findMe;
    }

    /**
     * Sets the find me.
     * 
     * @param findMe
     *            the findMe to set
     */
    public void setFindMe(final String findMe) {
        this.findMe = findMe;
    }

    /**
     * Gets the phone screen count.
     * 
     * @return the phoneScreenCount
     */
    public String getPhoneScreenCount() {
        return this.phoneScreenCount;
    }

    /**
     * Sets the phone screen count.
     * 
     * @param phoneScreenCount
     *            the phoneScreenCount to set
     */
    public void setPhoneScreenCount(final String phoneScreenCount) {
        this.phoneScreenCount = phoneScreenCount;
    }

    /**
     * Gets the interview count.
     * 
     * @return the interviewCount
     */
    public String getInterviewCount() {
        return this.interviewCount;
    }

    /**
     * Sets the interview count.
     * 
     * @param interviewCount
     *            the interviewCount to set
     */
    public void setInterviewCount(final String interviewCount) {
        this.interviewCount = interviewCount;
    }

    /**
     * Gets the vendor type.
     * 
     * @return the vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    /**
     * Sets the vendor type.
     * 
     * @param vendorType
     *            the vendorType to set
     */
    public void setVendorType(final String vendorType) {
        this.vendorType = vendorType;
    }

    /**
     * Gets the total jobs.
     * 
     * @return the totalJobs
     */
    public String getTotalJobs() {
        return this.noOfJobs;
    }

    /**
     * Sets the total jobs.
     * 
     * @param noOfJobs
     *            the noOfJobs to set
     */
    public void setTotalJobs(final String noOfJobs) {
        this.noOfJobs = noOfJobs;
    }

    /**
     * Gets the activity date.
     * 
     * @return the activityDate
     */
    public String getActivityDate() {
        return this.lastActivityDate;
    }

    /**
     * Sets the activity date.
     * 
     * @param activityDate
     *            the activityDate to set
     */
    public void setActivityDate(final String activityDate) {
        this.lastActivityDate = activityDate;
    }

    /**
     * Gets the vendor code id.
     * 
     * @return the vendorCodeId
     */
    public BigDecimal getVendorCodeId() {
        return this.vendorCodeId;
    }

    /**
     * Sets the vendor code id.
     * 
     * @param vendorCodeId
     *            the vendorCodeId to set
     */
    public void setVendorCodeId(final BigDecimal vendorCodeId) {
        this.vendorCodeId = vendorCodeId;
    }

    /**
     * Gets the primary email.
     * 
     * @return the primaryEmail
     */
    public String getPrimaryEmail() {
        return this.prmryEmail;
    }

    /**
     * Sets the primary email.
     * 
     * @param primaryEmail
     *            the primaryEmail to set
     */
    public void setPrimaryEmail(final String primaryEmail) {
        this.prmryEmail = primaryEmail;
    }

    /**
     * Gets the primary phone.
     * 
     * @return the primaryPhone
     */
    public String getPrimaryPhone() {
        return this.primaryPhone;
    }

    /**
     * Sets the primary phone.
     * 
     * @param primaryPhone
     *            the primaryPhone to set
     */
    public void setPrimaryPhone(final String primaryPhone) {
        this.primaryPhone = primaryPhone;
    }

    /**
     * Gets the address line1.
     * 
     * @return the addressLine1
     */
    public String getAddressLine1() {
        return this.addressLine1;
    }

    /**
     * Sets the address line1.
     * 
     * @param addressLine1
     *            the addressLine1 to set
     */
    public void setAddressLine1(final String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * Gets the address line2.
     * 
     * @return the addressLine2
     */
    public String getAddressLine2() {
        return this.addressLine2;
    }

    /**
     * Sets the address line2.
     * 
     * @param addressLine2
     *            the addressLine2 to set
     */
    public void setAddressLine2(final String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    /**
     * Gets the sortVendorType .
     * 
     * @return the sortVendorType
     */
	public VendorType getSortVendorType() {
		return sortVendorType;
	}

	   /**
     * Sets the sortVendorType.
     * 
     * @param sortVendorType
     *            the sortVendorType to set
     */
	public void setSortVendorType(VendorType sortVendorType) {
		this.sortVendorType = sortVendorType;
	}
	
	
    /**
     * To string.
     * 
     * @return the string
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "MyVendorsView [employer=" + this.employer + ", jobTitle="
                + this.jobTitle + ", modfdDate=" + this.modfdDate + ", city="
                + this.city + ", state=" + this.state + ", country="
                + this.country + ", institution=" + this.institution
                + ", degree=" + this.degree + ", areaOfMajorStudy="
                + this.major + ", vendorId=" + this.vendorId + ", primarySource="
                + this.primarySource + ", status=" + this.status
                + ", globalStatus=" + this.globalStatus + ", firstName="
                + this.firstName + ", lastName=" + this.lastName
                + ", vendorName=" + this.vendorName + ", creationDate="
                + this.creationDate + ", flagtype=" + this.flagtype
                + ", searchTerm=" + this.searchTerm + ", queryText="
                + this.queryText + ", modifiedDate=" + this.modifiedDate
                + ", findMe=" + this.findMe + ", phoneScreenCount="
                + this.phoneScreenCount + ", interviewCount="
                + this.interviewCount + ", vendorType=" + this.vendorType
                + ", totalJobs=" + this.noOfJobs 
                + ", languageSkills=" + this.languageSkills + 
                ", activeIndicator=" + this.activeIndicator +"]";
    }

    /**
     * Update brief view.
     */
    public void updateBriefView() {
        this.employer = null;
        this.jobTitle = null;
        this.modfdDate = null;
        this.city = null;
        this.state = null;
        this.country = null;
        this.institution = null;
        this.degree = null;
        this.major = null;
        this.primarySource = null;
        this.status = null;
        this.globalStatus = null;
        this.vendorName = null;
        this.creationDate = null;
        this.flagtype = null;
        this.searchTerm = null;
        this.queryText = null;
        this.modifiedDate = null;
        this.findMe = null;
        this.phoneScreenCount = null;
        this.interviewCount = null;
        this.noOfJobs = null;
        this.lastActivityDate = null;
        this.vendorLastActivityDate = null;
        this.prmryEmail = null;
        this.primaryPhone = null;
        this.addressLine1 = null;
        this.addressLine2 = null;
        this.languageSkills = null;
        this.activeIndicator=null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime
                * result
                + (this.lastActivityDate == null ? 0 : this.lastActivityDate
                        .hashCode());
        result = prime
        		* result
        		+ (this.vendorLastActivityDate == null ? 0 : this.vendorLastActivityDate
                .hashCode());
        
        result = prime
                * result
                + (this.addressLine1 == null ? 0 : this.addressLine1.hashCode());
        result = prime
                * result
                + (this.addressLine2 == null ? 0 : this.addressLine2.hashCode());
        result = prime * result
                + (this.major == null ? 0 : this.major.hashCode());
        result = prime * result
                + (this.vendorId == null ? 0 : this.vendorId.hashCode());
        result = prime * result
                + (this.vendorName == null ? 0 : this.vendorName.hashCode());
        result = prime * result
                + (this.vendorType == null ? 0 : this.vendorType.hashCode());
        result = prime * result
                + (this.vendorCodeId == null ? 0 : this.vendorCodeId.hashCode());
        result = prime * result
                + (this.city == null ? 0 : this.city.hashCode());
        result = prime * result
                + (this.country == null ? 0 : this.country.hashCode());
        result = prime
                * result
                + (this.creationDate == null ? 0 : this.creationDate.hashCode());
        result = prime * result
                + (this.degree == null ? 0 : this.degree.hashCode());
        result = prime * result
                + (this.employer == null ? 0 : this.employer.hashCode());
        result = prime * result
                + (this.findMe == null ? 0 : this.findMe.hashCode());
        result = prime * result
                + (this.firstName == null ? 0 : this.firstName.hashCode());
        result = prime * result
                + (this.flagtype == null ? 0 : this.flagtype.hashCode());
        result = prime
                * result
                + (this.globalStatus == null ? 0 : this.globalStatus.hashCode());
        result = prime * result
                + (this.institution == null ? 0 : this.institution.hashCode());
        result = prime
                * result
                + (this.interviewCount == null ? 0 : this.interviewCount
                        .hashCode());
        result = prime * result
                + (this.jobTitle == null ? 0 : this.jobTitle.hashCode());
        result = prime * result
                + (this.lastName == null ? 0 : this.lastName.hashCode());
        result = prime * result
                + (this.modfdDate == null ? 0 : this.modfdDate.hashCode());
        result = prime
                * result
                + (this.modifiedDate == null ? 0 : this.modifiedDate.hashCode());
        result = prime
                * result
                + (this.phoneScreenCount == null ? 0 : this.phoneScreenCount
                        .hashCode());
        result = prime * result
                + (this.prmryEmail == null ? 0 : this.prmryEmail.hashCode());
        result = prime
                * result
                + (this.primaryPhone == null ? 0 : this.primaryPhone.hashCode());
        result = prime
                * result
                + (this.primarySource == null ? 0 : this.primarySource
                        .hashCode());
        result = prime * result
                + (this.queryText == null ? 0 : this.queryText.hashCode());
        result = prime * result
                + (this.searchTerm == null ? 0 : this.searchTerm.hashCode());
        result = prime * result
                + (this.snippet == null ? 0 : this.snippet.hashCode());
        result = prime * result
                + (this.state == null ? 0 : this.state.hashCode());
        result = prime * result
                + (this.status == null ? 0 : this.status.hashCode());
        result = prime * result
                + (this.noOfJobs == null ? 0 : this.noOfJobs.hashCode());
        result = prime * result
        		+ (this.languageSkills == null ? 0 : this.languageSkills.hashCode());
        result = prime * result
		+ (this.activeIndicator == null ? 0 : this.activeIndicator.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final MyVendorsView other = (MyVendorsView) obj;
        if (this.vendorId == null) {
            if (other.vendorId != null) {
                return false;
            }
        }
        else if (!this.vendorId.equals(other.vendorId)) {
            return false;
        }
        if (this.vendorCodeId == null) {
            if (other.vendorCodeId != null) {
                return false;
            }
        }
        else if (!this.vendorCodeId.equals(other.vendorCodeId)) {
            return false;
        }
        return true;
    }

}
