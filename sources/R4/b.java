package R4;

import ij.AbstractC1609c;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function2 f5456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5457b;
    public final /* synthetic */ j c;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.c = jVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f5457b = obj;
        this.e |= Integer.MIN_VALUE;
        return this.c.b(null, 0, null, this);
    }
}
