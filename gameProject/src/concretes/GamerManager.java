package concretes;

import abstracts.GamerCheckService;
import abstracts.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService{
	
	private GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName()+ " "+gamer.getLastName()+ " kullan�c� eklendi.");
		}else {
			System.out.println("B�yle bir kullan�c� bulunamad�.");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " "+gamer.getLastName()+ " kullan�c� g�ncellendi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " "+gamer.getLastName()+ " kullan�c� silindi.");
		
	}

	

}
