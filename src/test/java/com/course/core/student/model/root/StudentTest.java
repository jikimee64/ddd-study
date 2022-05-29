package com.course.core.student.model.root;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class StudentTest {

    @Test
    void student_create() {
        Student student = new Student("부서", "소프", 4, 2);

        assertThatThrownBy(() -> {
            Student student2 = new Student("부서", "소프", 5, 2);
        }).isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining("grade must less than 5");

        assertThatThrownBy(() -> {
            Student student3 = new Student("부서", "소프", 4, 3);
        }).isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining("grade must less than 5");

    }

    @Test
    void student_max_credit() {
        Student student = new Student("부서", "소프", 4, 2);

        student.addCredit(5);
        student.addCredit(5);
        student.addCredit(5);
        student.addCredit(5);
        assertThatThrownBy(() -> {
            student.addCredit(5);
        }).isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining("max credit");
    }

}