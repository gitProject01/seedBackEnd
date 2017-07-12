package com.seedbackend.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Indice {

	public Indice () {
		super ();
	}

	private String id;
	private String ChampA;
	private String ChampB;
	private String ChampC;
	public Indice(String id, String champA, String champB, String champC, String champD, String indicateur1,
			String modif1, String indicateur2, String modif2) {
		super();
		this.id = id;
		ChampA = champA;
		ChampB = champB;
		ChampC = champC;
		ChampD = champD;
		this.indicateur1 = indicateur1;
		Modif1 = modif1;
		this.indicateur2 = indicateur2;
		Modif2 = modif2;
	}

	private String ChampD;

	private String indicateur1;
	private String Modif1;
	private String indicateur2;
	private String Modif2;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getChampA() {
		return ChampA;
	}
	public void setChampA(String champA) {
		ChampA = champA;
	}
	public String getChampB() {
		return ChampB;
	}
	public void setChampB(String champB) {
		ChampB = champB;
	}
	public String getChampC() {
		return ChampC;
	}
	public void setChampC(String champC) {
		ChampC = champC;
	}
	public String getChampD() {
		return ChampD;
	}
	public void setChampD(String champD) {
		ChampD = champD;
	}
	public String getIndicateur1() {
		return indicateur1;
	}
	public void setIndicateur1(String indicateur1) {
		this.indicateur1 = indicateur1;
	}
	public String getModif1() {
		return Modif1;
	}
	public void setModif1(String modif1) {
		Modif1 = modif1;
	}
	public String getIndicateur2() {
		return indicateur2;
	}
	public void setIndicateur2(String indicateur2) {
		this.indicateur2 = indicateur2;
	}
	public String getModif2() {
		return Modif2;
	}
	public void setModif2(String modif2) {
		Modif2 = modif2;
	}

}
