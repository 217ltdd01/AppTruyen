package com.example.pc.apptruyen;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by PC on 5/8/2018.
 */

public class TruyenAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<Truyen> arrayTruyen;

    public TruyenAdapter(Context context, int layout, List<Truyen> truyenList){
        myContext = context;
        myLayout = layout;
        arrayTruyen = truyenList;
    }

    @Override
    public int getCount() {
        return arrayTruyen.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(myLayout,null  );

        //Ánh xạ và gán giá trị
        TextView txtTen = (TextView) view.findViewById(R.id.textTenTruyen);
        txtTen.setText(arrayTruyen.get(i).ten);

        TextView txtSoChuong = (TextView) view.findViewById(R.id.textSoChuong);
        txtSoChuong.setText(arrayTruyen.get(i).sochuong+"");

        TextView txtTenTG = (TextView) view.findViewById(R.id.textTenTacGia);
        txtTenTG.setText(arrayTruyen.get(i).tacgia);

        TextView txtNgayCN = (TextView) view.findViewById(R.id.textNgayCapNhat);
        txtNgayCN.setText(arrayTruyen.get(i).ngaycapnhat);

        ImageView imgHinhAnh = (ImageView) view.findViewById(R.id.imgAnh);
        imgHinhAnh.setImageResource(arrayTruyen.get(i).hinhanh);

        return view;
    }

    @Nullable
    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }
}
