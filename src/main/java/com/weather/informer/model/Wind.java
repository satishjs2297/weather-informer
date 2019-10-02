
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
public class Wind implements Serializable {
	private final static long serialVersionUID = -1053358756604982046L;

    private Double speed;
    private Integer deg;
}
