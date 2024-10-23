package parking;

import user.*;
import vehicle.*;
import pass.*;

import java.time.LocalTime;
import java.util.Arrays;

public class Main {
     static LocalTime[] localTimes = new LocalTime[5];
      static int index = 0;
    public static void main(String[] args) {
        User one = new Student("Ojas","8824427953");
        Vehicle vehicle = new Car("RJ14 CL 5623", one);
        Pass p = new Pass(vehicle,LocalTime.of(10,28,40));
        localTimes[index++] = p.getInTime();

        User two = new Student("Harshit","9024111847");
        Vehicle vehicle1 = new Car("RJ14 CL 8823", two);
        Pass p1 = new Pass(vehicle1,LocalTime.of(10,28,28));
        localTimes[index++] = p1.getInTime();

        User three = new Student("Varun","8209740603");
        Vehicle vehicle2 = new Car("RJ14 XA 6834", three);
        Pass p2 = new Pass(vehicle2,LocalTime.of(11,45,32));
        localTimes[index++] = p2.getInTime();

        User four = new Student("Vaibhav","8690702995");
        Vehicle vehicle3 = new Car("BR 01 PB 4885", four);
        Pass p3 = new Pass(vehicle3,LocalTime.of(11,45,12));
        localTimes[index++] = p3.getInTime();

        User five = new Student("Surendra","8949000411");
        Vehicle vehicle4 = new Car("RJ14 LX 6735", five);
        Pass p4 = new Pass(vehicle4,LocalTime.of(14,26,43));
        localTimes[index++] = p4.getInTime();
         printPattern(localTimes);
    }
    public static void printPattern(LocalTime[] localTimes){
        String star = "****************";
        Arrays.sort(localTimes);
        int max = 0;
        int min = Integer.MAX_VALUE;
        LocalTime maxTime = LocalTime.MIN;
        LocalTime minTime = LocalTime.MAX;
        for (int i = 0; i < localTimes.length ; i++) {
            int freq = 0;
            for (int j = 0; j < localTimes.length ; j++) {
                if(localTimes[i].toString().substring(0,5).equals(localTimes[j].toString().substring(0,5))){
                    freq++;
                }
            }
            i += freq - 1;
            if(freq > max){
                max = freq;
                maxTime = localTimes[i];
            }
            else if(freq < min){
                min = freq;
                minTime = localTimes[i];
            }
            System.out.println(localTimes[i] + " -> " + star.substring(0,freq));

        }
        System.out.println( "Minimum Rush Time " + maxTime);
        System.out.println( "Maximum Rush Time " + minTime);
    }

}