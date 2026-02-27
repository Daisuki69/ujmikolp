package zj;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f21473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21474b;
    public final Function2 c;

    public e(CharSequence input, int i, Function2 function2) {
        kotlin.jvm.internal.j.g(input, "input");
        this.f21473a = input;
        this.f21474b = i;
        this.c = function2;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new d(this);
    }
}
