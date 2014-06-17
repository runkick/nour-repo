package com.kamel.brasil.bean;

public class PronosBean {

	private String pronos1;
	private String pronos2;
	public String getPronos1() {
		return pronos1;
	}
	public void setPronos1(String pronos1) {
		this.pronos1 = pronos1;
	}
	public String getPronos2() {
		return pronos2;
	}
	public void setPronos2(String pronos2) {
		this.pronos2 = pronos2;
	}
	
	/**
	 * concataine les deux pronostiques
	 * @return le pronostique
	 */
	public String construirePronos(){
		return pronos1+"-"+pronos2;
	}
}
