import java.util.Random;
import java.util.Scanner;

public class JavaLevel1 {
    public static void main(String[] args) {
        String[][] field = initField(3);
        printField(field);

        while (true) {
            humanTurn(field);
            if (isWin(field, "X")) {
                break;
            }
            if (isDraw(field)) {
                break;
            }

            aiTurn(field);
            if (isWin(field, "O")) {
                break;
            }
            if (isDraw(field)) {
                break;
            }
        }

        System.out.println("Игра закончена");
    }

    public static String[][] initField(int size) {
        String[][] field = new String[size][size];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = "*";
            }
        }
        return field;
    }

    public static void printField(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void humanTurn(String[][] field) {
        System.out.println("Укажите клетку по горизонтали и вертикали:");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            int size = field.length;

            if (x < size && y < size && x >= 0 && y >= 0) {
                if (field[x][y].equals("*")) {
                    field[x][y] = "X";
                    break;
                } else {
                    System.out.println("Вы сходили в занятую клетку, выберите другую клетку:");
                }
            } else {
                System.out.println("Вы сходили вне поля, выберите другую клетку:");
            }
        }

        printField(field);
    }

    public static void aiTurn(String[][] field) {
        Random random = new Random();

        while (true) {
            int x = random.nextInt(field.length);
            int y = random.nextInt(field.length);

            if (field[x][y].equals("*")) {
                field[x][y] = "O";
                break;
            }
        }

        System.out.println("Компьютер сделал ход:");
        printField(field);
    }

    public static boolean isDraw(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j].equals("*")) {
                    return false;
                }
            }
        }
        System.out.println("Ничья :-|");
        return true;
    }

    public static boolean isWin(String[][] field, String mark) {
        boolean win;

        // Verticals
        for (int j = 0; j < field[0].length; j++) {
            win = true;
            for (int i = 0; i < field.length; i++) {
                if (!field[i][j].equals(mark)) {
                    win = false;
                    break;
                }
            }
            if (win) {
                System.out.println("Победил игрок '" + mark + "'");
                return true;
            }
        }

        // Horizontals
        for (int i = 0; i < field.length; i++) {
            win = true;
            for (int j = 0; j < field[0].length; j++) {
                if (!field[i][j].equals(mark)) {
                    win = false;
                    break;
                }
            }
            if (win) {
                System.out.println("Победил игрок '" + mark + "'");
                return true;
            }
        }

        // Diagonals
        win = true;
        for (int i = 0; i < field.length; i++) {
            if (!field[i][i].equals(mark)) {
                win = false;
                break;
            }
        }
        if (win) {
            System.out.println("Победил игрок '" + mark + "'");
            return true;
        }


        win = true;
        for (int i = 0; i < field.length; i++) {
            if (!field[i][field[i].length - 1 - i].equals(mark)) {
                win = false;
                break;
            }
        }
        if (win) {
            System.out.println("Победил игрок '" + mark + "'");
            return true;
        }

        return false;
    }
}
