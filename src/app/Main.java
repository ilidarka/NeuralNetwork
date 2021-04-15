package app;

import network.Network;
import network.neuron.Neuron;

public class Main {
	
	public static void main(String[] args) {
		Neuron h1 = new Neuron(0, 1, 0);
		Neuron h2 = new Neuron(0, 1, 0);
		Neuron o1 = new Neuron(0, 1, 0);
		Network network = new Network(h1, h2, o1);
		
		System.out.println(network.countOutput(2, 3));
		
		double YTrue[] = {1, 0, 0, 1};
		double YPred[] = {0, 0, 0, 0};
		
		System.out.println(network.MSELoss(YTrue, YPred));
	}

}
