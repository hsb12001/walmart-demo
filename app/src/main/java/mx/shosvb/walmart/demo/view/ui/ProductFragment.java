package mx.shosvb.walmart.demo.view.ui;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mx.shosvb.walmart.demo.R;
import mx.shosvb.walmart.demo.databinding.FragmentProductBinding;


public class ProductFragment extends Fragment implements LifecycleOwner {
    public static final String TAG = "ProductFragment";

    private FragmentProductBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_product, container, false);
        binding.searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {


                    ((MainActivity) getActivity()).show(binding.idProduct.getText().toString());
                }
            }
        });



        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }



}
