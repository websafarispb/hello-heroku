package ru.stepev.helloheroku.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Cat {
	
	private int id;
	private String name;
}
