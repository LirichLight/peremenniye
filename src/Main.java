import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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