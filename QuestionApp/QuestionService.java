import java.util.Scanner;

public class QuestionService {

    Question questions[] = new Question[4];
    String answer[] = new String[4];

    public QuestionService() {
        questions[0] = new Question(0, "Makan apa. . .?", "1", "3", "2", "3");
        questions[1] = new Question(1, "Makan KCANG. . .?", "1", "3", "2", "1");
        questions[2] = new Question(2, "Makan MAKAN IKAN. . .?", "1", "3", "2", "2");
        questions[3] = new Question(3, "Makan LAIK. . .?", "1", "3", "2", "3");
    }

    public void playQuiz() {
        int i = 0; 

        for (Question q : questions) {
            System.out.println("Questions number " + q.getId());
            System.out.println("option : " + q.getOption1());
            System.out.println("option : " + q.getOption2());
            System.out.println("option : " + q.getOption3());

            Scanner sc = new Scanner(System.in) ;
                answer[i] = sc.nextLine();
            
            i++;
        }
    }

    public void printScore() {
        int score = 0; 

        for(int i = 0; i < questions.length; i++) {
            if (answer[i].equals(questions[i].getAnswer())) {
                score++;
            }
        }

        System.out.println("Your Score is " + score);
    }
}
