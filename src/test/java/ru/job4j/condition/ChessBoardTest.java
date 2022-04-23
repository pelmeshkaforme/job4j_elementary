package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    @Test
    public void wayIs6() {
        int x1 = 0;
        int y1 = 7;
        int x2 = 6;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void wayIs2() {
        int x1 = 3;
        int y1 = 1;
        int x2 = 5;
        int y2 = 3;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void wayIs0() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 6;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX1isMinus1ThenWayIs0() {
        int x1 = -1;
        int y1 = 1;
        int x2 = 5;
        int y2 = 3;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY1isMinus1ThenWayIs0() {
        int x1 = 1;
        int y1 = -1;
        int x2 = 5;
        int y2 = 3;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX2isMinus1ThenWayIs0() {
        int x1 = 1;
        int y1 = 1;
        int x2 = -1;
        int y2 = 3;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void wheY21isMinus1ThenWayIs0() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 5;
        int y2 = -1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX1isGreater7ThenWayIs0() {
        int x1 = 9;
        int y1 = 1;
        int x2 = 5;
        int y2 = 3;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY1isGreater7ThenWayIs0() {
        int x1 = 3;
        int y1 = 10;
        int x2 = 5;
        int y2 = 3;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX2isGreater7ThenWayIs0() {
        int x1 = 3;
        int y1 = 1;
        int x2 = 50;
        int y2 = 3;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY2isGreater7ThenWayIs0() {
        int x1 = 4;
        int y1 = 1;
        int x2 = 5;
        int y2 = 10;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
}