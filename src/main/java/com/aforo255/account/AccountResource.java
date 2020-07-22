package com.aforo255.account;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.aforo255.account.domain.Account;
import com.aforo255.account.services.IAccountService;

@Path("/account")
public class AccountResource {

	@Inject
	IAccountService accountService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listar")
	public   List<Account> listar() {
		
		return accountService.findAllAccount();
	}

	@GET
	@Path("/ver/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public  Account detalle(@PathParam("id") Integer id) {

	 Account account = accountService.findAccountById(id);
		return account;
	}

}
