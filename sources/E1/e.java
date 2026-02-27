package E1;

import aj.InterfaceC0716a;
import android.content.Context;
import com.google.firebase.messaging.r;
import com.paymaya.domain.store.L;
import com.paymaya.domain.store.M;
import com.paymaya.domain.store.T;
import e1.C1417a;
import e2.C1421c;
import n2.C1915b;
import p3.C2011b;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1229a;

    public /* synthetic */ e(Context context) {
        this.f1229a = context;
    }

    public c1.j a() {
        Context context = this.f1229a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        c1.j jVar = new c1.j();
        jVar.f9232a = C1417a.a(c1.l.f9237a);
        d3.c cVar = new d3.c(context, 1);
        jVar.f9233b = cVar;
        jVar.c = C1417a.a(new Y.e(27, cVar, new M(cVar, 3)));
        d3.c cVar2 = jVar.f9233b;
        jVar.f9234d = new L(cVar2, 16);
        InterfaceC0716a interfaceC0716aA = C1417a.a(new C1421c(15, jVar.f9234d, C1417a.a(new T(cVar2, 15))));
        jVar.e = interfaceC0716aA;
        C2011b c2011b = new C2011b(22);
        d3.c cVar3 = jVar.f9233b;
        U8.c cVar4 = new U8.c(22, cVar3, interfaceC0716aA, c2011b);
        InterfaceC0716a interfaceC0716a = jVar.f9232a;
        InterfaceC0716a interfaceC0716a2 = jVar.c;
        jVar.f = C1417a.a(new U8.c(14, new Ci.b(interfaceC0716a, interfaceC0716a2, cVar4, interfaceC0716aA, interfaceC0716aA, 10), new C1915b(cVar3, interfaceC0716a2, interfaceC0716aA, cVar4, interfaceC0716a, interfaceC0716aA, interfaceC0716aA, 6), new r(interfaceC0716a, interfaceC0716aA, cVar4, interfaceC0716aA, 19)));
        return jVar;
    }
}
