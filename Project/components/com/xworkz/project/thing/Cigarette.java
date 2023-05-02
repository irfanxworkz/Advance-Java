package com.xworkz.project.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cigarette {
	
	@Value("DavidOff Gold")
	private String name;
	@Value("Zino Davidoff")
	private String founder;
	@Value("Tobacco")
	private String material;
	@Value("Carbon Monoxide")
	private String chemicalUsed;
	@Value("White")
	private String cigaretteColor;
	
	private String type;
	private String madeByCountry;
	private int pricePerCigarette;
	private int pricePerBox;
	private int noOfCigaretteInBox;
	
	
	private double cigrateSize;
	
	private double filterSize;
	
	private double wrapperSize;
	
	private double boxSize;
	
	private double tabbacoQuantity;
	
	public Cigarette(@Value("Private") String type,@Value("Basel, Switzerland") String madeByCountry,@Value("60") int pricePerCigarette,@Value("1200") int pricePerBox,@Value("20") int noOfCigaretteInBox) {
		super();
		this.type = type;
		this.madeByCountry = madeByCountry;
		this.pricePerCigarette = pricePerCigarette;
		this.pricePerBox = pricePerBox;
		this.noOfCigaretteInBox = noOfCigaretteInBox;
	}

	@Value("5.5")
	public void setCigrateSize(double cigrateSize) {
		this.cigrateSize = cigrateSize;
	}
	@Value("1.6")
	public void setFilterSize(double filterSize) {
		this.filterSize = filterSize;
	}

	@Value("3.9")
	public void setWrapperSize(double wrapperSize) {
		this.wrapperSize = wrapperSize;
	}
	
	@Value("6.3")
	public void setBoxSize(double boxSize) {
		this.boxSize = boxSize;
	}

	@Value("4.5")
	public void setTabbacoQuantity(double tabbacoQuantity) {
		this.tabbacoQuantity = tabbacoQuantity;
	}
	
	public void order() {
		System.out.println("invoked orger method from Cigarette class");
	}
	

	@Override
	public String toString() {
		return "Cigarette [name=" + name + ", founder=" + founder + ", material=" + material + ", chemicalUsed="
				+ chemicalUsed + ", cigaretteColor=" + cigaretteColor + ", type=" + type + ", madeByCountry="
				+ madeByCountry + ", pricePerCigarette=" + pricePerCigarette + ", pricePerBox=" + pricePerBox
				+ ", noOfCigaretteInBox=" + noOfCigaretteInBox + ", cigrateSize=" + cigrateSize + ", filterSize="
				+ filterSize + ", wrapperSize=" + wrapperSize + ", boxSize=" + boxSize + ", tabbacoQuantity="
				+ tabbacoQuantity + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
