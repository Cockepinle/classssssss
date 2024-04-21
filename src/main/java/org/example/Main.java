package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Main main = new Main();

    public static void main(String[] args) {
        boolean continueProgram = true;

        while (continueProgram) {
            Run();
            Animal();
            Person();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Хотите продолжить? (да/нет)");
            String continueChoice = scanner.nextLine();

            if (!continueChoice.equalsIgnoreCase("да")) {
                System.out.println("Возвращаемся в главное меню.");
                continueProgram = false;
            }
        }
    }

    static void Run() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Добро пожаловать!");
            System.out.println("На чем вы хотите добраться до замка?");
            System.out.println("1. Лошадь 2. Карета 3. По волшебству");

            int choice = 0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    choice = scanner.nextInt();
                    if (choice >= 1 && choice <= 3) {
                        validInput = true; // Правильный выбор
                    } else {
                        System.out.println("Выберите число от 1 до 3. Попробуйте снова.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка ввода. Попробуйте снова.");
                    scanner.next(); // Очистить неверный ввод
                }
            }

            switch (choice) {
                case 1:
                    System.out.println("Вы выбрали лошадь, ваш путь будет сложным");
                    break;
                case 2:
                    System.out.println("Вы выбрали карету, ваш путь будет легче");
                    break;
                case 3:
                    System.out.println("Вы выбрали по волшебству, ваш путь будет волшебным");
                    break;
                default:
                    System.out.println("Некорректный выбор.");
            }

            Animal();
        }
    }
    static void Animal() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Вы добрались до замка и теперь вы можете воспроизвести этот замок");
            System.out.println("Добавите питомца в замор для охраны:");
            System.out.println("1. Кот 2. Бык 3. Лев 4. Собака");
            int choice = 0;
            boolean validInput = false;

            System.out.println("Введите число от 1 до 4:");
            while (!validInput) {
                try {
                    choice = scanner.nextInt();
                    if (choice >= 1 && choice <= 4) {
                        validInput = true; // Правильный выбор
                    } else {
                        System.out.println("Выберите число от 1 до 4. Попробуйте снова.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка ввода. Попробуйте снова.");
                    scanner.next(); // Очистить неверный ввод
                }
            }
            switch (choice) {
                case 1:
                    System.out.println("Вы выбрали для охраны кота");
                    break;
                case 2:
                    System.out.println("Вы выбрали для охраны быка");
                    break;
                case 3:
                    System.out.println("Вы выбрали для охраны льва");
                    break;
                case 4:
                    System.out.println("Вы выбрали для охраны собаку");
                    break;
                default:
                    System.out.println("Некорректный выбор.");
            }
            Person();
            scanner.close();
        }
    }

    static void Person() {
        boolean correctChoice = false;
        while (!correctChoice) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("После выбора охраны теперь предлагаю выбрать за кого играть");
                System.out.println("Выберите:");
                System.out.println("1. Принцесса 2. Слуга");
                int choice = -1;
                boolean validInput = false;

                while (!validInput) {
                    try {
                        choice = scanner.nextInt();
                        if (choice >= 1 && choice <= 2) {
                            validInput = true; // Правильный выбор
                        } else {
                            System.out.println("Выберите число от 1 до 2. Попробуйте снова.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Ошибка ввода. Попробуйте снова.");
                        scanner.next(); // Очистить неверный ввод
                    }
                }
                switch (choice) {
                    case 1:
                        System.out.println("Вы выбрали для игры принцессу");
                        main.chooseDress();
                        correctChoice = true;
                        break;
                    case 2:
                        System.out.println("Вы выбрали для игры слугу");
                        String chosenFlower = main.chooseFlower();
                        System.out.println("Вы выбрали цветок: " + chosenFlower);
                        correctChoice = true;
                        break;
                    default:
                        System.out.println("Некорректный выбор.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода. Попробуйте снова.");
            }
        }
    }

    public String chooseFlower() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите вид цветов, который вы хотите посадить:");
        System.out.println("1. Роза 2. Тюльпан 3. Гвоздика");
        int flowerChoice = -1;
        boolean validInput = false;
        System.out.println("Введите число от 1 до 3:");
        while (!validInput) {
            try {
                flowerChoice = scanner.nextInt();
                if (flowerChoice >= 1 && flowerChoice <= 3) {
                    validInput = true; // Правильный выбор
                } else {
                    System.out.println("Выберите число от 1 до 3. Попробуйте снова.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода. Попробуйте снова.");
                scanner.next(); // Очистить неверный ввод
            }
        }
        String flower = "";
        switch (flowerChoice) {
            case 1:
                flower = "Роза";
                System.out.println("Вы посадили розы, принцесса в восторге");
                break;
            case 2:
                flower = "Тюльпан";
                System.out.println("Вы посадили тюльпаны, но принцесса их не любит");
                break;
            case 3:
                flower = "Гвоздика";
                System.out.println("Вы посадили гвоздику, принцесса в ярости!!! у нее на них аллергия, вы будете уволены и казнены");
                System.out.println("0. Закончить выбор");
                break;
            default:
                System.out.println("Некорректный выбор.");
        }
        Main.main(new String[]{});
        scanner.close();
        return flower;
    }

    public void chooseDress() {
        Scanner scanner = new Scanner(System.in);
        int dressChoice;
        int totalDresses = 0;

        do {
            System.out.println("Выберите платье:");
            System.out.println("0. Закончить выбор");
            System.out.println("1. Красное платье");
            System.out.println("2. Синее платье");
            System.out.println("3. Зеленое платье");

            dressChoice = -1;
            boolean validInput = false;

            while (!validInput) {
                try {
                    dressChoice = scanner.nextInt();
                    if (dressChoice >= 0 && dressChoice <= 3) {
                        validInput = true; // Правильный выбор
                    } else {
                        System.out.println("Выберите число от 0 до 3. Попробуйте снова.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка ввода. Попробуйте снова.");
                    scanner.next(); // Очистить неверный ввод
                }
            }
            switch (dressChoice) {
                case 1:
                    System.out.println("Вы выбрали красное платье.");
                    totalDresses++;
                    break;
                case 2:
                    System.out.println("Вы выбрали синее платье.");
                    totalDresses++;
                    break;
                case 3:
                    System.out.println("Вы выбрали зеленое платье.");
                    totalDresses++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Некорректный выбор.");
            }
        } while (dressChoice != 0);

        System.out.println("Общее количество выбранных платьев: " + totalDresses);
        Main.main(new String[]{});
        scanner.close();
    }

    public void chooseDressAdd() {
        Scanner scanner = new Scanner(System.in);
        int dressChoice;
        int totalDresses = 0;

        do {
            System.out.println("Выберите платье:");
            System.out.println("0. Закончить выбор");
            System.out.println("1. Красное платье");
            System.out.println("2. Синее платье");
            System.out.println("3. Зеленое платье");
            System.out.println("4. Розовое платье");
            System.out.println("5. Белое платье");
            System.out.println("6. Золотое платье");
            dressChoice = -1;
            boolean validInput = false;
            System.out.println("Введите число от 0 до 6:");
            while (!validInput) {
                try {
                    dressChoice = scanner.nextInt();
                    if (dressChoice >= 0 && dressChoice <= 6) {
                        validInput = true; // Правильный выбор
                    } else {
                        System.out.println("Выберите число от 0 до 6. Попробуйте снова.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка ввода. Попробуйте снова.");
                    scanner.next(); // Очистить неверный ввод
                }
            }
            switch (dressChoice) {
                case 1:
                    System.out.println("Вы выбрали красное платье.");
                    totalDresses++;
                    break;
                case 2:
                    System.out.println("Вы выбрали синее платье.");
                    totalDresses++;
                    break;
                case 3:
                    System.out.println("Вы выбрали зеленое платье.");
                    totalDresses++;
                    break;
                case 4:
                    System.out.println("Вы выбрали розовое платье.");
                    totalDresses++;
                    break;
                case 5:
                    System.out.println("Вы выбрали белое платье.");
                    totalDresses++;
                    break;
                case 6:
                    System.out.println("Вы выбрали золотое платье.");
                    totalDresses++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Некорректный выбор.");
            }
        } while (dressChoice != 0);

        System.out.println("Общее количество выбранных платьев: " + totalDresses);
        Main.main(new String[]{});
        scanner.close();
    }

    public String chooseFlowerAdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите вид цветов, который вы хотите посадить:");
        System.out.println("1. Роза 2. Тюльпан 3. Гвоздика 4.Мимоза 5.Ничего не посадить 0.Закончить выбор");
        int flowerChoice = -1;
        String flower = "";
        boolean validInput = false;
        System.out.println("Введите число от 0 до 5:");
        while (!validInput) {
            try {
                flowerChoice = scanner.nextInt();
                if (flowerChoice >= 0 && flowerChoice <= 5) {
                    validInput = true; // Правильный выбор
                } else {
                    System.out.println("Выберите число от 0 до 5. Попробуйте снова.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода. Попробуйте снова.");
                scanner.next(); // Очистить неверный ввод
            }
        }
        switch (flowerChoice) {
            case 1:
                flower = "Роза";
                System.out.println("Вы посадили розы, принцесса в восторге");
                break;
            case 2:
                flower = "Тюльпан";
                System.out.println("Вы посадили тюльпаны, но принцесса их не любит");
                break;
            case 3:
                flower = "Гвоздика";
                System.out.println("Вы посадили гвоздику, принцесса в ярости!!! у нее на них аллергия, вы будете уволены и казнены");
                System.out.println("0. Закончить выбор");
                break;
            case 4:
                flower = "Мимоза";
                System.out.println("Вы посадили мимозу, принцессе все равно на этот цветок");
                System.out.println("0. Закончить выбор");
                break;
            case 5:
                flower = "Ничего не посадить";
            case 0:
                System.out.println("Вы ничего не посадили, принцесса ничего не заметила");
                break;
            default:
                System.out.println("Некорректный выбор.");
        }
        scanner.close();
        return flower;
    }
    public void addAccessoriesToDresses() {
        int totalAccessories = 0;
        int totalDresses = 0;

        Scanner scanner = new Scanner(System.in);
        int dressChoice;

        do {
            System.out.println("Выберите платье:");
            System.out.println("0. Закончить выбор");
            System.out.println("1. Красное платье");
            System.out.println("2. Синее платье");
            System.out.println("3. Зеленое платье");
            System.out.println("4. Розовое платье");
            System.out.println("5. Белое платье");
            System.out.println("6. Золотое платье");

            dressChoice = -1;
            boolean validInput = false;
            System.out.println("Введите число от 1 до 6:");
            while (!validInput) {
                try {
                    dressChoice = scanner.nextInt();
                    if (dressChoice >= 1 && dressChoice <= 6) {
                        validInput = true; // Правильный выбор
                    } else {
                        System.out.println("Выберите число от 0 до 6. Попробуйте снова.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка ввода. Попробуйте снова.");
                    scanner.next(); // Очистить неверный ввод
                }
            }
            switch (dressChoice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("Выберите украшение:");
                    System.out.println("1. Колье");
                    System.out.println("2. Браслет");
                    System.out.println("3. Серьги");

                    int accessoryChoice = scanner.nextInt();

                    if (accessoryChoice >= 0 && accessoryChoice <= 3) {
                        totalAccessories++;
                        System.out.println("Украшение добавлено к платью.");
                    } else {
                        System.out.println("Некорректный выбор украшения.");
                    }

                    totalDresses++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Некорректный выбор платья.");
            }
        } while (dressChoice != 0);

        System.out.println("Общее количество выбранных платьев: " + totalDresses);
        System.out.println("Общее количество украшений: " + totalAccessories);

        scanner.close();
    }
    public void Flower(String flower) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите способ ухода за цветком " + flower + ":");
        System.out.println("1. Полить цветок");
        System.out.println("2. Облить цветок солнечным светом");
        System.out.println("3. Дать цветку отдохнуть");

        int careChoice = -1;
        boolean validInput = false;
        System.out.println("Введите число от 1 до 3:");
        while (!validInput) {
            try {
                careChoice = scanner.nextInt();
                if (careChoice >= 1 && careChoice <= 3) {
                    validInput = true; // Правильный выбор
                } else {
                    System.out.println("Выберите число от 1 до 3. Попробуйте снова.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода. Попробуйте снова.");
                scanner.next(); // Очистить неверный ввод
            }
        }
        switch (careChoice) {
            case 1:
                System.out.println("Вы полили цветок " + flower + ". Он рад влаге!");
                break;
            case 2:
                System.out.println("Вы облели цветок " + flower + " солнечным светом. Он вырос и радуется!");
                break;
            case 3:
                System.out.println("Вы дали цветку " + flower + " отдохнуть. Он благодарен за покой!");
                break;
            default:
                System.out.println("Некорректный выбор.");
        }

        scanner.close();
    }
}