package com.springlearning.CourseApp;

import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface CourseRepository extends JpaRepository<Course, BigInteger> {

}
