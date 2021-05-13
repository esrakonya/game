package entities;

import abstracts.Entity;

public class Campaign implements Entity{

	private int id;
	private String campaignName;
	private String information;
	private int discountRate;
	
	public Campaign() {
		super();
	}

	public Campaign(int id, String campaignName, String information, int discountRate) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.information = information;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

}
