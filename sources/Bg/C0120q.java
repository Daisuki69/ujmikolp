package Bg;

import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: Bg.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0120q extends AbstractC1616j implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f551a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f552b;
    public Object c;
    public /* synthetic */ Object e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f553g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120q(Fg.e eVar, ArrayList arrayList, InterfaceC1526a interfaceC1526a) {
        super(3, interfaceC1526a);
        this.f = eVar;
        this.h = arrayList;
    }

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f551a) {
            case 0:
                C0120q c0120q = new C0120q((wg.c) this.h, (InterfaceC1526a) obj3);
                c0120q.e = (Vg.e) obj;
                c0120q.f553g = (Kg.d) obj2;
                return c0120q.invokeSuspend(Unit.f18162a);
            case 1:
                C0120q c0120q2 = new C0120q((Long) this.f, (Long) this.f553g, (Long) this.h, (InterfaceC1526a) obj3);
                c0120q2.c = (Cg.h) obj;
                c0120q2.e = (Jg.c) obj2;
                return c0120q2.invokeSuspend(Unit.f18162a);
            default:
                ArrayList arrayList = (ArrayList) this.h;
                C0120q c0120q3 = new C0120q((Fg.e) this.f, arrayList, (InterfaceC1526a) obj3);
                c0120q3.f553g = (Fg.u) obj;
                c0120q3.e = (Kg.c) obj2;
                return c0120q3.invokeSuspend(Unit.f18162a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bg.C0120q.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120q(Long l6, Long l8, Long l10, InterfaceC1526a interfaceC1526a) {
        super(3, interfaceC1526a);
        this.f = l6;
        this.f553g = l8;
        this.h = l10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120q(wg.c cVar, InterfaceC1526a interfaceC1526a) {
        super(3, interfaceC1526a);
        this.h = cVar;
    }
}
