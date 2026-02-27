package m5;

import Bj.B0;
import Bj.E;
import Bj.H;
import Bj.U;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.paymaya.R;
import j5.AbstractC1670b;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.j;
import n5.C1927d;
import n5.C1928e;
import n5.C1929f;
import s5.l;

/* JADX INFO: renamed from: m5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1847a extends AbstractC1670b {
    public s5.f i;
    public C1928e j;

    @Override // j5.AbstractC1670b
    public final ViewModelProvider.Factory a() {
        Context applicationContext = b().getApplicationContext();
        j.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        X4.a aVar = (X4.a) this.h.getValue();
        l lVar = l.f20024a;
        return new C1929f((Application) applicationContext, aVar);
    }

    @Override // j5.AbstractC1670b
    public final Class c() {
        return C1928e.class;
    }

    @Override // j5.AbstractC1670b
    public final void e(ViewModel viewModel) {
        int i;
        int i4 = 2;
        C1928e viewModel2 = (C1928e) viewModel;
        j.g(viewModel2, "viewModel");
        this.j = viewModel2;
        s5.f fVar = this.i;
        if (fVar == null) {
            j.n("adPlacement");
            throw null;
        }
        LifecycleOwner lifecycleOwner = this.f17716b;
        if (lifecycleOwner == null) {
            j.n("lifecycleOwner");
            throw null;
        }
        Activity activityB = b();
        g gVar = new g(viewModel2, fVar, lifecycleOwner, activityB, this.f17717d, this.e, this.f);
        C1852f c1852f = new C1852f();
        if (c1852f.f18384a) {
            Log.d("MayaAdKit/InterstitialAdView", "Interstitial ad is already loading, skipping...");
            return;
        }
        if (System.currentTimeMillis() - C1852f.f18383d < 500) {
            return;
        }
        c1852f.f18384a = true;
        WeakReference weakReference = new WeakReference(activityB);
        c1852f.f18385b = weakReference;
        Activity activity = (Activity) weakReference.get();
        if (activity == null) {
            return;
        }
        switch (fVar.ordinal()) {
            case 0:
                i = R.string.interstitial_ad_unit_id_wallet_dashboard;
                break;
            case 1:
                i = R.string.interstitial_ad_unit_id_services_dashboard;
                break;
            case 2:
                i = R.string.interstitial_ad_unit_id_savings_dashboard;
                break;
            case 3:
                i = R.string.interstitial_ad_unit_id_easy_credit;
                break;
            case 4:
                i = R.string.interstitial_ad_unit_id_icl;
                break;
            case 5:
                i = R.string.interstitial_ad_unit_id_pms_internal_view;
                break;
            case 6:
                i = R.string.interstitial_ad_unit_id_bank_transfer_list;
                break;
            case 7:
                i = R.string.interstitial_ad_unit_id_send_money;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String string = activity.getResources().getString(i);
        j.f(string, "getString(...)");
        MutableLiveData mutableLiveData = viewModel2.e;
        mutableLiveData.removeObservers(lifecycleOwner);
        mutableLiveData.observe(lifecycleOwner, new f5.c(i4, new C7.f(24, c1852f, gVar)));
        lifecycleOwner.getLifecycle().addObserver(new androidx.navigation.a(c1852f, 3));
        B0 b02 = viewModel2.f;
        if (b02 != null) {
            b02.b(null);
        }
        E viewModelScope = ViewModelKt.getViewModelScope(viewModel2);
        viewModel2.c.getClass();
        Ij.e eVar = U.f603a;
        viewModel2.f = H.w(viewModelScope, Ij.d.f2362a, null, new C1927d(viewModel2, string, fVar, null), 2);
    }
}
