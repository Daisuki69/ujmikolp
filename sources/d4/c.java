package d4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 d4.c, still in use, count: 1, list:
  (r1v1 d4.c) from 0x0031: FILLED_NEW_ARRAY (r1v1 d4.c), (r0v0 d4.c), (r5v1 d4.c), (r4v1 d4.c) A[WRAPPED] (LINE:50) elemType: d4.c
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    L(1),
    /* JADX INFO: Fake field, exist only in values array */
    M(0),
    /* JADX INFO: Fake field, exist only in values array */
    Q(3),
    H(2);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c[] f16262d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16263a;

    static {
        c cVar = L;
        c cVar2 = H;
        f16262d = new c[]{cVar, cVar, cVar2, cVar};
    }

    public c(int i) {
        this.f16263a = i;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) e.clone();
    }
}
