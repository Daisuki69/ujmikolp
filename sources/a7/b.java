package A7;

import Kh.C0310o;
import Kh.I;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.TextView;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.domain.model.SecondaryFeature;
import com.paymaya.domain.model.User;
import com.paymaya.domain.store.AbstractC1259g;
import com.paymaya.domain.store.C1263i;
import com.paymaya.domain.store.C1265j;
import com.paymaya.domain.store.C1269l;
import com.paymaya.domain.store.C1288v;
import com.paymaya.domain.store.C1290w;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.C1297z0;
import com.paymaya.domain.store.E;
import com.paymaya.domain.store.I0;
import com.paymaya.domain.store.L0;
import com.paymaya.domain.store.T;
import com.paymaya.domain.store.V;
import com.paymaya.domain.store.W;
import com.paymaya.domain.store.a1;
import com.paymaya.domain.store.b1;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycUpdateOtherIdsActivity;
import java.io.Serializable;
import o1.AbstractC1955a;
import org.joda.time.LocalDateTime;
import org.joda.time.Years;
import retrofit2.Response;
import w.C2360b;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f196d;
    public final C1290w e;
    public final b1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1269l f197g;
    public final W h;
    public final C1265j i;
    public final L0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final E f198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final I0 f199l;
    public final C1297z0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C1293x0 f200n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final A5.m f201o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Uh.d f202p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final S5.c f203q;

    public b(com.paymaya.data.preference.a mPreference, C1290w c1290w, b1 b1Var, C1269l c1269l, W w6, C1265j c1265j, L0 l02, E e, I0 i02, C1297z0 c1297z0, C1293x0 c1293x0, A5.m mFlagConfigurationLifecycleHandler, Uh.d mPushNotificationPublishSubject, S5.c mFlagConfigurationService) {
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(mFlagConfigurationLifecycleHandler, "mFlagConfigurationLifecycleHandler");
        kotlin.jvm.internal.j.g(mPushNotificationPublishSubject, "mPushNotificationPublishSubject");
        kotlin.jvm.internal.j.g(mFlagConfigurationService, "mFlagConfigurationService");
        this.f196d = mPreference;
        this.e = c1290w;
        this.f = b1Var;
        this.f197g = c1269l;
        this.h = w6;
        this.i = c1265j;
        this.j = l02;
        this.f198k = e;
        this.f199l = i02;
        this.m = c1297z0;
        this.f200n = c1293x0;
        this.f201o = mFlagConfigurationLifecycleHandler;
        this.f202p = mPushNotificationPublishSubject;
        this.f203q = mFlagConfigurationService;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        int i = 0;
        int i4 = 1;
        super.j();
        MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) ((B7.a) this.c.get());
        mayaDashboardActivity.getClass();
        e(AbstractC1955a.m(mayaDashboardActivity).e(zh.b.a()).f());
        C1290w c1290w = this.e;
        Ah.p<Response<Void>> countryHead = c1290w.c.getCountryHead();
        C1288v c1288v = new C1288v(c1290w, i);
        I i6 = Eh.d.f1366d;
        countryHead.getClass();
        countryHead.f(new Gh.d(1, c1288v, i6));
        b1 b1Var = this.f;
        Ah.p<Response<Void>> validationsHead = b1Var.c.getValidationsHead();
        a1 a1Var = new a1(b1Var, i);
        validationsHead.getClass();
        validationsHead.f(new Gh.d(1, a1Var, i6));
        W w6 = this.h;
        Ah.p<Response<Void>> formSeriesHead = w6.f11401b.getFormSeriesHead();
        V v7 = new V(w6, i);
        formSeriesHead.getClass();
        formSeriesHead.f(new Gh.d(1, v7, i6));
        e(this.f198k.c().e());
        L0 l02 = this.j;
        Ah.p<Response<Void>> shopCategoriesV3Head = l02.c.getShopCategoriesV3Head();
        T t5 = new T(l02, 2);
        shopCategoriesV3Head.getClass();
        e(new Lh.f(shopCategoriesV3Head, t5, i).e());
        this.f197g.c().e();
        String dataString = ((MayaDashboardActivity) ((B7.a) this.c.get())).getIntent().getDataString();
        if (dataString != null && !C2576A.H(dataString) && C.Y(dataString)) {
            l(dataString);
        }
        e(new C0310o(this.f202p.e(zh.b.a()).c(C0103a.f193b), new C2360b(this, i4), Eh.d.c, Eh.d.f1365b).f());
        Bundle extras = ((MayaDashboardActivity) ((B7.a) this.c.get())).getIntent().getExtras();
        if (extras != null ? extras.getBoolean("upgrade_bottom_sheet") : false) {
            B7.a aVar = (B7.a) this.c.get();
            Bundle extras2 = ((MayaDashboardActivity) ((B7.a) this.c.get())).getIntent().getExtras();
            Serializable serializable = extras2 != null ? extras2.getSerializable("upgrade_bottom_sheet_module") : null;
            kotlin.jvm.internal.j.e(serializable, "null cannot be cast to non-null type com.paymaya.common.utility.AnalyticsEvent.MODULE");
            ((MayaDashboardActivity) aVar).t2((EnumC1215d) serializable, null);
            Bundle extras3 = ((MayaDashboardActivity) ((B7.a) this.c.get())).getIntent().getExtras();
            if (extras3 != null) {
                extras3.putBoolean("upgrade_bottom_sheet", false);
            }
            Bundle extras4 = ((MayaDashboardActivity) ((B7.a) this.c.get())).getIntent().getExtras();
            if (extras4 != null) {
                extras4.putSerializable("upgrade_bottom_sheet_module", null);
            }
        }
        androidx.camera.core.impl.a.A(this.f196d.f11330b, "key_rekyc_nudge_shown", false);
        if (S5.c.b(this.f203q, A5.b.f144x)) {
            ImageView imageView = ((MayaDashboardActivity) ((B7.a) this.c.get())).f12143p;
            if (imageView == null) {
                kotlin.jvm.internal.j.n("servicesIcon");
                throw null;
            }
            imageView.setVisibility(8);
            TextView textView = ((MayaDashboardActivity) ((B7.a) this.c.get())).f12144q;
            if (textView == null) {
                kotlin.jvm.internal.j.n("servicesText");
                throw null;
            }
            textView.setVisibility(8);
        } else {
            ImageView imageView2 = ((MayaDashboardActivity) ((B7.a) this.c.get())).f12143p;
            if (imageView2 == null) {
                kotlin.jvm.internal.j.n("servicesIcon");
                throw null;
            }
            imageView2.setVisibility(0);
        }
        if (S5.c.b(this.f203q, A5.b.f85W0) && this.f196d.f11330b.getBoolean("key_t2p_show_tooltip", true)) {
            MayaDashboardActivity mayaDashboardActivity2 = (MayaDashboardActivity) ((B7.a) this.c.get());
            C1220i c1220iK1 = mayaDashboardActivity2.k1();
            C1219h c1219hE = C1219h.e("TAP_TO_PAY_TOOLTIP_APPEAR");
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("destination_page", "Dashboard");
            c1220iK1.c(mayaDashboardActivity2, c1219hE);
            MayaDashboardActivity mayaDashboardActivity3 = (MayaDashboardActivity) ((B7.a) this.c.get());
            mayaDashboardActivity3.getClass();
            new Handler(Looper.getMainLooper()).postDelayed(new C7.a(mayaDashboardActivity3, 1), 1000L);
        }
    }

    public final void k() {
        if (this.f196d.I()) {
            MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) ((B7.a) this.c.get());
            mayaDashboardActivity.startActivity(mayaDashboardActivity.n1().o0(mayaDashboardActivity));
        } else {
            MayaDashboardActivity mayaDashboardActivity2 = (MayaDashboardActivity) ((B7.a) this.c.get());
            mayaDashboardActivity2.n1().f367a.e0("");
            mayaDashboardActivity2.startActivity(new Intent(mayaDashboardActivity2, (Class<?>) MayaKycUpdateOtherIdsActivity.class));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0f08  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 4112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.b.l(java.lang.String):void");
    }

    public final boolean m(SecondaryFeature secondaryFeature) {
        String strMBirthDate;
        User userJ = this.f200n.j();
        AbstractC1259g abstractC1259gMAgeRestricted = secondaryFeature != null ? secondaryFeature.mAgeRestricted() : null;
        if (abstractC1259gMAgeRestricted == null) {
            return false;
        }
        if (!n() || (strMBirthDate = userJ.mBirthDate()) == null || C2576A.H(strMBirthDate)) {
            return true;
        }
        Integer num = ((C1263i) abstractC1259gMAgeRestricted).f11447a;
        return (num != null ? num.intValue() : 21) > Years.yearsBetween(LocalDateTime.parse(userJ.mBirthDate(), AbstractC1234x.f11252k), LocalDateTime.now()).getYears();
    }

    public final boolean n() {
        return kotlin.jvm.internal.j.b(this.f196d.l(), "kyc1");
    }

    public final boolean o() {
        if (!n()) {
            return false;
        }
        String strX = this.f196d.x();
        kotlin.jvm.internal.j.f(strX, "getReKYCStatus(...)");
        return strX.equals("rejected") || strX.equals("tagged");
    }

    public final void p() {
        ((MayaDashboardActivity) ((B7.a) this.c.get())).m2(C.c("https://support.maya.ph/s/", this.f196d.r(), this.f196d.u(), this.i.a()));
    }
}
