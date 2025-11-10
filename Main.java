import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания (1-5): ");
        int num = scanner.nextInt();
        scanner.nextLine();

        switch (num) {
            case 1: {
                System.out.println("1.2 задание - Хранилище чисел и строк:  ");

                Storage<Integer> storage1 = new Storage<>(null);
                printValue(storage1, 0);

                Storage<Integer> storage2 = new Storage<>(99);
                printValue(storage2, -1);

                Storage<String> storage3 = new Storage<>(null);
                printValue(storage3, "default");

                Storage<String> storage4 = new Storage<>("hello");
                printValue(storage4, "hello world");
                break;
            }
            case 2: {
                System.out.println("1.5 задание - Создание линии в трёхмерном пространстве: ");

                double x1 = Check.checkingInput(scanner, "Введите x1: ");
                double y1 = Check.checkingInput(scanner, "Введите y1: ");
                double z1 = Check.checkingInput(scanner, "Введите z1: ");

                double x2 = Check.checkingInput(scanner, "Введите x2: ");
                double y2 = Check.checkingInput(scanner, "Введите y2: ");
                double z2 = Check.checkingInput(scanner, "Введите z2: ");

                Point3D p1 = new Point3D(x1, y1, z1);
                Point3D p2 = new Point3D(x2, y2, z2);

                Line<Point3D> line3D = new Line<>(p1, p2);
                System.out.println(line3D);
                break;
            }

            case 3: {
                System.out.println("2.1 задание - Сдвиг точки начала на 10 единиц по оси X: ");
                Point2D p1_2d = new Point2D(25, 9);
                Point2D p2_2d = new Point2D(77, 0);
                Line<Point2D> line2D = new Line<>(p1_2d, p2_2d);
                System.out.println("До сдвига: " + line2D);
                MoveLine.movePointStart(line2D);
                System.out.println("После сдвига: " + line2D);
                Point3D p1_3d = new Point3D(-16, 2, 5);
                Point3D p2_3d = new Point3D(4, 0, 2);
                Line<Point3D> line3D = new Line<>(p1_3d, p2_3d);
                System.out.println("До сдвига: " + line3D);
                MoveLine.movePointStart(line3D);
                System.out.println("После сдвига: " + line3D);
                break;
                }

            case 4: {
                System.out.println("3.1 задание - Функция. ");
                List<String> words = Arrays.asList("qwerty", "asdfg", "zx");
                List<Integer> lengths = Transformer.transform(words, String::length);
                System.out.println("Строки -> длины строк");
                System.out.println("Исходный список: " + words);
                System.out.println("Результат: " + lengths);
                List<Integer> numbers = Arrays.asList(1, -3, 7);
                List<Integer> absNumbers = Transformer.transform(numbers, Math::abs);
                System.out.println("Числа → модули");
                System.out.println("Исходный список: " + numbers);
                System.out.println("Результат: " + absNumbers);
                List<int[]> arrays = Arrays.asList(
                        new int[]{1, 5, 2},
                        new int[]{7, 3},
                        new int[]{-1, -9, -2}
                );
                List<Integer> maxValues = Transformer.transform(arrays,
                        arr -> Arrays.stream(arr).max().orElse(Integer.MIN_VALUE)
                );
                System.out.println("Массивы → максимумы");
                System.out.println("Исходные массивы:");
                for (int[] a : arrays)
                    System.out.println(Arrays.toString(a));
                System.out.println("Результат: " + maxValues);
                break;
            }
            case 5: {
                System.out.println("3.2 задание - Фильтр. ");
                List<String> words = Arrays.asList("qwerty", "asdfg", "zx");
                List<String> filteredWords = FilterUtils.filter(words, s -> s.length() >= 3);
                System.out.println("Строки длиной >= 3: " + filteredWords);
                List<Integer> numbers = Arrays.asList(1, -3, 7);
                List<Integer> filteredNumbers = FilterUtils.filter(numbers, n -> n <= 0);
                System.out.println("Отрицательные числа: " + filteredNumbers);
                List<int[]> arrays = Arrays.asList(
                        new int[]{1, -5, 2},
                        new int[]{-7, -3, -2},
                        new int[]{0, -1, -2}
                );
                List<int[]> filteredArrays = FilterUtils.filter(arrays,
                        arr -> Arrays.stream(arr).allMatch(n -> n <= 0)
                );
                System.out.println("Массивы без положительных чисел:");
                for (int[] a : filteredArrays) {
                    System.out.println(Arrays.toString(a));
                }
                break;
            }

        }
        scanner.close();
    }
    // Вспомогательный метод для печати значений
    public static <T> void printValue(Storage<T> storage, T alternative) {
        System.out.println(storage.getValueOrDefault(alternative));
    }
}
