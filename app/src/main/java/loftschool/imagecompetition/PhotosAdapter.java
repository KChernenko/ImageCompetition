package loftschool.imagecompetition;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

import loftschool.imagecompetition.image.ImageDownloader;

import static loftschool.imagecompetition.image.ImageInteractor.Flag;

public class PhotosAdapter extends RecyclerView.Adapter<PhotosAdapter.PhotoHolder> {

    private ImageDownloader imageDownloader;

    private List<String> items;

    public PhotosAdapter(Context context, List<String> items) {
        imageDownloader = new ImageDownloader(context);
        this.items = items;
    }

    @Override
    public PhotoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.photo_item, parent, false);

        return new PhotoHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PhotoHolder holder, int position) {
        String item = items.get(position);
        imageDownloader.loadImage(Flag.GLIDE, item, holder.photo);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class PhotoHolder extends RecyclerView.ViewHolder {

        public ImageView photo;

        public PhotoHolder(View itemView) {
            super(itemView);
            photo = (ImageView) itemView.findViewById(R.id.photo_item);
        }
    }


}
