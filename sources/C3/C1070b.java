package c3;

import ij.AbstractC1609c;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: c3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1070b extends AbstractC1609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f9277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f9278b;
    public EnumC1072d c;
    public Kj.a e;
    public Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f9279g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C1071c i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1070b(C1071c c1071c, AbstractC1609c abstractC1609c) {
        super(abstractC1609c);
        this.i = c1071c;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.b(this);
    }
}
