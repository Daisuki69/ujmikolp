package com.paymaya.common.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import butterknife.ButterKnife;
import com.paymaya.R;
import java.util.ArrayList;
import java.util.List;
import w5.InterfaceC2384b;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f10231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2384b f10232b;
    public final LayoutInflater c;

    public a(Context context, List list, InterfaceC2384b interfaceC2384b) {
        this.f10231a = new ArrayList(list);
        this.f10232b = interfaceC2384b;
        this.c = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f10231a.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        SingleItemSpinnerAdapter$SingleItemDropDownViewHolder singleItemSpinnerAdapter$SingleItemDropDownViewHolder;
        if (view == null) {
            view = this.c.inflate(R.layout.pma_view_spinner_single_item_drop_down, viewGroup, false);
            singleItemSpinnerAdapter$SingleItemDropDownViewHolder = new SingleItemSpinnerAdapter$SingleItemDropDownViewHolder();
            ButterKnife.bind(singleItemSpinnerAdapter$SingleItemDropDownViewHolder, view);
            view.setTag(singleItemSpinnerAdapter$SingleItemDropDownViewHolder);
        } else {
            singleItemSpinnerAdapter$SingleItemDropDownViewHolder = (SingleItemSpinnerAdapter$SingleItemDropDownViewHolder) view.getTag();
        }
        singleItemSpinnerAdapter$SingleItemDropDownViewHolder.mTextViewItem.setText(this.f10232b.b(this.f10231a.get(i)));
        return view;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f10231a.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        SingleItemSpinnerAdapter$SingleItemViewHolder singleItemSpinnerAdapter$SingleItemViewHolder;
        if (view == null) {
            view = this.c.inflate(R.layout.pma_view_spinner_single_item, viewGroup, false);
            singleItemSpinnerAdapter$SingleItemViewHolder = new SingleItemSpinnerAdapter$SingleItemViewHolder();
            ButterKnife.bind(singleItemSpinnerAdapter$SingleItemViewHolder, view);
            view.setTag(singleItemSpinnerAdapter$SingleItemViewHolder);
        } else {
            singleItemSpinnerAdapter$SingleItemViewHolder = (SingleItemSpinnerAdapter$SingleItemViewHolder) view.getTag();
        }
        singleItemSpinnerAdapter$SingleItemViewHolder.mTextViewItem.setText(this.f10232b.b(this.f10231a.get(i)));
        return view;
    }
}
