package com.getting.good.student.configuration;

import com.getting.good.student.Student;
import com.getting.good.student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student iluha = new Student(1L, "Iluha", "iluha@gmail.com");
            Student angelina = new Student(2L, "Angelina", "angel@gmail.com");

            studentRepository.saveAll(List.of(iluha, angelina));
        };
    }
}
