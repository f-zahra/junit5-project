
# Calculatrice

Ce projet est une calculatrice Java simple qui permet d'effectuer des opérations arithmétiques de base telles que l'addition, la soustraction, la multiplication, la division et la somme.

## Structure du Projet

Le projet est organisé comme suit :

- `Calculator.java`: Cette classe contient les méthodes pour effectuer les opérations arithmétiques.
- `CalculatorTest.java`: Ce fichier contient les tests unitaires pour les méthodes de la classe Calculator.
- `README.md`: Ce fichier, qui fournit des informations sur le projet.

## Fonctionnement des Méthodes

- `add(double... numbers)`: Ajoute les nombres fournis en argument et retourne le résultat de l'addition.
- `subtract(double... numbers)`: Soustrait les nombres fournis en argument et retourne le résultat de la soustraction.
- `multiply(double... numbers)`: Multiplie les nombres fournis en argument et retourne le résultat de la multiplication.
- `divide(double num1, double num2)`: Divise le premier nombre par le deuxième et retourne le résultat de la division.
- `sum(double... numbers)`: Appelle la méthode `add` pour effectuer une somme des nombres fournis en argument et retourne le résultat.

## Annotations JUnit 5 Utilisées

Dans les tests unitaires, les annotations JUnit 5 suivantes sont utilisées :

- `@BeforeEach`: Utilisée pour exécuter une méthode d'initialisation avant chaque test.
- `@Test`: Utilisée pour définir une méthode de test.
- `@DisplayName`: Utilisée pour fournir un nom plus descriptif aux tests.
- `@ParameterizedTest`: Utilisée pour exécuter un test avec différentes valeurs de paramètres.
- `@Assertions`: Utilisée pour les assertions telles que `assertEquals` et `assertThrows`.


