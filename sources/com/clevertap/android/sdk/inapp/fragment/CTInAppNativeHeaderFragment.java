package com.clevertap.android.sdk.inapp.fragment;

import A7.c;
import Bj.C0165x;
import M8.X1;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.paymaya.R;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
public final class CTInAppNativeHeaderFragment extends CTInAppBasePartialNativeFragment {
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        ArrayList arrayList = new ArrayList();
        View viewInflate = inflater.inflate(R.layout.inapp_header, viewGroup, false);
        this.f9530V = viewInflate;
        RelativeLayout relativeLayout = (RelativeLayout) ((FrameLayout) viewInflate.findViewById(R.id.header_frame_layout)).findViewById(R.id.header_relative_layout);
        relativeLayout.setBackgroundColor(Color.parseColor(p1().f9505v));
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(R.id.header_linear_layout_1);
        LinearLayout linearLayout2 = (LinearLayout) relativeLayout.findViewById(R.id.header_linear_layout_2);
        LinearLayout linearLayout3 = (LinearLayout) relativeLayout.findViewById(R.id.header_linear_layout_3);
        Button button = (Button) linearLayout3.findViewById(R.id.header_button_1);
        j.d(button);
        arrayList.add(button);
        Button button2 = (Button) linearLayout3.findViewById(R.id.header_button_2);
        j.d(button2);
        arrayList.add(button2);
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.header_icon);
        if (p1().f9483W.isEmpty()) {
            imageView.setVisibility(8);
        } else {
            CTInAppNotificationMedia cTInAppNotificationMedia = (CTInAppNotificationMedia) p1().f9483W.get(0);
            if (!C2576A.H(cTInAppNotificationMedia.c)) {
                imageView.setContentDescription(cTInAppNotificationMedia.c);
            }
            Bitmap bitmapA = t1().a(cTInAppNotificationMedia.f9512a);
            if (bitmapA != null) {
                imageView.setImageBitmap(bitmapA);
            } else {
                imageView.setVisibility(8);
            }
        }
        TextView textView = (TextView) linearLayout2.findViewById(R.id.header_title);
        textView.setText(p1().f9496l);
        textView.setTextColor(Color.parseColor(p1().f9488a0));
        TextView textView2 = (TextView) linearLayout2.findViewById(R.id.header_message);
        textView2.setText(p1().m);
        textView2.setTextColor(Color.parseColor(p1().f9484X));
        ArrayList arrayList2 = p1().i;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i = 0; i < size && i < 2; i++) {
                w1((Button) arrayList.get(i), (CTInAppNotificationButton) arrayList2.get(i), i);
            }
        }
        if (p1().f9506w == 1) {
            CTInAppBasePartialNativeFragment.v1(button, button2);
        }
        viewInflate.setOnTouchListener(new X1(this, 3));
        ViewCompat.setOnApplyWindowInsetsListener(viewInflate, new c(new C0165x(28), 9));
        return viewInflate;
    }
}
