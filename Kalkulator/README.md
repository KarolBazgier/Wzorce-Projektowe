**Prosty program "Kalkulator" z wykorzystaniem wątków, obsługą błedów i wzroców projektowych Strategia i Fabryka abstrakcji**

**Strategia:**
Określa w jaki sposób dany obiekt ma reagować lub jakie operacje mają zostać na nim wykonane.
Pozwala na szybką zmiane i wybór akcji pasującej do sytuacji nie zależnie od klienta.
Oddziela logike od reszty kodu, która powinna byc niedostępna dla klienta

**Fabryka abstrakcji:**
Zapewnia interfejs do tworzenia fabryk/obiektów bez jasnego określenia ich klas
Wspiera zasady SOLID, czysty kod

**Działanie programu:**
Utworzenie obiektu Calculator z paramtrem AbstractFactory w kontruktorze.
Wybranie operacji jaka ma zostac wykonane - fabryka utworzy odpowiednia instacje klasy implementujacej MathOperation.
Wykonanie obliczen po wywolaniu metody calculate z wczesniej wybranej i utworzonej klasy.

**Podsumowanie**
Fabryka Abstrakcji - umożliwia tworzenie obiektow MathOperation  i pozwala na łatwe rozbudowanie aplikacji nie zminiając starego kodu
Strategia - umożliwiwia dynamiczną zmiane operacji

   