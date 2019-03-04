# loremipsum
Projekt dla Akademii kodu. Projekt jest jedną z prac kontrolnych, jest prostym generatorem Lorem Ipsum.

Wykonane z użyciem Gradle (Maven jest starszy, widze że zaleca się używanie Gradle np. Google 
przy programowaniu na platformę Android), do tego pozostawiłem Spring, ale w brnachu standalone próbuję użyć Mustache zamiast słabo działającego Thymeleaf.

Wykorzystuje Springa

=== UWAGI DO POPRAWEK ===

commity w języku angielskim

- metoda generatorLorem z klasy GeneratorController do refaktoryzacji tzn:
trzeba stworzyć inną klasą GeneratorLoremIpsum i metode generate i ten cały kod przerzucić, kontroler tylko dostaje dane zgodnie z MVC i przekazuje je do widoku

- nie nazywamy zmiennych po polsku np. bolek
