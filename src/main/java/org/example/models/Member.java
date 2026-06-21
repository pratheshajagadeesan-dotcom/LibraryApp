package org.example.models;

/**
 * Represent a library member.
 */

public class Member {

    private Long memberId;
    private String name;

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
