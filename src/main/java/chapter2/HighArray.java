package chapter2;

/**
 * Класс массива с высокоуровневым интерфейсом
 *
 * @author rassoll
 * @created 02.10.2017
 * @$Author$
 * @$Revision$
 */
class HighArray {
    private long[] a;
    private int nElements;

    HighArray(int nElements) {
        a = new long[nElements];
        this.nElements = 0;
    }

    /**
     * Поиск элемента searchKey в массиве
     *
     * @param searchKey значение для поиска
     * @return признак наличия элемента в массиве
     */
    public boolean find(long searchKey) {
        int i;
        for (i = 0; i < nElements; i++) {
            if (a[i] == searchKey) {
                break;
            }
        }

        return i != nElements;
    }

    /**
     * Вставка элемента в массив
     *
     * @param value вставляемый элемент
     */
    public void insert(long value) {
        a[nElements] = value;
        nElements++;
    }

    /**
     * Удаление элемента из массива
     *
     * @param value удаляемый элемент
     * @return признак успешности удаления
     */
    public boolean delete(long value) {
        int i;
        for (i = 0; i < nElements; i++) {
            if (value == a[i]) {
                break;
            }
        }

        if (i == nElements) {
            return false;
        } else {
            for (int k = i; k < nElements - 1; k++) {
                a[k] = a[k + 1];
            }
            nElements--;
            return true;
        }
    }

    /**
     * Программный проект 2.1 - Program project 2.1
     * <p>
     * Поиск максимального элемента в массиве
     *
     * @return масимальный элемент массива
     */
    long getMax() {
        long retValue = -1;

        if (a.length == 0) {
            return retValue;
        }

        for (int i = 0; i < nElements; i++) {
            if (a[i] > retValue) {
                retValue = a[i];
            }
        }

        return retValue;
    }

    /**
     * Полученение размера массиваъ
     *
     * @return количество элементов в массиве
     */
    int getSize() {
        return nElements;
    }

    /**
     * Вывод содержимого массива
     */
    void display() {
        for (int i = 0; i < nElements; i++) {
            System.out.print(String.format("%s ", a[i]));
        }
        System.out.println();
    }

    /**
     * Программный проект 2.6 - Program project 2.6
     * <p>
     * Удаление дубликатов из массива
     */
    void noDups() {
        boolean exist = false;
        long[] a = new long[this.nElements];
        int nElements = 0;
        for (int j = 0; j < this.nElements; j++) {
            for (int i = 0; i < this.nElements; i++) {
                if (a[i] == this.a[j]) {
                    exist = true;
                    break;
                }
            }

            if (!exist) {
                a[j] = this.a[j];
                nElements++;
                exist = false;
            }
        }

        this.a = a;
        this.nElements = nElements;
    }

    /**
     * Программный проект 2.6 - Program project 2.6
     * <p>
     * Удаление дубликатов из массива
     */
    void noDupsV2() {
        long[] noDuplicateArr = new long[this.nElements];
        int noDupArrLength = 0;
        for (int j = 0; j < this.nElements; j++) {
            int i = 0;
            while ((i < noDupArrLength) && (noDuplicateArr[i] != this.a[j])) {
                ++i;
            }

            if (i >= noDupArrLength) {
                noDuplicateArr[noDupArrLength] = this.a[j];
                noDupArrLength++;
            }
        }
        this.a = noDuplicateArr;
        this.nElements = noDupArrLength;
    }

    /**
     * Программный проект 2.3 - Program project 2.3
     * <p>
     * Сортировка массива
     */
    void sort() {
        int size = getSize();
        long[] sortedHighArray = new long[size];
        for (int i = size; i > 0; i--) {
            sortedHighArray[i - 1] = removeMax();
        }
        a = sortedHighArray;
        nElements = sortedHighArray.length;
    }

    /**
     * Дополнительный метод для тестирования
     * <p>
     * Получить содержимое массива
     *
     * @return содерждимое массива
     */
    String getValues() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < nElements; i++) {
            builder.append(a[i]);
            if (i != nElements - 1) {
                builder.append(", ");
            }
        }

        return builder.toString();
    }

    /**
     * Программный проект 2.2 - Program project 2.2
     * <p>
     * Удаление максимального элемента в массиве
     *
     * @return признак успешности удаления
     */
    private long removeMax() {
        long maxValue = getMax();
        delete(maxValue);

        return maxValue;
    }
}
