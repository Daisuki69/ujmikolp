package com.clevertap.android.sdk.inapp.fragment;

import D.C0182o;
import D.C0187u;
import D.S;
import G5.x;
import N.d;
import N.n;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.impl.a;
import kotlin.jvm.internal.j;
import zj.o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CTInAppBasePartialHtmlFragment extends CTInAppBasePartialFragment implements View.OnTouchListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public GestureDetector f9527U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public d f9528V;

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        j.g(context, "context");
        super.onAttach(context);
        this.f9527U = new GestureDetector(context, new x(this, 1));
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        j.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        x1();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        try {
            View viewW1 = w1(inflater, viewGroup);
            ViewGroup viewGroupV1 = v1(viewW1);
            Context context = inflater.getContext();
            j.f(context, "getContext(...)");
            d dVar = new d(context, p1().f9491c0, p1().f9476P, p1().f9493d0, p1().f9477Q, p1().f9478R);
            this.f9528V = dVar;
            dVar.setWebViewClient(new n(this));
            dVar.setOnTouchListener(this);
            dVar.setOnLongClickListener(this);
            if (p1().f9482V) {
                dVar.setJavaScriptInterface(new C0182o(C0187u.j(getActivity(), o1()), this));
            }
            if (viewGroupV1 != null) {
                viewGroupV1.addView(dVar);
            }
            return viewW1;
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
            d dVar = this.f9528V;
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
            this.f9528V = null;
        } catch (Exception e) {
            o1().c().getClass();
            S.r("cleanupWebView -> there was a crash in cleanup", e);
        }
        super.onDestroyView();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent event) {
        j.g(event, "event");
        GestureDetector gestureDetector = this.f9527U;
        if (gestureDetector != null) {
            return gestureDetector.onTouchEvent(event) || event.getAction() == 2;
        }
        j.n("gd");
        throw null;
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        x1();
    }

    public abstract ViewGroup v1(View view);

    public abstract View w1(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public final void x1() {
        d dVar = this.f9528V;
        if (dVar == null) {
            return;
        }
        dVar.a();
        Point point = dVar.f3458g;
        int i = point.y;
        int i4 = point.x;
        float f = getResources().getDisplayMetrics().density;
        int i6 = (int) (i / f);
        int i10 = (int) (i4 / f);
        String str = p1().f9480T;
        if (str == null) {
            return;
        }
        String strH = a.h("<style>body{width: ", i10, "px; height: ", i6, "px; margin: 0; padding:0;}</style>");
        String strH2 = new o("<head>").h(str, "<head>" + strH);
        S.l("Density appears to be " + f);
        dVar.setInitialScale((int) (f * ((float) 100)));
        dVar.loadDataWithBaseURL(null, strH2, "text/html", "utf-8", null);
    }
}
