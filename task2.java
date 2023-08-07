//Код может вызвать исключение ArithmeticException, если переменная d равна 0. Чтобы избежать этой ошибки, необходимо изменить значение переменной d на отличное от нуля.

        int d = 1;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
        }
