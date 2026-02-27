package com.paymaya.ui.common.view.activity.impl;

import B5.i;
import D.C0187u;
import L9.C0327e;
import Lh.c;
import Qc.a;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1220i;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.ui.common.view.fragment.impl.ServiceUnavailableFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;
import y5.AbstractActivityC2512d;

/* JADX INFO: loaded from: classes4.dex */
public class ServiceUnavailableActivity extends AbstractActivityC2512d implements a, Wc.a {
    public C0327e j;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        if (fragment instanceof ServiceUnavailableFragment) {
            n1(true);
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

    @Override // Wc.a
    public final void n() {
        this.e.getClass();
        Intent intent = new Intent(this, (Class<?>) MayaDashboardActivity.class);
        intent.setData(Uri.parse(numX49.tnTj78("bV7b")));
        i.v0(this, intent);
        startActivity(intent);
        finishAffinity();
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        c cVarA = W4.a.e().a();
        O5.a aVar = (O5.a) cVarA.c;
        this.c = (C1220i) aVar.f4716g.get();
        this.f21061d = (com.paymaya.data.preference.a) aVar.e.get();
        this.e = (i) aVar.f4659D.get();
        this.f = (C0187u) aVar.f.get();
        ((mg.c) cVarA.f2990b).getClass();
        this.j = new C0327e(15);
        super.onCreate(bundle);
        setContentView(R.layout.pma_activity_service_unavailable_v2);
        this.j.h(this);
        if (bundle == null) {
            String string = getIntent().getExtras().getString(numX49.tnTj78("bV72"));
            String string2 = getIntent().getExtras().getString(numX49.tnTj78("bV7L"));
            String string3 = getIntent().getExtras().getString(numX49.tnTj78("bV7r"));
            boolean z4 = getIntent().getExtras().getBoolean(numX49.tnTj78("bV7Z"), false);
            C0327e c0327e = this.j;
            c0327e.getClass();
            j.g(string, numX49.tnTj78("bV7k"));
            ServiceUnavailableActivity serviceUnavailableActivity = (ServiceUnavailableActivity) ((a) c0327e.c.get());
            serviceUnavailableActivity.getClass();
            ServiceUnavailableFragment serviceUnavailableFragment = new ServiceUnavailableFragment();
            Bundle bundleE = androidx.media3.datasource.cache.c.e(numX49.tnTj78("bV7B"), string2, numX49.tnTj78("bV7u"), string3);
            bundleE.putString(numX49.tnTj78("bV7V"), string);
            bundleE.putBoolean(numX49.tnTj78("bV7S"), z4);
            serviceUnavailableFragment.setArguments(bundleE);
            AbstractC1236z.g(serviceUnavailableActivity, R.id.pma_activity_service_unavailable_fragment_container, serviceUnavailableFragment);
        }
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6272d = null;
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
            onBackPressed();
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
    }
}
