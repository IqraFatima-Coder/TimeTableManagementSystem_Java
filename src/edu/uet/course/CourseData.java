package edu.uet.course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CourseData {
    private static final String FILE_PATH = "courses.txt";

    public Course findOne(int id) {
        List<Course> courses = findAll();
        for (Course course : courses) {
            if (course.getCourseID() == id) {
                return course;
            }
        }
        return null;
    }

    public List<Course> findAll() {
        List<Course> courses = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                courses.add(Course.fromString(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return courses;
    }

    public List<Course> search(String keyword) {
        List<Course> courses = findAll();
        List<Course> result = new ArrayList<>();
        for (Course course : courses) {
            if (course.getCourseTitle().contains(keyword)) {
                result.add(course);
            }
        }
        return result;
    }

    public void save(Course course) {
        List<Course> courses = findAll();
        try (FileWriter fileWriter = new FileWriter(FILE_PATH, true)) {
            if (courses.size() > 0) {
                course.setCourseID(courses.get(courses.size() - 1).getCourseID() + 1);
            } else {
                course.setCourseID(1);
            }
            fileWriter.append(course.toString());
            fileWriter.append("\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}