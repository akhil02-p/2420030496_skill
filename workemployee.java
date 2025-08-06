package MYPROJECT;

import java.time.*;

public class workemployee {
    public static void main(String[] args) {
  
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);
        LocalTime officeStart = LocalTime.of(9, 0);  
        LocalTime officeend = LocalTime.of(18, 0);
        LocalTime loginTime = LocalTime.of(9, 15);
        LocalTime logoutTime = LocalTime.of(17, 45);
        System.out.println("Login Time: " + loginTime);
        System.out.println("Logout Time: " + logoutTime);
        Duration workDuration = Duration.between(loginTime, logoutTime);
        long totalHours = workDuration.toHours();
        long totalMinutes = workDuration.toMinutesPart();
		if (!loginTime.isBefore(officeStart) && !loginTime.isAfter(officeend)) {
			System.out.println("employee has logged in during office");
		}else {
			System.out.println("employee has not logged in during office hours");
		}
        System.out.println("Total Working Hours: " + totalHours + " hours " + totalMinutes + " minutes");
    }
}
