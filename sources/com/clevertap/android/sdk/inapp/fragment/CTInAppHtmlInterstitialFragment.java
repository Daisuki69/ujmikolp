package com.clevertap.android.sdk.inapp.fragment;

import A7.c;
import Bj.C0165x;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class CTInAppHtmlInterstitialFragment extends CTInAppBaseFullHtmlFragment {
    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFullHtmlFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, viewGroup, bundle);
        if (!this.f9525U && viewOnCreateView != null) {
            ViewCompat.setOnApplyWindowInsetsListener(viewOnCreateView, new c(new C0165x(24), 9));
        }
        return viewOnCreateView;
    }
}
