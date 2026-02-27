package yj;

import cj.H;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: yj.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2537b implements Sequence, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f21310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21311b;

    public C2537b(Sequence sequence, int i) {
        this.f21310a = sequence;
        this.f21311b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // yj.c
    public final Sequence a(int i) {
        int i4 = this.f21311b + i;
        return i4 < 0 ? new C2537b(this, i) : new C2537b(this.f21310a, i4);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new H(this);
    }
}
