package com.example.android.kids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list );

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "واحد", R.drawable.number_one));
        words.add(new Word("two", "اثنان", R.drawable.number_two));
        words.add(new Word("three", "ثلاثة", R.drawable.number_three));
        words.add(new Word("four", "أربعة", R.drawable.number_four));
        words.add(new Word("five", "خمسة", R.drawable.number_five));
        words.add(new Word("six", "ستة", R.drawable.number_six));
        words.add(new Word("seven", "سبعة", R.drawable.number_seven));
        words.add(new Word("eight", "ثمانية", R.drawable.number_eight));
        words.add(new Word("nine", "تسعة", R.drawable.number_nine));
        words.add(new Word("ten", "عشرة", R.drawable.number_ten));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}