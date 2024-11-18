**Aplikacja do walidacji danych tekstowych z użyciem wzorców Łańcuch Odpowiedzialności i Fabryka**

**Lancuch odpowiedzialnosci:**
    Pozwala utworzyc określoną kolejnośc wykonywania operacji na obiektach. 
    Nadaje się do problemów związanych z bezpieczeństwem ale nie tylko.

**Fabryka Abstrakcji:**
    Zapewnia interfejs do tworzenia fabryk/obiektów bez jasnego określenia ich klas Wspiera zasady SOLID, czysty kod
    
**Działanie programu:**
    Na podstawie fabryki abtrakcji, ktora okresla typy walidacji 
    Tworozny jest lancuch odpowiedzialnosci, 
    ktory okresla jakie i w jakiej koljenosci operacje maja zostac wykonane na tekscie 

**Podsumowanie**
    Elastyczne tworzenie i sekwencyjne wykonywanie operacji walidacyjnych na tekście, łatwe dodawanie nowych typów walidacji.