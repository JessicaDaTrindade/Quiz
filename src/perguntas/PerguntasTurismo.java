package perguntas;

import java.util.ArrayList;

public class PerguntasTurismo {
	
	//ATRIB
	private String Pergunta, AlternativaA, AlternativaB, AlternativaC, AlternativaD, Correta;
	public static ArrayList<PerguntasTurismo> dados = new ArrayList<>();
	public String getPergunta() {
		return Pergunta;
	}
	public void setPergunta(String pergunta) {
		Pergunta = pergunta;
	}
	public String getAlternativaA() {
		return AlternativaA;
	}
	public void setAlternativaA(String alternativaA) {
		AlternativaA = alternativaA;
	}
	public String getAlternativaB() {
		return AlternativaB;
	}
	public void setAlternativaB(String alternativaB) {
		AlternativaB = alternativaB;
	}
	public String getAlternativaC() {
		return AlternativaC;
	}
	public void setAlternativaC(String alternativaC) {
		AlternativaC = alternativaC;
	}
	public String getAlternativaD() {
		return AlternativaD;
	}
	public void setAlternativaD(String alternativaD) {
		AlternativaD = alternativaD;
	}
	public String getCorreta() {
		return Correta;
	}
	public void setCorreta(String correta) {
		Correta = correta;
	}


}
