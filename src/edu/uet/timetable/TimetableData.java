package edu.uet.timetable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TimetableData {
    private static final String FILE_PATH = "timetables.txt";

    public Timetable findOne(int id) {
        List<Timetable> timetables = findAll();
        for (Timetable timetable : timetables) {
            if (timetable.getTimetableID() == id) {
                return timetable;
            }
        }
        return null;
    }

    public List<Timetable> findAll() {
        List<Timetable> timetables = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                timetables.add(Timetable.fromString(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return timetables;
    }

    public List<Timetable> search(String keyword) {
        List<Timetable> timetables = findAll();
        List<Timetable> result = new ArrayList<>();
        for (Timetable timetable : timetables) {
            if (timetable.getDescription().contains(keyword)) {
                result.add(timetable);
            }
        }
        return result;
    }

    public void save(Timetable timetable) {
        List<Timetable> timetables = findAll();
        try (FileWriter fileWriter = new FileWriter(FILE_PATH, true)) {
            if (timetables.size() > 0) {
                timetable.setTimetableID(timetables.get(timetables.size() - 1).getTimetableID() + 1);
            } else {
                timetable.setTimetableID(1);
            }
            fileWriter.append(timetable.toString());
            fileWriter.append("\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}