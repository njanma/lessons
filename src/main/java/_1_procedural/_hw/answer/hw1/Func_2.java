package _1_procedural._hw.answer.hw1;

import java.util.Scanner;

//        Имеются два дома размерами a на b и c на d. Размеры вводятся польователем с консоли.
//        Проверить, помещаются ли эти дома на участке размерами e на f.
//        Стороны домов - параллельны сторонам участка, в остальном размещение может быть любым.
public class Func_2 {
    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("Введите размеры 1-го дома a, b");
        int[] home1 = {consoleScanner.nextInt(), consoleScanner.nextInt()};
        System.out.println("Введите размеры 2-го дома c, d");
        int[] home2 = {consoleScanner.nextInt(), consoleScanner.nextInt()};
        System.out.println("Введите размеры участка e, f");
        int[] sector = {consoleScanner.nextInt(), consoleScanner.nextInt()};
        System.out.println(isPossBuild(home1, home2, sector));
    }

    public static boolean isPossBuild(int[] home1, int[] home2, int[] sector) {
        return sectorNotFull(home1[0] + home2[0], home1[1] + home2[1], sector) ||
                sectorNotFull(home1[0] + home2[1], home1[1] + home2[0], sector);

    }

    public static boolean sectorNotFull(int lengtHouses, int heigthHouses, int[] sector) {
        return ((lengtHouses <= sector[0] && heigthHouses <= sector[1]) ||
                (lengtHouses <= sector[1] && heigthHouses <= sector[0]));
    }
}
