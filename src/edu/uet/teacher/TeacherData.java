package edu.uet.teacher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TeacherData {
    private static final String FILE_PATH = "teachers.txt";

    public Teacher findOne(int id) {
        List<Teacher> teachers = findAll();
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherID() == id) {
                return teacher;
            }
        }
        return null;
    }

    public List<Teacher> findAll() {
        List<Teacher> teachers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                teachers.add(Teacher.fromString(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return teachers;
    }

    public List<Teacher> search(String keyword) {
        List<Teacher> teachers = findAll();
        List<Teacher> result = new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (teacher.getFullName().contains(keyword)) {
                result.add(teacher);
            }
        }
        return result;
    }

    public void save(Teacher teacher) {
        List<Teacher> teachers = findAll();
        try (FileWriter fileWriter = new FileWriter(FILE_PATH, true)) {
            if (teachers.size() > 0) {
                teacher.setTeacherID(teachers.get(teachers.size() - 1).getTeacherID() + 1);
            } else {
                teacher.setTeacherID(1);
            }
            fileWriter.append(teacher.toString());
            fileWriter.append("\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}