package com.example.diemrenluyen.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.diemrenluyen.R;
import com.example.diemrenluyen.SinhVien;
import com.example.diemrenluyen.SinhVienAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class DanhSachSinhVienFragment extends Fragment {

//    String getData = "http://192.168.1.3:8080/thuchanh/nguoidung.php";
//    String urlDelete = "http://192.168.1.3:8080/android/delete.php";
//    ListView lsvSinhVien;
//    ArrayList<SinhVien> sinhVienArrayList;
//    SinhVienAdapter sinhVienAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment_ds_sinhvien, container, false);


//        lsvSinhVien = (ListView) view.findViewById(android.R.id.list);
//        sinhVienAdapter = new SinhVienAdapter(getActivity(), R.layout.dong_danhsach_sinhvien, sinhVienArrayList);
//        lsvSinhVien.setAdapter(sinhVienAdapter);
//        getDSsinhvien(getData);
        return view;
    }
//
//    private void getDSsinhvien(String url) {
//        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
//        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null,
//                new Response.Listener<JSONArray>() {
//                    @Override
//                    public void onResponse(JSONArray response) {
//
//                        sinhVienArrayList.clear();
//                        for (int i = 0; i <= response.length(); i++){
//                            try {
//                                JSONObject object = response.getJSONObject(i);
//
//                                sinhVienArrayList.add(new SinhVien(
//                                        object.getInt("id"),
//                                        object.getString("maSV"),
//                                        object.getString("tenSV"),
//                                        object.getString("email"),
//                                        object.getString("matKhau"),
//                                        object.getString("lop"),
//                                        object.getString("SDT"),
//                                        object.getString("diaChi"),
//                                        object.getString("gioiTinh"),
//                                        object.getString("ngaySinh"),
//                                        object.getString("anh")
//                                ));
//                            } catch (JSONException e) {
//                                e.printStackTrace();
//                            }
//                        }
//
//                    }
//                }, new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//
//                    }
//        });
//    }

}
