package edu.uet.timetable;

public class WeekDay {
    public static String csvFile = "D:\\WeekDays.csv";
    private int weekDayID;
    private String weekDayName;

    public int getWeekDayID() {
        return weekDayID;
    }

    public void setWeekDayID(int weekDayID) {
        this.weekDayID = weekDayID;
    }

    public String getWeekDayName() {
        return weekDayName;
    }

    public void setWeekDayName(String weekDayName) {
        this.weekDayName = weekDayName;
    }

    @Override
    public String toString() {
        return weekDayID + "," + weekDayName;
    }

    public static WeekDay fromString(String line) {
        String[] parts = line.split(",");
        WeekDay weekDay = new WeekDay();
        weekDay.setWeekDayID(Integer.parseInt(parts[0]));
        weekDay.setWeekDayName(parts[1]);
        return weekDay;
    }
}