package cj;

import ij.AbstractC1615i;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: cj.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1128n implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9395b;

    public /* synthetic */ C1128n(Object obj, int i) {
        this.f9394a = i;
        this.f9395b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [ij.i, kotlin.jvm.functions.Function2] */
    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f9394a) {
            case 0:
                return kotlin.jvm.internal.D.f((Object[]) this.f9395b);
            case 1:
                return ((Iterable) this.f9395b).iterator();
            case 2:
                return new nj.m(this);
            case 3:
                return yj.l.a((AbstractC1615i) this.f9395b);
            case 4:
                return (Iterator) this.f9395b;
            default:
                Sequence sequence = (Sequence) this.f9395b;
                ArrayList arrayList = new ArrayList();
                Iterator it = sequence.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                w.n(arrayList);
                return arrayList.iterator();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1128n(Function2 function2) {
        this.f9394a = 3;
        this.f9395b = (AbstractC1615i) function2;
    }
}
