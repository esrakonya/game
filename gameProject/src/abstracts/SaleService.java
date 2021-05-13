package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface SaleService {
	
	void sale(Game[] games, Gamer gamer, Campaign campaign);

}
