package com.paymaya.mayaui.login.view.activity.impl;

import D.C0187u;
import E8.E;
import La.a;
import N5.C0444d;
import N5.C0491z;
import N9.g;
import S7.f;
import S7.i;
import S7.j;
import W6.b;
import a9.EnumC0666a;
import ab.e;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import b9.InterfaceC0926b;
import c9.c;
import cj.C1112C;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.domain.model.Consent;
import com.paymaya.domain.model.OngoingRegistration;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PayMayaErrorAction;
import com.paymaya.domain.model.Registration;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaAutoProvisionDataPrivacyPolicyFragment;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyDataPersonalizationFragment;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyPolicyFragment;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyWebContentBottomSheetDialogFragment;
import com.paymaya.mayaui.login.view.fragment.impl.MayaRegistrationIdentityFragment;
import com.paymaya.mayaui.login.view.fragment.impl.MayaRegistrationUserFragment;
import com.paymaya.mayaui.login.view.fragment.impl.MayaVerifyRegistrationFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import f9.InterfaceC1478e;
import h9.o;
import h9.t;
import h9.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import y5.l;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaRegistrationActivity extends l implements InterfaceC0926b, t, o, i, j, f, v, InterfaceC1478e, b, S7.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f12730r = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0444d f12731n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public A7.j f12732o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C1229s f12733p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public OngoingRegistration f12734q = new OngoingRegistration(null, null, null, null, 15, null);

    @Override // S7.f
    public final void B0(float f) {
        L1(1.0f - f);
        D1(f);
        H1(f);
    }

    @Override // f9.InterfaceC1478e
    public final void D() {
        n1();
        B5.i.Q(this, numX49.tnTj78("bjH6"), numX49.tnTj78("bjHa"), null);
    }

    @Override // f9.InterfaceC1478e
    public final void N() {
        n1();
        B5.i.M(this, numX49.tnTj78("bjHX"));
    }

    @Override // y5.g
    public final void Q(Fragment fragment) {
        w1(true);
        y1(true);
        x1(true);
        boolean z4 = fragment instanceof MayaRegistrationUserFragment;
        String strTnTj78 = numX49.tnTj78("bjHG");
        String strTnTj782 = numX49.tnTj78("bjH3");
        String strTnTj783 = numX49.tnTj78("bjHy");
        String strTnTj784 = numX49.tnTj78("bjHv");
        if (z4) {
            String string = getString(R.string.maya_label_registration_user_title_header);
            kotlin.jvm.internal.j.f(string, strTnTj783);
            K1(z.t(string, strTnTj782, strTnTj78));
            t1();
            E1(25);
            R1();
            G1(EnumC0666a.f7067b.a());
            S1();
            C1229s c1229sX1 = X1();
            String strU = AbstractC1213b.u(3);
            kotlin.jvm.internal.j.f(strU, strTnTj784);
            C1229s.d(c1229sX1, this, strU, numX49.tnTj78("bjH7"), numX49.tnTj78("bjHA"), String.valueOf(1), null, null, 96);
            return;
        }
        if (fragment instanceof MayaRegistrationIdentityFragment) {
            String string2 = getString(R.string.maya_label_registration_identity_title_header);
            kotlin.jvm.internal.j.f(string2, strTnTj783);
            K1(z.t(string2, strTnTj782, strTnTj78));
            t1();
            E1(50);
            R1();
            G1(EnumC0666a.c.a());
            S1();
            C1229s c1229sX12 = X1();
            String strU2 = AbstractC1213b.u(3);
            kotlin.jvm.internal.j.f(strU2, strTnTj784);
            C1229s.d(c1229sX12, this, strU2, numX49.tnTj78("bjHY"), numX49.tnTj78("bjHT"), String.valueOf(2), null, null, 96);
            return;
        }
        if ((fragment instanceof MayaDataPrivacyPolicyFragment) || (fragment instanceof MayaAutoProvisionDataPrivacyPolicyFragment)) {
            K1(getString(R.string.maya_label_data_privacy_privacy_policy));
            t1();
            E1(75);
            R1();
            G1(EnumC0666a.f7068d.a());
            S1();
            C1229s c1229sX13 = X1();
            String strU3 = AbstractC1213b.u(3);
            kotlin.jvm.internal.j.f(strU3, strTnTj784);
            C1229s.d(c1229sX13, this, strU3, numX49.tnTj78("bjH0"), Z1(), String.valueOf(3), null, null, 96);
            return;
        }
        if (!(fragment instanceof MayaDataPrivacyDataPersonalizationFragment)) {
            if (fragment instanceof MayaVerifyRegistrationFragment) {
                K1(getString(R.string.maya_label_one_time_pin));
                t1();
                r1();
                s1();
                C1229s c1229sX14 = X1();
                String strU4 = AbstractC1213b.u(8);
                kotlin.jvm.internal.j.f(strU4, strTnTj784);
                C1229s.d(c1229sX14, this, strU4, numX49.tnTj78("bjHp"), null, null, null, null, 120);
                return;
            }
            return;
        }
        K1(getString(R.string.maya_label_data_personalization_title_header));
        t1();
        E1(100);
        R1();
        G1(EnumC0666a.e.a());
        S1();
        C1229s c1229sX15 = X1();
        String strU5 = AbstractC1213b.u(3);
        kotlin.jvm.internal.j.f(strU5, strTnTj784);
        C1229s.d(c1229sX15, this, strU5, Z1(), numX49.tnTj78("bjHR"), String.valueOf(4), null, null, 96);
    }

    public final C1229s X1() {
        C1229s c1229s = this.f12733p;
        if (c1229s != null) {
            return c1229s;
        }
        kotlin.jvm.internal.j.n(numX49.tnTj78("bjHg"));
        throw null;
    }

    public final A7.j Y1() {
        A7.j jVar = this.f12732o;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.j.n(numX49.tnTj78("bjHf"));
        throw null;
    }

    public final String Z1() {
        return p1().e().isSavingsAutoProvisioningEnabled() ? numX49.tnTj78("bjH1") : numX49.tnTj78("bjHn");
    }

    @Override // S7.f
    public final void a(PayMayaError payMayaError, String str) {
    }

    public final void a2(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        C1229s c1229sX1 = X1();
        String strO = AbstractC1213b.o(3);
        kotlin.jvm.internal.j.f(strO, numX49.tnTj78("bjHx"));
        C1229s.c(c1229sX1, this, strO, str, str2, numX49.tnTj78("bjHs"), null, null, null, 224);
    }

    public final void b2(String str, String str2, String str3) {
        kotlin.jvm.internal.j.g(str3, numX49.tnTj78("bjH5"));
        C7.f fVar = new C7.f(15, this, str3);
        MayaDataPrivacyWebContentBottomSheetDialogFragment mayaDataPrivacyWebContentBottomSheetDialogFragment = new MayaDataPrivacyWebContentBottomSheetDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("bjHJ"), str);
        bundle.putString(numX49.tnTj78("bjHI"), str2);
        mayaDataPrivacyWebContentBottomSheetDialogFragment.setArguments(bundle);
        mayaDataPrivacyWebContentBottomSheetDialogFragment.f12310Z = fVar;
        mayaDataPrivacyWebContentBottomSheetDialogFragment.f12311a0 = null;
        mayaDataPrivacyWebContentBottomSheetDialogFragment.show(getSupportFragmentManager(), mayaDataPrivacyWebContentBottomSheetDialogFragment.getTag());
    }

    public final void c2(String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(R.string.pma_label_data_privacy_policy));
        builder.setMessage(R.string.pma_label_by_disagreeing).setPositiveButton(R.string.pma_label_disagree, new c(0, this, str)).setNegativeButton(R.string.pma_label_cancel, new E(2));
        builder.create().show();
    }

    public final void d2(String str, Function1 function1) {
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(0, null, str, null, null, false, null, null, false, TypedValues.PositionType.TYPE_PERCENT_Y);
        mayaErrorDialogFragmentZ.f11851d0 = new e(function1, mayaErrorDialogFragmentZ, 3);
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), numX49.tnTj78("bjHq"));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // S7.i
    public final void e(String str, String str2, Function0 function0, Function0 function02) {
        a aVar = new a(4, function0);
        MayaDataPrivacyWebContentBottomSheetDialogFragment mayaDataPrivacyWebContentBottomSheetDialogFragment = new MayaDataPrivacyWebContentBottomSheetDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("bjHz"), str);
        bundle.putString(numX49.tnTj78("bjHl"), str2);
        mayaDataPrivacyWebContentBottomSheetDialogFragment.setArguments(bundle);
        mayaDataPrivacyWebContentBottomSheetDialogFragment.f12310Z = aVar;
        mayaDataPrivacyWebContentBottomSheetDialogFragment.f12311a0 = null;
        mayaDataPrivacyWebContentBottomSheetDialogFragment.show(getSupportFragmentManager(), mayaDataPrivacyWebContentBottomSheetDialogFragment.getTag());
    }

    public final void e2(PayMayaError payMayaError, Function1 function1) {
        C.Q(this, getCurrentFocus());
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(0, null, null, null, null, false, payMayaError, null, false, 447);
        mayaErrorDialogFragmentZ.f11850c0 = new U8.c(15, this, function1, mayaErrorDialogFragmentZ);
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), numX49.tnTj78("bjHW"));
    }

    @Override // S7.f
    public final OngoingRegistration j0() {
        return this.f12734q;
    }

    @Override // S7.f
    public final void l0(PayMayaError payMayaError, Function1 function1, Function1 function12) {
        String strMSpiel = payMayaError.mSpiel();
        PayMayaErrorAction payMayaErrorActionMAction = payMayaError.mAction();
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(0, null, strMSpiel, payMayaErrorActionMAction != null ? payMayaErrorActionMAction.mTitle() : null, null, false, null, null, false, 499);
        mayaErrorDialogFragmentZ.f11852e0 = new g(mayaErrorDialogFragmentZ, payMayaError, (S7.e) function1, 2);
        mayaErrorDialogFragmentZ.f11851d0 = new Y.e(17, (S7.e) function12, mayaErrorDialogFragmentZ);
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), numX49.tnTj78("bjHP9"));
    }

    @Override // S7.f
    public final void m0() {
    }

    @Override // S7.i
    public final void n0(String str) {
        List<Consent> consentsList;
        OngoingRegistration ongoingRegistration = this.f12734q;
        if (ongoingRegistration == null || (consentsList = ongoingRegistration.getConsentsList()) == null) {
            consentsList = C1112C.f9377a;
        }
        kotlin.jvm.internal.j.g(consentsList, numX49.tnTj78("bjHPP"));
        MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment = new MayaDataPrivacyDataPersonalizationFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(numX49.tnTj78("bjHPb"), new ArrayList<>(consentsList));
        bundle.putString(numX49.tnTj78("bjHP2"), numX49.tnTj78("bjHPL"));
        bundle.putString(numX49.tnTj78("bjHPr"), null);
        mayaDataPrivacyDataPersonalizationFragment.setArguments(bundle);
        AbstractC1236z.i(this, R.id.fragment_container, mayaDataPrivacyDataPersonalizationFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        String strZ1;
        String strTnTj78;
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.fragment_container);
        boolean z4 = fragmentFindFragmentById instanceof MayaRegistrationUserFragment;
        String strTnTj782 = numX49.tnTj78("bjHPZ");
        if (z4) {
            strZ1 = numX49.tnTj78("bjHPk");
        } else {
            if (fragmentFindFragmentById instanceof MayaRegistrationIdentityFragment) {
                strTnTj78 = numX49.tnTj78("bjHPB");
            } else {
                boolean z5 = fragmentFindFragmentById instanceof MayaDataPrivacyDataPersonalizationFragment;
                strTnTj782 = numX49.tnTj78("bjHPu");
                if (z5) {
                    strZ1 = Z1();
                } else if (fragmentFindFragmentById instanceof MayaVerifyRegistrationFragment) {
                    strTnTj78 = numX49.tnTj78("bjHPV");
                } else {
                    strTnTj782 = null;
                    strZ1 = null;
                }
            }
            String str = strTnTj782;
            strTnTj782 = strTnTj78;
            strZ1 = str;
        }
        a2(strTnTj782, strZ1);
        if (fragmentFindFragmentById instanceof MayaDataPrivacyPolicyFragment) {
            c2(numX49.tnTj78("bjHPS"));
        } else if (fragmentFindFragmentById instanceof MayaAutoProvisionDataPrivacyPolicyFragment) {
            c2(numX49.tnTj78("bjHPj"));
        } else {
            super.onBackPressed();
        }
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = W4.a.e().p().f4756a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (B5.i) aVar.f4659D.get();
        this.f21074g = (S5.c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.f12732o = new A7.j((com.paymaya.data.preference.a) aVar.e.get(), aVar.M());
        this.f12733p = (C1229s) aVar.f4684R.get();
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_registration, (ViewGroup) null, false);
        int i = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.fragment_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.f12731n = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 20);
                setContentView(constraintLayout);
                C0444d c0444d = this.f12731n;
                kotlin.jvm.internal.j.d(c0444d);
                Q1(c0444d.f4073d);
                Y1().h(this);
                if (bundle == null) {
                    Y1().j();
                    return;
                } else {
                    this.f12734q = (OngoingRegistration) bundle.getParcelable(numX49.tnTj78("bjHPd"));
                    return;
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("bjHPi").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().c = null;
        Y1().i();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.onOptionsItemSelected_enter(item);
        try {
            kotlin.jvm.internal.j.g(item, "item");
            if (item.getItemId() == 16908332) {
                g1();
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            }
            Callback.onOptionsItemSelected_exit();
            return zOnOptionsItemSelected;
        } catch (Throwable th2) {
            Callback.onOptionsItemSelected_exit();
            throw th2;
        }
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
        kotlin.jvm.internal.j.g(bundle, numX49.tnTj78("bjHPE"));
        bundle.putParcelable(numX49.tnTj78("bjHPF"), this.f12734q);
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
    }

    @Override // y5.q
    public final EnumC1215d q1() {
        return EnumC1215d.REGISTRATION;
    }

    @Override // S7.f
    public final void t(String str, String str2) {
    }

    @Override // S7.f
    public final void u0(ArrayList arrayList) {
        kotlin.jvm.internal.j.g(arrayList, numX49.tnTj78("bjHPH"));
        OngoingRegistration ongoingRegistration = this.f12734q;
        if (ongoingRegistration != null) {
            ongoingRegistration.setConsentsList(arrayList);
        }
    }

    @Override // S7.f
    public final void v(PayMayaError payMayaError, Function1 function1) {
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(0, null, null, null, null, false, payMayaError, null, false, 447);
        mayaErrorDialogFragmentZ.f11851d0 = new e(function1, mayaErrorDialogFragmentZ, 2);
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), numX49.tnTj78("bjHPO"));
    }

    @Override // f9.InterfaceC1478e
    public final void x() {
        n1();
        B5.i.M(this, numX49.tnTj78("bjHPQ"));
    }

    @Override // S7.f
    public final void z(Registration registration) {
        kotlin.jvm.internal.j.g(registration, numX49.tnTj78("bjHPt"));
        AbstractC1236z.i(this, R.id.fragment_container, new MayaVerifyRegistrationFragment(), R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
    }
}
