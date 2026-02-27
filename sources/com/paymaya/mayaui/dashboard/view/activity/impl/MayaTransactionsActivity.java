package com.paymaya.mayaui.dashboard.view.activity.impl;

import A7.j;
import B5.i;
import B7.b;
import D.C0187u;
import G7.A;
import G7.B;
import G7.C;
import G7.D;
import G7.r;
import G7.u;
import G7.v;
import G7.w;
import G7.x;
import G7.y;
import G7.z;
import Gb.c;
import N5.C0444d;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.data.preference.a;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.model.PurchasedTicket;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.domain.store.C1265j;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaTransactionsFragment;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyDecorationPreviewFragment;
import com.paymaya.ui.dashboard.view.fragment.impl.UserActivityFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import gd.InterfaceC1517a;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaTransactionsActivity extends q implements b, r, InterfaceC1517a, x, C, y, w, v, u, A, D, B, z, c {
    public C0444d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j f12153n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12154o;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        if (fragment instanceof MayaTransactionsFragment) {
            N1(jk.b.n(this, R.attr.mayaColorBackgroundPrimaryAlt));
            getWindow().setNavigationBarColor(jk.b.n(this, R.attr.mayaColorBackgroundPrimaryAlt));
            B1();
            A1();
            z1();
            w1(true);
            y1(true);
            x1(true);
            J1(R.string.maya_label_transactions);
            return;
        }
        if (fragment instanceof UserActivityFragment) {
            O1();
            w1(false);
            z1();
            return;
        }
        if (fragment instanceof y5.v) {
            M1(R.color.maya_shades_of_grey_1);
            getWindow().setNavigationBarColor(ContextCompat.getColor(getApplicationContext(), R.color.maya_shades_of_grey_1));
            A1();
            z1();
            w1(false);
            return;
        }
        if (fragment instanceof MayaSendMoneyDecorationPreviewFragment) {
            M1(R.color.light_light);
            A1();
            z1();
            w1(true);
            y1(true);
            x1(true);
            Bundle arguments = ((MayaSendMoneyDecorationPreviewFragment) fragment).getArguments();
            K1(arguments != null ? arguments.getBoolean(numX49.tnTj78("bt52j")) : false ? getString(R.string.maya_label_you_have_received) : getString(R.string.maya_label_you_have_sent));
        }
    }

    public final j V1() {
        j jVar = this.f12153n;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.j.n(numX49.tnTj78("bt52d"));
        throw null;
    }

    public final void W1(MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl) {
        if (this.f12154o) {
            AbstractC1236z.g(this, R.id.frame_layout_container, mayaAbstractBaseUserActivityFragmentImpl);
        } else {
            AbstractC1236z.i(this, R.id.frame_layout_container, mayaAbstractBaseUserActivityFragmentImpl, R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left, R.anim.maya_slide_out_to_right);
        }
    }

    public final void X1() {
        j jVarV1 = V1();
        String strC = com.paymaya.common.utility.C.c(numX49.tnTj78("bt52i"), ((a) jVarV1.e).r(), ((a) jVarV1.e).u(), ((C1265j) jVarV1.f).a());
        MayaTransactionsActivity mayaTransactionsActivity = (MayaTransactionsActivity) ((b) jVarV1.c.get());
        mayaTransactionsActivity.n1().v(mayaTransactionsActivity, strC, mayaTransactionsActivity.getString(R.string.maya_label_help));
    }

    public final void Y1(UserActivity userActivity, boolean z4) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(numX49.tnTj78("bt52E"), userActivity);
        bundle.putBoolean(numX49.tnTj78("bt52F"), z4);
        MayaSendMoneyDecorationPreviewFragment mayaSendMoneyDecorationPreviewFragment = new MayaSendMoneyDecorationPreviewFragment();
        mayaSendMoneyDecorationPreviewFragment.setArguments(bundle);
        AbstractC1236z.h(this, R.id.frame_layout_container, mayaSendMoneyDecorationPreviewFragment);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = (O5.a) W4.a.e().b().c;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (S5.c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.f12153n = new j((a) aVar.e.get(), aVar.e());
        super.onCreate(bundle);
        C0444d c0444dB = C0444d.b(getLayoutInflater());
        this.m = c0444dB;
        setContentView(c0444dB.f4072b);
        C0444d c0444d = this.m;
        kotlin.jvm.internal.j.d(c0444d);
        Q1(c0444d.f4073d);
        V1().h(this);
        if (bundle == null) {
            UserActivity userActivity = (UserActivity) getIntent().getParcelableExtra(numX49.tnTj78("bt52H"));
            PurchasedTicket purchasedTicket = (PurchasedTicket) getIntent().getParcelableExtra(numX49.tnTj78("bt52O"));
            j jVarV1 = V1();
            jVarV1.j();
            if (userActivity != null) {
                ((MayaTransactionsActivity) ((b) jVarV1.c.get())).f12154o = true;
                jVarV1.Z(userActivity, purchasedTicket);
            } else {
                MayaTransactionsActivity mayaTransactionsActivity = (MayaTransactionsActivity) ((b) jVarV1.c.get());
                mayaTransactionsActivity.getClass();
                AbstractC1236z.g(mayaTransactionsActivity, R.id.frame_layout_container, new MayaTransactionsFragment());
            }
        }
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6272d = null;
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
        return EnumC1215d.ACTIVITY;
    }

    @Override // Gb.c
    public final void y0(Decoration decoration) {
    }
}
