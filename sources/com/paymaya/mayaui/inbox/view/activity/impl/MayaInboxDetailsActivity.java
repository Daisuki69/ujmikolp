package com.paymaya.mayaui.inbox.view.activity.impl;

import B5.i;
import D.C0187u;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.Fragment;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.mayaui.inbox.view.fragment.impl.MayaInboxDetailsFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.iY9fr2.dLgao9;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import i8.C1593a;
import kotlin.jvm.internal.j;
import q8.a;
import t8.b;
import y5.AbstractActivityC2512d;

/* JADX INFO: loaded from: classes4.dex */
public class MayaInboxDetailsActivity extends AbstractActivityC2512d implements a, b {
    public C1593a j;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        o1(true);
        p1(false);
        n1(true);
        if (fragment instanceof MayaInboxDetailsFragment) {
            Window window = getWindow();
            dLgao9.oVike1(window, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            window.getDecorView().setSystemUiVisibility(9472);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = W4.a.e().o().f4752a;
        this.c = (C1220i) aVar.f4716g.get();
        this.f21061d = (com.paymaya.data.preference.a) aVar.e.get();
        this.e = (i) aVar.f4659D.get();
        this.f = (C0187u) aVar.f.get();
        j.g((com.paymaya.data.preference.a) aVar.e.get(), numX49.tnTj78("bjZP"));
        this.j = new C1593a(8);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_inbox_details, (ViewGroup) null, false);
        if (viewInflate == null) {
            throw new NullPointerException(numX49.tnTj78("bjZ2"));
        }
        setContentView((FrameLayout) viewInflate);
        C1593a c1593a = this.j;
        String strTnTj78 = numX49.tnTj78("bjZb");
        if (c1593a == null) {
            j.n(strTnTj78);
            throw null;
        }
        c1593a.h(this);
        if (bundle == null) {
            C1593a c1593a2 = this.j;
            if (c1593a2 != null) {
                c1593a2.j();
            } else {
                j.n(strTnTj78);
                throw null;
            }
        }
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6289z = null;
        C1593a c1593a = this.j;
        if (c1593a == null) {
            j.n(numX49.tnTj78("bjZL"));
            throw null;
        }
        c1593a.i();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.onOptionsItemSelected_enter(item);
        try {
            j.g(item, "item");
            if (item.getItemId() == 16908332) {
                onBackPressed();
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
}
