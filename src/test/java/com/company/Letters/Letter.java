package com.company.Letters;

import java.util.Objects;

public class Letter {
    private String subject;
    private String body;

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public Letter(String subject, String body) {
        this.subject = subject;
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Letter letter = (Letter) o;
        return Objects.equals(subject, letter.subject) &&
                Objects.equals(body, letter.body);
    }

    @Override
    public int hashCode() {

        return Objects.hash(subject, body);
    }

    @Override
    public String toString() {
        return "Letter{" +
                "subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
