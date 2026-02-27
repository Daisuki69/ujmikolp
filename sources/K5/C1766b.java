package k5;

import Bj.B0;
import Bj.E;
import Bj.H;
import Bj.U;
import C7.f;
import Ij.d;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.paymaya.R;
import com.paymaya.adkit.presentation.inlinebannerad.view.InlineBannerAd;
import f5.c;
import j5.AbstractC1670b;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.j;
import l5.g;
import l5.k;
import s5.AbstractC2238b;
import s5.e;
import s5.l;

/* JADX INFO: renamed from: k5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1766b extends AbstractC1670b {
    public InlineBannerAd i;
    public e j;

    @Override // j5.AbstractC1670b
    public final ViewModelProvider.Factory a() {
        Context applicationContext = b().getApplicationContext();
        j.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        X4.a aVar = (X4.a) this.h.getValue();
        l lVar = l.f20024a;
        return new l5.l((Application) applicationContext, aVar);
    }

    @Override // j5.AbstractC1670b
    public final Class c() {
        return k.class;
    }

    @Override // j5.AbstractC1670b
    public final void e(ViewModel viewModel) {
        k viewModel2 = (k) viewModel;
        j.g(viewModel2, "viewModel");
        e eVar = this.j;
        if (eVar == null) {
            j.n("adPlacement");
            throw null;
        }
        LifecycleOwner lifecycleOwner = this.f17716b;
        if (lifecycleOwner == null) {
            j.n("lifecycleOwner");
            throw null;
        }
        Activity activityB = b();
        C1765a c1765a = new C1765a(viewModel2, eVar, lifecycleOwner, activityB, this.f17717d, this.e, this.f);
        InlineBannerAd inlineBannerAd = this.i;
        if (inlineBannerAd == null) {
            j.n("parent");
            throw null;
        }
        inlineBannerAd.f10223b = viewModel2;
        inlineBannerAd.c = lifecycleOwner;
        new WeakReference(activityB);
        Context context = (Context) inlineBannerAd.f10224d.get();
        if (context == null) {
            return;
        }
        if (!(context instanceof ViewModelStoreOwner)) {
            Log.e("MayaAdKit/InlineBannerAd", "Context must implement ViewModelStoreOwner for ViewModel.");
            return;
        }
        k kVar = inlineBannerAd.f10223b;
        if (kVar == null) {
            j.n("viewModel");
            throw null;
        }
        MutableLiveData mutableLiveData = kVar.f18245d;
        LifecycleOwner lifecycleOwner2 = inlineBannerAd.c;
        if (lifecycleOwner2 == null) {
            j.n("lifecycleOwner");
            throw null;
        }
        mutableLiveData.observe(lifecycleOwner2, new c(1, new f(23, inlineBannerAd, c1765a)));
        if (AbstractC2238b.f20005b[eVar.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        String string = context.getResources().getString(R.string.inline_banner_ad_unit_id_pms_internal_view);
        j.f(string, "getString(...)");
        Log.d("InlineBannerAd", "Starting to load inline banner ad with ad unit id: ".concat(string));
        k kVar2 = inlineBannerAd.f10223b;
        if (kVar2 == null) {
            j.n("viewModel");
            throw null;
        }
        kVar2.c.postValue(g.f18238a);
        kVar2.f18246g = eVar;
        B0 b02 = kVar2.e;
        if (b02 != null) {
            b02.b(null);
        }
        E viewModelScope = ViewModelKt.getViewModelScope(kVar2);
        kVar2.f18244b.getClass();
        Ij.e eVar2 = U.f603a;
        kVar2.e = H.w(viewModelScope, d.f2362a, null, new l5.j(kVar2, string, null), 2);
    }
}
