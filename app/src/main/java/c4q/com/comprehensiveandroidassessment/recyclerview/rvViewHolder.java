package c4q.com.comprehensiveandroidassessment.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import c4q.com.comprehensiveandroidassessment.R;
import c4q.com.comprehensiveandroidassessment.puppy_models.Dogs;
import c4q.com.comprehensiveandroidassessment.puppy_models.Dogs2;

/**
 * Created by D on 2/25/18.
 */

public class rvViewHolder extends RecyclerView.ViewHolder {

    ImageView dogrv;
    TextView dogType;
    String url;

    public rvViewHolder(View itemView) {
        super(itemView);
       dogType = itemView.findViewById(R.id.dog_selected);
      dogrv =  itemView.findViewById(R.id.rv_image);
    }

    public void onBind (DogArray dogs2){
        dogType.setText(dogs2.getDogBreed());

        url= dogs2.getDogPic();
        Picasso.with(itemView.getContext())
                .load(url)
                .into(dogrv);



    }



}
