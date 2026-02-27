package L9;

import Kh.T;
import L9.C0323a;
import M8.T2;
import Q9.InterfaceC0573c;
import Rb.j;
import android.app.KeyguardManager;
import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import ba.C0930a;
import ba.C0931b;
import ba.C0932c;
import ba.C0933d;
import ba.C0934e;
import ba.C0935f;
import ba.C0936g;
import bg.AbstractC0983W;
import cj.M;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.data.database.repository.C1243g;
import com.paymaya.domain.model.BillerCategory;
import com.paymaya.domain.model.Consent;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PayMayaErrorAction;
import com.paymaya.domain.store.C1247a;
import com.paymaya.domain.store.C1249b;
import com.paymaya.domain.store.C1261h;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.domain.store.C1265j;
import com.paymaya.domain.store.C1271m;
import com.paymaya.domain.store.C1273n;
import com.paymaya.domain.store.C1277p;
import com.paymaya.domain.store.C1284t;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.J0;
import com.paymaya.domain.store.K;
import com.paymaya.domain.store.L;
import com.paymaya.domain.store.Q;
import com.paymaya.domain.store.S0;
import com.paymaya.domain.store.T0;
import com.paymaya.domain.store.U0;
import com.paymaya.domain.store.Z0;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.cryptocurrency.view.activity.impl.CryptocurrencyV2Activity;
import com.paymaya.mayaui.inboxsupport.view.activity.impl.MayaInboxSupportActivity;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditActivationAllSetEnhanceFragment;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersCategoryFragment;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import com.paymaya.mayaui.settings.view.fragment.impl.BaseMayaSettingsFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaAccountRecoveryFragment;
import com.paymaya.ui.common.view.activity.impl.FullScreenFlutterActivity;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import d4.AbstractC1331a;
import ga.InterfaceC1514a;
import ha.InterfaceC1549b;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.systemchannels.NavigationChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import p3.C2011b;
import s.AbstractC2217b;
import x7.InterfaceC2468a;
import y5.AbstractC2509a;
import y8.InterfaceC2515a;
import zj.C2576A;

/* JADX INFO: renamed from: L9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0323a extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2877d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f2878g;
    public final Object h;
    public final Object i;

    public C0323a(com.paymaya.data.preference.a aVar, S5.c cVar, C1293x0 c1293x0, C1265j c1265j, C1261h c1261h) {
        this.f2877d = 6;
        this.e = aVar;
        this.f = cVar;
        this.f2878g = c1293x0;
        this.h = c1265j;
        this.i = c1261h;
    }

    @Override // y5.AbstractC2509a
    public void j() {
        Intent intent;
        Intent intent2;
        DartExecutor dartExecutor;
        DartExecutor dartExecutor2;
        NavigationChannel navigationChannel;
        int i = 3;
        int i4 = 0;
        int i6 = 1;
        switch (this.f2877d) {
            case 1:
                super.j();
                BaseMayaSettingsFragment baseMayaSettingsFragment = (BaseMayaSettingsFragment) ((Rb.j) this.c.get());
                baseMayaSettingsFragment.getClass();
                TextView textView = baseMayaSettingsFragment.f13904r0;
                if (textView == null) {
                    kotlin.jvm.internal.j.n("mTextViewVersion");
                    throw null;
                }
                textView.setText(baseMayaSettingsFragment.getString(R.string.maya_format_maya_version, "2.153.0", "13435"));
                if (((com.paymaya.data.preference.a) this.i).e().isChangeMinEnabled()) {
                    Group group = ((BaseMayaSettingsFragment) ((Rb.j) this.c.get())).f13888a0;
                    if (group == null) {
                        kotlin.jvm.internal.j.n("mGroupChangeMobileNumberOption");
                        throw null;
                    }
                    group.setVisibility(0);
                } else {
                    Group group2 = ((BaseMayaSettingsFragment) ((Rb.j) this.c.get())).f13888a0;
                    if (group2 == null) {
                        kotlin.jvm.internal.j.n("mGroupChangeMobileNumberOption");
                        throw null;
                    }
                    group2.setVisibility(8);
                }
                Group group3 = ((BaseMayaSettingsFragment) ((Rb.j) this.c.get())).f13885X;
                if (group3 == null) {
                    kotlin.jvm.internal.j.n("mGroupDisplayNameOption");
                    throw null;
                }
                group3.setVisibility(0);
                if (((com.paymaya.data.preference.a) this.i).e().isInboxV4Enabled() && ((com.paymaya.data.preference.a) this.i).e().isInboxV4ManageNotifsEnabled()) {
                    Group group4 = ((BaseMayaSettingsFragment) ((Rb.j) this.c.get())).t0;
                    if (group4 == null) {
                        kotlin.jvm.internal.j.n("mGroupManageNotificationsOption");
                        throw null;
                    }
                    group4.setVisibility(0);
                } else {
                    Group group5 = ((BaseMayaSettingsFragment) ((Rb.j) this.c.get())).t0;
                    if (group5 == null) {
                        kotlin.jvm.internal.j.n("mGroupManageNotificationsOption");
                        throw null;
                    }
                    group5.setVisibility(8);
                }
                Sb.d dVar = ((BaseMayaSettingsFragment) ((Rb.j) this.c.get())).f13906v0;
                int iW = com.paymaya.common.utility.C.w(dVar != null ? ((MayaSettingsActivity) dVar).getIntent().getDataString() : null);
                if (iW == 0) {
                    return;
                }
                int iC = AbstractC2217b.c(iW);
                if (iC == 39) {
                    w();
                } else if (iC != 41) {
                    if (iC == 58) {
                        x();
                    } else if (iC == 59) {
                        o();
                    }
                } else if (((com.paymaya.data.preference.a) this.i).e().isChangeMinEnabled()) {
                    ((BaseMayaSettingsFragment) ((Rb.j) this.c.get())).L1();
                }
                BaseMayaSettingsFragment baseMayaSettingsFragment2 = (BaseMayaSettingsFragment) ((Rb.j) this.c.get());
                C1219h c1219hM1 = baseMayaSettingsFragment2.m1();
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hM1.j.put("from_deep_link", "true");
                FragmentActivity activity = baseMayaSettingsFragment2.getActivity();
                if (activity == null || (intent = activity.getIntent()) == null) {
                    return;
                }
                intent.setData(null);
                return;
            case 2:
                super.j();
                B5.m mVar = ((T6.a) ((S6.a) this.c.get())).f5797k;
                if (mVar == null) {
                    kotlin.jvm.internal.j.n("mSuspendSessionController");
                    throw null;
                }
                mVar.f378b.dispatcher().cancelAll();
                B5.m mVar2 = ((T6.a) ((S6.a) this.c.get())).f5797k;
                if (mVar2 == null) {
                    kotlin.jvm.internal.j.n("mSuspendSessionController");
                    throw null;
                }
                U0 u0 = mVar2.f379d;
                new Hh.g(new Hh.a(new Hh.f(u0.f11397b.suspendSession().a(new T0(u0, 1)).a(new A7.c(mVar2, i)), zh.b.a(), 0), new Q6.a(this, i4), 1), new Q6.g(this, 1), Eh.d.c, Eh.d.f1365b).c();
                return;
            case 3:
            default:
                super.j();
                return;
            case 4:
                super.j();
                C2011b c2011b = new C2011b(6);
                C1243g c1243g = ((C1273n) this.e).f11464d;
                try {
                    new Kh.z(c1243g.f11309a.d("biller_category", c2011b), new com.paymaya.data.database.repository.x(c1243g, i), 0).e(zh.b.a()).g(new Gh.e(0, new Gh.f(new C0936g(this, i6), Eh.d.f1366d), new C0935f(this, 1)));
                    m();
                    FragmentActivity activity2 = ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).getActivity();
                    p((activity2 == null || (intent2 = activity2.getIntent()) == null) ? null : intent2.getDataString(), null);
                    t();
                    return;
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th2) {
                    AbstractC0983W.G(th2);
                    E1.c.k(th2);
                    NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                    nullPointerException.initCause(th2);
                    throw nullPointerException;
                }
            case 5:
                super.j();
                CryptocurrencyV2Activity cryptocurrencyV2Activity = (CryptocurrencyV2Activity) ((InterfaceC2468a) this.c.get());
                cryptocurrencyV2Activity.getClass();
                FlutterEngine flutterEngine = FlutterEngineCache.getInstance().get("CRYPTO_V2_FLUTTER");
                if (flutterEngine != null && (dartExecutor = flutterEngine.getDartExecutor()) != null) {
                    dartExecutor.executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", "package:paymaya_module/main.dart", "runMayaCryptoV2"));
                }
                cryptocurrencyV2Activity.n1();
                Intent intentBuild = new FlutterActivity.CachedEngineIntentBuilder(FullScreenFlutterActivity.class, "CRYPTO_V2_FLUTTER").build(cryptocurrencyV2Activity);
                intentBuild.putExtra("engineId", "CRYPTO_V2_FLUTTER");
                cryptocurrencyV2Activity.startActivityForResult(intentBuild, 1200);
                return;
            case 6:
                super.j();
                MayaInboxSupportActivity mayaInboxSupportActivity = (MayaInboxSupportActivity) ((InterfaceC2515a) this.c.get());
                mayaInboxSupportActivity.getClass();
                FlutterEngine flutterEngine2 = FlutterEngineCache.getInstance().get("inboxSupportActivityEngine");
                String stringExtra = mayaInboxSupportActivity.getIntent().getStringExtra("intent");
                if (flutterEngine2 != null && (navigationChannel = flutterEngine2.getNavigationChannel()) != null) {
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    navigationChannel.setInitialRoute(stringExtra);
                }
                if (flutterEngine2 != null && (dartExecutor2 = flutterEngine2.getDartExecutor()) != null) {
                    dartExecutor2.executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", "package:paymaya_module/main.dart", "runChatSupportWithIntent"));
                }
                Map mapH = M.h(new Pair("route", "fullscreenFlowEntrypoint"), new Pair("messageTimestamp", null), new Pair("channelUrl", null), new Pair("payload", null));
                pg.u uVar = mayaInboxSupportActivity.f12417o;
                if (uVar != null) {
                    uVar.a("requestFullscreen", mapH, null);
                }
                FlutterFragment flutterFragmentBuild = FlutterFragment.withCachedEngine("inboxSupportActivityEngine").renderMode(RenderMode.texture).shouldAutomaticallyHandleOnBackPressed(true).build();
                mayaInboxSupportActivity.f12418p = flutterFragmentBuild;
                AbstractC1236z.g(mayaInboxSupportActivity, R.id.frame_layout_inbox_chat, flutterFragmentBuild);
                return;
        }
    }

    public void k() {
        ArrayList arrayList = ((T6.a) ((S6.a) this.c.get())).m;
        Ah.p pVar = arrayList.isEmpty() ? null : (Ah.p) arrayList.get(0);
        if (pVar == null) {
            return;
        }
        B5.m mVar = ((T6.a) ((S6.a) this.c.get())).f5797k;
        if (mVar == null) {
            kotlin.jvm.internal.j.n("mSuspendSessionController");
            throw null;
        }
        U0 u0 = mVar.f379d;
        new Hh.g(new Hh.a(new Hh.f(u0.f11397b.resumeSession().a(new T0(u0, 0)).b(new L(u0, 4)), zh.b.a(), 0), new A7.r(18, this, pVar), 1), new Q6.b(this, 0), Eh.d.c, Eh.d.f1365b).c();
    }

    public void l(Lh.d dVar) {
        ArrayList arrayList = ((T6.a) ((S6.a) this.c.get())).m;
        Ah.p pVar = arrayList.isEmpty() ? null : (Ah.p) arrayList.get(0);
        T6.a aVar = (T6.a) ((S6.a) this.c.get());
        aVar.getClass();
        aVar.m.add(dVar);
        if (pVar == null) {
            k();
        }
    }

    public void m() {
        if (((MayaBaseLoadingFragment) ((InterfaceC1514a) this.c.get())).f10359n0) {
            return;
        }
        ((MayaBaseLoadingFragment) ((InterfaceC1514a) this.c.get())).f10359n0 = true;
        ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).O1();
        C1273n c1273n = (C1273n) this.e;
        c1273n.getClass();
        Ah.p<List<BillerCategory>> categoryList = c1273n.f11463b.getCategoryList(T2.s());
        C1271m c1271m = new C1271m(c1273n, 2);
        categoryList.getClass();
        new Lh.d(new T(5, new Lh.d(new Lh.h(new Lh.d(categoryList, c1271m, 2).h(Th.e.c), zh.b.a(), 0), new C0933d(this, 1), 0), new C0930a(this, 0)), new C0934e(this, 1), 1).e();
    }

    public Map n() {
        Map<String, Boolean> flutterToggles = ((com.paymaya.data.preference.a) this.e).e().getFlutterToggles();
        kotlin.jvm.internal.j.f(flutterToggles, "getFlutterToggles(...)");
        A5.b bVar = A5.b.f59F0;
        S5.c cVar = (S5.c) this.f;
        HashMap mapG = M.g(new Pair("cc_dbl", Boolean.valueOf(S5.c.b(cVar, bVar))), new Pair("loans_credit_card_credolab_skip_permission", Boolean.valueOf(S5.c.b(cVar, A5.b.f61G0))), new Pair("loans_credit_card_credit_scoring", Boolean.valueOf(S5.c.b(cVar, A5.b.f56D0))), new Pair("loans_credit_card_credit_scoring_v2", Boolean.valueOf(S5.c.b(cVar, A5.b.f57E0))), new Pair("loans_credit_card_details_v2", Boolean.valueOf(S5.c.b(cVar, A5.b.f63H0))), new Pair("loans_credit_card_maya_black", Boolean.valueOf(S5.c.b(cVar, A5.b.f68L0))), new Pair("loans_credit_card_maya_black_v2", Boolean.valueOf(S5.c.b(cVar, A5.b.f70O0))), new Pair("lending_data_extraction", Boolean.valueOf(S5.c.b(cVar, A5.b.y0))), new Pair("loans_credit_card_geolocation", Boolean.valueOf(S5.c.b(cVar, A5.b.f65J0))), new Pair("loans_credit_card_maya_black_phase2", Boolean.valueOf(S5.c.b(cVar, A5.b.f69M0))), new Pair("loans_credit_card_force_update", Boolean.valueOf(S5.c.b(cVar, A5.b.I0))), new Pair("loans_credit_card_show_account_number", Boolean.valueOf(S5.c.b(cVar, A5.b.f72P0))), new Pair("loans_credit_card_mgm", Boolean.valueOf(S5.c.b(cVar, A5.b.f74Q0))));
        LinkedHashMap linkedHashMap = new LinkedHashMap(flutterToggles);
        linkedHashMap.putAll(mapG);
        return linkedHashMap;
    }

    public void o() {
        ((MayaBaseFragment) ((Rb.j) this.c.get())).E1();
        Ah.p<List<Consent>> userConsent = ((C1284t) this.f2878g).f11481b.getUserConsent();
        new T(5, new Lh.d(new Lh.d(AbstractC1331a.l(userConsent, userConsent, zh.b.a()), new G6.w(this, 16), 2), new G6.r(this, 18), 0), new Lb.f(this, 2)).e();
    }

    public void p(String str, List list) {
        if (com.paymaya.common.utility.C.w(str) == 0) {
            return;
        }
        String strL = com.paymaya.common.utility.C.L(str, "biller");
        String strL2 = com.paymaya.common.utility.C.L(str, "category");
        String strL3 = com.paymaya.common.utility.C.L(str, "favorite");
        String strL4 = com.paymaya.common.utility.C.L(str, "notificationId");
        if (strL3 != null && !C2576A.H(strL3)) {
            ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).T1();
            if (strL4 == null || C2576A.H(strL4)) {
                ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).a2(strL3, null);
                return;
            } else {
                ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).a2(strL3, strL4);
                return;
            }
        }
        if ((strL == null || C2576A.H(strL)) && (strL2 == null || C2576A.H(strL2))) {
            ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).T1();
            return;
        }
        if (strL != null && !C2576A.H(strL)) {
            if ("BIR".equalsIgnoreCase(strL)) {
                InterfaceC1549b interfaceC1549b = ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).f13360K0;
                if (interfaceC1549b != null) {
                    ((MayaPayBillsActivity) interfaceC1549b).c2(strL);
                    return;
                }
                return;
            }
            InterfaceC1549b interfaceC1549b2 = ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).f13360K0;
            if (interfaceC1549b2 != null) {
                ((MayaPayBillsActivity) interfaceC1549b2).f2(strL);
                return;
            }
            return;
        }
        if (strL2 == null || C2576A.H(strL2) || list == null || list.isEmpty()) {
            return;
        }
        for (BillerCategory billerCategory : (ArrayList) list) {
            if (strL2.equalsIgnoreCase(billerCategory.mSlug())) {
                ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).T1();
                ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).Y1(billerCategory);
                return;
            }
        }
        ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).T1();
    }

    public void q() {
        KeyguardManager keyguardManager = ((BaseMayaSettingsFragment) ((Rb.j) this.c.get())).w0;
        if (keyguardManager == null || !keyguardManager.isKeyguardSecure()) {
            v();
            BaseMayaSettingsFragment baseMayaSettingsFragment = (BaseMayaSettingsFragment) ((Rb.j) this.c.get());
            baseMayaSettingsFragment.N1(R.string.pma_label_add_lock_screen_in_security_settings, new Pair(baseMayaSettingsFragment.getString(R.string.pma_label_settings), new Sb.b(baseMayaSettingsFragment, 5)));
            return;
        }
        if (((com.paymaya.data.preference.a) this.i).D()) {
            BaseMayaSettingsFragment baseMayaSettingsFragment2 = (BaseMayaSettingsFragment) ((Rb.j) this.c.get());
            Sb.d dVar = baseMayaSettingsFragment2.f13906v0;
            if (dVar != null) {
                String string = baseMayaSettingsFragment2.getString(R.string.maya_label_disable_screen_lock_title);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                String string2 = baseMayaSettingsFragment2.getString(R.string.maya_label_disable_screen_lock_description);
                kotlin.jvm.internal.j.f(string2, "getString(...)");
                ((MayaSettingsActivity) dVar).e2(baseMayaSettingsFragment2, string, string2);
                return;
            }
            return;
        }
        BaseMayaSettingsFragment baseMayaSettingsFragment3 = (BaseMayaSettingsFragment) ((Rb.j) this.c.get());
        Sb.d dVar2 = baseMayaSettingsFragment3.f13906v0;
        if (dVar2 != null) {
            String string3 = baseMayaSettingsFragment3.getString(R.string.maya_label_enable_screen_lock_title);
            kotlin.jvm.internal.j.f(string3, "getString(...)");
            String string4 = baseMayaSettingsFragment3.getString(R.string.maya_label_enable_screen_lock_description);
            kotlin.jvm.internal.j.f(string4, "getString(...)");
            ((MayaSettingsActivity) dVar2).e2(baseMayaSettingsFragment3, string3, string4);
        }
    }

    public void r(PayMayaError payMayaError, pg.t channelResult, String str) {
        kotlin.jvm.internal.j.g(channelResult, "channelResult");
        payMayaError.mErrorCode();
        payMayaError.mSpiel();
        yk.a.a();
        channelResult.error("", "Oops! Something’s up. But don’t worry, we’re now looking into it. Please try again later.", null);
    }

    public void s(PayMayaError payMayaError, Throwable throwable) {
        kotlin.jvm.internal.j.g(throwable, "throwable");
        if (!payMayaError.isSessionTimeout() && !payMayaError.isNetworkError()) {
            P9.a aVar = (P9.a) this.c.get();
            Map mapC = cj.L.c(new Pair("product", "mec"));
            ((MayaCreditActivationAllSetEnhanceFragment) aVar).getClass();
            com.paymaya.common.utility.E.b(throwable, mapC);
        }
        yk.a.e();
    }

    public void t() {
        Lh.h hVarC;
        N5.F f = ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).f13367r0;
        if (f == null) {
            kotlin.jvm.internal.j.n("mViewGroupFavorite");
            throw null;
        }
        ((ConstraintLayout) f.f3614b).setVisibility(0);
        if (!((com.paymaya.data.preference.a) this.i).e().isFavoritesServiceAvailable()) {
            LinearLayoutCompat linearLayoutCompat = ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).f13370x0;
            if (linearLayoutCompat == null) {
                kotlin.jvm.internal.j.n("mCardViewFavoritesMaintenance");
                throw null;
            }
            linearLayoutCompat.setVisibility(0);
            ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).R1();
            ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).S1();
            ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).Q1();
            TextView textView = ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).w0;
            if (textView == null) {
                kotlin.jvm.internal.j.n("mEmptyFavoritesLabel");
                throw null;
            }
            textView.setVisibility(8);
            ConstraintLayout constraintLayout = ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).f13371z0;
            if (constraintLayout == null) {
                kotlin.jvm.internal.j.n("mViewGroupFavoritesLoading");
                throw null;
            }
            constraintLayout.setVisibility(8);
            ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).Z1();
            return;
        }
        if (((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).f13363O0) {
            return;
        }
        ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).f13363O0 = true;
        N5.F f3 = ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).f13367r0;
        if (f3 == null) {
            kotlin.jvm.internal.j.n("mViewGroupFavorite");
            throw null;
        }
        ((ConstraintLayout) f3.f3614b).setVisibility(0);
        ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).Z1();
        LinearLayoutCompat linearLayoutCompat2 = ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).f13370x0;
        if (linearLayoutCompat2 == null) {
            kotlin.jvm.internal.j.n("mCardViewFavoritesMaintenance");
            throw null;
        }
        linearLayoutCompat2.setVisibility(8);
        LinearLayoutCompat linearLayoutCompat3 = ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).y0;
        if (linearLayoutCompat3 == null) {
            kotlin.jvm.internal.j.n("mCardViewFavoritesError");
            throw null;
        }
        linearLayoutCompat3.setVisibility(8);
        ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).S1();
        ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).R1();
        ConstraintLayout constraintLayout2 = ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).f13371z0;
        if (constraintLayout2 == null) {
            kotlin.jvm.internal.j.n("mViewGroupFavoritesLoading");
            throw null;
        }
        constraintLayout2.setVisibility(0);
        ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).Q1();
        TextView textView2 = ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get())).w0;
        if (textView2 == null) {
            kotlin.jvm.internal.j.n("mEmptyFavoritesLabel");
            throw null;
        }
        textView2.setVisibility(8);
        boolean zIsMayaBillerReminderEnabled = ((com.paymaya.data.preference.a) this.i).e().isMayaBillerReminderEnabled();
        Q q9 = (Q) this.h;
        if (zIsMayaBillerReminderEnabled) {
            q9.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            I5.b.b(linkedHashMap, SessionDescription.ATTR_TYPE, "billspay");
            I5.b.b(linkedHashMap, NotificationCompat.CATEGORY_REMINDER, String.valueOf(true));
            hVarC = q9.f11382b.getFavorites(M.m(linkedHashMap)).h(Th.e.c);
        } else {
            hVarC = q9.c("billspay");
        }
        new Lh.d(new T(5, new Lh.d(new Lh.d(new Lh.h(hVarC, zh.b.a(), 0), new C0936g(this, 0), 2), new C0931b(this, 1), 0), new C0930a(this, 2)), new C0932c(this, 1), 1).e();
        new Lh.d(new Lh.d(new Lh.d(new Lh.h(((Q) this.h).a("billspay"), zh.b.a(), 0), new C0933d(this, 0), 2), new C0934e(this, 0), 0), new C0935f(this, 0), 1).e();
    }

    public void u(int i, String str, String str2) {
        if (((com.paymaya.data.preference.a) this.i).e().isBillsPayEventsV2Enabled()) {
            MayaBillersCategoryFragment mayaBillersCategoryFragment = (MayaBillersCategoryFragment) ((InterfaceC1514a) this.c.get());
            mayaBillersCategoryFragment.getClass();
            C1219h c1219hE = C1219h.e("BILLS_PAY_ERROR_SCREEN");
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            String strValueOf = String.valueOf(i);
            HashMap map = c1219hE.j;
            map.put(StateEvent.Name.ERROR_CODE, strValueOf);
            map.put("error_reason", str);
            map.put("page", "Home");
            map.put("section", str2);
            mayaBillersCategoryFragment.o1().b(c1219hE);
        }
    }

    public void v() {
        KeyguardManager keyguardManager;
        if (((com.paymaya.data.preference.a) this.i).D() && (keyguardManager = ((BaseMayaSettingsFragment) ((Rb.j) this.c.get())).w0) != null && keyguardManager.isKeyguardSecure()) {
            SwitchCompat switchCompat = ((BaseMayaSettingsFragment) ((Rb.j) this.c.get())).f13891d0;
            if (switchCompat != null) {
                switchCompat.setChecked(true);
                return;
            } else {
                kotlin.jvm.internal.j.n("mSwitchScreenLockLogin");
                throw null;
            }
        }
        SwitchCompat switchCompat2 = ((BaseMayaSettingsFragment) ((Rb.j) this.c.get())).f13891d0;
        if (switchCompat2 != null) {
            switchCompat2.setChecked(false);
        } else {
            kotlin.jvm.internal.j.n("mSwitchScreenLockLogin");
            throw null;
        }
    }

    public void w() {
        Sb.d dVar = ((BaseMayaSettingsFragment) ((Rb.j) this.c.get())).f13906v0;
        if (dVar != null) {
            MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) ((Mb.c) ((MayaSettingsActivity) dVar).X1().c.get());
            mayaSettingsActivity.getClass();
            AbstractC1236z.h(mayaSettingsActivity, R.id.frame_layout_container, new MayaAccountRecoveryFragment());
        }
    }

    public void x() {
        if ("kyc1".equalsIgnoreCase(((com.paymaya.data.preference.a) this.i).l())) {
            ((MayaBaseFragment) ((Rb.j) this.c.get())).E1();
            new T(5, new Lh.d(new Lh.d(new Lh.h(((J0) this.h).f11362b.getSettingsByType("public_display_name").h(Th.e.c), zh.b.a(), 0), new G6.u(this, 18), 2), new Gb.d(this, 17), 0), new Lb.f(this, 1)).e();
            return;
        }
        Sb.d dVar = ((BaseMayaSettingsFragment) ((Rb.j) this.c.get())).f13906v0;
        if (dVar != null) {
            MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) dVar;
            String string = mayaSettingsActivity.getString(R.string.maya_label_upgrade_dialog_title);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            z2.d.n(2131231670, string, mayaSettingsActivity.getString(R.string.maya_label_upgrade_dialog_description), new Pair(mayaSettingsActivity.getString(R.string.maya_label_upgrade_now), new Nb.a(mayaSettingsActivity, 4)), new Pair(mayaSettingsActivity.getString(R.string.maya_label_maybe_later), null), null, 96).show(mayaSettingsActivity.getSupportFragmentManager(), "alert_dialog");
        }
    }

    public void y(final PayMayaError payMayaError) {
        ((MayaBaseFragment) ((Rb.j) this.c.get())).w1();
        if (payMayaError.isSessionTimeout()) {
            return;
        }
        int iMErrorCode = payMayaError.mErrorCode();
        if (iMErrorCode == -20) {
            final int i = 0;
            new Hh.a(new Hh.f(((S0) this.f).b(), zh.b.a(), 0), new Ch.a(this) { // from class: Lb.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0323a f2954b;

                {
                    this.f2954b = this;
                }

                @Override // Ch.a
                public final void run() {
                    switch (i) {
                        case 0:
                            C0323a c0323a = this.f2954b;
                            PayMayaError payMayaError2 = payMayaError;
                            BaseMayaSettingsFragment baseMayaSettingsFragment = (BaseMayaSettingsFragment) ((j) c0323a.c.get());
                            Sb.d dVar = baseMayaSettingsFragment.f13906v0;
                            if (dVar != null) {
                                ((MayaSettingsActivity) dVar).d2(0, payMayaError2, baseMayaSettingsFragment.getString(R.string.pma_toast_error_title_change_settings_error));
                            }
                            break;
                        default:
                            C0323a c0323a2 = this.f2954b;
                            PayMayaError payMayaError3 = payMayaError;
                            Sb.d dVar2 = ((BaseMayaSettingsFragment) ((j) c0323a2.c.get())).f13906v0;
                            if (dVar2 != null) {
                                MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) dVar2;
                                PayMayaErrorAction payMayaErrorActionMAction = payMayaError3.mAction();
                                MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(2131231237, mayaSettingsActivity.getString(R.string.maya_label_device_fingerprint_block_error_title), payMayaError3.mSpiel(), payMayaErrorActionMAction != null ? payMayaErrorActionMAction.mTitle() : null, null, false, null, null, false, 496);
                                mayaErrorDialogFragmentZ.f11852e0 = new Nb.b(mayaErrorDialogFragmentZ, mayaSettingsActivity, payMayaErrorActionMAction, 1);
                                mayaErrorDialogFragmentZ.f11851d0 = new Nb.d(mayaErrorDialogFragmentZ, mayaSettingsActivity, 0);
                                mayaErrorDialogFragmentZ.setCancelable(false);
                                mayaErrorDialogFragmentZ.show(mayaSettingsActivity.getSupportFragmentManager(), "error_dialog");
                            }
                            break;
                    }
                }
            }, 1).c();
            return;
        }
        if (iMErrorCode == -12) {
            v();
            BaseMayaSettingsFragment baseMayaSettingsFragment = (BaseMayaSettingsFragment) ((Rb.j) this.c.get());
            Sb.d dVar = baseMayaSettingsFragment.f13906v0;
            if (dVar != null) {
                String string = baseMayaSettingsFragment.getString(R.string.maya_label_error_screen_lock_title);
                String strMSpiel = payMayaError.mSpiel();
                Q6.s sVar = new Q6.s(baseMayaSettingsFragment, 2);
                MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(2131231692, string, strMSpiel, null, null, false, null, null, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT);
                mayaErrorDialogFragmentZ.f11850c0 = sVar;
                mayaErrorDialogFragmentZ.show(((MayaSettingsActivity) dVar).getSupportFragmentManager(), "error_dialog");
                return;
            }
            return;
        }
        if (iMErrorCode == -394 || iMErrorCode == -395) {
            final int i4 = 1;
            new Hh.a(new Hh.f(((S0) this.f).b(), zh.b.a(), 0), new Ch.a(this) { // from class: Lb.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0323a f2954b;

                {
                    this.f2954b = this;
                }

                @Override // Ch.a
                public final void run() {
                    switch (i4) {
                        case 0:
                            C0323a c0323a = this.f2954b;
                            PayMayaError payMayaError2 = payMayaError;
                            BaseMayaSettingsFragment baseMayaSettingsFragment2 = (BaseMayaSettingsFragment) ((j) c0323a.c.get());
                            Sb.d dVar2 = baseMayaSettingsFragment2.f13906v0;
                            if (dVar2 != null) {
                                ((MayaSettingsActivity) dVar2).d2(0, payMayaError2, baseMayaSettingsFragment2.getString(R.string.pma_toast_error_title_change_settings_error));
                            }
                            break;
                        default:
                            C0323a c0323a2 = this.f2954b;
                            PayMayaError payMayaError3 = payMayaError;
                            Sb.d dVar22 = ((BaseMayaSettingsFragment) ((j) c0323a2.c.get())).f13906v0;
                            if (dVar22 != null) {
                                MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) dVar22;
                                PayMayaErrorAction payMayaErrorActionMAction = payMayaError3.mAction();
                                MayaErrorDialogFragment mayaErrorDialogFragmentZ2 = M2.b.Z(2131231237, mayaSettingsActivity.getString(R.string.maya_label_device_fingerprint_block_error_title), payMayaError3.mSpiel(), payMayaErrorActionMAction != null ? payMayaErrorActionMAction.mTitle() : null, null, false, null, null, false, 496);
                                mayaErrorDialogFragmentZ2.f11852e0 = new Nb.b(mayaErrorDialogFragmentZ2, mayaSettingsActivity, payMayaErrorActionMAction, 1);
                                mayaErrorDialogFragmentZ2.f11851d0 = new Nb.d(mayaErrorDialogFragmentZ2, mayaSettingsActivity, 0);
                                mayaErrorDialogFragmentZ2.setCancelable(false);
                                mayaErrorDialogFragmentZ2.show(mayaSettingsActivity.getSupportFragmentManager(), "error_dialog");
                            }
                            break;
                    }
                }
            }, 1).c();
            return;
        }
        v();
        BaseMayaSettingsFragment baseMayaSettingsFragment2 = (BaseMayaSettingsFragment) ((Rb.j) this.c.get());
        Sb.d dVar2 = baseMayaSettingsFragment2.f13906v0;
        if (dVar2 != null) {
            ((MayaSettingsActivity) dVar2).a(payMayaError, baseMayaSettingsFragment2.getString(R.string.maya_label_thats_not_it));
        }
    }

    public void z(PayMayaError payMayaError) {
        ((MayaBaseFragment) ((P9.a) this.c.get())).w1();
        if (payMayaError.isSessionTimeout()) {
            return;
        }
        if (payMayaError.isNetworkError()) {
            MayaCreditActivationAllSetEnhanceFragment mayaCreditActivationAllSetEnhanceFragment = (MayaCreditActivationAllSetEnhanceFragment) ((P9.a) this.c.get());
            InterfaceC0573c interfaceC0573c = mayaCreditActivationAllSetEnhanceFragment.f13097Z;
            if (interfaceC0573c != null) {
                ((NewMayaCreditActivity) interfaceC0573c).o(mayaCreditActivationAllSetEnhanceFragment.getString(R.string.maya_label_credit_activation_error_title), mayaCreditActivationAllSetEnhanceFragment.getString(R.string.maya_label_credit_activation_error_message));
                return;
            }
            return;
        }
        MayaCreditActivationAllSetEnhanceFragment mayaCreditActivationAllSetEnhanceFragment2 = (MayaCreditActivationAllSetEnhanceFragment) ((P9.a) this.c.get());
        mayaCreditActivationAllSetEnhanceFragment2.getClass();
        InterfaceC0573c interfaceC0573c2 = mayaCreditActivationAllSetEnhanceFragment2.f13097Z;
        if (interfaceC0573c2 != null) {
            ((NewMayaCreditActivity) interfaceC0573c2).o(mayaCreditActivationAllSetEnhanceFragment2.getString(R.string.maya_label_credit_activation_error_title), payMayaError.mSpiel());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0323a(com.paymaya.data.preference.a mPreference, C1247a c1247a, C1293x0 c1293x0, C1249b c1249b, S5.c flagConfigurationService, Uh.d sessionPublishSubject) {
        super(sessionPublishSubject);
        this.f2877d = 5;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
        kotlin.jvm.internal.j.g(sessionPublishSubject, "sessionPublishSubject");
        this.e = mPreference;
        this.f2878g = c1247a;
        this.h = c1293x0;
        this.i = c1249b;
        this.f = flagConfigurationService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0323a(com.paymaya.data.preference.a mPreference, com.paymaya.domain.store.B b8, C1247a c1247a, C1293x0 c1293x0, C1249b c1249b, Uh.d sessionPublishSubject) {
        super(sessionPublishSubject);
        this.f2877d = 2;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(sessionPublishSubject, "sessionPublishSubject");
        this.e = mPreference;
        this.f = b8;
        this.f2878g = c1247a;
        this.h = c1293x0;
        this.i = c1249b;
    }

    public C0323a(com.paymaya.data.preference.a aVar, Z0 z02, com.paymaya.domain.store.C c, K k8, S5.c cVar) {
        this.f2877d = 3;
        this.e = aVar;
        this.f2878g = z02;
        this.h = c;
        this.i = k8;
        this.f = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0323a(C1273n c1273n, C1277p c1277p, Q q9, com.paymaya.data.preference.a mPreference, S5.c mFlagConfigurationService, Uh.d dVar) {
        super(dVar);
        this.f2877d = 4;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(mFlagConfigurationService, "mFlagConfigurationService");
        this.e = c1273n;
        this.f2878g = c1277p;
        this.h = q9;
        this.i = mPreference;
        this.f = mFlagConfigurationService;
    }

    public C0323a(C1264i0 c1264i0, S5.c cVar) {
        this.f2877d = 0;
        this.e = c1264i0;
        this.f = cVar;
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0323a(K k8, C1293x0 c1293x0, S0 s02, C1284t c1284t, J0 j02, com.paymaya.data.preference.a aVar, Uh.d dVar) {
        super(dVar);
        this.f2877d = 1;
        this.e = c1293x0;
        this.f = s02;
        this.f2878g = c1284t;
        this.h = j02;
        this.i = aVar;
    }
}
