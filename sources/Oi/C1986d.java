package oi;

import android.content.Context;
import io.split.android.client.dtos.RuleBasedSegment;
import io.split.android.client.dtos.Status;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import mi.InterfaceC1866a;
import p3.k;
import ti.C2286a;
import v3.C2340c;
import w5.InterfaceC2384b;

/* JADX INFO: renamed from: oi.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1986d implements InterfaceC1866a, b2.c, InterfaceC2384b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18897a;

    public /* synthetic */ C1986d(int i) {
        this.f18897a = i;
    }

    public static C2286a c(long j, List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RuleBasedSegment ruleBasedSegment = (RuleBasedSegment) it.next();
            if (ruleBasedSegment.getStatus() == Status.ACTIVE) {
                hashSet.add(ruleBasedSegment);
            } else {
                hashSet2.add(ruleBasedSegment);
            }
        }
        System.currentTimeMillis();
        return new C2286a(hashSet, hashSet2, j);
    }

    @Override // mi.InterfaceC1866a
    public String a(Object obj) {
        return io.split.android.client.utils.b.f17635a.k((C1984b) obj);
    }

    @Override // w5.InterfaceC2384b
    public String b(Object obj) {
        return (String) obj;
    }

    @Override // b2.c
    public Object v(Xh.b bVar) {
        switch (this.f18897a) {
            case 1:
                return new k((Context) bVar.get(Context.class));
            default:
                return new C2340c((v3.e) bVar.get(v3.e.class), (p3.d) bVar.get(p3.d.class), (p3.g) bVar.get(p3.g.class));
        }
    }
}
