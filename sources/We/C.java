package We;

import java.util.concurrent.FutureTask;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RunnableC0603g f6348a;

    public C(RunnableC0603g runnableC0603g) {
        super(runnableC0603g, null);
        this.f6348a = runnableC0603g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        RunnableC0603g runnableC0603g = this.f6348a;
        int i = runnableC0603g.f6402s;
        RunnableC0603g runnableC0603g2 = ((C) obj).f6348a;
        int i4 = runnableC0603g2.f6402s;
        return i == i4 ? runnableC0603g.f6391a - runnableC0603g2.f6391a : AbstractC2217b.c(i4) - AbstractC2217b.c(i);
    }
}
