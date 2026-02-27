package Qg;

import ij.AbstractC1609c;
import java.io.Writer;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Writer f5376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5377b;
    public final /* synthetic */ f c;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.c = fVar;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.f5377b = obj;
        this.e |= Integer.MIN_VALUE;
        return f.a(this.c, null, null, this);
    }
}
