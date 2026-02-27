package X4;

import Bj.r;
import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f6528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6529b;
    public final /* synthetic */ c c;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.c = cVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f6529b = obj;
        this.e |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
