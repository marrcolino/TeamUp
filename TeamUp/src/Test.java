

import javax.swing.SwingUtilities;

public class Test{
	
	public static void main(String[] args) {
		
		
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				FrameHome home = new FrameHome();
				FrameLogin login = new FrameLogin();
				FrameRegistrazione registrazione = new FrameRegistrazione();
				CategorieTeamSenzaLogin categorieTeamSenzaLogin = new CategorieTeamSenzaLogin();
				Utente utente = new Utente();
				FrameProfiloUtente frameProfiloUtente = new FrameProfiloUtente();
				FrameModificaProfilo modificaProfilo= new FrameModificaProfilo();
				FrameVisualizzaCategorie frameVisualizzaCategorie = new FrameVisualizzaCategorie();
				FrameCreaCategoria frameCreaCategoria = new FrameCreaCategoria();
				FrameVisualizzaProgetti frameVisualizzaProgetti = new FrameVisualizzaProgetti();
				FrameCreaProgetto frameCreaProgetto = new FrameCreaProgetto();
				FrameHomeProgettoLeader frameHomeProgettoLeader = new FrameHomeProgettoLeader();
				FrameHomeProgettoTeammate frameHomeProgettoTeammate = new FrameHomeProgettoTeammate();
				Gestione gestione= new Gestione( home, login, registrazione, utente, frameProfiloUtente, modificaProfilo, categorieTeamSenzaLogin, frameVisualizzaCategorie, frameCreaCategoria, frameVisualizzaProgetti, frameCreaProgetto, frameHomeProgettoLeader, frameHomeProgettoTeammate);
				gestione.controllerLogin();
				gestione.controllerRegistrazione();
				gestione.controllerHome();
				gestione.controllerProfiloUtente();
				gestione.controllerCategorieTeamSenzaLogin();
				gestione.controllerModificaProfilo();
				gestione.controllerVisualizzaCategorie();
				gestione.controllerCreaCategoria();
				gestione.controllerCreaProgetto();
				gestione.controllerVisualizzaProgetti();
				gestione.controllerHomeProgettoLeader();
			}
		});
		
	}
}