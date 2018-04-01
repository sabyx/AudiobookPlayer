package com.example.sabyx.audiobookplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    public static final String EXTRA_KEY = "audiobook";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        final ArrayList<Audiobook> audiobooks = new ArrayList<>();
        audiobooks.add(new Audiobook("Emma", "Jane Austen", "Sherry reads Jane Austen’s sparkling comedy of manners with wit and vivacity, and brings the characters to life. Mr. Woodhouse worries and frets, Miss Bates chatters on, and Emma blithely manipulates and misunderstands her friends and family until she finally learns her lesson! ","3:20:00"));
        audiobooks.add(new Audiobook("Persuasion","Jane Austen","Eight years ago, Anne Elliot fell in love with a poor but ambitious young naval officer, Frederick Wentworth. The Elliots were dissatisfied with Anne's choice, feeling he was not distinguished enough for their family, and her older friend and mentor, Lady Russell, acting in place of Anne's deceased mother, persuaded her to break off the match. Now 27 and considered a spinster, Anne re-encounters her former fiance, now a captain, as he courts her spirited young neighbour, Louisa Musgrove. The self-interested machinations of Anne's older sister Elizabeth, of Elizabeth's friend Mrs. Clay, and of Anne's father's heir, William Elliot, constitute an important subplot.","4:25:00"));
        audiobooks.add(new Audiobook("Pride and Prejudice","Jane Austen","Pride and Prejudice is the most famous of Jane Austen’s novels, and its opening is one of the most famous lines in English literature - “It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife.” Its manuscript was first written between 1796 and 1797, and was initially called First Impressions, but was never published under that title. Following revisions it was published on 28 January 1813 by the same Mr. Egerton of the Military Library, Whitehall, who had brought out Sense and Sensibility. Like both its predecessor and Northanger Abbey, it was written at Steventon Rectory.","3:50:00"));
        audiobooks.add(new Audiobook("Sense and Sensibility", "Jane Austen","The two eldest Dashwood sisters, Elinor and Marianne, one of whom (Elinor) embraces practicality and restraint while the other (Marianne) gives her whole heart to every endeavor. When the Dashwoods - mother Mrs. Dashwood, Elinor, Marianne, and youngest sister Margaret - are sent, almost impoverished, to a small cottage in Devonshire after the death of their father and the machinations of their brother's wife, they accept their new circumstances with as much cheer as they can muster even though their brother and his wife have taken over the family estate and fortune. Marianne finds herself falling in love with the dashing Willoughby, who ends up being not all that he appears. Elinor, the more sensible of the two, falls for Edward Ferrars, a match that seems much more suitable. All of these pleasant connections are, however, soon disrupted. Willoughby leaves and ignores Marianne. Elinor finds out an unexpected secret about Ferrars that puts her on her caution in pursuing their relationship. As these complications develop, Marianne soon finds herself distraught despite having attracted another suitor, the reliable, but older, Colonel Brandon. Elinor steps into the breach to try to help her sister regain her equilibrium. Both learn what a broken heart can feel like and adjust in their own separate ways. Since this is an Austen novel and a romance, be assured that all comes right in the end.","2:30:00"));

        AudiobookAdapter adapter = new AudiobookAdapter(this, audiobooks);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Audiobook audiobook = audiobooks.get(position);
                Intent intent = new Intent(LibraryActivity.this, NowPlayingActivity.class);
                intent.putExtra(EXTRA_KEY, audiobook);
                startActivity(intent);
            }
        });
    }
}
