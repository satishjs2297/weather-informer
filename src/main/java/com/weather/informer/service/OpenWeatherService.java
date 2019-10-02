package com.weather.informer.service;

import java.util.List;

import com.weather.informer.model.WeatherDetails;

public interface OpenWeatherService {

	List<WeatherDetails> getWeatherInfoByCities(List<String> cities);

}
