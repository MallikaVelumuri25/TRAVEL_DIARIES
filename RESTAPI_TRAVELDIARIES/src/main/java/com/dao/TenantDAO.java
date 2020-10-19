package com.dao;

import com.dto.Tenant;
import com.dto.Traveller;
import com.ts.db.HibernateTemplate;

public class TenantDAO {
	public int register(Tenant tenant) {
		System.out.println(tenant); 
		return HibernateTemplate.addObject(tenant);
	}

	public Tenant getTenantByUserPass(String mailId, String password) {
		// TODO Auto-generated method stub
		System.out.println("DAO "+mailId + " " + password);

		return (Tenant)HibernateTemplate.getObjectByUserPassTenant(mailId,password);
	}

}
