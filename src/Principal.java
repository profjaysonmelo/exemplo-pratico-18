import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe um valor: ");
		
		try {
			System.out.println("Resultado: " + Integer.parseInt(valor) * 3);
		} catch (NumberFormatException e) {
			System.out.println("Número inválido!");
		}
		
	}
	
}
