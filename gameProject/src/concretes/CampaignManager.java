package concretes;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Oyun : " +campaign.getInformation() +"\n"+ "�ndirim oran� : "+campaign.getDiscountRate() + "\n" + "ile eklenmi�tir.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getInformation()+ "g�ncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getInformation()+ "silindi.");
		
	}

}
