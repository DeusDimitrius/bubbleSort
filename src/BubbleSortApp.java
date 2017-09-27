
public class BubbleSortApp {
    public static void main(String[] args) {

        int maxSize = 100;                  // размер массива
        ArrayBub arr;                       //ссылка на массив
        arr = new ArrayBub(maxSize);        // создание массива

        arr.insert(77);                     // Вставка десяти элементов массива
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);

        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();                      // Вывод элементов

        arr.bubbleSort();                   // Пузырьковая сортировка
        arr.display();                      // Повторный вывод
    }
}
