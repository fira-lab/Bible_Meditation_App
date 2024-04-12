package com.example.annointing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivity  = findViewById(R.id.main_activity);
        MainActivity .setFlashCardGroups(createFlashCardGroups());
        MainActivity .start();
    }



    private List<FlashCardGroup> createFlashCardGroups() {
        List<FlashCardGroup> flashCardGroups = new ArrayList<>();

        // Group 1
        FlashCardGroup group1 = new FlashCardGroup();
        group1.setName("Group 1");

        List<FlashCard> group1Cards = new ArrayList<>();
        group1Cards.add(new FlashCard("Group 1 Sentence 1", "Group 1 Definition 1"));
        group1Cards.add(new FlashCard("Group 1 Sentence 2", "Group 1 Definition 2"));
        group1Cards.add(new FlashCard("Group 1 Sentence 3", "Group 1 Definition 3"));
        group1Cards.add(new FlashCard("Group 1 Sentence 4", "Group 1 Definition 4"));
        group1Cards.add(new FlashCard("Group 1 Sentence 5", "Group 1 Definition 5"));
        group1Cards.add(new FlashCard("Group 1 Sentence 6", "Group 1 Definition 6"));
        group1Cards.add(new FlashCard("Group 1 Sentence 7", "Group 1 Definition 7"));

        group1.setFlashCards(group1Cards);
        flashCardGroups.add(group1);

        // Group 2
        FlashCardGroup group2 = new FlashCardGroup();
        group2.setName("Group 2");

        List<FlashCard> group2Cards = new ArrayList<>();
        group2Cards.add(new FlashCard("Group 1 Sentence 1", "Group 2 Definition 1"));
        group2Cards.add(new FlashCard("Group 1 Sentence 2", "Group 2 Definition 2"));
        group2Cards.add(new FlashCard("Group 1 Sentence 3", "Group 2 Definition 3"));
        group2Cards.add(new FlashCard("Group 1 Sentence 4", "Group 2 Definition 4"));
        group2Cards.add(new FlashCard("Group 1 Sentence 5", "Group 2 Definition 5"));
        group2Cards.add(new FlashCard("Group 1 Sentence 6", "Group 2 Definition 6"));
        group2Cards.add(new FlashCard("Group 1 Sentence 7", "Group 2 Definition 7"));

        group2.setFlashCards(group2Cards);
        flashCardGroups.add(group2);
        // ...
        // Group 3
        FlashCardGroup group3 = new FlashCardGroup();
        group3.setName("Group 3");

        List<FlashCard> group3Cards = new ArrayList<>();
        group3Cards.add(new FlashCard("Group 1 Sentence 1", "Group 3 Definition 1"));
        group3Cards.add(new FlashCard("Group 1 Sentence 2", "Group 3 Definition 2"));
        group3Cards.add(new FlashCard("Group 1 Sentence 3", "Group 3 Definition 3"));
        group3Cards.add(new FlashCard("Group 1 Sentence 4", "Group 3 Definition 4"));
        group3Cards.add(new FlashCard("Group 1 Sentence 5", "Group 3 Definition 5"));
        group3Cards.add(new FlashCard("Group 1 Sentence 6", "Group 3 Definition 6"));
        group3Cards.add(new FlashCard("Group 1 Sentence 7", "Group 3 Definition 7"));

        group3.setFlashCards(group3Cards);
        flashCardGroups.add(group4);
        // ...
        // Group 4
        FlashCardGroup group4 = new FlashCardGroup();
        group4.setName("Group 3");

        List<FlashCard> group4Cards = new ArrayList<>();
        group4Cards.add(new FlashCard("Group 1 Sentence 1", "Group 4 Definition 1"));
        group4Cards.add(new FlashCard("Group 1 Sentence 2", "Group 4 Definition 2"));
        group4Cards.add(new FlashCard("Group 1 Sentence 3", "Group 4 Definition 3"));
        group4Cards.add(new FlashCard("Group 1 Sentence 4", "Group 4 Definition 4"));
        group4Cards.add(new FlashCard("Group 1 Sentence 5", "Group 4 Definition 5"));
        group4Cards.add(new FlashCard("Group 1 Sentence 6", "Group 4 Definition 6"));
        group4Cards.add(new FlashCard("Group 1 Sentence 7", "Group 4 Definition 7"));

        group4.setFlashCards(group4Cards);
        flashCardGroups.add(group4);
        // ...
        // Group 5
        FlashCardGroup group5 = new FlashCardGroup();
        group5.setName("Group 5");

        List<FlashCard> group5Cards = new ArrayList<>();
        group5Cards.add(new FlashCard("Group 1 Sentence 1", "Group 5 Definition 1"));
        group5Cards.add(new FlashCard("Group 1 Sentence 2", "Group 5 Definition 2"));
        group5Cards.add(new FlashCard("Group 1 Sentence 3", "Group 5 Definition 3"));
        group5Cards.add(new FlashCard("Group 1 Sentence 4", "Group 5 Definition 4"));
        group5Cards.add(new FlashCard("Group 1 Sentence 5", "Group 5 Definition 5"));
        group5Cards.add(new FlashCard("Group 1 Sentence 6", "Group 5 Definition 6"));
        group5Cards.add(new FlashCard("Group 1 Sentence 7", "Group 5 Definition 7"));

        group5.setFlashCards(group5Cards);
        flashCardGroups.add(group5);
        // ...
        // Group 6
        FlashCardGroup group6 = new FlashCardGroup();
        group6.setName("Group 3");

        List<FlashCard> group6Cards = new ArrayList<>();
        group6Cards.add(new FlashCard("Group 1 Sentence 1", "Group 6 Definition 1"));
        group6Cards.add(new FlashCard("Group 1 Sentence 2", "Group 6 Definition 2"));
        group6Cards.add(new FlashCard("Group 1 Sentence 3", "Group 6 Definition 3"));
        group6Cards.add(new FlashCard("Group 1 Sentence 4", "Group 6 Definition 4"));
        group6Cards.add(new FlashCard("Group 1 Sentence 5", "Group 6 Definition 5"));
        group6Cards.add(new FlashCard("Group 1 Sentence 6", "Group 6 Definition 6"));
        group6Cards.add(new FlashCard("Group 1 Sentence 7", "Group 6 Definition 7"));

        group6.setFlashCards(group6Cards);
        flashCardGroups.add(group6);
        // ...
        FlashCardGroup group7 = new FlashCardGroup();
        group7.setName("Group 7");

        List<FlashCard> group7Cards = new ArrayList<>();
        group7Cards.add(new FlashCard("Group 1 Sentence 1", "Group 3 Definition 1"));
        group7Cards.add(new FlashCard("Group 1 Sentence 2", "Group 3 Definition 2"));
        group7Cards.add(new FlashCard("Group 1 Sentence 3", "Group 3 Definition 3"));
        group7Cards.add(new FlashCard("Group 1 Sentence 4", "Group 3 Definition 4"));
        group7Cards.add(new FlashCard("Group 1 Sentence 5", "Group 3 Definition 5"));
        group7Cards.add(new FlashCard("Group 1 Sentence 6", "Group 3 Definition 6"));
        group7Cards.add(new FlashCard("Group 1 Sentence 7", "Group 3 Definition 7"));

        group7.setFlashCards(group7Cards);
        flashCardGroups.add(group7);
        // Group 7
        // ...

        return flashCardGroups;
    }
}