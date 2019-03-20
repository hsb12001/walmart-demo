package mx.shosvb.walmart.demo.view.ui;


import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mx.shosvb.walmart.demo.R;
import mx.shosvb.walmart.demo.databinding.FragmentProductDetailsBinding;
import mx.shosvb.walmart.demo.service.model.Product;
import mx.shosvb.walmart.demo.viewmodel.ProductViewModel;

public class ProductDetailFragment extends Fragment implements LifecycleOwner {
    private static final String KEY_PRODUCT_ID = "product_id";
    private FragmentProductDetailsBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        // Inflate this data binding layout
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_product_details, container, false);

        // Create and set the adapter for the RecyclerView.
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ProductViewModel.Factory factory = new ProductViewModel.Factory(
                getActivity().getApplication(), getArguments().getString(KEY_PRODUCT_ID));

        final ProductViewModel viewModel = ViewModelProviders.of(this, factory)
                .get(ProductViewModel.class);

        binding.setProductViewModel(viewModel);
        binding.setIsLoading(true);

        observeViewModel(viewModel);
    }

    private void observeViewModel(final ProductViewModel viewModel) {
        // Observe project data
        viewModel.getObservableProduct().observe(this, new Observer<Product>() {
            @Override
            public void onChanged(@Nullable Product product) {
                if (product != null) {
                    binding.setIsLoading(false);
                    viewModel.setProduct( product );
                }
            }

        });


    }

    /** Creates project fragment for specific project ID */
    public static ProductDetailFragment forProduct(String productId) {
        ProductDetailFragment fragment = new ProductDetailFragment();
        Bundle args = new Bundle();

        args.putString(KEY_PRODUCT_ID, productId );
        fragment.setArguments(args);

        return fragment;
    }
}
