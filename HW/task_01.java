import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
        Deque<Character> qs_01 = new LinkedList<>();
        Deque<Character> qs_02 = new LinkedList<>();
        qs_01 = getInput("первое");
        qs_02 = getInput("второе");
        System.out.println("Deque 1 -> " + qs_01);
        System.out.println("Deque 2 -> " + qs_02);
        Integer[] sum_mult = get_result(qs_01, qs_02);
        LinkedList<Character> ll_sum = getLL(sum_mult[0]);
        LinkedList<Character> ll_mult = getLL(sum_mult[1]);
        System.out.println("Произведение чисел -> " + ll_mult);
        System.out.println("Сумма чисел -> " + ll_sum);
    }

    public static Deque<Character> getInput(String mess) {
        System.out.print("Введите " + mess + " число и нажмите Enter: ");
        Scanner sc = new Scanner(System.in, "cp866");
        Deque<Character> qs = new LinkedList<>();
        String str = sc.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            qs.add(str.charAt(i));
        }
        return qs;
    }

    public static Integer[] get_result(Deque<Character> qs_01, Deque<Character> qs_02) {
        Integer intA = getInt(qs_01);
        Integer intB = getInt(qs_02);
        Integer[] arr_result = new Integer[] { intA + intB, intA * intB };
        return arr_result;
    }

    public static Integer getInt(Deque<Character> qs) {
        String string = "";
        while (!qs.isEmpty()) {
            string = string + qs.pollLast();
        }
        Integer numInteger = Integer.parseInt(string);
        return numInteger;
    }

    public static LinkedList<Character> getLL(Integer int_in) {
        String string = Integer.toString(int_in);
        LinkedList<Character> ll = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            ll.add(string.charAt(i));
        }
        return ll;
    }

}