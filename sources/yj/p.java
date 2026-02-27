package yj;

import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class p extends kotlin.jvm.internal.i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f21327a = new p();

    public p() {
        super(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Sequence p02 = (Sequence) obj;
        kotlin.jvm.internal.j.g(p02, "p0");
        return p02.iterator();
    }
}
