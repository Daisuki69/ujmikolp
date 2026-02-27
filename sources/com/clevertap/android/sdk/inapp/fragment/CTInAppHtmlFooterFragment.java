package com.clevertap.android.sdk.inapp.fragment;

import A7.c;
import Bj.C0165x;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.paymaya.R;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class CTInAppHtmlFooterFragment extends CTInAppBasePartialHtmlFragment {
    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBasePartialHtmlFragment
    public final ViewGroup v1(View view) {
        if (view != null) {
            return (ViewGroup) view.findViewById(R.id.inapp_html_footer_frame_layout);
        }
        return null;
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBasePartialHtmlFragment
    public final View w1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.inapp_html_footer, viewGroup, false);
        j.d(viewInflate);
        ViewCompat.setOnApplyWindowInsetsListener(viewInflate, new c(new C0165x(21), 9));
        return viewInflate;
    }
}
