package neliosudemy.exercicios;

import neliosudemy.model.Comment;
import neliosudemy.model.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import static neliosudemy.model.Post.simpleDateFormat;

public class Exercicio23 {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);


        Comment tripTxt = new Comment("Have a nice trip!");
        Comment awesomeTxt = new Comment("Wow that's awesome!");
        Post post = new Post(simpleDateFormat.parse("21/06/2018 13:05:44"),
                "Traveling to new Zelean",
                "I'm going to visit this wonderful country!",
                12);

        post.addComment(tripTxt);
        post.addComment(awesomeTxt);

        System.out.println(post);


    }

}
