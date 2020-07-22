package com.aforo255.account;

import java.util.Collection;
import java.util.concurrent.CompletionStage;

import javax.annotation.security.RolesAllowed;
//import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.aforo255.account.domain.Currency;
import com.aforo255.account.services.CurrencyService;

@Path("/crypto")
//@ApplicationScoped

public class CryptoResource {

	@Inject
	@RestClient
	private CurrencyService currencyService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@RolesAllowed({"Admin"})
	public CompletionStage< Collection<Currency>> getCrypto(@QueryParam("id") String id) {

		return currencyService.getCurrency(id);

	}

	/*
	 * @GET
	 * 
	 * @Produces(MediaType.TEXT_PLAIN) public String getCrypto() {
	 * //System.out.print(currencyService.getCurrency("90")); return "Hola"; }
	 */
}