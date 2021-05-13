package concretes;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Oyun : " +campaign.getInformation() +"\n"+ "Ýndirim oraný : "+campaign.getDiscountRate() + "\n" + "ile eklenmiþtir.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getInformation()+ "güncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getInformation()+ "silindi.");
		
	}

}
