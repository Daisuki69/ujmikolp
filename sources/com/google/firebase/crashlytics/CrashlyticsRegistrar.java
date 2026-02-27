package com.google.firebase.crashlytics;

import C2.e;
import Kj.d;
import U1.g;
import Z2.a;
import a2.InterfaceC0623a;
import a2.b;
import a2.c;
import android.util.Log;
import b2.C0859a;
import b2.h;
import b2.n;
import c3.C1069a;
import c3.C1071c;
import c3.EnumC1072d;
import com.google.firebase.components.ComponentRegistrar;
import d2.C1328c;
import e2.C1419a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f9747d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f9748a = new n(InterfaceC0623a.class, ExecutorService.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f9749b = new n(b.class, ExecutorService.class);
    public final n c = new n(c.class, ExecutorService.class);

    static {
        EnumC1072d enumC1072d = EnumC1072d.f9282a;
        Map map = C1071c.f9281b;
        if (map.containsKey(enumC1072d)) {
            Log.d("FirebaseSessions", "Dependency " + enumC1072d + " already added.");
            return;
        }
        map.put(enumC1072d, new C1069a(new d(true)));
        Log.d("FirebaseSessions", "Dependency to " + enumC1072d + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        K3.d dVarB = C0859a.b(C1328c.class);
        dVarB.f2595a = "fire-cls";
        dVarB.c(h.c(g.class));
        dVarB.c(h.c(e.class));
        dVarB.c(new h(this.f9748a, 1, 0));
        dVarB.c(new h(this.f9749b, 1, 0));
        dVarB.c(new h(this.c, 1, 0));
        dVarB.c(new h(0, 2, C1419a.class));
        dVarB.c(new h(0, 2, Y1.b.class));
        dVarB.c(new h(0, 2, a.class));
        dVarB.f = new androidx.work.impl.e(this, 27);
        dVarB.f(2);
        return Arrays.asList(dVarB.d(), jk.b.e("fire-cls", "20.0.2"));
    }
}
