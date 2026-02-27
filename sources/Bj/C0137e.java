package Bj;

import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;

/* JADX INFO: renamed from: Bj.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0137e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f614b = AtomicIntegerFieldUpdater.newUpdater(C0137e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K[] f615a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public C0137e(K[] kArr) {
        this.f615a = kArr;
        this.notCompletedCount$volatile = kArr.length;
    }

    public final Object a(AbstractC1616j abstractC1616j) {
        C0151l c0151l = new C0151l(1, hj.h.b(abstractC1616j));
        c0151l.r();
        InterfaceC0156n0[] interfaceC0156n0Arr = this.f615a;
        int length = interfaceC0156n0Arr.length;
        C0133c[] c0133cArr = new C0133c[length];
        for (int i = 0; i < length; i++) {
            InterfaceC0156n0 interfaceC0156n0 = interfaceC0156n0Arr[i];
            ((u0) interfaceC0156n0).start();
            C0133c c0133c = new C0133c(this, c0151l);
            c0133c.f = H.s(interfaceC0156n0, true, c0133c);
            Unit unit = Unit.f18162a;
            c0133cArr[i] = c0133c;
        }
        C0135d c0135d = new C0135d(c0133cArr);
        for (int i4 = 0; i4 < length; i4++) {
            C0133c c0133c2 = c0133cArr[i4];
            c0133c2.getClass();
            C0133c.h.set(c0133c2, c0135d);
        }
        if (C0151l.f628g.get(c0151l) instanceof z0) {
            c0151l.v(c0135d);
        } else {
            c0135d.b();
        }
        Object objQ = c0151l.q();
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        return objQ;
    }
}
