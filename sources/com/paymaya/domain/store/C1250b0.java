package com.paymaya.domain.store;

import D.C0187u;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.paymaya.common.utility.AbstractC1233w;
import java.util.ArrayList;
import java.util.Objects;
import w.C2360b;

/* JADX INFO: renamed from: com.paymaya.domain.store.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1250b0 extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0187u f11427b;
    public final Uh.d c;

    public C1250b0(C0187u c0187u, Uh.d inboxUpdatePublishSubject) {
        kotlin.jvm.internal.j.g(inboxUpdatePublishSubject, "inboxUpdatePublishSubject");
        this.f11427b = c0187u;
        this.c = inboxUpdatePublishSubject;
        if (c0187u != null) {
            ((D.A) c0187u.f949b.j).g();
        }
        if (c0187u != null) {
            ((D.r) c0187u.f949b.i).f = this;
        }
    }

    public final Lh.h a(String tag) {
        kotlin.jvm.internal.j.g(tag, "tag");
        C0187u c0187u = this.f11427b;
        return new Ih.D(new Ih.l(new Ih.l(Ah.p.c(c0187u != null ? c0187u.d() : new ArrayList()).i().b(Z.f11410b), new M5.b(tag, 4), 0), C1248a0.f11423a, 1)).h(Th.e.c);
    }

    public final boolean b() {
        C0187u c0187u = this.f11427b;
        if (c0187u == null) {
            return false;
        }
        ArrayList<CTInboxMessage> arrayListD = c0187u.d();
        if (arrayListD.isEmpty()) {
            return false;
        }
        for (CTInboxMessage cTInboxMessage : arrayListD) {
            ArrayList arrayList = cTInboxMessage.f9562n;
            kotlin.jvm.internal.j.f(arrayList, "getTags(...)");
            if (!arrayList.isEmpty() && AbstractC1233w.h.contains(cTInboxMessage.f9562n.get(0)) && !cTInboxMessage.f9560k) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        C0187u c0187u = this.f11427b;
        Ih.l lVar = new Ih.l(Ah.p.c(c0187u != null ? c0187u.d() : new ArrayList()).i().b(Z.c), Z.f11411d, 0);
        com.google.firebase.messaging.p pVar = new com.google.firebase.messaging.p(this, 3);
        Ih.i iVar = new Ih.i(lVar, new C2360b(pVar, 21), new A5.l(pVar, 18), new V2.c(pVar, 21));
        Nh.j jVar = Th.e.c;
        Objects.requireNonNull(jVar, "scheduler is null");
        new Ih.A(iVar, jVar, !false).c();
    }
}
