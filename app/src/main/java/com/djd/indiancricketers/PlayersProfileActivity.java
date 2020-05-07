package com.djd.indiancricketers;

//import android.support.v7.app.AppCompatActivity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import com.djd.indiancricketers.adapter.PlayersProfileAdapter;
import com.djd.indiancricketers.utils.DividerItemDecoration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class PlayersProfileActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView rcvPlayersProfile;
    String[] PLAYERSNAME ;
    public List<String> playersNameList = new ArrayList<>();
    int images[] = {R.drawable.virat_koheli,R.drawable.rohit_sharma,
            R.drawable.ms_dhoni,R.drawable.kl_rahul,R.drawable.reshad_pant,
            R.drawable.jasprirt_bhumra,R.drawable.hardik_pandya,
            R.drawable.ravindra_jadeja,R.drawable.mohammad_shami,R.drawable.yuzvendra_chahal,
            R.drawable.bhuvneshwar_kumar,R.drawable.ishant_sharma,R.drawable.dinesh_karthik,R.drawable.kedar_jadhav,
            R.drawable.kuldeep_yadav
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_profile);
        toolbar = (Toolbar) findViewById(R.id.toolbar_players_profile);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();

            }
        });
        initViews();
    }

    public void initViews(){
        rcvPlayersProfile = findViewById(R.id.rcv_players_profile);
        PLAYERSNAME = getResources().getStringArray(R.array.name_of_player);
        playersNameList = Arrays.asList(PLAYERSNAME);

        rcvPlayersProfile.setLayoutManager(new LinearLayoutManager(PlayersProfileActivity.this));
        PlayersProfileAdapter rePatientListAdapter = new PlayersProfileAdapter(playersNameList,PlayersProfileActivity.this,images);

        rcvPlayersProfile.setAdapter(rePatientListAdapter);
        rcvPlayersProfile.setHasFixedSize(true);
        // use a linear layout manager
        layoutManager = new LinearLayoutManager(PlayersProfileActivity.this);

        Drawable dividerDrawable = ContextCompat.getDrawable(PlayersProfileActivity.this, R.drawable.recycler_divider_color);
        rcvPlayersProfile.addItemDecoration(new DividerItemDecoration(dividerDrawable));

    }
}
