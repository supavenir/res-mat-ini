package sio.spring.resmat.ui;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LienNavigation {
	private String libelle;
	private String url;
	private boolean actif = false;
}
