package com.kerbygregorio.drawer.ui.tourist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kerbygregorio.drawer.R;
import com.kerbygregorio.drawer.databinding.FragmentTouristBinding;

public class tourist extends Fragment {

    private FragmentTouristBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TouristViewModel touristViewModel =
                new ViewModelProvider(this).get(TouristViewModel.class);

        binding = FragmentTouristBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final RecyclerView recyclerView = root.findViewById(R.id.recyclerView);

        // Pass the context and the array of strings to the CustomAdapter constructor
        CustomAdapter customAdapter = new CustomAdapter(root.getContext(), new String[]{"Lingayen Beach", "Minor Basilica of Our Lady of the Rosary of Manaoag", "Cape Bolinao Lighthouse", "Our Farm Republic", "Tayug Sunflower Eco Park ", "Balingasay River", "Tondol White Sand Beach ", "Enchanted Cave Bolinao", "Patar Beach Bolinao ", "Cabongaoan Beach and Death Pool Burgos","Hundred Islands National Park Alaminos" });

        recyclerView.setLayoutManager(new LinearLayoutManager(root.getContext()));
        recyclerView.setAdapter(customAdapter);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
