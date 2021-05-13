package concretes;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+ " oyunu eklenmiþtir.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+ " oyunu güncellenmiþtir.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+ " oyunu silinmiþtir.");
		
	}

}
