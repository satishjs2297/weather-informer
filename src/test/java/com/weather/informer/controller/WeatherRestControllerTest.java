package com.weather.informer.controller;

import java.util.Collections;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.weather.informer.model.WeatherDetails;
import com.weather.informer.service.OpenWeatherService;

public class WeatherRestControllerTest {

	@Mock
	private OpenWeatherService openWeatherServiceMock;

	@InjectMocks
	private WeatherRestController weatherRestController;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetWeatherInfoByCities() {
		Mockito.when(openWeatherServiceMock.getWeatherInfoByCities(Mockito.anyList()))
				.thenReturn(Collections.singleton(new WeatherDetails()));
		Set<WeatherDetails> weathersByCities = weatherRestController.getWeatherInfoByCities(Collections.emptyList()).getBody();
		Assert.assertNotNull(weathersByCities);
	}

}
