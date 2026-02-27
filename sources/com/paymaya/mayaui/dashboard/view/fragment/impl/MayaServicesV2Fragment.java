package com.paymaya.mayaui.dashboard.view.fragment.impl;

import A7.j;
import Bj.B0;
import Bj.C0165x;
import D.C0187u;
import D7.f;
import F7.b;
import G7.o;
import G7.p;
import G7.q;
import J7.g;
import N5.C0441c;
import N5.C0491z;
import N5.O0;
import O5.a;
import S5.c;
import a7.InterfaceC0641b;
import a7.InterfaceC0643d;
import android.os.Bundle;
import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.R;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.store.M;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import m5.C1847a;
import n5.C1928e;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaServicesV2Fragment extends MayaBaseFragment implements b, InterfaceC0641b, InterfaceC0643d {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public O0 f12180U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f12181V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public RecyclerView f12182W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public NestedScrollView f12183X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f12184Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Space f12185Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ConstraintLayout f12186a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public View f12187b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Group f12188c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public View f12189d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public View f12190e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public View f12191f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public View f12192g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ConstraintLayout f12193h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public View f12194i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Group f12195j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public C0187u f12196k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public j f12197l0;
    public q m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public f f12198n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public BannerAdCarousel f12199o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public M f12200p0;

    public static void J1(MayaServicesV2Fragment mayaServicesV2Fragment, String str) {
        mayaServicesV2Fragment.getClass();
        C1219h c1219hD = C1219h.d(EnumC1215d.SERVICES);
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.ITEM);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hD.j;
        map.put("button", str);
        map.put("button_type", "button");
        mayaServicesV2Fragment.o1().b(c1219hD);
    }

    @Override // ad.InterfaceC0684a
    public final void B0(HashMap map) {
        String str = (String) map.get("unitId");
        String str2 = (String) map.get("action");
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        String str3 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        String str4 = (String) map.get("banner_key");
        String str5 = (String) map.get("priority");
        String str6 = (String) map.get("position");
        String str7 = (String) map.get("unitId");
        String str8 = (String) map.get("action");
        C1219h c1219hE = C1219h.e("SERVICES_" + EnumC1216e.BANNER + Global.UNDERSCORE + AbstractC1173g.G(17));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map2 = c1219hE.j;
        map2.put("position", str6);
        map2.put("key", str7);
        if (str3 == null) {
            str3 = "";
        }
        if (!C2576A.H(str3)) {
            str4 = str3;
        }
        map2.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str4);
        map2.put(SessionDescription.ATTR_TYPE, "CT" + str6);
        map2.put(ImagesContract.URL, str8);
        map2.put("priority", str5);
        c1219hE.i();
        c1220iO1.c(activity, c1219hE);
        C0187u c0187u = this.f12196k0;
        if (c0187u == null) {
            kotlin.jvm.internal.j.n("mCleverTapAPI");
            throw null;
        }
        c0187u.m(str);
        G1().C(str2);
    }

    public final j G1() {
        j jVar = this.f12197l0;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.j.n("mFragmentPresenter");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H1(com.paymaya.domain.model.SecondaryFeature r9, java.lang.String r10, int r11, int r12) {
        /*
            r8 = this;
            java.lang.String r0 = "secondaryFeature"
            kotlin.jvm.internal.j.g(r9, r0)
            com.paymaya.domain.model.FeatureDynamicStatus r0 = r9.mFeatureDynamicStatus()
            if (r0 == 0) goto L11
            java.lang.String r1 = r0.getStatus()
            if (r1 != 0) goto L13
        L11:
            java.lang.String r1 = "no tag"
        L13:
            r2 = 0
            if (r0 == 0) goto L29
            java.lang.String r3 = r0.getStatus()
            java.lang.String r4 = r0.getStartDate()
            java.lang.String r0 = r0.getEndDate()
            boolean r0 = com.paymaya.common.utility.AbstractC1234x.m(r4, r0)
            if (r0 == 0) goto L29
            goto L2a
        L29:
            r3 = r2
        L2a:
            if (r3 != 0) goto L2e
            java.lang.String r3 = ""
        L2e:
            boolean r0 = zj.C2576A.H(r3)
            if (r0 == 0) goto L36
            java.lang.String r3 = "empty"
        L36:
            com.paymaya.common.utility.i r0 = r8.o1()
            com.paymaya.common.utility.d r4 = com.paymaya.common.utility.EnumC1215d.SERVICES
            com.paymaya.common.utility.h r4 = com.paymaya.common.utility.C1219h.d(r4)
            r5 = 17
            r4.n(r5)
            com.paymaya.common.utility.f r5 = com.paymaya.common.utility.EnumC1217f.TILE
            r4.t(r5)
            com.paymaya.common.utility.a r5 = com.paymaya.common.utility.EnumC1212a.ACCOUNT_NUMBER
            java.lang.String r5 = r9.getEventNameForTileAttribute()
            java.util.HashMap r6 = r4.j
            java.lang.String r7 = "tile"
            r6.put(r7, r5)
            java.lang.String r5 = "status"
            r6.put(r5, r3)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r3 = "position"
            r6.put(r3, r11)
            java.lang.String r11 = "tag_name"
            r6.put(r11, r1)
            java.lang.String r11 = "module"
            java.lang.String r1 = "services_dashboard"
            r6.put(r11, r1)
            java.lang.String r11 = java.lang.String.valueOf(r12)
            java.lang.String r12 = "position_widget"
            r6.put(r12, r11)
            G7.q r11 = r8.m0
            if (r11 == 0) goto L82
            com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity r11 = (com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity) r11
            java.lang.String r2 = r11.f12139S
        L82:
            java.lang.String r11 = "source_click"
            r6.put(r11, r2)
            r4.i()
            if (r10 == 0) goto La5
            int r11 = r10.length()
            if (r11 != 0) goto L93
            goto La5
        L93:
            com.paymaya.common.utility.a r11 = com.paymaya.common.utility.EnumC1212a.ACCOUNT_NUMBER
            java.util.HashMap r11 = r4.j
            java.lang.String r12 = "category"
            r11.put(r12, r10)
            com.paymaya.common.utility.a r11 = com.paymaya.common.utility.EnumC1212a.ACCOUNT_NUMBER
            java.util.HashMap r11 = r4.j
            java.lang.String r12 = "section"
            r11.put(r12, r10)
        La5:
            r0.b(r4)
            G7.q r10 = r8.m0
            if (r10 == 0) goto Lb1
            com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity r10 = (com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity) r10
            r10.e2(r9)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.dashboard.view.fragment.impl.MayaServicesV2Fragment.H1(com.paymaya.domain.model.SecondaryFeature, java.lang.String, int, int):void");
    }

    public final void I1(String str) {
        Integer numValueOf;
        int iIntValue;
        f fVar = this.f12198n0;
        if (fVar != null) {
            Iterator it = fVar.e.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                J7.j jVar = (J7.j) it.next();
                if ((jVar instanceof g) && kotlin.jvm.internal.j.b(((g) jVar).f2445b.getId(), str)) {
                    break;
                } else {
                    i++;
                }
            }
            numValueOf = Integer.valueOf(i);
        } else {
            numValueOf = null;
        }
        if (numValueOf == null || (iIntValue = numValueOf.intValue()) == -1) {
            return;
        }
        RecyclerView recyclerView = this.f12182W;
        if (recyclerView != null) {
            recyclerView.postDelayed(new p(this, iIntValue, 0), 200L);
        } else {
            kotlin.jvm.internal.j.n("mRecyclerView");
            throw null;
        }
    }

    @Override // ad.InterfaceC0684a
    public final void c(int i, String str, String str2) {
        C0187u c0187u = this.f12196k0;
        if (c0187u == null) {
            kotlin.jvm.internal.j.n("mCleverTapAPI");
            throw null;
        }
        c0187u.m(str2);
        G1().C(str);
    }

    @Override // a7.InterfaceC0641b
    public final void o0() {
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.m0 = (q) getActivity();
        a aVar = (a) W4.a.e().b().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f12196k0 = (C0187u) aVar.f.get();
        this.f12197l0 = new j((c) aVar.f4724k.get(), aVar.O(), (com.paymaya.data.preference.a) aVar.e.get());
        G1().h(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x0221 A[PHI: r1
  0x0221: PHI (r1v3 int) = 
  (r1v2 int)
  (r1v6 int)
  (r1v7 int)
  (r1v8 int)
  (r1v9 int)
  (r1v10 int)
  (r1v11 int)
  (r1v12 int)
  (r1v13 int)
  (r1v14 int)
  (r1v15 int)
  (r1v16 int)
  (r1v17 int)
  (r1v18 int)
  (r1v19 int)
  (r1v20 int)
  (r1v21 int)
  (r1v22 int)
  (r1v23 int)
  (r1v24 int)
  (r1v25 int)
  (r1v26 int)
  (r1v27 int)
  (r1v28 int)
  (r1v29 int)
  (r1v30 int)
  (r1v31 int)
  (r1v32 int)
  (r1v33 int)
 binds: [B:3:0x001d, B:5:0x0029, B:7:0x0034, B:9:0x003d, B:11:0x0046, B:13:0x004f, B:15:0x0058, B:17:0x0061, B:19:0x006a, B:21:0x0073, B:23:0x007c, B:25:0x0085, B:27:0x008e, B:29:0x0097, B:31:0x00a0, B:33:0x00ad, B:35:0x00b8, B:37:0x00c3, B:39:0x00ce, B:41:0x00d9, B:43:0x00e4, B:45:0x00ef, B:47:0x00fa, B:49:0x0105, B:51:0x0110, B:53:0x011b, B:55:0x0126, B:57:0x0131, B:59:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r27, android.view.ViewGroup r28, android.os.Bundle r29) {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.dashboard.view.fragment.impl.MayaServicesV2Fragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        G1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C1928e c1928e;
        M m = this.f12200p0;
        if (m != null && (c1928e = ((C1847a) m.f11371b).j) != null) {
            B0 b02 = c1928e.f;
            if (b02 != null) {
                b02.b(null);
            }
            NativeCustomFormatAd nativeCustomFormatAd = c1928e.f18624g;
            if (nativeCustomFormatAd != null) {
                nativeCustomFormatAd.destroy();
            }
            c1928e.f18624g = null;
        }
        this.f12200p0 = null;
        super.onDestroyView();
        BannerAdCarousel bannerAdCarousel = this.f12199o0;
        if (bannerAdCarousel != null) {
            bannerAdCarousel.c();
        }
        this.f12180U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        f fVar;
        MayaCarousel mayaCarousel;
        y1();
        this.f10338R = false;
        super.onPause();
        j jVarG1 = G1();
        if (!c.b((c) jVarG1.e, A5.b.f143w1) || (fVar = ((MayaServicesV2Fragment) ((b) jVarG1.c.get())).f12198n0) == null || (mayaCarousel = fVar.f) == null) {
            return;
        }
        mayaCarousel.m();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        f fVar;
        MayaCarousel mayaCarousel;
        f fVar2;
        ArrayList arrayList;
        super.onResume();
        C1220i c1220iO1 = o1();
        C1219h c1219h = new C1219h();
        EnumC1215d enumC1215d = EnumC1215d.SERVICES;
        c1219h.p(enumC1215d);
        c1219h.n(2);
        c1220iO1.b(c1219h);
        j jVarG1 = G1();
        if (!c.b((c) jVarG1.e, A5.b.f146x1) && (fVar2 = ((MayaServicesV2Fragment) ((b) jVarG1.c.get())).f12198n0) != null && ((arrayList = fVar2.e) == null || !arrayList.isEmpty())) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((J7.j) it.next()) instanceof J7.f) {
                    if (c.b((c) jVarG1.e, A5.b.f143w1)) {
                        C1220i c1220iO12 = ((MayaServicesV2Fragment) ((b) jVarG1.c.get())).o1();
                        C1219h c1219h2 = new C1219h();
                        c1219h2.p(enumC1215d);
                        c1219h2.r(EnumC1216e.BANNER);
                        c1219h2.n(2);
                        c1220iO12.b(c1219h2);
                    }
                }
            }
        }
        this.f10338R = true;
        m1().n(10);
        F1();
        j jVarG12 = G1();
        jVarG12.D();
        jVarG12.k();
        q qVar = this.m0;
        if (qVar != null) {
            ((MayaDashboardActivity) qVar).Q(this);
        }
        j jVarG13 = G1();
        if (c.b((c) jVarG13.e, A5.b.f143w1) && (fVar = ((MayaServicesV2Fragment) ((b) jVarG13.c.get())).f12198n0) != null && (mayaCarousel = fVar.f) != null && mayaCarousel.f12022o0) {
            mayaCarousel.k();
        }
        j jVarG14 = G1();
        if (c.b((c) jVarG14.e, A5.b.f148y1)) {
            MayaServicesV2Fragment mayaServicesV2Fragment = (MayaServicesV2Fragment) ((b) jVarG14.c.get());
            if (mayaServicesV2Fragment.f12200p0 == null) {
                M m = new M(mayaServicesV2Fragment, s5.f.f20014b);
                Ag.a aVar = new Ag.a(27);
                C1847a c1847a = (C1847a) m.f11371b;
                c1847a.f17717d = aVar;
                c1847a.e = new Ag.a(28);
                c1847a.f = new C0165x(9);
                mayaServicesV2Fragment.f12200p0 = m;
            }
            M m2 = mayaServicesV2Fragment.f12200p0;
            if (m2 != null) {
                m2.j();
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        O0 o02 = this.f12180U;
        kotlin.jvm.internal.j.d(o02);
        TextView textView = (TextView) ((C0491z) o02.f3835w).h;
        this.f12181V = textView;
        textView.setGravity(8388627);
        TextView textView2 = this.f12181V;
        if (textView2 == null) {
            kotlin.jvm.internal.j.n("mToolbarTitleTextView");
            throw null;
        }
        textView2.setPadding(textView2.getResources().getDimensionPixelSize(R.dimen.maya_margin_small), 0, 0, 0);
        TextView textView3 = this.f12181V;
        if (textView3 == null) {
            kotlin.jvm.internal.j.n("mToolbarTitleTextView");
            throw null;
        }
        TextViewCompat.setTextAppearance(textView3, R.style.JekoBoldH6_Primary);
        O0 o03 = this.f12180U;
        kotlin.jvm.internal.j.d(o03);
        this.f12182W = (RecyclerView) o03.f3832t;
        O0 o04 = this.f12180U;
        kotlin.jvm.internal.j.d(o04);
        this.f12186a0 = o04.f;
        O0 o05 = this.f12180U;
        kotlin.jvm.internal.j.d(o05);
        this.f12183X = (NestedScrollView) o05.f3833u;
        O0 o06 = this.f12180U;
        kotlin.jvm.internal.j.d(o06);
        this.f12185Z = (Space) o06.f3834v;
        O0 o07 = this.f12180U;
        kotlin.jvm.internal.j.d(o07);
        this.f12184Y = o07.f3822d;
        O0 o08 = this.f12180U;
        kotlin.jvm.internal.j.d(o08);
        this.f12187b0 = o08.h;
        O0 o09 = this.f12180U;
        kotlin.jvm.internal.j.d(o09);
        this.f12188c0 = o09.i;
        O0 o010 = this.f12180U;
        kotlin.jvm.internal.j.d(o010);
        this.f12189d0 = o010.f3823g;
        O0 o011 = this.f12180U;
        kotlin.jvm.internal.j.d(o011);
        this.f12190e0 = o011.j;
        O0 o012 = this.f12180U;
        kotlin.jvm.internal.j.d(o012);
        this.f12191f0 = o012.f3825l;
        O0 o013 = this.f12180U;
        kotlin.jvm.internal.j.d(o013);
        this.f12192g0 = o013.e;
        O0 o014 = this.f12180U;
        kotlin.jvm.internal.j.d(o014);
        this.f12193h0 = (ConstraintLayout) ((C0441c) o014.f3831s).f4066b;
        O0 o015 = this.f12180U;
        kotlin.jvm.internal.j.d(o015);
        this.f12194i0 = o015.f3824k;
        O0 o016 = this.f12180U;
        kotlin.jvm.internal.j.d(o016);
        this.f12195j0 = o016.c;
        View view2 = this.f12187b0;
        if (view2 == null) {
            kotlin.jvm.internal.j.n("mContainerMessages");
            throw null;
        }
        view2.setOnClickListener(new o(this, 0));
        View view3 = this.f12189d0;
        if (view3 == null) {
            kotlin.jvm.internal.j.n("mContainerHelpCenter");
            throw null;
        }
        view3.setOnClickListener(new o(this, 1));
        View view4 = this.f12190e0;
        if (view4 == null) {
            kotlin.jvm.internal.j.n("mContainerProfile");
            throw null;
        }
        view4.setOnClickListener(new o(this, 2));
        View view5 = this.f12191f0;
        if (view5 == null) {
            kotlin.jvm.internal.j.n("mContainerSettings");
            throw null;
        }
        view5.setOnClickListener(new o(this, 3));
        View view6 = this.f12192g0;
        if (view6 == null) {
            kotlin.jvm.internal.j.n("mContainerAbout");
            throw null;
        }
        view6.setOnClickListener(new o(this, 4));
        ConstraintLayout constraintLayout = this.f12193h0;
        if (constraintLayout == null) {
            kotlin.jvm.internal.j.n("mContainerAdsInternalOnly");
            throw null;
        }
        constraintLayout.setOnClickListener(new o(this, 5));
        View view7 = this.f12194i0;
        if (view7 == null) {
            kotlin.jvm.internal.j.n("mContainerSecurityCenter");
            throw null;
        }
        view7.setOnClickListener(new o(this, 6));
        G1().j();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.SERVICES;
    }
}
