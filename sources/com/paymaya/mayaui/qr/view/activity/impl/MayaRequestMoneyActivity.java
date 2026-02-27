package com.paymaya.mayaui.qr.view.activity.impl;

import Ae.a;
import B5.i;
import D.C0187u;
import Ka.b;
import N5.C0444d;
import N5.C0491z;
import Na.o;
import S5.c;
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
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.Z;
import com.paymaya.domain.model.TransferAppLink;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaRequestMoneyFormFragment;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaRequestMoneyFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaRequestMoneyActivity extends q implements b, Na.q, o, W6.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f13574o = 0;
    public C0444d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f13575n;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        x1(true);
        w1(true);
        if (fragment instanceof MayaRequestMoneyFragment) {
            Z.a(this, 1.0f);
            Bundle arguments = ((MayaRequestMoneyFragment) fragment).getArguments();
            K1((arguments != null ? (TransferAppLink) arguments.getParcelable(numX49.tnTj78("bjGw")) : null) != null ? getString(R.string.maya_label_custom_qr_code) : getString(R.string.maya_label_my_qr));
        } else if (fragment instanceof MayaRequestMoneyFormFragment) {
            Z.a(this, -1.0f);
            w1(false);
            K1(getString(R.string.maya_label_generate_custom_qr_code));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = W4.a.e().v().f4753a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        j.g((com.paymaya.data.preference.a) aVar.e.get(), numX49.tnTj78("bjGc"));
        this.f13575n = new a(27);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_request_money, (ViewGroup) null, false);
        int i = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.fragment_container);
        if (frameLayout != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                this.m = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 21);
                setContentView(constraintLayout);
                C0444d c0444d = this.m;
                j.d(c0444d);
                Q1(c0444d.f4073d);
                a aVar2 = this.f13575n;
                String strTnTj78 = numX49.tnTj78("bjGm");
                if (aVar2 == null) {
                    j.n(strTnTj78);
                    throw null;
                }
                aVar2.h(this);
                if (bundle == null) {
                    a aVar3 = this.f13575n;
                    if (aVar3 != null) {
                        aVar3.j();
                        return;
                    } else {
                        j.n(strTnTj78);
                        throw null;
                    }
                }
                return;
            }
            i = R.id.toolbar;
        }
        throw new NullPointerException(numX49.tnTj78("bjGD").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6285v = null;
        a aVar = this.f13575n;
        if (aVar == null) {
            j.n(numX49.tnTj78("bjGh"));
            throw null;
        }
        aVar.i();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.onOptionsItemSelected_enter(item);
        try {
            j.g(item, "item");
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
        return EnumC1215d.REQUEST_MONEY;
    }
}
