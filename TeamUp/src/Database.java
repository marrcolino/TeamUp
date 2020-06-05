import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeSet;

public class Database {
	
	private static Connection connessione = null;
	
	public static void collegamentoDatabase() {
		try {
			// caricamento del driver
			new com.mysql.cj.jdbc.Driver();
			/*
			  creazione di una connessione al database Teamup
			  con credenziali di accesso appropriate
			 */
			connessione = DriverManager.getConnection("jdbc:mysql://localhost/teamup","root","");			
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void cancellaUtente(Utente utente) {
		String query="DELETE FROM utenti WHERE utenti.Matricola = '" + utente.getMatricola()+"'";
		Statement istruzione;
		ResultSet risultato;
		
		try {
			istruzione = connessione.createStatement();
			istruzione.executeUpdate(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static boolean cercaUtente(String user, String pass) {
		
		boolean presente = false;
		String query = "Select * From utenti";
		Statement istruzione;
		try {
			
			istruzione = connessione.createStatement();
			ResultSet risultato = istruzione.executeQuery(query);
	
			while (risultato.next()) {
				if(risultato.getString("Username").equals(user) && risultato.getString("Password").equals(pass)){
					presente = true;
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return presente;
	}
	public static int matricolaRecente() {
		String query = "SELECT Max(Matricola) AS MatricolaAlta FROM utenti";
		Statement istruzione;
		ResultSet risultato;
		int matricola = 0;
		try {
			istruzione = connessione.createStatement();
			risultato = istruzione.executeQuery(query);
			while(risultato.next())
				matricola =(int)risultato.getInt("MatricolaAlta");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return matricola;
		
	}
	
	public static int idProgettoRecente() {
		String query = "SELECT Max(Id) AS IdAlto FROM progetti";
		Statement istruzione;
		ResultSet risultato;
		int id = 0;
		try {
			istruzione = connessione.createStatement();
			risultato = istruzione.executeQuery(query);
			while(risultato.next())
				id =(int)risultato.getInt("IdAlto");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;
		
	}
	public static boolean cercaUtenteSenzaPass(String user) {
		
		boolean presente = false;
		String query = "Select * From utenti";
		Statement istruzione;
		try {
			
			istruzione = connessione.createStatement();
			ResultSet risultato = istruzione.executeQuery(query);
	
			while (risultato.next()) {
				if(risultato.getString("Username").equals(user)){
					presente = true;
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return presente;
	}
	
	public static String dataAttuale () {
		Date oggi = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(oggi));
		return sdf.format(oggi);
	}
	
	public static void inviaRichiesta (Utente utente, Progetto progetto) {
		String query="INSERT INTO `dettagli_progetto`(`Matricola`, `Id_progetto`, `Data`, `Aggiunto`) VALUES ("+ (int)utente.getMatricola() +"," + (int)progetto.getId() +"," + "'"+Database.dataAttuale()+"',0)";
		Statement istruzione;
		
		try {
			istruzione = connessione.createStatement();
			istruzione.executeUpdate(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static int OttieniCodiceUtente (String data) {
		String query = "SELECT Matricola From dettagli_progetto WHERE data ='"+ data +"'";
		Statement istruzione;
		int matricola=0;
		
		try {
			
			istruzione = connessione.createStatement();
			ResultSet risultato = istruzione.executeQuery(query);
	
			while (risultato.next()) {
				matricola= risultato.getInt("matricola");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return matricola;
	}
	
	public static int getLeaderProgetto(String nomeProgetto) {
		String query = "SELECT * From progetti WHERE Nome ='"+nomeProgetto+"'";
		Statement istruzione;
		int id=0;
		
		try {
			
			istruzione = connessione.createStatement();
			ResultSet risultato = istruzione.executeQuery(query);
	
			while (risultato.next()) {
				id= risultato.getInt("Id");
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query2 = "SELECT MIN(Data) AS DataAlta From dettagli_progetto WHERE Id_progetto ='"+id+"'";
		Statement istruzione2;
		String data="";
		
		try {
			
			istruzione2 = connessione.createStatement();
			ResultSet risultato2 = istruzione2.executeQuery(query2);
	
			while (risultato2.next()) {
				data= risultato2.getString("DataAlta");
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Database.OttieniCodiceUtente(data);
	}
	
	public static String getDataCreazione(Utente utente, Progetto progetto) {
		
		String query = "Select * From dettagli_progetto";
		Statement istruzione;
		String data="";
		try {
			
			istruzione = connessione.createStatement();
			ResultSet risultato = istruzione.executeQuery(query);
	
			while (risultato.next()) {
				if(risultato.getString("Matricola").equals(String.valueOf(utente.getMatricola())) && (risultato.getString("Id_progetto").equals(String.valueOf(progetto.getId())))){
					data= risultato.getString("Data");
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
	public static boolean inserisciUtente(Utente utente) {
		String query="INSERT INTO `utenti` (`Matricola`, `Nome`, `Cognome`, `Datanascita`, `Username`, `Password`, `Email`, `Competenze`) VALUES ('"+ utente.getMatricola() +"', '" + utente.getNome() + "', '"+utente.getCognome()+"', '"+utente.getDataNascita()+"', '"+utente.getUsername()+"', '"+utente.getPassword()+"', '"+utente.getEmail()+"', '"+utente.getCompetenze()+"');";
		Statement istruzione;
		boolean risultato = false;
		if (!Database.cercaUtenteSenzaPass(utente.getUsername())) {
			try {
				istruzione = connessione.createStatement();
				istruzione.executeUpdate(query);
				risultato=true;
				
			} catch (SQLException e) {
				risultato= false;
				
			}
		}
		return risultato;
	}
	
	public static void abbandonaProgetto(Progetto progetto, Utente utente) {
		String query="DELETE FROM `dettagli_progetto` WHERE matricola="+ utente.getMatricola() + "Id_progetto =" + progetto.getId();
		Statement istruzione;
		
		try {
			istruzione = connessione.createStatement();
			istruzione.executeUpdate(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void associazioneProgettoUtente(Progetto progetto, Utente utente) {
		String query="INSERT INTO `dettagli_progetto`(`Matricola`, `Id_progetto`, `Data`, `Aggiunto`) VALUES ("+ (int)utente.getMatricola() +"," + (int)progetto.getId() +"," + "'"+Database.dataAttuale()+"',1)";
		Statement istruzione;
		
		try {
			istruzione = connessione.createStatement();
			istruzione.executeUpdate(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void inserisciProgetto(Progetto progetto) {
		String query="INSERT INTO `progetti`(`Id`, `Nome`, `Categoria`, `Data`, `Ricerca`, `Descrizione`) VALUES (" + progetto.getId()+",'"+progetto.getNome()+"','"+progetto.getCategoria()+"','"+ progetto.getData()+"','"+ progetto.getRicerca()+"','"+ progetto.getDescrizione()+"')";
		Statement istruzione;
		
		try {
				istruzione = connessione.createStatement();
				istruzione.executeUpdate(query);
				
				
		} catch (SQLException e) {
				
				
			e.printStackTrace();
		}
		
	}
	
	public static Utente prendiDatiUtente(String username, String password) {
		String query = "SELECT * FROM utenti WHERE Username='" + username + "' AND Password='" + password + "'";
		Statement istruzione;
		ResultSet risultato;
		Utente utente = new Utente();
		try {
			istruzione = connessione.createStatement();
			risultato = istruzione.executeQuery(query);
			
			while(risultato.next()) {
				utente.setMatricola(risultato.getInt("Matricola")); 
				utente.setNome(risultato.getString("Nome"));
				utente.setCognome(risultato.getString("Cognome"));
				utente.setDataNascita(risultato.getString("DataNascita"));
				utente.setUsername(risultato.getString("Username"));
				utente.setPassword(risultato.getString("Password"));
				utente.setEmail(risultato.getString("Email"));
				utente.setCompetenze(risultato.getString("Competenze"));
			}	
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return utente;
		
	}
	
	public static void provaStampa () {
		String query="Select * From progetti";
		Statement istruzione;
		try {
			istruzione = connessione.createStatement();
			ResultSet risultato = istruzione.executeQuery(query);
			while (risultato.next()) {
				System.out.println(risultato.getString("Nome") + risultato.getString("Data"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static TreeSet<Progetto> prendiProgettiUtenteNonIscritto(int matricola) {
		String queryRelazioni="SELECT * FROM dettagli_progetto JOIN progetti ON dettagli_progetto.Id_progetto = progetti.Id WHERE dettagli_progetto.Matricola !=" + matricola ;
		 
		TreeSet<Progetto> progetti= new TreeSet<Progetto>();
		Statement istruzione;
		
		try {
			istruzione = connessione.createStatement();
			ResultSet risultato = istruzione.executeQuery(queryRelazioni);
			while (risultato.next()) {
				
				progetti.add(new Progetto (risultato.getInt("Id"), risultato.getString("Nome") , risultato.getString("Categoria"), risultato.getString("Data"), risultato.getString("Descrizione"), risultato.getString("Ricerca")));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return progetti;
	}

	public static TreeSet<Progetto> prendiProgettiUtente(int matricola) {
		String queryRelazioni="SELECT * FROM dettagli_progetto JOIN progetti ON dettagli_progetto.Id_progetto = progetti.Id WHERE dettagli_progetto.Matricola = " + matricola;
		 
		TreeSet<Progetto> progetti= new TreeSet<Progetto>();
		Statement istruzione;
		
		try {
			istruzione = connessione.createStatement();
			ResultSet risultato = istruzione.executeQuery(queryRelazioni);
			while (risultato.next()) {
				
				progetti.add(new Progetto (risultato.getInt("Id"), risultato.getString("Nome") , risultato.getString("Categoria"), risultato.getString("Data"), risultato.getString("Descrizione"), risultato.getString("Ricerca")));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return progetti;
	}
	
	public static TreeSet<Progetto> prendiProgetti() {
		String query="Select * From progetti";
		TreeSet<Progetto> progetti= new TreeSet<Progetto>();
		Statement istruzione;
		
		try {
			istruzione = connessione.createStatement();
			ResultSet risultato = istruzione.executeQuery(query);
			while (risultato.next()) {
				
				progetti.add(new Progetto (risultato.getInt("Id"), risultato.getString("Nome") , risultato.getString("Categoria"), risultato.getString("Data"), risultato.getString("Descrizione"), risultato.getString("Ricerca")));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return progetti;
	}

	public static Progetto prendiProgetto(String nome) {
		String query="Select * From progetti WHERE Nome ='"+ nome +"'";
		Statement istruzione;
		Progetto progetto = null;
		try {
			istruzione = connessione.createStatement();
			ResultSet risultato = istruzione.executeQuery(query);
			while (risultato.next()) {
				
				progetto=new Progetto (risultato.getInt("Id"), risultato.getString("Nome") , risultato.getString("Categoria"), risultato.getString("Data"), risultato.getString("Descrizione"), risultato.getString("Ricerca"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return progetto;
	}
	
	public static boolean verificaRichiesta(Utente utente, Progetto progetto) {
		String query="SELECT * FROM dettagli_progetto WHERE Matricola =" + utente.getMatricola() + " AND Id_progetto="+progetto.getId();
		Statement istruzione;
		boolean aggiunto=false;
		int ris = 0;
		System.out.println(ris);
		try {
			istruzione = connessione.createStatement();
			ResultSet risultato = istruzione.executeQuery(query);
			
			while (risultato.next()) {
				ris =risultato.getInt("Aggiunto");
				System.out.print(ris);
				if(ris==1) {
					aggiunto=true;
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return aggiunto;
	}
	
	
	
	
	
}