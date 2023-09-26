### Problème

On veut que notre classe Application puisse créer des documents mais qu'elle ne dépende pas d'une classe concrète de document.

### Solution

L'utilisation du dp Factory permet de créer des objets dans une classe, mais de déléger le choix du type d'objet à créer aux sous-classes.
Donc, la classe Application ne connait pas le type concret du document qu'elle utilise car ce sont les classes concrète d'Application qui 
créent le type de Document qu'elles doivent utiliser.




