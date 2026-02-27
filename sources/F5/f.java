package f5;

import Bj.B0;
import Bj.E;
import Bj.H;
import Bj.U;
import a.AbstractC0617a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.media3.common.C;
import b5.C0909a;
import b5.C0912d;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1110A;
import cj.C1129o;
import cj.C1132s;
import cj.t;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import g5.C1501a;
import i5.h;
import i5.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import s5.l;
import x5.C2467a;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BannerAdCarousel f16716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s5.d f16717b;
    public LifecycleOwner c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FragmentActivity f16718d;
    public Fragment e;
    public Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Float f16719g;
    public Integer h;
    public Integer i;
    public Function1 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Function1 f16720k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Function2 f16721l;
    public final InterfaceC1033d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC1033d f16722n;

    public f(BannerAdCarousel parent) {
        j.g(parent, "parent");
        this.f16716a = parent;
        final int i = 0;
        this.m = C1034e.b(new Function0(this) { // from class: f5.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f16715b;

            {
                this.f16715b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        FragmentActivity fragmentActivity = this.f16715b.f16718d;
                        if (fragmentActivity != null) {
                            return new Y4.d(fragmentActivity);
                        }
                        j.n("activity");
                        throw null;
                    default:
                        return new X4.a((Y4.d) this.f16715b.m.getValue());
                }
            }
        });
        final int i4 = 1;
        this.f16722n = C1034e.b(new Function0(this) { // from class: f5.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f16715b;

            {
                this.f16715b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        FragmentActivity fragmentActivity = this.f16715b.f16718d;
                        if (fragmentActivity != null) {
                            return new Y4.d(fragmentActivity);
                        }
                        j.n("activity");
                        throw null;
                    default:
                        return new X4.a((Y4.d) this.f16715b.m.getValue());
                }
            }
        });
    }

    public final void a() {
        int i;
        int i4 = 0;
        C2467a c2467a = AbstractC0617a.f6973b;
        if (c2467a != null ? S5.c.b(c2467a.c, A5.b.g1) : false) {
            FragmentActivity fragmentActivity = this.f16718d;
            if (fragmentActivity == null) {
                j.n("activity");
                throw null;
            }
            Context applicationContext = fragmentActivity.getApplicationContext();
            j.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
            X4.a aVar = (X4.a) this.f16722n.getValue();
            l lVar = l.f20024a;
            m mVar = new m((Application) applicationContext, aVar, AbstractC0617a.f6973b);
            ViewModelStoreOwner viewModelStoreOwner = this.e;
            if (viewModelStoreOwner == null && (viewModelStoreOwner = this.f16718d) == null) {
                j.n("activity");
                throw null;
            }
            i5.l lVar2 = (i5.l) new ViewModelProvider(viewModelStoreOwner, mVar).get(i5.l.class);
            s5.d dVar = this.f16717b;
            if (dVar == null) {
                j.n("adPlacement");
                throw null;
            }
            LifecycleOwner lifecycleOwner = this.c;
            if (lifecycleOwner == null) {
                j.n("lifecycleOwner");
                throw null;
            }
            FragmentActivity fragmentActivity2 = this.f16718d;
            if (fragmentActivity2 == null) {
                j.n("activity");
                throw null;
            }
            Long l6 = this.f;
            Float f = this.f16719g;
            Integer num = this.h;
            Integer num2 = this.i;
            Function1 function1 = this.j;
            Function1 function12 = this.f16720k;
            Function2 function2 = this.f16721l;
            g gVar = new g(lVar2, dVar, lifecycleOwner, fragmentActivity2, l6, f, num, num2, function1, function12, function2);
            BannerAdCarousel bannerAdCarousel = this.f16716a;
            bannerAdCarousel.getClass();
            bannerAdCarousel.f10216b = lVar2;
            bannerAdCarousel.f10217d = lifecycleOwner;
            bannerAdCarousel.f10218g = new WeakReference(fragmentActivity2);
            bannerAdCarousel.f10220l = num;
            bannerAdCarousel.m = num2;
            Context context = (Context) bannerAdCarousel.h.get();
            if (context == null) {
                Log.e("MayaAdKit/BannerAdCarousel", "Cannot load ads. Context is null.");
                return;
            }
            bannerAdCarousel.j = l6 != null ? l6.longValue() : C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
            bannerAdCarousel.f = function12;
            WeakReference weakReference = bannerAdCarousel.f10218g;
            C1501a c1501a = new C1501a(new ArrayList(), f, new com.squareup.wire.internal.a(weakReference != null ? (Activity) weakReference.get() : null, 6), function1);
            bannerAdCarousel.c = c1501a;
            bannerAdCarousel.f10215a.setAdapter(c1501a);
            if (!(context instanceof ViewModelStoreOwner)) {
                Log.e("MayaAdKit/BannerAdCarousel", "Context must implement ViewModelStoreOwner for ViewModel.");
                if (function2 != null) {
                    function2.invoke("", new C0909a(-1, "Context must implement ViewModelStoreOwner for ViewModel.", ""));
                    return;
                }
                return;
            }
            i5.l lVar3 = bannerAdCarousel.f10216b;
            if (lVar3 == null) {
                j.n("viewModel");
                throw null;
            }
            lVar3.b();
            i5.l lVar4 = bannerAdCarousel.f10216b;
            if (lVar4 == null) {
                j.n("viewModel");
                throw null;
            }
            MutableLiveData mutableLiveData = lVar4.f;
            LifecycleOwner lifecycleOwner2 = bannerAdCarousel.f10217d;
            if (lifecycleOwner2 == null) {
                j.n("lifecycleOwner");
                throw null;
            }
            mutableLiveData.observe(lifecycleOwner2, new c(i4, new C7.f(17, bannerAdCarousel, gVar)));
            i5.l lVar5 = bannerAdCarousel.f10216b;
            if (lVar5 == null) {
                j.n("viewModel");
                throw null;
            }
            MutableLiveData mutableLiveData2 = lVar5.e;
            mutableLiveData2.postValue(i5.e.f17102a);
            Context applicationContext2 = lVar5.getApplication().getApplicationContext();
            lVar5.m = dVar;
            j.d(applicationContext2);
            lVar5.f17115b.getClass();
            switch (dVar.ordinal()) {
                case 0:
                    i = R.array.carousel_ad_unit_id_wallet_dashboard;
                    break;
                case 1:
                    i = R.array.carousel_ad_unit_id_bills_pay_landing_page;
                    break;
                case 2:
                    i = R.array.carousel_ad_unit_id_cash_in_landing_page;
                    break;
                case 3:
                    i = R.array.carousel_ad_unit_id_send_money;
                    break;
                case 4:
                    i = R.array.carousel_ad_unit_id_services_page;
                    break;
                case 5:
                    i = R.array.carousel_ad_unit_id_shop_landing_page;
                    break;
                case 6:
                    i = R.array.carousel_ad_unit_id_easy_credit;
                    break;
                case 7:
                    i = R.array.carousel_ad_unit_id_pms_internal_view;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            String[] stringArray = applicationContext2.getResources().getStringArray(i);
            j.f(stringArray, "getStringArray(...)");
            List listZ = C1129o.z(stringArray);
            lVar5.h = listZ;
            if (listZ.isEmpty()) {
                mutableLiveData2.postValue(i5.d.f17101a);
                return;
            }
            List list = lVar5.h;
            ArrayList arrayList = new ArrayList(t.l(list, 10));
            for (Object obj : list) {
                int i6 = i4 + 1;
                if (i4 < 0) {
                    C1132s.k();
                    throw null;
                }
                arrayList.add(new C0912d(androidx.media3.datasource.cache.c.h(i4, (String) obj, Global.HYPHEN), null, null));
                i4 = i6;
            }
            lVar5.f17120n = C1110A.W(arrayList);
            lVar5.j.clear();
            lVar5.i.clear();
            lVar5.f17118k.clear();
            B0 b02 = lVar5.f17117g;
            if (b02 != null) {
                b02.b(null);
            }
            E viewModelScope = ViewModelKt.getViewModelScope(lVar5);
            lVar5.f17116d.getClass();
            Ij.e eVar = U.f603a;
            lVar5.f17117g = H.w(viewModelScope, Ij.d.f2362a, null, new h(lVar5, null), 2);
        }
    }
}
