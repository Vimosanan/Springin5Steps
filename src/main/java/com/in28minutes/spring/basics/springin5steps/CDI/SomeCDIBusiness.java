package com.in28minutes.spring.basics.springin5steps.CDI;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBusiness {

	@Inject
	SomeCDIDAO someCDIDAO;

	public SomeCDIDAO getSomeCDIDAO() {
		return someCDIDAO;
	}

	public void setSomeCDIDAO(SomeCDIDAO someCDIDAO) {
		this.someCDIDAO = someCDIDAO;
	}

	public int findGreatest() {
		int[] datas = someCDIDAO.getData();
		int maxValue = Integer.MIN_VALUE;
		for (int data : datas) {
			if (data > maxValue) {
				maxValue = data;
			}
		}

		return maxValue;
	}

}
