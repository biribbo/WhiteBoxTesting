# RAPORT - TESTY BIAŁOSKRZYNKOWE
Link do repozytorium: [klik](https://github.com/biribbo/WhiteBoxTesting). Testy białoskrzynkowe oraz poprawki po przeprowadzeniu testów mutacyjnych znajdują się odpowiednio w branchach ***whiteboxtesting*** i ***mutationtesting***.
### Pokrycie kodu
Oryginalne testy mają statement coverage na poziomie 7% oraz branch coverage na poziomie 100%. 
Po poprawkach oba wskaźniki osiągają wartość 100%. Wygenerowane raporty znajdują się w plikach ***pokrycie_przed.pdf*** oraz ***pokrycie_po.pdf***.
### Testy mutacyjne
Raport z przeprowadzenia testów mutacyjnych znajduje się w pliku ***mutacje_przed.html***. 
Po uzupełnieniu testów tylko jeden mutant "przeżył" (również po zmianie konfiguracji na *ALL*) - **CHANGED CONDITIONAL BOUNDARY** w funkcji *calculator.factorial*. Warunek to **i < 1**. Dopisanie testu dla **1** i **2** nie pomogło, ponieważ wynik dla 1 jest taki sam jak dla wszystkich liczb poniżej 1. By usunąć mutanta, zmieniłam warunek w funkcji na **i < 2** oraz dopisałam do testów **assertNotEquals(1, calculator.factorial(2))**.
