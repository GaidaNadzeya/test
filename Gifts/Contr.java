package by.giftt;

import by.giftt.questions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Controller
public class Contr {

    @Autowired
    QuestionRepo questionRepo;
    @Autowired
    AnswerKeeper answerKeeper;
    @Autowired
    GiftRepo giftRepo;

    int i=0;
    @GetMapping("/")
    public String hi(Model model) {
        i=0;

        return "page";
    }

  //  @GetMapping("/pagetwo")
    public String pagetwo(Model model) {
        List<Question> questions = new ArrayList<Question>((Collection<? extends Question>) questionRepo.findAll());
       // System.out.println(questions.get(i).getOpt());
        model.addAttribute("que", questions.get(i++));
        return "pagetwo";
    }

//(value = "checkvar",required = false)
    @GetMapping("/pagetwo")
    public String check(Model model, @RequestParam(required = false) List<String> checkvar) {

       /* if (checkvar !=null){
        answerKeeper.add(checkvar);}
        System.out.println(answerKeeper);

        */
        List<Question> questions = new ArrayList<Question>((Collection<? extends Question>) questionRepo.findAll());
        if(i<questions.size()) {
            model.addAttribute("que", questions.get(i++));
            if (checkvar !=null){
                answerKeeper.add(checkvar);}
            System.out.println(answerKeeper);
            return "pagetwo";
        }
        return "pagethree";
    }

@GetMapping("/pagefour")
    public String pagefour(Model model) {
        List<Gift> gifts = new ArrayList<Gift>((Collection<? extends Gift>) giftRepo.findAll());
        List <Gift> ansGifts = new ArrayList<>();
        for (Gift gift : gifts) {
        List<String> tagsList = Arrays.asList(gift.getTag());
        int count = tagsList.size();

            for (List<String> answer: answerKeeper.getAnswers()) {
                for (String choice: answer) {
                    if (tagsList.contains(choice))
                        count--;

                }
            }
if (count == 0)
    ansGifts.add(gift);

    }
        model.addAttribute("gif", ansGifts);

    System.out.println(ansGifts);
        return "pagefour";
    }
}
