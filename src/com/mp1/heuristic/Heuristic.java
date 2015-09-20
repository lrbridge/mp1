package com.mp1.heuristic;

import com.mp1.node.State;

public interface Heuristic {

	public int computeHeuristic(State goalState, int x, int y, int forwardCost, int turnCost);
	
}
