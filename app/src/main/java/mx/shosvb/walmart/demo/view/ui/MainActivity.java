package mx.shosvb.walmart.demo.view.ui;


import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import mx.shosvb.walmart.demo.R;


public class MainActivity extends AppCompatActivity implements LifecycleOwner {




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add project list fragment if this is first creation
        if (savedInstanceState == null) {
            ProductFragment fragment = new ProductFragment();

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, fragment, ProductFragment.TAG).commit();
        }
    }

    /** Shows the project detail fragment */
    public void show(String productId) {
        ProductDetailFragment productDetailFragment = ProductDetailFragment.forProduct( productId );

        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack("product")
                .replace(R.id.fragment_container,
                        productDetailFragment, null).commit();
    }

    @Override
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }
}
