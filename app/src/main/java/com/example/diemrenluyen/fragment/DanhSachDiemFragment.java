package com.example.diemrenluyen.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import com.example.diemrenluyen.R;
import com.example.diemrenluyen.SinhVien;
import com.example.diemrenluyen.SinhVienAdapter;

import java.util.ArrayList;

public class DanhSachDiemFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment_ds_diem, container, false);

        return view;
    }

}
