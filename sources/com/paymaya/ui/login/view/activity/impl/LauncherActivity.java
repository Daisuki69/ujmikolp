package com.paymaya.ui.login.view.activity.impl;

import A5.m;
import B5.i;
import D.C0187u;
import E1.c;
import E8.p;
import Eh.d;
import Gh.f;
import Kh.B;
import L9.I;
import M8.M1;
import Md.b;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.core.splashscreen.SplashScreen;
import androidx.fragment.app.Fragment;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.ActivityTransition;
import com.paymaya.domain.store.K;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import h9.InterfaceC1544c;
import java.util.HashMap;
import y5.AbstractActivityC2512d;
import yk.a;

/* JADX INFO: loaded from: classes4.dex */
public class LauncherActivity extends AbstractActivityC2512d implements b, cb.b, InterfaceC1544c {
    public m j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public I f14621k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f14622l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14623n;

    public LauncherActivity() {
        String strTnTj78 = numX49.tnTj78("bVWP");
        this.f14622l = strTnTj78;
        this.m = strTnTj78;
        this.f14623n = true;
    }

    @Override // cb.b
    public final void L0() {
        a.a();
        this.e.j0(this, numX49.tnTj78("bVWb"), getString(R.string.pma_label_privacy_policy));
    }

    @Override // y5.g
    public final void Q(Fragment fragment) {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // h9.InterfaceC1544c
    public final void d0() {
        String stringExtra = getIntent().getStringExtra(numX49.tnTj78("bVW2"));
        String stringExtra2 = getIntent().getStringExtra(numX49.tnTj78("bVWL"));
        this.f14622l = numX49.tnTj78("bVWr");
        I i = this.f14621k;
        LauncherActivity launcherActivity = (LauncherActivity) ((b) i.c.get());
        launcherActivity.getClass();
        B bE = c.r(new Ze.c(launcherActivity).c(numX49.tnTj78("bVWZ"), numX49.tnTj78("bVWk"))).e(zh.b.a());
        f fVar = new f(new Cg.c(12, i, stringExtra, stringExtra2), d.f1366d);
        bE.g(fVar);
        i.e(fVar);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.AbstractActivityC2512d
    public final ActivityTransition h1() {
        return new ActivityTransition();
    }

    @Override // cb.b
    public final void m(M1 m12) {
        m12.invoke(this.m);
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        SplashScreen.installSplashScreen(this).setKeepOnScreenCondition(new Na.d(this, 2));
        super.onCreate(bundle);
        setContentView(R.layout.pma_activity_launcher);
        W4.a aVarE = W4.a.e();
        if (aVarE.f6269b == null) {
            O5.a aVar = aVarE.f6267a;
            M2.b bVar = new M2.b(5);
            aVar.getClass();
            aVarE.f6269b = new O5.f(aVar.f4704b, bVar);
        }
        O5.a aVar2 = aVarE.f6269b.f4755a;
        this.c = (C1220i) aVar2.f4716g.get();
        this.f21061d = (com.paymaya.data.preference.a) aVar2.e.get();
        this.e = (i) aVar2.f4659D.get();
        this.f = (C0187u) aVar2.f.get();
        this.j = (m) aVar2.f4653A.get();
        I i = new I(aVar2.S(), (com.paymaya.data.preference.a) aVar2.e.get(), (S5.c) aVar2.f4724k.get(), (m) aVar2.f4653A.get(), (K) aVar2.f4671K.get());
        this.f14621k = i;
        i.h(this);
        String stringExtra = getIntent().getStringExtra(numX49.tnTj78("bVWB"));
        String stringExtra2 = getIntent().getStringExtra(numX49.tnTj78("bVWu"));
        String stringExtra3 = getIntent().getStringExtra(numX49.tnTj78("bVWV"));
        m mVar = this.j;
        String str = Build.VERSION.RELEASE;
        mVar.g(Ke.d.e(), Ke.d.c());
        this.j.h();
        m mVar2 = this.j;
        p pVar = new p((Object) this, stringExtra, (Object) stringExtra2, stringExtra3, 3);
        mVar2.getClass();
        m.b(pVar);
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6269b = null;
        this.f14621k.i();
        super.onDestroy();
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

    @Override // cb.b
    public final void p0() {
        String stringExtra = getIntent().getStringExtra(numX49.tnTj78("bVWS"));
        String stringExtra2 = getIntent().getStringExtra(numX49.tnTj78("bVWj"));
        this.f14622l = numX49.tnTj78("bVWd");
        this.f14621k.s(stringExtra, stringExtra2);
    }

    public final void t1(String str) {
        C1220i c1220i = this.c;
        C1219h c1219hE = C1219h.e(AbstractC1213b.o(10));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put(numX49.tnTj78("bVWi"), numX49.tnTj78("bVWE"));
        map.put(numX49.tnTj78("bVWF"), numX49.tnTj78("bVWH"));
        map.put(numX49.tnTj78("bVWO"), str);
        map.put(numX49.tnTj78("bVWQ"), numX49.tnTj78("bVWt"));
        c1219hE.i();
        c1220i.c(this, c1219hE);
    }
}
