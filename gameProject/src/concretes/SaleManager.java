package concretes;

import abstracts.SaleService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class SaleManager implements SaleService{
	
	private double discountRate;
	private double unitPrice;

	@Override
	public void sale(Game[] games, Gamer gamer, Campaign campaign) {
		for (Game game : games) {
			discountRate = campaign.getDiscountRate();
			unitPrice = game.getUnitPrice();
			unitPrice = unitPrice - (unitPrice * discountRate / 100);
			System.out.println("Oyun ad� : "+game.getGameName()+ "\n"+ 
					"Alan ki�inin ad� soyad� : "+gamer.getFirstName()+" "+gamer.getLastName()+"\n"+
					"Ald��� oyunun fiyat� : "+unitPrice);
			
		}
		
	}

}
