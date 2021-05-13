package concretes;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+ " oyunu eklenmi�tir.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+ " oyunu g�ncellenmi�tir.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+ " oyunu silinmi�tir.");
		
	}

}
