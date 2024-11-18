**Rejestracja użytkowników z zastosowaniem wzorców Proxy i Łańcucha Odpowiedzialności**

**Proxy:**
    Wzorzec ten zarządza dostępem do innego obiektu i pozwala go kontrolować poprzez udostepnienie specjalnego interfejsu.
    Reszta implementacji pozostaje niedostepna dla klienta

**Łancuch odpowiedzialności:**
    Pozwala utworzyc określoną kolejnośc wykonywania operacji na obiektach. 
    Nadaje się do problemów związanych z bezpieczeństwem ale nie tylko.
    
**Działanie programu:**
    Na początku definiowana jest kolejnośc walidacji danych oraz pelnomocnik z mozliwoscia rejestrowania nowych uzytkownikow.
    Po wporwadzniu danych przeprowadzana jest walidacja a nastepnie wyrzucany blad albo rejestrowanie uzytkownika

**Podsumowanie**
    Program realizuje proces rejestracji użytkowników, wykorzystując wzorce Proxy i Łańcuch Odpowiedzialności. 
    Proxy kontroluje dostęp do obiektów, a Łańcuch Odpowiedzialności umożliwia wieloetapową walidację danych przed finalną rejestracją lub zgłoszeniem błędu.
