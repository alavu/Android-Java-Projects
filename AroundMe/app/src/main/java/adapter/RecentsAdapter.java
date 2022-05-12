package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aroundme.R;

import java.util.List;

import model.RecentsData;

public class RecentsAdapter extends RecyclerView.Adapter<RecentsAdapter.RecentsViewHolder> {
    Context context;
    List<RecentsData>recentsDataList;

    public RecentsAdapter(Context context, List<RecentsData> recentsDataList) {
        this.context = context;
        this.recentsDataList = recentsDataList;
    }

    @NonNull

    @Override
    public RecentsViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recent_row_item,parent,false);
    //here we create a recyclerview now item layout file
        return new RecentsViewHolder(view);
    }

    @Override
    public void onBindViewHolder( RecentsAdapter.RecentsViewHolder holder, int position) {
        holder.countryName.setText(recentsDataList.get(position).getCountryName());
        holder.placeName.setText(recentsDataList.get(position).getPlaceName());
        holder.price.setText(recentsDataList.get(position).getPrice());
        holder.placeImage.setImageResource(recentsDataList.get(position).getImageUrl());

    }

    @Override
    public int getItemCount() {
        return recentsDataList.size();
    }

    public static final class RecentsViewHolder extends RecyclerView.ViewHolder{
        ImageView placeImage;
        TextView placeName,countryName,price;
        public RecentsViewHolder(@NonNull View itemView){
            super(itemView);
            placeImage=itemView.findViewById(R.id.place_image);
            placeName=itemView.findViewById(R.id.place_name);
            countryName=itemView.findViewById(R.id.country_name);
            price=itemView.findViewById(R.id.price);

        }
    }
}