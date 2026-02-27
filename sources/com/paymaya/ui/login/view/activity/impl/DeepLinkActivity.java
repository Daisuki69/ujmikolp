package com.paymaya.ui.login.view.activity.impl;

import A5.m;
import A7.r;
import Ag.l;
import B5.c;
import B5.i;
import D.C0187u;
import Eh.d;
import Gh.f;
import Kh.B;
import M8.M1;
import Md.a;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import androidx.core.splashscreen.SplashScreen;
import androidx.fragment.app.Fragment;
import cb.b;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.domain.store.K;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import h9.InterfaceC1544c;
import java.util.HashMap;
import y5.AbstractActivityC2512d;

/* JADX INFO: loaded from: classes4.dex */
public class DeepLinkActivity extends AbstractActivityC2512d implements a, b, InterfaceC1544c {
    public m j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f14618k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Ld.a f14619l;
    public String m = numX49.tnTj78("bVWU");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14620n = true;

    @Override // cb.b
    public final void L0() {
        this.e.j0(this, numX49.tnTj78("bVWe"), getString(R.string.pma_label_privacy_policy));
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
        String dataString = getIntent().getDataString();
        Ld.a aVar = this.f14619l;
        DeepLinkActivity deepLinkActivity = (DeepLinkActivity) ((a) aVar.c.get());
        deepLinkActivity.getClass();
        B bE = E1.c.r(new Ze.c(deepLinkActivity).c(numX49.tnTj78("bVW8"), numX49.tnTj78("bVWC"))).e(zh.b.a());
        f fVar = new f(new r(14, aVar, dataString), d.f1366d);
        bE.g(fVar);
        aVar.e(fVar);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.AbstractActivityC2512d
    public final EnumC1215d k1() {
        return EnumC1215d.DEEP_LINK;
    }

    @Override // cb.b
    public final void m(M1 m12) {
        m12.invoke(this.m);
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        AttributionSource attributionSource;
        iKNpI8.xCZPS1(this, bundle);
        SplashScreen.installSplashScreen(this).setKeepOnScreenCondition(new Na.d(this, 1));
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
        this.f14618k = (c) aVar2.f4655B.get();
        Ld.a aVar3 = new Ld.a(aVar2.X(), (com.paymaya.data.preference.a) aVar2.e.get(), (S5.c) aVar2.f4724k.get(), (m) aVar2.f4653A.get(), (K) aVar2.f4671K.get());
        this.f14619l = aVar3;
        aVar3.h(this);
        Intent intent = getIntent();
        String strTnTj78 = numX49.tnTj78("bVW4");
        AttributionSource attributionSource2 = (AttributionSource) intent.getParcelableExtra(strTnTj78);
        String dataString = getIntent().getDataString();
        if (attributionSource2 == null) {
            String strL = C.L(dataString, strTnTj78);
            AttributionSource attributionSource3 = AttributionSource.j;
            AttributionSource.f10367b.getClass();
            AttributionSource[] attributionSourceArrValues = AttributionSource.values();
            int length = attributionSourceArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    attributionSource = null;
                    break;
                }
                attributionSource = attributionSourceArrValues[i];
                if (attributionSource.f10371a.equals(strL)) {
                    break;
                } else {
                    i++;
                }
            }
            if (attributionSource != null) {
                attributionSource3 = attributionSource;
            }
            setIntent(getIntent().putExtra(strTnTj78, (Parcelable) attributionSource3));
        }
        if (dataString == null || !dataString.startsWith(numX49.tnTj78("bVWo")) || dataString.length() <= 18) {
            String[] strArr = {strTnTj78};
            if (dataString != null && dataString.length() != 0 && C.Y(dataString)) {
                dataString = C.D(dataString, C.B(dataString, false), strArr);
            }
        } else {
            String[] strArr2 = {strTnTj78};
            if (dataString.length() != 0 && C.Y(dataString)) {
                dataString = C.D(dataString, C.A(dataString), strArr2);
            }
        }
        getIntent().setData(dataString != null ? Uri.parse(dataString) : null);
        this.f14619l.j = isTaskRoot();
        if (!isTaskRoot()) {
            this.f14619l.p(dataString);
            return;
        }
        m mVar = this.j;
        String str = Build.VERSION.RELEASE;
        mVar.g(Ke.d.e(), Ke.d.c());
        if (this.j.e()) {
            this.f14619l.p(dataString);
        } else {
            this.j.h();
        }
        m mVar2 = this.j;
        l lVar = new l(13, this, dataString);
        mVar2.getClass();
        m.b(lVar);
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        this.f14619l.i();
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
        this.f14619l.o(getIntent().getDataString());
    }

    public final void t1(String str) {
        C1220i c1220i = this.c;
        C1219h c1219hE = C1219h.e(AbstractC1213b.o(10));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put(numX49.tnTj78("bVWK"), numX49.tnTj78("bVWw"));
        map.put(numX49.tnTj78("bVWc"), numX49.tnTj78("bVWm"));
        map.put(numX49.tnTj78("bVWD"), str);
        map.put(numX49.tnTj78("bVWh"), numX49.tnTj78("bVWM"));
        c1219hE.i();
        c1220i.c(this, c1219hE);
    }
}
