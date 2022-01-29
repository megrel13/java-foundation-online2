package homework.string;

public class StringMain {
    public static void main(String[] args) {
        String name = "Пуся";
        String name1 = "Кусь";

        System.out.println("name.compareTo(name1) = " + name.compareTo(name1));  //лексиграфическое сравнение строк
        System.out.println("name.chars() = " + name.chars()); //поток чаров в виде int
        System.out.println("name.equals(name1) = " + name.equals(name1)); //проверяет идентична ли строка указанному объекту
        System.out.println("name.length() = " + name.length()); //возвращает длину данной поседовательности символов
        System.out.println("name.charAt(2) = " + name.charAt(2)); //возвращает char значение элемента с указанным индексом
        System.out.println("name.compareToIgnoreCase(name1) = " + name.compareToIgnoreCase(name1)); //лексиграфическое
        //сравнение строк без учета регистра символов
        System.out.println("name.concat(name1) = " + name.concat(name1)); // складывает строки +
        System.out.println("name.contains(\"у\") = " + name.contains("у")); //проверяет наличии данного чара в строке
        System.out.println("name.hashCode() = " + name.hashCode()); //хешкод строки(объекта)
        System.out.println("name.split(name, 2) = " + name.split(name1, 2));// делит строку в указаном месте


        StringBuilder stringBuilder = new StringBuilder("Кукишь");
        System.out.println("stringBuilder.append(2) = " + stringBuilder.append(2)); //добавляет к строке нужны инт, может добавить все и строку и объект
        System.out.println("stringBuilder.deleteCharAt(4) = " + stringBuilder.deleteCharAt(4)); //удаление чара в строке на нужно индексе
        System.out.println("stringBuilder.insert(3, \"п\") = " + stringBuilder.insert(3, "п")); //добавление чара в нужном индексе
        System.out.println("stringBuilder.reverse(name) = " + stringBuilder.reverse());// полностью меняет чары в обратную сторону
    }
}