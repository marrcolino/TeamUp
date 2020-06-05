import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeSet;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Gestione {
	private FrameHome home;
	private FrameLogin login;
	private static Utente utente;
	private static Progetto progetto;
	private FrameRegistrazione registrazione;
	private FrameProfiloUtente profiloUtente;
	private FrameModificaProfilo modificaProfilo;
	private CategorieTeamSenzaLogin categorieSenzaLogin;
	private TreeSet<Item> items;
	private TreeSet<Progetto> progetti;
	private TreeSet<Progetto> progettiCategoria;
	private FrameVisualizzaCategorie visualizzaCategorie;
	private FrameCreaCategoria creaCategoria;
	private FrameVisualizzaProgetti visualizzaProgetti;
	private FrameCreaProgetto creaProgetto;
	private static String categoriaScelta="";
	private FrameHomeProgettoLeader homeProgettoLeader;
	private FrameHomeProgettoTeammate homeProgettoTeammate;
	
	public Gestione(FrameHome home, FrameLogin login, FrameRegistrazione registrazione, Utente utente, FrameProfiloUtente profiloUtente, FrameModificaProfilo modificaProfilo, CategorieTeamSenzaLogin categorieSenzaLogin, FrameVisualizzaCategorie visualizzaCategorie, FrameCreaCategoria creaCategoria, FrameVisualizzaProgetti visualizzaProgetti,FrameCreaProgetto creaProgetto, FrameHomeProgettoLeader homeProgettoLeader, FrameHomeProgettoTeammate homeProgettoTeammate) {
		Database.collegamentoDatabase();
		this.login = login;
		this.utente = utente.clone();
		this.registrazione = registrazione;
		this.home = home;
		this.profiloUtente = profiloUtente;
		this.modificaProfilo = modificaProfilo;
		this.categorieSenzaLogin = categorieSenzaLogin;
		this.visualizzaCategorie = visualizzaCategorie;
		this.creaCategoria = creaCategoria;
		this.visualizzaProgetti = visualizzaProgetti;
		this.creaProgetto = creaProgetto;
		this.homeProgettoLeader = homeProgettoLeader;
		this.homeProgettoTeammate = homeProgettoTeammate;
		progetti= new TreeSet<Progetto>();
		items = new TreeSet<Item>();
		progettiCategoria = new TreeSet<Progetto>();
		
	}
	
	public void controllerHomeProgettoLeader() {
		ActionListener gestoreReturn, gestoreAbbandonaProgetto;
		gestoreReturn = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				homeProgettoLeader.rendiVisibile();
				profiloUtente.rendiVisibile();
			}
		};
		
		gestoreAbbandonaProgetto = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				homeProgettoLeader.rendiVisibile();
				profiloUtente.rendiVisibile();
			}
		};
		homeProgettoLeader.getBottoneAnnulla().addActionListener(gestoreReturn);
		homeProgettoLeader.getBottoneAbbandonaProgetto().addActionListener(gestoreAbbandonaProgetto);
	}
	
	public void controllerCategorieTeamSenzaLogin() {
		ActionListener gestoreCatSenzaLogin, gestoreCatSenzaRegistrazione;
		gestoreCatSenzaLogin = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				login.rendiVisibile();
				categorieSenzaLogin.rendiVisibile();
			}
		};
		
		gestoreCatSenzaRegistrazione = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				registrazione.rendiVisibile();
				categorieSenzaLogin.rendiVisibile();
			}
		};
		categorieSenzaLogin.getBtnLogin().addActionListener(gestoreCatSenzaLogin);
		categorieSenzaLogin.getBtnRegistrazione().addActionListener(gestoreCatSenzaRegistrazione);
	}
	
	public void controllerLogin() {
		ActionListener gestoreLogin, gestoreReturn;
		gestoreLogin = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				utente =Database.prendiDatiUtente(login.getTxtUser().getText(), login.getTxtPass().getText()).clone();
				System.out.println(utente);
				if(utente.getMatricola()!=0) {
					
					login.rendiVisibile();
					profiloUtente.rendiVisibile();
					profiloUtente.setLblNome(utente.getNome());
					profiloUtente.setLblCognome(utente.getCognome());
					profiloUtente.setLblData(utente.getDataNascita());
					profiloUtente.setLblEmail(utente.getEmail());
					profiloUtente.setLblCompetenze(utente.getCompetenze());
					profiloUtente.setLblMatricola(utente.getMatricola());
					profiloUtente.setLblUsername(utente.getUsername());
					caricaProgetti();
					
					
				}
				
			}
		};
		gestoreReturn = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				login.rendiVisibile();
				home.rendiVisibile();
				
			}
		};
		
		login.getBtnLogin().addActionListener(gestoreLogin);
		login.getButtonReturn().addActionListener(gestoreReturn);
	}
	
	public void controllerCreaCategoria() {
		ActionListener gestoreReturn, gestoreCreaCategoria;
		
		gestoreReturn = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				visualizzaCategorie.rendiVisibile();
				creaCategoria.rendiVisibile();
				caricaProgetti();
				
			}
		};
	
		gestoreCreaCategoria = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				creaProgetto.rendiVisibile();
				creaCategoria.rendiVisibile();
				creaProgetto.setTextCategoria(creaCategoria.getTestoNomeCategoria().getText());
				
				
			}
		};
	
		creaCategoria.getBottoneIndietro().addActionListener(gestoreReturn);
		creaCategoria.getBottoneCreaCategoria().addActionListener(gestoreCreaCategoria);
		
	}
	
	
	public void controllerVisualizzaProgetti() {
		ActionListener gestoreReturn,gestoreScegliProgetto, gestoreCreaNuovo;
		
		gestoreReturn = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				visualizzaCategorie.rendiVisibile();
				visualizzaProgetti.rendiVisibile();
				caricaProgetti();
				
			}
		};
		gestoreScegliProgetto = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				profiloUtente.rendiVisibile();
				visualizzaProgetti.rendiVisibile();
				caricaProgetti();
				Database.inviaRichiesta(utente,progetto);
			}
		};
		gestoreCreaNuovo = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				creaProgetto.rendiVisibile();
				visualizzaProgetti.rendiVisibile();
				creaProgetto.setTextCategoria(categoriaScelta);
			}
		};
	
		visualizzaProgetti.getBottoneIndietro().addActionListener(gestoreReturn);
		visualizzaProgetti.getBtnCreaNuovo().addActionListener(gestoreCreaNuovo);
		visualizzaProgetti.getBtnInvia().addActionListener(gestoreScegliProgetto);
		
	}
	
	
	public void controllerVisualizzaCategorie() {
		ActionListener gestoreReturn, gestoreScegliCategoria, gestoreCreaCategoria;
		gestoreScegliCategoria = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				visualizzaCategorie.rendiVisibile();
				visualizzaProgetti.rendiVisibile();
				progetti =Database.prendiProgettiUtenteNonIscritto(utente.getMatricola());
				visualizzaProgetti.getMenuProgetti().removeAll();
				items.clear();
				
				for(Progetto progetto : progetti) {
					
					if(categoriaScelta.equals(progetto.getCategoria()))
						items.add(new Item(progetto.getNome(), progetto.getDescrizione(), progetto.getRicerca()));
					
				}
				
				for(Item item : items) {
					
					
					visualizzaProgetti.getMenuProgetti().add(item.getItem());
					
					item.getItem().addActionListener(new ActionListener() {
						
				    	public void actionPerformed(ActionEvent arg0) {
				    		
				    		visualizzaProgetti.setLabelRicercaProgetto(item.getRicerca());
				    		visualizzaProgetti.setTxtDescrizione(item.getDescrizione());
				    		
				    		for (Progetto team : progetti) {
				    			if(item.getItem().getText().equals(team.getNome()))
				    				progetto= team;
				    		}
				    	}
				    	
				    });
					
				}
				
			}
		};
		gestoreCreaCategoria = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				visualizzaCategorie.rendiVisibile();
				creaCategoria.rendiVisibile();
				
			}
		};
		gestoreReturn = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				visualizzaCategorie.rendiVisibile();;
				profiloUtente.rendiVisibile();
				caricaProgetti();
				
			}
		};
	
		visualizzaCategorie.getBottoneIndietro().addActionListener(gestoreReturn);
		visualizzaCategorie.getBottoneScegliCategoria().addActionListener(gestoreScegliCategoria);
		visualizzaCategorie.getBottoneCreaCategoria().addActionListener(gestoreCreaCategoria);
		
	}
	
	public void controllerCreaProgetto() {
		ActionListener gestoreCreaProgetto, gestoreReturn;
		
		gestoreCreaProgetto = new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent arg0) {
				caricaProgetti();
				progetto = new Progetto (1+(Database.idProgettoRecente()),creaProgetto.getTextNome().getText() , creaProgetto.getTextCategoria().getText(), creaProgetto.getTextDataDiCreazione().getText() , creaProgetto.getAreaDescrizione().getText(), creaProgetto.getTextRicerca().getText());
				Database.inserisciProgetto(progetto);
				Database.associazioneProgettoUtente(progetto,utente);
				creaProgetto.rendiVisibile();
				homeProgettoLeader.rendiVisibile();
				homeProgettoLeader.setLabelNomeProgettoVuoto(utente.getNome());
				homeProgettoLeader.setLabelRicercaCompetenzeVuoto(progetto.getRicerca());
				homeProgettoLeader.setLabelCategoriaVuoto(progetto.getCategoria());
				homeProgettoLeader.setTextDescrizioneVuoto(progetto.getDescrizione());
				homeProgettoLeader.setLabelDataCreazioneVuoto(Database.getDataCreazione(utente, progetto));
			}
		};
		
		gestoreReturn = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {			
				visualizzaProgetti.rendiVisibile();
				creaProgetto.rendiVisibile();
				caricaProgetti();
			}
		};
		
		
		creaProgetto.getBottoneIndietro().addActionListener(gestoreReturn);
		creaProgetto.getBottoneCreaProgetto().addActionListener(gestoreCreaProgetto);
	}
	
	
	public void caricaProgetti() {
		
		progetti =Database.prendiProgettiUtente(utente.getMatricola());
		profiloUtente.getMenu().removeAll();
		items.clear();
		
		for(Progetto progetto : progetti) {
			items.add(new Item(progetto.getNome()));
			
		}
		
		
		for(Item item : items) {
			
			
			profiloUtente.getMenu().add(item.getItem());
			
			item.getItem().addActionListener(new ActionListener() {
				
		    	public void actionPerformed(ActionEvent arg0) {
		    		progetto=Database.prendiProgetto(item.getItem().getText());
		    	
		    		if(Database.getLeaderProgetto(item.getItem().getText()) == utente.getMatricola()) {
		    			profiloUtente.rendiVisibile();
		    			homeProgettoLeader.rendiVisibile();
						homeProgettoLeader.setLabelNomeProgettoVuoto(utente.getNome());
						homeProgettoLeader.setLabelRicercaCompetenzeVuoto(progetto.getRicerca());
						homeProgettoLeader.setLabelCategoriaVuoto(progetto.getCategoria());
						homeProgettoLeader.setTextDescrizioneVuoto(progetto.getDescrizione());
						homeProgettoLeader.setLabelDataCreazioneVuoto(Database.getDataCreazione(utente, progetto));
		    		}else if(Database.verificaRichiesta(utente,progetto)==true){
		    			profiloUtente.rendiVisibile();
		    			homeProgettoTeammate.rendiVisibile();
						homeProgettoTeammate.setLabelNomeProgettoVuoto(utente.getNome());
						homeProgettoTeammate.setLabelRicercaCompetenzeVuoto(progetto.getRicerca());
						homeProgettoTeammate.setLabelCategoriaVuoto(progetto.getCategoria());
						homeProgettoTeammate.setTextDescrizioneVuoto(progetto.getDescrizione());
						homeProgettoTeammate.setLabelDataCreazioneVuoto(Database.getDataCreazione(utente, progetto));
		    		}else {
		    			JOptionPane.showMessageDialog(registrazione.getFrame() , "Richiesta non accettata");
		    		}
		    			
		    		
		    	}
		    	
		    });
			
		}
	}
	
	public void controllerProfiloUtente() {
		ActionListener gestoreCancellaProfiloUtente,gestoreModificaProfiloUtente,gestoreLogout, gestoreNuovoProgetto;
		
		gestoreNuovoProgetto = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				visualizzaCategorie.rendiVisibile();
				profiloUtente.rendiVisibile();		
					
				progetti =Database.prendiProgetti();
				visualizzaCategorie.getMenu().removeAll();
				items.clear();
				
				for(Progetto progetto : progetti) {
					items.add(new Item(progetto.getCategoria()));
					
				}
				
				for(Item item : items) {
					
					visualizzaCategorie.getMenu().add(item.getItem());
					
					item.getItem().addActionListener(new ActionListener() {
						
				    	public void actionPerformed(ActionEvent arg0) {
				    		categoriaScelta=item.getItem().getText();
				    		
				    		
				    	}
				    	
				    });
					
				}
						
			}
				
			
		};
		gestoreLogout = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				home.rendiVisibile();
				profiloUtente.rendiVisibile();
				login.getTxtUser().setText("");
				login.getTxtPass().setText("");
				registrazione.getTxtNome().setText("");
				registrazione.getTxtCognome().setText("");
				registrazione.getTxtData().setText("");
				registrazione.getTxtEmail().setText("");
				registrazione.getTxtCompetenze().setText("");
				registrazione.getTxtUsername().setText("");
				registrazione.getTxtPassword().setText("");
			}
		};
		gestoreCancellaProfiloUtente = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Database.cancellaUtente(utente);
				home.rendiVisibile();
				profiloUtente.rendiVisibile();
			}
		};
		
		
		
		gestoreModificaProfiloUtente = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Utente nuovoUtente;
				profiloUtente.rendiVisibile();
				modificaProfilo.rendiVisibile();
				nuovoUtente = new Utente(utente.getMatricola(), modificaProfilo.getTextNome().getText(), modificaProfilo.getTextCognome().getText(), modificaProfilo.getTextDataNascita().getText(), utente.getUsername(), modificaProfilo.getTextPassword().getText(),  modificaProfilo.getTextEmail().getText(), modificaProfilo.getTextCompetenze().getText() );
				Database.cancellaUtente(utente);
				nuovoUtente = utente.clone();
				
			}
		};
		
		profiloUtente.getBottoneCancellazione().addActionListener(gestoreCancellaProfiloUtente);
		profiloUtente.getBottoneModifica().addActionListener(gestoreModificaProfiloUtente);
		profiloUtente.getBtnLogout().addActionListener(gestoreLogout);
		profiloUtente.getBottoneCreaCategoria().addActionListener(gestoreNuovoProgetto);
	}
	
	public void controllerHome() {
		ActionListener gestoreHomeLogin, gestoreHomeRegistrati, gestoreHomeCategorie, gestoreReturn;
		
		gestoreReturn = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				home.rendiVisibile();
				categorieSenzaLogin.rendiVisibile();
				
			}
		};
		
		gestoreHomeLogin = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				home.rendiVisibile();
				login.rendiVisibile();
			}
		};
		gestoreHomeRegistrati = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				home.rendiVisibile();
				registrazione.rendiVisibile();
			}
		};
		gestoreHomeCategorie = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				home.rendiVisibile();
				categorieSenzaLogin.rendiVisibile();
				progetti =Database.prendiProgetti();
				categorieSenzaLogin.getMenuCategorie().removeAll();
				categorieSenzaLogin.getMenuProgetti().removeAll();
				
				for(Progetto progetto : progetti) {
					items.add(new Item(progetto.getCategoria()));
					
				}
				
				
				for(Item item : items) {
					
					
					categorieSenzaLogin.getMenuCategorie().add(item.getItem());
					
					item.getItem().addActionListener(new ActionListener() {
						
				    	public void actionPerformed(ActionEvent arg0) {
				    		progettiCategoria.clear();
				    		
				    		categorieSenzaLogin.getMenuProgetti().removeAll();
				    		
				    		for(Progetto progetto : progetti) {
				    			if(progetto.getCategoria().equals(item.getItem().getText())) 
				    				progettiCategoria.add(progetto);
				    				
				    		}
				    		
				    		for ( Progetto progetto : progettiCategoria) {
				    			
				    			categorieSenzaLogin.getMenuProgetti().add(new JMenuItem(progetto.getNome()));
				    		}
				    		
				    		
				    		
				    	}
				    	
				    });
					
				}
			}
		};
		
		
		
		home.getBtnLogin().addActionListener(gestoreHomeLogin);
		home.getBtnRegistrati().addActionListener(gestoreHomeRegistrati);
		home.getBtnVisualizzaCategorieTeam().addActionListener(gestoreHomeCategorie);
		categorieSenzaLogin.getButtonReturn().addActionListener(gestoreReturn);
		
	}
	
	public void controllerModificaProfilo() {
		ActionListener gestoreModificaProfilo, gestoreReturn;
		
		gestoreModificaProfilo = new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent arg0) {
				boolean esiste=false;
				System.out.println(utente);
				utente=Utente.cloneDaString(utente.getMatricola(),modificaProfilo.getTextNome().getText(),modificaProfilo.getTextCognome().getText(), modificaProfilo.getTextDataNascita().getText(), utente.getUsername(), modificaProfilo.getTextPassword().getText(), modificaProfilo.getTextEmail().getText(), modificaProfilo.getTextCompetenze().getText()).clone();
				

				Database.inserisciUtente(utente);
				
				modificaProfilo.rendiVisibile();
				profiloUtente.rendiVisibile();
				profiloUtente.setLblNome(utente.getNome());
				profiloUtente.setLblCognome(utente.getCognome());
				profiloUtente.setLblData(utente.getDataNascita());
				profiloUtente.setLblEmail(utente.getEmail());
				profiloUtente.setLblCompetenze(utente.getCompetenze());
				profiloUtente.setLblMatricola(utente.getMatricola());
				
			}
		};
		
		gestoreReturn = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {			
				modificaProfilo.rendiVisibile();
				profiloUtente.rendiVisibile();
				Database.inserisciUtente(utente);
				caricaProgetti();
			}
		};
		
		
		modificaProfilo.getButtonReturn().addActionListener(gestoreReturn);
		modificaProfilo.getBottoneConfermaModifica().addActionListener(gestoreModificaProfilo);
	}
	
	public void controllerRegistrazione() {
		ActionListener gestoreRegistrazione, gestoreReturn;
		
		gestoreRegistrazione = new ActionListener() {
		
			

			@Override
			public void actionPerformed(ActionEvent arg0) {
				boolean esiste=false;
				utente=new Utente(1+(Database.matricolaRecente()),registrazione.getTxtNome().getText(),registrazione.getTxtCognome().getText(), registrazione.getTxtData().getText(), registrazione.getTxtUsername().getText(), registrazione.getTxtPassword().getText(), registrazione.getTxtEmail().getText(), registrazione.getTxtCompetenze().getText()).clone();
				esiste=Database.inserisciUtente(utente);
				if(esiste==false)
					JOptionPane.showMessageDialog(registrazione.getFrame() , "Dati errati");
				if(esiste==true) {
					registrazione.rendiVisibile();
					profiloUtente.rendiVisibile();
					profiloUtente.setLblNome(utente.getNome());
					profiloUtente.setLblCognome(utente.getCognome());
					profiloUtente.setLblData(utente.getDataNascita());
					profiloUtente.setLblEmail(utente.getEmail());
					profiloUtente.setLblCompetenze(utente.getCompetenze());
					profiloUtente.setLblMatricola(utente.getMatricola());
					profiloUtente.setLblUsername(utente.getUsername());
					progetti =Database.prendiProgettiUtente(utente.getMatricola());
					profiloUtente.getMenu().removeAll();
					
					
				}
				
			}
		};
		
		gestoreReturn = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				home.rendiVisibile();
				registrazione.rendiVisibile();
				
			}
		};
		
		
		registrazione.getButtonReturn().addActionListener(gestoreReturn);
		registrazione.getBtnRegistrati().addActionListener(gestoreRegistrazione);
	}
	
	
	
}
