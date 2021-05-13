package adapters;

import abstracts.GamerCheckService;
import entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManagerAdapter implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(gamer.getNationalityId(), gamer.getFirstName(), gamer.getLastName(), gamer.getDateOfBirth());
		} catch (Exception e) {
			System.out.println("Hatalý giriþ yaptýnýz.");
		}
		return false;
	}

}
