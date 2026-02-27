package H4;

import bj.C1037h;
import hj.EnumC1578a;
import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f2122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2123b;
    public G4.a c;
    public /* synthetic */ Object e;
    public final /* synthetic */ m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2124g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.f = mVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f2124g |= Integer.MIN_VALUE;
        Object objD = m.d(this.f, null, null, null, this);
        return objD == EnumC1578a.f17050a ? objD : new C1037h(objD);
    }
}
