package odev3;


import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{


	@Override
	public boolean checkIfRealPerson(Customer customer) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
		try {
			return client.TCKimlikNoDogrula("28861499108", "engin", "demiroð", 1.6);
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
	    } catch (NumberFormatException e) {
		   e.printStackTrace();
	    }
	    return true;
	    }
}
