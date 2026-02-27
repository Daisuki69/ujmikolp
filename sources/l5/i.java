package l5;

import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18240b;
    public final /* synthetic */ k c;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.c = kVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f18240b = obj;
        this.e |= Integer.MIN_VALUE;
        return k.a(this.c, null, this);
    }
}
