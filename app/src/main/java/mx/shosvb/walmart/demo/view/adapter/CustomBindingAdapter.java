package mx.shosvb.walmart.demo.view.adapter;

import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import mx.shosvb.walmart.demo.service.repository.WalmartService;

public class CustomBindingAdapter {
    @BindingAdapter("visibleGone")
    public static void showHide(View view, boolean show) {
        view.setVisibility(show ? View.VISIBLE : View.GONE);
    }



    @BindingAdapter("imagePath")
    public static void loadImage(ImageView imageView, String imagePath) {
        if (imagePath != null) {

            Glide.with(imageView).load( WalmartService.HTTPS_API_URL+imagePath ).into(imageView);
        } else {
            imageView.setImageDrawable(null);
        }
    }
}