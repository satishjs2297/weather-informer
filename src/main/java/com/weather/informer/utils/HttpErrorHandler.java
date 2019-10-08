package com.weather.informer.utils;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.DefaultResponseErrorHandler;

public class HttpErrorHandler extends DefaultResponseErrorHandler {
	private static final Logger LOG = LogManager.getLogger(HttpErrorHandler.class);

	@Override
	public void handleError(ClientHttpResponse httpResponse) throws IOException {
		super.handleError(httpResponse);
		LOG.warn("Error @ Handling http request :: Status ::  "+httpResponse.getStatusText());
		
	}


}
