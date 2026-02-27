package com.clevertap.android.sdk.inapp.fragment;

import D.C0182o;
import D.C0187u;
import D.S;
import N.d;
import N.n;
import S.b;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import androidx.camera.core.impl.a;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.paymaya.R;
import kotlin.jvm.internal.j;
import zj.o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CTInAppBaseFullHtmlFragment extends CTInAppBaseFullFragment {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public d f9524T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f9525U;

    public RelativeLayout.LayoutParams F1(int i) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(2, i);
        layoutParams.addRule(1, i);
        int i4 = -(r1(40) / 2);
        layoutParams.setMargins(i4, 0, 0, i4);
        return layoutParams;
    }

    public final void G1() {
        d dVar = this.f9524T;
        if (dVar == null) {
            return;
        }
        dVar.setFullscreen(this.f9525U);
        dVar.a();
        String str = p1().f9508y;
        if (str != null && str.length() != 0) {
            dVar.setWebViewClient(new WebViewClient());
            dVar.loadUrl(str);
            return;
        }
        Point point = dVar.f3458g;
        int i = point.y;
        int i4 = point.x;
        float f = getResources().getDisplayMetrics().density;
        int i6 = (int) (i / f);
        int i10 = (int) (i4 / f);
        String str2 = p1().f9480T;
        if (str2 == null) {
            return;
        }
        String strH = a.h("<style>body{width: ", i10, "px; height: ", i6, "px; margin: 0; padding:0;}</style>");
        String strH2 = new o("<head>").h(str2, "<head>" + strH);
        S.l("Density appears to be " + f);
        dVar.setInitialScale((int) (f * ((float) 100)));
        dVar.loadDataWithBaseURL(null, strH2, "text/html", "utf-8", null);
    }

    public final void H1() {
        Window window;
        WindowManager.LayoutParams attributes;
        FragmentActivity activity = getActivity();
        this.f9525U = ((activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? 0 : attributes.flags & 1024) != 0;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        j.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        H1();
        G1();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        H1();
        try {
            View viewInflate = inflater.inflate(R.layout.inapp_html_full, viewGroup, false);
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.inapp_html_full_relative_layout);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            char c = p1().f9485Y;
            if (c == 't') {
                layoutParams.addRule(10);
            } else if (c == 'l') {
                layoutParams.addRule(9);
            } else if (c == 'b') {
                layoutParams.addRule(12);
            } else if (c == 'r') {
                layoutParams.addRule(11);
            } else if (c == 'c') {
                layoutParams.addRule(13);
            }
            layoutParams.setMargins(0, 0, 0, 0);
            Context contextRequireContext = requireContext();
            j.f(contextRequireContext, "requireContext(...)");
            d dVar = new d(contextRequireContext, p1().f9491c0, p1().f9476P, p1().f9493d0, p1().f9477Q, -1.0d);
            dVar.setFullscreen(this.f9525U);
            this.f9524T = dVar;
            dVar.setWebViewClient(new n(this));
            if (p1().f9482V) {
                dVar.setJavaScriptInterface(new C0182o(C0187u.j(getActivity(), o1()), this));
            }
            if (p1().f9474B) {
                relativeLayout.setBackground(new ColorDrawable(-1157627904));
            } else {
                relativeLayout.setBackground(new ColorDrawable(0));
            }
            relativeLayout.addView(dVar, layoutParams);
            if (p1().f9486Z) {
                Context context = inflater.getContext();
                CloseImageView closeImageView = new CloseImageView(context);
                RelativeLayout.LayoutParams layoutParamsF1 = F1(dVar.getId());
                closeImageView.setOnClickListener(new b(this, 0));
                closeImageView.setContentDescription(context.getString(R.string.ct_inapp_close_btn));
                this.f9521Q = closeImageView;
                relativeLayout.addView(closeImageView, layoutParamsF1);
            }
            return viewInflate;
        } catch (Throwable th2) {
            S sC = o1().c();
            String str = o1().f9439a;
            sC.getClass();
            S.t(str, "Fragment view not created", th2);
            return null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        try {
            d dVar = this.f9524T;
            if (dVar != null) {
                boolean z4 = p1().f9482V;
                dVar.removeAllViews();
                dVar.destroyDrawingCache();
                dVar.loadUrl("about:blank");
                if (z4) {
                    dVar.removeJavascriptInterface("CleverTap");
                }
                dVar.clearHistory();
                dVar.destroy();
            }
            this.f9524T = null;
        } catch (Exception e) {
            o1().c().getClass();
            S.r("cleanupWebView -> there was a crash in cleanup", e);
        }
        super.onDestroyView();
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        G1();
    }
}
