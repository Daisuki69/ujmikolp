package com.google.firebase;

import C2.f;
import K3.d;
import U1.g;
import V2.a;
import V2.b;
import a2.InterfaceC0623a;
import android.content.Context;
import android.os.Build;
import b2.C0859a;
import b2.h;
import b2.n;
import bj.C1032c;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import z2.c;
import z2.e;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        d dVarB = C0859a.b(b.class);
        dVarB.c(new h(2, 0, a.class));
        dVarB.f = new f(17);
        arrayList.add(dVarB.d());
        n nVar = new n(InterfaceC0623a.class, Executor.class);
        d dVar = new d(c.class, new Class[]{e.class, z2.f.class});
        dVar.c(h.c(Context.class));
        dVar.c(h.c(g.class));
        dVar.c(new h(2, 0, z2.d.class));
        dVar.c(new h(1, 1, b.class));
        dVar.c(new h(nVar, 1, 0));
        dVar.f = new I2.b(nVar, 3);
        arrayList.add(dVar.d());
        arrayList.add(jk.b.e("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(jk.b.e("fire-core", "22.0.1"));
        arrayList.add(jk.b.e("device-name", a(Build.PRODUCT)));
        arrayList.add(jk.b.e("device-model", a(Build.DEVICE)));
        arrayList.add(jk.b.e("device-brand", a(Build.BRAND)));
        arrayList.add(jk.b.i("android-target-sdk", new f(13)));
        arrayList.add(jk.b.i("android-min-sdk", new f(14)));
        arrayList.add(jk.b.i("android-platform", new f(15)));
        arrayList.add(jk.b.i("android-installer", new f(16)));
        try {
            C1032c.c.getClass();
            str = "2.1.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(jk.b.e("kotlin", str));
        }
        return arrayList;
    }
}
