package com.djd.indiancricketers.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.djd.indiancricketers.MSDhoniBiographyActivity;
import com.djd.indiancricketers.RohitSharmaBiographyActivity;
import com.djd.indiancricketers.ViratKoheliProfileActivity;
import com.djd.indiancricketers.R;

import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;


public class PlayersProfileAdapter extends RecyclerView.Adapter<PlayersProfileAdapter.ViewHolder> {

    public List<String> playersNameList = new ArrayList<>();
    Context mContext;
    int mImages[];
    private LayoutInflater mInflater;


    public PlayersProfileAdapter(List<String> playersNameList, Context mContext,int images[]) {
        this.playersNameList = playersNameList;
        this.mContext = mContext;
        this.mInflater = LayoutInflater.from(mContext);
        mImages = images;
    }



    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.players_profile_list_item, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder,final int position) {

            holder.btnPlayersName.setText(playersNameList.get(position));
            holder.btnPlayersName.setTransformationMethod(null);

            holder.profileImage.setImageResource(mImages[position]);

            holder.btnPlayersName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(position==0){
                        Intent intent = new Intent(mContext, ViratKoheliProfileActivity.class);
                        mContext.startActivity(intent);
                    }else if(position==1){
                        Intent intent = new Intent(mContext, RohitSharmaBiographyActivity.class);
                        mContext.startActivity(intent);
                    }else if(position==2){
                        Intent intent = new Intent(mContext, MSDhoniBiographyActivity.class);
                        mContext.startActivity(intent);
                    }
                }
            });


    }

    // total number of rows
    @Override
    public int getItemCount() {
        return playersNameList.size();
    }




    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        Button btnPlayersName;
        LinearLayout cardViewLayout;
        CircleImageView profileImage;

        ViewHolder(View itemView) {
            super(itemView);

            btnPlayersName = itemView.findViewById(R.id.profile_button);
            profileImage = itemView.findViewById(R.id.profile_image);
            cardViewLayout = itemView.findViewById(R.id.card_view);

        }

    }

}
