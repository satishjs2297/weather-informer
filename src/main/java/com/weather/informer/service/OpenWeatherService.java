package com.weather.informer.service;

import java.util.List;
import java.util.Set;

import com.weather.informer.model.WeatherDetails;

public interface OpenWeatherService {

	Set<WeatherDetails> getWeatherInfoByCities(List<String> cities);

}
