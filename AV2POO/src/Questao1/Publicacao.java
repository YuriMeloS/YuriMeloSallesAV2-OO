package Questao1;

public class Publicacao {
	String dtaPubli, txtPubli, linkMidia;
	public static double contadorPubli;
	public Publicacao(String dtaPubli, String txtPubli, String linkMidia) {
		this.dtaPubli = dtaPubli;
		this.txtPubli = txtPubli;
		this.linkMidia = linkMidia;
		contadorPubli++;
	}
	public String getDtaPubli() {
		return dtaPubli;
	}
	public String getTxtPubli() {
		return txtPubli;
	}
	public void setTxtPubli(String txtPubli) {
		this.txtPubli = txtPubli;
	}
	public String getLinkMidia() {
		return linkMidia;
	}
	public void setLinkMidia(String linkMedia) {
		this.linkMidia = linkMedia;
	}
	public static double getContadorPubli() {
		return contadorPubli;
	}
	
	
	
}
