package yj;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes11.dex */
public final class f<T> implements Sequence<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f21316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21317b;
    public final Function1 c;

    public f(Sequence sequence, boolean z4, Function1 predicate) {
        kotlin.jvm.internal.j.g(sequence, "sequence");
        kotlin.jvm.internal.j.g(predicate, "predicate");
        this.f21316a = sequence;
        this.f21317b = z4;
        this.c = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new e(this);
    }
}
