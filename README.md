# intro-to-Java

***Open in Raw mode in order to see the text formatted.***

chapter7 - Arrays

Array20.java
      Да се напише програма, която създава масив с 20 елемента от
      целочислен тип и инициализира всеки от елементите със стойност равна
      на индекса на елемента умножен по 5. Елементите на масива да се
      изведат на конзолата.

ArrayOfLetters.java
      Да се напише програма, която създава масив с всички букви от
      латинската азбука. Да се даде възможност на потребител да въвежда
      дума от конзолата и в резултат да се извеждат индексите на буквите от
      думата.
BinarySearch.java
      Да се реализира двоично търсене (binary search) в сортиран
      целочислен масив.
EqualArrays.java
      Да се напише програма, която чете два масива от конзолата и проверява
      дали са еднакви.
LexicographicCompare.java
      Да се напише програма, която сравнява два масива от тип char
      лексикографски (буква по буква) и проверява кой от двата е по-рано в
      лексикографската подредба.
MaxEqualElements.java
      Напишете програма, която намира максималната редица от еднакви
      елементи в масив. Пример: {2, 1, 1, 2, 3, 3, 2, 2, 2, 1} -> {2, 2, 2}.
MaxIncreasingElements.java
      Напишете програма, която намира максималната редица от нарастващи
      елементи в масив. Пример: {3, 2, 3, 4, 2, 2, 4} -> {2, 3, 4}.
MaxSumInArray.java
      Да се напише програма, която чете от конзолата две цели числа N и K,
      и масив от N елемента. Да се намерят тези K елемента, които имат
      максимална сума.
MergeSort.java
      Напишете програма, която сортира целочислен масив по алгоритъма
      "merge sort".
MostPopularElement.java
      Напишете програма, която намира най-често срещания елемент в масив.
      Пример: {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3} -> 4 (5 пъти).
PrimeNumbers.java
      Напишете програма, която намира всички прости числа в диапазона
      [1..10 000 000].
QuadraticMatrix.java
      Напишете програма, която създава следните квадратни матрици и ги
      извежда на конзолата във форматиран вид. Размерът на матриците се
      въвежда от конзолата.
 //не е цяла
 QuickSort.java
       Напишете програма, която сортира целочислен масив по алгоритъма
       "quick sort".
 RectangularMatrix.java
       Да се напише програма, която създава правоъгълна матрица с размер
       (n, m). Размерността и елементите на матрицата да се четат от
       конзолата. Да се намери подматрицата с размер (3,3), която има
       максимална сума.
 SelectionSort.java
       Сортиране на масив означава да подредим елементите му в нарастващ
       (намаляващ) ред. Напишете програма, която сортира масив. Да се
       използва алгоритъма "Selection sort".
 SumOfSequence.java
       Да се напише програма, която намира последователност от числа в
       масив, които имат сума равна на число, въведено от конзолата (ако има
       такава). Пример: {4, 3, 1, 4, 2, 5, 8}, S=11 -> {4, 2, 5}.
       
 //Глава 8 е Бройни системи
 
 chapter9 - Methods
 
 AdjacentElements.java
       Напишете метод, който проверява дали елемент, намиращ се на дадена
       позиция от масив, е по-голям, или съответно по-малък от двата му
       съседа.
 BackwordsDigits.java
       Напишете метод, който отпечатва цифрите на дадено десетично число
       в обратен ред. Например 256, трябва да бъде отпечатано като 652.
 DigitInEnglish.java
       Напишете метод, който връща английското наименование на последната
       цифра от дадено число. Примери: за числото 512 отпечатва "two"; за
       числото 1024 – "four".
 Factorial100.java
       Напишете програма, която пресмята и отпечатва n! за всяко n в
       интервала [1..100].
 FirstBiggerElement.java
       Напишете метод, който връща позицията на първия елемент на масив,
       който е по-голям от двата свои съседи едновременно, или -1, ако няма
       такъв елемент.
 HelloName.java
       Напишете метод, който при подадено име отпечатва в конзолата "Hello,
       <name>!" (например "Hello, Peter!"). Напишете програма, която тества
       този метод.
 MaxNumber.java
       Създайте метод getMax() с два целочислени (int) параметъра, който
       връща по-голямото от двете числа. Напишете програма, която прочита
       три цели числа от конзолата и отпечатва най-голямото от тях, изпол-
       звайки метода getMax().
 Menu.java
       Напишете програма, която решава следните задачи:
          - Обръща последователността на цифрите на едно число.
          - Пресмята средното аритметично на дадена редица.
          - Решава линейното уравнение a * x + b = 0.
       Създайте подходящи методи за всяка една от задачите.
       Напишете програмата така, че на потребителя да му бъде изведено
       текстово меню, от което да избира коя задача да решава.
       Направете проверка на входните данни:
          - Десетичното число трябва да е неотрицателно.
          - Редицата не трябва да е празна.
          - Коефициентът a не трябва да е 0.
 Occurrences.java
       Напишете метод, който намира колко пъти дадено число се среща в
       даден масив. Напишете програма, която проверява дали този метод
       работи правилно.
 Polynomial.java
       Напишете метод, който умножава два многочлена.
        
 chapter10 - Recursion
 
 AllSubsetsOfStrings.java
       Напишете програма, която отпечатва всички подмножества на дадено
       множество от думи.
       Примерен вход:
       words = {'test', 'rock', 'fun'}
       Примерен изход:
       (), (test), (rock), (fun), (test rock), (test fun),
       (rock fun), (test rock fun)
 Combinations.java
       Напишете програма, която генерира и отпечатва всички комбинации с
       повторение на k елемента над n-елементно множество.
       Примерен вход:
       n = 3
       к = 2
       Примерен изход:
       (1 1), (1 2), (1 3), (2 2), (2 3), (3 3)
 KSubsetsOfStrings.java
       Нека е дадено множество от символни низове. Да се напише програма,
       която генерира всички подмножества съставено от k на брой символни
       низа, избрани измежду елементите на това множество.
       Примерен вход:
       strings = {'test', 'rock', 'fun'}
       k = 2
       Примерен изход:
       (test rock), (test fun), (rock fun)
 MergeSort.java
       Реализирайте алгоритъма "сортиране чрез сливане" (merge-sort). При
       него началният масив се разделя на две равни по големина части, които
       се сортират (чрез merge-sort) и след това двете сортирани части се
       сливат, за да се получи целият масив в сортиран вид.
 Permutations.java
       Напишете програма, която генерира и отпечатва пермутациите на
       числата 1, 2, …, n, за дадено цяло число n.
       Примерен вход:
       n = 3
       Примерен изход:
       (1, 2, 3), (1, 3, 2), (2, 1, 3), (2, 3, 1), (3, 1, 2), (3, 2, 1)
 SumN.java
       Даден е масив с цели числа и число N. Напишете програма, която
       намира всички подмножества от числа от масива, които имат сума N
 SumOfSubsets.java
       Даден е масив с цели числа. Напишете програма, която проверява дали
       в масива съществуват едно или повече числа, чиято сума е N.
 Variations.java
       Напишете програма, която генерира всички вариации с повторение на n
       елемента от k-ти клас.
       Примерен вход:
       n = 3
       к = 2
       Примерен изход:
       (1 1), (1 2), (1 3), (2 1), (2 2), (2 3), (3 1), (3 2), (3 3)
       
 chapter11 - Objects (unfinished)
 
 CountDDHHMM.java
       Напишете програма, която извежда на стандартния изход броя на дните,
       часовете и минутите, които са изтекли от 1 януари 1970 година до
       момента на изпълнението на програмата. За реализацията използвайте
       класа System.
 Rectangle.java
       Напишете програма, която по дадени два катета намира хипотенузата
       на правоъгълен триъгълник. Реализирайте въвеждане на дължините на
       катетите от стандартния вход, а за пресмятането на хипотенузата
       използвайте методи на класа Math.
       
 test
 
 Cat.java и Sequence.java
       Копиран код от текущата глава - по условие от задача Test.java (test.examples):
       
       Test.java
             Дефинирайте свой собствен пакет chapter10 (в случая е test) и поставете в него двата
             класа Cat и Sequence, които използвахме в примерите на текущата тема.
             Направете още един собствен пакет с име chapter10.examples (test.examples) и в него
             направете клас, който извиква класовете Cat и Sequence.
 CatManipulation.java (не е завършена)
       Напишете програма, която създава 10 обекта от тип Cat, дава им имена
       от вида CatN, където N e уникален пореден номер на обекта, и накрая
       извиква метода sayMiau() на всеки от тях. За реализацията използвайте
       вече дефинирания пакет chapter10 (test).