package yj;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes11.dex */
public final class r implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f21328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f21329b;

    public r(Sequence sequence, Function1 transformer) {
        kotlin.jvm.internal.j.g(sequence, "sequence");
        kotlin.jvm.internal.j.g(transformer, "transformer");
        this.f21328a = sequence;
        this.f21329b = transformer;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new Rg.l(this);
    }
}
