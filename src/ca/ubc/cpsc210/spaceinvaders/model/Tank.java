package ca.ubc.cpsc210.spaceinvaders.model;

import java.awt.Color;

/**
 * Represents a tank
 */
public class Tank {
	
	public static final int SIZE_X = 15;
	public static final int SIZE_Y = 8;
	public static final int DX = 2;
	public static final int Y_POS = SIGame.HEIGHT - 40;
	public static final Color COLOR = new Color(250, 128, 20);


	// EFFECTS: places tank at position (x, Y_POS) moving right.
	public Tank(int x) {
		// TODO
	}
	
	public int getX() {
		return SIGame.WIDTH / 2;  //TODO
	}

    // EFFECTS: returns true if tank is facing right, false otherwise
    public boolean isFacingRight() {
        return false;  // TODO
    }

	// MODIFIES: this
	// EFFECTS: tank is facing right
	public void faceRight() {
		// TODO
	}

	// MODIFIES: this
	// EFFECTS: tank is facing left
	public void faceLeft() {
		// TODO
	}

	// MODIFIES: this
	// EFFECTS:  tank is moved DX units in whatever direction it is facing and is
	//           constrained to remain within vertical boundaries of game
    public void move() {
		// TODO
	}

	// MODIFIES: this
	// EFFECTS: tank is constrained to remain within vertical boundaries of game
	private void handleBoundary() {
		// TODO
	}
}
