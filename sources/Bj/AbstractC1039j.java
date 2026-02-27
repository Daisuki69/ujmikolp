package bj;

/* JADX INFO: renamed from: bj.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1039j {
    public static final C1038i a(Throwable exception) {
        kotlin.jvm.internal.j.g(exception, "exception");
        return new C1038i(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof C1038i) {
            throw ((C1038i) obj).f9168a;
        }
    }
}
