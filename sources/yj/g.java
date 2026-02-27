package yj;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f21318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f21319b;
    public final Function1 c;

    public g(Sequence sequence, Function1 transformer, Function1 function1) {
        kotlin.jvm.internal.j.g(sequence, "sequence");
        kotlin.jvm.internal.j.g(transformer, "transformer");
        this.f21318a = sequence;
        this.f21319b = transformer;
        this.c = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new e(this);
    }
}
