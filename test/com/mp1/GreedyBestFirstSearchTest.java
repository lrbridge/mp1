package com.mp1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mp1.search.GreedyBestFirstSearch;
import com.mp1.search.base.Search;
import com.mp1.solution.MazeSolution;

public class GreedyBestFirstSearchTest {

	private void assertMazesAreEqual(MazeSolution actual, char[][] expectedPath) {
		assertEquals(actual.path.length, expectedPath.length);
		for(int i=0; i<actual.path.length; i++) {
			assertArrayEquals(actual.path[i], expectedPath[i]);
		}
	}
	
	@Test
	public void gbfsSimple() {
		System.out.println("Greedy Best First Search - simple");
		
		char[][] expectedPath = {
				{ '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%' },
				{ '%', '.', '.', '.', '.', '.', '%', '.', '.', '.', '.', '%' },
				{ '%', '%', '%', '%', '%', '.', '.', '.', '%', '%', 'P', '%' },
				{ '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%' } };

		Search x = new GreedyBestFirstSearch("simpleMaze.txt");
		MazeSolution actual = x.solve();

		System.out.println(actual.toString());
		
		assertEquals(actual.pathCost, 12);
		assertEquals(actual.numNodesExpanded, 13);
		assertMazesAreEqual(actual, expectedPath);
	}

    @Test
    public void gbfsSmall() {
        System.out.println("Greedy Best First Search - Small");

        char[][] expectedPath = {
                { '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%' },
                { '%', '.', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', '.', '.', '.', '%', ' ', '%', ' ', '%' },
                { '%', '.', '%', '%', ' ', '%', ' ', '%', '%', '%', '%', '%', ' ', '%', ' ', '.', ' ', '.', '.', '.', ' ', ' ', '%' },
                { '%', '.', '%', '.', '.', '.', '.', '.', '.', '.', '%', ' ', ' ', ' ', '%', '.', '%', ' ', '%', '.', '%', ' ', '%' },
                { '%', '.', '.', '.', '%', '%', ' ', '%', '%', '.', '%', '%', '%', ' ', '%', '.', ' ', ' ', '%', '.', '%', '%', '%' },
                { '%', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', '.', '.', '.', '.', '.', '.', '.', '%', ' ', '%', '.', '.', 'P', '%' },
                { '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%' },
        };

        Search x = new GreedyBestFirstSearch("smallMaze.txt");
        MazeSolution actual = x.solve();

        System.out.println(actual.toString());

        assertEquals(actual.pathCost, 34);
        assertEquals(actual.numNodesExpanded, 53);
        assertMazesAreEqual(actual, expectedPath);
    }

    @Test
    public void gbfsMedium() {
        System.out.println("Greedy Best First Search - Medium");

        char[][] expectedPath = {
                { '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%' },
                { '%', '.', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', '%' },
                { '%', '.', ' ', ' ', '%', ' ', ' ', ' ', '%', '%', ' ', '%', ' ', '%', '%', '%', '%', ' ', '%', '%', ' ', ' ', '%' },
                { '%', '.', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%' },
                { '%', '.', '%', '%', ' ', '%', '%', '%', ' ', ' ', ' ', ' ', ' ', '%', '%', ' ', '%', '%', ' ', '%', '%', '%', '%' },
                { '%', '.', '%', ' ', '%', '.', '.', '.', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', '%' },
                { '%', '.', '%', '%', '%', '.', '%', '.', '%', '%', '%', ' ', ' ', '%', ' ', '.', '.', '.', '%', '%', ' ', '%', '%' },
                { '%', '.', '%', ' ', '%', '.', ' ', '.', '.', '.', ' ', ' ', '%', ' ', '%', '.', '%', '.', ' ', ' ', '%', ' ', '%' },
                { '%', '.', '.', '.', '.', '.', '%', ' ', '%', '.', '%', '%', '%', '.', '.', '.', '%', '.', '%', ' ', ' ', ' ', '%' },
                { '%', ' ', '%', ' ', '%', ' ', '%', ' ', ' ', '.', '.', '.', '%', '.', '%', ' ', '%', '.', ' ', ' ', '%', ' ', '%' },
                { '%', ' ', ' ', ' ', '%', '%', '%', ' ', '%', '%', '%', '.', '%', '.', '%', ' ', ' ', '.', '%', ' ', '%', '%', '%' },
                { '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%', '.', '.', '.', ' ', ' ', '%', '.', ' ', ' ', ' ', ' ', '%' },
                { '%', '%', ' ', '%', ' ', '%', '%', ' ', ' ', ' ', ' ', '%', '%', '%', '%', ' ', '%', '.', '%', '%', ' ', '%', '%' },
                { '%', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', '.', ' ', ' ', '%', ' ', '%' },
                { '%', ' ', ' ', ' ', '%', '%', ' ', '%', '%', ' ', '%', '%', ' ', '%', '%', '%', '%', '.', '%', '%', ' ', ' ', '%' },
                { '%', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', '%', '.', '%', ' ', '%', ' ', '%' },
                { '%', '%', '%', '%', ' ', '%', '%', ' ', '%', '%', ' ', ' ', '%', '%', ' ', '%', ' ', '.', ' ', '%', ' ', '%', '%' },
                { '%', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', '.', '%', ' ', '%', ' ', '%' },
                { '%', ' ', '%', '%', ' ', '%', ' ', '%', '%', '%', '%', '%', ' ', '%', ' ', ' ', ' ', '.', '.', '.', ' ', ' ', '%' },
                { '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', '.', '%', ' ', '%' },
                { '%', ' ', ' ', ' ', '%', '%', ' ', '%', '%', ' ', '%', '%', '%', ' ', '%', ' ', ' ', ' ', '%', '.', '%', '%', '%' },
                { '%', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%', '.', '.', 'P', '%' },
                { '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%' },
        };

        Search x = new GreedyBestFirstSearch("mediumMaze.txt");
        MazeSolution actual = x.solve();

        System.out.println(actual.toString());

        assertEquals(actual.pathCost, 56);
        assertEquals(actual.numNodesExpanded, 80);
        assertMazesAreEqual(actual, expectedPath);
    }

    @Test
    public void gbfsBig() {
        System.out.println("Greedy Best First Search - Big");

        char[][] expectedPath = {
                { '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%' },
                { '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%' },
                { '%', '%', ' ', '%', ' ', '%', ' ', '%', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', '%', ' ', '%', ' ', '%', ' ', ' ', ' ', '%' },
                { '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%' },
                { '%', '%', ' ', '%', ' ', '%', '%', ' ', '%', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', ' ', '%', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', ' ', '%', '%', ' ', '%', '%', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%' },
                { '%', ' ', '%', ' ', '%', ' ', '%', '%', ' ', '%', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', '%', ' ', '%', ' ', ' ', '%', ' ', '%', ' ', '%', '%', ' ', ' ', '%', ' ', '%' },
                { '%', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', '%' },
                { '%', ' ', ' ', '%', ' ', '%', '%', ' ', '%', ' ', '%', ' ', ' ', '%', ' ', '%', ' ', '%', '%', '%', '%', ' ', '%', ' ', ' ', ' ', '%', '%', ' ', '%', ' ', ' ', '%', '%', ' ', '%', '%' },
                { '%', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', '%' },
                { '%', '%', ' ', '%', ' ', '%', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', '%', ' ', '%', '%', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', '%', ' ', '%' },
                { '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%' },
                { '%', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', ' ', '%', '%', ' ', ' ', '%', ' ', '%', '%', ' ', '%', '%', ' ', '%', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', '%' },
                { '%', ' ', '%', ' ', '%', '%', ' ', '%', ' ', '%', '%', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', '%', '%', '%', ' ', '%' },
                { '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%' },
                { '%', ' ', '%', ' ', ' ', '%', '%', ' ', ' ', '%', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', '%', '%', ' ', '%', '%', '%', ' ', '%', '%' },
                { '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%' },
                { '%', ' ', '%', ' ', ' ', '%', ' ', '%', ' ', '%', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', '%', '%', ' ', '%', ' ', '%', '%', ' ', '%', ' ', '%', ' ', '%', '%', ' ', '%', ' ', '%' },
                { '%', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', ' ', '%' },
                { '%', ' ', '%', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', '%', ' ', ' ', '%', '%', ' ', ' ', '%', '%', ' ', '%', ' ', '%', '%', ' ', '%', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', '%' },
                { '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', '%' },
                { '%', '%', ' ', ' ', '%', ' ', '%', '%', '%', ' ', ' ', ' ', ' ', '%', '%', '%', ' ', '%', '%', ' ', '%', ' ', ' ', '%', '%', '%', ' ', '%', '%', '%', ' ', '%', '%', ' ', ' ', ' ', '%' },
                { '%', ' ', '%', '.', '.', '.', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%' },
                { '%', ' ', '%', '.', '%', '.', '%', ' ', '%', '%', ' ', '%', '%', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', '%', ' ', '%', ' ', '%', ' ', '%', '%', ' ', '%', '%', '%' },
                { '%', ' ', ' ', '.', '%', '.', '.', '.', '.', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%' },
                { '%', '%', '%', '.', ' ', '%', ' ', '%', '.', '%', '%', ' ', '%', '.', '.', '.', '%', ' ', '%', ' ', '%', ' ', '%', '%', ' ', ' ', '%', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', '%', '%' },
                { '%', ' ', '%', '.', '%', ' ', '%', ' ', '.', '.', '.', '.', '.', '.', '%', '.', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%' },
                { '%', '%', ' ', '.', ' ', ' ', ' ', '%', '%', '%', ' ', '%', ' ', '%', ' ', '.', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', '%', ' ', '%', ' ', '%', ' ', '%', '%' },
                { '%', ' ', '%', '.', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', '.', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%' },
                { '%', ' ', '%', '.', ' ', '%', ' ', ' ', '%', ' ', '%', '%', ' ', '%', ' ', '.', '%', ' ', '%', ' ', '%', '%', '%', '%', '%', ' ', '%', ' ', '%', ' ', '%', '%', ' ', '%', '%', '%', '%' },
                { '%', ' ', '.', '.', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', '.', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%' },
                { '%', '%', '.', '%', ' ', '%', ' ', ' ', '%', ' ', ' ', '%', ' ', '%', ' ', '.', '%', '.', '.', '.', '%', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', ' ', ' ', '%' },
                { '%', ' ', '.', '.', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', '.', '.', '.', '%', '.', '%', ' ', '%', ' ', '%', '.', '.', '.', '%', '.', '.', '.', '.', '.', '%', ' ', '%' },
                { '%', '%', '%', '.', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', '%', ' ', '%', '%', ' ', '%', ' ', '.', '%', ' ', '%', '%', '%', '.', '%', '.', '.', '.', '%', ' ', '%', '.', '.', '.', '%' },
                { '%', '.', '.', '.', '%', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', '.', '.', '.', '.', '.', '.', '.', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', 'P', '%' },
                { '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%' },

        };

        Search x = new GreedyBestFirstSearch("bigMaze.txt");
        MazeSolution actual = x.solve();

        System.out.println(actual.toString());

        assertEquals(actual.pathCost, 70);
        assertEquals(actual.numNodesExpanded, 117);
        assertMazesAreEqual(actual, expectedPath);
    }

    @Test
    public void gbfsOpen() {
        System.out.println("Greedy Best First Search - Open");

        char[][] expectedPath = {
                { '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', ' ', ' ', ' ', ' ', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', ' ', ' ', '%', ' ', ' ', ' ', ' ', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', '.', ' ', ' ', ' ', ' ', ' ', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '.', ' ', ' ', '%', ' ', ' ', ' ', ' ', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', '.', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', '.', ' ', ' ', '%', ' ', ' ', ' ', ' ', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', '.', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', '.', ' ', ' ', '%', ' ', ' ', ' ', ' ', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', '.', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', '.', ' ', ' ', '%', ' ', ' ', ' ', ' ', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', '.', ' ', ' ', ' ', ' ', ' ', '%', '.', '.', '.', '.', '.', '.', '.', 'P', '%', '.', ' ', ' ', '%', ' ', ' ', ' ', ' ', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', '.', ' ', ' ', ' ', ' ', ' ', '%', '.', ' ', ' ', ' ', '%', '%', '%', '%', '%', '.', ' ', ' ', '%', ' ', ' ', ' ', ' ', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', '.', ' ', ' ', ' ', ' ', ' ', '%', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', ' ', ' ', '%', ' ', ' ', ' ', ' ', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', '.', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', '.', '.', '.', '.', '.', '.', '.', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', '.', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', ' ', ' ', ' ', ' ', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', '.', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', '.', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', '.', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%' },
                { '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%' },
        };

        Search x = new GreedyBestFirstSearch("openMaze.txt");
        MazeSolution actual = x.solve();

        System.out.println(actual.toString());

        assertEquals(actual.pathCost, 60);
        assertEquals(actual.numNodesExpanded, 123);
        assertMazesAreEqual(actual, expectedPath);
    }

	
	@Test
	public void badGreedy() {
		System.out.println("Greedy Best First Search - expands most nodes");
		
		char[][] expectedPath = {
				{ '%', '%', '%', '%', '%', '%' },
				{ '%', ' ', ' ', ' ', '%', '%' },
				{ '%', 'P', ' ', '%', '.', '%' },
				{ '%', '.', '%', '.', '.', '%' },
				{ '%', '.', '.', '.', ' ', '%' },
				{ '%', '%', '%', '%', '%', '%' }};
		
		Search x = new GreedyBestFirstSearch("badGreedy.txt");
		MazeSolution actual = x.solve();

		System.out.println(actual.toString());
		
		assertEquals(actual.pathCost, 7);
		assertEquals(actual.numNodesExpanded, 12);
		assertMazesAreEqual(actual, expectedPath);
	}


    @Test
	public void greedyVsAStar() {
		System.out.println("Greedy Best First Search - worse than Astar, goes down wrong path longer");
		
		char[][] expectedPath = {
				{ '%', '%', '%', '%', '%', '%', '%', '%' },
				{ '%', ' ', ' ', ' ', ' ', ' ', '%', '%' },
				{ '%', '.', 'P', '%', '%', ' ', ' ', '%' },
				{ '%', '.', '%', ' ', ' ', '%', ' ', '%' },
				{ '%', '.', '.', '.', '%', ' ', ' ', '%' },
				{ '%', ' ', ' ', '.', '.', '%', '%', '%' },
				{ '%', ' ', ' ', ' ', ' ', ' ', ' ', '%' },
				{ '%', '%', '%', '%', '%', '%', '%', '%' }};
		
		Search x = new GreedyBestFirstSearch("greedyVsAStar.txt");
		MazeSolution actual = x.solve();

		System.out.println(actual.toString());
		
		assertEquals(actual.pathCost, 7);
		assertEquals(actual.numNodesExpanded, 17);
		assertMazesAreEqual(actual, expectedPath);
	}
	
	@Test
	public void greedyVsAStar2() {
		System.out.println("Greedy Best First Search - actually expands LESS nodes, but NOT optimal solution");
		
		char[][] expectedPath = {
				{ '%', '%', '%', '%', '%', '%', '%', '%', '%' },
				{ '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%' },
				{ '%', ' ', 'P', '.', '.', '.', '.', ' ', '%' },
				{ '%', ' ', ' ', ' ', ' ', ' ', '.', ' ', '%' },
				{ '%', ' ', ' ', ' ', ' ', '.', '.', ' ', '%' },
				{ '%', ' ', '.', '.', '.', '.', '%', ' ', '%' },
				{ '%', ' ', '.', '%', '%', '%', '.', '%', '%' },
				{ '%', ' ', '.', '%', '%', '%', '.', ' ', '%' },
				{ '%', ' ', '.', '.', '.', '.', '.', ' ', '%' },
				{ '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%' },
				{ '%', '%', '%', '%', '%', '%', '%', '%', '%' }};
		
		Search x = new GreedyBestFirstSearch("greedyVsAStar2.txt");
		MazeSolution actual = x.solve();

		System.out.println(actual.toString());
		
		assertEquals(actual.pathCost, 20);
		assertEquals(actual.numNodesExpanded, 37);
		assertMazesAreEqual(actual, expectedPath);
	}
	
}
