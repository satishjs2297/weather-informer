
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
public class Weather implements Serializable {
	private final static long serialVersionUID = -63471897927123371L;

    private Integer id;
    private String main;
    private String description;
    private String icon;
}
