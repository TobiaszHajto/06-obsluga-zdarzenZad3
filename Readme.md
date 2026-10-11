Wcześniej przyciski +1 i -1 miały wspólny listener z lambdą. 
Teraz obsługa kliknięć znajduje się w metodzie `onClick`, a `MainActivity` implementuje `View.OnClickListener`. 
Wersja z lambdą jest krótsza i prostsza. Wersja z aktywnością jako listenerem ma całą obsługę przycisków w jednym miejscu. 
Przy dodaniu kolejnych pięciu przycisków wybrałbym aktywność jako listener, ponieważ można dopisać kolejne warunki w metodzie `onClick`. 
Przy większej aplikacji kod może jednak stać się mniej czytelny.