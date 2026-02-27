package Ej;

import gj.InterfaceC1526a;
import ij.AbstractC1609c;
import java.util.Iterator;

/* JADX INFO: renamed from: Ej.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0232j extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1454b;
    public final /* synthetic */ C0233k c;
    public InterfaceC0231i e;
    public Iterator f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0232j(C0233k c0233k, InterfaceC1526a interfaceC1526a) {
        super(interfaceC1526a);
        this.c = c0233k;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f1453a = obj;
        this.f1454b |= Integer.MIN_VALUE;
        return this.c.collect(null, this);
    }
}
