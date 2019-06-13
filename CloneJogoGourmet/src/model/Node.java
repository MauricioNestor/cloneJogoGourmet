package model;

public class Node {
	
	private String veiculo;
	
	private Node nodeAcertou;
	
	private Node nodeErrou;
	
	public Node(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public Node getNodeAcertou() {
		return nodeAcertou;
	}

	public void setNodeAcertou(Node nodeAcertou) {
		this.nodeAcertou = nodeAcertou;
	}

	public Node getNodeErrou() {
		return nodeErrou;
	}

	public void setNodeErrou(Node nodeErrou) {
		this.nodeErrou = nodeErrou;
	}
}
