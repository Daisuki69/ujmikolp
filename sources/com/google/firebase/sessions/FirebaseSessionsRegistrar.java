package com.google.firebase.sessions;

import Bj.A;
import C2.e;
import Q6.s;
import R4.i;
import T3.l;
import U1.g;
import a2.InterfaceC0623a;
import a2.b;
import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.datastore.core.MultiProcessDataStoreFactory;
import androidx.media3.extractor.flv.a;
import b2.C0859a;
import b2.InterfaceC0860b;
import b2.h;
import b2.n;
import b3.AbstractC0900u;
import b3.C0879T;
import b3.C0888i;
import b3.C0895p;
import b3.C0898s;
import b3.C0899t;
import b3.C0901v;
import b3.InterfaceC0897r;
import cj.C1132s;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.r;
import com.paymaya.domain.store.C1258f0;
import d3.C1329a;
import d3.c;
import d3.d;
import e2.C1421c;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.j;
import n2.C1915b;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final C0901v Companion = new C0901v();
    private static final n appContext = n.a(Context.class);
    private static final n firebaseApp = n.a(g.class);
    private static final n firebaseInstallationsApi = n.a(e.class);
    private static final n backgroundDispatcher = new n(InterfaceC0623a.class, A.class);
    private static final n blockingDispatcher = new n(b.class, A.class);
    private static final n transportFactory = n.a(Z0.g.class);
    private static final n firebaseSessionsComponent = n.a(InterfaceC0897r.class);

    static {
        try {
            MultiProcessDataStoreFactory.INSTANCE.getClass();
        } catch (NoClassDefFoundError unused) {
            Log.w("FirebaseSessions", "Your app is experiencing a known issue in the Android Gradle plugin, see https://issuetracker.google.com/328687152\n\nIt affects Java-only apps using AGP version 8.3.2 and under. To avoid the issue, either:\n\n1. Upgrade Android Gradle plugin to 8.4.0+\n   Follow the guide at https://developer.android.com/build/agp-upgrade-assistant\n\n2. Or, add the Kotlin plugin to your app\n   Follow the guide at https://developer.android.com/kotlin/add-kotlin\n\n3. Or, do the technical workaround described in https://issuetracker.google.com/issues/328687152#comment3");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0895p getComponents$lambda$0(InterfaceC0860b interfaceC0860b) {
        return (C0895p) ((C0888i) ((InterfaceC0897r) interfaceC0860b.f(firebaseSessionsComponent))).f8475p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC0897r getComponents$lambda$1(InterfaceC0860b interfaceC0860b) {
        Object objF = interfaceC0860b.f(appContext);
        j.f(objF, "get(...)");
        Object objF2 = interfaceC0860b.f(backgroundDispatcher);
        j.f(objF2, "get(...)");
        Object objF3 = interfaceC0860b.f(blockingDispatcher);
        j.f(objF3, "get(...)");
        Object objF4 = interfaceC0860b.f(firebaseApp);
        j.f(objF4, "get(...)");
        Object objF5 = interfaceC0860b.f(firebaseInstallationsApi);
        j.f(objF5, "get(...)");
        B2.b bVarE = interfaceC0860b.e(transportFactory);
        j.f(bVarE, "getProvider(...)");
        C0888i c0888i = new C0888i();
        c0888i.f8467a = c.a((g) objF4);
        c cVarA = c.a((Context) objF);
        c0888i.f8468b = cVarA;
        c0888i.c = C1329a.a(new C1258f0(cVarA, 5));
        c0888i.f8469d = C1329a.a(AbstractC0900u.f8497a);
        c0888i.e = c.a((e) objF5);
        c0888i.f = C1329a.a(new Q6.n(c0888i.f8467a, 21));
        c cVarA2 = c.a((CoroutineContext) objF3);
        c0888i.f8470g = cVarA2;
        c0888i.h = C1329a.a(new C1421c(1, c0888i.f, cVarA2));
        c0888i.i = c.a((CoroutineContext) objF2);
        c0888i.j = C1329a.a(new C0898s(c0888i.c, C1329a.a(new C0879T(c0888i.f8469d, c0888i.e, c0888i.f, c0888i.h, C1329a.a(new C0899t(c0888i.i, c0888i.f8469d, C1329a.a(new C0898s(c0888i.f8468b, c0888i.f8470g, 0)), 1)), 1)), 3));
        d dVarA = C1329a.a(AbstractC0900u.f8498b);
        c0888i.f8471k = dVarA;
        c0888i.f8472l = C1329a.a(new C0898s(c0888i.f8469d, dVarA, 2));
        c0888i.m = C1329a.a(new C0879T(c0888i.f8467a, c0888i.e, c0888i.j, C1329a.a(new s(c.a(bVarE), 21)), c0888i.i, 0));
        c0888i.f8473n = C1329a.a(new C0899t(c0888i.f8468b, c0888i.f8470g, C1329a.a(new i(c0888i.f8472l, 19)), 0));
        d dVarA2 = C1329a.a(new C1915b(c0888i.j, c0888i.f8472l, c0888i.m, c0888i.f8469d, c0888i.f8473n, C1329a.a(new C0898s(c0888i.f8468b, c0888i.f8471k, 1)), c0888i.i, 3));
        c0888i.f8474o = dVarA2;
        c0888i.f8475p = C1329a.a(new r(c0888i.f8467a, c0888i.j, c0888i.i, C1329a.a(new l(dVarA2, 19)), 10));
        return c0888i;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0859a> getComponents() {
        K3.d dVarB = C0859a.b(C0895p.class);
        dVarB.f2595a = LIBRARY_NAME;
        dVarB.c(h.b(firebaseSessionsComponent));
        dVarB.f = new a(20);
        dVarB.f(2);
        C0859a c0859aD = dVarB.d();
        K3.d dVarB2 = C0859a.b(InterfaceC0897r.class);
        dVarB2.f2595a = "fire-sessions-component";
        dVarB2.c(h.b(appContext));
        dVarB2.c(h.b(backgroundDispatcher));
        dVarB2.c(h.b(blockingDispatcher));
        dVarB2.c(h.b(firebaseApp));
        dVarB2.c(h.b(firebaseInstallationsApi));
        dVarB2.c(new h(transportFactory, 1, 1));
        dVarB2.f = new a(21);
        return C1132s.g(c0859aD, dVarB2.d(), jk.b.e(LIBRARY_NAME, "3.0.2"));
    }
}
