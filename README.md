# Mars Rover Kata

Koordinaten: Der Ursprung ist links unten. x wächst nach rechts, y nach oben. Zulässige Größen reichen von 0 bis maxX-1 bzw. 0 bis maxY-1.
Wird eine Grenze überschritten, so geht es am anderen Ende weiter, s.d. sich Grid wie ein Torus verhält.


## Designentscheidungen

Im ersten Wurf habe ich mich beim Rover für den OO-Ansatz entschieden, d.h. der Rover wird als Entity mit eigenem (mutable) State betrachtet.
Immutability würde bedeuten, dass ich nach jeder Statusänderung ein neues Rover-Objekt zurückgeben würde.

Es scheint natürlich, dass der Rover über seine Position Bescheid weiss.
Die Aufgabenstellung suggeriert aber, dass das Grid *nicht* als Rover-Parameter vorgesehen ist. Deshalb habe ich hier im ersten Wurf den Rover (implizit) zu einem Mars-Rover spezialisiert, indem er intern ein spezifisches Grid-Object referenziert.
Dies gefällt mir nicht, so dass ich wohl in einer der nächsten Iterationen Grid auch in den Konstruktor von Rover aufnehmen werde.


## Testing

Ich bin bei der Neuanlage des Projekts auf die neueste Version von specs2 gegangen. Unter SBT (sbt test) funktioniert alles wie erwartet; innerhalb von Eclipse lässt sich der Test aber nicht wie gewohnt als JUnit-Test starten. Aus Zeitgründen ignoriere ich dieses Problem vorläufig.
