import java.util.ArrayList;
import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        Task task = new Task();
        task.creatList();
        task.maxNumber();
        task.minNumber();
        task.meanNumber();

    }

}

class Task {
    ArrayList<Integer> numbers = new ArrayList<>();
    Random random = new Random();

    public void creatList() {
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(1000));
        }
        System.out.print(numbers);
        System.out.println();
    }

    public void maxNumber() {
        int max = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        System.out.print("Max=" + max + ",");
    }

    public void minNumber() {
        int min = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        System.out.print("Min=" + min + ",");
    }

    public void meanNumber() {
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }
        float mean = sum / numbers.size();
        System.out.print("Mean=" + mean);
    }

}