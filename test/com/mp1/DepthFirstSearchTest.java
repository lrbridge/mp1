package com.mp1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.mp1.search.DepthFirstSearch;
import com.mp1.search.base.Search;
import com.mp1.solution.MazeSolution;

public class DepthFirstSearchTest {

	private void assertMazesAreEqual(MazeSolution actual, char[][] expectedPath) {
		assertEquals(actual.path.length, expectedPath.length);
		for(int i=0; i<actual.path.length; i++) {
			assertArrayEquals(actual.path[i], expectedPath[i]);
		}
	}
	
	@Test
	public void dfsSimple() {
		System.out.println("Depth First Search - simple");
		
		char[][] expectedPath = {
				{ '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%' },
				{ '%', '.', '.', '.', '.', '.', '%', '.', '.', '.', '.', '%' },
				{ '%', '%', '%', '%', '%', '.', '.', '.', '%', '%', 'P', '%' },
				{ '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%' } };

		Search x = new DepthFirstSearch("simpleMaze.txt");
		MazeSolution actual = x.solve();
		
		assertEquals(actual.pathCost, 12);
		assertEquals(actual.numNodesExpanded, 12);
		assertMazesAreEqual(actual, expectedPath);
	}
	
	@Test
	public void dfsSmall() {
		System.out.println("Depth First Search - small");

        char[][] expectedPath = {
            { '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%' },
            { '%', '.', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', '%' },
            { '%', '.', '%', '%', ' ', '%', ' ', '%', '%', '%', '%', '%', ' ', '%', ' ', ' ', ' ', '.', '.', '.', ' ', ' ', '%' },
            { '%', '.', '%', '.', '.', '.', '.', '.', '.', '.', '%', ' ', ' ', ' ', '%', ' ', '%', '.', '%', '.', '%', ' ', '%' },
            { '%', '.', '.', '.', '%', '%', ' ', '%', '%', '.', '%', '%', '%', ' ', '%', '.', '.', '.', '%', '.', '%', '%', '%' },
            { '%', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', '.', '.', '.', '.', '.', '.', '.', '%', ' ', '%', '.', '.', 'P', '%' },
            { '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%' },
        };

		Search x = new DepthFirstSearch("smallMaze.txt");
		MazeSolution actual = x.solve();

        System.out.println(actual.toString());
        assertEquals(actual.pathCost, 32);
        assertEquals(actual.numNodesExpanded, 57);
        assertMazesAreEqual(actual, expectedPath);
	}
	
	@Test
	public void dfsMedium() {
		System.out.println("Depth First Search - medium");

        char [][] expectedPath = {
            { '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%' },
            { '%', '.', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', '%' },
            { '%', '.', ' ', ' ', '%', ' ', ' ', ' ', '%', '%', ' ', '%', ' ', '%', '%', '%', '%', ' ', '%', '%', ' ', ' ', '%' },
            { '%', '.', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', ' ', '.', '.', '.', '.', ' ', '%', ' ', '%' },
            { '%', '.', '%', '%', ' ', '%', '%', '%', ' ', ' ', ' ', ' ', ' ', '%', '%', '.', '%', '%', '.', '%', '%', '%', '%' },
            { '%', '.', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', ' ', '%', '.', '%', '.', '.', ' ', ' ', ' ', '%' },
            { '%', '.', '%', '%', '%', ' ', '%', ' ', '%', '%', '%', ' ', ' ', '%', ' ', '.', ' ', '.', '%', '%', ' ', '%', '%' },
            { '%', '.', '%', ' ', '%', ' ', ' ', '.', '.', '.', ' ', ' ', '%', ' ', '%', '.', '%', '.', '.', '.', '%', ' ', '%' },
            { '%', '.', '.', '.', ' ', ' ', '%', '.', '%', '.', '%', '%', '%', ' ', ' ', '.', '%', ' ', '%', '.', ' ', ' ', '%' },
            { '%', ' ', '%', '.', '%', ' ', '%', '.', ' ', '.', '.', '.', '%', ' ', '%', '.', '%', ' ', ' ', '.', '%', ' ', '%' },
            { '%', ' ', ' ', '.', '%', '%', '%', '.', '%', '%', '%', '.', '%', ' ', '%', '.', ' ', ' ', '%', '.', '%', '%', '%' },
            { '%', ' ', '%', '.', '.', '.', '.', '.', '%', ' ', '%', '.', '.', '.', '.', '.', '%', '.', '.', '.', ' ', ' ', '%' },
            { '%', '%', ' ', '%', ' ', '%', '%', ' ', ' ', ' ', ' ', '%', '%', '%', '%', ' ', '%', '.', '%', '%', ' ', '%', '%' },
            { '%', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', '.', '.', '.', '.', '.', '.', ' ', ' ', '%', ' ', '%' },
            { '%', ' ', ' ', ' ', '%', '%', ' ', '%', '%', ' ', '%', '%', '.', '%', '%', '%', '%', ' ', '%', '%', ' ', ' ', '%' },
            { '%', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', '%', '.', '.', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', ' ', '%' },
            { '%', '%', '%', '%', ' ', '%', '%', ' ', '%', '%', ' ', '.', '%', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', '%' },
            { '%', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', '%', '.', '.', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%' },
            { '%', ' ', '%', '%', ' ', '%', ' ', '%', '%', '%', '%', '%', '.', '%', ' ', ' ', ' ', '.', '.', '.', ' ', ' ', '%' },
            { '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', '.', '.', '%', ' ', '%', '.', '%', '.', '%', ' ', '%' },
            { '%', ' ', ' ', ' ', '%', '%', ' ', '%', '%', ' ', '%', '%', '%', '.', '%', '.', '.', '.', '%', '.', '%', '%', '%' },
            { '%', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', '.', '.', '.', '%', ' ', '%', '.', '.', 'P', '%' },
            { '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%' },
        };

		Search x = new DepthFirstSearch("mediumMaze.txt");
		MazeSolution actual = x.solve();

        System.out.println(actual.toString());
        assertEquals(actual.pathCost, 88);
        assertEquals(actual.numNodesExpanded, 201);
        assertMazesAreEqual(actual, expectedPath);
	}
	
	@Test
	public void dfsBig() {
		System.out.println("Depth First Search - big");

        char [][] expectedPath = {
            { '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%' },
            { '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', '.', '.', '.', '%', ' ', '%' },
            { '%', '%', ' ', '%', ' ', '%', ' ', '%', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', '%', ' ', '%', '.', '%', '.', ' ', ' ', '%' },
            { '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', '.', '.', ' ', '.', '%', ' ', '%' },
            { '%', '%', ' ', '%', ' ', '%', '%', ' ', '%', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', ' ', '%', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', '.', '%', '%', '.', '%', '%', '%' },
            { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', ' ', '.', '.', ' ', '%', '.', '.', '.', '%' },
            { '%', ' ', '%', ' ', '%', ' ', '%', '%', ' ', '%', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', '%', ' ', '%', ' ', ' ', '%', ' ', '%', '.', '%', '%', ' ', ' ', '%', '.', '%' },
            { '%', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', '.', '.', '%', ' ', '%', ' ', '.', '.', '%' },
            { '%', ' ', ' ', '%', ' ', '%', '%', ' ', '%', ' ', '%', ' ', ' ', '%', ' ', '%', ' ', '%', '%', '%', '%', ' ', '%', ' ', ' ', ' ', '%', '%', '.', '%', ' ', ' ', '%', '%', '.', '%', '%' },
            { '%', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', '.', '.', '.', ' ', '%', ' ', ' ', ' ', '.', '.', '%' },
            { '%', '%', ' ', '%', ' ', '%', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', '%', ' ', '%', '%', '%', ' ', '%', '.', '%', ' ', '%', ' ', '%', ' ', '%', '%', '.', '%' },
            { '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', '.', '%' },
            { '%', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', ' ', '%', '%', ' ', ' ', '%', ' ', '%', '%', ' ', '%', '%', '.', '%', '%', ' ', '%', ' ', ' ', ' ', '%', '.', '%' },
            { '%', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', ' ', ' ', ' ', ' ', ' ', '%', ' ', '%', '.', '%' },
            { '%', ' ', '%', ' ', '%', '%', ' ', '%', ' ', '%', '%', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', '%', ' ', '%', ' ', '%', '.', '%', ' ', '%', ' ', '%', '%', '%', '%', '.', '%' },
            { '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', ' ', '.', '.', '.', '.', '.', ' ', ' ', ' ', '.', '.', '%' },
            { '%', ' ', '%', ' ', ' ', '%', '%', ' ', ' ', '%', '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', '%', '%', '.', '%', '%', '%', '.', '%', '%' },
            { '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '.', '.', '.', ' ', ' ', ' ', '.', '.', '%' },
            { '%', ' ', '%', ' ', ' ', '%', ' ', '%', ' ', '%', '%', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', '%', '%', ' ', '%', ' ', '%', '%', ' ', '%', '.', '%', ' ', '%', '%', ' ', '%', '.', '%' },
            { '%', ' ', '%', ' ', '%', ' ', '.', '.', '.', ' ', ' ', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', '.', '.', '.', '%', ' ', ' ', ' ', '.', ' ', '%', ' ', '%', ' ', '%', '.', '%' },
            { '%', ' ', '%', '%', ' ', '%', '.', '%', '.', '%', ' ', '%', '%', ' ', ' ', '%', '%', ' ', ' ', '%', '%', '.', '%', '.', '%', '%', ' ', '%', '.', '%', ' ', '%', ' ', ' ', ' ', '.', '%' },
            { '%', ' ', '%', ' ', ' ', '.', '.', ' ', '.', '.', '%', ' ', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', '.', '%', '.', '.', '.', '.', ' ', '.', '.', '.', ' ', '%', ' ', '%', '.', '%' },
            { '%', '%', ' ', ' ', '%', '.', '%', '%', '%', '.', ' ', ' ', ' ', '%', '%', '%', ' ', '%', '%', ' ', '%', '.', ' ', '%', '%', '%', '.', '%', '%', '%', '.', '%', '%', '.', '.', '.', '%' },
            { '%', ' ', '%', '.', '.', '.', ' ', '.', '.', '.', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', '.', '.', '.', '%', ' ', ' ', ' ', '.', '.', '.', ' ', '.', ' ', ' ', '.', '%', ' ', '%' },
            { '%', ' ', '%', '.', '%', ' ', '%', '.', '%', '%', ' ', '%', '%', ' ', '%', ' ', '%', '.', '.', '.', '%', ' ', '%', ' ', '%', '%', ' ', '%', '.', '%', '.', '%', '%', '.', '%', '%', '%' },
            { '%', ' ', ' ', '.', '%', ' ', ' ', '.', '.', ' ', ' ', ' ', ' ', ' ', '%', '.', '.', '.', '%', ' ', '%', ' ', ' ', ' ', '%', '.', '.', '.', '.', ' ', '.', '.', '%', '.', ' ', ' ', '%' },
            { '%', '%', '%', '.', ' ', '%', ' ', '%', '.', '%', '%', ' ', '%', '.', '.', '.', '%', ' ', '%', ' ', '%', ' ', '%', '%', ' ', '.', '%', ' ', '%', ' ', '%', '.', ' ', '.', '%', '%', '%' },
            { '%', ' ', '%', '.', '%', ' ', '%', ' ', '.', '.', '.', ' ', '.', '.', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', '%', '.', '%', ' ', ' ', ' ', '.', '.', '%', '.', '.', ' ', '%' },
            { '%', '%', ' ', '.', ' ', ' ', ' ', '%', '%', '%', '.', '%', '.', '%', ' ', ' ', '%', '.', '.', '.', '%', '.', '.', '.', '%', '.', ' ', ' ', '%', '%', '.', '%', ' ', '%', '.', '%', '%' },
            { '%', ' ', '%', '.', '%', ' ', '%', ' ', ' ', ' ', '.', '.', '.', ' ', '%', '.', '.', '.', '%', '.', '.', '.', '%', '.', '.', '.', '%', '.', '.', '.', '.', ' ', '.', '.', '.', ' ', '%' },
            { '%', ' ', '%', '.', ' ', '%', ' ', ' ', '%', ' ', '%', '%', ' ', '%', ' ', '.', '%', ' ', '%', ' ', '%', '%', '%', '%', '%', ' ', '%', '.', '%', ' ', '%', '%', '.', '%', '%', '%', '%' },
            { '%', ' ', '.', '.', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', '.', ' ', ' ', '%', '.', '.', '.', '%', ' ', '%', ' ', ' ', '.', '%', '.', '.', '.', '.', ' ', '%', ' ', '%' },
            { '%', '%', '.', '%', ' ', '%', ' ', ' ', '%', ' ', ' ', '%', ' ', '%', ' ', '.', '%', '.', '.', '.', '%', '.', ' ', ' ', ' ', ' ', '%', '.', '%', '.', '%', ' ', '%', '.', '.', '.', '%' },
            { '%', ' ', '.', '.', '%', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', '.', '.', '.', '%', ' ', '%', '.', '%', ' ', '%', '.', '.', '.', '%', '.', ' ', '.', '.', '.', '%', '.', '%' },
            { '%', '%', '%', '.', ' ', ' ', ' ', '%', ' ', '%', ' ', '%', '%', ' ', '%', '%', ' ', '%', ' ', ' ', '%', '.', '%', '%', '%', '.', '%', ' ', ' ', '.', '%', '.', '%', ' ', ' ', '.', '%' },
            { '%', '.', '.', '.', '%', ' ', '%', ' ', '%', ' ', ' ', ' ', ' ', ' ', '%', ' ', ' ', ' ', '%', ' ', ' ', '.', '.', '.', '.', '.', '%', ' ', '%', '.', '.', '.', '%', ' ', '%', 'P', '%' },
            { '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%' },

        };
		Search x = new DepthFirstSearch("bigMaze.txt");
		MazeSolution actual = x.solve();

        System.out.println(actual.toString());
        assertEquals(actual.pathCost, 232);
        assertEquals(actual.numNodesExpanded, 603);
        assertMazesAreEqual(actual, expectedPath);
	}

    @Test
    public void dfsOpen() {
        System.out.println("Depth First Search - Open");

        char[][] expectedPath = {
                { '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', '.', '.', ' ', '.', '.', '.', ' ', '.', '.', '.', ' ', '.', '.', '.', ' ', '.', '.', '.', ' ', '.', '.', '.', ' ', '.', '.', '.', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', ' ', '.', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', ' ', '.', '.', '.', ' ', '.', '.', '.', ' ', '.', '.', '.', ' ', '.', '.', '.', ' ', '.', '.', '.', ' ', '.', '.', '.', ' ', '.', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', ' ', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', ' ', ' ', ' ', '.', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', ' ', '%', ' ', ' ', ' ', ' ', ' ', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '%', ' ', ' ', ' ', '.', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', ' ', '%', ' ', ' ', ' ', ' ', ' ', '.', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', ' ', ' ', '.', '%', ' ', ' ', ' ', '.', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', ' ', '%', ' ', ' ', ' ', ' ', ' ', '.', '%', ' ', ' ', ' ', ' ', ' ', '.', '.', '.', '%', ' ', ' ', '.', '%', ' ', ' ', ' ', '.', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', ' ', '%', ' ', ' ', ' ', ' ', ' ', '.', '%', ' ', ' ', ' ', ' ', ' ', '.', ' ', '.', '%', ' ', ' ', '.', '%', ' ', ' ', ' ', '.', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', ' ', '%', ' ', ' ', ' ', ' ', ' ', '.', '%', ' ', ' ', ' ', ' ', ' ', '.', ' ', '.', '%', ' ', ' ', '.', '%', ' ', ' ', ' ', '.', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', ' ', '%', ' ', ' ', ' ', ' ', ' ', '.', '%', ' ', ' ', ' ', '.', '.', '.', ' ', 'P', '%', ' ', ' ', '.', '%', ' ', ' ', ' ', '.', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', ' ', '%', ' ', ' ', ' ', ' ', ' ', '.', '%', ' ', ' ', ' ', '.', '%', '%', '%', '%', '%', ' ', ' ', '.', '%', ' ', ' ', ' ', '.', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', ' ', '%', ' ', ' ', ' ', ' ', ' ', '.', '%', ' ', ' ', ' ', '.', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', '%', ' ', ' ', ' ', '.', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', ' ', '%', ' ', ' ', ' ', ' ', ' ', '.', '%', ' ', ' ', ' ', '.', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', '%', ' ', ' ', ' ', '.', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', '%', ' ', ' ', ' ', '.', '.', '.', '.', '.', '.', '.', '.', '.', '%', ' ', ' ', ' ', '.', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', ' ', ' ', ' ', '.', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', '%' },
                { '%', ' ', ' ', ' ', ' ', ' ', '.', '.', '.', '.', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '%' },
                { '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%' },
        };

        Search x = new DepthFirstSearch("openMaze.txt");
        MazeSolution actual = x.solve();

        System.out.println(actual.toString());

//        assertEquals(actual.pathCost, 8);
//        assertEquals(actual.numNodesExpanded, 8);
//        assertMazesAreEqual(actual, expectedPath);
    }

	@Test
	public void dfsVsBfs() {
		System.out.println("Depth First Search - should go right, up... because pop down off stack first");
		
		char[][] expectedPath = {
				{ '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%' },
				{ '%', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '.', '%' },
				{ '%', ' ', ' ', ' ', ' ', 'P', ' ', ' ', ' ', ' ', '.', '%' },
				{ '%', ' ', ' ', ' ', ' ', '.', '.', '.', '.', '.', '.', '%' },
				{ '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%', '%' } };
		
		Search x = new DepthFirstSearch("dfsVsBfs.txt");
		MazeSolution actual = x.solve();

		System.out.println(actual.toString());
		
		assertEquals(actual.pathCost, 8);
		assertEquals(actual.numNodesExpanded, 8);
		assertMazesAreEqual(actual, expectedPath);
	}

	@Test
	public void dfsVsBfs2() {
		System.out.println("Depth First Search - should go long way around to right");
		
		char[][] expectedPath = {
				{ '%', '%', '%', '%', '%', '%', '%' },
				{ '%', ' ', ' ', '.', '.', '.', '%' },
				{ '%', ' ', 'P', '%', '%', '.', '%' },
				{ '%', ' ', '.', '.', '.', '.', '%' },
				{ '%', '%', '%', '%', '%', '%', '%' }};
		
		Search x = new DepthFirstSearch("dfsVsBfs2.txt");
		MazeSolution actual = x.solve();

		System.out.println(actual.toString());
		
		assertEquals(actual.pathCost, 8);
		assertEquals(actual.numNodesExpanded, 8);
		assertMazesAreEqual(actual, expectedPath);
	}
	
	@Test
	public void badGreedy() {
		System.out.println("Depth First Search - does great on bad greedy");
		
		char[][] expectedPath = {
				{ '%', '%', '%', '%', '%', '%' },
				{ '%', ' ', ' ', ' ', '%', '%' },
				{ '%', 'P', ' ', '%', '.', '%' },
				{ '%', '.', '%', ' ', '.', '%' },
				{ '%', '.', '.', '.', '.', '%' },
				{ '%', '%', '%', '%', '%', '%' }};
		
		Search x = new DepthFirstSearch("badGreedy.txt");
		MazeSolution actual = x.solve();

		System.out.println(actual.toString());
		
		assertEquals(actual.pathCost, 7);
		assertEquals(actual.numNodesExpanded, 7);
		assertMazesAreEqual(actual, expectedPath);
	}
}
