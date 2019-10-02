
package com.weather.informer.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Main implements Serializable {
	private final static long serialVersionUID = -4557842811866762595L;

	private Double temp;
	private Integer pressure;
	private Integer humidity;
	@JsonProperty("temp_min")
	private Double tempMin;
	@JsonProperty("temp_max")
	private Double tempMax;

}
