package com.sharknados.models.tiles;

import com.sharknados.models.pieces.Piece;

public class PowerUpTileDecorator extends TileDecorator {

	public PowerUpTileDecorator(Tile decoratedTile) {
		super(decoratedTile);
		decoratedTile.incrementDecoratorCount("MINNOWS");
	}

	public void setPiece(Piece piece) {
		decoratedTile.setPiece(piece);
        if (piece != null) {
        	int powerUp = 10;
			decoratedTile.setOccupied(true);
			int newHealth = piece.getHealth() + powerUp;
			piece.setHealth(newHealth);
        }
        else{
			decoratedTile.setOccupied(false);
        }
	}
}
