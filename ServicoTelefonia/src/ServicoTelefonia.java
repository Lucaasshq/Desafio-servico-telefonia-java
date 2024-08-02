import java.util.Scanner;

public class ServicoTelefonia {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
		System.out.println("Digite o nome do serviço que deseja verificar:");
        String servico = scanner.nextLine().trim();
        
        
       // Entrada do nome do cliente e os serviços contratados
        System.out.println("Digite seu nome e separado por virgulas os os serviços contratados, ex: Lucas,movel,fixa");
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] arrayList = entradaCliente.split(",");
        String nomeCliente = arrayList[0];
        
        boolean contratado = false;
        
        for (int i = 1; i < arrayList.length; i++) {
			if(arrayList[i].trim().equalsIgnoreCase(servico)) {
				contratado = true;
				break;
				
			}
		}
        
        if(contratado) {
        	System.out.println(nomeCliente.toUpperCase() + " CONTRATOU O SERVIÇO " + servico.toUpperCase());
        }
        
        
		
        
		
	}
}
