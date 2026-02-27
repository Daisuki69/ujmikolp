package com.paymaya.mayaui.settings.view.activity.impl;

import B5.i;
import D.C0187u;
import L9.C0327e;
import Mb.b;
import N5.C0444d;
import N5.C0491z;
import O5.a;
import S5.c;
import Sb.o;
import Sb.s;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.DeviceInformation;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.login.view.dialog.impl.MayaPasswordTipsBottomSheetDialogFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangePasswordFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaDeviceManagementDeviceInformationFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaDeviceManagementMainFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;
import y5.q;
import z2.d;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaDeviceManagementActivity extends q implements b, s, Sb.q, o, W6.b {
    public C0444d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0327e f13836n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Fragment f13837o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13838p = true;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        this.f13837o = fragment;
        this.f13838p = true;
        y1(true);
        x1(true);
        I1(17);
        C1(R.drawable.maya_ic_navigation_back);
        u1();
        if (fragment instanceof MayaDeviceManagementMainFragment) {
            w1(true);
            K1(getString(R.string.maya_label_device_management_manage_devices));
            r1();
            if (((MayaDeviceManagementMainFragment) fragment).f13967D0) {
                t1();
                return;
            } else {
                T1();
                return;
            }
        }
        if (fragment instanceof MayaDeviceManagementDeviceInformationFragment) {
            X1();
            t1();
        } else if (fragment instanceof MayaChangePasswordFragment) {
            W1();
            T1();
            J1(R.string.maya_label_change_password);
            U1();
            this.f13838p = false;
        }
    }

    public final void V1(String str, EnumC1216e enumC1216e) {
        C1219h c1219h = new C1219h();
        c1219h.r(enumC1216e);
        c1219h.n(17);
        c1219h.t(EnumC1217f.ITEM);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put(numX49.tnTj78("bj1P"), str);
        v1(c1219h);
    }

    public final void W1() {
        N1(jk.b.n(this, R.attr.mayaColorBackgroundPrimary));
        C0491z c0491z = this.j;
        if (c0491z != null) {
            ((Toolbar) c0491z.e).setBackgroundColor(jk.b.n(this, R.attr.mayaColorBackgroundPrimary));
        }
        getWindow().setNavigationBarColor(jk.b.n(this, R.attr.mayaColorBackgroundPrimary));
    }

    public final void X1() {
        N1(jk.b.n(this, R.attr.mayaColorBackgroundPrimaryAlt));
        B1();
        getWindow().setNavigationBarColor(jk.b.n(this, R.attr.mayaColorBackgroundPrimaryAlt));
    }

    public final void Y1(DeviceInformation deviceInformation) {
        MayaDeviceManagementDeviceInformationFragment mayaDeviceManagementDeviceInformationFragment = new MayaDeviceManagementDeviceInformationFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(numX49.tnTj78("bj1b"), deviceInformation);
        mayaDeviceManagementDeviceInformationFragment.setArguments(bundle);
        AbstractC1236z.i(this, R.id.frame_layout_container, mayaDeviceManagementDeviceInformationFragment, R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left, R.anim.maya_slide_out_to_right);
    }

    @Override // Sb.o
    public final void a(PayMayaError payMayaError, String str) {
        M2.b.Z(2131231347, str, null, null, null, false, payMayaError, null, false, 444).show(getSupportFragmentManager(), numX49.tnTj78("bj12"));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // Sb.o
    public final void i0(String str, String str2) {
        d.n(2131231645, str, str2, null, null, null, 120).show(getSupportFragmentManager(), numX49.tnTj78("bj1L"));
    }

    @Override // Sb.o
    public final void o0() {
        MayaPasswordTipsBottomSheetDialogFragment mayaPasswordTipsBottomSheetDialogFragment = new MayaPasswordTipsBottomSheetDialogFragment();
        mayaPasswordTipsBottomSheetDialogFragment.show(getSupportFragmentManager(), mayaPasswordTipsBottomSheetDialogFragment.getTag());
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        a aVar = (a) W4.a.e().y().c;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        com.paymaya.data.preference.a aVar2 = (com.paymaya.data.preference.a) aVar.e.get();
        aVar.e();
        j.g(aVar2, numX49.tnTj78("bj1r"));
        this.f13836n = new C0327e(8);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_device_management, (ViewGroup) null, false);
        int i = R.id.frame_layout_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_layout_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.m = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 6);
                setContentView(constraintLayout);
                C0444d c0444d = this.m;
                j.d(c0444d);
                Q1(c0444d.f4073d);
                C0327e c0327e = this.f13836n;
                String strTnTj78 = numX49.tnTj78("bj1Z");
                if (c0327e == null) {
                    j.n(strTnTj78);
                    throw null;
                }
                c0327e.h(this);
                if (bundle == null) {
                    C0327e c0327e2 = this.f13836n;
                    if (c0327e2 != null) {
                        c0327e2.j();
                        return;
                    } else {
                        j.n(strTnTj78);
                        throw null;
                    }
                }
                return;
            }
        }
        throw new NullPointerException(numX49.tnTj78("bj1k").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6274g = null;
        C0327e c0327e = this.f13836n;
        if (c0327e == null) {
            j.n(numX49.tnTj78("bj1B"));
            throw null;
        }
        c0327e.i();
        super.onDestroy();
        this.m = null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.onOptionsItemSelected_enter(item);
        try {
            j.g(item, "item");
            if (item.getItemId() == 16908332) {
                C0327e c0327e = this.f13836n;
                if (c0327e == null) {
                    j.n("mActivityPresenter");
                    throw null;
                }
                boolean z4 = this.f13838p;
                Fragment fragment = this.f13837o;
                MayaBaseFragment mayaBaseFragment = fragment instanceof MayaBaseFragment ? (MayaBaseFragment) fragment : null;
                EnumC1216e enumC1216eU = mayaBaseFragment != null ? mayaBaseFragment.U() : null;
                if (z4) {
                    ((MayaDeviceManagementActivity) ((b) c0327e.c.get())).V1("back", enumC1216eU);
                }
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
        return EnumC1215d.MANAGE_DEVICES;
    }
}
