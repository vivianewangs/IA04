//Classe pour contenir les messages entre les agents factorielle et multiplication
public class Operation {
	//Les attributs de la classe déterminent l'operation à réaliser et ses arguments
	private String operation;
	private double arg1, arg2;
	
	//Différents constructeurs de la classe
	public Operation(String _op, double _arg1, double _arg2){
		operation = _op;
		arg1 = _arg1;
		arg2 = _arg2;
	}
	
	public Operation(String _op, double _arg1){
		operation = _op;
		arg1 = _arg1;
		arg2 = 0;
	}
	
	public Operation(String _op){
		operation = _op;
		arg1 = 0;
		arg2 = 0;
	}
	
	public Operation(){
		operation = "";
		arg1 = 0;
		arg2 = 0;
	}
	
	//Accesseurs des attributs
	public String getOperation(){
		return operation;
	}
	
	public double getArg1(){
		return arg1;
	}
	
	public double getArg2(){
		return arg2;
	}
}
