package com.sivadas.anand.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.RuleBasedCollator;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import com.sivadas.anand.domain.MyVendorsView;

public class VendorEmployeeSortUtil implements Comparator<MyVendorsView> {

	public static final String NONE = "None";
	public static final String SORT_ASCENDING = "ascending";
	private List<MyVendorsView> vendorsList;
	private String sortParam;
	private String sortOrder;

	public VendorEmployeeSortUtil(List<MyVendorsView> vendorsList, String sortParam, String sortOrder) {
		
		super();
		this.vendorsList = vendorsList;
		this.sortParam = sortParam;
		this.sortOrder = sortOrder;
	}

	public List<MyVendorsView> getVendorsList() {
		return vendorsList;
	}
	public void setVendorsList(List<MyVendorsView> vendorsList) {
		this.vendorsList = vendorsList;
	}
	public String getSortParam() {
		return sortParam;
	}
	public void setSortParam(String sortParam) {
		this.sortParam = sortParam;
	}
	public String getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}
	
	public List<MyVendorsView> sortVendors() {

		List<MyVendorsView> sortedList = null;
		SortEnum sortParam = SortEnum.fromValue(this.getSortParam());
		switch (sortParam) {

		case status:
			sortedList = sortStatusInAscendingOrder(vendorsList, this.getSortParam());
			break;

		case city:
			sortedList = sortCityInAscendingOrder(vendorsList, this.getSortParam());
			break;

		case employer:
			sortedList = sortEmployersInAscendingOrder(vendorsList, this.getSortParam());
			break;

		case jobTitle:
			sortedList = sortJobTitleInAscendingOrder(vendorsList, this.getSortParam());
			break;

		case institution:
			sortedList = sortInstitutionInAscendingOrder(vendorsList, this.getSortParam());
			break;

		case degree:
			sortedList = sortDegreeInAscendingOrder(vendorsList, this.getSortParam());
			break;

		case areaOfMajorStudy:
			sortedList = sortAreaOfMajorStudyInAscendingOrder(vendorsList, this.getSortParam());
			break;

		case primarySource:
			sortedList = sortPrimarySourceInAscendingOrder(vendorsList, this.getSortParam());
			break;

		case firstName:
			sortedList = sortFirstNameAscendingOrder(vendorsList, this.getSortParam());
			break;

		case lastName:
			sortedList = sortLastNameInAscendingOrder(vendorsList, this.getSortParam());
			break;
			
		case contactVendorType:
			sortedList = sortContactVendorTypeInOrder(vendorsList, this.getSortParam());
			break;
			
		default:
			Collections.sort(vendorsList, this);
			sortedList = vendorsList;
			break;
		}

		return sortedList;
	}
	
	private List<MyVendorsView> sortStatusInAscendingOrder(List<MyVendorsView> vendorList, String sortParam) {

		List<MyVendorsView> sortedStatus = new ArrayList<MyVendorsView>();
		List<MyVendorsView> noneStatus = new ArrayList<MyVendorsView>();
		List<MyVendorsView> validStatus = new ArrayList<MyVendorsView>();
		for (MyVendorsView myVendorsView : vendorList) {
			if (myVendorsView.getGlobalStatus().equalsIgnoreCase(NONE)) {
				noneStatus.add(myVendorsView);
			} else {
				validStatus.add(myVendorsView);
			}
		}
		if (validStatus.size() > 1) {
			Collections.sort(validStatus, this);
		}
		if (noneStatus.size() > 1) {
			this.setSortParam("activityDate");
			Collections.sort(noneStatus, this);
		}
		sortedStatus.addAll(validStatus);
		sortedStatus.addAll(noneStatus);

		return sortedStatus;
	}
	
	private List<MyVendorsView> sortCityInAscendingOrder(List<MyVendorsView> vendorList, String sortParam) {

		List<MyVendorsView> sortedCity = new ArrayList<MyVendorsView>();
		List<MyVendorsView> noneCity = new ArrayList<MyVendorsView>();
		List<MyVendorsView> validCity = new ArrayList<MyVendorsView>();
		for (MyVendorsView myVendorsView : vendorList) {
			if (myVendorsView.getCity().equalsIgnoreCase(NONE)) {
				noneCity.add(myVendorsView);
			} else {
				validCity.add(myVendorsView);
			}
		}
		if (validCity.size() > 1) {
			Collections.sort(validCity, this);
		}
		if (noneCity.size() > 1) {
			this.setSortParam("activityDate");
			Collections.sort(noneCity, this);
		}
		sortedCity.addAll(validCity);
		sortedCity.addAll(noneCity);

		return sortedCity;
	}
	
	
	private List<MyVendorsView> sortEmployersInAscendingOrder(List<MyVendorsView> vendorList, String sortParam) {

		List<MyVendorsView> sortedEmployers = new ArrayList<MyVendorsView>();
		List<MyVendorsView> noneEmployers = new ArrayList<MyVendorsView>();
		List<MyVendorsView> validEmployers = new ArrayList<MyVendorsView>();
		for (MyVendorsView myVendorsView : vendorList) {
			if (myVendorsView.getEmployer().equalsIgnoreCase(NONE)) {
				noneEmployers.add(myVendorsView);
			} else {
				validEmployers.add(myVendorsView);
			}
		}
		if (validEmployers.size() > 1) {
			Collections.sort(validEmployers, this);
		}
		if (noneEmployers.size() > 1) {
			this.setSortParam("activityDate");
			Collections.sort(noneEmployers, this);
		}

		sortedEmployers.addAll(validEmployers);
		sortedEmployers.addAll(noneEmployers);

		return sortedEmployers;
	}
	
	private List<MyVendorsView> sortJobTitleInAscendingOrder(List<MyVendorsView> vendorList, String sortParam) {

		List<MyVendorsView> sortedJobTitle = new ArrayList<MyVendorsView>();
		List<MyVendorsView> noneJobTitle = new ArrayList<MyVendorsView>();
		List<MyVendorsView> validJobTitle = new ArrayList<MyVendorsView>();
		for (MyVendorsView myVendorsView : vendorList) {
			if (myVendorsView.getJobTitle().equalsIgnoreCase(NONE)) {
				noneJobTitle.add(myVendorsView);
			} else {
				validJobTitle.add(myVendorsView);
			}
		}
		if (validJobTitle.size() > 1) {
			Collections.sort(validJobTitle, this);
		}
		if (noneJobTitle.size() > 1) {
			this.setSortParam("activityDate");
			Collections.sort(noneJobTitle, this);
		}
		sortedJobTitle.addAll(validJobTitle);
		sortedJobTitle.addAll(noneJobTitle);

		return sortedJobTitle;
	}
	
	private List<MyVendorsView> sortInstitutionInAscendingOrder(List<MyVendorsView> vendorList, String sortParam) {

		List<MyVendorsView> sortedInstitution = new ArrayList<MyVendorsView>();
		List<MyVendorsView> noneInstitution = new ArrayList<MyVendorsView>();
		List<MyVendorsView> validInstitution = new ArrayList<MyVendorsView>();
		for (MyVendorsView myVendorsView : vendorList) {
			if (myVendorsView.getInstitution().equalsIgnoreCase(NONE)) {
				noneInstitution.add(myVendorsView);
			} else {
				validInstitution.add(myVendorsView);
			}
		}
		if (validInstitution.size() > 1) {
			Collections.sort(validInstitution, this);
		}
		if (noneInstitution.size() > 1) {
			this.setSortParam("activityDate");
			Collections.sort(noneInstitution, this);
		}
		sortedInstitution.addAll(validInstitution);
		sortedInstitution.addAll(noneInstitution);

		return sortedInstitution;
	}
	
	
	private List<MyVendorsView> sortDegreeInAscendingOrder(List<MyVendorsView> vendorList, String sortParam) {

		List<MyVendorsView> sortedDegree = new ArrayList<MyVendorsView>();
		List<MyVendorsView> noneDegree = new ArrayList<MyVendorsView>();
		List<MyVendorsView> validDegree = new ArrayList<MyVendorsView>();
		for (MyVendorsView myVendorsView : vendorList) {
			if (myVendorsView.getDegree().equalsIgnoreCase(NONE)) {
				noneDegree.add(myVendorsView);
			} else {
				validDegree.add(myVendorsView);
			}
		}
		if (validDegree.size() > 1) {
			Collections.sort(validDegree, this);
		}
		if (noneDegree.size() > 1) {
			this.setSortParam("activityDate");
			Collections.sort(noneDegree, this);
		}
		sortedDegree.addAll(validDegree);
		sortedDegree.addAll(noneDegree);

		return sortedDegree;
	}
	
	private List<MyVendorsView> sortAreaOfMajorStudyInAscendingOrder(List<MyVendorsView> vendorList, String sortParam) {

		List<MyVendorsView> sortedAreaOfMajorStudy = new ArrayList<MyVendorsView>();
		List<MyVendorsView> noneAreaOfMajorStudy = new ArrayList<MyVendorsView>();
		List<MyVendorsView> validAreaOfMajorStudy = new ArrayList<MyVendorsView>();
		for (MyVendorsView myVendorsView : vendorList) {
			if (myVendorsView.getAreaOfMajorStudy().equalsIgnoreCase(NONE)) {
				noneAreaOfMajorStudy.add(myVendorsView);
			} else {
				validAreaOfMajorStudy.add(myVendorsView);
			}
		}
		if (validAreaOfMajorStudy.size() > 1) {
			Collections.sort(validAreaOfMajorStudy, this);
		}
		if (noneAreaOfMajorStudy.size() > 1) {
			this.setSortParam("activityDate");
			Collections.sort(noneAreaOfMajorStudy, this);
		}
		sortedAreaOfMajorStudy.addAll(validAreaOfMajorStudy);
		sortedAreaOfMajorStudy.addAll(noneAreaOfMajorStudy);

		return sortedAreaOfMajorStudy;
	}
	
	private List<MyVendorsView> sortPrimarySourceInAscendingOrder(List<MyVendorsView> vendorList, String sortParam) {

		List<MyVendorsView> sortedPrimarySource = new ArrayList<MyVendorsView>();
		List<MyVendorsView> nonePrimarySource = new ArrayList<MyVendorsView>();
		List<MyVendorsView> validPrimarySource = new ArrayList<MyVendorsView>();
		for (MyVendorsView myVendorsView : vendorList) {
			if (myVendorsView.getPrimarySource().equalsIgnoreCase(NONE)) {
				nonePrimarySource.add(myVendorsView);
			} else {
				validPrimarySource.add(myVendorsView);
			}
		}
		if (validPrimarySource.size() > 1) {
			Collections.sort(validPrimarySource, this);
		}
		if (nonePrimarySource.size() > 1) {
			this.setSortParam("activityDate");
			Collections.sort(nonePrimarySource, this);
		}
		sortedPrimarySource.addAll(validPrimarySource);
		sortedPrimarySource.addAll(nonePrimarySource);

		return sortedPrimarySource;
	}
	
	private List<MyVendorsView> sortFirstNameAscendingOrder(List<MyVendorsView> vendorList, String sortParam) {

		List<MyVendorsView> sortedFirstName = new ArrayList<MyVendorsView>();
		List<MyVendorsView> noneFirstName = new ArrayList<MyVendorsView>();
		List<MyVendorsView> validFirstName = new ArrayList<MyVendorsView>();
		for (MyVendorsView myVendorsView : vendorList) {
			if (myVendorsView.getFirstName().equalsIgnoreCase(NONE)) {
				noneFirstName.add(myVendorsView);
			} else {
				validFirstName.add(myVendorsView);
			}
		}
		if (validFirstName.size() > 1) {
			Collections.sort(validFirstName, this);
		}
		if (noneFirstName.size() > 1) {
			this.setSortParam("activityDate");
			Collections.sort(noneFirstName, this);
		}
		sortedFirstName.addAll(validFirstName);
		sortedFirstName.addAll(noneFirstName);

		return sortedFirstName;
	}
	
	private List<MyVendorsView> sortLastNameInAscendingOrder(List<MyVendorsView> vendorsList, String sortParam) {

		List<MyVendorsView> sortedLastName = new ArrayList<MyVendorsView>();
		List<MyVendorsView> noneLastName = new ArrayList<MyVendorsView>();
		List<MyVendorsView> validLastName = new ArrayList<MyVendorsView>();
		for (MyVendorsView myVendorsView : vendorsList) {
			if (myVendorsView.getLastName().equalsIgnoreCase(NONE)) {
				noneLastName.add(myVendorsView);
			} else {
				validLastName.add(myVendorsView);
			}
		}
		if (validLastName.size() > 1) {
			Collections.sort(validLastName, this);
		}
		if (noneLastName.size() > 1) {
			this.setSortParam("activityDate");
			Collections.sort(noneLastName, this);
		}
		sortedLastName.addAll(validLastName);
		sortedLastName.addAll(noneLastName);

		return sortedLastName;
	}
	
	private List<MyVendorsView> sortContactVendorTypeInOrder(List<MyVendorsView> vendorsList, String sortParam) {

		List<MyVendorsView> sortedVendorType = new ArrayList<MyVendorsView>();
		List<MyVendorsView> validVendorType = new ArrayList<MyVendorsView>();
		List<MyVendorsView> noneVendorType = new ArrayList<MyVendorsView>();
		for (MyVendorsView myVendorView : vendorsList) {
			String globalStatus = myVendorView.getGlobalStatus();
			VendorType contactVendorType = VendorType.fromValue(myVendorView.getVendorType());
			switch (contactVendorType) {
			case INT:
				myVendorView.setSortVendorType(VendorType.INT);
				validVendorType.add(myVendorView);
				break;

			case TAW:
				myVendorView.setSortVendorType(VendorType.TAW);
				validVendorType.add(myVendorView);
				break;

			case EXT:
				if (globalStatus.equalsIgnoreCase("Lead")) {
					myVendorView.setSortVendorType(VendorType.LEAD);
					validVendorType.add(myVendorView);
				} else {
					myVendorView.setSortVendorType(VendorType.EXT);
					validVendorType.add(myVendorView);
				}
				break;
			case REF:
				myVendorView.setSortVendorType(VendorType.REF);
				validVendorType.add(myVendorView);
				break;
			case TER:
				myVendorView.setSortVendorType(VendorType.TER);
				validVendorType.add(myVendorView);
				break;
			case TTW:
				myVendorView.setSortVendorType(VendorType.TTW);
				validVendorType.add(myVendorView);
				break;
			default:
				noneVendorType.add(myVendorView);
				break;
			}
		}

		if (validVendorType.size() > 1) {
			Collections.sort(validVendorType, this);
		}
		if (noneVendorType.size() > 1) {
			this.setSortParam("activityDate");
			Collections.sort(noneVendorType, this);
		}
		sortedVendorType.addAll(validVendorType);
		sortedVendorType.addAll(noneVendorType);

		return sortedVendorType;
	}

	public int compare(MyVendorsView firstObject, MyVendorsView secondObject) {
		
		int result = 0;

		SortEnum sortParam = SortEnum.fromValue(this.getSortParam());
		String sortOrder= this.getSortOrder();
		switch (sortParam) {
		case activityDate:

			result =sortDate(firstObject.getActivityDate(),
					secondObject.getActivityDate()) ;
			break;
		case creationDate:

			result =sortDate(firstObject.getCreationDate(),
					secondObject.getCreationDate()) ;
			break;
			
		case lastUpdated:

			result =sortDate(firstObject.getVendorLastActivityDate(),
					secondObject.getVendorLastActivityDate()) ;
			break;		
	
		case totalJobs:
			result = compareIntDescending(firstObject, secondObject);
			break;
		case id:
			if (sortOrder.equalsIgnoreCase(SORT_ASCENDING)) {
				result = firstObject.getVendorId().compareTo(
						secondObject.getVendorId());
			} else {
				result = secondObject.getVendorId().compareTo(
						firstObject.getVendorId());
			}

			break;
		case employer:

			result= sortString(firstObject.getEmployer(),
						secondObject.getEmployer(), firstObject, secondObject);
			break;
		case status:
	
			result= sortString(firstObject.getGlobalStatus(),
					secondObject.getGlobalStatus(), firstObject, secondObject);
			break;

		case city:

			result= sortString(firstObject.getCity(),
					secondObject.getCity(), firstObject, secondObject);
			break;

		case jobTitle:

			result= sortString(firstObject.getJobTitle(),
					secondObject.getJobTitle(), firstObject, secondObject);
			break;

		case institution:

			result= sortString(firstObject.getInstitution(),
					secondObject.getInstitution(), firstObject, secondObject);
			break;

		case degree:

			result= sortString(firstObject.getDegree(),
					secondObject.getDegree(), firstObject, secondObject);
			break;

		case areaOfMajorStudy:

			result= sortString(firstObject.getAreaOfMajorStudy(),
					secondObject.getAreaOfMajorStudy(), firstObject, secondObject);
			break;

		case primarySource:

			result= sortString(firstObject.getPrimarySource(),
					secondObject.getPrimarySource(), firstObject, secondObject);
			break;

		case firstName:

			result= sortStringCaseInsensitive(firstObject.getFirstName(),
					secondObject.getFirstName(), firstObject, secondObject);
			break;

		case lastName:

			result= sortStringCaseInsensitive(firstObject.getLastName(),
					secondObject.getLastName(), firstObject, secondObject);
			break;
			
		case contactVendorType :
			result= sortVendorType(firstObject,secondObject);
			break;

		}
		
		return result;
	}
	
	private int sortDate(String firstDate, String secondDate) {
		int result = 0;
		String sortOrder = this.getSortOrder();

		if (sortOrder.equalsIgnoreCase(SORT_ASCENDING)) {
			result = compareDates(secondDate, firstDate);
		} else {
			result = compareDates(firstDate, secondDate);
		}

		return result;
	}

	private int compareDates(String firstStringDate, String secondStringDate) {

		int result = 0;
		if (firstStringDate.equalsIgnoreCase(NONE)
				&& secondStringDate.equalsIgnoreCase(NONE)) {
			result = 0;
		} else if (firstStringDate.equalsIgnoreCase(NONE)
				&& !secondStringDate.equalsIgnoreCase(NONE)) {
			result = 1;
		} else if (!firstStringDate.equalsIgnoreCase(NONE)
				&& secondStringDate.equalsIgnoreCase(NONE)) {
			result = -1;
		} else {
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			try {
				Date firstDate = (Date) dateFormat.parse(firstStringDate);
				Date secondDate = (Date) dateFormat.parse(secondStringDate);
				result = secondDate.compareTo(firstDate);
			} catch (ParseException e) {
				//@TODO user a logger
				e.printStackTrace();
			}
		}

		return result;
	}
	
	private int compareIntDescending(MyVendorsView firstObject, MyVendorsView secondObject) {

		int result = 0;
		int first = 0;
		int second = 0;

		if (firstObject.getTotalJobs().equalsIgnoreCase(NONE)
				&& secondObject.getTotalJobs().equalsIgnoreCase(NONE)) {
			result = compareDates(firstObject.getActivityDate(),
					secondObject.getActivityDate());
		} else if (firstObject.getTotalJobs().equalsIgnoreCase(NONE)
				&& !secondObject.getTotalJobs().equalsIgnoreCase(NONE)) {
			result = 1;
		} else if (!firstObject.getTotalJobs().equalsIgnoreCase(NONE)
				&& secondObject.getTotalJobs().equalsIgnoreCase(NONE)) {
			result = -1;
		} else {
			first = Integer.valueOf(firstObject.getTotalJobs());
			second = Integer.valueOf(secondObject.getTotalJobs());
			if (first == second) {
				result = compareDates(firstObject.getActivityDate(),
						secondObject.getActivityDate());
			} else if (first < second) {
				result = 1;
			} else {
				result = -1;
			}
		}

		return result;
	}
	
	private int sortString(String firstString, String secondString, MyVendorsView firstObject, MyVendorsView secondObject) {
		int result = 0;
		String sortOrder = this.getSortOrder();

		if (sortOrder.equalsIgnoreCase(SORT_ASCENDING)) {
			
			result = compareStrings(firstString, secondString, firstObject,
					secondObject);
		} else {
			
			result = compareStrings(secondString, firstString, firstObject,
					secondObject);
		}

		return result;
	}
	
	private int compareStrings(String firstString, String secondString, MyVendorsView firstObject, MyVendorsView secondObject) {

		int result = 0;

		if (NONE.equalsIgnoreCase(firstString)
				&& NONE.equalsIgnoreCase(secondString)) {
			result = 0;
		} else if (NONE.equalsIgnoreCase(firstString)
				&& !NONE.equalsIgnoreCase(secondString)) {
			result = -1;
		} else if (!NONE.equalsIgnoreCase(firstString)
				&& NONE.equalsIgnoreCase(secondString)) {
			result = 1;
		} else {
			try {
				String rule = ("< 0 < 1 < 2 < 3 < 4 < 5 < 6 < 7 < 8 < 9  < a < b < c < d < e < f < g < h < i < j < k < l < m < n < o < p < q < r < s < t < u < v < w < x < y < z < A < B < C < D < E < F < G < H < I < J < K < L < M < N < O < P < Q < R < S < T < U < V < W < X < Y < Z");
				RuleBasedCollator ruleCollator = new RuleBasedCollator(rule);
				result = ruleCollator.compare(firstString, secondString);
				if (result == 0) {
					result = compareDates(firstObject
							.getActivityDate(), secondObject.getActivityDate());
				}
			} catch (ParseException parseException) {
				parseException.printStackTrace();
			}
		}

		return result;
	}

	private int sortStringCaseInsensitive(String firstString, String secondString, MyVendorsView firstObject, MyVendorsView secondObject) {
		
		int result = 0;
		String sortOrder = this.getSortOrder();

		if (sortOrder.equalsIgnoreCase(SORT_ASCENDING)) {
			result = compareStringCaseInsensitive(firstString, secondString,
					firstObject, secondObject);
		} else {
			result = compareStringCaseInsensitive(secondString, firstString,
					firstObject, secondObject);
		}

		return result;
	}
	
	private int compareStringCaseInsensitive(String firstString, String secondString, MyVendorsView firstObject, MyVendorsView secondObject) {

		int result = 0;
		if (NONE.equalsIgnoreCase(firstString)
				&& NONE.equalsIgnoreCase(secondString)) {
			result = 0;
		} else if (NONE.equalsIgnoreCase(firstString)
				&& !NONE.equalsIgnoreCase(secondString)) {
			result = -1;
		} else if (!NONE.equalsIgnoreCase(firstString)
				&& NONE.equalsIgnoreCase(secondString)) {
			result = 1;
		} else {
			result = firstString.compareToIgnoreCase(secondString);
			if (result == 0) {
				result = compareDates(firstObject.getActivityDate(),
						secondObject.getActivityDate());
			}
		}

		return result;
	}
	
	private int sortVendorType(MyVendorsView firstObject, MyVendorsView secondObject) {

		int result = 0;
		String sortOrder = this.getSortOrder();

		if (sortOrder.equalsIgnoreCase(SORT_ASCENDING)) {
			result = compareVendorType(firstObject, secondObject);
		} else {
			result = compareVendorType(secondObject, firstObject);
		}
		return result;
	}
	
	private int compareVendorType(MyVendorsView firstObject, MyVendorsView secondObject) {

		int result = 0;
		if(null != firstObject.getVendorType() && null != secondObject.getVendorType()){
		
			int firstSortOrder = firstObject.getSortVendorType().getSortOrder();
			int secondSortOrder = secondObject.getSortVendorType().getSortOrder();
			if(firstSortOrder > secondSortOrder){
				result = 1;
			}else if(firstSortOrder < secondSortOrder){
				result = -1;
			}else{
				result = 0;
			}
			if(result == 0){
				result = compareStringVendorFirstNameInsensitive(
						firstObject.getSortFirstName(),
						secondObject.getSortFirstName(), firstObject,
						secondObject);
			}
		}							
				
		return result;
	}
	
	private int compareStringVendorFirstNameInsensitive (String firstString, String secondString, MyVendorsView firstObject, MyVendorsView secondObject) {

		int result = 0;
		if (NONE.equalsIgnoreCase(firstString)
				&& NONE.equalsIgnoreCase(secondString)) {
			result = 0;
		} else if (NONE.equalsIgnoreCase(firstString)
				&& !NONE.equalsIgnoreCase(secondString)) {
			result = -1;
		} else if (!NONE.equalsIgnoreCase(firstString)
				&& NONE.equalsIgnoreCase(secondString)) {
			result = 1;
		} else {
			result = firstString.compareToIgnoreCase(secondString);
			if (result == 0) {
				if (sortOrder.equalsIgnoreCase(SORT_ASCENDING)) {
					result = compareStringCaseInsensitive(firstObject.getLastName(), secondObject.getLastName(), firstObject, secondObject);
				}
				else
				{
					result = compareStringCaseInsensitive(firstObject.getLastName(), secondObject.getLastName(), secondObject, firstObject);
				}
				
			}
		}

		return result;
	}
	
	
}
