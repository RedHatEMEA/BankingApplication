package com.redhat.techstock.customerservices.services;


import com.google.gson.Gson;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.List;

/**
 * Created by sterpico on 23/06/15.
 */
public class JsonProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		Gson gson = new Gson();
		List list = exchange.getIn().getBody(List.class);
		String json = gson.toJson(list);
		exchange.getOut().setBody(json);
	}
}
