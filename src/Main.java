public class Main {
    public static void main(String[] args) {

        //Задание 4 решить через:
        // .substring(2, 4);
        // .indexOf()
        // .lastIndexOf()

        String fullName = "ivanov ivan ivanovich";

        int t = fullName.indexOf(' ');
        int f = fullName.lastIndexOf(' ');
        int d = fullName.length();

        String lastName = fullName.substring(0, t);
        String firstName = fullName.substring(t + 1, f);
        String middleName = fullName.substring(f + 1, d);

        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Отчество сотрудника - " + middleName);
        System.out.println();

        //Задание 5
        char[] lastNameAfter = lastName.toCharArray();
        char b1 = Character.toUpperCase(lastNameAfter[0]);
        System.out.print(b1 + lastName.substring(1, t));
        System.out.print(" ");

        char[] firstNameAfter = firstName.toCharArray();
        char b2 = Character.toUpperCase(firstNameAfter[0]);
        System.out.print(b2 + fullName.substring(t + 2, f));
        System.out.print(" ");

        char[] middleNameAfter = firstName.toCharArray();
        char b3 = Character.toUpperCase(middleNameAfter[0]);
        System.out.print(b3 + fullName.substring(f + 2, d));


        System.out.println();

        //Задание 4 короткое решение через метод split
        System.out.println();

        String[] words = fullName.split(" ");

        System.out.println("Имя сотрудника - " + words[1]);
        System.out.println("Фамилия сотрудника - " + words[0]);
        System.out.println("Отчество сотрудника - " + words[2]);
    }
}

    /**
     * Задание 4
     * К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм, разбивающий одну строку с Ф. И. О. на три — на фамилию, имя и отчество.
     * В качестве исходных данных используйте:
     * Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
     * строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
     * переменная firstName — для хранения имени;
     * переменная middleName — для хранения отчества;
     * переменная lastName — для хранения фамилии.
     * Решите задание с помощью метода substring().
     * Результат программы выведите в формате:
     * “Имя сотрудника — …”
     * “Фамилия сотрудника — …”
     * “Отчество сотрудника — ...”
     * :лампочка: Важно: «в голове» высчитывать позиции пробелов и параметров для обрезания строки запрещено. Их должен вычислить компьютер.
     * :sos: Подсказка - Определить индексы символов помогут методы indexOf() и lastIndexOf().
     * Критерии оценки
     * – При изменении содержания строки результат программы выполняется.
     * – Программа решена с помощью метода substring().
     * – Результат программы выведен в консоль согласно условиям задачи.
     */


    /**
     * Задание 5
     * Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
     * Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф. И. О. в правильный формат.
     * В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“, которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
     * Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с заглавных букв — …”
     * :sos: Подсказка 1
     * Метод toCharArray() может быть полезен.
     * :sos: Подсказка 2
     * Для преобразования символа в верхний регистр следует использовать метод Character.toUpperCase(c), где c — символ.
     * Критерии оценки
     * – Применен метод, меняющий написание данных строки.
     * – При изменении содержания строки результат программы выполняется.
     * – Результат программы выведен в консоль согласно условиям задачи.
     */