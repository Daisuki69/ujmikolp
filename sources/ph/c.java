package Ph;

import dOYHB6.tiZVw8.numX49;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements Fh.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f5176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c[] f5177b;

    static {
        c cVar = new c(numX49.tnTj78("bd3P"), 0);
        f5176a = cVar;
        f5177b = new c[]{cVar};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f5177b.clone();
    }

    @Override // Fh.c
    public final int b(int i) {
        return 2;
    }

    @Override // nk.c
    public final void cancel() {
    }

    @Override // Fh.g
    public final void clear() {
    }

    @Override // Fh.g
    public final boolean isEmpty() {
        return true;
    }

    @Override // Fh.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException(numX49.tnTj78("bd3b"));
    }

    @Override // Fh.g
    public final Object poll() {
        return null;
    }

    @Override // nk.c
    public final void request(long j) {
        d.c(j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return numX49.tnTj78("bd32");
    }
}
