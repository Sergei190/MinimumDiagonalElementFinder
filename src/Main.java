public class Main {
    public static void main(String[] args) {
        // Пример квадратного массива NxN
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {5, 7, 9, 2, 1},
                {0, 9, 1, 8, 7},
                {6, 3, 6, 6, 6},
                {99, 100, -2, 3, 1}
        };

        // Находим минимальный элемент на диагонали
        int minDiagonalElement = findMinDiagonalElement(matrix);

        // Выводим результат
        System.out.println("Минимальный элемент на диагонали без учёта элемента пересечения диагоналей: " + minDiagonalElement);
    }

    // Метод для нахождения минимального элемента на диагонали без учёта элемента пересечения диагоналей
    public static int findMinDiagonalElement(int[][] matrix) {
        int minElement = Integer.MAX_VALUE;
        int n = matrix.length;

        // Проходим по элементам левой диагонали (без учёта пересечения)
        for (int i = 0; i < n - 1; i++) {
            if (matrix[i][i] < minElement) {
                minElement = matrix[i][i];
            }
        }

        // Проходим по элементам правой диагонали (без учёта пересечения)
        for (int i = 0; i < n - 1; i++) {
            if (matrix[i][n - i - 1] < minElement) {
                minElement = matrix[i][n - i - 1];
            }
        }

        return minElement;
    }
}
