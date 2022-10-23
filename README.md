# IFT3913-TP2

Bianca Bica (20161056)
Chaima Boussora (20159909)

Lien vers le repo git : https://github.com/biancabica/IFT3913-TP2.git

Q2.
Récolte des données:
CBO, LCOM, WMC: Nous avons utilisé un plugin externe de l'éditeur IntelliJ Idea qui s'appelle MetricsTree. Celui-ci peut être téléchargé directement à partir de l'éditeur (File --> Settings --> Plugins --> Marketplace --> MetricsTree --> Install). Le plugin calcule les métriques mentionnées ci-dessus et les exporte dans un fichier CSV. Dans notre repo il se nomme "metriques_CBO_LCOM_WMC.csv".

NBAC: Nous avons utilisé un plugin externe de l'éditeur IntelliJ Idea qui s'appelle SonarLint. Celui-ci peut être téléchargé directement à partir de l'éditeur (File --> Settings --> Plugins --> Marketplace --> SonarLint --> Install). Le plugin calcule NBAC, nous avons récolté la métrique pour chaque fichier et l'avons mise dans un fichier CSV. Dans notre repo il se nomme "metrique_NBAC.csv".

PMNT et TPC: Nous avons utilisé une fonctionnalité d'IntelliJ qui nous permet de récolter ces données dans un fichier HTML. Il suffit de faire un clic-droit sur le dossier "test" et cliquer sur l'option "More run/debug"Run test with coverage". Dans notre repo, le fichier HTML se nomme "metriques_PMNT_TPC.html".

DC: L'implémentation de la métrique DC a été faite par nous-mêmes en code Java. Le code exécutable se retrouve dans un executable JAR.
