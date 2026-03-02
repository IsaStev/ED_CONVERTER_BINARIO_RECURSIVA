package controller;
//RECEBE DECIMAL E CONVERTE PARA BINARIO
public class ConversaoBinarioController {

	public ConversaoBinarioController() {
		super();
	}

	public String decToBin(int n) {
        //CONDIÇÃO DE PARADA
        if (n == 0) {
            return "";
        }
        //CHAMADA
        return decToBin(n / 2) + String.valueOf(n % 2); // [cite: 50, 51]
    }
}