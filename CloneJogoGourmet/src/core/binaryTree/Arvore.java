package core.binaryTree;

import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showInputDialog;

import javax.swing.JOptionPane;

import model.Node;

public class Arvore {
	private Node raiz;

	public Node getArvore() {
		return raiz;
	}

	public void setRaiz(Node raiz) {
		this.raiz = raiz;
	}

	public void perguntar(Node node) {
		int acertouResposta = showConfirmDialog(null, "O ve�culo que voc� pensou �: " + node.getVeiculo(), "Clone Jogo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		
		if(acertouResposta == JOptionPane.YES_OPTION) {
			if(node.getNodeErrou() == null) {
				JOptionPane.showMessageDialog(null, "Acertei!");
			}else {
				perguntar(node.getNodeErrou());
			}
		}else if(acertouResposta == JOptionPane.NO_OPTION){
			if (node.getNodeAcertou() == null){
				inserirVeiculo(node);
			} else {
				perguntar(node.getNodeAcertou());
			}
		}
	}

	private void inserirVeiculo(Node node) {
		String veiculo = showInputDialog(null, "Qual Ve�culo voc� pensou?");
		
		String classe = showInputDialog("Um(a) " + veiculo + " � um ________, mas um(a) " + node.getVeiculo() + " n�o .");
		
		String aux = node.getVeiculo();
		node.setVeiculo(classe);
		node.setNodeErrou(new Node(veiculo));
		node.setNodeAcertou(new Node(aux));
	}

	public Arvore inicializaArvore() {

		if (this.getArvore() == null) {
			this.setRaiz(new Node("Sedan"));
			this.getArvore().setNodeAcertou(new Node("BMW S�rie 3"));
			this.getArvore().setNodeErrou(new Node("F-350"));
		}
		return this;
	}
}
