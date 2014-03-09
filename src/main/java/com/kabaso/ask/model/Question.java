package com.kabaso.ask.model;

import java.util.List;

/**
 * Created by boniface on 2014/03/03.
 */
public final class Question {
    private String id;
    private String question;
    private List<Answer> answers;

    private Question(){

    }

    private Question(Builder builder) {
        id=builder.id;
        question= builder.question;
        answers=builder.answers;

    }

    public static class Builder{
        private String id;
        private List<Answer> answers;
        private String question;

        public Builder(String question) {
            this.question = question;
        }

        public Builder id(String value){
            id=value;
            return this;
        }

        public Builder answers(List<Answer> value){
            answers=value;
            return this;
        }

        public Builder question(Question value){
            id = value.getId();
            question = value.getQuestion();
            answers = value.getAnswers();
            return this;
        }

        public Question build(){
            return new Question(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Question question = (Question) o;

        if (!id.equals(question.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
