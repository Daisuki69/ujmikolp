package Ag;

import ij.AbstractC1609c;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CoroutineContext f289b;
    public Jg.d c;
    public Tg.d e;
    public /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f290g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.f290g = iVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f290g.b(null, null, null, null, this);
    }
}
