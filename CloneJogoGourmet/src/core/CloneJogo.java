package core;

import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.JOptionPane;

import core.binaryTree.Arvore;

public class CloneJogo {

	public static void main(String[] args) {
		Arvore arvore = new Arvore();

		arvore = arvore.inicializaArvore();
		
		int i = 0;
		do {
			showMessageDialog(null, "Pense no seu veículo favorito", "Clone Jogo", JOptionPane.INFORMATION_MESSAGE);
			
			int acertouResposta = showConfirmDialog(null, "O veículo que você pensou é: " + arvore.getArvore().getVeiculo(), "Clone Jogo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			
			if(acertouResposta == JOptionPane.YES_OPTION) {
				arvore.perguntar(arvore.getArvore().getNodeAcertou());
			}else if (acertouResposta == JOptionPane.NO_OPTION){
				arvore.perguntar(arvore.getArvore().getNodeErrou());
			}
			if(acertouResposta == JOptionPane.CLOSED_OPTION) {
				i++;
			}
		} while (i == 0);
	}

}
