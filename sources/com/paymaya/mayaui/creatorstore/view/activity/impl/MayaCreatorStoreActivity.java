package com.paymaya.mayaui.creatorstore.view.activity.impl;

import B5.i;
import D.C0187u;
import M7.a;
import N5.C0460j;
import N5.C0491z;
import S5.c;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment;
import com.paymaya.mayaui.creatorstore.view.fragment.impl.MayaCreatorStoreFragment;
import com.paymaya.mayaui.creatorstore.view.fragment.impl.MayaCreatorStoreIntroductionFragment;
import com.paymaya.mayaui.creatorstore.view.fragment.impl.MayaLuckyGamesInterstitialFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import fa.ViewOnClickListenerC1479a;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import m7.InterfaceC1853a;
import q7.b;
import q7.e;
import y5.g;
import y5.q;
import z2.d;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaCreatorStoreActivity extends q implements InterfaceC1853a, g, b, W6.b, e, q7.g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f12105q = 0;
    public a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public EnumC1215d f12106n = EnumC1215d.DEFAULT;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0460j f12107o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C1219h f12108p;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        L1(1.0f);
    }

    public final a V1() {
        a aVar = this.m;
        if (aVar != null) {
            return aVar;
        }
        j.n(numX49.tnTj78("btnP"));
        throw null;
    }

    public final void W1(String str) {
        MayaCreatorStoreIntroductionFragment mayaCreatorStoreIntroductionFragment = new MayaCreatorStoreIntroductionFragment();
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("btnb"), str);
        mayaCreatorStoreIntroductionFragment.setArguments(bundle);
        AbstractC1236z.g(this, R.id.frame_layout_container, mayaCreatorStoreIntroductionFragment);
    }

    public final void X1(String str) {
        j.g(str, numX49.tnTj78("btn2"));
        Intent intent = getIntent();
        String strTnTj78 = numX49.tnTj78("btnL");
        String stringExtra = intent.getStringExtra(strTnTj78);
        MayaCreatorStoreFragment mayaCreatorStoreFragment = new MayaCreatorStoreFragment();
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("btnr"), str);
        bundle.putString(strTnTj78, stringExtra);
        mayaCreatorStoreFragment.setArguments(bundle);
        AbstractC1236z.g(this, R.id.frame_layout_container, mayaCreatorStoreFragment);
    }

    public final void Y1() {
        String string = getString(R.string.maya_label_upgrade_dialog_title);
        j.f(string, numX49.tnTj78("btnZ"));
        MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN = d.n(2131231670, string, getString(R.string.maya_label_upgrade_dialog_description), new Pair(getString(R.string.maya_label_upgrade_now), new com.squareup.wire.internal.a(this, 14)), new Pair(getString(R.string.maya_label_maybe_later), null), null, 32);
        mayaAlertBottomSheetDialogFragmentN.s1(mayaAlertBottomSheetDialogFragmentN.f11818a0);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        j.f(fragmentTransactionBeginTransaction, numX49.tnTj78("btnk"));
        fragmentTransactionBeginTransaction.add(mayaAlertBottomSheetDialogFragmentN, numX49.tnTj78("btnB"));
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    public final void Z1(String str, String str2) {
        j.g(str, numX49.tnTj78("btnu"));
        MayaCreatorStoreActivity mayaCreatorStoreActivity = (MayaCreatorStoreActivity) ((InterfaceC1853a) V1().c.get());
        mayaCreatorStoreActivity.getClass();
        mayaCreatorStoreActivity.n1();
        Intent intentS0 = i.s0(mayaCreatorStoreActivity);
        intentS0.putExtra(numX49.tnTj78("btnV"), str);
        intentS0.putExtra(numX49.tnTj78("btnS"), str2);
        intentS0.putExtra(numX49.tnTj78("btnj"), true);
        intentS0.putExtra(numX49.tnTj78("btnd"), true);
        mayaCreatorStoreActivity.startActivity(intentS0);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = W4.a.e().j().f4753a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        com.paymaya.data.preference.a aVar2 = (com.paymaya.data.preference.a) aVar.e.get();
        c cVar = (c) aVar.f4724k.get();
        j.g(aVar2, numX49.tnTj78("btni"));
        j.g(cVar, numX49.tnTj78("btnE"));
        this.m = new a(aVar2, cVar, 5);
        super.onCreate(bundle);
        M1(R.color.light_light);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_creator_store_activity, (ViewGroup) null, false);
        int i = R.id.frame_layout_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_layout_container);
        if (frameLayout != null) {
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                this.f12107o = new C0460j((ConstraintLayout) viewInflate, frameLayout, C0491z.a(viewFindChildViewById), 2);
                this.f12108p = C1219h.d(this.f12106n);
                C0460j c0460j = this.f12107o;
                j.d(c0460j);
                setContentView(c0460j.f4123b);
                C0460j c0460j2 = this.f12107o;
                j.d(c0460j2);
                Q1(c0460j2.f4124d);
                w1(true);
                x1(true);
                K1(getIntent().getStringExtra(numX49.tnTj78("btnF")));
                C0460j c0460j3 = this.f12107o;
                j.d(c0460j3);
                ((Toolbar) c0460j3.f4124d.e).setNavigationOnClickListener(new ViewOnClickListenerC1479a(this, 17));
                V1().h(this);
                if (bundle == null) {
                    String stringExtra = getIntent().getStringExtra(numX49.tnTj78("btnH"));
                    if (stringExtra == null) {
                        stringExtra = numX49.tnTj78("btnO");
                    }
                    a aVarV1 = V1();
                    int iHashCode = stringExtra.hashCode();
                    EnumC1215d enumC1215d = EnumC1215d.STOCKS;
                    String strTnTj78 = numX49.tnTj78("btnQ");
                    String strTnTj782 = numX49.tnTj78("btnt");
                    switch (iHashCode) {
                        case -1545324671:
                            if (stringExtra.equals(numX49.tnTj78("btn3"))) {
                                InterfaceC1853a interfaceC1853a = (InterfaceC1853a) aVarV1.c.get();
                                EnumC1215d enumC1215d2 = EnumC1215d.REMITTANCE;
                                MayaCreatorStoreActivity mayaCreatorStoreActivity = (MayaCreatorStoreActivity) interfaceC1853a;
                                mayaCreatorStoreActivity.getClass();
                                mayaCreatorStoreActivity.f12106n = enumC1215d2;
                                aVarV1.l(stringExtra);
                                return;
                            }
                            break;
                        case -1530938276:
                            if (stringExtra.equals(numX49.tnTj78("btnG"))) {
                                InterfaceC1853a interfaceC1853a2 = (InterfaceC1853a) aVarV1.c.get();
                                EnumC1215d enumC1215d3 = EnumC1215d.MERCHANT_REWARDS;
                                MayaCreatorStoreActivity mayaCreatorStoreActivity2 = (MayaCreatorStoreActivity) interfaceC1853a2;
                                mayaCreatorStoreActivity2.getClass();
                                mayaCreatorStoreActivity2.f12106n = enumC1215d3;
                                ((MayaCreatorStoreActivity) ((InterfaceC1853a) aVarV1.c.get())).X1(stringExtra);
                                return;
                            }
                            break;
                        case -934416125:
                            if (stringExtra.equals(numX49.tnTj78("btnX"))) {
                                InterfaceC1853a interfaceC1853a3 = (InterfaceC1853a) aVarV1.c.get();
                                EnumC1215d enumC1215d4 = EnumC1215d.RETAIL;
                                MayaCreatorStoreActivity mayaCreatorStoreActivity3 = (MayaCreatorStoreActivity) interfaceC1853a3;
                                mayaCreatorStoreActivity3.getClass();
                                mayaCreatorStoreActivity3.f12106n = enumC1215d4;
                                ((MayaCreatorStoreActivity) ((InterfaceC1853a) aVarV1.c.get())).X1(stringExtra);
                                return;
                            }
                            break;
                        case -892081123:
                            String strTnTj783 = numX49.tnTj78("btnN");
                            if (stringExtra.equals(strTnTj783)) {
                                MayaCreatorStoreActivity mayaCreatorStoreActivity4 = (MayaCreatorStoreActivity) ((InterfaceC1853a) aVarV1.c.get());
                                mayaCreatorStoreActivity4.getClass();
                                mayaCreatorStoreActivity4.f12106n = enumC1215d;
                                C1219h c1219h = ((MayaCreatorStoreActivity) ((InterfaceC1853a) aVarV1.c.get())).f12108p;
                                if (c1219h == null) {
                                    j.n(strTnTj78);
                                    throw null;
                                }
                                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                                c1219h.j.put(strTnTj782, numX49.tnTj78("btn6"));
                                if (aVarV1.e.f11330b.getBoolean(numX49.tnTj78("btna"), false)) {
                                    ((MayaCreatorStoreActivity) ((InterfaceC1853a) aVarV1.c.get())).X1(strTnTj783);
                                    return;
                                } else {
                                    ((MayaCreatorStoreActivity) ((InterfaceC1853a) aVarV1.c.get())).W1(strTnTj783);
                                    return;
                                }
                            }
                            break;
                        case -891990144:
                            if (stringExtra.equals(numX49.tnTj78("btnM"))) {
                                InterfaceC1853a interfaceC1853a4 = (InterfaceC1853a) aVarV1.c.get();
                                EnumC1215d enumC1215d5 = EnumC1215d.STREAM;
                                MayaCreatorStoreActivity mayaCreatorStoreActivity5 = (MayaCreatorStoreActivity) interfaceC1853a4;
                                mayaCreatorStoreActivity5.getClass();
                                mayaCreatorStoreActivity5.f12106n = enumC1215d5;
                                aVarV1.l(stringExtra);
                                return;
                            }
                            break;
                        case -333858186:
                            if (stringExtra.equals(numX49.tnTj78("btnh"))) {
                                InterfaceC1853a interfaceC1853a5 = (InterfaceC1853a) aVarV1.c.get();
                                EnumC1215d enumC1215d6 = EnumC1215d.SPARK_HACKATHON;
                                MayaCreatorStoreActivity mayaCreatorStoreActivity6 = (MayaCreatorStoreActivity) interfaceC1853a5;
                                mayaCreatorStoreActivity6.getClass();
                                mayaCreatorStoreActivity6.f12106n = enumC1215d6;
                                aVarV1.l(stringExtra);
                                return;
                            }
                            break;
                        case -286971687:
                            if (stringExtra.equals(numX49.tnTj78("btnD"))) {
                                InterfaceC1853a interfaceC1853a6 = (InterfaceC1853a) aVarV1.c.get();
                                EnumC1215d enumC1215d7 = EnumC1215d.LUCKY_GAMES;
                                MayaCreatorStoreActivity mayaCreatorStoreActivity7 = (MayaCreatorStoreActivity) interfaceC1853a6;
                                mayaCreatorStoreActivity7.getClass();
                                mayaCreatorStoreActivity7.f12106n = enumC1215d7;
                                if (!c.b(aVarV1.f, A5.b.f132s)) {
                                    ((MayaCreatorStoreActivity) ((InterfaceC1853a) aVarV1.c.get())).W1(stringExtra);
                                    return;
                                }
                                MayaCreatorStoreActivity mayaCreatorStoreActivity8 = (MayaCreatorStoreActivity) ((InterfaceC1853a) aVarV1.c.get());
                                mayaCreatorStoreActivity8.getClass();
                                AbstractC1236z.g(mayaCreatorStoreActivity8, R.id.frame_layout_container, new MayaLuckyGamesInterstitialFragment());
                                return;
                            }
                            break;
                        case 3148894:
                            if (stringExtra.equals(numX49.tnTj78("btnm"))) {
                                InterfaceC1853a interfaceC1853a7 = (InterfaceC1853a) aVarV1.c.get();
                                EnumC1215d enumC1215d8 = EnumC1215d.FOOD;
                                MayaCreatorStoreActivity mayaCreatorStoreActivity9 = (MayaCreatorStoreActivity) interfaceC1853a7;
                                mayaCreatorStoreActivity9.getClass();
                                mayaCreatorStoreActivity9.f12106n = enumC1215d8;
                                ((MayaCreatorStoreActivity) ((InterfaceC1853a) aVarV1.c.get())).X1(stringExtra);
                                return;
                            }
                            break;
                        case 73049818:
                            if (stringExtra.equals(numX49.tnTj78("btnc"))) {
                                InterfaceC1853a interfaceC1853a8 = (InterfaceC1853a) aVarV1.c.get();
                                EnumC1215d enumC1215d9 = EnumC1215d.INSURANCE;
                                MayaCreatorStoreActivity mayaCreatorStoreActivity10 = (MayaCreatorStoreActivity) interfaceC1853a8;
                                mayaCreatorStoreActivity10.getClass();
                                mayaCreatorStoreActivity10.f12106n = enumC1215d9;
                                aVarV1.l(stringExtra);
                                return;
                            }
                            break;
                        case 96805985:
                            if (stringExtra.equals(numX49.tnTj78("btnw"))) {
                                InterfaceC1853a interfaceC1853a9 = (InterfaceC1853a) aVarV1.c.get();
                                EnumC1215d enumC1215d10 = EnumC1215d.ESIMS;
                                MayaCreatorStoreActivity mayaCreatorStoreActivity11 = (MayaCreatorStoreActivity) interfaceC1853a9;
                                mayaCreatorStoreActivity11.getClass();
                                mayaCreatorStoreActivity11.f12106n = enumC1215d10;
                                ((MayaCreatorStoreActivity) ((InterfaceC1853a) aVarV1.c.get())).X1(stringExtra);
                                return;
                            }
                            break;
                        case 256272768:
                            String strTnTj784 = numX49.tnTj78("btn4");
                            if (stringExtra.equals(strTnTj784)) {
                                MayaCreatorStoreActivity mayaCreatorStoreActivity12 = (MayaCreatorStoreActivity) ((InterfaceC1853a) aVarV1.c.get());
                                mayaCreatorStoreActivity12.getClass();
                                mayaCreatorStoreActivity12.f12106n = enumC1215d;
                                C1219h c1219h2 = ((MayaCreatorStoreActivity) ((InterfaceC1853a) aVarV1.c.get())).f12108p;
                                if (c1219h2 == null) {
                                    j.n(strTnTj78);
                                    throw null;
                                }
                                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                                c1219h2.j.put(strTnTj782, numX49.tnTj78("btno"));
                                if (aVarV1.e.f11330b.getBoolean(numX49.tnTj78("btnK"), false)) {
                                    ((MayaCreatorStoreActivity) ((InterfaceC1853a) aVarV1.c.get())).X1(strTnTj784);
                                    return;
                                } else {
                                    ((MayaCreatorStoreActivity) ((InterfaceC1853a) aVarV1.c.get())).W1(strTnTj784);
                                    return;
                                }
                            }
                            break;
                        case 480401905:
                            if (stringExtra.equals(numX49.tnTj78("btnC"))) {
                                InterfaceC1853a interfaceC1853a10 = (InterfaceC1853a) aVarV1.c.get();
                                EnumC1215d enumC1215d11 = EnumC1215d.GOVERNMENT;
                                MayaCreatorStoreActivity mayaCreatorStoreActivity13 = (MayaCreatorStoreActivity) interfaceC1853a10;
                                mayaCreatorStoreActivity13.getClass();
                                mayaCreatorStoreActivity13.f12106n = enumC1215d11;
                                ((MayaCreatorStoreActivity) ((InterfaceC1853a) aVarV1.c.get())).X1(stringExtra);
                                return;
                            }
                            break;
                        case 684122511:
                            if (stringExtra.equals(numX49.tnTj78("btn8"))) {
                                InterfaceC1853a interfaceC1853a11 = (InterfaceC1853a) aVarV1.c.get();
                                EnumC1215d enumC1215d12 = EnumC1215d.STOCKS_GAME;
                                MayaCreatorStoreActivity mayaCreatorStoreActivity14 = (MayaCreatorStoreActivity) interfaceC1853a11;
                                mayaCreatorStoreActivity14.getClass();
                                mayaCreatorStoreActivity14.f12106n = enumC1215d12;
                                aVarV1.l(stringExtra);
                                return;
                            }
                            break;
                        case 698454066:
                            if (stringExtra.equals(numX49.tnTj78("btne"))) {
                                InterfaceC1853a interfaceC1853a12 = (InterfaceC1853a) aVarV1.c.get();
                                EnumC1215d enumC1215d13 = EnumC1215d.FUNDS;
                                MayaCreatorStoreActivity mayaCreatorStoreActivity15 = (MayaCreatorStoreActivity) interfaceC1853a12;
                                mayaCreatorStoreActivity15.getClass();
                                mayaCreatorStoreActivity15.f12106n = enumC1215d13;
                                aVarV1.l(stringExtra);
                                return;
                            }
                            break;
                        case 1381645028:
                            if (stringExtra.equals(numX49.tnTj78("btnU"))) {
                                InterfaceC1853a interfaceC1853a13 = (InterfaceC1853a) aVarV1.c.get();
                                EnumC1215d enumC1215d14 = EnumC1215d.PAYLATER;
                                MayaCreatorStoreActivity mayaCreatorStoreActivity16 = (MayaCreatorStoreActivity) interfaceC1853a13;
                                mayaCreatorStoreActivity16.getClass();
                                mayaCreatorStoreActivity16.f12106n = enumC1215d14;
                                ((MayaCreatorStoreActivity) ((InterfaceC1853a) aVarV1.c.get())).X1(stringExtra);
                                return;
                            }
                            break;
                    }
                    InterfaceC1853a interfaceC1853a14 = (InterfaceC1853a) aVarV1.c.get();
                    EnumC1215d enumC1215d15 = EnumC1215d.DEFAULT;
                    MayaCreatorStoreActivity mayaCreatorStoreActivity17 = (MayaCreatorStoreActivity) interfaceC1853a14;
                    mayaCreatorStoreActivity17.getClass();
                    mayaCreatorStoreActivity17.f12106n = enumC1215d15;
                    ((MayaCreatorStoreActivity) ((InterfaceC1853a) aVarV1.c.get())).X1(stringExtra);
                    return;
                }
                return;
            }
            i = R.id.toolbar;
        }
        throw new NullPointerException(numX49.tnTj78("btny").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6287x = null;
        V1().i();
        super.onDestroy();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        super.onResume();
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        iKNpI8.pX3PN6(this);
        super.onStart();
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        iKNpI8.xoZZl9(this);
        super.onStop();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zZN5YC5 = hxOD26.zN5YC5(motionEvent);
        return !zZN5YC5 ? super.onTouchEvent(motionEvent) : zZN5YC5;
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        iKNpI8.fBndJ9(this);
        super.onUserInteraction();
        n1().u0(this);
    }

    @Override // y5.q
    public final EnumC1215d q1() {
        return this.f12106n;
    }
}
