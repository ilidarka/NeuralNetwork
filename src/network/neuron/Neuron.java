package network.neuron;

public class Neuron {
	
	private int weight1;
	private int weight2;
	private int bias;
	
	public Neuron(int weight1, int weight2, int bias) {
		this.weight1 = weight1;
		this.weight2 = weight2;
		this.bias = bias;
	}
	
	public double feedForward(int x1, int x2) {
		int total = (x1 * weight1) + ((x2 * weight2) + bias); 
		return sigmoid(total);
	}

	private double sigmoid(int x) {
		return 1 / (1 + Math.pow(Math.E, -x));
	}
	
}
