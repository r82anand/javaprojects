package com.sivadas.anand.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.sivadas.anand.domain.MyVendorsView;

public class TestVendorEmployeeSortUtil {

	private List<MyVendorsView> vendorsList;
	private VendorEmployeeSortUtil sortUtil;
	
	@Before
	public void setup(){
		
		vendorsList = new ArrayList<MyVendorsView>();
		
		MyVendorsView vendorOne = new MyVendorsView();
		vendorOne.setEmployer("13SRQ");
		vendorOne.setJobTitle("TQ4WT 4WQZ");
		vendorOne.setModfdDate("2017-12-16 15:38:48");
		vendorOne.setActivityDate("2017-12-16 15:38:48");
		vendorOne.setCity("Cupertino");
		vendorOne.setState("CA");
		vendorOne.setCountry("United States");
		vendorOne.setInstitution("Mango University");
		vendorOne.setDegree("None");
		vendorOne.setAreaOfMajorStudy("None");
		vendorOne.setVendorId(new BigDecimal("8249052974"));
		vendorOne.setPrimarySource("Employee Referral");
		vendorOne.setStatus("None");
		vendorOne.setGlobalStatus("Lead");
		vendorOne.setFirstName("Scott");
		vendorOne.setLastName("Tiger");
		vendorOne.setVendorName("Scott Tiger");
		vendorOne.setCreationDate("2015-02-28 19:59:31");
		vendorOne.setFlagtype("red");
		vendorOne.setSearchTerm("None");
		vendorOne.setModifiedDate("None");
		vendorOne.setFindMe("None");
		vendorOne.setPhoneScreenCount("0");
		vendorOne.setInterviewCount("0");
		vendorOne.setVendorType("REF");
		vendorOne.setTotalJobs("None");
		vendorOne.setLanguageSkills("Danish");
		vendorOne.setActiveIndicator("1");
		
		MyVendorsView vendorTwo = new MyVendorsView();
		vendorTwo.setEmployer("None");
		vendorTwo.setJobTitle("None");
		vendorTwo.setModfdDate("2015-11-07 23:53:42");
		vendorTwo.setActivityDate("2015-11-07 23:53:42");
		vendorTwo.setCity("Cupertino");
		vendorTwo.setState("CA");
		vendorTwo.setCountry("United States");
		vendorTwo.setInstitution("None");
		vendorTwo.setDegree("None");
		vendorTwo.setAreaOfMajorStudy("None");
		vendorTwo.setVendorId(new BigDecimal("10050243134"));
		vendorTwo.setPrimarySource("Employee Referral");
		vendorTwo.setStatus("None");
		vendorTwo.setGlobalStatus("Lead");
		vendorTwo.setFirstName("Donald");
		vendorTwo.setLastName("Duck");
		vendorTwo.setVendorName("Donald Duck");
		vendorTwo.setCreationDate("2015-11-07 17:31:17");
		vendorTwo.setFlagtype("None");
		vendorTwo.setSearchTerm("None");
		vendorTwo.setQueryText(null);
		vendorTwo.setModifiedDate("None");
		vendorTwo.setFindMe("None");
		vendorTwo.setPhoneScreenCount("0");
		vendorTwo.setInterviewCount("0");
		vendorTwo.setVendorType("REF");
		vendorTwo.setTotalJobs("None");
		vendorTwo.setLanguageSkills("None");
		vendorTwo.setActiveIndicator("1");
		
		MyVendorsView vendorThree = new MyVendorsView();
		vendorThree.setEmployer("None");
		vendorThree.setJobTitle("None");
		vendorThree.setModfdDate("2014-08-02 18:28:16");
		vendorThree.setActivityDate("2014-08-02 18:28:16");
		vendorThree.setCity("Cupertino");
		vendorThree.setState("CA");
		vendorThree.setCountry("United States");
		vendorThree.setInstitution("Cabbage College");
		vendorThree.setDegree("Bachelors");
		vendorThree.setAreaOfMajorStudy("Botany");
		vendorThree.setVendorId(new BigDecimal("495337830"));
		vendorThree.setPrimarySource("Employee Referral");
		vendorThree.setStatus("None");
		vendorThree.setGlobalStatus("Lead");
		vendorThree.setFirstName("Master");
		vendorThree.setLastName("Shifu");
		vendorThree.setVendorName("Master Shifu");
		vendorThree.setCreationDate("2014-02-15 15:00:47");
		vendorThree.setFlagtype("None");
		vendorThree.setSearchTerm("None");
		vendorThree.setQueryText(null);
		vendorThree.setModifiedDate("None");
		vendorThree.setFindMe("None");
		vendorThree.setPhoneScreenCount("0");
		vendorThree.setInterviewCount("0");
		vendorThree.setVendorType("REF");
		vendorThree.setTotalJobs("None");
		vendorThree.setLanguageSkills("None");
		vendorThree.setActiveIndicator("1");
		
		MyVendorsView vendorFour = new MyVendorsView();
		vendorFour.setEmployer("United Healthcare");
		vendorFour.setJobTitle("Health Services Representative");
		vendorFour.setModfdDate("2018-07-19 15:26:20");
		vendorFour.setActivityDate("2018-07-29 05:56:20");
		vendorFour.setCity("Norcross");
		vendorFour.setState("GA");
		vendorFour.setCountry("United States");
		vendorFour.setInstitution("Columbus Technical College");
		vendorFour.setDegree("Associate's Degree");
		vendorFour.setAreaOfMajorStudy("Associate of Computer Science");
		vendorFour.setVendorId(new BigDecimal("1044761921"));
		vendorFour.setPrimarySource("Monster Site");
		vendorFour.setStatus("None");
		vendorFour.setGlobalStatus("Offer");
		vendorFour.setFirstName("Mayer");
		vendorFour.setLastName("Lemon");
		vendorFour.setVendorName("Mayer Lemon");
		vendorFour.setCreationDate("2018-04-19 15:26:20");
		vendorFour.setFlagtype("None");
		vendorFour.setModifiedDate("2018-07-13 19:51:10");
		vendorFour.setFindMe("None");
		vendorFour.setPhoneScreenCount("0");
		vendorFour.setInterviewCount("0");
		vendorFour.setVendorType("EXT");
		vendorFour.setTotalJobs("3");
		vendorFour.setLanguageSkills("English");
		vendorFour.setActiveIndicator("1");
	
		MyVendorsView vendorFive = new MyVendorsView();
		vendorFive.setEmployer("Franklin Covey");
		vendorFive.setJobTitle("Assistant Manager");
		vendorFive.setModfdDate("2018-07-13 19:51:10");
		vendorFive.setActivityDate("2018-07-39 17:15:20");
		vendorFive.setCity("Fairfax");
		vendorFive.setState("Virginia");
		vendorFive.setCountry("United States");
		vendorFive.setInstitution("None");
		vendorFive.setDegree("None");
		vendorFive.setAreaOfMajorStudy("None");
		vendorFive.setVendorId(new BigDecimal("38330041"));
		vendorFive.setPrimarySource("BookMy Show");
		vendorFive.setStatus("None");
		vendorFive.setGlobalStatus("Offer");
		vendorFive.setFirstName("The Incredible");
		vendorFive.setLastName("Hulk");
		vendorFive.setVendorName("The Incredible Hulk");
		vendorFive.setCreationDate("2003-11-14 05:32:40");
		vendorFive.setFlagtype("None");
		vendorFive.setModifiedDate("2018-06-21 09:51:22");
		vendorFive.setFindMe("None");
		vendorFive.setPhoneScreenCount("0");
		vendorFive.setInterviewCount("0");
		vendorFive.setVendorType("EXT");
		vendorFive.setTotalJobs("3");
		vendorFive.setLanguageSkills("None");
		vendorFour.setActiveIndicator("1");
		
		vendorsList.add(vendorOne);
		vendorsList.add(vendorTwo);
		vendorsList.add(vendorThree);
		vendorsList.add(vendorFour);
		vendorsList.add(vendorFive);
		
	}
	
	@Test
	public void testSortAscendingByActivityDate() {
		
		String sortParam = "activityDate";
		String sortOrder = "ascending";
		
		sortUtil = new VendorEmployeeSortUtil(vendorsList, sortParam, sortOrder);
		List<MyVendorsView> sortVendors = sortUtil.sortVendors();
		System.out.println("Sorted Vendors = " + sortVendors);
		
	}
	
	@Test
	public void testSortDescendingByActivityDate() {
		
		String sortParam = "activityDate";
		String sortOrder = "descending";
		
		sortUtil = new VendorEmployeeSortUtil(vendorsList, sortParam, sortOrder);
		List<MyVendorsView> sortVendors = sortUtil.sortVendors();
		System.out.println("Sorted Vendors = " + sortVendors);
		
	}
	
	@Test
	public void testSortAscendingByLastName() {
		
		String sortParam = "lastName";
		String sortOrder = "ascending";
		
		sortUtil = new VendorEmployeeSortUtil(vendorsList, sortParam, sortOrder);
		List<MyVendorsView> sortVendors = sortUtil.sortVendors();
		System.out.println("Sorted Vendors = " + sortVendors);
		
	}
	
	@Test
	public void testSortDescendingByFirstName() {
		
		String sortParam = "firstName";
		String sortOrder = "descending";
		
		sortUtil = new VendorEmployeeSortUtil(vendorsList, sortParam, sortOrder);
		List<MyVendorsView> sortVendors = sortUtil.sortVendors();
		System.out.println("Sorted Vendors = " + sortVendors);
		
	}
	
	@Test
	public void testSortAscendingByDegree() {
		
		String sortParam = "degree";
		String sortOrder = "ascending";
		
		sortUtil = new VendorEmployeeSortUtil(vendorsList, sortParam, sortOrder);
		List<MyVendorsView> sortVendors = sortUtil.sortVendors();
		System.out.println("Sorted Vendors = " + sortVendors);
		
	}
}
