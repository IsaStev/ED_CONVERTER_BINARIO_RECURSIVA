package view;
import javax.swing.JOptionPane;
import controller.ConversaoBinarioController;
//RECEBE DECIMAL E CONVERTE PARA BINARIO
public class ConversaoBinarioView {

	public static void main(String[] args) {
		
		ConversaoBinarioController bc = new ConversaoBinarioController();
        
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (até 2000):"));
        
		if (n >= 0 && n <= 2000) {
            String result = n == 0 ? "0" : bc.decToBin(n);
            System.out.println("Binário: " + result);
        }
	}
}