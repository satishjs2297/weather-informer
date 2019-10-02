
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
public class Clouds implements Serializable {
	private final static long serialVersionUID = -109148208102535158L;

	private Integer all;
}
