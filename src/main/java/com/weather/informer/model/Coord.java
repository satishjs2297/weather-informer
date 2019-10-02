
package com.weather.informer.model;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Coord implements Serializable {
	private final static long serialVersionUID = -6542800738107987964L;

	private Double lon;
	private Double lat;

}
