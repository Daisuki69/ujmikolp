package com.paymaya.mayaui.dataprivacy.view.activity.impl;

import N5.C0444d;
import N7.a;
import S7.f;
import S7.i;
import S7.j;
import W6.b;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.OngoingRegistration;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.Registration;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyDataPersonalizationFragment;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyPolicyFragment;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyWebContentBottomSheetDialogFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import y5.q;
import z2.d;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaDataPrivacyActivity extends q implements a, f, b, i, j {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f12260s = 0;
    public C0444d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f12261n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f12262o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Fragment f12263p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f12264q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bb.a f12265r;

    @Override // S7.f
    public final void B0(float f) {
        L1(1.0f - f);
    }

    @Override // y5.g
    public final void Q(Fragment fragment) {
        this.f12263p = fragment;
        w1(true);
        x1(true);
        y1(true);
        I1(17);
        if (fragment instanceof MayaDataPrivacyPolicyFragment) {
            K1(getString(R.string.maya_label_data_privacy_privacy_policy));
        } else if (fragment instanceof MayaDataPrivacyDataPersonalizationFragment) {
            J1(R.string.maya_label_data_personalization_title_header);
        }
    }

    @Override // S7.f
    public final void a(PayMayaError payMayaError, String str) {
        M2.b.Z(2131231347, str, null, null, null, false, payMayaError, null, false, 444).show(getSupportFragmentManager(), numX49.tnTj78("btqP"));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // S7.i
    public final void e(String str, String str2, Function0 function0, Function0 function02) {
        La.a aVar = new La.a(2, function0);
        O7.a aVar2 = new O7.a(0, function02);
        MayaDataPrivacyWebContentBottomSheetDialogFragment mayaDataPrivacyWebContentBottomSheetDialogFragment = new MayaDataPrivacyWebContentBottomSheetDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("btqb"), str);
        bundle.putString(numX49.tnTj78("btq2"), str2);
        mayaDataPrivacyWebContentBottomSheetDialogFragment.setArguments(bundle);
        mayaDataPrivacyWebContentBottomSheetDialogFragment.f12310Z = aVar;
        mayaDataPrivacyWebContentBottomSheetDialogFragment.f12311a0 = aVar2;
        mayaDataPrivacyWebContentBottomSheetDialogFragment.show(getSupportFragmentManager(), mayaDataPrivacyWebContentBottomSheetDialogFragment.getTag());
    }

    @Override // S7.f
    public final OngoingRegistration j0() {
        return new OngoingRegistration(null, null, null, null, 15, null);
    }

    @Override // S7.f
    public final void l0(PayMayaError payMayaError, Function1 function1, Function1 function12) {
    }

    @Override // S7.f
    public final void m0() {
        this.f12264q = true;
    }

    @Override // S7.i
    public final void n0(String str) {
        ArrayList arrayList = this.f12262o;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        String str2 = this.f12261n;
        MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment = new MayaDataPrivacyDataPersonalizationFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(numX49.tnTj78("btqL"), new ArrayList<>(arrayList));
        bundle.putString(numX49.tnTj78("btqr"), str2);
        bundle.putString(numX49.tnTj78("btqZ"), str);
        mayaDataPrivacyDataPersonalizationFragment.setArguments(bundle);
        AbstractC1236z.i(this, R.id.frame_layout_container, mayaDataPrivacyDataPersonalizationFragment, R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left, R.anim.maya_slide_out_to_right);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!kotlin.jvm.internal.j.b(this.f12261n, numX49.tnTj78("btqk"))) {
            super.onBackPressed();
            return;
        }
        Fragment fragment = this.f12263p;
        if (!(fragment instanceof MayaDataPrivacyDataPersonalizationFragment) || !this.f12264q) {
            super.onBackPressed();
            return;
        }
        kotlin.jvm.internal.j.e(fragment, numX49.tnTj78("btqB"));
        final MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment = (MayaDataPrivacyDataPersonalizationFragment) fragment;
        final FragmentActivity activity = mayaDataPrivacyDataPersonalizationFragment.getActivity();
        if (activity == null) {
            return;
        }
        String string = mayaDataPrivacyDataPersonalizationFragment.getString(R.string.maya_label_save_changes);
        kotlin.jvm.internal.j.f(string, numX49.tnTj78("btqu"));
        final int i = 0;
        final int i4 = 1;
        d.n(2131231242, string, mayaDataPrivacyDataPersonalizationFragment.getString(R.string.maya_label_save_changes_youve_made_to_settings_spiel), new Pair(mayaDataPrivacyDataPersonalizationFragment.getString(R.string.maya_label_save), new Function1() { // from class: S7.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i) {
                    case 0:
                        kotlin.jvm.internal.j.g(it, "it");
                        MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment2 = mayaDataPrivacyDataPersonalizationFragment;
                        C1220i c1220iO1 = mayaDataPrivacyDataPersonalizationFragment2.o1();
                        C1219h c1219hD = C1219h.d(mayaDataPrivacyDataPersonalizationFragment2.u1());
                        c1219hD.n(17);
                        c1219hD.t(EnumC1217f.SAVE_CHANGES);
                        c1219hD.i();
                        c1220iO1.c(activity, c1219hD);
                        mayaDataPrivacyDataPersonalizationFragment2.H1().A();
                        break;
                    default:
                        kotlin.jvm.internal.j.g(it, "it");
                        MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment3 = mayaDataPrivacyDataPersonalizationFragment;
                        C1220i c1220iO12 = mayaDataPrivacyDataPersonalizationFragment3.o1();
                        C1219h c1219hD2 = C1219h.d(mayaDataPrivacyDataPersonalizationFragment3.u1());
                        c1219hD2.n(17);
                        c1219hD2.t(EnumC1217f.DONT_SAVE_CHANGES);
                        c1219hD2.i();
                        c1220iO12.c(activity, c1219hD2);
                        f fVar = mayaDataPrivacyDataPersonalizationFragment3.f12287c0;
                        if (fVar != null) {
                            fVar.finish();
                        }
                        break;
                }
                return Unit.f18162a;
            }
        }), new Pair(mayaDataPrivacyDataPersonalizationFragment.getString(R.string.maya_label_cancel), new Function1() { // from class: S7.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i4) {
                    case 0:
                        kotlin.jvm.internal.j.g(it, "it");
                        MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment2 = mayaDataPrivacyDataPersonalizationFragment;
                        C1220i c1220iO1 = mayaDataPrivacyDataPersonalizationFragment2.o1();
                        C1219h c1219hD = C1219h.d(mayaDataPrivacyDataPersonalizationFragment2.u1());
                        c1219hD.n(17);
                        c1219hD.t(EnumC1217f.SAVE_CHANGES);
                        c1219hD.i();
                        c1220iO1.c(activity, c1219hD);
                        mayaDataPrivacyDataPersonalizationFragment2.H1().A();
                        break;
                    default:
                        kotlin.jvm.internal.j.g(it, "it");
                        MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment3 = mayaDataPrivacyDataPersonalizationFragment;
                        C1220i c1220iO12 = mayaDataPrivacyDataPersonalizationFragment3.o1();
                        C1219h c1219hD2 = C1219h.d(mayaDataPrivacyDataPersonalizationFragment3.u1());
                        c1219hD2.n(17);
                        c1219hD2.t(EnumC1217f.DONT_SAVE_CHANGES);
                        c1219hD2.i();
                        c1220iO12.c(activity, c1219hD2);
                        f fVar = mayaDataPrivacyDataPersonalizationFragment3.f12287c0;
                        if (fVar != null) {
                            fVar.finish();
                        }
                        break;
                }
                return Unit.f18162a;
            }
        }), null, 96).show(activity.getSupportFragmentManager(), numX49.tnTj78("btqV"));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x017f  */
    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.dataprivacy.view.activity.impl.MayaDataPrivacyActivity.onCreate(android.os.Bundle):void");
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().h = null;
        Bb.a aVar = this.f12265r;
        if (aVar == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("btqC"));
            throw null;
        }
        aVar.i();
        this.m = null;
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

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.j.g(bundle, numX49.tnTj78("btq4"));
        bundle.putString(numX49.tnTj78("btqo"), this.f12261n);
        bundle.putSerializable(numX49.tnTj78("btqK"), this.f12262o);
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
        return EnumC1215d.DATA_PRIVACY;
    }

    @Override // S7.f
    public final void t(String str, String str2) {
        d.n(2131231645, str, str2, new Pair(getString(R.string.maya_label_got_it), new N9.f(this, 5)), null, null, 112).show(getSupportFragmentManager(), numX49.tnTj78("btqw"));
    }

    @Override // S7.f
    public final void u0(ArrayList arrayList) {
        kotlin.jvm.internal.j.g(arrayList, numX49.tnTj78("btqc"));
    }

    @Override // S7.f
    public final void v(PayMayaError payMayaError, Function1 function1) {
    }

    @Override // S7.f
    public final void z(Registration registration) {
        kotlin.jvm.internal.j.g(registration, numX49.tnTj78("btqm"));
    }
}
