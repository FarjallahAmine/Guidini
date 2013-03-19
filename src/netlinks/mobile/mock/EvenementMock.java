package netlinks.mobile.mock;

import java.util.ArrayList;
import java.util.List;

import netlinks.mobile.metier.Evenement;
import netlinks.mobile.service.EvenementService;

public class EvenementMock implements EvenementService {

	@Override
	public List<Evenement> getAll() {
		List<Evenement> evenements = new ArrayList<Evenement>();

		Evenement e1 = new Evenement();
		e1.setDateDeb("21 mars 2013");
		e1.setDateFin("31 mars 2013");
		e1.setHeureFermeture("19h");
		e1.setHeureOuverture("10h");
		e1.setType("Musique");

		Evenement e2 = new Evenement();
		e2.setDateDeb("21 mars 2013");
		e2.setDateFin("31 mars 2013");
		e2.setHeureFermeture("19h");
		e2.setHeureOuverture("10h");
		e2.setType("Culture");

		Evenement e3 = new Evenement();
		e3.setDateDeb("21 mars 2013");
		e3.setDateFin("31 mars 2013");
		e3.setHeureFermeture("19h");
		e3.setHeureOuverture("10h");
		e3.setType("Education");

		evenements.add(e1);
		evenements.add(e2);
		evenements.add(e3);

		return evenements;
	}
}
