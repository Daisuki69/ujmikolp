package Dh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Fh.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b[] f1157b;

    static {
        b bVar = new b("INSTANCE", 0);
        f1156a = bVar;
        f1157b = new b[]{bVar, new b("NEVER", 1)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f1157b.clone();
    }

    @Override // Fh.c
    public final int b(int i) {
        return 2;
    }

    @Override // Fh.g
    public final void clear() {
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
    }

    @Override // Fh.g
    public final boolean isEmpty() {
        return true;
    }

    @Override // Fh.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // Fh.g
    public final Object poll() {
        return null;
    }
}
