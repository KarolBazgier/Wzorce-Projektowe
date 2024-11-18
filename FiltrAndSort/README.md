**Prosta aplikacja do filtrowania i sortowania danych z zastosowaniem wzorców Dekorator i Obserwator**

**Dekorator:**
    Umożliwia dynamiczne dodawanie nowych funkcjonalności dla klasy, 
    dzięki czemu możemy stworzyc "udekorowaną" instancje danej klasy bez zmiany podstawowego obiektu 

**Obserwator:**
    Jest to bezposrednia relacja Producent-Klient, gdzie na jendego producenta moze przyapdac paru klientów,
    którym trzeba dostarczyć informacje
    Kiedy obiekt Producenta zmienia swój stan, spowoduje to poinformowania zarejestrowanych klientow 

**Działanie programu:**
   Tworzona jest klasa z osobami, następnie dodane są dekoratory w postaci filter i sort
    oraz na koniec dodany podstawwowy obserwator wypisujący dane po przefiltrowaniu 

**Podsumowanie**
    Dzięki temu rozwiązaniu użytkownik może filtrować i sortować dane w elastyczny sposób,
    jednocześnie automatycznie informując obserwatorów o wynikach.