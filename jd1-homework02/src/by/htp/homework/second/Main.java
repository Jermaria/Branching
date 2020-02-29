package by.htp.homework.second;
import java.util.Scanner;


public class Main {
	
	public static void task01(int a, int b) {
		
		//  Составить программу сравнения двух чисел 1 и 2. 
		// Если 1 меньше 2 – вывести на экран цифру 7, 
		// в противном случае – цифру 8.
		
		if (a < b) {
			System.out.println(7);
		} else {
			System.out.println(8);
		}
	}
	
	public static void task02(int a, int b) {
		
		//  Составить программу сравнения двух чисел 1 и 2. 
		// Если 1 меньше 2 – вывести на экран слово «yes», 
		// в противном случае – слово «no»
		
		if (a < b) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
	
	public static void task03() {
		
		// Составить программу сравнения введенного числа а и цифры 3. 
		// Вывести на экран слово «yes», если число а меньше
		// 3; если больше, то вывести слово «no».
		
		System.out.println("Enter your number ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.close();
		
		if (a < 3) {
			System.out.println("yes");
		} else if (a > 3) {
			System.out.println("no");
		} else {
			System.out.println("a = 3");
		}
	}
	
	public static void task04(int a, int b) {
		
		// Составить программу: равны ли два числа а и b?
		
		if (a == b) {
			System.out.println("a = b");
		} else {
			System.out.println("a != b");
		}
	}
	
	public static void task05(int a, int b) {
		
		// Составить программу: определения наименьшего из двух чисел а и b.
		
		if (a < b) {
			System.out.println(a);
		} else if (b > a) {
			System.out.println(b);
		} else {
			System.out.println("a = b");
		}
	}
	
	public static void task06(int a, int b) {
		
		// Составить программу: определения наибольшего из двух чисел а и b
		
		if (a > b) {
			System.out.println(a);
		} else if (a < b) {
			System.out.println(b);
		} else {
			System.out.println("a = b");
		}
	}
	
	public static void task07(int a, int b, int c, int x) {

		// Составить программу нахождения модуля выражения 
		// a*x*x + b*x + c при заданных значениях a, b, c и х
	
		int result;
		
		result = a * x * x + b * x + c;
		
		if (result < 0) {
			result = -result;
		}
		
		System.out.println(result);
	}

	public static void task08(int a, int b) {
		
		// Составить программу нахождения наименьшего из квадратов двух чисел а и b
		
		int min;
		
		if (a * a < b * b) {
			min = a * a;
		} else {
			min = b * b;
		}
		
		System.out.println(min);
	}
	
	public static void task09() {
		
		// Составить программу, которая определит по трем введенным сторонам, 
		// является ли данный треугольник равносторонним
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first side ");
		int side1 = scan.nextInt();
		
		System.out.println("Enter the second side ");
		scan = new Scanner(System.in);
		int side2 = scan.nextInt();
		
		System.out.println("Enter the third side ");
		scan = new Scanner(System.in);
		int side3 = scan.nextInt();
		
		if ((side1 == side2) && (side2 == side3)) {
			System.out.println("equilateral");
		} else {
			System.out.println("not equilateral");
		}
	}
	
	public static void task10(double r1, double r2) {
		
		// Составить программу, которая определит площадь какого круга меньше.
		
		double s1;
		double s2;
		
		s1 = Math.PI * r1 * r1;
		s2 = Math.PI * r2 * r2;
		
		if(s1 < s2) {
			System.out.println("first");
		} else if (s2 < s1) {
			System.out.println("second");
		} else {
			System.out.println("equal");
		}
	}
	
	public static void task11(double h1, double h2, double a1, double a2) {
		
		// Составить программу, которая определит площадь какого треугольника больше
		
		double s1;
		double s2;
		
		s1 = 0.5 * a1 * h1;
		s2 = 0.5 * a2 * h2;
		
		if (s1 > s2) {
			System.out.println("s1");
		} else if (s2 > s1) {
			System.out.println("s2");
		} else {
			System.out.println("equal");
		}
	}
	
	public static void task12(double a, double b, double c) {
		
		// Даны три действительных числа. Возвести в квадрат те из них, 
		// значения которых неотрицательны, и в четвертую степень — отрицательные.
		
		if (a >= 0) {
			a = a * a;
		} else {
			a = Math.pow(a, 4);
		}
		
		System.out.println(a);
		
		if (b >= 0) {
			b = b * b;
		} else {
			b = Math.pow(b, 4);
		}
		
		System.out.println(b);
		
		if (c >= 0) {
			c = c * c;
		} else {
			c = Math.pow(c, 4);
		}
		
		System.out.println(c);
		
	}
	
	public static void task13(double x1, double x2, double y1, double y2) {
		
		// Даны две точки А(х1, у1) и В(х2, у2). 
		// Составить алгоритм, определяющий, которая из точек 
		// находится ближе к началу координат
		
		double distance1;
		double distance2;
		
		distance1 = Math.sqrt(x1 * x1 + y1 * y1);
		distance2 = Math.sqrt(x2 * x2 + y2 * y2);
		
		if (distance1 < distance2) {
			System.out.println("A is closer");
		} else if ( distance1 > distance2) {
			System.out.println("B is closer");
		} else {
			System.out.println("same distance");
		}
	}
	
	public static void task14(int a, int b) {
	
		// Даны два угла треугольника (в градусах). 
		// Определить, существует ли такой треугольник, 
		// и если да, то будет ли он прямоугольным
		
		if (a + b < 180) {
			System.out.println("exists");
			
			if (a == 90 || b == 90 || a + b == 90) {
				System.out.println("right triangle");
			} else {
				System.out.println("not right triangle");
			}
		} else {
			System.out.println("doesn't exist");
		}	
	}
	
	public static void task15(double a, double b) {
		
		// Даны действительные числа х и у, не равные друг другу. 
		// Меньшее из этих двух чисел заменить половиной их суммы, 
		// а большее — их удвоенным произведением.
		
		if (a < b) {
			a = (a + b) / 2;
			b = 2 * a * b;
		} else {
			a = 2 * a * b;
			b = (a + b) / 2;
		}
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}
	
	public static void task16(int x, int y) {
		
		// На плоскости ХОY задана своими координатами точка А. 
		// Указать, где она расположена (на какой оси или в каком координатном угле)
		
		if ((x > 0) && (y > 0)) {
			System.out.println("1 угол");
			
		} else if ((x < 0) && (y > 0)) {
			System.out.println("2 угол");
			
		} else if ((x < 0) && (y < 0)) {
			System.out.println("3 угол");
			
		} else if ((x > 0) && (y < 0)) {
			System.out.println("4 угол");
			
		} else if (x == 0 && y == 0) {
			System.out.println("начало координат");
			
		} else if (x == 0) {
			System.out.println("ось Ox");
			
		} else if (y == 0) {
			System.out.println("ось Oy");
		}	
	}
	
	public static void task17(int m, int n) {
		
		// Даны целые числа т, п. Если числа не равны, 
		// то заменить каждое из них одним и тем же числом, равным большему из исходных, 
		// а если равны, то заменить числа нулями.
		
		if (m != n) {
			if (m > n) {
				n = m;
			} else {
				m = n;
			}
		} else {
			m = 0;
			n = 0;
		}
		
		System.out.println("m = " + m);
		System.out.println("n = " + n);
		
	}
	
	public static void task18(int a, int b, int c) {
		
		// Подсчитать количество отрицательных среди чисел а, b, с
		
		int counter;
		counter = 0;
		
		if (a < 0) {
			counter = counter + 1;
		}
		
		if (b < 0) {
			counter = counter + 1;
		}
		
		if (c < 0) {
			counter = counter +1;
		}
		
		System.out.println(counter);
		
	}
	
	public static void task19(int a, int b, int c) {
		
		// Подсчитать количество положительных среди чисел а, b, с
		
		int counter;
		counter = 0;
		
		if (a > 0) {
			counter = counter + 1;
		}
		
		if (b > 0) {
			counter = counter + 1;
		}
		
		if (c > 0) {
			counter = counter +1;
		}
		
		System.out.println(counter);
	}
	
	public static void task20(int a, int b, int c, int k) {
		
		// Определить, делителем каких чисел а, b, с является число k
		
		if (a % k == 0) {
			System.out.println("k - делитель a");
		}
		
		if (b % k == 0) {
			System.out.println("k - делитель b");
		}
		
		if (c % k == 0) {
			System.out.println("k - делитель c");
		}
		
	}
	
	public static void task21() {
		
		// Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? 
		// Введи Д или М». Взависимости от ответа на экране должен появиться текст 
		// «Мне нравятся девочки!» или «Мне нравятся мальчики!»
		
		System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
		Scanner scan = new Scanner(System.in);
		char a = scan.next().charAt(0);
		scan.close();
		
		if (a == 'Д') {
			System.out.println("Мне нравятся девочки!");
		} else {
			System.out.println("Мне нравятся мальчики!");
		}
		
	}
	
	public static void task22(int x, int y) {
		
		// Перераспределить значения переменных х и у так, 
		// чтобы в х оказалось большее из этих значений, а в y - меньшее
		
		if (x < y) {
			int temp;
			temp = x;
			x = y;
			y = temp;
		}
		
		System.out.println(x);
	}
	
	public static void task23() {
		
		// Определить правильность даты, введенной с клавиатуры 
		// (число — от 1 до 31, месяц — от 1 до 12). 
		// Если введены некорректные данные, то сообщить об этом
		
		@SuppressWarnings("resource")
		
		Scanner scan = new Scanner(System.in);
		System.out.println("день месяца числом");
		
		while(!scan.hasNextInt()) {
			System.out.println("день месяца ЧИСЛОМ");
		}
		int day = scan.nextInt();
		scan.close();
		
		System.out.println("месяц числом");
		scan = new Scanner(System.in);
		
		while(!scan.hasNextInt()) {
			System.out.println("месяц ЧИСЛОМ");
		}
		int month = scan.nextInt();
		
		if ((day < 1) || (day > 31) || (month < 1) || (month > 12)
					|| (month == 2) && (day > 29)
					|| (month == 4) && (day > 30)
					|| (month == 6) && (day > 30)
					|| (month == 9) && (day > 30)
					|| (month == 11) && (day > 30)) {
				
			System.out.println("что-то пошло не так");
		}
	}
	
	public static void task24(int n) {
		
		// Составить программу, определяющую результат гадания на ромашке — 
		// «любит—не любит», взяв за исходное данное количество лепестков п
		
		if (n % 2 == 0) {
			System.out.println("не любит");
		} else {
			System.out.println("любит");
		}
	}
	
	public static void task25(int c) {
		
		// Написать программу — модель анализа пожарного датчика в помещении, 
		// которая выводит сообщение «Пожароопасная ситуация », 
		// если температура в комнате превысила 60° С
		
		if (c > 60) {
			System.out.println("Пожароопасная ситуация");
		}
	}
	
	public static void task26(int a, int b, int c) {
		
		// Написать программу нахождения суммы большего и меньшего из трех чисел
			
		int max, min;
		
		max = 0;
		min = 0;
		
		// пусть числа не повторяются
		
		if ((a > b) && (a > c)) {
			max = a;
		} else if ((b > a) && (b > c)) {
			max = b;
		} else if ((c > a) && (c > b)) {
			max = c;
		}
		
		if ((a < b) && (a < c)) {
			min = a;
		} else if ((b < a) && (b < c)) {
			min = b;
		} else if ((c < a) && (c < b)) {
			min = c;
		}
		
		int sum;
		
		sum = max + min;
		
		System.out.println(sum);
	}
	
	public static void task27(int a, int b, int c, int d) {
		
		// найти max{min(a, b), min(c, d)}
		
		int min1;
		int min2;
		int max;
		
		if (a < b) {
			min1 = a;
		} else {
			min1 = b;
		}
		
		if (c < d) {
			min2 = c;
		} else {
			min2 = d;
		}
		
		if (min1 > min2) {
			max = min1;
		} else {
			max = min2;
		}
		
		System.out.println(max);
	}
	
	public static void task28(int a, int b, int c, int d) {
		
		// Даны три числа a, b, с. Определить, какое из них равно d. 
		// Если ни одно не равно d, то найти max(d — a, d — b, d — c)
		
		if (a == d) {
			System.out.println("a = d");
		} else	if (b == d) {
			System.out.println("b = d");
		} else if (c == d) {
			System.out.println("c = d");
		} else {
			
			int max;
			max = 0;
			
			if ((d - a) > (d - b) && (d - a) > (d - c) ) {
				max = d - a;
			} else if ((d - b) > (d - a) && (d - b) > (d - c)) {
				max = d - b;
			} else if ((d - c) > (d - a) && (d - c) > (d - b)) {
				max = d - c;
			}
			
			System.out.println("max = " + max);
		}
	}
	
	public static void task29(double x1, double x2, double x3, double y1, double y2, double y3) {
	
		// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). 
		// Определить, будут ли они расположены на одной прямой.
		
		if ((y3 - y1) * (x2 - x1) == (y2 - y1) * (x3 - x1)) {
			System.out.println("на одной");
		} else {
			System.out.println("не на одной");
		}
		
		// 2-ой более очевидный способ y = kx + b
		
		double b, k;
		
		k = (y2 - y1) / (x2 - x1);
		b = y1 - k * x1;
		
		if (y3 == k * x3 + b) {
			System.out.println("на одной");
		} else {
			System.out.println("не на одной");
		}		
	}
	
	public static void task30(int a, int b, int c) {
		
		// Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, 
		// и заменить их абсолютными значениями, если это не так.
		
		if ( a > b && b > c) {
			a = 2 * a;
			b = 2 * b;
			c = 2 * c;
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void task31(int a, int b, int x, int y, int z) {
		
		// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
		// Определить, пройдет ли кирпич через отверстие
	
		if ((a >= x) && (b >= y) || (a >= y) && (b >= x)
				|| (a >= x) && (b >= z) || (a >= z) && (b >= x)
				|| (a >= y) && (b >= z) || (a >= z) && (b >= y)) {
				
			System.out.println("пройдёт");
		} else {
			System.out.println("не пройдёт");
		}
	}
	
	public static void task32(int a, int b, int c) {
		
		// Написать программу, которая по заданным трем числам определяет, 
		// является ли сумма каких-либо двух из них положительной
		
		int sum1, sum2, sum3;
		
		sum1 = a + b;
		sum2 = b + c;
		sum3 = a + c;
		
		if ((sum1 > 0) || (sum2 > 0) || (sum3 > 0)) {
			System.out.println("есть положительная сумма");
		} else {
			System.out.println("все суммы отрицательны");
		}
	}
	
	public static void task33() {
		
		// Написать программу, которая по паролю будет определять уровень 
		// доступа сотрудника к секретной информации в базе данных. 
		// Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа. 
		// Они имеют следующие пароли: 9583, 1747 — доступны модули баз А, В, С; 
		// 3331, 7922 — доступны модули баз В, С; 9455, 8997 — доступен модуль базы С
		 
		
		System.out.println("Enter your number ");
		Scanner scan = new Scanner(System.in);
		int password = scan.nextInt();
		scan.close();
		
		if ((password == 9853) || (password == 1747)) {
			System.out.println("А, В, С");
			
		} else if ((password == 3331) || (password == 7922)) {
			System.out.println("В, С");
			
		} else if ((password == 9455) || (password == 8997)) {
			System.out.println("C");
		}
	}
	
	
	public static void task34(double totalPrice, double sumPaid) {
			 
		// Составить программу, реализующую эпизод применения компьютера в книжном магазине. 
		// Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем; 
		// если сдачи не требуется, печатает на экране «спасибо»; 
		// если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; 
		// если	денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
		
		if (sumPaid == totalPrice) {
			System.out.println("Спасибо");
			
		} else if (sumPaid > totalPrice) {
			double change;
			
			change = sumPaid - totalPrice;
			
			System.out.println("возьмите сдачу " + change);
			
		} else {
			double missing;
			
			missing = totalPrice - sumPaid;
			
			System.out.println("денег дай! не хватает ещё " + missing);
		}
	}
	
	public static void task35(int dayNum) {
		
		// Вычислить число и месяц в невисокосном году по номеру дня
		
		boolean january = (dayNum <= 31);
		boolean february = (dayNum > 31) && (dayNum <= 59);
		boolean march = (dayNum > 59) && (dayNum <= 90);
		boolean april = (dayNum > 90) && (dayNum <= 120);
		boolean may = (dayNum > 120) && (dayNum <= 151);
		boolean june = (dayNum > 151) && (dayNum <= 181);
		boolean july = (dayNum > 181) && (dayNum <= 212);
		boolean august = (dayNum > 212) && (dayNum <= 243);
		boolean september = (dayNum > 243) && (dayNum <= 273);
		boolean october = (dayNum > 273) && (dayNum <= 304);
		boolean november = (dayNum > 304) && (dayNum <= 334);
		
		if (january) {
			System.out.println("January " + dayNum);
		} else if (february) {
			dayNum = dayNum - 31;
			System.out.println("February " + dayNum);
		} else if (march) {
			dayNum = dayNum - 59;
			System.out.println("March " + dayNum);
		} else if (april) {
			dayNum = dayNum - 90;
			System.out.println("April " + dayNum);
		} else if (may) {
			dayNum = dayNum - 120;
			System.out.println("May " + dayNum);
		} else if (june) {
			dayNum = dayNum - 151;
			System.out.println("June " + dayNum);
		} else if (july) {
			dayNum = dayNum - 181;
			System.out.println("July " + dayNum);
		} else if (august) {
			dayNum = dayNum - 212;
			System.out.println("August " + dayNum);
		} else if (september) {
			dayNum = dayNum - 243;
			System.out.println("September " + dayNum);
		} else if (october) {
			dayNum = dayNum - 273;
			System.out.println("October " + dayNum);
		} else if (november) {
			dayNum = dayNum - 304;
			System.out.println("November " + dayNum);
		} else {
			dayNum = dayNum - 334;
			System.out.println("December " + dayNum);
		}	
	}
	
	public static void task36(double x) {
		
		// Вычислить значение функции:
		
		double y;
		
		if (x <= 3) {
			y = x * x - x * x + 9;
		} else {
			y = 1 / (Math.pow(x, 3) - 6);
		}
		
		System.out.println(y);
	}
	
	public static void task37(double x) {
		
		// Вычислить значение функции:
		
		double y;
		
		if(x >= 3) {
			y = -x * x + 3 * x + 9;
		} else {
			y = 1 / (Math.pow(x, 3) + 6);
		}
		
		System.out.println(y);
	}
	
	public static void task38(double x) {
		
		// Вычислить значение функции:
		
		double y;
		
		if((x >= 0) && (x <= 3)) {
			y = x * x;
		} else {
			y = 4;
		}
		
		System.out.println(y);
	}
	
	public static void task39(double x) {
		
		// Вычислить значение функции:
		
		double y;
		
		if(x >= 8) {
			y = -x * x + x - 9;
		} else {
			y = 1 / (Math.pow(x, 4) - 6);
		}
		
		System.out.println(y);
	}
	
	public static void task40(double x) {
		
		// Вычислить значение функции:
		
		double y;
		
		if(x <= 13) {
			y = -Math.pow(x, 3) + 9;
		} else {
			y = -3 / (x + 1);
		}
		
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		
	}
	
}
