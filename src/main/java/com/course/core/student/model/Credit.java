package com.course.core.student.model;

import javax.persistence.Embeddable;
import lombok.Getter;

@Getter
@Embeddable
public class Credit {

    private Integer credit; //학점

    public Credit() {
        this.credit = 0;
    }

    public void addCredit(Integer credit) {
        validMaxCredit(credit);
        this.credit += credit;
    }

    private void validMaxCredit(Integer credit) {
        if (this.credit + credit > 21) {
            throw new IllegalArgumentException("max credit");
        }
    }

}
