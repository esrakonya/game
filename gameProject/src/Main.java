import adapters.MernisManagerAdapter;
import concretes.CampaignManager;
import concretes.GameManager;
import concretes.GamerManager;
import concretes.SaleManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		GamerManager gamerManager = new GamerManager(new MernisManagerAdapter());
		Gamer esra = new Gamer(1, "Esra","Konya", 11111111111L, 2000);
		Gamer busra = new Gamer(2, "Büşra", "Konya", 22222222222L, 1998);
		
		gamerManager.add(esra);
		gamerManager.add(busra);
		
		System.out.println("----------------------------------------");
		
		System.out.println("\n");
		
		GameManager gameManager = new GameManager();
		Game metinIki = new Game(1, "Metin2", 10);
		Game counterStrike = new Game(2, "Counter Strike", 65);
		Game[] games = {metinIki, counterStrike};
		gameManager.add(counterStrike);
		gameManager.add(metinIki);
		
		System.out.println("------------------------------------------");
		
		System.out.println("\n");
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign covid = new Campaign(1, "Covid-19 indirimi", "15 gün geçerli", 50);
		campaignManager.add(covid);
		
		System.out.println("--------------------------------------------");
		
		System.out.println("\n");
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(games, esra, covid);
		
		

	}

}
