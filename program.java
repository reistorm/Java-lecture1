// public class program {
//     static public void main(String[] args) {
//         System.out.println("wo1616rld");
//     }
// }

/*
 * Program
 * public class Program {
 * public static void main(String[] args) {
 * System.out.println("Goodbye world");
 * }
 * }
 * для вывода массива строк
 */

/* 
 * Типы данных и переменных
 * Program
 * public class Program {
 * public static void main(String[] args) {
 * String s = "  12"
 * System.out.println(s);
 * }
 * }
 * 
 * int От -2 млрд до 2 млрд
 * float e = 2.7f;
 * double pi = 3.1415; //можно дописывать D
 * char ch = '1'; //символ
 * boolean flag1 = 123
 * 
 * boolean f = true && false;
 * System.out.println(f);
 * 
 * boolean f = true ^^ false; // когда одно из значений истина
 * System.out.println(f);
 */

// СТроки 

// Program
// public class Program {
//     public static void main(String[] args) {
//         String msg = "Hello world";
//         System.out.println(msg);
//     }
// } 

// Неявная типизация - внизу прога, как определить тип переменной
// public class program {
//     public static void main(String[] args) {
//         var a = 123;
//         System.out.println(a);
//         var d = 123.456;
//         System.out.println(d);
//         System.out.println(getType(a));
//         System.out.println(getType(d));
//         d = 1022;
//         System.out.println(d);

//     }
//     static String getType(Object o){
//         return o.getClass().getSimpleName();
//     }
// }

// Классы-обертки. Для типов данных есть классы-обертки
// public class program {
//     public static void main(String[] args) {
//         int i = 123;
//         System.out.println(Integer.MIN_VALUE);
//     }
// }

// public class program {
//          public static void main(String[] args) {
//             String s = "qwer"; // строка -массив символов
//             s.length(); // определение длины строки
//             s.charAt(1); // обращение к первому символу i=1
//          }
//             }

// Операции в Java
// Присваивание: =

// Арифметические: *, /, +, -, %, ++, --
//  префиксный инкремент (в приоритете) ++а
//  постфиксный инкремент а++
// Операции сравнения: <, >, ==, !=, >=, <=
// public class program {
//     public static void main(String[] args) {
//         boolean f = 123 <= 234;
//         System.out.println(f);
//     }
// }

// Логические операции:  ||, &&, ^, !

// Побитовые операции <<, >>, &, |, ^
// public class program {
//     public static void main(String[] args) {
//         int a = 8;
//         // 1000 в двоичной системе 8
//         System.out.println(a << 1);
//         // 10000
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int a = 18;
//         // 10010 в двоичной системе 8
//         System.out.println(a >> 1);
//         // 1001
//     }
// }
// разделительное или | 
// public class program {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 2;
//         System.out.println(a | b);
//         // 4 - 101
//         // 5 - 010
//         // 7 - 111
//     }
// }
// побитовая конвертация &
// public class program {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 2;
//         System.out.println(a & b);
//         // 4 - 101
//         // 5 - 010
//         // 0 - 000
//     }
// }

// побитовая ^ разделительная или
// public class program {
//         public static void main(String[] args) {
//             int a = 5;
//             int b = 2;
//             System.out.println(a ^ b);
//             // 101
//             // 010  
//             // 111
//         }
//     }

// Массивы
// одномерные массивы
// public class program {
//     public static void main(String[] args){
//         int[] arr = new int[10];
//         System.out.println(arr.length);
//         arr = new int[] {1,2,3,4,5};
//         System.out.println(arr.length);
//     }
// }

// многомерные массивы
// public class program {
//     public static void main(String[] args) {
//         int[][] arr = new int[3][5];
//         for (int i=0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.printf("%d ", arr[i][j]);

//             }
//             System.out.println();
//         }
//     }
// }

// Преобразования

// public class program{
//     public static void main(String[] args){
//         int i = 123; double d = i;
//         System.out.println(i);
//         System.out.println(d);
//         d = 3.1415; i = (int)d;
//         System.out.println(d);
//         System.out.println(i);
//         d = 3.9415; i = (int)d;
//         System.out.println(d);
//         System.out.println(i);
//         byte b = Byte.parseByte("123");
//         System.out.println(b);
//         b = Byte.parseByte("1234"); // byte хранит от 0 до 250
//         System.out.println(b);
        
        
//     }
// }

// Получение данных из терминала
// строки
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args){
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s!", name);
//         iScanner.close();
//     }
// }
// некоторые примитивы
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args){
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x + y);
//         iScanner.close();
//     }
// }

//Проверка на соответствие получаемого типа
// import java.util.Scanner;
// public class program {
//    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("int a: ");
//        boolean flag = iScanner.hasNextInt();
//        System.out.println(flag);       
//        int i = iScanner.nextInt();
//        System.out.println(i);       
//        iScanner.close();
//    } }

//Форматированный вывод
// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = a + " + " + b + " = " + c;
//         System.out.println(res);
//     }
// }
//неявное преобразование int в string, лучше так не делать 100%
// public class program{
//     public static void main(String[] args){
//         String s = "qwe";
//         int a = 123;
//         String q = s + a; //неявное преобразование int в string
//         System.out.println(q);
//     }
// }

//Форматированный вывод
// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = String.format("%d + %d = %d \n", a, b, c);
//         System.out.printf("%d + %d = %d \n", a, b, c);
//         System.out.println(res);
//     }
// }

//Виды спецификаторов
// %d: целочисленных значений
// %x: для вывода шестнадцатеричных чисел
// %f: для вывода чисел с плавающей точкой
// %e: для вывода чисел в экспоненциальной форме, 
// например, 3.1415e+01
// %c: для вывода одиночного символа
// %s: для вывода строковых значений

//Виды спецификаторов (количество запятых)
// public class Program {
//     public static void main(String[] args) {
       
//         float pi = 3.1415f;
//         System.out.printf("%f\n", pi);    // 3,141500
//         System.out.printf("%.2f\n", pi);  // 3,14
//         System.out.printf("%.3f\n", pi);  // 3,141
//         System.out.printf("%e\n", pi);    // 3,141500e+00
//         System.out.printf("%.2e\n", pi);  // 3,14e+00
//         System.out.printf("%.3e\n", pi);  // 3,141e+00
//     }
// }


// Функции и методы
// public class program {
//     static void sayHi() {
//         System.out.println("hi!");
//     }
//     static int sum(int a, int b) {
//         return a+b;
//     }  
//     static double factor(int n) {
//         if(n==1)return 1;
//         return n * factor(n-1);
//     }
//     public static void main(String[] args) {
//         sayHi(); // hi!
//         System.out.println(sum(1, 3)); // 4
//         System.out.println(factor(5)); // 120.0
//     }}
// обращение к методу sayHi в папке lib.java
// public class program{
//     public static void main(String[] args){
//         lib.sayHi();
//     }
// }

//Управляющие конструкции: 
//условный оператор
// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c;
//         if (a > b) {
//             c = a;
//         } else {
//             c = b;
//         }
//         System.out.println(c);
//     }
// }
 
// тернарный оператор


// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int min = a < b ? a : b;
//         System.out.println(min);
//     }
// }

// Оператор выбора
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         int mounth = value;
//         String text = "";
//         switch (mounth) {
//             case 1:
//                 text = "Autumn";
//                 break;
// 		...
//             default:
//                 text = "mistake";
//                 break;
//         }
//         System.out.println(text);
//         iScanner.close();
//     }
// }

// while цикл
// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;

//         while (value != 0) {
//             value /= 10;
//             count++;
//         }
//         System.out.println(count);
//     }
// }

// do while цикл
// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;

//         do {
//             value /= 10;
//             count++;
//         } while (value != 0);
//         System.out.println(count);
//     }
// }

// continue, break
// Операторы для управления циклами — continue и break.
// Выполнение следующей итерации цикла — continue.
// Прерывание текущей итерации цикла — break. 
// * ближайшего к оператору
//continue
// public class program {
//     public static void main(String[] args) {
//         for (int i = 0; i < 10; i++) {
//             if (i % 2 == 0)
//             continue;
//             System.out.println(i);
//         }
//     }
// }

//break
// public class program {
//     public static void main(String[] args) {
//         for (int i = 0; i < 10; i++) {
//             if (i % 2 != 0)
//             break;
//             System.out.println(i);
//         }
//     }
// }

// // цикл for
// public class program {
//     public static void main(String[] args) {

//         int s = 0;
//         for (int i = 1; i <= 10; i++) {
//             s += i;
//         }
//         System.out.println(s);
//     }
// }

// вложенные циклы (для рекурсии)
// public class program {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < 5; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         // * * * * *
//         // * * * * *
//         // * * * * *
//         // * * * * *
//         // * * * * *
//     }
// }

// for работает только для коллекции:
// public class program {
//     public static void main(String[] args) {

//         int arr[] = new int[10];
//         for (int item : arr) {
//             System.out.printf("%d ", item);
//         }
//         System.out.println();
//     }
// }
// for работает только для коллекции: перебор элементов массива
// public class program {
//     public static void main(String[] args) {
//         int[] arr = new int[] {1,2,3,4,5,77};
//         for (int item : arr){
//             System.out.print(item);
//         }
//     }
// }

// item когда используем, то получается, что не используем данные массива, а с внесенным значением, тут 10
// public class program {
//     public static void main(String[] args) {
//         int[] arr = new int[] {1,2,3,4,5,77};
//         for (int i=0; i<arr.length; i++) {
//             arr[i] = 10;

//         }
//         for(int item : arr){
//             System.out.println(item);
//         }
//     }
// }