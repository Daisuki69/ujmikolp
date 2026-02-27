package Ih;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f2324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ r[] f2325b;

    static {
        r rVar = new r("INSTANCE", 0);
        f2324a = rVar;
        f2325b = new r[]{rVar};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f2325b.clone();
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        ((nk.c) obj).request(Long.MAX_VALUE);
    }
}
