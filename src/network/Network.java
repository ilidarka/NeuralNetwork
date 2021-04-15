package network;

import network.neuron.Neuron;

/** 
 * Neural network with:
 * - 2 inputs
 * - 1 hidden layer with 2 neurons (h1, h2)
 * - 1 output layer with 1 neuron (01)
 * */

public class Network {
	
	private Neuron h1;
	private Neuron h2;
	private Neuron o1;
			
	public Network(Neuron h1, Neuron h2, Neuron o1) {
		this.h1 = h1;
		this.h2 = h2;
		this.o1 = o1;
	}
		
	public double countOutput(double input1, double input2) {
		return this.o1.feedForward(this.h1.feedForward(input1, input2), this.h2.feedForward(input1, input2));
	}
	
	public double MSELoss(double YTrue[], double YPred[]) {
		if(YTrue.length == YPred.length) {
			double result[] = new double[YTrue.length];
			for(int i = 0; i < YTrue.length; i++) {
				result[i] = Math.pow(YTrue[i] - YPred[i], 2);
			}
			return mean(result);
		} 
		return 0;
	}
	
	private double mean(double result[]) {
		double sum = 0;
		for(int i = 0; i < result.length; i++) {
			sum += result[i];
		}
		return sum / result.length;
	}
	
}
