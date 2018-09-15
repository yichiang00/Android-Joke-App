package com.example.jokelib;

import java.util.Random;

//create a java library by readling this article: http://www.vogella.com/tutorials/AndroidLibraryProjects/article.html
public class Joke {
    //get jokes through https://short-funny.com/
    private String[] allJokes = new String[] {

            "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.",
            "Coco Chanel once said that you should put perfume on places where you want to be kissed by a man. But hell does that burn!",
            "Me and my wife decided that we don't want to have children anymore. So anybody who wants one can leave us their phone number and address and we will bring you one. ",
            "I can’t believe I forgot to go to the gym today. That’s 7 years in a row now. "
    };

    public String getRandomJoke()
    {
        Random rand = new Random();
        int idx = rand.nextInt(allJokes.length);
        return allJokes[idx];
    }
}
