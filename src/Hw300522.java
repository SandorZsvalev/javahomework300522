import java.util.Arrays;

public class Hw300522 {
    public static void main(String[] args) {

        int [][] array = { {1,2},{3,4},{-5,6,5,23,-43,65,-20} };

        if (checkTheRow(array,2)){
            System.out.println("Среднее арифметическое в заданном элементе массива больше нуля");
        } else {
            System.out.println("Среднее арифметическое в заданном элементе массива меньше или равно нулю");
        }

        System.out.println("----------------------------");

        System.out.println(Arrays.toString(convertTwoDimArr(array)));


    }

    /*
 Implement the method that takes int[][] array and row index and checks if the average
 of the elements in the row is greater than 0
 */

    public static boolean checkTheRow(int [][] array,int index){
        double sumRow = 0; // сумма элементов в ряде
        for (int i = 0; i < array[index].length; i++) { //проходим по всем элементам ряда
            sumRow = sumRow+array[index][i]; //сумма элементов в ряде увеличивается на каждый новый элемент
        }
        double average = sumRow/array[index].length; //среднее считаем как частное суммы элементов и их количества
        //используем double, так как int округляет до целого - все, что меньше единицы будет приравнено к нулю
        return average > 0; // если среднее больше нуля, то метод возвращает true
    }


    /*
 Implement the method that takes a two-dimensional array and return the single-dimensional
 array with all elements of the given array ({ {1,2},{3,4},{5,6} }) -> {1,2,3,4,5,6}
  */

    public static int [] convertTwoDimArr(int [][] array){
        int totalLength=0;
        for (int[] ints : array) {
            totalLength += ints.length; // сначала считаем циклом общее количество элементов в массиве (по каждому ряду)
        }
        int [] newArray = new int[totalLength]; // инициализируем полученной цифрой общий массив
        int indexNewArr=0; //задаем нулевой индекс для нового массива
        for (int[] ints : array) { //смотрим ряды
            for (int elemInt : ints) { //в рядах - элементы
                newArray[indexNewArr++] = elemInt; //записываем элементы в новый массив, плюсуем индекс
            }
        }

        return newArray;
    }


}
