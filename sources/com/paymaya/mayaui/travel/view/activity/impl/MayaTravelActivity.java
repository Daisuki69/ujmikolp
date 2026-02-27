package com.paymaya.mayaui.travel.view.activity.impl;

import B5.i;
import Bb.f;
import D.C0187u;
import N5.C0444d;
import N5.C0491z;
import W6.c;
import Y6.e;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.domain.model.Stop;
import com.paymaya.mayaui.common.view.dialog.impl.MayaChoicesBottomSheetDialogFragment;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelConfirmationFragment;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelOperatorSelectionFragment;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelReceiptFragment;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelRouteSelectionFragment;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelStopSelectionFragment;
import com.paymaya.mayaui.travel.view.widget.MayaTravelViewDataSelection;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import hc.InterfaceC1560a;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kc.a;
import kc.b;
import kc.d;
import kc.g;
import kc.j;
import y5.InterfaceC2511c;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaTravelActivity extends q implements InterfaceC1560a, b, e, d, g, j, c, a, kc.e {
    public C0444d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f14177n;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        y1(true);
        x1(true);
        if (fragment instanceof MayaTravelOperatorSelectionFragment) {
            t1();
            E1(25);
            R1();
            F1(1, 4);
            S1();
            return;
        }
        if (fragment instanceof MayaTravelRouteSelectionFragment) {
            t1();
            E1(50);
            R1();
            F1(2, 4);
            S1();
            return;
        }
        if (fragment instanceof MayaTravelStopSelectionFragment) {
            t1();
            E1(75);
            R1();
            F1(3, 4);
            S1();
            return;
        }
        if (fragment instanceof MayaTravelConfirmationFragment) {
            t1();
            E1(100);
            R1();
            F1(4, 4);
            S1();
            return;
        }
        if (fragment instanceof MayaTravelReceiptFragment) {
            w1(false);
            return;
        }
        T1();
        r1();
        s1();
        I1(17);
        K1(getString(R.string.maya_label_service_travel));
    }

    @Override // y5.n
    public final void Q0(String str) {
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bVhP"));
        n1();
        i.l(this, str, AttributionSource.f10368d);
    }

    public final f V1() {
        f fVar = this.f14177n;
        if (fVar != null) {
            return fVar;
        }
        kotlin.jvm.internal.j.n(numX49.tnTj78("bVhb"));
        throw null;
    }

    public final void W1(String str, String str2, Stop stop, List list) {
        MayaChoicesBottomSheetDialogFragment mayaChoicesBottomSheetDialogFragment = new MayaChoicesBottomSheetDialogFragment();
        Bundle bundleD = androidx.media3.datasource.cache.c.d(numX49.tnTj78("bVh2"), str2);
        bundleD.putParcelableArrayList(numX49.tnTj78("bVhL"), new ArrayList<>(list));
        bundleD.putBoolean(numX49.tnTj78("bVhr"), true);
        bundleD.putInt(numX49.tnTj78("bVhZ"), 2);
        mayaChoicesBottomSheetDialogFragment.setArguments(bundleD);
        mayaChoicesBottomSheetDialogFragment.f11830V = str;
        mayaChoicesBottomSheetDialogFragment.f11835a0 = R.drawable.maya_bg_selector_choices_cell;
        mayaChoicesBottomSheetDialogFragment.f11836b0 = stop;
        mayaChoicesBottomSheetDialogFragment.f11837c0 = R.drawable.maya_ic_check_green;
        mayaChoicesBottomSheetDialogFragment.f11838d0 = true;
        mayaChoicesBottomSheetDialogFragment.show(getSupportFragmentManager(), numX49.tnTj78("bVhk"));
    }

    public final void X1() {
        V1().e = new MayaTravelViewDataSelection(null, null, null, null, null, null);
        AbstractC1236z.i(this, R.id.frame_layout_container, new MayaTravelOperatorSelectionFragment(), R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left, R.anim.maya_slide_out_to_right);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.n
    public final void l(String str) {
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bVhB"));
        n1().k0(this, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        kotlin.jvm.internal.j.f(fragments, numX49.tnTj78("bVhu"));
        if (!fragments.isEmpty()) {
            for (Fragment fragment : fragments) {
                if (fragment.isVisible()) {
                    if ((fragment instanceof InterfaceC2511c) && ((InterfaceC2511c) fragment).e0()) {
                        return;
                    }
                }
            }
            throw new NoSuchElementException(numX49.tnTj78("bVhV"));
        }
        super.onBackPressed();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = W4.a.e().A().f4754a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (S5.c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        kotlin.jvm.internal.j.g((com.paymaya.data.preference.a) aVar.e.get(), numX49.tnTj78("bVhS"));
        this.f14177n = new f(17);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_travel, (ViewGroup) null, false);
        int i = R.id.frame_layout_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_layout_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.m = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 27);
                setContentView(constraintLayout);
                C0444d c0444d = this.m;
                kotlin.jvm.internal.j.d(c0444d);
                Q1(c0444d.f4073d);
                V1().h(this);
                if (bundle == null) {
                    V1().j();
                    return;
                } else {
                    V1().e = (MayaTravelViewDataSelection) bundle.getParcelable(numX49.tnTj78("bVhj"));
                    return;
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("bVhd").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6261U = null;
        V1().i();
        super.onDestroy();
        this.m = null;
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
        kotlin.jvm.internal.j.g(bundle, numX49.tnTj78("bVhi"));
        bundle.putParcelable(numX49.tnTj78("bVhE"), (MayaTravelViewDataSelection) V1().e);
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
        return EnumC1215d.TRANSPORT;
    }
}
