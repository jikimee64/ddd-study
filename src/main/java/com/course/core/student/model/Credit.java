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

    public Credit(Integer credit, Integer newCredit) {
        validMaxCredit(credit, newCredit);
        this.credit = credit + newCredit;
    }

    private void validMaxCredit(Integer credit, Integer newCredit) {
        if (credit + newCredit > 21) {
            throw new IllegalArgumentException("max credit");
        }
    }

}
