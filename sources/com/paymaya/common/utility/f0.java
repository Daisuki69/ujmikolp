package com.paymaya.common.utility;

import android.view.View;
import com.paymaya.adkit.presentation.verticalbannerad.view.VerticalBannerAd;
import o5.C1966e;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11197a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11198b;
    public final /* synthetic */ Object c;

    public f0(VerticalBannerAd verticalBannerAd, C1966e c1966e) {
        this.f11198b = verticalBannerAd;
        this.c = c1966e;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14) {
        switch (this.f11197a) {
            case 0:
                String str = (String) this.f11198b;
                h0 h0Var = (h0) this.c;
                h0Var.a(i6, i10, str);
                h0Var.f11208a.removeOnLayoutChangeListener(this);
                int i15 = 0;
                while (true) {
                    View[] viewArr = h0Var.c;
                    if (i15 < viewArr.length) {
                        viewArr[i15].setVisibility(h0Var.f11210d[i15]);
                        i15++;
                    }
                    break;
                }
                break;
            default:
                kotlin.jvm.internal.j.g(view, "view");
                view.removeOnLayoutChangeListener(this);
                VerticalBannerAd verticalBannerAd = (VerticalBannerAd) this.f11198b;
                int iA = VerticalBannerAd.a(verticalBannerAd, view);
                VerticalBannerAd.b(verticalBannerAd, iA, (int) (((double) iA) / 0.5625d), (C1966e) this.c);
                break;
        }
    }

    public f0(h0 h0Var, String str) {
        this.c = h0Var;
        this.f11198b = str;
    }
}
