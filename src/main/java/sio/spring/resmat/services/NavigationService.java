package sio.spring.resmat.services;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import sio.spring.resmat.ui.LienNavigation;
import sio.spring.resmat.ui.TitrePage;

@Service
public class NavigationService {

	private final Map<String, List<LienNavigation>> liensParPage = Map.of("accueil",
			List.of(lien("Accueil", "/", true), lien("Types de matériel", "/types-materiel", false)), "types-materiel",
			List.of(lien("Accueil", "/", false), lien("Types de matériel", "/types-materiel", false),
					lien("Catégories", "/categories", false)));

	private final Map<String, TitrePage> titresParPage = Map.of("types-materiel", new TitrePage("Types de matériels",
			"Liste des types de matériels à réserver", "", "/types-materiel/nouveau", "Nouveau type"));

	public List<LienNavigation> liensPour(String page, String urlActive) {
		return liensParPage.getOrDefault(page, List.of()).stream().map(lien -> {
			LienNavigation copie = new LienNavigation();
			copie.setLibelle(lien.getLibelle());
			copie.setUrl(lien.getUrl());
			copie.setActif(lien.getUrl().equals(urlActive));
			return copie;
		}).toList();
	}

	public TitrePage getTitrePage(String page) {
		return titresParPage.getOrDefault(page, null);
	}

	private static LienNavigation lien(String libelle, String url, boolean actif) {
		LienNavigation lien = new LienNavigation();
		lien.setLibelle(libelle);
		lien.setUrl(url);
		lien.setActif(actif);
		return lien;
	}
}