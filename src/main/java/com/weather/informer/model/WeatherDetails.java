
package com.weather.informer.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class WeatherDetails implements Serializable {
	private final static long serialVersionUID = 1942407613139547982L;

	private Coord coord;
	private List<Weather> weather = new ArrayList<Weather>();
	private String base;
	private Main main;
	private Integer visibility;
	private Wind wind;
	private Clouds clouds;
	private Integer dt;
	private Sys sys;
	private Integer id;
	private String name;
	private Integer cod;

}
