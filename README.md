### Cet épisode : Les fonctions Lambda. Dans cette série, nous couvrons les bases des services cloud AWS.
- Dans ce cas, nous allons présenter les fonctions AWS Lambda et écrire une fonction qui retourne un "Hello World" en JAVA. 
- Nous le ferons étape par étape:

  - Étape 0 : Creer un projet maven avec IntelliJ IDEA
  - Étape 1 : Console AWS
  - Étape 2 : Créer une nouvelle fonction AWS Lambda
  - Étape 3: Déployer la fonction Lambda sur AWS
  - Étape 4: Tester la fonction Lambda
  - Étape 5: Créer une API Gateway
  - Étape 6: Tester l'API Gateway

## Pré-requis
     - JAVA
     - Maven
     - AWS console access

## Étape 0 : Creer un projet maven avec IntelliJ IDEA

- Nous allons maintenant créer notre projet maven avec IntelliJ.
   - Aller dans IntelliJ IDEA
   - Clicquer sur fichier 
   - Selectionner sur New et puis cliquer sur project
   - Entrer le nom du projet "hello-lambda"
   - Choisir le JDK Java 11
   - Cliquer sur le bouton "Create"
   - Ecrire la classe HelloLambda.java
   
- Build le projet
   - mvn clean package  
     - Efface le répertoire target, build le projet et packages le fichier JAR dans le répertoire target.
   - mvn test 
     - pour executer les tests unitaires 

![build](https://github.com/sulaylv/hello-lambda/assets/136634640/a02d7901-8db1-4c8c-84d3-a3f28691df76)

![test-unit](https://github.com/sulaylv/hello-lambda/assets/136634640/32ad57d8-b556-4636-a51f-86645642ade6)

## Étape 1 : Console AWS
- Naviguons vers la zone de la console AWS où nous allons travailler.
 - Accédez à la console AWS et connectez-vous.
 - En haut à droite, sélectionnez dans la liste déroulante la région AWS dans laquelle vous souhaitez travailler, généralement une région proche de votre lieu de résidence.
 - Naviguez jusqu'à la section AWS Lambda. Vous pouvez saisir "Lambda" dans la barre de recherche pour la trouver.

![console-aws](https://github.com/sulaylv/hello-lambda/assets/136634640/149dea05-80d2-40d5-a613-e0bceb13d16d)

## Étape 2 : Créer une nouvelle fonction AWS Lambda
- Nous allons maintenant créer notre fonction AWS Lambda.
  - Dans la console AWS, accédez à la page Lambda > Fonctions
  - Cliquez sur Créer une fonction
  - Sélectionnez "Créer à partir de zéro", car il s'agit d'une fonction simple et autonome.
  - Pour le nom de la fonction, entrez getHelloWorld.
  - Sous "Exécution", sélectionnez une  version JAVA disponible. Nous utilisons java 11.
  - Les autres paramètres sont définis par défaut
  - Cliquez sur Créer une fonction.
 
  ![page-console-function](https://github.com/sulaylv/hello-lambda/assets/136634640/9fab9f0e-b323-4e93-9951-e7ac2c4231bd)

  ![creation-function-lambda](https://github.com/sulaylv/hello-lambda/assets/136634640/717d91c6-91ac-4170-9f16-484dbe69419d)

  ![list-function-lambda](https://github.com/sulaylv/hello-lambda/assets/136634640/4498838a-27a2-4a27-9c9c-e7f4c10f0a09)

## Étape 3: Déployer la fonction Lambda sur AWS 
- Nous allons maintenant déployer notre fonction sur AWS. Nous pouvons le faire directement depuis AWS console.
  - Dans la console AWS, accédez à la page Lambda > Fonctions
  - Cliquez sur "Charger depuis" 
  - Sélectionnez "Fichier .zip ou .jar"
  - Cliquez sur "Charger"
  - Parcourir votre repertoire de votre projet maven
  - Sélectionnez votre fichier "hello-lambda-1.0-SNAPSHOT.jar" depuis le repertoire target de votre projet maven
  - Cliquez sur "Enregistrer"

![presentation-fonction](https://github.com/sulaylv/hello-lambda/assets/136634640/d744ae67-3bcc-47a9-9eb3-8da94c42fa8a)

![onglet-charger-depuis-2](https://github.com/sulaylv/hello-lambda/assets/136634640/319b0525-a6fb-4c19-be16-1863fcca76bd)

![charger-file-jar](https://github.com/sulaylv/hello-lambda/assets/136634640/3fab0b3b-1a3e-4ede-9060-3e85df7b9814)

## Étape 4: Tester la fonction Lambda
  - Nous allons maintenant tester notre fonction sur AWS. Nous pouvons le faire directement depuis AWS console.
    - Dans la console AWS, accédez à la page Lambda > Fonctions
    - Sélectionnez l'onglet "Tester"
    - Et puis cliquer sur le bouton "Tester"
    - Le message "hello world..." s'affiche sur la comsole

![test-labmda-function-in-console](https://github.com/sulaylv/hello-lambda/assets/136634640/f1e5d91a-1cb2-4b0c-baf4-1932656f0654)


## Étape 5: Créer une API Gateway
- Nous allons maintenant créer notre API et et configurer des intégrations.
   - Dans la console AWS, accédez à la page API Gateway
   - Cliquez sur Créer une API
   - Choisir un type d’API
   - Cliquer sur "creation"
   - Créer et configurer des intégrations
	  - Sous "Intégrations", sélectionnez Lambda.
	  - Sous "Fonction Lambda", sélectionnez la fonction lambda: "arn:aws:lambda:us-east-2:341598998297:function:getHelloWorld".
	  - Pour le nom de l' API, entrez helloworld-api.
	  - Cliquer sur "suivant"
	- Configurer des routes
	  - Choisir une Méthode(GET, POST, ANY, etc ...)
	  - Cliquer sur "suivant"
	- Configurer les étapes
	  - Saisir le Nom de l’étape ou laisser pour $default
	  - Cliquer sur "suivant"
	- Vérifier et créer
	  - Cliquer sur "creer"

![api-a-creer](https://github.com/sulaylv/hello-lambda/assets/136634640/679c7a17-2c0c-480c-9956-c0ca5907dd16)

![choix-type-api](https://github.com/sulaylv/hello-lambda/assets/136634640/5ff60ee8-6fcb-47c2-a1a4-fda97799f775)

![Creer et configurer des intégrations](https://github.com/sulaylv/hello-lambda/assets/136634640/db038722-cd89-4dd6-803e-3a5a180ee754)

![configuration-des-routes](https://github.com/sulaylv/hello-lambda/assets/136634640/91a907db-094e-4d14-a5b1-cef995665713)

![config-etapes](https://github.com/sulaylv/hello-lambda/assets/136634640/8b3dd77f-5bb2-4d84-b3ed-0d76213d1240)

![verifier-et-creer-1](https://github.com/sulaylv/hello-lambda/assets/136634640/52531293-814a-4192-afc4-9c268241184b)

![verifier-et-creer-2](https://github.com/sulaylv/hello-lambda/assets/136634640/4b8cbefd-77c0-4b79-85ea-7aaf94fc2f1e)

![list-api](https://github.com/sulaylv/hello-lambda/assets/136634640/66c4b322-c47e-4aea-b4c3-d01deefce966)

## Étape 6: Tester l'API Gateway
   - Dans la console AWS, accédez à la page Lambda > Fonctions
      - Cliquez sur "API Gateway"
      - Aller dans l'onglet "Configuration"
      - Et puis dans l'onglet "Declencheur"
      - Au Point de terminaison d’API Cliquer sur le lien:
        "https://v6xheiz5t7.execute-api.us-east-2.amazonaws.com/getHelloWorld"
      - Le message "hello world..." s'affiche sur le navigateur
      - A tester aussi sur Postman

![presentation-fonction](https://github.com/sulaylv/hello-lambda/assets/136634640/ad98e3f7-9a83-435d-be08-39c63a46ed9a)

![declencheur-et-details](https://github.com/sulaylv/hello-lambda/assets/136634640/2a6f3dfc-561b-49a2-8aaa-74ac095b771b)

![msg-resul-navig](https://github.com/sulaylv/hello-lambda/assets/136634640/e87103c6-9402-4843-aa9e-43dc7c401ccb)

![postman-result](https://github.com/sulaylv/hello-lambda/assets/136634640/661c7210-27e4-4508-b894-fd4624be6fdd)
