import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public void controlCondition() {
//        int aInt = 0;
//        float bFloat;
//        boolean aBool;
//        char aChar = 37;
//        long l;
//        byte b;
//
//        bFloat = (float) 1.1;
//
//        String name = "kevodanh2698";
//        PrintWriter printWriter = new PrintWriter(System.out, true);
//        System.out.println("Hello world %d" + (aInt <= bFloat));
//        System.out.println("args = " + aChar);
//        printWriter.println("aChar" + aChar);

        int a = 0;
        int b = ++a;

        if (a > b) { // Nhan vao 1 boolean
            System.out.println("a > b");
        } else if (a == b) {
            System.out.println("a = b");
        } else {
            System.out.println("a < b");
        }

        int dayInWeek = 2;

        switch (dayInWeek) {
            case 1:
                System.out.println("CN");
                break;
            case 2:
                System.out.println("DC");
                break;
            case 3:
                System.out.println("KOO");
                break;
            default:
                System.out.println("kuii");
                break;
        }

        // Chia 2 số nguyên kết quả sẽ ra số nguyên
        // Để ra kết quả đúng thì một trong 2 số phải là số thực -> float

        // Giai pt bac nhat mot an

        // Nhap vao hai so a, b
        int aInt, bInt;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        aInt = sc.nextInt();

        System.out.println("Nhập số b: ");
        bInt = sc.nextInt();

        System.out.println("a = " + aInt + ", b = " + bInt);

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô số nghiệm");
            }
        } else {
            float x = (-bInt) / (float)aInt;
            System.out.println("Phương trình có nghiệm là: " + x);
        }

        // Giải phương trình bậc hai

        // Năm nhuận
        System.out.println("Nhập vào số năm: ");
        int year = sc.nextInt();
        boolean isLeapYear = true;

        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                isLeapYear = false;
            }
        } else {
            isLeapYear = false;
        }

        if (isLeapYear) {
            System.out.println(year + " là năm nhuận");
        } else {
            System.out.println(year + " không phải là năm nhuận");
        }

        // Bài toán cân nặng

    }

    public static String readOneDigit(int number) {
        switch (number) {
            case 0:
                return "Không";
            case 1:
                return "Một";
            case 2:
                return "Hai";
            case 3:
                return "Ba";
            case 4:
                return "Bốn";
            case 5:
                return "Năm";
            case 6:
                return "Sáu";
            case 7:
                return "Bảy";
            case 8:
                return "Tám";
            case 9:
                return "Chín";
            default:
                return "Không";
        }
    }

    public static String readNumberLessThanTwenty(int number) {
        int lastNumber = number % 10;
        String result = "Mười";
        if (lastNumber > 0 && lastNumber < 10) {
            result += " " + Main.readOneDigit(lastNumber);
        }
        return result;
    }

    public static String readNumberLessThanHundred(int number) {
        int firstNumber = number / 10;
        int lastNumber = number % 10;

        String middleText = "mươi";
        String result = Main.readOneDigit(firstNumber) + " " + middleText;

        if (lastNumber != 0) {
            if (lastNumber == 1) {
                result += " mốt";
            } else if (lastNumber == 5) {
                result += " lăm";
            } else {
                result += " " + Main.readOneDigit(lastNumber).toLowerCase();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Nhập một số cần đọc: ");
        Scanner sc = new Scanner(System.in);
        int randomNumber = sc.nextInt();

        if (randomNumber >= 0 && randomNumber < 10) {
            System.out.println(Main.readOneDigit(randomNumber));
        } else if (randomNumber < 20) {
            System.out.println(Main.readNumberLessThanTwenty(randomNumber));
        } else if (randomNumber < 100) {
            System.out.println(Main.readNumberLessThanHundred(randomNumber));
        } else if (randomNumber < 1000) {
            int hundredDigit = randomNumber / 100;
            int remainDigit = randomNumber - hundredDigit * 100;
            String hundredText = Main.readOneDigit(hundredDigit) + " trăm";

            if (remainDigit > 0) {
                if (remainDigit < 10) {
                    hundredText += " lẻ " + Main.readOneDigit(remainDigit).toLowerCase();
                } else if (remainDigit < 20) {
                    hundredText += " " + Main.readNumberLessThanTwenty(remainDigit).toLowerCase();
                } else {
                    hundredText += " " + Main.readNumberLessThanHundred(remainDigit).toLowerCase();
                }
            }

            System.out.println(hundredText);
        } else {
            System.out.println("Out of ability");
        }
    }
}