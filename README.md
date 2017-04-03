# Mars Rover Kata

Koordinaten: Der Ursprung ist links unten. x w�chst nach rechts, y nach oben. Zul�ssige Gr��en reichen von 0 bis maxX-1 bzw. 0 bis maxY-1.
Wird eine Grenze �berschritten, so geht es am anderen Ende weiter, s.d. sich Grid wie ein Torus verh�lt.


## Designentscheidungen

Im ersten Wurf habe ich mich beim Rover f�r den OO-Ansatz entschieden, d.h. der Rover wird als Entity mit eigenem (mutable) State betrachtet.
Immutability w�rde bedeuten, dass ich nach jeder Status�nderung ein neues Rover-Objekt zur�ckgeben w�rde.

Es scheint nat�rlich, dass der Rover �ber seine Position Bescheid weiss.
Damit sollte der Rover auch wissen, auf welchem Grid er sich befindet.
Daher ist das zu verwendende Grid als dritter Konstruktorparameter vorgesehen.
Per Default ist es auf Mars gesetzt.


## Testing

Ich bin bei der Neuanlage des Projekts auf die neueste Version von specs2 gegangen. Unter SBT (sbt test) funktioniert alles wie erwartet; innerhalb von Eclipse l�sst sich der Test aber nicht wie gewohnt als JUnit-Test starten. Aus Zeitgr�nden ignoriere ich dieses Problem vorl�ufig.
