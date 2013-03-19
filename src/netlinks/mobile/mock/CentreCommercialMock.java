package netlinks.mobile.mock;

import java.util.ArrayList;
import java.util.List;

import netlinks.mobile.metier.CentreCommercial;
import netlinks.mobile.service.CentreCommercialService;

public class CentreCommercialMock implements CentreCommercialService{

	@Override
	public List<CentreCommercial> getAll() {
		List<CentreCommercial> centres=new ArrayList<CentreCommercial>();
		
		CentreCommercial c1=new CentreCommercial();
		c1.setType("Grande Surface");
		c1.setDescription("Centre Commercial");
		c1.setId(111111);
		c1.setNom("Centre Zaphir");
		c1.setLatitude(1065.555);
		c1.setLongitude(1558.687);
		
		CentreCommercial c2=new CentreCommercial();
		c2.setType("Magasin");
		c2.setDescription("Centre Commercial");
		c2.setId(55555);
		c2.setNom("Geant");
		c2.setLatitude(1065.555);
		c2.setLongitude(1558.687);
		
		CentreCommercial c3=new CentreCommercial();
		c3.setType("Des Boutiques");
		c3.setDescription("Centre Commercial");
		c3.setId(000111);
		c3.setNom("Carrefour");
		c3.setLatitude(1065.555);
		c3.setLongitude(1558.687);
		
		centres.add(c1);
		centres.add(c2);
		centres.add(c3);
		
		return centres;
	}
	
}
