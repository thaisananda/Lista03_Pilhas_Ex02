package ListaPilha03Controller;

import model.Pilha;

public class controllerPilha {
	
	public controllerPilha() {
		super();
	}
	
	public void executarPilhaInt(int[] vetor) {
        try {
            Pilha pilha = new Pilha();

            for (int valor : vetor) {
                if (valor >= 0) {
                    pilha.push(valor);
                } else {
                    if (!pilha.isEmpty()) {
                        int a = pilha.pop();
                        int b = pilha.pop();
                        int soma = a + b;

                        pilha.push(valor);
                        pilha.push(soma);
                    }
                }
            }

            int count = 0;
            while (!pilha.isEmpty()) {
                pilha.pop();
                count++;
            }

            System.out.println("Quantidade de elementos na pilha: " + count);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
	
	 public void executarExercicio2() throws Exception {
	        Pilha pilhaOriginal = new Pilha();
	        Pilha pilhaFinal = new Pilha();

	        // Inserir da base ao topo (J até W)
	        pilhaOriginal.push('J');
	        pilhaOriginal.push('G');
	        pilhaOriginal.push('R');
	        pilhaOriginal.push('B');
	        pilhaOriginal.push('H');
	        pilhaOriginal.push('L');
	        pilhaOriginal.push('W');

	        while (!pilhaOriginal.isEmpty()) {
	            char elemento = (char) pilhaOriginal.pop();

	            if (elemento == 'W' || elemento == 'R') {
	                System.out.println(elemento); // imprime no console
	            } else if (elemento == 'L' || elemento == 'B' || elemento == 'G') {
	                pilhaFinal.push(elemento);
	            }
	        }

	        // Adiciona os elementos novos conforme esperado
	        pilhaFinal.push('M');
	        pilhaFinal.push('K');

	        // Pronto! pilhaFinal está na ordem esperada
	    }
}
