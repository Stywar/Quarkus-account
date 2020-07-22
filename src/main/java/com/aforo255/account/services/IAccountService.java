package com.aforo255.account.services;

import java.util.List;
import com.aforo255.account.domain.Account;

public interface IAccountService {
	public List<Account> findAllAccount();
	public  Account findAccountById(Integer id);	
	public Account mergeAccount (Account account);
}
