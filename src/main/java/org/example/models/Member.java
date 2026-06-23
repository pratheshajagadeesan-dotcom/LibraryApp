package org.example.models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;
/**
 * Represent a library member.
 */
@Entity
public class Member {

    @Id
    private Long memberId;

    private String name;

    @OneToMany(mappedBy = "member")
    private List<Loan> loans = new ArrayList<>();

    protected Member() {
    }

    public Member(Long memberId, String name) {

        if (memberId == null) {
            throw new IllegalArgumentException(
                    "Member Id cannot be null");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                    "Name cannot be empty");
        }

        this.memberId = memberId;
        this.name = name;

    }

    public Long getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }
}
