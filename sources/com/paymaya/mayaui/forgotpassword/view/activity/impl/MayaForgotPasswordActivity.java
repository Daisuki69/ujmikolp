package com.paymaya.mayaui.forgotpassword.view.activity.impl;

import B5.i;
import D.C0187u;
import M2.b;
import N5.C0444d;
import N5.C0491z;
import O5.a;
import S5.c;
import ab.e;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.H;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.store.H0;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.forgotpassword.view.fragment.impl.MayaForgotPasswordEnterMinFragment;
import com.paymaya.mayaui.forgotpassword.view.fragment.impl.MayaForgotPasswordSetNewPasswordFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import de.m;
import i8.C1593a;
import j8.InterfaceC1671a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import n8.InterfaceC1935c;
import n8.f;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaForgotPasswordActivity extends q implements InterfaceC1671a, InterfaceC1935c, f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f12356r = 0;
    public C0444d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Function1 f12357n = new H0(8);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ActivityResultLauncher f12358o = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new m(this, 27));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C1593a f12359p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1229s f12360q;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        w1(true);
        y1(true);
        x1(true);
    }

    public final void V1(PayMayaError payMayaError) {
        C1593a c1593a = this.f12359p;
        if (c1593a == null) {
            j.n(numX49.tnTj78("bU22"));
            throw null;
        }
        boolean zIsNetworkError = payMayaError.isNetworkError();
        String strTnTj78 = numX49.tnTj78("bU2P");
        if (zIsNetworkError) {
            MayaForgotPasswordActivity mayaForgotPasswordActivity = (MayaForgotPasswordActivity) ((InterfaceC1671a) c1593a.c.get());
            mayaForgotPasswordActivity.getClass();
            MayaErrorDialogFragment mayaErrorDialogFragmentZ = b.Z(2131231472, mayaForgotPasswordActivity.getString(R.string.maya_label_that_didnt_load_right), mayaForgotPasswordActivity.getString(R.string.maya_label_please_check_your_internet), mayaForgotPasswordActivity.getString(R.string.maya_label_close), null, false, null, null, false, 464);
            mayaErrorDialogFragmentZ.f11852e0 = new T6.f(mayaErrorDialogFragmentZ, 8);
            mayaErrorDialogFragmentZ.show(mayaForgotPasswordActivity.getSupportFragmentManager(), strTnTj78);
            return;
        }
        if (payMayaError.isDefault()) {
            ((MayaForgotPasswordActivity) ((InterfaceC1671a) c1593a.c.get())).W1();
            return;
        }
        if (payMayaError.mAction() != null) {
            ((MayaForgotPasswordActivity) ((InterfaceC1671a) c1593a.c.get())).W1();
            return;
        }
        InterfaceC1671a interfaceC1671a = (InterfaceC1671a) c1593a.c.get();
        String strMSpiel = payMayaError.mSpiel();
        j.f(strMSpiel, numX49.tnTj78("bU2b"));
        MayaForgotPasswordActivity mayaForgotPasswordActivity2 = (MayaForgotPasswordActivity) interfaceC1671a;
        mayaForgotPasswordActivity2.getClass();
        MayaErrorDialogFragment mayaErrorDialogFragmentZ2 = b.Z(2131231472, mayaForgotPasswordActivity2.getString(R.string.maya_label_that_didnt_load_right), strMSpiel, mayaForgotPasswordActivity2.getString(R.string.maya_label_close), null, false, null, null, false, 464);
        mayaErrorDialogFragmentZ2.f11852e0 = new T6.f(mayaErrorDialogFragmentZ2, 5);
        mayaErrorDialogFragmentZ2.show(mayaForgotPasswordActivity2.getSupportFragmentManager(), strTnTj78);
    }

    public final void W1() {
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = b.Z(2131231472, getString(R.string.maya_label_that_didnt_load_right), getString(R.string.maya_label_please_check_your_internet), getString(R.string.maya_label_close), null, false, null, null, false, 464);
        mayaErrorDialogFragmentZ.f11852e0 = new T6.f(mayaErrorDialogFragmentZ, 7);
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), numX49.tnTj78("bU2L"));
    }

    public final void X1(String str, String str2, String str3, String str4, Function1 function1, Function1 function12) {
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = b.Z(2131231241, str, str2, str3, str4, false, null, null, false, 480);
        mayaErrorDialogFragmentZ.f11852e0 = new H(1, function1, mayaErrorDialogFragmentZ);
        mayaErrorDialogFragmentZ.f11851d0 = new e(function12, mayaErrorDialogFragmentZ, 4);
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), numX49.tnTj78("bU2r"));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        String strTnTj78;
        String strTnTj782;
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.fragment_container);
        boolean z4 = fragmentFindFragmentById instanceof MayaForgotPasswordEnterMinFragment;
        String strTnTj783 = numX49.tnTj78("bU2Z");
        if (z4) {
            strTnTj782 = numX49.tnTj78("bU2k");
            strTnTj78 = strTnTj783;
        } else if (fragmentFindFragmentById instanceof MayaForgotPasswordSetNewPasswordFragment) {
            strTnTj78 = numX49.tnTj78("bU2B");
            strTnTj782 = strTnTj783;
        } else {
            strTnTj78 = null;
            strTnTj782 = null;
        }
        C1229s c1229s = this.f12360q;
        if (c1229s == null) {
            j.n(numX49.tnTj78("bU2S"));
            throw null;
        }
        C1229s.c(c1229s, this, numX49.tnTj78("bU2u"), strTnTj78, strTnTj782, numX49.tnTj78("bU2V"), null, null, null, 224);
        super.onBackPressed();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        a aVar = W4.a.e().n().f4751a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.f12359p = new C1593a(0);
        this.f12360q = (C1229s) aVar.f4684R.get();
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_forgot_password, (ViewGroup) null, false);
        int i = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.fragment_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.m = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 8);
                setContentView(constraintLayout);
                C0444d c0444d = this.m;
                j.d(c0444d);
                Q1(c0444d.f4073d);
                int color = ContextCompat.getColor(getApplicationContext(), R.color.maya_primary_white_alt);
                C0444d c0444d2 = this.m;
                j.d(c0444d2);
                ((Toolbar) c0444d2.f4073d.e).setBackgroundColor(color);
                C1593a c1593a = this.f12359p;
                String strTnTj78 = numX49.tnTj78("bU2j");
                if (c1593a == null) {
                    j.n(strTnTj78);
                    throw null;
                }
                c1593a.h(this);
                C1593a c1593a2 = this.f12359p;
                if (c1593a2 != null) {
                    c1593a2.j();
                    return;
                } else {
                    j.n(strTnTj78);
                    throw null;
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("bU2d").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6264X = null;
        C1593a c1593a = this.f12359p;
        if (c1593a == null) {
            j.n(numX49.tnTj78("bU2i"));
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
}
