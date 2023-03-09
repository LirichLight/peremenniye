import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*byte bytePer=1; // 1 байт. от -128 до 127

        short shortPer=2; // 2 байта. от -32768 до 327673

        int intPer=4; // 4 байта. от -2147483648 до 2147483647

        long longPer=8; // 8 байт. от -9223372036854775808 до 9223372036854775807

        float floatPer=4.0f; // 4 байта. от 1,4*10^45 до 3,4*10^38

        double doublePer=8.6; // 8 байт. от 4,9*10^324 до 1,8*10^308

        char charPer='2'; // Unicode ASCII, 2 байта.

        boolean booleanPer=true; // 1 байт.

        String stringPer="А Игорёк - мусор!"; // Пустой, не нуловый = 24 байта. Каждый уникальный символ в строке + 16 байт

        System.out.println(bytePer);

        System.out.print(shortPer);
        System.out.print(intPer);

        System.out.println("\nlongPer = "+longPer);

        System.out.println("\nПросто текст\n");

        System.out.println("intPer+longPer="+(longPer+intPer));
        System.out.println("intPer+longPer="+longPer+intPer);

        System.out.println("\nfloatPer="+floatPer);

        System.out.println("\ndoublePer="+(byte)doublePer);

        System.out.println(charPer);
        System.out.println("Нас было "+charPer+" человеков");

        charPer='A';

        System.out.println("\n"+charPer);
        System.out.println("Нас было "+charPer+" человеков");

        System.out.println("charPer="+(int)charPer);
        System.out.println("charPer+1="+(char)(121));

        System.out.println("int*double="+longPer*floatPer);

        System.out.println("\n12+3="+(12+3));
        System.out.println("12-3="+(12-3.0));
        System.out.println("12*3="+(12*3));
        System.out.println("13/3="+(13/3));
        System.out.println("13/3="+(13/3.0));

        intPer=13/3;
        System.out.println("\nintPer="+intPer);

        System.out.println("\n13%3="+(13%3.0));

        int firstNumber=77; boolean example=true;

        firstNumber+=3;
        System.out.println("\nfirstNumber="+firstNumber);

        firstNumber*=10;
        System.out.println("\nfirstNumber*=10 = "+firstNumber);

        System.out.println("\nfirstNumber+1 = "+(firstNumber+1));
        System.out.println("firstNumber = "+firstNumber);

        System.out.println("\n++firstNumber = "+(++firstNumber));
        System.out.println("firstNumber = "+firstNumber);

        System.out.println("\nfirstNumber++ = "+(firstNumber++));
        System.out.println("firstNumber = "+firstNumber);

        System.out.println("\n--firstNumber = "+(--firstNumber));
        System.out.println("firstNumber = "+firstNumber);

        System.out.println("\nfirstNumber-- = "+(firstNumber--));
        System.out.println("firstNumber = "+firstNumber+"\n\n");

        Scanner in = new Scanner(System.in);
        int inputInt = in.nextInt();
        System.out.println("Вы ввели число - "+inputInt);

        double inputDouble;

        inputDouble = in.nextDouble();
        System.out.println("Вы ввели число - "+inputDouble);*/

        //---------------------Задачи--------------------------------------

        Scanner imput = new Scanner(System.in);

        /*1) Объявить три переменные типа int и присвоить первой числовое значение,
        вторая переменная равна первой переменной увеличенной на 3, а третья переменная
        равна сумме первых двух.*/
        System.out.println("Первая задача");
        int firstVar = 7;
        int secondVar = firstVar + 3;
        int thirdVar = firstVar + secondVar;
        System.out.println("Первая переменная равна "+firstVar+
                            "\nВторая переменная равна "+secondVar+
                            "\nТретья переменная равна "+thirdVar+"\n");

        /*2)Создайте 4 переменные с разными типами данных и
        предложите пользователю ввести в них значения.
        После ввода, отобразите их на экране.*/
        System.out.println("Вторая задача");

        System.out.print("Введите переменную типа short ");
        short inShort = imput.nextShort();
        System.out.print("Введите переменную типа int ");
        int inInt = imput.nextInt();
        System.out.print("Введите переменную типа float ");
        float inFloat = imput.nextFloat();
        System.out.print("Введите переменную типа Boolean ");
        boolean inBoolean = imput.nextBoolean();

        System.out.println("Вы ввели:\n" +
                            "short = " + inShort + " int = " + inInt + " float = " + inFloat + " boolean = " + inBoolean + "\n");

        /*3)Вывести на экран текст одним методом*/
        System.out.println("Третья задача");
        System.out.println("Не те\n" +
                "бляди,\n" +
                "что хлеба\n" +
                "ради\n" +
                "спереди\n" +
                "и сзади\n" +
                "дают нам\n" +
                "ебти,\n" +
                "Бог их прости!\n" +
                "А те бляди -\n" +
                "лгущие,\n" +
                "деньги\n" +
                "сосущие,\n" +
                "еть\n" +
                "не дающие -\n" +
                "вот бляди\n" +
                "сущие,\n" +
                "мать их ети!\n" +
                "    (c) В. В. Маяковский\n");

        /*4)Пользователь должен ввести 2 числа.
        Вам надо показать на экран произведение этих чисел, сумму и разницу.
        Покажите так же среднее арифметическое этих введенных чисел.*/
        System.out.println("Четвертая задача\n" +
                            "Введите два числа (int)");
        int numOne = imput.nextInt();
        int numTwo = imput.nextInt();
        System.out.println("Произведение ваших чисел = " + (numOne * numTwo) +
                            "\nСумма ваших чисел = " + (numOne + numTwo) +
                            "\nРазница ваших чисел = " + (numOne - numTwo) +
                            "\nСреднеарифметическое ваших чисел = " + (((float)numOne + numTwo)/2) + "\n");

        /*5) Пользователь вводит номер английской заглавной буквы в ASCII.
        Вывести эту букву маленькую букву, оставив её заглавную версию в переменной.*/
        System.out.println("Пятая задача\n" +
                            "Введите номер заглавной буквы в ASCII (65-90)");//тут бы валидацию :-)
        short asciiNum = imput.nextShort();
        System.out.println("Ваша буква " + (char)asciiNum +
                            "\nЕй соответствует строчная " + ((char)(asciiNum + 32)) +
                            "\nПеременная не изменилась, в ней всё ещё код буквы " + (char)asciiNum + "\n");

        /*6)Пусть цена товара A обычно составляет 1000 руб, и товара B составляет 500 руб.
        Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.
        Выведите на экран переменную, которая стоимости суммы A+B со скидкой. Отдельно выведите на экран сумму скидки от этой покупки.*/
        System.out.println("Шестая задача");
        short aPrice = 1000;
        short bPrice = 500;
        float sumWithDis = (aPrice + bPrice)*0.9f;//Сам написал выводить переменную именно
        System.out.println("Сумма товаров с учетом скидки составит " + sumWithDis + " рублей." +
                            "\nСумма скидки составила " + (aPrice + bPrice - sumWithDis) + " рублей.\n");

        /*7)Объявите 10 переменных типа int со значениями 0,1, 2, 3, 4, 5, 6, 7, 8, 9.
        Объявите ещё одну переменную и сохраните в неё сумму этих переменных, деленную на 10.*/
        System.out.println("Седьмая задача");
        int zero = 0; int one = 1; int two = 2; int three = 3; int four = 4; int five = 5;
        int six = 6; int seven = 7; int eight = 8; int nine = 9;
        int sum = zero+one+two+three+four+five+six+seven+eight+nine;
        int finalVarInt = sum/10; //тут не указано, что нужен флоат, потому в обоих вариантах
        float finalVarFloat = sum/10f;
        System.out.println("Сумма переменных, делённая на 10 в int = " + finalVarInt +
                            "\nСумма переменных, делённая на 10 в Float = " + finalVarFloat);
    }
}




 /*
	1) Объявить три переменные типа int и присвоить первой числовое значение,
	вторая переменная равна первой переменной увеличенной на 3, а третья переменная
	равна сумме первых двух.

	2)Создайте 4 переменные с разными типами данных и
	предложите пользователю ввести в них значения.
	После ввода, отобразите их на экране.

	3)Вывести на экран текст в таком виде одним методом:

	Не те
	бляди,
	что хлеба
	ради
	спереди
	и сзади
	дают нам
	ебти,
	Бог их прости!
	А те бляди -
	лгущие,
	деньги
	сосущие,
	еть
	не дающие -
	вот бляди
	сущие,
	мать их ети!
			(c) В. В. Маяковский

	4)Пользователь должен ввести 2 числа.
	Вам надо показать на экран произведение этих чисел, сумму и разницу.
	Покажите так же среднее арифметическое этих введенных чисел.

	5)Пользователь вводит номер английской заглавной буквы в ASCII.
	Вывести эту букву маленькую букву, оставив её заглавную версию в переменной.

	6)Пусть цена товара A обычно составляет 1000 руб, и товара B составляет 500 руб.
	Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.
	Выведите на экран переменную, которая стоимости суммы A+B со скидкой. Отдельно выведите на экран сумму скидки от этой покупки.

	7)Объявите 10 переменных типа int со значениями 0,1, 2, 3, 4, 5, 6, 7, 8, 9.
	Объявите ещё одну переменную и сохраните в неё сумму этих переменных, деленную на 10.

*/