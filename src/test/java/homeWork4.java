package mnta.sck;

import java.util.ArrayList;
import java.util.List;

public class homeWork4 {
    public static void main(String[] args) {
        //public static void main(String[...] args) warar massive
        // примитивные переменные
        byte varByte = 127; //-128 ....... 127
        short varShort = 32767; // -32788 ....... 32767
        int varInt = 99999; // -2 в 31 степени ..... 2 в 31 степени -1 must have
        long varLong = 999999L; // -2 в 64 степени ...... до 2 в 64 степени -1
        // Floating point data
        float varFloat = 0.1f; //32bytes
        double varDouble = 1.99d; //64 bytes must have
        //операции с переменными
        System.out.println(varByte + varShort);
        System.out.println(varInt - varLong);
        System.out.println(varByte / varFloat);
        System.out.println(varByte % varShort);
        // переполнение
        System.out.println((byte) (varByte + 1));
        System.out.println((short) (varShort + varLong));
        //вычисления с int и double
        System.out.println("Usual price for this goods is " + (varInt + varDouble) + " " + "USD" + " " +
                "but ur special price for this goods is " + (varInt - varDouble) + " " + "USD");

        System.out.println("#######");

        int intTen = 10;
        float floatTwoHalf = 2.5F;

        System.out.println(intTen / floatTwoHalf);
        System.out.print(intTen % floatTwoHalf);


        /// массивы. Урок2
        // int [] array = new int [3];
        //int [] array0 = new int [] { 100, 150, -1}; /// - индексы 0, 1, 2
        //int [] array1 = new int [] { 100, 150, -1};
        // int[][] array2 = {array0, array1}; ///массив массива

        //for (int i = 0; i < array0.length; i++) {  /// почитать потом про i++
        //System.out.println(array0[i]);

        //int index = 0;
        //while (index < array0.length) {
        // System.out.println(array0[index]);
        // boolean done = false;
        // while (!false) {
        /// ищем что то
        //   if(нашли) .........
        //цикл while
    }
    /// перебор в обр сторону
    //for (int i = array0.length - 1; i >=; i--) {

    // }
    //}
    /// перебор в обр сторону
    //for (int i = array0.length - 1; i >= 0; i--) {

    //}
    //List<String> stringList = new ArrayList<>(); //как массив но не массив, пересмотреть
    //stringList.add
    // stringlist.addAll
    // stringlist.get
    // stringlist.sort
    // stringList.remove


}