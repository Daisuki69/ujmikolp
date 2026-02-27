package O4;

import G6.u;
import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f4648b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u uVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.f4648b = uVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f4647a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.f4648b.a(this);
    }
}
