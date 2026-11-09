package sio.spring.resmat.ui;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TitrePage {
	private String titre;
	private String description;
	private String surTitre;
	private LienNavigation actionHeader;

	public TitrePage(String titre, String description, String surTitre, String urlAction, String titreAction) {
		this.titre = titre;
		this.description = description;
		this.surTitre = surTitre;
		this.actionHeader = new LienNavigation();
		this.actionHeader.setUrl(urlAction);
		this.actionHeader.setLibelle(titreAction);
	}

}
