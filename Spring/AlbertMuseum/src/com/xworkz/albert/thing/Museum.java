package com.xworkz.albert.thing;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.ToString;

@Component
@ToString
@AllArgsConstructor
public class Museum {
	
	private String museumName;
	private EntryFee entryFee;

}
