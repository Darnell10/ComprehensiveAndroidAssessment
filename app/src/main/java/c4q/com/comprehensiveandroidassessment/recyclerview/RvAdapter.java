package c4q.com.comprehensiveandroidassessment.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import c4q.com.comprehensiveandroidassessment.R;

/**
 * Created by D on 2/25/18.
 */

public class RvAdapter extends RecyclerView.Adapter<rvViewHolder> {

    List<DogArray> dogArrays;

    @Override
    public rvViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false)
        return new rvViewHolder(view);
    }

    @Override
    public void onBindViewHolder(rvViewHolder holder, int position) {
        DogArray dogArray = dogArrays.get(position);
        holder.onBind(dogArray);
    }

    @Override
    public int getItemCount() {
        return dogArrays.size();
    }
}
