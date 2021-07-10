package ru.job4j.lambda;
    // продемонстрировать ссылку на статический метод
public class MyStringOps implements StringFunc {
    @Override
    public String func(String n) {
        return null;
    }

    /**
     * Определяется статический метод strReverse(String str)
     * изменяющий порядок символов следования в строке
     * @param str
     * @return
     */
    static String strReverse(String str) {
        String result = " ";
        int i;
        for (i = str.length() - 1; i > 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    static class MetodRefDemo {
        /**
         * В этом методе функциональный интерфейс указывается в качестве первого параметра.
         * Следовательно, ему может быть передан любой экземпляр данного интерфейса
         * включая и ссылку на метод
         * @param sf интерфейс
         * @param s параметры интейфейса
         * @return
         */
        static String stringOp(StringFunc sf, String s) {
            return sf.func(s);
        }

        public static void main(String[] args) {

            String inStr = "Лямбда выражения повышают эффективность Java";
            String outStr;
            //Здесь ссылка на метод strReverse(String str) передается методу stringOp()
            outStr = stringOp(MyStringOps::strReverse, inStr);
            System.out.println("Исходная строка: " + inStr);
            System.out.println("Обращенная строка: " + outStr);
        }
    }
}
