package com.dao;

import com.dto.Traveller;
import com.ts.db.HibernateTemplate;

public class TravellerDAO {
	public int register(Traveller traveller) {
		System.out.println(traveller); 
		return HibernateTemplate.addObject(traveller);
	}

	public Traveller getTravellerByUserPass(String mailId, String password) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("DAO "+mailId + " " + password);

				return (Traveller)HibernateTemplate.getObjectByUserPassTraveller(mailId,password);
	}


}
