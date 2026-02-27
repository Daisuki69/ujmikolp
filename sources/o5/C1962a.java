package o5;

import a.AbstractC0617a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import b5.p;
import com.paymaya.adkit.presentation.verticalbannerad.view.VerticalBannerAd;
import com.paymaya.common.utility.f0;
import j5.AbstractC1670b;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.j;
import r5.n;
import s5.l;
import s5.m;

/* JADX INFO: renamed from: o5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1962a extends AbstractC1670b {
    public VerticalBannerAd i;
    public m j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p f18773k;

    @Override // j5.AbstractC1670b
    public final ViewModelProvider.Factory a() {
        Context applicationContext = b().getApplicationContext();
        j.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        X4.a aVar = (X4.a) this.h.getValue();
        l lVar = l.f20024a;
        return new n((Application) applicationContext, aVar, AbstractC0617a.f6973b);
    }

    @Override // j5.AbstractC1670b
    public final Class c() {
        return r5.m.class;
    }

    @Override // j5.AbstractC1670b
    public final void e(ViewModel viewModel) {
        r5.m viewModel2 = (r5.m) viewModel;
        j.g(viewModel2, "viewModel");
        m mVar = this.j;
        if (mVar == null) {
            j.n("adPlacement");
            throw null;
        }
        LifecycleOwner lifecycleOwner = this.f17716b;
        if (lifecycleOwner == null) {
            j.n("lifecycleOwner");
            throw null;
        }
        Activity activityB = b();
        p pVar = this.f18773k;
        if (pVar == null) {
            j.n("header");
            throw null;
        }
        C1966e c1966e = new C1966e(viewModel2, mVar, lifecycleOwner, activityB, pVar, this.f17717d, this.e, this.f);
        VerticalBannerAd verticalBannerAd = this.i;
        if (verticalBannerAd == null) {
            j.n("parent");
            throw null;
        }
        verticalBannerAd.c = viewModel2;
        verticalBannerAd.e = lifecycleOwner;
        new WeakReference(activityB);
        if (!ViewCompat.isLaidOut(verticalBannerAd) || verticalBannerAd.isLayoutRequested()) {
            verticalBannerAd.addOnLayoutChangeListener(new f0(verticalBannerAd, c1966e));
        } else {
            int iA = VerticalBannerAd.a(verticalBannerAd, verticalBannerAd);
            VerticalBannerAd.b(verticalBannerAd, iA, (int) (((double) iA) / 0.5625d), c1966e);
        }
    }
}
