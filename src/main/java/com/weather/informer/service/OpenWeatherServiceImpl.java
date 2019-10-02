package com.weather.informer.service;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

import com.weather.informer.constants.WeatherConstants;
import com.weather.informer.model.WeatherDetails;
import com.weather.informer.utils.RestTemplateUtil;

@Service
public class OpenWeatherServiceImpl implements OpenWeatherService {
	private static final Logger LOG = LogManager.getLogger(OpenWeatherServiceImpl.class);

	@Override
	public Set<WeatherDetails> getWeatherInfoByCities(List<String> cities) {
		Set<WeatherDetails> weathers = cities.parallelStream()
						  				.map(this::getOpenWeatherInfoByCity)
						  				.filter(Objects::nonNull)
						  				.collect(Collectors.toSet());
		LOG.info("weathers :: {}", weathers);
		return weathers;
	}

	private WeatherDetails getOpenWeatherInfoByCity(String city) {
		try {
			String absolutWeatherUrl = WeatherConstants.OPEN_WEATHER_URL.concat(city);
			return RestTemplateUtil.getInstance().getForObject(absolutWeatherUrl, WeatherDetails.class);
		} catch (RestClientException ex) {
			LOG.error("Failed to get OpenWeather InfoBy City report:: {}", ex.getMessage());
		}
		return null;
	}

}
