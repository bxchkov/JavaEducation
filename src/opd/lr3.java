package opd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class lr3 {
    private static BigDecimal WorkCode(String prompt) {
        var in = new Scanner(System.in);
        BigDecimal result;
        while (true) {
            System.out.println(prompt);
            result = in.nextBigDecimal();
            if (result.compareTo(BigDecimal.ZERO) < 1) {
                System.out.println("Введите положительное число");
                continue;
            }
            break;
        }
        return result;
    }

    public static void main(String[] args) {
        var scheduledTime = WorkCode("Введите плановый срок проекта (в месяцах):");
        var plannedBudget = WorkCode("Введите плановый бюджет проекта:");
        var currentBudget = WorkCode("Введите расход бюджета на момент проверки:");
        var progress = WorkCode("Введите прогресс выполнения проекта (в процентах):");
        var currentTime = WorkCode("Введите время проверки (относительно времени старта проекта, в месяцах):");
        var totalTime = currentTime.divide(progress.divide(BigDecimal.valueOf(100), 1, RoundingMode.HALF_UP), 1, RoundingMode.HALF_UP);
        var totalBudget = currentBudget.divide(currentTime, 1, RoundingMode.HALF_UP).multiply(totalTime);
        System.out.println("Ожидаемое время выполнения проекта: " + totalTime + " мес.");
        if (scheduledTime.compareTo(totalTime) > 0) {
            System.out.println("Проект будет готов раньше срока на " + scheduledTime.subtract(totalTime) + " у.е.");
        } else if (scheduledTime.compareTo(totalTime) < 0) {
            System.out.println("Сроки будут превышены на " + totalTime.subtract(scheduledTime) + " мес.");
        } else {
            System.out.println("Сроки проекта будут соблюдены");
        }
        System.out.println("Ожидаемый бюджет: " + totalBudget + " у.е.");
        if (plannedBudget.compareTo(totalBudget) > 0) {
            System.out.println("Бюджет будет сэкономлен на " + plannedBudget.subtract(totalBudget) + " у.е.");
        } else if (plannedBudget.compareTo(totalBudget) < 0) {
            System.out.println("Бюджет будет превышен на " + totalBudget.subtract(plannedBudget) + " у.е.");
        } else {
            System.out.println("Бюджет проекта будет соблюден");
        }
    }
}







