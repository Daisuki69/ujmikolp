package com.paymaya.ui.qr.view.activity.impl;

import D.C0187u;
import Lh.c;
import Q6.l;
import W4.a;
import ae.b;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import androidx.navigation.ActivityNavigator;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.ui.common.view.dialog.impl.ErrorDialogFragment;
import com.paymaya.ui.qr.view.dialog.impl.RequestMoneyInstructionDialogFragment;
import com.paymaya.ui.qr.view.fragment.impl.MLKitQRScannerFragment;
import com.paymaya.ui.qr.view.fragment.impl.MyQRFragment;
import com.paymaya.ui.qr.view.fragment.impl.QRScannerFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import de.i;
import de.k;
import de.o;
import kotlin.jvm.internal.j;
import p3.C2011b;
import y5.AbstractActivityC2512d;

/* JADX INFO: loaded from: classes4.dex */
public class QRActivity extends AbstractActivityC2512d implements b, o, k, i {
    public l j;

    @Override // de.k
    public final void F0() {
        new RequestMoneyInstructionDialogFragment().show(getSupportFragmentManager(), numX49.tnTj78("bSPU"));
    }

    @Override // y5.g
    public final void Q(Fragment fragment) {
        if ((fragment instanceof QRScannerFragment) || (fragment instanceof MLKitQRScannerFragment)) {
            n1(false);
            r1();
        } else if (fragment instanceof MyQRFragment) {
            n1(true);
            m1(getString(R.string.pma_label_request_money));
            o1(true);
            p1(true);
            q1(R.color.light_light);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.AbstractActivityC2512d, android.app.Activity
    public final void finish() {
        super.finish();
        ActivityNavigator.applyPopAnimationsToPendingTransition(this);
    }

    @Override // y5.AbstractActivityC2512d
    public final EnumC1215d k1() {
        return EnumC1215d.PERSONAL_QR;
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        c cVarE = a.e().E();
        O5.a aVar = (O5.a) cVarE.c;
        this.c = (C1220i) aVar.f4716g.get();
        this.f21061d = (com.paymaya.data.preference.a) aVar.e.get();
        this.e = (B5.i) aVar.f4659D.get();
        this.f = (C0187u) aVar.f.get();
        com.paymaya.data.preference.a aVar2 = (com.paymaya.data.preference.a) aVar.e.get();
        ((C2011b) cVarE.f2990b).getClass();
        j.g(aVar2, numX49.tnTj78("bSPe"));
        this.j = new l(19);
        super.onCreate(bundle);
        setContentView(R.layout.pma_activity_qr_v2);
        this.j.h(this);
        this.j.j();
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        a.e().f6284u = null;
        this.j.i();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Callback.onOptionsItemSelected_enter(menuItem);
        try {
            if (menuItem.getItemId() != 16908332) {
                boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
                Callback.onOptionsItemSelected_exit();
                return zOnOptionsItemSelected;
            }
            g1();
            Callback.onOptionsItemSelected_exit();
            return true;
        } catch (Throwable th2) {
            Callback.onOptionsItemSelected_exit();
            throw th2;
        }
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        super.onResume();
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        iKNpI8.pX3PN6(this);
        super.onStart();
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
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
        this.e.u0(this);
    }

    @Override // de.k
    public final void r0() {
        this.e.getClass();
        Intent intent = new Intent(this, (Class<?>) RequestMoneyActivity.class);
        intent.setData(getIntent().getData());
        B5.i.v0(this, intent);
        startActivity(intent);
    }

    public final void t1(String str, String str2, Uc.b bVar) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("bSP8"), str);
        bundle.putString(numX49.tnTj78("bSPC"), str2);
        errorDialogFragment.setArguments(bundle);
        errorDialogFragment.f14388Z = bVar;
        errorDialogFragment.show(getSupportFragmentManager(), numX49.tnTj78("bSP4"));
    }
}
