package quizapp;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Quiz q = new Quiz();
        q.logic();

    }
}

class Quiz{
    public void logic(){

        Scanner sc = new Scanner(System.in);
        int correct = 0;
        int wrong = 0;

//        create objects
        Questions q1 = new Questions("Which statement is true about Java?", "a) Java is a sequence-dependent programming language","b) Java is a code dependent programming language","c) Java is a platform-dependent programming language","d) Java is a platform-independent programming language");
        Questions q2 = new Questions("What is the extension of java code files?","a) .js","b) .txt","c) .class","d) .java");
        Questions q3 = new Questions("Who invented Java Programming?","a) Guido van Rossum","b) James Gosling","c) Dennis Ritchie","d) Bjarne Stroustrup");
        Questions q4 = new Questions("Which one of the following is not a Java feature?","a) Object-oriented","b) Use of pointers","c) Portable","d) Dynamic and Extensible");
        Questions q5 = new Questions("Which of these cannot be used for a variable name in Java?","a) identifier & keyword","b) identifier","c) keyword","d) none of the mentioned");

//        create a hashmap which will store the answer of all questions
        HashMap<Questions, Character> map = new HashMap<>();

        map.put(q1, 'd');
        map.put(q2, 'd');
        map.put(q3, 'b');
        map.put(q4, 'b');
        map.put(q5, 'c');

        for(Map.Entry<Questions, Character> hm:map.entrySet()){
            System.out.println(hm.getKey().getQuestion());
            System.out.println(hm.getKey().getOption1());
            System.out.println(hm.getKey().getOption2());
            System.out.println(hm.getKey().getOption3());
            System.out.println(hm.getKey().getOption4());

            System.out.println("Enter your answer");
//            Character ch = sc.next()
//            OR
            Character ch = sc.next().charAt(0);
            int c = Character.compare(ch,hm.getValue());
            if(c == 0){
                System.out.println("Correct answer");
                correct++;
            }
            else{
                System.out.println("Wrong answer");
                wrong++;
            }

        }
        System.out.println();
        System.out.println("--------Result--------");
        System.out.println("Correct answers: " +correct+"\n"+"Wrong answers: " + wrong);
        int per = 100*correct/map.size();
        System.out.println("Percentage: "+per);
    }
}
