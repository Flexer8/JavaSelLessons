package com.company.generics;


import java.util.Collections;
import java.util.List;

/**
 * Класс, печатающий в консоль содержимое массива вне зависимости от того, что в нем хранится
 */
public class GenericArray<T> {

    private List<T> tList;

    public GenericArray(List<T> dataList){
        tList = dataList;
    }

    /**
     * Печать содержимого
     */
    public void printArray(){
        for (T item : tList) {
            System.out.println(item);
        }
    }

    /**
     * Получение максимального значения в списке
     * @return
     */
    public Number getMaxItem(){
        try{
            List<Number> numberList = (List<Number>)tList;

            return Collections.max(numberList, null);
        } catch (ClassCastException ex){
            System.out.println("Ошибка! Список не содержит Numbers");

            return -1;
        }
    }
}
