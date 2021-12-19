package com.example.diemrenluyen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.diemrenluyen.fragment.DanhSachDiemFragment;
import com.example.diemrenluyen.fragment.DanhSachSinhVienFragment;

import java.util.ArrayList;
import java.util.List;

public class SinhVienAdapter extends BaseAdapter {

private Context context;
private int laypout;
private List<SinhVien> sinhVienList;

    public SinhVienAdapter(Context context, int laypout, List<SinhVien> sinhVienList) {
        this.context = context;
        this.laypout = laypout;
        this.sinhVienList = sinhVienList;
    }


    @Override
    public int getCount() {
        return sinhVienList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        TextView txt_ten_sv, txt_ma_sv, txt_lop_sv;
        ImageView imgDelete, imgEdit;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;

        if (view == null){
            holder = new ViewHolder();
            LayoutInflater inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view= inflater.inflate(laypout, null);
            holder.txt_ten_sv = (TextView) view.findViewById(R.id.txt_ten_sinhvien);
            holder.txt_ma_sv = (TextView) view.findViewById(R.id.txt_ma_sinhvien);
            holder.txt_lop_sv = (TextView) view.findViewById(R.id.txt_lop_sinhvien);

            view.setTag(holder);
        }else {

            holder = (ViewHolder)view.getTag();
        }
        return null;
    }
}
