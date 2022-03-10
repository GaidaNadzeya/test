package by.giftt.questions;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AnswerKeeper {
    List<List<String>> answers = new ArrayList<>();

    public void add(List<String> qqq) {
        answers.add(qqq);
    }

    public List<List<String>> getAnswers() {
        return answers;
    }

    @Override
    public String toString() {
        return "AnswerKeeper{" +
                "answers=" + answers +
                '}';
    }
}
