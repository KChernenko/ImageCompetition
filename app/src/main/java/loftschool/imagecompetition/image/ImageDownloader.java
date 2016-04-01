package loftschool.imagecompetition.image;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.squareup.picasso.Picasso;

import loftschool.imagecompetition.R;

public class ImageDownloader implements ImageInteractor {

    private Context context;

    public ImageDownloader(Context context) {
        this.context = context;
    }

    @Override
    public void loadImage(@Flag int flag, String imgUrl, ImageView target) {
        switch (flag) {
            case Flag.PICASSO:
                loadWithPicasso(imgUrl, target);
                break;
            case Flag.GLIDE:
                loadWithGlide(imgUrl, target);
                break;
        }
    }

    private void loadWithPicasso(String imgUrl, ImageView target) {
        Picasso.with(context).load(imgUrl)
                .resize(723, 710)
                .placeholder(R.mipmap.ic_launcher)
                .into(target);
    }

    private void  loadWithGlide(String imgUrl, ImageView target) {
        Glide.with(context)
                .load(imgUrl)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.mipmap.ic_launcher)
                .override(723, 710)
                .into(target);
    }
}
