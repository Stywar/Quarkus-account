package com.aforo255.account.repository;
import javax.enterprise.context.ApplicationScoped;

import com.aforo255.account.domain.Account;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class AccountRepository implements PanacheRepositoryBase<Account,Integer> {

	/*public List<Account> findAllAccount() {
		return findAll().list();
	}
	
	public Account findAccountById(Integer id) {
		
		return findById(id);
	}*/

}
