# Parciales — Análisis de Algoritmos (193502)

Universidad Francisco de Paula Santander Ocaña  
Programa: Ingeniería de Sistemas  
Semestre: V  
Créditos: 3  
Asignatura: **Análisis de Algoritmos**

---

## Instrucciones generales

- Tiempo máximo: **60 minutos**
- Cada parcial tiene **4 puntos (25 pts c/u)**
- Usa Python o pseudocódigo claro.
- Para comparar funciones, basta con un **`for` + `if`** y reportar el menor `n` que verifica la desigualdad.
- Justifica con fórmulas y razonamiento.

---

# Parcial — Versión B

### Punto 1 (25 pts) — Ordena por complejidad

Ordena de menor a mayor las siguientes funciones (asintóticamente).  
Si dos son del mismo orden, indícalo.

![Logo](https://lh3.googleusercontent.com/pw/AP1GczOKbm4PRxvPmIk6xzWEndiZu8Rshw7xbFWnNI3rltL041tyTLuAEoS_afx5V8mtGSJr9FWorLJj02v-8Ga3JJ6YDmsSpBgSFL8ruWN_1OLTVyTerg_9zIomuoPte5JNZIQ_yNwoxVdjH8460tgjJaPO=w128-h290-s-no?authuser=0)

---

### Punto 2 (25 pts) — Identifica y confronta

Asocia cada \(T(n)\) con un algoritmo plausible. Luego compara **dos pares** y encuentra el umbral de `n` con un `for` + `if`.

- T1(n) = 5n^2 + 10n
- T2(n) = 6n\log2(n) + 300
- T3(n) = 0.01n^3
- T4(n) = 1.5^n

Algoritmos posibles:

- Selection/Insertion
- Mergesort/Heapsort
- Multiplicación de matrices cúbica
- Backtracking con poda leve

---

### Punto 3 (25 pts) — Ejercicio lógico

#### Isaac y los intervalos mágicos

Isaac, convencido de que tiene un talento especial para los números, asegura que puede contar al instante cuántos primos existen en cualquier rango que le propongan sus amigos. Para comprobarlo, ellos le entregan una lista con N pares de números (a,b), y él debe responder de inmediato cuántos números primos hay en cada intervalo. A partir de esta historia, elabora el análisis necesario para resolver el problema y define claramente qué se recibe como entrada, qué se debe producir como salida y qué lógica se requiere para verificar la afirmación de Isaac.

---

### Punto 4 (25 pts) — Cuestionario

[![Click here!!](https://cf.quizizz.com/img/wayground/brand/plans/logo-basic.png)](https://wayground.com/join?gc=846438)

### Solucion y correcion

### Punto 1

log2(n) < raiz(n)*log2(n) < n^0.99 < n < n*log2(n) < n^(3/2) < n^2/log2(n) < n^2 < 2^(n/2)\*n < 3^n

### Punto 2

- Asociación:

  T1(n) = 5n^2 + 10n → Algoritmo cuadrático: Selection / Insertion sort.

  T2(n) = 6n\*log2(n) + 300 → Algoritmo O(n log n): Mergesort / Heapsort.

  T3(n) = 0.01n^3 → Algoritmo cúbico: Multiplicación de matrices cúbica.

  T4(n) = 1.5^n → Algoritmo exponencial: Backtracking con poda leve.

- Comparando T1(n) con T2(n) encuentro que:
  5n^2 + 10n < 6n\log2(n) + 300
  A partir de n>=7 lo que indica que a partir de esa entrada ese algoritmo es mas rapido

- Comparando T1(n) con T3(n) encuentro que:
  5n^2 + 10n<0.01n^3
  A partir de n>=502 lo que indica que a partir de esa entrada ese algoritmo es mas rapido

- Comparando T1(n) con T4(n) encuentro que:
  5n^2 + 10n<1.5^n
  A partir de n>=19 lo que indica que a partir de esa entrada ese algoritmo es mas rapido

### Punto 3

- Analisis
  Isaac afirma que puede decir cuántos números primos hay en cualquier rango [a, b] que le propongan.
  Sus amigos le entregan N pares de números (a, b), y él debe responder cuántos primos existen en cada uno de esos intervalos.

- Entrada

  - Un número entero N → la cantidad de pares de intervalos que entregan los amigos.
  - Luego, N líneas con dos números enteros a y b, que representan los límites del intervalo [a, b].

- Salida

  - Por cada par (a, b), se debe imprimir un número entero que indique cuántos números primos hay en ese rango (incluyendo los límites).

- Logica

  1. Leer el valor de N.

  2. Para cada intervalo (a, b):

  - Inicializar un contador de primos en cero.

  - Recorrer todos los números desde a hasta b.

  - Verificar si cada número es primo.

  - Si lo es, aumentar el contador.

  - Imprimir el resultado.

  3.La verificación de si un número es primo se hace probando divisores desde 2 hasta la raíz cuadrada del número.
