package ba;

import dOYHB6.tiZVw8.numX49;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f8598b;

    public /* synthetic */ p(s sVar, int i) {
        this.f8597a = i;
        this.f8598b = sVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f8597a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(th2, numX49.tnTj78("buco"));
                this.f8598b.f(th2, false);
                break;
            default:
                Pair pair = (Pair) obj;
                kotlin.jvm.internal.j.g(pair, numX49.tnTj78("buc4"));
                this.f8598b.A(pair);
                break;
        }
    }
}
