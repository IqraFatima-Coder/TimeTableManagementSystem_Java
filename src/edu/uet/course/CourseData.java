package edu.uet.course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.uet.course.Course;

public class CourseData {
	@SuppressWarnings("resource")
	public List<Course> findAll() {
		List<Course> courses =new  ArrayList<Course>();
		String line;
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(Course.csvFile));
			while((line=bufferedReader.readLine())!=null) {
				Course course = new Course();
				String[] courseRow=line.split(",");
				course.setCourseID(Integer.parseInt(courseRow[0]));
//				course.setCourseName(courseRow[1]);
//				course.setCourseFloor(Integer.parseInt(courseRow[2]));
//				course.setCourseCapacity(Integer.parseInt(courseRow[3]));
//				course.setCourseType(courseRow[4]);
				courses.add(course);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return courses;
	}
	@SuppressWarnings("resource")
	public Course findOne(int courseID) {
		String line;
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(Course.csvFile));
			while((line=bufferedReader.readLine())!=null) {
				Course course = new Course();
				String[] courseRow=line.split(",");
				if(Integer.parseInt(courseRow[0])==courseID) {
					course.setCourseID(Integer.parseInt(courseRow[0]));
//					course.setCourseName(courseRow[1]);
//					course.setCourseFloor(Integer.parseInt(courseRow[2]));
//					course.setCourseCapacity(Integer.parseInt(courseRow[3]));
//					course.setCourseType(courseRow[4]);
					return course;
				}	
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("resource")
	public List<Course>  search(String search) {
		List<Course> courses =new  ArrayList<Course>();
		String line;
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(Course.csvFile));
			while((line=bufferedReader.readLine())!=null) {
				Course course = new Course();
				String[] courseRow=line.split(",");
				if(courseRow[1].contains(search) == true) {
					course.setCourseID(Integer.parseInt(courseRow[0]));
//					course.setCourseName(courseRow[1]);
//					course.setCourseFloor(Integer.parseInt(courseRow[2]));
//					course.setCourseCapacity(Integer.parseInt(courseRow[3]));
//					course.setCourseType(courseRow[4]);
					courses.add(course);
				}	
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return courses;
	}

	@SuppressWarnings("resource")
	public Course save(Course course) {
		FileWriter fileWriter;
		List<Course> courses = this.findAll();
		
		try {
			fileWriter =new FileWriter(Course.csvFile);
			
			for (int i=0;i<courses.size();i++) {
				fileWriter.append(courses.get(i).toString());
				fileWriter.append("\n");
			}
			if(courses.size()>0) {
				course.setCourseID(courses.get(courses.size()-1).getCourseID()+1);
			}else {
				course.setCourseID(1);
			}
			fileWriter.append(course.toString());
			fileWriter.append("\n");
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return course;
	}
}
