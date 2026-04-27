package main;

import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    private int bogieId;
    private String bogieType;
    private int capacity;

    public Bogie(int bogieId, String bogieType, int capacity) {
        this.bogieId = bogieId;
        this.bogieType = bogieType;
        this.capacity = capacity;
    }

    public int getBogieId() {
        return bogieId;
    }

    public String getBogieType() {
        return bogieType;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return bogieId + " " + bogieType + " " + capacity;
    }
}

public class UseCase13TrainConsistMgmt {

    public static List<Bogie> filterUsingLoop(List<Bogie> bogies) {
        List<Bogie> result = new ArrayList<>();

        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                result.add(b);
            }
        }
        return result;
    }

    public static List<Bogie> filterUsingStream(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
    }

    public static long measureLoopTime(List<Bogie> bogies) {
        long start = System.nanoTime();
        filterUsingLoop(bogies);
        long end = System.nanoTime();
        return end - start;
    }

    public static long measureStreamTime(List<Bogie> bogies) {
        long start = System.nanoTime();
        filterUsingStream(bogies);
        long end = System.nanoTime();
        return end - start;
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie(101, "Sleeper", 72));
        bogies.add(new Bogie(102, "AC Chair", 50));
        bogies.add(new Bogie(103, "First Class", 40));
        bogies.add(new Bogie(104, "Sleeper", 75));
        bogies.add(new Bogie(105, "AC Chair", 65));
        bogies.add(new Bogie(106, "Goods", 90));

        List<Bogie> loopResult = filterUsingLoop(bogies);
        List<Bogie> streamResult = filterUsingStream(bogies);

        long loopTime = measureLoopTime(bogies);
        long streamTime = measureStreamTime(bogies);

        System.out.println("Loop Based Result:");
        for (Bogie b : loopResult) {
            System.out.println(b);
        }
        System.out.println("Loop Time: " + loopTime + " ns");

        System.out.println();

        System.out.println("Stream Based Result:");
        for (Bogie b : streamResult) {
            System.out.println(b);
        }
        System.out.println("Stream Time: " + streamTime + " ns");
    }
}