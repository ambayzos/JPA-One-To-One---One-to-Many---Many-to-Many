package com.belajar.jpa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.belajar.jpa.entity.Comments;
import com.belajar.jpa.entity.Courses;
import com.belajar.jpa.entity.Instructor;
import com.belajar.jpa.entity.InstructorDetail;
import com.belajar.jpa.entity.Post;
import com.belajar.jpa.entity.Students;
import com.belajar.jpa.interfaces.CommentsRepository;
import com.belajar.jpa.interfaces.IntsructorRepository;
import com.belajar.jpa.interfaces.PostRepository;
import com.belajar.jpa.interfaces.StudentsRepository;

@SpringBootApplication
public class BelajarJpaApplication implements CommandLineRunner {
	
	@Autowired
	IntsructorRepository intsructorRepository;
	
	@Autowired
	PostRepository postRepository;
	
	@Autowired
	CommentsRepository commentsRepository;
	
	@Autowired
	StudentsRepository studentRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(BelajarJpaApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		InstructorDetail detail = new InstructorDetail(0,"berenang", "youtc");
		Instructor instructor = new Instructor(0,"mb@gmail,com", "ham", "bali", detail );
		
		InstructorDetail detaildua = new InstructorDetail(0,"sepak bola", "sepYout");
		Instructor instructordua = new Instructor(0,"am@gmail,com", "ahm", "ad", detaildua );
		
		InstructorDetail detailtiga = new InstructorDetail(0,"catur", "youTcatur");
		Instructor instructortiga = new Instructor(0,"i@gmail,com", "ahma", "d", detailtiga );
		
		List<Instructor> listInstructor = new ArrayList<Instructor>();
		listInstructor.add(instructor);
		listInstructor.add(instructordua);
		listInstructor.add(instructortiga);
		//add save data
		//this.intsructorRepository.saveAll(listInstructor);
		
		List<Instructor> listdata = this.intsructorRepository.findAll();
		
		for (Instructor instructorx : listdata) {
			System.out.println(instructorx.toString());
		}
		
		Comments comments = new Comments(0, "saya komen pertamam");
		Comments commentdua = new Comments(0, "Komen selanjutnya");
		
		List<Comments> listcomments = new ArrayList<>();
		listcomments.add(comments);
		listcomments.add(commentdua);
		
		Post post = new Post(0, "Ini adalah descriptions", "ini adalah title", listcomments);
		//add save data
		//postRepository.save(post);
		
		List<Students> lststudent= new ArrayList<Students>();
		List<Courses> lstcourse = new ArrayList<Courses>();
		
		Courses courseSatu = new Courses(0, "Bahasa Sunda", 2000.000, 7, "Sunda Course", lststudent);
		Courses courseDua = new Courses(0, "Bahasa Mandarin", 3000.000, 7 , "Mandarin Course", lststudent);
		Courses courseTiga = new Courses(0, "Bahasa Japan", 1000.000, 7, "Japan Course", lststudent);
		
		lstcourse.add(courseSatu);
		lstcourse.add(courseDua);
		lstcourse.add(courseTiga);
		
		Students student = new Students();
		student.setName("Ahmad");
		student.setAge(24);
		student.setGrade("C");
		student.setLstcourse(lstcourse);
		
		lststudent.add(student);
		
		//add save data
		//this.studentRepository.saveAll(lststudent);
		List<Students> listdata1 = (List<Students>) this.studentRepository.findAll();
		
		for (Students students : listdata1) {
			System.out.println(students.getName());
			for (Courses kurs : student.getLstcourse()) {
				System.out.println(kurs.getTitle() + kurs.getFee());
			}
		}
		
		
		
		
		
	}
	


}
