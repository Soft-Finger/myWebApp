<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER &quot;votre Jour dépasse le jour maximum du mois saisi(1 à 28)&quot;" texte="Déterminer le jour de la semaine (dimanche à lundi), à partir d'une date fournie par l'utilisateur, date qui devra être comprise entre le 1er janvier 1600 et le 31 décembre 2100."/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2para="" F2etat="inactif" F2defaut="" F2lignes=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalAffichages="1000" epaisseurLigne="2" totalBoucles="5000000" maxBoucle="500000" nbDecimales="8" epaisseurPoint="2" arrondiAuto="vrai"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#codeJanvier" algoitem="codeJanvier EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#codeFevrier" algoitem="codeFevrier EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#codeMars" algoitem="codeMars EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#codeAvril" algoitem="codeAvril EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#codeMai" algoitem="codeMai EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#codeJuin" algoitem="codeJuin EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#codeJuillet" algoitem="codeJuillet EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#codeAout" algoitem="codeAout EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#codeSeptembre" algoitem="codeSeptembre EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#codeOctobre" algoitem="codeOctobre EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#codeNovembre" algoitem="codeNovembre EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#codeDecembre" algoitem="codeDecembre EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#annee" algoitem="annee EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#jour" algoitem="jour EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#mois" algoitem="mois EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#deux_premier_chiffres" algoitem="deux_premier_chiffres EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#terme_1" algoitem="terme_1 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#terme_2" algoitem="terme_2 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#terme_3" algoitem="terme_3 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#terme_4" algoitem="terme_4 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#terme_5" algoitem="terme_5 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#terme_6" algoitem="terme_6 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#resteDivision_7" algoitem="resteDivision_7 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#dernier_jour_mois" algoitem="dernier_jour_mois EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#jour_valide" algoitem="jour_valide EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#mois_valide" algoitem="mois_valide EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#annee_valide" algoitem="annee_valide EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#annee_bissextile" algoitem="annee_bissextile EST_DU_TYPE NOMBRE"/>
        <item code="1#CHAINE#jourEnLettre" algoitem="jourEnLettre EST_DU_TYPE CHAINE"/>
        <item code="1#CHAINE#moisEnLettre" algoitem="moisEnLettre EST_DU_TYPE CHAINE"/>
        <item code="1#CHAINE#dateEnLettre" algoitem="dateEnLettre EST_DU_TYPE CHAINE"/>
        <item code="1#CHAINE#jourSemaine" algoitem="jourSemaine EST_DU_TYPE CHAINE"/>
        <item code="1#NOMBRE#somme_5_terme" algoitem="somme_5_terme EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="5#codeJanvier#1#pasliste" algoitem="codeJanvier PREND_LA_VALEUR 1"/>
        <item code="5#codeFevrier#2#pasliste" algoitem="codeFevrier PREND_LA_VALEUR 2"/>
        <item code="5#codeMars#3#pasliste" algoitem="codeMars PREND_LA_VALEUR 3"/>
        <item code="5#codeAvril#4#pasliste" algoitem="codeAvril PREND_LA_VALEUR 4"/>
        <item code="5#codeMai#5#pasliste" algoitem="codeMai PREND_LA_VALEUR 5"/>
        <item code="5#codeJuin#6#pasliste" algoitem="codeJuin PREND_LA_VALEUR 6"/>
        <item code="5#codeJuillet#7#pasliste" algoitem="codeJuillet PREND_LA_VALEUR 7"/>
        <item code="5#codeAout#8#pasliste" algoitem="codeAout PREND_LA_VALEUR 8"/>
        <item code="5#codeSeptembre#9#pasliste" algoitem="codeSeptembre PREND_LA_VALEUR 9"/>
        <item code="5#codeOctobre#10#pasliste" algoitem="codeOctobre PREND_LA_VALEUR 10"/>
        <item code="5#codeNovembre#11#pasliste" algoitem="codeNovembre PREND_LA_VALEUR 11"/>
        <item code="5#codeDecembre#12#pasliste" algoitem="codeDecembre PREND_LA_VALEUR 12"/>
        <item code="19#Demande entrer annee" algoitem="//Demande entrer annee"/>
        <item code="4#Entrer l'année :#0" algoitem="AFFICHER &quot;Entrer l'année :&quot;"/>
        <item code="2#annee#pasliste" algoitem="LIRE annee"/>
        <item code="19#Demande entrer mois" algoitem="//Demande entrer mois"/>
        <item code="4#Entrer le mois :#0" algoitem="AFFICHER &quot;Entrer le mois :&quot;"/>
        <item code="2#mois#pasliste" algoitem="LIRE mois"/>
        <item code="19#Validation du jour" algoitem="//Validation du jour"/>
        <item code="4#Entrer le jour : #0" algoitem="AFFICHER &quot;Entrer le jour : &quot;"/>
        <item code="2#jour#pasliste" algoitem="LIRE jour"/>
        <item code="19#Validation année" algoitem="//Validation année"/>
        <item code="6#annee&lt;1600" algoitem="SI (annee&lt;1600) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#Année trop petite (1600 à 2199)#1" algoitem="AFFICHER &quot;Année trop petite (1600 à 2199)&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="6#annee>2199" algoitem="SI (annee>2199) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="4#Année trop grande (1600 à 2199)#1" algoitem="AFFICHER &quot;Année trop grande (1600 à 2199)&quot;"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                    <item code="9#sinon" algoitem="SINON">
                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                        <item code="19#Validation si l'année est bissexile ou non." algoitem="//Validation si l'année est bissexile ou non."/>
                        <item code="6#annee%400==0" algoitem="SI (annee%400==0) ALORS">
                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                            <item code="5#annee_bissextile#1#pasliste" algoitem="annee_bissextile PREND_LA_VALEUR 1"/>
                            <item code="8#finsi" algoitem="FIN_SI"/>
                            <item code="9#sinon" algoitem="SINON">
                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                <item code="6#annee%4==0 ET  annee%100!=0" algoitem="SI (annee%4==0 ET  annee%100!=0) ALORS">
                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                    <item code="5#annee_bissextile#1#pasliste" algoitem="annee_bissextile PREND_LA_VALEUR 1"/>
                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                    <item code="9#sinon" algoitem="SINON">
                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                        <item code="5#annee_bissextile#0#pasliste" algoitem="annee_bissextile PREND_LA_VALEUR 0"/>
                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                    </item>
                                </item>
                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                            </item>
                        </item>
                        <item code="19#Validation du mois" algoitem="//Validation du mois"/>
                        <item code="6#mois&lt;1" algoitem="SI (mois&lt;1) ALORS">
                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                            <item code="4#Mois trop petit (1 à 12 seulement)#1" algoitem="AFFICHER &quot;Mois trop petit (1 à 12 seulement)&quot;"/>
                            <item code="8#finsi" algoitem="FIN_SI"/>
                            <item code="9#sinon" algoitem="SINON">
                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                <item code="6#mois>12" algoitem="SI (mois>12) ALORS">
                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                    <item code="4#Mois trop grand (1 à 12 seulement)#1" algoitem="AFFICHER &quot;Mois trop grand (1 à 12 seulement)&quot;"/>
                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                    <item code="9#sinon" algoitem="SINON">
                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                        <item code="19#Validation jour compris entre 1 à 31 et message d'erreur" algoitem="//Validation jour compris entre 1 à 31 et message d'erreur"/>
                                        <item code="6#jour&lt;1" algoitem="SI (jour&lt;1) ALORS">
                                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                            <item code="4#Jour trop petit (1 à 31 seulement)#1" algoitem="AFFICHER &quot;Jour trop petit (1 à 31 seulement)&quot;"/>
                                            <item code="8#finsi" algoitem="FIN_SI"/>
                                            <item code="9#sinon" algoitem="SINON">
                                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                <item code="6#jour>31" algoitem="SI (jour>31) ALORS">
                                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                    <item code="4#Jour trop grand (1 à 31 seulement)#1" algoitem="AFFICHER &quot;Jour trop grand (1 à 31 seulement)&quot;"/>
                                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                                    <item code="9#sinon" algoitem="SINON">
                                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                        <item code="19#validation jour selon le mois" algoitem="//validation jour selon le mois"/>
                                                        <item code="6#(mois == codeAvril OU mois == codeJuin OU mois == codeSeptembre OU mois == codeNovembre) ET (jour>30)" algoitem="SI ((mois == codeAvril OU mois == codeJuin OU mois == codeSeptembre OU mois == codeNovembre) ET (jour>30)) ALORS">
                                                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                            <item code="4#votre Jour dépasse le jour maximum du mois saisi(1 à 30)#1" algoitem="AFFICHER &quot;votre Jour dépasse le jour maximum du mois saisi(1 à 30)&quot;"/>
                                                            <item code="8#finsi" algoitem="FIN_SI"/>
                                                            <item code="9#sinon" algoitem="SINON">
                                                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                <item code="6#mois == codeFevrier ET annee_bissextile ==1 ET jour>29" algoitem="SI (mois == codeFevrier ET annee_bissextile ==1 ET jour>29) ALORS">
                                                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                    <item code="4#votre Jour dépasse le jour maximum du mois saisi(1 à 29)#1" algoitem="AFFICHER &quot;votre Jour dépasse le jour maximum du mois saisi(1 à 29)&quot;"/>
                                                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                                                    <item code="9#sinon" algoitem="SINON">
                                                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                        <item code="6#mois == codeFevrier ET annee_bissextile ==0 ET jour>28" algoitem="SI (mois == codeFevrier ET annee_bissextile ==0 ET jour>28) ALORS">
                                                                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                            <item code="4#votre Jour dépasse le jour maximum du mois saisi(1 à 28)#1" algoitem="AFFICHER &quot;votre Jour dépasse le jour maximum du mois saisi(1 à 28)&quot;"/>
                                                                            <item code="8#finsi" algoitem="FIN_SI"/>
                                                                            <item code="9#sinon" algoitem="SINON">
                                                                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                <item code="19#Traitement des données" algoitem="//Traitement des données"/>
                                                                                <item code="19#Calcule du terme 1" algoitem="//Calcule du terme 1"/>
                                                                                <item code="5#terme_1#annee % 100#pasliste" algoitem="terme_1 PREND_LA_VALEUR annee % 100"/>
                                                                                <item code="19#Calcule du terme 2" algoitem="//Calcule du terme 2"/>
                                                                                <item code="5#terme_2#floor(terme_1/4)#pasliste" algoitem="terme_2 PREND_LA_VALEUR floor(terme_1/4)"/>
                                                                                <item code="19#Récuperation du jour du mois pour le 3ème terme" algoitem="//Récuperation du jour du mois pour le 3ème terme"/>
                                                                                <item code="5#terme_3#jour#pasliste" algoitem="terme_3 PREND_LA_VALEUR jour"/>
                                                                                <item code="19#Détermination du 4ème terme" algoitem="//Détermination du 4ème terme"/>
                                                                                <item code="6#mois == codeFevrier OU mois == codeMars OU mois == codeNovembre" algoitem="SI (mois == codeFevrier OU mois == codeMars OU mois == codeNovembre) ALORS">
                                                                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                    <item code="5#terme_4#3#pasliste" algoitem="terme_4 PREND_LA_VALEUR 3"/>
                                                                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                    <item code="9#sinon" algoitem="SINON">
                                                                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                        <item code="6#mois == codeAvril OU mois == codeJuillet" algoitem="SI (mois == codeAvril OU mois == codeJuillet) ALORS">
                                                                                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                            <item code="5#terme_4#6#pasliste" algoitem="terme_4 PREND_LA_VALEUR 6"/>
                                                                                            <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                            <item code="9#sinon" algoitem="SINON">
                                                                                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                                <item code="6#mois == codeMai" algoitem="SI (mois == codeMai) ALORS">
                                                                                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                                    <item code="5#terme_4#1#pasliste" algoitem="terme_4 PREND_LA_VALEUR 1"/>
                                                                                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                                    <item code="9#sinon" algoitem="SINON">
                                                                                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                                        <item code="6#mois == codeJuin" algoitem="SI (mois == codeJuin) ALORS">
                                                                                                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                                            <item code="5#terme_4#4#pasliste" algoitem="terme_4 PREND_LA_VALEUR 4"/>
                                                                                                            <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                                            <item code="9#sinon" algoitem="SINON">
                                                                                                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                                                <item code="6#mois == codeAout" algoitem="SI (mois == codeAout) ALORS">
                                                                                                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                                                    <item code="5#terme_4#2#pasliste" algoitem="terme_4 PREND_LA_VALEUR 2"/>
                                                                                                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                                                    <item code="9#sinon" algoitem="SINON">
                                                                                                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                                                        <item code="6#mois == codeSeptembre OU mois == codeDecembre" algoitem="SI (mois == codeSeptembre OU mois == codeDecembre) ALORS">
                                                                                                                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                                                            <item code="5#terme_4#5#pasliste" algoitem="terme_4 PREND_LA_VALEUR 5"/>
                                                                                                                            <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                                                            <item code="9#sinon" algoitem="SINON">
                                                                                                                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                                                                <item code="5#terme_4#0#pasliste" algoitem="terme_4 PREND_LA_VALEUR 0"/>
                                                                                                                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                                                            </item>
                                                                                                                        </item>
                                                                                                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                                                    </item>
                                                                                                                </item>
                                                                                                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                                            </item>
                                                                                                        </item>
                                                                                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                                    </item>
                                                                                                </item>
                                                                                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                            </item>
                                                                                        </item>
                                                                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                    </item>
                                                                                </item>
                                                                                <item code="19#Calcule du terme 5" algoitem="//Calcule du terme 5"/>
                                                                                <item code="5#deux_premier_chiffres#(annee - terme_1) / 100#pasliste" algoitem="deux_premier_chiffres PREND_LA_VALEUR (annee - terme_1) / 100"/>
                                                                                <item code="6#deux_premier_chiffres == 16 OU deux_premier_chiffres == 20" algoitem="SI (deux_premier_chiffres == 16 OU deux_premier_chiffres == 20) ALORS">
                                                                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                    <item code="5#terme_5#6#pasliste" algoitem="terme_5 PREND_LA_VALEUR 6"/>
                                                                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                    <item code="9#sinon" algoitem="SINON">
                                                                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                        <item code="6#deux_premier_chiffres == 17 OU deux_premier_chiffres == 21" algoitem="SI (deux_premier_chiffres == 17 OU deux_premier_chiffres == 21) ALORS">
                                                                                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                            <item code="5#terme_5#4#pasliste" algoitem="terme_5 PREND_LA_VALEUR 4"/>
                                                                                            <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                            <item code="9#sinon" algoitem="SINON">
                                                                                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                                <item code="6#deux_premier_chiffres == 18" algoitem="SI (deux_premier_chiffres == 18) ALORS">
                                                                                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                                    <item code="5#terme_5#2#pasliste" algoitem="terme_5 PREND_LA_VALEUR 2"/>
                                                                                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                                    <item code="9#sinon" algoitem="SINON">
                                                                                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                                        <item code="5#terme_5#0#pasliste" algoitem="terme_5 PREND_LA_VALEUR 0"/>
                                                                                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                                    </item>
                                                                                                </item>
                                                                                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                            </item>
                                                                                        </item>
                                                                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                    </item>
                                                                                </item>
                                                                                <item code="19#Calcule du terme 6" algoitem="//Calcule du terme 6"/>
                                                                                <item code="6#annee_bissextile==1" algoitem="SI (annee_bissextile==1) ALORS">
                                                                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                    <item code="6#mois==codeJanvier OU mois==codeFevrier" algoitem="SI (mois==codeJanvier OU mois==codeFevrier) ALORS">
                                                                                        <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                        <item code="5#terme_6#1#pasliste" algoitem="terme_6 PREND_LA_VALEUR 1"/>
                                                                                        <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                        <item code="9#sinon" algoitem="SINON">
                                                                                            <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                            <item code="5#terme_6#0#pasliste" algoitem="terme_6 PREND_LA_VALEUR 0"/>
                                                                                            <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                        </item>
                                                                                    </item>
                                                                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                    <item code="9#sinon" algoitem="SINON">
                                                                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                        <item code="5#terme_6#0#pasliste" algoitem="terme_6 PREND_LA_VALEUR 0"/>
                                                                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                    </item>
                                                                                </item>
                                                                                <item code="19#calcule reste division par 7" algoitem="//calcule reste division par 7"/>
                                                                                <item code="5#somme_5_terme#terme_1+terme_2+terme_3+terme_4+terme_5#pasliste" algoitem="somme_5_terme PREND_LA_VALEUR terme_1+terme_2+terme_3+terme_4+terme_5"/>
                                                                                <item code="5#resteDivision_7#(somme_5_terme-terme_6)%7#pasliste" algoitem="resteDivision_7 PREND_LA_VALEUR (somme_5_terme-terme_6)%7"/>
                                                                                <item code="19#Conversion du numero du jour du numerique à l'alphabétique" algoitem="//Conversion du numero du jour du numerique à l'alphabétique"/>
                                                                                <item code="6#resteDivision_7 == 0" algoitem="SI (resteDivision_7 == 0) ALORS">
                                                                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                    <item code="5#jourEnLettre#'dimanche'#pasliste" algoitem="jourEnLettre PREND_LA_VALEUR 'dimanche'"/>
                                                                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                    <item code="9#sinon" algoitem="SINON">
                                                                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                        <item code="6#resteDivision_7 == 1" algoitem="SI (resteDivision_7 == 1) ALORS">
                                                                                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                            <item code="5#jourEnLettre#'lundi'#pasliste" algoitem="jourEnLettre PREND_LA_VALEUR 'lundi'"/>
                                                                                            <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                            <item code="9#sinon" algoitem="SINON">
                                                                                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                                <item code="6#resteDivision_7 == 2" algoitem="SI (resteDivision_7 == 2) ALORS">
                                                                                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                                    <item code="5#jourEnLettre#'mardi'#pasliste" algoitem="jourEnLettre PREND_LA_VALEUR 'mardi'"/>
                                                                                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                                    <item code="9#sinon" algoitem="SINON">
                                                                                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                                        <item code="6#resteDivision_7 == 3" algoitem="SI (resteDivision_7 == 3) ALORS">
                                                                                                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                                            <item code="5#jourEnLettre#'mercredi'#pasliste" algoitem="jourEnLettre PREND_LA_VALEUR 'mercredi'"/>
                                                                                                            <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                                            <item code="9#sinon" algoitem="SINON">
                                                                                                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                                                <item code="6#resteDivision_7 == 4" algoitem="SI (resteDivision_7 == 4) ALORS">
                                                                                                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                                                    <item code="5#jourEnLettre#'jeudi'#pasliste" algoitem="jourEnLettre PREND_LA_VALEUR 'jeudi'"/>
                                                                                                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                                                    <item code="9#sinon" algoitem="SINON">
                                                                                                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                                                        <item code="6#resteDivision_7 == 5" algoitem="SI (resteDivision_7 == 5) ALORS">
                                                                                                                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                                                            <item code="5#jourEnLettre#'vendredi'#pasliste" algoitem="jourEnLettre PREND_LA_VALEUR 'vendredi'"/>
                                                                                                                            <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                                                            <item code="9#sinon" algoitem="SINON">
                                                                                                                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                                                                <item code="5#jourEnLettre#'samedi'#pasliste" algoitem="jourEnLettre PREND_LA_VALEUR 'samedi'"/>
                                                                                                                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                                                            </item>
                                                                                                                        </item>
                                                                                                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                                                    </item>
                                                                                                                </item>
                                                                                                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                                            </item>
                                                                                                        </item>
                                                                                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                                    </item>
                                                                                                </item>
                                                                                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                            </item>
                                                                                        </item>
                                                                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                    </item>
                                                                                </item>
                                                                                <item code="19#Conversion du numero du mois du numerique à l'alphabétique" algoitem="//Conversion du numero du mois du numerique à l'alphabétique"/>
                                                                                <item code="6#mois == codeJanvier" algoitem="SI (mois == codeJanvier) ALORS">
                                                                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                    <item code="5#moisEnLettre#'janvier'#pasliste" algoitem="moisEnLettre PREND_LA_VALEUR 'janvier'"/>
                                                                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                    <item code="9#sinon" algoitem="SINON">
                                                                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                        <item code="6#mois == codeFevrier" algoitem="SI (mois == codeFevrier) ALORS">
                                                                                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                            <item code="5#moisEnLettre#'février'#pasliste" algoitem="moisEnLettre PREND_LA_VALEUR 'février'"/>
                                                                                            <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                            <item code="9#sinon" algoitem="SINON">
                                                                                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                                <item code="6#mois == codeMars" algoitem="SI (mois == codeMars) ALORS">
                                                                                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                                    <item code="5#moisEnLettre#'mars'#pasliste" algoitem="moisEnLettre PREND_LA_VALEUR 'mars'"/>
                                                                                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                                    <item code="9#sinon" algoitem="SINON">
                                                                                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                                        <item code="6#mois == codeAvril" algoitem="SI (mois == codeAvril) ALORS">
                                                                                                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                                            <item code="5#moisEnLettre#'avril'#pasliste" algoitem="moisEnLettre PREND_LA_VALEUR 'avril'"/>
                                                                                                            <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                                            <item code="9#sinon" algoitem="SINON">
                                                                                                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                                                <item code="6#mois == codeMai" algoitem="SI (mois == codeMai) ALORS">
                                                                                                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                                                    <item code="5#moisEnLettre#'mai'#pasliste" algoitem="moisEnLettre PREND_LA_VALEUR 'mai'"/>
                                                                                                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                                                    <item code="9#sinon" algoitem="SINON">
                                                                                                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                                                        <item code="6#mois == codeJuin" algoitem="SI (mois == codeJuin) ALORS">
                                                                                                                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                                                            <item code="5#moisEnLettre#'juin'#pasliste" algoitem="moisEnLettre PREND_LA_VALEUR 'juin'"/>
                                                                                                                            <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                                                            <item code="9#sinon" algoitem="SINON">
                                                                                                                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                                                                <item code="6#mois == codeJuillet" algoitem="SI (mois == codeJuillet) ALORS">
                                                                                                                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                                                                    <item code="5#moisEnLettre#'juillet'#pasliste" algoitem="moisEnLettre PREND_LA_VALEUR 'juillet'"/>
                                                                                                                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                                                                    <item code="9#sinon" algoitem="SINON">
                                                                                                                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                                                                        <item code="6#mois == codeAout" algoitem="SI (mois == codeAout) ALORS">
                                                                                                                                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                                                                            <item code="5#moisEnLettre#'août'#pasliste" algoitem="moisEnLettre PREND_LA_VALEUR 'août'"/>
                                                                                                                                            <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                                                                            <item code="9#sinon" algoitem="SINON">
                                                                                                                                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                                                                                <item code="6#mois == codeSeptembre" algoitem="SI (mois == codeSeptembre) ALORS">
                                                                                                                                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                                                                                    <item code="5#moisEnLettre#'septembre'#pasliste" algoitem="moisEnLettre PREND_LA_VALEUR 'septembre'"/>
                                                                                                                                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                                                                                    <item code="9#sinon" algoitem="SINON">
                                                                                                                                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                                                                                        <item code="6#mois == codeOctobre" algoitem="SI (mois == codeOctobre) ALORS">
                                                                                                                                                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                                                                                            <item code="5#moisEnLettre#'octobre'#pasliste" algoitem="moisEnLettre PREND_LA_VALEUR 'octobre'"/>
                                                                                                                                                            <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                                                                                            <item code="9#sinon" algoitem="SINON">
                                                                                                                                                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                                                                                                <item code="6#mois == codeNovembre" algoitem="SI (mois == codeNovembre) ALORS">
                                                                                                                                                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                                                                                                                                                    <item code="5#moisEnLettre#'novembre'#pasliste" algoitem="moisEnLettre PREND_LA_VALEUR 'novembre'"/>
                                                                                                                                                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                                                                                                                                                    <item code="9#sinon" algoitem="SINON">
                                                                                                                                                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                                                                                                                                        <item code="5#moisEnLettre#'décembre'#pasliste" algoitem="moisEnLettre PREND_LA_VALEUR 'décembre'"/>
                                                                                                                                                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                                                                                                    </item>
                                                                                                                                                                </item>
                                                                                                                                                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                                                                                            </item>
                                                                                                                                                        </item>
                                                                                                                                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                                                                                    </item>
                                                                                                                                                </item>
                                                                                                                                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                                                                            </item>
                                                                                                                                        </item>
                                                                                                                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                                                                    </item>
                                                                                                                                </item>
                                                                                                                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                                                            </item>
                                                                                                                        </item>
                                                                                                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                                                    </item>
                                                                                                                </item>
                                                                                                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                                            </item>
                                                                                                        </item>
                                                                                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                                    </item>
                                                                                                </item>
                                                                                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                            </item>
                                                                                        </item>
                                                                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                                    </item>
                                                                                </item>
                                                                                <item code="19#Affichage du resultat attendu" algoitem="//Affichage du resultat attendu"/>
                                                                                <item code="4#Le #0" algoitem="AFFICHER &quot;Le &quot;"/>
                                                                                <item code="3#jour#0#pasliste" algoitem="AFFICHER jour"/>
                                                                                <item code="4# #0" algoitem="AFFICHER &quot; &quot;"/>
                                                                                <item code="3#moisEnLettre#0#pasliste" algoitem="AFFICHER moisEnLettre"/>
                                                                                <item code="4# #0" algoitem="AFFICHER &quot; &quot;"/>
                                                                                <item code="3#annee#0#pasliste" algoitem="AFFICHER annee"/>
                                                                                <item code="4# est un #0" algoitem="AFFICHER &quot; est un &quot;"/>
                                                                                <item code="3#jourEnLettre#1#pasliste" algoitem="AFFICHER jourEnLettre"/>
                                                                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                            </item>
                                                                        </item>
                                                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                                    </item>
                                                                </item>
                                                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                            </item>
                                                        </item>
                                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                                    </item>
                                                </item>
                                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                                            </item>
                                        </item>
                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                    </item>
                                </item>
                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                            </item>
                        </item>
                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                    </item>
                </item>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
