//- Метод printSum выбрасывает исключение FileNotFoundException, но в методе main это исключение не обрабатывается и не объявлено в секции throws.
//- Ошибка выполнения может возникнуть при присвоении значения 9 элементу массива abc с индексом 3, так как индексы массива начинаются с 0 и данного элемента не существует. Это приведет к возникновению исключения ArrayIndexOutOfBoundsException.

public static void main(String[] args) {
        try {
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        printSum(23, 234);
        int[] abc = { 1, 2 };
        abc[2] = 9;
        } catch (NullPointerException ex) {
        System.out.println("Указатель не может указывать на null!");
        } catch (ArrayIndexOutOfBoundsException ex) {
        System.out.println("Массив выходит за пределы своего размера!");
        } catch (Exception ex) {
        System.out.println("Что-то пошло не так...");
        }
        }
public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
        }
