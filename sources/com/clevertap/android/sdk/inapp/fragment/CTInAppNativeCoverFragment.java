package com.clevertap.android.sdk.inapp.fragment;

import A7.c;
import Bj.C0165x;
import S.b;
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
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.paymaya.R;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
public final class CTInAppNativeCoverFragment extends CTInAppBaseFullNativeFragment {
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        ArrayList arrayList = new ArrayList();
        View viewInflate = inflater.inflate(R.layout.inapp_cover, viewGroup, false);
        j.d(viewInflate);
        ViewCompat.setOnApplyWindowInsetsListener(viewInflate, new c(new C0165x(25), 9));
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.inapp_cover_frame_layout);
        RelativeLayout relativeLayout = (RelativeLayout) frameLayout.findViewById(R.id.cover_relative_layout);
        relativeLayout.setBackgroundColor(Color.parseColor(p1().f9505v));
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(R.id.cover_linear_layout);
        Button button = (Button) linearLayout.findViewById(R.id.cover_button1);
        arrayList.add(button);
        Button button2 = (Button) linearLayout.findViewById(R.id.cover_button2);
        arrayList.add(button2);
        ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.backgroundImage);
        CTInAppNotificationMedia cTInAppNotificationMediaB = p1().b(this.f9520P);
        if (cTInAppNotificationMediaB != null) {
            String str = cTInAppNotificationMediaB.c;
            if (!C2576A.H(str)) {
                imageView.setContentDescription(str);
            }
            Bitmap bitmapA = t1().a(cTInAppNotificationMediaB.f9512a);
            if (bitmapA != null) {
                imageView.setImageBitmap(bitmapA);
                imageView.setTag(0);
            }
        }
        TextView textView = (TextView) relativeLayout.findViewById(R.id.cover_title);
        textView.setText(p1().f9496l);
        textView.setTextColor(Color.parseColor(p1().f9488a0));
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.cover_message);
        textView2.setText(p1().m);
        textView2.setTextColor(Color.parseColor(p1().f9484X));
        ArrayList arrayList2 = p1().i;
        if (arrayList2.size() == 1) {
            int i = this.f9520P;
            if (i == 2) {
                button.setVisibility(8);
            } else if (i == 1) {
                button.setVisibility(4);
            }
            j.d(button2);
            F1(button2, (CTInAppNotificationButton) arrayList2.get(0), 0);
        } else if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (i4 < 2) {
                    CTInAppNotificationButton cTInAppNotificationButton = (CTInAppNotificationButton) arrayList2.get(i4);
                    Object obj = arrayList.get(i4);
                    j.f(obj, "get(...)");
                    F1((Button) obj, cTInAppNotificationButton, i4);
                }
            }
        }
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        closeImageView.setOnClickListener(new b(this, 1));
        if (p1().f9479S) {
            closeImageView.setVisibility(0);
            return viewInflate;
        }
        closeImageView.setVisibility(8);
        return viewInflate;
    }
}
