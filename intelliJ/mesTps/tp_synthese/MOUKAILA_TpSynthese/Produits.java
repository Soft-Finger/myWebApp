/**
	Programme qui permet de gérer un catalogue de produits.
	@author Vos enseignants
	@author Modifié par  Moukaila Yahaya
	@version Decembre 2020
*/

public class Produits {

		static final int LG_MIN_DESCRIPTION = 3;
		static final int LG_MAX_DESCRIPTION = 40;
		static boolean trieParDescription = true;
    
			//Messages - validation du choix du menu
		 public final static String MSG_ERR_CHOIX_MENU = "Choix invalide !!! Recommencez.";

		//Messages - validation de la position de suppression
		 public final static String MSG_ERR_POSITION = "\nPosition invalide.";

		 //Messages - validation description lors d'une modification
		 public final static String MSG_ERR_DESCRIPTION = "\nDescription invalide. seulement des caractères(a à z) ou (A à Z) ou espace ou trait d'union ou apostrophe et de longueur 3 à 40)";

		 //Messages - validation prix lors d'une modification
		 public final static String MSG_ERR_PRIX = "\nPrix invalide.format (xxx.xx)";

		 //Messages - Catalogue vide

		 public final static String MSG_CATALOGUE_VIDE = "`\tLe catalogue des produits est vide";




	// -----------------------------------------------------------------------
	// LES MÉTHODES CI-DESSOUS SONT INCOMPLÈTES, ELLES DOIVENT ÊTRE AMÉLIORÉES
	// -----------------------------------------------------------------------
	
	/**
		Méthode principale. Elle contient la boucle principale de l'application
		pour demander à l'utilisateur d'entrer une opération, puis appeler les
		méthodes pour effectuer le traitement demandé.

		À COMPLÉTER / AMÉLIORER...
		
		@param args Tableau de paramètres reçus sur la ligne de commande. Pas utilisé
					dans cette application.
	*/
	
	//====================== DEBUT MAIN ===============================================
	
	public static void main(String[] args) {
       
		final char OPERATIONS[] = {'A','L','M','R','S','T','Q'};
		final char OPERATION_AJOUTER = 'A';
		final char OPERATION_LISTER = 'L';
		final char OPERATION_MODIFIER = 'M';
		final char OPERATION_RECHERCHER = 'R';
		final char OPERATION_SUPPRIMER = 'S';
		final char OPERATION_TRIER = 'T';
		final char OPERATION_QUITTER = 'Q';
		
		String[][] listeProduits = {
			{"Bloc d'alimentation", "28.99"},
			{"Carte de son", "115.40"},
			{"Carte graphique", "189.49"},
			{"Carte reseau", "73.99"},
			{"Clavier", "59.99"},
			{"Disque magnetique", "110.99"},
			{"Disque ssd", "168.49"},
			{"Memoire vive", "64.99"},
			{"Moniteur", "329.02"},
			{"Processeur", "421.99"},
			{"Souris", "54.99"}
		};

		char choixOperation = 'Q';
		boolean menuValide = false;
		do {
                afficherOperations();
			do{
				choixOperation = getOperation();
				choixOperation = Character.toUpperCase(choixOperation);
				menuValide = validerOperation(OPERATIONS, choixOperation);
				
				if(!menuValide){
					System.out.print(MSG_ERR_CHOIX_MENU);
				}
			}while(!menuValide);

			switch (choixOperation) {
				case OPERATION_AJOUTER:
					listeProduits = ajouterProduit(listeProduits, trieParDescription);
					break;
					
				case OPERATION_LISTER:
					listerProduits(listeProduits);
					break;

				case OPERATION_TRIER:
					listeProduits = trierProduits(listeProduits);
					break;

				case OPERATION_RECHERCHER:
					rechercherProduit(listeProduits);
					break;	
                
                case OPERATION_SUPPRIMER:
					listeProduits = supprimerProduit(listeProduits);
					break;	
                
                 case OPERATION_MODIFIER:
					listeProduits = modifierProduit(listeProduits);
					break;	

				case OPERATION_QUITTER:
					System.out.println("\nFin du programme.");
					break;
				//default
			}
		}while (choixOperation != OPERATION_QUITTER);
	}
	
	//========================= FIN MAIN ====================================================
	
	/**
		Méthode qui affiche simplement le menu des opérations disponibles.

			*/
	public static void afficherOperations() {
		System.out.println("\nVeuillez choisir une opération:");
		System.out.println("\tA. Ajouter un produit");
		System.out.println("\tL. Lister les produits");
		System.out.println("\tM. Modifier un produit");
		System.out.println("\tR. Rechercher un produit");
		System.out.println("\tS. Supprimer un produit");
		System.out.println("\tT. Trier les produits");
		System.out.println("\tQ. Quitter");
	}

	/**
		Méthode qui demande à l'utilisateur d'entrer son choix d'opération.
		Elle retourne le caractère correspondant à l'opération.
		Le caractère est actuellement retourné tel que lu.
		
	    @return Un caractère correspondant au choix de l'utilisateur.
	*/
	public static char getOperation() {
		System.out.print("\nVotre choix : ");
		return Keyboard.readChar();
	}

	/**
		Méthode qui permet d'initier l'ajout d'un produit au catalogue, puis
		d'appeler la méthode qui permet d'insérer le produit dans le tableau.
		La description et le prix sont demandés à l'utilisateur.
		La méthode retourne le tableau des produits (avec un élément de plus).
		
		À AMÉLIORER... pour ajouter l'appel à la méthode validerProduit().
		
		@param listeProduits Tableau à 2 dimensions qui contient les produits.
		@param trieParDescription Un booléen qui permet de connaître l'état actuel
				du tri du tableau des produits, car cela influencera la position où le nouveau
				produit doit être inséré.
		@return Le nouveau tableau qui contient un produit de plus.
	*/
	public static String[][] ajouterProduit(String[][] listeProduits, boolean trieParDescription) {
		String uneDescription = "";
		String unPrix = "";
		System.out.println("\nAjout");
		System.out.print("\tDescription : ");
		uneDescription = Keyboard.readString();
		uneDescription = uneDescription.trim();

		System.out.print("\tPrix (xxxx.xx): ");
		unPrix = Keyboard.readString();
		unPrix = unPrix.trim();

		if(validerProduit(uneDescription, unPrix)){

			return insererProduit(listeProduits, uneDescription.substring(0, 1).toUpperCase()
				+ uneDescription.substring(1).toLowerCase(), unPrix, trieParDescription);}
			else{
				return listeProduits;
		}
	}
	
	/**
		Méthode qui permet de trier le tableau des produits en utilisant
		comme critère de tri le prix du produit. Le tri utilisé est
		le tri par sélection.
		Elle retourne le tableau des produits (avec les éléments qui ont été
		réordonnés).

		À AMÉLIORER... permettre aussi le tri ordonné par ordre croissant
		de la description.

		Indices:
		Il faut accepter aussi la réponse D pour le critère de tri.
		Selon le critère de tri (P ou D), il faut utiliser le bon champ
		(prix ou description) lorsque vient le temps de comparer 2 éléments dans
		l'algorithme de tri par sélection. On compare donc ou bien le champ prix
		(en numérique), ou bien le champ description (en alphabétique).
		
		@param listeProduits Tableau à 2 dimensions qui contient les produits.
		@return Le tableau qui contient maintenant les éléments triés.
	*/
	public static String[][] trierProduits(String[][] listeProduits) {
		final char PAR_DESCRIPTION = 'D';
		final char PAR_PRIX = 'P';
		 
		System.out.println("\nTri");
		System.out.print("\tPar prix ou par description (P, D) ? ");
		char typeTri = String.valueOf(Keyboard.readChar()).toUpperCase().charAt(0);
		if (typeTri == PAR_PRIX)
			trieParDescription = false;
			else if (typeTri == PAR_DESCRIPTION)
				trieParDescription = true;
		else {
			System.out.println("\n\tChamp de tri invalide.");
			return listeProduits;
		}
		// Tri
		if(!trieParDescription){
			int posMin = 0;
			String descriptionMin = "";
			double prixMin;
			for (int i = 0; i < listeProduits.length - 1; i++) {
				descriptionMin = listeProduits[i][0];
				prixMin = Double.parseDouble(listeProduits[i][1]);
				posMin = i;
				for (int j = i + 1; j < listeProduits.length; j++) {
					if (Double.parseDouble(listeProduits[j][1]) < prixMin) {
						prixMin = Double.parseDouble(listeProduits[j][1]);
						descriptionMin = listeProduits[j][0];
						posMin = j;
					}
				}
				if (i != posMin) {
					String[] valTmp = listeProduits[i];
					listeProduits[i] = listeProduits[posMin];
					listeProduits[posMin] = valTmp;
				}
			}
	    }else{
			int posMin = 0;
			String descriptionMin = "";
			String prixMin;
			for (int i = 0; i < listeProduits.length-1; i++) {
				prixMin = listeProduits[i][1];
				descriptionMin = listeProduits[i][0];
				posMin = i;
				
				for (int j = i + 1; j < listeProduits.length; j++) {
					if ((listeProduits[j][0]).compareToIgnoreCase(descriptionMin) <= 0 ) {
						descriptionMin = listeProduits[j][0];
						prixMin = listeProduits[j][1];
						posMin = j;
					}
				}
				
				if (i != posMin) {
					String[] valTmp = listeProduits[i];
					listeProduits[i] = listeProduits[posMin];
					listeProduits[posMin] = valTmp;
				}
			}
		}
		return listeProduits;
	}

	// ---------------------------------------------------------------------------------------
	// LES MÉTHODES CI-DESSOUS NE SONT PAS IMPLÉMENTÉES. VOUS DEVEZ LES CONCEVOIR ET LES CODER
	// À L'AIDE DES INDICES FOURNIS.
	//
	// RÉFLÉCHISSEZ AUX PARAMÈTRES QUI DEVRAIENT ÊTRE ENVOYÉS À CHAQUE MÉTHODE.
	//		--> PARAMÈTRES À DÉFINIR DANS L'EN-TÊTE DE LA MÉTHODE.
	//
	// RÉFLÉCHISSEZ À CE QUE DEVRAIT RETOURNER CHAQUE MÉTHODE.
	//		--> TYPE DE RETOUR À DÉFINIR DANS L'EN-TÊTE DE LA MÉTHODE
	// ---------------------------------------------------------------------------------------

	/**
		Méthode qui valide que l'opération entrée par l'utilisateur est permise.
		Elle retourne vrai seulement si l'opération est valide.

		Indices:
		Elle vérifie si l'opération fait partie du tableau OPERATIONS initialisé
		au début du programme.
		
		@param OPERATIONS Tableau à 1 dimension qui contient les caractères des opérations permises.
		@param choixOperation le choix d'opération fait par l'utilisateur.
		@return true si le choix de l'utisateur se retrouve parmi les opérations permises et false dans le cas contraire.
	*/
	public static boolean validerOperation(char OPERATIONS[],char choixOperation) {
		boolean operationValide = false;
		 for(int i = 0; i < OPERATIONS.length; i++){
		 	if(OPERATIONS[i] == choixOperation){
                    operationValide = true;
                    break;
		 	}
		 }
		 return operationValide;
	}

   /**
    * Cette methode teste si le car donne est une lettre ('a' a 'z', 'A' a 'Z','-',''',' ').
    * 
    * @param car le caractere à tester.
    * @return true si car est une lettre ou est une des caractères (espace, trait d'union et apostrophe), false sinon.
    */
   public static boolean estUneLettre (char car) {
      return (car >= 'a' && car <= 'z') || (car >= 'A' && car <= 'Z') || (car == '-') || (car == ' ') || (car == '\'');
   }

	/**
		Méthode qui valide si une description est valide selon les exigences.
		Elle retourne vrai seulement si la description est valide.

		Indices:
		Une descrition est valide uniquement si elle contient entre LG_MIN_DESCRIPTION
		et LG_MAX_DESCRIPTION caractères.
		De plus, les seuls caractères autorisés sont les lettres minuscules (a à z),
		les lettres majuscules (A à Z), ainsi que les 3 caractères suivants : " -'"
		(espace, trait d'union et apostrophe).

		@param lngMin la longueur minimum d'une description.
		@param lngMax la longueur maximum d'une description.
		@param description la description du produit saisi par l'utilisateur.

		@return true si la descrption est valide et false si c'est le contraire.
	*/
	public static boolean validerDescription(String description, int lngMin, int lngMax) {
		boolean descriptionValide = false;
		if(description.length() < lngMin || description.length() > lngMax ){
           descriptionValide = false;
		}else{
			for(int i = 0; i < description.length(); i++){
				if(estUneLettre(description.charAt(i))){
					descriptionValide = true;
				}else{
					descriptionValide = false;
					break;
				}
			}
	    }
		return descriptionValide;
	}

	 /**
    * Cette methode teste si le car donne est un caractere numerique ('0' à '9').
    * 
    * @param car le caractere à tester.
    * @return true si car est un caractere numerique, false sinon.
    */
   public static boolean estUnCarNumPoint (char car) {
      return (car >= '0' && car <= '9') || car == '.';
   }

   /**
     Cette methode compte le nombre de car dans chaine. Si la chaine donnee
     est null ou vide, la methode retourne 0, peu importe le car donne.
     
     @param chaine la chaine dans laquelle compter le nombre d'occurrences du 
                   car donne.
     @param car le caractere a compter dans la chaine donnee.
     @return le nombre de caracteres car dans chaine. 
    */
   public static int contientNCar (String chaine, char car) {
      //METHODE A COMPLETER
		int nombreCar = 0;
		
		if(chaine.equals("") || chaine == null){
        	nombreCar = 0;
			}else{
				for(int i = 0; i < chaine.length(); i++){
					if(chaine.charAt(i) == car){
					nombreCar = nombreCar + 1;
			
				}
			}
		}
	  
		return nombreCar;  //pour compilation (a modifer)
	}

	/**
		Méthode qui valide si un prix est valide selon les exigences.
		Elle retourne vrai seulement si le prix est valide.

		Indices:
		Un prix est valide uniquement si il contient une suite de caractères
		composées de chiffres (1 ou +), suivi d'un point(.), et suivi d'exactement
		deux autres chiffres.
		Il y aura donc toujours au moins 4 caractères dans un prix.

		@param prix le prix du produit saisi par l'utilisateur.
		@return true si le prix est valide, false sinon.
	*/  
	public static boolean validerPrix(String prix) {
		boolean prixValide = false;
		if(prix.length() < 4){
			prixValide = false;
		}else{
            for(int i = 0; i< prix.length(); i++){
				if(estUnCarNumPoint(prix.charAt(i))){
					prixValide = true;
				}else{
					prixValide = false;
				break;
			}
		}

		if(prixValide){
			if(contientNCar(prix, '.') == 1 && prix.substring(prix.indexOf(".") + 1).length() == 2){
				prixValide = true;
			}else{
				prixValide = false;
			}
		}
		}
		return prixValide;
	}
	
	/**
		Méthode qui valide si un produit à insérer est valide.
		Elle retourne vrai seulement si les 2 éléments sont valides.

		Indices:
		Elle valide donc la description et le prix, en appelant les méthodes
		de validation correspondantes.
		Si un élément est invalide, elle affiche un message d'erreur.

		@param prixProduit le prix du produit saisi par l'utilisateur.
		@param descriptionProduit fonction decrire produit
		@return true si le produit est valide, false sinon.
	*/
	public static boolean validerProduit(String descriptionProduit, String prixProduit ) {
	   boolean descriptionValide = validerDescription(descriptionProduit, LG_MIN_DESCRIPTION, LG_MAX_DESCRIPTION);
	   boolean prixValide = validerPrix(prixProduit);
	   if(!descriptionValide){System.out.print(MSG_ERR_DESCRIPTION);}
	   if(!prixValide){System.out.print(MSG_ERR_PRIX);}	

		return (descriptionValide && prixValide);
	}

	/**
		Méthode qui permet de demander à l'utilisateur la position
		du produit qu'il veut traiter parmi la liste des produits du
		catalogue. 
		Elle retourne la position entrée par l'utilisateur.

		Indices:
		On propose à l'utilisateur d'entrer une valeur entre 1 et N.
		Cette méthode ne fait aucune validation.
		Elle est appelée par les méthodes supprimerProduit() et
		modifierProduit().
		
		@param listeProduits Tableau à 2 dimensions qui contient les produits.
		@param return Elle retourne la position entrée par l'utilisateur.
		
	*/
	public static int getPosition(String [][] listeProduits) {
		
		System.out.print("\n\tQuelle position (1 à " + listeProduits.length + ") ? ");
		return Keyboard.readInt();

	}

	/**
		Méthode qui valide si une position correspond réellement à une
		position d'un produit du catalogue.
		Elle retourne vrai seulement si la position est valide.

		Indices:
		Elle valide donc si le numéro de position est compris inclusivement
		entre 1 et le nombre de produits du catalogue.

		@param listeProduits Tableau à 2 dimensions qui contient les produits.
		@param position position à valider.
		@return Elle retourne vrai seulement si la position est valide.
	*/
	public static boolean validerPosition(String [][] listeProduits, int position) {
		boolean positionValide = false;
		if(position < 1 || position > listeProduits.length ){        
            positionValide = false;
		}else{
          positionValide = true;
		}
		return positionValide;
	}
	
	/**
		Méthode qui permet d'effectuer la modification d'un produit au catalogue.
		Elle retourne le tableau des produits (avec la modification appliquée
		s'il y a lieu).

		Indices:
		Elle demande d'abord à l'utilisateur d'entrer une position (méthode getPosition).
		Si la position est valide (méthode validerPosition), elle demande ensuite
		à l'utilisateur quel champ du produit il veut modifier (description ou prix).
		S'il répond correctement, la méthode leui demande ensuite l'information
		correspondante (description ou prix), puis valide cette donnée à l'aide de la
		bonne méthode (validerDescription ou validerPrix).
		Si l'information est invalide, un message d'erreur spécifique est affiché.
		Autrement, l'information est modifiée dans le tableau des produits.
		Si le champ spécifié par l'utilisateur est invalide, un message d'erreur
		spécifique est affiché.

		@param listeProduits Tableau à 2 dimensions qui contient les produits.
		
		@return retourne le tableau des produits (avec la modification appliquée
		s'il y a lieu).
	
	*/
	public static String [][] modifierProduit(String [][]listeProduits) {
		boolean positionValide = false;
		boolean descriptionValide = false;
		boolean prixValide = false;
		String[][] listeProduitsV2;
		int pos = 0;
		String nouvelleDescription = "";
		String nouveauPrix = "";

		listeProduitsV2 = new String[listeProduits.length][2]; 

		//Verification si le catalogue est vide ou non
		if(listeProduits.length == 0){System.out.println(MSG_CATALOGUE_VIDE);}
		else{
			System.out.print("Modification");
			int position = getPosition(listeProduits);
			positionValide = validerPosition(listeProduits, position);
		if(positionValide){           
			afficherProduit(listeProduits, position - 1);
			System.out.print("\n\tQuel champs (D, P) ? " );
			
			String reponse = Keyboard.readString();
			reponse = reponse.toUpperCase();
			
                switch (reponse) {
					case "D":
					{
						System.out.print("\n\tNouvelle description :" );
						nouvelleDescription = Keyboard.readString();
						descriptionValide = validerDescription(nouvelleDescription, LG_MIN_DESCRIPTION, LG_MAX_DESCRIPTION);
						if(descriptionValide){
							nouvelleDescription = nouvelleDescription.substring(0, 1).toUpperCase() + nouvelleDescription.substring(1).toLowerCase();
							listeProduits[position - 1][0] = nouvelleDescription;
					 	}else{System.out.print(MSG_ERR_DESCRIPTION);}
					}     
						break;
						
					case "P":
						{
						System.out.print("\n\tNouveau prix :" );
						nouveauPrix = Keyboard.readString();
						prixValide = validerPrix(nouveauPrix);
						if(prixValide){
							listeProduits[position - 1][1] = nouveauPrix; 
						}else{System.out.print(MSG_ERR_PRIX);}
					}    
						break;
					default:
					System.out.println("\nChamp invalide");	
				}
		}else{
             System.out.print(MSG_ERR_POSITION);   
		}
	}
	return listeProduits;
	}
	
	/**
		Méthode qui permet d'effectuer la recherche d'une chaîne dans les produits
		du catalogue.
		
		Indices:
		Elle demande d'abord à l'utilisateur d'entrer la sous-chaîne recherchée.
		Elle vérifie ensuite si cette sous-chaîne fait partie de la description
		ou du prix de chaque produit du catalogue. Si c'est le cas, elle affiche
		produit (méthode afficherProduit).
		Si la sous-chaîne recherchée ne se trouve dans aucun produit, un message
		informatif est affiché.

		@param listeProduits Tableau à 2 dimensions qui contient les produits.
	*/
	public static void rechercherProduit(String [][] listeProduits) {
		String motARechercher = "";
		boolean trouve = false;
		
		if(listeProduits.length == 0){
			System.out.println(MSG_CATALOGUE_VIDE);
		}else{
			System.out.println("\nRecherche");
			System.out.print("\tQuoi ? ");
			motARechercher = Keyboard.readString();

			afficherEnTeteProduits();
			
			for (int i = 0; i < listeProduits.length; i++) {
				if((listeProduits[i][0].toUpperCase().indexOf(motARechercher.toUpperCase())!= -1) || (listeProduits[i][1].indexOf(motARechercher) != -1)){
					afficherProduit(listeProduits, i);
					trouve = true;
				}
			}
		
			if(!trouve){
				System.out.println("aucun produit trouvé.");
			}
	    }
	}
	
	/**
		Méthode qui permet de supprimer un produit du catalogue.
		Elle retourne le tableau des produits (avec le tableau amputé d'un
		élément s'il y a lieu).

		Indices:
		Elle demande d'abord à l'utilisateur d'entrer une position (méthode getPosition).
		Si la position est invalide (méthode validerPosition), on affiche un message
		d'erreur et la supression est abandonnée.
		Autrement, on affiche le produit à supprimer (méthode afficherProduit) puis
		on demande une confirmation.
		Si l'utilisateur confirme qu'il veut bien supprimer le produit, on crée un
		nouveau tableau pour la liste des produits (qui sera amputée d'un produit),
		puis on copie dans ce nouveau tableau tous les produits sauf celui à supprimer.
		À la fin, on fait pointer le tableau original vers ce nouveau tableau et on
		affiche à l'utilisateur le nombre de produits restant dans le catalogue.
		
		@param listeProduits Tableau à 2 dimensions qui contient les produits.
		@param Elle retourne le tableau des produits (avec le tableau amputé d'un
			élément s'il y a lieu).
	*/
	public static String[][] supprimerProduit(String [][] listeProduits) {
		boolean positionValide = false;
		String[][] listeProduitsV2;
		int pos = 0;
		if(listeProduits.length == 0){
			System.out.println(MSG_CATALOGUE_VIDE);
			listeProduitsV2 = listeProduits;
		}else{
			listeProduitsV2 = new String[listeProduits.length - 1][2];
			System.out.print("Suppression"); 
			
			int position = getPosition(listeProduits);
			positionValide = validerPosition(listeProduits, position);
			
			if(positionValide){
				System.out.println("\tSuppression de ");
				afficherProduit(listeProduits, position - 1);
			
				System.out.print("\tConfirmez-vous (O/N) ");
				String reponse = Keyboard.readString();
		
				if(reponse.toUpperCase().equals("O")){
					listeProduitsV2 = new String[listeProduits.length - 1][2];
					for (int j = 0; j < listeProduits.length; j++) { 
						if (j != position - 1 ) {
							listeProduitsV2[pos][0] = listeProduits[j][0];
							listeProduitsV2[pos][1] = listeProduits[j][1];
							pos++;
						}
					}			
						System.out.println("il reste " + listeProduitsV2.length + " produit(s) dans le catalogue");           
				}else{
					listeProduitsV2 = new String[listeProduits.length][2];           
					listeProduitsV2 = listeProduits;
				}
			}else{
				System.out.print(MSG_ERR_POSITION);   
				listeProduitsV2 = new String[listeProduits.length][2]; 
				listeProduitsV2 = listeProduits;
			}	
		}
        return listeProduitsV2;	
	}
	
	// ------------------------------------------------------------------------
	// LES MÉTHODES CI-DESSOUS SONT COMPLÈTES, ELLES N'ONT PAS À ÊTRE MODIFIÉES
	// ------------------------------------------------------------------------

	/**
		Méthode qui affiche simplement l'en-tête pour l'affichage d'une liste de
		produits. Elle est appelée par les méthodes listerProduits() et
		rechercherProduits().
	*/
	public static void afficherEnTeteProduits() {
		System.out.println("\n\tListe des produits");
		System.out.printf("\t    %-40s %10s%n", "Description", "Prix");
		System.out.println("\t    ---------------------------------------- ----------");
	}

	/**
		Méthode qui affiche la description et le prix d'un produit (formaté).
		
		@param listeProduits Tableau à 2 dimensions qui contient les produits.
		@param position L'index du tableau des produits du produit à afficher.
	*/
	public static void afficherProduit(String[][] listeProduits, int position) {
		System.out.printf("\t%2d) %-40s %10s%n", position + 1, listeProduits[position][0], listeProduits[position][1]);
	}

	/**
		Méthode qui affiche la liste des produits. Elle fait appel à 2 méthodes,
		une pour l'en-tête, et l'autre pour chaque produit de la liste.
		
		@param listeProduits Tableau à 2 dimensions qui contient les produits.
	*/
	public static void listerProduits(String[][] listeProduits) {
		afficherEnTeteProduits();
		if(listeProduits.length == 0){
		  System.out.print(MSG_CATALOGUE_VIDE);	

		}else{
		for (int i = 0; i < listeProduits.length; i++) {
			afficherProduit(listeProduits, i);
		}
	        }
	}

	/**
		Méthode qui permet d'insérer un nouveau produit dans le tableau.
		Selon l'état actuel de tri du tableau, le nouveau produit
		est ajouté à différents endroits.
		Si le tableau est trié par description, le nouveau produit s'ajouter
		au bon endroit pour maintenir l'ordre alphabétique.
		Autrement, il est ajouté à la fin.
		Elle est appelée par la méthode ajouterProduit.

		@param listeProduits Tableau à 2 dimensions qui contient les produits.
		@param uneDescription Description du produit à ajouter.
		@param unPrix Prix du produit à ajouter.
		@param trieParDescription Booléen qui indique si le tableau est actuellement trié par description.
		@return Le tableau qui contient maintenant les éléments triés.
	*/
	public static String[][] insererProduit(String[][] listeProduits, String uneDescription, String unPrix, boolean trieParDescription) {
		String[][] listeProduitsV2;
		int position;

		listeProduitsV2 = new String[listeProduits.length + 1][2];
		// On recherche la position d'insertion dans le tableau.
		position = listeProduits.length;
		for (int i = 0; i < listeProduits.length; i++) {
			if (trieParDescription && listeProduits[i][0].compareTo(uneDescription) >= 0) {
				position = i;
				break;
			}
			else {
				listeProduitsV2[i][0] = listeProduits[i][0];
				listeProduitsV2[i][1] = listeProduits[i][1];
			}
		}

		// On insère le nouveau produit à la position "position"
		listeProduitsV2[position][0] = uneDescription;
		listeProduitsV2[position][1] = unPrix;

		// On poursuit la copie avec le reste des produits.
		for (int i = position + 1; i < listeProduitsV2.length; i++) {
			listeProduitsV2[i][0] = listeProduits[i-1][0];
			listeProduitsV2[i][1] = listeProduits[i-1][1];
		}
		return listeProduitsV2;
	}
}