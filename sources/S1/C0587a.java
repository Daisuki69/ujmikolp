package S1;

/* JADX INFO: renamed from: S1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0587a {
    public static final C0587a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0587a f5603d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RuntimeException f5605b;

    static {
        if (p.f5619d) {
            f5603d = null;
            c = null;
        } else {
            f5603d = new C0587a(false, null);
            c = new C0587a(true, null);
        }
    }

    public C0587a(boolean z4, RuntimeException runtimeException) {
        this.f5604a = z4;
        this.f5605b = runtimeException;
    }
}
