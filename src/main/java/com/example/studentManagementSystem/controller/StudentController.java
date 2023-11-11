package com.example.studentManagementSystem.controller;

import com.example.studentManagementSystem.model.Student;
import com.example.studentManagementSystem.service.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final IStudentService studentService;




    @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
        return new ResponseEntity<>(studentService.getStudents(), HttpStatus.FOUND);
    }
    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @PutMapping("/update/{id}")
    public Student updateStudent(@RequestBody Student student, @PathVariable Long id){
        return studentService.updateStudent(student, id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }
    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }






//    @GetMapping
//    public ResponseEntity<List<Student>> getStudents() {
//        List<Student> allStudents = studentService.getStudents();
//        return new ResponseEntity<>(allStudents, HttpStatus.OK);
//    }
//
//
//
//    @GetMapping("/student/{id}")
//        public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
//            Student student = studentService.getStudentById(id);
//            if (student != null) {
//                return new ResponseEntity<>(student, HttpStatus.OK);
//            } else {
//                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//            }
//        }
//
//    @PostMapping
//    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
//        Student newStudent = studentService.addStudent(student);
//        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/update/{id}")
//    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student) {
//        Student updatedstudent = studentService.updateStudent(student,id);
//        if (updatedstudent != null) {
//            return new ResponseEntity<>(updatedstudent, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public void deleteStudent(@PathVariable Long id) {
//        studentService.deleteStudent(id);
//    }




    // Endpoint to create a new entry
//    @PostMapping("/create")
//    public ResponseEntity<HelloWorldEntity> createHello(@RequestBody HelloWorldEntity helloWorldEntity) {
//        HelloWorldEntity createdHello = helloWorldService.createHello(helloWorldEntity);
//        return new ResponseEntity<>(createdHello, HttpStatus.CREATED);
//    }

//    // Endpoint to get all entries
//    @GetMapping("/all")
//    public ResponseEntity<List<HelloWorldEntity>> getAllHello() {
//        List<HelloWorldEntity> allHellos = helloWorldService.getAllHellos();
//        return new ResponseEntity<>(allHellos, HttpStatus.OK);
//    }

//    // Endpoint to get a specific entry by ID
//    @GetMapping("/{id}")
//    public ResponseEntity<HelloWorldEntity> getHelloById(@PathVariable Long id) {
//        HelloWorldEntity helloById = helloWorldService.getHelloById(id);
//        if (helloById != null) {
//            return new ResponseEntity<>(helloById, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }

    // Endpoint to update an existing entry
    /*@PutMapping("/update/{id}")
    public ResponseEntity<HelloWorldEntity> updateHello(
            @PathVariable Long id, @RequestBody HelloWorldEntity updatedHello) {
        HelloWorldEntity hello = helloWorldService.updateHello(id, updatedHello);
        if (hello != null) {
            return new ResponseEntity<>(hello, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }*/

    // Endpoint to delete an entry
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<Void> deleteHello(@PathVariable Long id) {
//        boolean deleted = helloWorldService.deleteHello(id);
//        if (deleted) {
//            return new ResponseEntity<>(HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
}
