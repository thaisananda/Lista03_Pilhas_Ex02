package viewPilha03;

import ListaPilha03Controller.controllerPilha;

public class Principal2 {
	
	 public static void main(String[] args) {
	        try {
	        	controllerPilha controller = new controllerPilha();
	            controller.executarExercicio2();
	        } catch (Exception e) {
	            System.out.println("Erro: " + e.getMessage());
	        }
	    }
}

