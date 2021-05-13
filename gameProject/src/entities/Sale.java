package entities;

import abstracts.Entity;

public class Sale implements Entity{
	
	private Game[] games;
	private Gamer gamer;
	
	public Sale() {
		super();
	}

	public Sale(entities.Game[] games, entities.Gamer gamer) {
		super();
		this.games = games;
		this.gamer = gamer;
	}

	public Game[] getGames() {
		return games;
	}

	public void setGames(Game[] games) {
		this.games = games;
	}

	public Gamer getGamer() {
		return gamer;
	}

	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}

}
