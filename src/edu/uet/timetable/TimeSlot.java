package edu.uet.timetable;

public class TimeSlot {
    public static String csvFile = "D:\\TimeSlots.csv";
    private int timeSlotID;
    private WeekDay weekDayID;
    private String timeSlotStart;
    private String timeSlotEnd;

    public int getTimeSlotID() {
        return timeSlotID;
    }

    public void setTimeSlotID(int timeSlotID) {
        this.timeSlotID = timeSlotID;
    }

    public WeekDay getWeekDayID() {
        return weekDayID;
    }

    public void setWeekDayID(WeekDay weekDayID) {
        this.weekDayID = weekDayID;
    }

    public String getTimeSlotStart() {
        return timeSlotStart;
    }

    public void setTimeSlotStart(String timeSlotStart) {
        this.timeSlotStart = timeSlotStart;
    }

    public String getTimeSlotEnd() {
        return timeSlotEnd;
    }

    public void setTimeSlotEnd(String timeSlotEnd) {
        this.timeSlotEnd = timeSlotEnd;
    }

    @Override
    public String toString() {
        return timeSlotID + "," + weekDayID.getWeekDayID() + "," + timeSlotStart + "," + timeSlotEnd;
    }

    public static TimeSlot fromString(String line) {
        String[] parts = line.split(",");
        TimeSlot timeSlot = new TimeSlot();
        timeSlot.setTimeSlotID(Integer.parseInt(parts[0]));
        // Assuming WeekDay is handled separately
        timeSlot.setTimeSlotStart(parts[2]);
        timeSlot.setTimeSlotEnd(parts[3]);
        return timeSlot;
    }
}