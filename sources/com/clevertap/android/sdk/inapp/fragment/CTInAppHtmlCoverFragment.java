package com.clevertap.android.sdk.inapp.fragment;

import A7.c;
import Bj.C0165x;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class CTInAppHtmlCoverFragment extends CTInAppBaseFullHtmlFragment {
    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFullHtmlFragment
    public final RelativeLayout.LayoutParams F1(int i) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        int iR1 = r1(40) / 4;
        layoutParams.setMargins(0, iR1, iR1, 0);
        return layoutParams;
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFullHtmlFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, viewGroup, bundle);
        if (!this.f9525U && viewOnCreateView != null) {
            ViewCompat.setOnApplyWindowInsetsListener(viewOnCreateView, new c(new C0165x(20), 9));
        }
        return viewOnCreateView;
    }
}
