package com.paymaya.mayaui.newmayacredit.view.activity.impl;

import B5.i;
import C2.f;
import D.C0187u;
import G6.m;
import G7.F;
import L9.n;
import M9.d;
import N5.C0444d;
import N5.C0491z;
import Q9.B;
import Q9.H;
import Q9.I;
import Q9.InterfaceC0573c;
import Q9.InterfaceC0574d;
import Q9.InterfaceC0578h;
import Q9.InterfaceC0581k;
import Q9.InterfaceC0583m;
import Q9.L;
import Q9.O;
import Q9.q;
import Q9.s;
import Q9.u;
import Q9.v;
import W6.b;
import W6.c;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import cj.M;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.E;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.CreditAgreement;
import com.paymaya.domain.model.CreditResponse;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.store.K;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaContactsSelectionFragment;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditActivationAllSetEnhanceFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditConfirmTransferFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditTransferFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaAgreementSettingsBottomSheetFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditActivationConfirmDetailFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditAssignContactReferenceFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditEnhancedActivationFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditInterestRateBottomSheetFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditOTPFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditSummaryFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditUpdatePersonalDetailsContactReferenceFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import y5.l;
import yk.a;

/* JADX INFO: loaded from: classes4.dex */
public final class NewMayaCreditActivity extends l implements d, B, s, u, H, InterfaceC0581k, I, L, InterfaceC0578h, InterfaceC0574d, O, q, Y6.d, InterfaceC0583m, InterfaceC0573c, v, c, b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f13081x = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0444d f13082n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m f13083o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public FlutterEngine f13084p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public pg.u f13085q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public n f13086r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f13087s = numX49.tnTj78("bjKU");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Function1 f13088t = new F(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ActivityResultLauncher f13089u = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new N9.d(this));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ActivityResultLauncher f13090v = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new f(7));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f13091w = true;

    public static void Z1() {
        E.a(numX49.tnTj78("bjKe"), numX49.tnTj78("bjK8"));
        FlutterEngineCache.getInstance().remove(numX49.tnTj78("bjKC"));
    }

    public static final void e2(MayaErrorDialogFragment mayaErrorDialogFragment, NewMayaCreditActivity newMayaCreditActivity) {
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        Map mapH = M.h(new Pair(numX49.tnTj78("bjK4"), numX49.tnTj78("bjKo")), new Pair(numX49.tnTj78("bjKK"), mayaErrorDialogFragment.getString(R.string.maya_label_got_it)));
        String strB = C.b(AbstractC1213b.z(1), EnumC1217f.DEV_SETTINGS, 16);
        j.f(strB, numX49.tnTj78("bjKw"));
        newMayaCreditActivity.Y1(strB, mapH);
        Intent intent = new Intent(numX49.tnTj78("bjKc"));
        intent.setData(Uri.fromParts(numX49.tnTj78("bjKm"), mayaErrorDialogFragment.requireContext().getPackageName(), null));
        try {
            newMayaCreditActivity.f13090v.launch(intent);
        } catch (ActivityNotFoundException unused) {
            a.b();
        }
    }

    public static final void i2(MayaErrorDialogFragment mayaErrorDialogFragment, NewMayaCreditActivity newMayaCreditActivity, String str) {
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        newMayaCreditActivity.Y1(str, M.h(new Pair(numX49.tnTj78("bjKD"), numX49.tnTj78("bjKh")), new Pair(numX49.tnTj78("bjKM"), mayaErrorDialogFragment.getString(R.string.maya_label_go_to_settings))));
        Intent intent = new Intent(numX49.tnTj78("bjKN"));
        intent.setData(Uri.fromParts(numX49.tnTj78("bjK6"), mayaErrorDialogFragment.requireContext().getPackageName(), null));
        try {
            newMayaCreditActivity.f13090v.launch(intent);
        } catch (ActivityNotFoundException unused) {
            a.b();
        }
    }

    @Override // y5.q, W6.f
    public final void E(String str, Dialog dialog) {
        super.E(str, dialog);
        if (j.b(str, numX49.tnTj78("bjKa"))) {
            E.a(numX49.tnTj78("bjKX"), numX49.tnTj78("bjKG"));
            n1().k0(this, numX49.tnTj78("bjK3"));
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    @Override // y5.g
    public final void Q(Fragment fragment) {
        String string;
        String string2;
        if (fragment instanceof NewMayaCreditSummaryFragment) {
            K1(getString(R.string.maya_label_account_summary));
            return;
        }
        if (fragment instanceof MayaCreditTransferFragment) {
            E1(50);
            R1();
            G1(getString(R.string.maya_label_toolbar_steps_50_percent));
            S1();
            return;
        }
        if (fragment instanceof MayaCreditConfirmTransferFragment) {
            E1(100);
            R1();
            G1(getString(R.string.maya_label_toolbar_steps_100_percent));
            S1();
            return;
        }
        boolean z4 = fragment instanceof NewMayaCreditEnhancedActivationFragment;
        String strTnTj78 = numX49.tnTj78("bjKy");
        if (z4) {
            NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) ((d) X1().c.get());
            m mVarX1 = newMayaCreditActivity.X1();
            A5.b bVar = A5.b.f76S;
            newMayaCreditActivity.E1(S5.c.b((S5.c) mVarX1.f, bVar) ? 50 : 30);
            newMayaCreditActivity.R1();
            m mVarX12 = newMayaCreditActivity.X1();
            if (S5.c.b((S5.c) mVarX12.f, bVar)) {
                string2 = ((NewMayaCreditActivity) ((d) mVarX12.c.get())).getString(R.string.maya_label_toolbar_steps_50_percent);
                j.f(string2, strTnTj78);
            } else {
                string2 = ((NewMayaCreditActivity) ((d) mVarX12.c.get())).getString(R.string.maya_label_toolbar_steps_30_percent);
                j.f(string2, strTnTj78);
            }
            newMayaCreditActivity.G1(string2);
            newMayaCreditActivity.S1();
            return;
        }
        if (fragment instanceof NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) {
            E1(30);
            R1();
            G1(getString(R.string.maya_label_toolbar_steps_30_percent));
            S1();
            t1();
            return;
        }
        if (fragment instanceof NewMayaCreditAssignContactReferenceFragment) {
            E1(60);
            R1();
            G1(getString(R.string.maya_label_toolbar_steps_60_percent));
            S1();
            t1();
            return;
        }
        if (fragment instanceof MayaContactsSelectionFragment) {
            K1(getString(R.string.maya_label_all_contacts_title));
            T1();
            r1();
            s1();
            U1();
            return;
        }
        if (!(fragment instanceof NewMayaCreditActivationConfirmDetailFragment)) {
            if (fragment instanceof MayaCreditActivationAllSetEnhanceFragment) {
                r1();
                t1();
                w1(false);
                return;
            } else {
                if (fragment instanceof NewMayaCreditOTPFragment) {
                    NewMayaCreditActivity newMayaCreditActivity2 = (NewMayaCreditActivity) ((d) X1().c.get());
                    newMayaCreditActivity2.r1();
                    newMayaCreditActivity2.s1();
                    w1(true);
                    return;
                }
                return;
            }
        }
        X1();
        E1(100);
        R1();
        m mVarX13 = X1();
        if (S5.c.b((S5.c) mVarX13.f, A5.b.f76S)) {
            string = ((NewMayaCreditActivity) ((d) mVarX13.c.get())).getString(R.string.maya_label_toolbar_steps_100_percent);
            j.f(string, strTnTj78);
        } else {
            string = ((NewMayaCreditActivity) ((d) mVarX13.c.get())).getString(R.string.maya_label_toolbar_steps_90_percent);
            j.f(string, strTnTj78);
        }
        G1(string);
        S1();
        w1(true);
    }

    @Override // Y6.d
    public final void U() {
        E.a(numX49.tnTj78("bjKv"), numX49.tnTj78("bjK7"));
        AbstractC1236z.f(this);
    }

    @Override // y5.l
    public final void W1() {
        E.a(numX49.tnTj78("bjKA"), numX49.tnTj78("bjKY"));
        super.W1();
    }

    public final m X1() {
        m mVar = this.f13083o;
        if (mVar != null) {
            return mVar;
        }
        j.n(numX49.tnTj78("bjKT"));
        throw null;
    }

    public final void Y1(String str, Map map) {
        C1220i c1220iK1 = k1();
        C1219h c1219hE = C1219h.e(str);
        for (Map.Entry entry : map.entrySet()) {
            c1219hE.h((String) entry.getKey(), (String) entry.getValue());
        }
        Unit unit = Unit.f18162a;
        c1220iK1.c(this, c1219hE);
    }

    @Override // y5.j
    public final void a(PayMayaError payMayaError, String str) {
        LinkedHashSet linkedHashSet = E.f10412a;
        E.a(numX49.tnTj78("bjKp"), numX49.tnTj78("bjKR") + str);
        M2.b.Z(0, null, null, null, null, false, payMayaError, null, false, 447).show(getSupportFragmentManager(), numX49.tnTj78("bjK0"));
    }

    public final void a2(CreditReviewUiModel creditReviewUiModel) {
        j.g(creditReviewUiModel, numX49.tnTj78("bjKg"));
        E.a(numX49.tnTj78("bjKf"), numX49.tnTj78("bjK1"));
        getWindow().setSoftInputMode(48);
        NewMayaCreditActivationConfirmDetailFragment newMayaCreditActivationConfirmDetailFragment = new NewMayaCreditActivationConfirmDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(numX49.tnTj78("bjKn"), creditReviewUiModel);
        newMayaCreditActivationConfirmDetailFragment.setArguments(bundle);
        AbstractC1236z.h(this, R.id.fragment_container, newMayaCreditActivationConfirmDetailFragment);
    }

    public final void b2(int i, CreditAgreement creditAgreement, Function1 function1) {
        j.g(creditAgreement, numX49.tnTj78("bjKx"));
        LinkedHashSet linkedHashSet = E.f10412a;
        E.a(numX49.tnTj78("bjK5"), numX49.tnTj78("bjKs") + i);
        String strD = AbstractC1236z.d(this, NewMayaAgreementSettingsBottomSheetFragment.class);
        NewMayaAgreementSettingsBottomSheetFragment newMayaAgreementSettingsBottomSheetFragment = new NewMayaAgreementSettingsBottomSheetFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(numX49.tnTj78("bjKJ"), i);
        bundle.putParcelable(numX49.tnTj78("bjKI"), creditAgreement);
        bundle.putBoolean(numX49.tnTj78("bjKq"), true);
        newMayaAgreementSettingsBottomSheetFragment.setArguments(bundle);
        newMayaAgreementSettingsBottomSheetFragment.f13141Y = function1;
        newMayaAgreementSettingsBottomSheetFragment.show(getSupportFragmentManager(), strD);
    }

    public final void c2(CreditReviewUiModel creditReviewUiModel) {
        j.g(creditReviewUiModel, numX49.tnTj78("bjKz"));
        E.a(numX49.tnTj78("bjKl"), numX49.tnTj78("bjKW"));
        X1().f1802k = creditReviewUiModel;
        getWindow().setSoftInputMode(48);
        AbstractC1236z.h(this, R.id.fragment_container, new NewMayaCreditAssignContactReferenceFragment());
    }

    public final void d2(String str, String str2, double d10) {
        E.a(numX49.tnTj78("bjKP9"), numX49.tnTj78("bjKPP"));
        String strD = AbstractC1236z.d(this, NewMayaCreditInterestRateBottomSheetFragment.class);
        NewMayaCreditInterestRateBottomSheetFragment newMayaCreditInterestRateBottomSheetFragment = new NewMayaCreditInterestRateBottomSheetFragment();
        Bundle bundle = new Bundle();
        bundle.putDouble(numX49.tnTj78("bjKPb"), d10);
        bundle.putString(numX49.tnTj78("bjKP2"), str2);
        bundle.putString(numX49.tnTj78("bjKPL"), str);
        newMayaCreditInterestRateBottomSheetFragment.setArguments(bundle);
        newMayaCreditInterestRateBottomSheetFragment.show(getSupportFragmentManager(), strD);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    public final void f2(View.OnClickListener onClickListener) {
        E.a(numX49.tnTj78("bjKPr"), numX49.tnTj78("bjKPZ"));
        M2.b.Z(0, getString(R.string.maya_label_location_service_error_title), getString(R.string.maya_label_location_service_error_message), getString(R.string.maya_label_try_again), getString(R.string.maya_label_got_it), false, null, onClickListener, false, 353).show(getSupportFragmentManager(), numX49.tnTj78("bjKPk"));
    }

    public final void g2(String str) {
        E.a(numX49.tnTj78("bjKPB"), numX49.tnTj78("bjKPu"));
        NewMayaCreditOTPFragment newMayaCreditOTPFragment = new NewMayaCreditOTPFragment();
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("bjKPV"), str);
        newMayaCreditOTPFragment.setArguments(bundle);
        AbstractC1236z.h(this, R.id.fragment_container, newMayaCreditOTPFragment);
    }

    public final void h2() {
        E.a(numX49.tnTj78("bjKPS"), numX49.tnTj78("bjKPj"));
        AbstractC1236z.g(this, R.id.fragment_container, new NewMayaCreditSummaryFragment());
    }

    @Override // y5.q
    public final boolean l1() {
        return this.f13091w;
    }

    @Override // y5.j
    public final void o(String str, String str2) {
        LinkedHashSet linkedHashSet = E.f10412a;
        E.a(numX49.tnTj78("bjKPi"), numX49.tnTj78("bjKPd") + str);
        M2.b.Z(0, null, str2, null, null, false, null, null, false, TypedValues.PositionType.TYPE_PERCENT_Y).show(getSupportFragmentManager(), numX49.tnTj78("bjKPE"));
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        super.onCreate(bundle);
        O5.a aVar = W4.a.e().D().f4752a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (S5.c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        com.paymaya.data.preference.a aVar2 = (com.paymaya.data.preference.a) aVar.e.get();
        S5.c cVar = (S5.c) aVar.f4724k.get();
        K k8 = (K) aVar.f4671K.get();
        com.paymaya.domain.store.C cN = aVar.n();
        C1220i c1220i = (C1220i) aVar.f4716g.get();
        j.g(aVar2, numX49.tnTj78("bjKPF"));
        j.g(cVar, numX49.tnTj78("bjKPH"));
        j.g(k8, numX49.tnTj78("bjKPO"));
        j.g(c1220i, numX49.tnTj78("bjKPQ"));
        this.f13083o = new m(aVar2, cVar, k8, cN, c1220i);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_maya_credit, (ViewGroup) null, false);
        int i = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.fragment_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.f13082n = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 11);
                setContentView(constraintLayout);
                C0444d c0444d = this.f13082n;
                j.d(c0444d);
                Q1(c0444d.f4073d);
                X1().h(this);
                String strTnTj78 = numX49.tnTj78("bjKPt");
                if (bundle == null) {
                    X1().j = (CreditResponse) getIntent().getParcelableExtra(strTnTj78);
                    X1().j();
                } else {
                    X1().j = (CreditResponse) bundle.getParcelable(strTnTj78);
                }
                C0444d c0444d2 = this.f13082n;
                j.d(c0444d2);
                ((Toolbar) c0444d2.f4073d.e).setNavigationOnClickListener(new M8.L(this, 20));
                return;
            }
        }
        throw new NullPointerException(numX49.tnTj78("bjKPU").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        super.onDestroy();
        W4.a.e().f6246E = null;
        X1().i();
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

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        j.g(bundle, numX49.tnTj78("bjKPe"));
        bundle.putParcelable(numX49.tnTj78("bjKP8"), (CreditResponse) X1().j);
        super.onSaveInstanceState(bundle);
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
        return EnumC1215d.CREDIT;
    }
}
