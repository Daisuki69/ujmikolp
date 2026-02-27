package A7;

import D.C0190x;
import G7.C0258a;
import G7.C0262e;
import G7.C0265h;
import G7.InterfaceC0263f;
import M8.T2;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager2.widget.ViewPager2;
import bg.AbstractC0983W;
import cj.L;
import cj.M;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.i0;
import com.paymaya.common.widget.MayaResizingTabLayout;
import com.paymaya.domain.model.Config;
import com.paymaya.domain.model.DashboardTab;
import com.paymaya.domain.store.C;
import com.paymaya.domain.store.C1250b0;
import com.paymaya.domain.store.C1261h;
import com.paymaya.domain.store.C1265j;
import com.paymaya.domain.store.K;
import com.paymaya.domain.store.S0;
import com.paymaya.domain.store.Y;
import com.paymaya.domain.store.Z0;
import com.paymaya.mayaui.common.view.activity.impl.MayaFullScreenFlutterFragmentActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaUnderReviewBottomSheetFragment;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaDashboardFragment;
import d4.AbstractC1331a;
import dOYHB6.yFtIp6.svM7M6;
import defpackage.AbstractC1414e;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.android.FlutterFragmentActivity;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import s.AbstractC2217b;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f212d;
    public final C1250b0 e;
    public final Uh.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Y f213g;
    public final C1261h h;
    public final S0 i;
    public final C j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final K f214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final S5.c f215l;
    public final Z0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C1265j f216n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f217o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.paymaya.data.preference.a mPreference, C1250b0 c1250b0, Uh.d mInboxSubject, Y y7, C1261h c1261h, S0 s02, C c, K mDeviceStore, S5.c mFlagConfigurationService, Z0 z02, Uh.d dVar, C1265j c1265j) {
        super(dVar);
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(mInboxSubject, "mInboxSubject");
        kotlin.jvm.internal.j.g(mDeviceStore, "mDeviceStore");
        kotlin.jvm.internal.j.g(mFlagConfigurationService, "mFlagConfigurationService");
        this.f212d = mPreference;
        this.e = c1250b0;
        this.f = mInboxSubject;
        this.f213g = y7;
        this.h = c1261h;
        this.i = s02;
        this.j = c;
        this.f214k = mDeviceStore;
        this.f215l = mFlagConfigurationService;
        this.m = z02;
        this.f216n = c1265j;
        this.f217o = cj.r.c("CARDS_APPLY_TAPPED");
    }

    public final void A(String str, String str2, pg.t channelResult) {
        int i = 2;
        int i4 = 1;
        int i6 = 0;
        kotlin.jvm.internal.j.g(channelResult, "channelResult");
        if (S5.c.b(this.f215l, A5.b.y0)) {
            Map mapH = M.h(new Pair("triggeredBy", str == null ? "" : str), new Pair("eventTrigger", str2 != null ? str2 : ""));
            e(new Lh.d(new Lh.d(new Lh.h(this.j.a(), zh.b.a(), 0), new com.google.firebase.messaging.r(this, str, str2, mapH), i), new Cg.c(i4, this, mapH, channelResult), i6).e());
        }
        channelResult.success(Boolean.TRUE);
    }

    public final void B() {
        ViewPager2 viewPager2 = ((MayaDashboardFragment) ((F7.a) this.c.get())).f12161a0;
        if (viewPager2 != null) {
            viewPager2.setUserInputEnabled(false);
        } else {
            kotlin.jvm.internal.j.n("mViewPageFragment");
            throw null;
        }
    }

    public final void C() {
        ViewPager2 viewPager2 = ((MayaDashboardFragment) ((F7.a) this.c.get())).f12161a0;
        if (viewPager2 != null) {
            viewPager2.setUserInputEnabled(true);
        } else {
            kotlin.jvm.internal.j.n("mViewPageFragment");
            throw null;
        }
    }

    public final void D(boolean z4) {
        if (z4) {
            MayaDashboardFragment mayaDashboardFragment = (MayaDashboardFragment) ((F7.a) this.c.get());
            ImageView imageView = mayaDashboardFragment.f12157W;
            if (imageView != null) {
                imageView.setImageDrawable(ContextCompat.getDrawable(mayaDashboardFragment.requireContext(), R.drawable.maya_ic_inbox_notification));
                return;
            } else {
                kotlin.jvm.internal.j.n("mImageViewInbox");
                throw null;
            }
        }
        MayaDashboardFragment mayaDashboardFragment2 = (MayaDashboardFragment) ((F7.a) this.c.get());
        ImageView imageView2 = mayaDashboardFragment2.f12157W;
        if (imageView2 != null) {
            imageView2.setImageDrawable(ContextCompat.getDrawable(mayaDashboardFragment2.requireContext(), R.drawable.maya_ic_inbox_default));
        } else {
            kotlin.jvm.internal.j.n("mImageViewInbox");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    public final void E(String str) {
        Map mapH;
        if (str != null) {
            String str2 = "fullscreenFlowEntrypoint";
            if (zj.z.w(str, 2, "paymaya://tickets", false)) {
                String strL = com.paymaya.common.utility.C.L(str, TtmlNode.ATTR_ID);
                if (S5.c.b(this.f215l, A5.b.m0)) {
                    str2 = "tickets";
                } else {
                    strL = null;
                }
                mapH = M.h(new Pair("route", str2), new Pair("ticketId", strL));
            } else {
                String strL2 = com.paymaya.common.utility.C.L(str, "route");
                String strL3 = com.paymaya.common.utility.C.L(str, "messageTimestamp");
                String strL4 = com.paymaya.common.utility.C.L(str, "channelUrl");
                String strL5 = com.paymaya.common.utility.C.L(str, "payload");
                String strDecode = com.paymaya.common.utility.C.e(strL5) ? null : Uri.decode(strL5);
                if (strL2 == null || C2576A.H(strL2)) {
                    strL3 = null;
                } else {
                    str2 = strL2;
                }
                mapH = M.h(new Pair("route", str2), new Pair("messageTimestamp", strL3), new Pair("channelUrl", strL4), new Pair("payload", strDecode));
            }
            MayaDashboardFragment mayaDashboardFragment = (MayaDashboardFragment) ((F7.a) this.c.get());
            mayaDashboardFragment.getClass();
            G7.i iVar = mayaDashboardFragment.f12171k0;
            if (iVar == null) {
                kotlin.jvm.internal.j.n("inboxFlutterScreen");
                throw null;
            }
            iVar.f1861A = true;
            iVar.c().a("requestFullscreen", mapH, null);
            iVar.h.invoke(iVar.d());
        }
        Bundle arguments = ((MayaDashboardFragment) ((F7.a) this.c.get())).getArguments();
        if (arguments != null) {
            arguments.remove("tab");
            arguments.remove("subroute");
            arguments.remove("inbox_route");
        }
    }

    public final void F() {
        MayaDashboardFragment mayaDashboardFragment = (MayaDashboardFragment) ((F7.a) this.c.get());
        com.paymaya.common.utility.C.i(mayaDashboardFragment.getClass().getSimpleName(), "showIncomeDocs");
        Le.j jVar = mayaDashboardFragment.f12173n0;
        if (jVar == null) {
            kotlin.jvm.internal.j.n("mIncomeDocumentUploader");
            throw null;
        }
        FragmentActivity fragmentActivityRequireActivity = mayaDashboardFragment.requireActivity();
        kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        ((Le.i) jVar).a(fragmentActivityRequireActivity);
        Le.j jVar2 = mayaDashboardFragment.f12173n0;
        if (jVar2 == null) {
            kotlin.jvm.internal.j.n("mIncomeDocumentUploader");
            throw null;
        }
        FragmentActivity fragmentActivityRequireActivity2 = mayaDashboardFragment.requireActivity();
        kotlin.jvm.internal.j.f(fragmentActivityRequireActivity2, "requireActivity(...)");
        String string = mayaDashboardFragment.getString(R.string.maya_label_document_upload_title);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        String string2 = mayaDashboardFragment.getString(R.string.maya_label_document_upload_sub_title);
        kotlin.jvm.internal.j.f(string2, "getString(...)");
        String string3 = mayaDashboardFragment.getString(R.string.maya_label_document_source_page_icl);
        kotlin.jvm.internal.j.f(string3, "getString(...)");
        String string4 = mayaDashboardFragment.getString(R.string.maya_label_document_source_button);
        kotlin.jvm.internal.j.f(string4, "getString(...)");
        String string5 = mayaDashboardFragment.getString(R.string.maya_label_document_product_type_icl_v2);
        kotlin.jvm.internal.j.f(string5, "getString(...)");
        ((Le.i) jVar2).b(fragmentActivityRequireActivity2, string, string2, string3, string4, string5, new Ag.f(1, mayaDashboardFragment, MayaDashboardFragment.class, "onSubmitSuccess", "onSubmitSuccess(Ljava/lang/String;)V", 0, 20));
    }

    public final void G() {
        InterfaceC0263f interfaceC0263f = ((MayaDashboardFragment) ((F7.a) this.c.get())).f12175p0;
        if (interfaceC0263f != null) {
            ((MayaDashboardActivity) interfaceC0263f).Y1().k();
        }
    }

    public final void H(Map map) {
        if (map != null && map.containsKey("rekyc_status") && map.containsKey("rekyc_reason")) {
            this.f212d.n0((String) map.get("rekyc_status"));
            com.paymaya.data.preference.a aVar = this.f212d;
            androidx.media3.datasource.cache.c.u(aVar.f11330b, "key_rekyc_reason", (String) map.get("rekyc_reason"));
        }
        MayaDashboardFragment mayaDashboardFragment = (MayaDashboardFragment) ((F7.a) this.c.get());
        mayaDashboardFragment.getClass();
        InterfaceC0263f interfaceC0263f = mayaDashboardFragment.f12175p0;
        if (interfaceC0263f != null) {
            MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) interfaceC0263f;
            mayaDashboardActivity.startActivity(mayaDashboardActivity.n1().p0(mayaDashboardActivity, "MAYA_SAVINGS_LIFT_DORMANCY"));
        }
    }

    public final void I() {
        InterfaceC0263f interfaceC0263f = ((MayaDashboardFragment) ((F7.a) this.c.get())).f12175p0;
        if (interfaceC0263f != null) {
            MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) interfaceC0263f;
            String string = mayaDashboardActivity.getString(R.string.maya_label_verify_email_title);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN = z2.d.n(2131231346, string, mayaDashboardActivity.getString(R.string.maya_label_verify_email_description), new Pair(mayaDashboardActivity.getString(R.string.maya_label_verify_now), new C7.e(mayaDashboardActivity, 3)), new Pair(mayaDashboardActivity.getString(R.string.maya_label_cancel), null), null, 96);
            mayaAlertBottomSheetDialogFragmentN.s1(mayaAlertBottomSheetDialogFragmentN.f11818a0);
            mayaAlertBottomSheetDialogFragmentN.f11820c0 = mayaAlertBottomSheetDialogFragmentN.f11820c0;
            mayaAlertBottomSheetDialogFragmentN.show(mayaDashboardActivity.getSupportFragmentManager(), "alert_dialog");
            C1220i c1220iK1 = mayaDashboardActivity.k1();
            C1219h c1219hD = C1219h.d(EnumC1215d.LOANS);
            c1219hD.r(EnumC1216e.VERIFY_EMAIL);
            c1219hD.n(21);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hD.j.put("source_page", "Loans tab");
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            String string2 = mayaDashboardActivity.getString(R.string.maya_label_apply_now);
            if (string2 != null) {
                c1219hD.j.put("source_button", string2);
            }
            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hD.j.put("product_type", "MAYA_INSTALLMENT_V2_CONSUMER_LOAN");
            c1219hD.i();
            c1220iK1.c(mayaDashboardActivity, c1219hD);
        }
    }

    @Override // y5.AbstractC2509a
    public final void h(Object obj) {
        F7.a view = (F7.a) obj;
        kotlin.jvm.internal.j.g(view, "view");
        super.h(view);
        if (this.f212d.e().isInboxV4Enabled()) {
            MayaDashboardFragment mayaDashboardFragment = (MayaDashboardFragment) ((F7.a) this.c.get());
            h hVarG1 = mayaDashboardFragment.G1();
            InterfaceC0263f interfaceC0263f = mayaDashboardFragment.f12175p0;
            Ag.f fVar = new Ag.f(1, mayaDashboardFragment, MayaDashboardFragment.class, "addSessionTimeoutMethodChannelResult", "addSessionTimeoutMethodChannelResult(Lio/flutter/plugin/common/MethodChannel$Result;)V", 0, 13);
            Ag.f fVar2 = new Ag.f(1, mayaDashboardFragment, MayaDashboardFragment.class, "startActivity", "startActivity(Landroid/content/Intent;)V", 0, 14);
            C0190x c0190x = new C0190x(0, mayaDashboardFragment, MayaDashboardFragment.class, "requireContext", "requireContext()Landroid/content/Context;", 0, 19);
            kotlin.jvm.internal.j.f(mayaDashboardFragment.t1().e(), "getConfig(...)");
            G7.i iVar = new G7.i("runInboxNotification", "inbox", "inboxActivity", "packages/paymaya_inbox_notification", hVarG1, interfaceC0263f, fVar, fVar2, c0190x, null, 3072);
            iVar.f1862s = "runInboxNotificationFullScreen";
            iVar.f1863t = "inboxActivity";
            iVar.f1864u = "packages/paymaya_inbox_notification";
            iVar.f1865v = hVarG1;
            iVar.f1866w = interfaceC0263f;
            iVar.f1867x = c0190x;
            mayaDashboardFragment.f12171k0 = iVar;
            iVar.h();
        }
        MayaDashboardFragment mayaDashboardFragment2 = (MayaDashboardFragment) ((F7.a) this.c.get());
        h hVarG12 = mayaDashboardFragment2.G1();
        InterfaceC0263f interfaceC0263f2 = mayaDashboardFragment2.f12175p0;
        Ag.f fVar3 = new Ag.f(1, mayaDashboardFragment2, MayaDashboardFragment.class, "addSessionTimeoutMethodChannelResult", "addSessionTimeoutMethodChannelResult(Lio/flutter/plugin/common/MethodChannel$Result;)V", 0, 18);
        Ag.f fVar4 = new Ag.f(1, mayaDashboardFragment2, MayaDashboardFragment.class, "startActivity", "startActivity(Landroid/content/Intent;)V", 0, 19);
        C0190x c0190x2 = new C0190x(0, mayaDashboardFragment2, MayaDashboardFragment.class, "requireContext", "requireContext()Landroid/content/Context;", 0, 21);
        Config configE = mayaDashboardFragment2.t1().e();
        kotlin.jvm.internal.j.f(configE, "getConfig(...)");
        G7.n nVar = new G7.n(hVarG12, interfaceC0263f2, fVar3, fVar4, c0190x2, configE, mayaDashboardFragment2.q1(), mayaDashboardFragment2.t1());
        mayaDashboardFragment2.f12163c0 = nVar;
        nVar.h();
        if (this.f212d.e().isLoansEnabled()) {
            MayaDashboardFragment mayaDashboardFragment3 = (MayaDashboardFragment) ((F7.a) this.c.get());
            mayaDashboardFragment3.getClass();
            Ag.f fVar5 = new Ag.f(1, mayaDashboardFragment3, MayaDashboardFragment.class, "addSessionTimeoutMethodChannelResult", "addSessionTimeoutMethodChannelResult(Lio/flutter/plugin/common/MethodChannel$Result;)V", 0, 17);
            C0190x c0190x3 = new C0190x(0, mayaDashboardFragment3, MayaDashboardFragment.class, "requireContext", "requireContext()Landroid/content/Context;", 0, 20);
            mayaDashboardFragment3.t1().e();
            Bundle bundle = new Bundle();
            bundle.putString("triggeredBy", "lending");
            bundle.putString("eventTrigger", "loans");
            C0265h jVar = S5.c.b(mayaDashboardFragment3.q1(), A5.b.f107h0) ? new G7.j(mayaDashboardFragment3.G1(), mayaDashboardFragment3.f12175p0, fVar5, new Ag.f(1, mayaDashboardFragment3, MayaDashboardFragment.class, "startActivity", "startActivity(Landroid/content/Intent;)V", 0, 15), c0190x3, bundle) : new C0265h("runBnplHome", "loans", "loansActivity", "packages/paymaya_bnpl", mayaDashboardFragment3.G1(), mayaDashboardFragment3.f12175p0, fVar5, new Ag.f(1, mayaDashboardFragment3, MayaDashboardFragment.class, "startActivity", "startActivity(Landroid/content/Intent;)V", 0, 16), c0190x3, bundle, 2048);
            mayaDashboardFragment3.f12164d0 = jVar;
            jVar.h();
            C0265h c0265h = mayaDashboardFragment3.f12164d0;
            if (c0265h == null) {
                kotlin.jvm.internal.j.n("loansFlutterScreen");
                throw null;
            }
            c0265h.a();
        }
        MayaDashboardFragment mayaDashboardFragment4 = (MayaDashboardFragment) ((F7.a) this.c.get());
        h hVarG13 = mayaDashboardFragment4.G1();
        InterfaceC0263f interfaceC0263f3 = mayaDashboardFragment4.f12175p0;
        Ag.f fVar6 = new Ag.f(1, mayaDashboardFragment4, MayaDashboardFragment.class, "addSessionTimeoutMethodChannelResult", "addSessionTimeoutMethodChannelResult(Lio/flutter/plugin/common/MethodChannel$Result;)V", 0, 11);
        Ag.f fVar7 = new Ag.f(1, mayaDashboardFragment4, MayaDashboardFragment.class, "startActivity", "startActivity(Landroid/content/Intent;)V", 0, 12);
        C0190x c0190x4 = new C0190x(0, mayaDashboardFragment4, MayaDashboardFragment.class, "requireContext", "requireContext()Landroid/content/Context;", 0, 18);
        kotlin.jvm.internal.j.f(mayaDashboardFragment4.t1().e(), "getConfig(...)");
        C0258a c0258a = new C0258a("runCard", "mycards", "mycardsFullscreen", "packages/paymaya_card", hVarG13, interfaceC0263f3, fVar6, fVar7, c0190x4, null, 3072);
        c0258a.f1838x = fVar7;
        c0258a.f1839y = c0190x4;
        c0258a.f1840z = interfaceC0263f3;
        c0258a.f1831A = hVarG13;
        c0258a.f1832B = "mycardsFullscreen";
        mayaDashboardFragment4.f12165e0 = c0258a;
        c0258a.h();
        C0258a c0258a2 = mayaDashboardFragment4.f12165e0;
        if (c0258a2 == null) {
            kotlin.jvm.internal.j.n("cardsFlutterScreen");
            throw null;
        }
        c0258a2.e().b(new c(c0258a2, 26));
        C0258a c0258a3 = mayaDashboardFragment4.f12165e0;
        if (c0258a3 == null) {
            kotlin.jvm.internal.j.n("cardsFlutterScreen");
            throw null;
        }
        c0258a3.p();
        C0258a c0258a4 = mayaDashboardFragment4.f12165e0;
        if (c0258a4 == null) {
            kotlin.jvm.internal.j.n("cardsFlutterScreen");
            throw null;
        }
        c0258a4.o();
        MayaDashboardFragment mayaDashboardFragment5 = (MayaDashboardFragment) ((F7.a) this.c.get());
        mayaDashboardFragment5.getClass();
        mayaDashboardFragment5.f12168h0 = FlutterFragment.withCachedEngine("mycards").renderMode(RenderMode.texture).build();
        com.paymaya.data.preference.a aVar = this.f212d;
        if (kotlin.jvm.internal.j.b(svM7M6.getString(aVar.f11330b, "key_restrictions", ""), "DUPLICATE") || svM7M6.getString(aVar.f11330b, "key_restrictions", "") == null) {
            return;
        }
        String string = svM7M6.getString(aVar.f11330b, "key_restrictions", "");
        kotlin.jvm.internal.j.f(string, "getRestriction(...)");
        if (string.length() <= 0 || !aVar.e().isRestrictedLoginEnabled()) {
            return;
        }
        MayaDashboardFragment mayaDashboardFragment6 = (MayaDashboardFragment) ((F7.a) this.c.get());
        FlutterEngine flutterEngine = new FlutterEngine(mayaDashboardFragment6.requireContext());
        flutterEngine.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", "runRestrictedLoginFlow"));
        FlutterEngineCache.getInstance().put("rlfFullscreen", flutterEngine);
        new pg.u(flutterEngine.getDartExecutor().getBinaryMessenger(), "packages/restricted_login_flow").b(new C0262e(mayaDashboardFragment6));
        Intent intentBuild = new FlutterFragmentActivity.CachedEngineIntentBuilder(MayaFullScreenFlutterFragmentActivity.class, "rlfFullscreen").backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode.transparent).build(mayaDashboardFragment6.requireContext());
        kotlin.jvm.internal.j.f(intentBuild, "build(...)");
        intentBuild.putExtra("engineId", "rlfFullscreen");
        mayaDashboardFragment6.requireActivity().startActivityForResult(intentBuild, 69);
    }

    public final void k(String str) {
        if (S5.c.b(this.f215l, A5.b.N0)) {
            if (S5.c.b(this.f215l, A5.b.f68L0)) {
                if (str != null) {
                    ((MayaDashboardFragment) ((F7.a) this.c.get())).L1("cardDashboard", C2576A.V(str, Global.QUESTION, ""));
                    return;
                }
                return;
            }
            C0258a c0258a = ((MayaDashboardFragment) ((F7.a) this.c.get())).f12165e0;
            if (c0258a != null) {
                c0258a.j("cardDashboard", null);
            } else {
                kotlin.jvm.internal.j.n("cardsFlutterScreen");
                throw null;
            }
        }
    }

    public final void l(String str, String str2) {
        if (!S5.c.b(this.f215l, A5.b.N0) || str2 == null) {
            return;
        }
        ((MayaDashboardFragment) ((F7.a) this.c.get())).L1(str, C2576A.V(str2, Global.QUESTION, ""));
    }

    public final Map m() {
        Map<String, Boolean> cardsFlutterToggles = this.f212d.e().getCardsFlutterToggles();
        A5.b bVar = A5.b.f79T0;
        S5.c cVar = this.f215l;
        AbstractC1414e.k(cVar, bVar, cardsFlutterToggles, "maya_black_intro");
        AbstractC1414e.k(cVar, A5.b.f67K0, cardsFlutterToggles, "convert_to_installment");
        AbstractC1414e.k(cVar, A5.b.f68L0, cardsFlutterToggles, "maya_black_credit_card");
        AbstractC1414e.k(cVar, A5.b.N0, cardsFlutterToggles, "landers_credit_card");
        AbstractC1414e.k(cVar, A5.b.f59F0, cardsFlutterToggles, "cc_dbl");
        AbstractC1414e.k(cVar, A5.b.f145x0, cardsFlutterToggles, "landers_monthly_millionaire");
        AbstractC1414e.k(cVar, A5.b.f85W0, cardsFlutterToggles, "maya_pay");
        AbstractC1414e.k(cVar, A5.b.g1, cardsFlutterToggles, "ad_kit");
        AbstractC1414e.k(cVar, A5.b.f110i1, cardsFlutterToggles, "ad_kit_placement");
        AbstractC1414e.k(cVar, A5.b.f135t, cardsFlutterToggles, "cc_dashboard_adkit");
        AbstractC1414e.k(cVar, A5.b.q1, cardsFlutterToggles, "rewards_catalog_maintenance");
        return cardsFlutterToggles;
    }

    public final Map n() {
        Map<String, Boolean> flutterToggles = this.f212d.e().getFlutterToggles();
        kotlin.jvm.internal.j.f(flutterToggles, "getFlutterToggles(...)");
        A5.b bVar = A5.b.f99d0;
        S5.c cVar = this.f215l;
        HashMap mapG = M.g(new Pair("icl_closed_loan_v2", Boolean.valueOf(S5.c.b(cVar, bVar))), new Pair("icl_geolocation", Boolean.valueOf(S5.c.b(cVar, A5.b.f103f0))), new Pair("icl_geolocation_mandatory", Boolean.valueOf(S5.c.b(cVar, A5.b.f106g0))), new Pair("icl_verify_email", Boolean.valueOf(S5.c.b(cVar, A5.b.f109i0))), new Pair("lending_data_extraction", Boolean.valueOf(S5.c.b(cVar, A5.b.y0))), new Pair("icl_device_scoring", Boolean.valueOf(S5.c.b(cVar, A5.b.f101e0))), new Pair("icl_google_ad", Boolean.valueOf(S5.c.b(cVar, A5.b.f111j0))));
        LinkedHashMap linkedHashMap = new LinkedHashMap(flutterToggles);
        linkedHashMap.putAll(mapG);
        return linkedHashMap;
    }

    public final void o() {
        MayaDashboardFragment mayaDashboardFragment = (MayaDashboardFragment) ((F7.a) this.c.get());
        InterfaceC0263f interfaceC0263f = mayaDashboardFragment.f12175p0;
        if (interfaceC0263f != null) {
            MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) interfaceC0263f;
            mayaDashboardActivity.n1();
            B5.i.k(mayaDashboardActivity, "paymaya://accountrecovery");
        }
        C0265h c0265h = mayaDashboardFragment.f12164d0;
        if (c0265h != null) {
            c0265h.i();
        } else {
            kotlin.jvm.internal.j.n("loansFlutterScreen");
            throw null;
        }
    }

    public final void p(String str, String str2) {
        Object next;
        if (str != null) {
            MayaDashboardFragment mayaDashboardFragment = (MayaDashboardFragment) ((F7.a) this.c.get());
            mayaDashboardFragment.getClass();
            Iterator it = mayaDashboardFragment.f12169i0.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (kotlin.jvm.internal.j.b(((DashboardTab) ((IndexedValue) next).f18164b).getId(), str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            IndexedValue indexedValue = (IndexedValue) next;
            if (indexedValue != null) {
                MayaResizingTabLayout mayaResizingTabLayout = mayaDashboardFragment.f12160Z;
                if (mayaResizingTabLayout == null) {
                    kotlin.jvm.internal.j.n("mTabLayoutDashboardV2");
                    throw null;
                }
                mayaResizingTabLayout.postDelayed(new B5.g(3, mayaResizingTabLayout, indexedValue), 200L);
            }
            int iW = com.paymaya.common.utility.C.w(str2);
            if (iW != 0) {
                int iC = AbstractC2217b.c(iW);
                if (iC != 47) {
                    EnumC1216e enumC1216e = EnumC1216e.MAYA_SAVINGS;
                    EnumC1215d enumC1215d = EnumC1215d.CASH_IN;
                    if (iC != 70) {
                        if (iC != 71) {
                            switch (iC) {
                                case 15:
                                    if (S5.c.b(this.f215l, A5.b.N0)) {
                                        C0258a c0258a = ((MayaDashboardFragment) ((F7.a) this.c.get())).f12165e0;
                                        if (c0258a == null) {
                                            kotlin.jvm.internal.j.n("cardsFlutterScreen");
                                            throw null;
                                        }
                                        c0258a.j("cardDashboard/benefits", null);
                                    }
                                    break;
                                case 16:
                                    if (S5.c.b(this.f215l, A5.b.f68L0)) {
                                        AbstractC0983W.C((F7.a) this.c.get(), 1, null, null, 6);
                                    }
                                    break;
                                case 17:
                                    if (S5.c.b(this.f215l, A5.b.f68L0)) {
                                        String strL = com.paymaya.common.utility.C.L(str2, "redemption_id");
                                        String strL2 = com.paymaya.common.utility.C.L(str2, "product_id");
                                        if (strL != null) {
                                            AbstractC0983W.C((F7.a) this.c.get(), 1, strL, null, 4);
                                        }
                                        if (strL2 != null) {
                                            AbstractC0983W.C((F7.a) this.c.get(), 1, null, strL2, 2);
                                        }
                                    }
                                    break;
                                case 18:
                                    if (S5.c.b(this.f215l, A5.b.f68L0)) {
                                        AbstractC0983W.C((F7.a) this.c.get(), 2, null, null, 6);
                                    }
                                    break;
                                case 19:
                                    k(str2);
                                    break;
                                case 20:
                                    l("activateCreditCard", str2);
                                    break;
                                case 21:
                                    l("transactionReceipt", str2);
                                    break;
                            }
                        } else if (kotlin.jvm.internal.j.b(this.f212d.k(), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                            final MayaDashboardFragment mayaDashboardFragment2 = (MayaDashboardFragment) ((F7.a) this.c.get());
                            mayaDashboardFragment2.getClass();
                            final int i = 1;
                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: G7.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i) {
                                        case 0:
                                            n nVar = mayaDashboardFragment2.f12163c0;
                                            if (nVar != null) {
                                                nVar.r("savingsToWallet");
                                                return;
                                            } else {
                                                kotlin.jvm.internal.j.n("savingsFlutterScreen");
                                                throw null;
                                            }
                                        default:
                                            n nVar2 = mayaDashboardFragment2.f12163c0;
                                            if (nVar2 != null) {
                                                nVar2.r("startSavings");
                                                return;
                                            } else {
                                                kotlin.jvm.internal.j.n("savingsFlutterScreen");
                                                throw null;
                                            }
                                    }
                                }
                            }, 300L);
                        } else {
                            ((MayaDashboardFragment) ((F7.a) this.c.get())).I1();
                            InterfaceC0263f interfaceC0263f = ((MayaDashboardFragment) ((F7.a) this.c.get())).f12175p0;
                            if (interfaceC0263f != null) {
                                ((MayaDashboardActivity) interfaceC0263f).t2(enumC1215d, enumC1216e);
                            }
                        }
                    } else if (kotlin.jvm.internal.j.b(this.f212d.l(), "kyc1")) {
                        final MayaDashboardFragment mayaDashboardFragment3 = (MayaDashboardFragment) ((F7.a) this.c.get());
                        mayaDashboardFragment3.getClass();
                        final int i4 = 0;
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: G7.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i4) {
                                    case 0:
                                        n nVar = mayaDashboardFragment3.f12163c0;
                                        if (nVar != null) {
                                            nVar.r("savingsToWallet");
                                            return;
                                        } else {
                                            kotlin.jvm.internal.j.n("savingsFlutterScreen");
                                            throw null;
                                        }
                                    default:
                                        n nVar2 = mayaDashboardFragment3.f12163c0;
                                        if (nVar2 != null) {
                                            nVar2.r("startSavings");
                                            return;
                                        } else {
                                            kotlin.jvm.internal.j.n("savingsFlutterScreen");
                                            throw null;
                                        }
                                }
                            }
                        }, 300L);
                    } else {
                        ((MayaDashboardFragment) ((F7.a) this.c.get())).I1();
                        InterfaceC0263f interfaceC0263f2 = ((MayaDashboardFragment) ((F7.a) this.c.get())).f12175p0;
                        if (interfaceC0263f2 != null) {
                            ((MayaDashboardActivity) interfaceC0263f2).t2(enumC1215d, enumC1216e);
                        }
                    }
                } else if (this.f212d.e().isMayaLoansInstallmentCashLoanEnabled()) {
                    C0265h c0265h = ((MayaDashboardFragment) ((F7.a) this.c.get())).f12164d0;
                    if (c0265h == null) {
                        kotlin.jvm.internal.j.n("loansFlutterScreen");
                        throw null;
                    }
                    c0265h.j("introScreen", null);
                }
            }
        }
        Bundle arguments = ((MayaDashboardFragment) ((F7.a) this.c.get())).getArguments();
        if (arguments != null) {
            arguments.remove("tab");
            arguments.remove("subroute");
            arguments.remove("inbox_route");
        }
    }

    public final void q() {
        InterfaceC0263f interfaceC0263f = ((MayaDashboardFragment) ((F7.a) this.c.get())).f12175p0;
        if (interfaceC0263f != null) {
            b bVarY1 = ((MayaDashboardActivity) interfaceC0263f).Y1();
            if (bVarY1.o()) {
                ((MayaDashboardActivity) ((B7.a) bVarY1.c.get())).q2();
                return;
            }
            if (kotlin.jvm.internal.j.b(bVarY1.f196d.x(), "submitted")) {
                MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) ((B7.a) bVarY1.c.get());
                C1220i c1220iK1 = mayaDashboardActivity.k1();
                C1219h c1219hD = C1219h.d(EnumC1215d.EKYC_V6);
                c1219hD.t(EnumC1217f.REKYC_EXIS_SUB);
                c1219hD.n(2);
                c1219hD.i();
                c1220iK1.c(mayaDashboardActivity, c1219hD);
                String strD = AbstractC1236z.d(mayaDashboardActivity, MayaUnderReviewBottomSheetFragment.class);
                String string = mayaDashboardActivity.getString(R.string.maya_label_view_status);
                C7.e eVar = new C7.e(mayaDashboardActivity, 2);
                MayaUnderReviewBottomSheetFragment mayaUnderReviewBottomSheetFragment = new MayaUnderReviewBottomSheetFragment();
                Bundle bundle = new Bundle();
                bundle.putCharSequence("title", "");
                bundle.putCharSequence("subtitle", "");
                bundle.putString("primary_button_value", string);
                mayaUnderReviewBottomSheetFragment.setArguments(bundle);
                mayaUnderReviewBottomSheetFragment.f11896S = eVar;
                mayaUnderReviewBottomSheetFragment.show(mayaDashboardActivity.getSupportFragmentManager(), strD);
            }
        }
    }

    public final void r(pg.t result) {
        kotlin.jvm.internal.j.g(result, "result");
        AbstractC1331a.t("access_token", this.f212d.b(), result);
    }

    public final void s(pg.t result) {
        kotlin.jvm.internal.j.g(result, "result");
        AbstractC1331a.t("kyc_status", this.f212d.l(), result);
    }

    public final void t(pg.t result) {
        kotlin.jvm.internal.j.g(result, "result");
        AbstractC1331a.t("min", this.f212d.r(), result);
    }

    public final void u(pg.t result) {
        kotlin.jvm.internal.j.g(result, "result");
        AbstractC1331a.t("pinning_fingerprint", this.f212d.t(), result);
    }

    public final void v(pg.t result) {
        kotlin.jvm.internal.j.g(result, "result");
        result.success(L.c(new Pair("rekyc_enabled", Boolean.valueOf(this.f212d.e().isRekycFlowEnabled()))));
    }

    public final void w(pg.t result) {
        kotlin.jvm.internal.j.g(result, "result");
        com.paymaya.data.preference.a aVar = this.f212d;
        result.success(M.h(new Pair("rekyc_status", aVar.x()), new Pair("rekyc_reason", aVar.w())));
    }

    public final void x(pg.t result) {
        kotlin.jvm.internal.j.g(result, "result");
        AbstractC1331a.t("session_token", this.f212d.s(), result);
    }

    public final void y(pg.t result) {
        kotlin.jvm.internal.j.g(result, "result");
        AbstractC1331a.t("shield_session_id", i0.b(), result);
    }

    public final void z(String eventArgumentsString) {
        kotlin.jvm.internal.j.g(eventArgumentsString, "eventArgumentsString");
        try {
            com.google.gson.q qVarG = T2.x(eventArgumentsString).g();
            String strJ = qVarG.m("event_name").j();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            com.google.gson.o oVarM = qVarG.m("attributes");
            if (oVarM != null && !(oVarM instanceof com.google.gson.p)) {
                Iterator it = ((com.google.gson.internal.i) oVarM.g().f10034a.entrySet()).iterator();
                while (((com.google.gson.internal.h) it).hasNext()) {
                    com.google.gson.internal.j jVarB = ((com.google.gson.internal.h) it).b();
                    linkedHashMap.put(jVarB.getKey(), ((com.google.gson.o) jVarB.getValue()).j());
                }
            }
            linkedHashMap.toString();
            yk.a.a();
            F7.a aVar = (F7.a) this.c.get();
            kotlin.jvm.internal.j.d(strJ);
            ((MayaDashboardFragment) aVar).J1(strJ, linkedHashMap);
            if (this.f217o.contains(strJ)) {
                MayaDashboardFragment mayaDashboardFragment = (MayaDashboardFragment) ((F7.a) this.c.get());
                mayaDashboardFragment.getClass();
                mayaDashboardFragment.q1().g(strJ, W5.e.c, linkedHashMap);
            }
        } catch (Exception e) {
            ">>>> Unable to parse passed analytics event arguments: ".concat(eventArgumentsString);
            yk.a.d();
            e.printStackTrace();
        }
    }
}
