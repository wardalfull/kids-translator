package com.example.android.kids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.word_list );
    // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "أحمر", R.drawable.color_red));
        words.add(new Word("mustard yellow", "كموني", R.drawable.color_mustard_yellow));
        words.add(new Word("dusty yellow", "بيج", R.drawable.color_dusty_yellow));
        words.add(new Word("green", "أخضر", R.drawable.color_green));
        words.add(new Word("brown", "بني", R.drawable.color_brown));
        words.add(new Word("gray", "رمادي", R.drawable.color_gray));
        words.add(new Word("black", "أسود", R.drawable.color_black));
        words.add(new Word("white", "أبيض", R.drawable.color_white));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
    // adapter knows how to create list items for each item in the list.
    WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

    // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
    // There should be a {@link ListView} with the view ID called list, which is declared in the
    // word_list.xml layout file.
    ListView listView = (ListView) findViewById(R.id.list);

    // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
    // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
}

}
