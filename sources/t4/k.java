package t4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f20165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f20166b;
    public static final k c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f20167d;
    public static final /* synthetic */ k[] e;

    static {
        k kVar = new k("OVERLAP", 0);
        f20165a = kVar;
        k kVar2 = new k("FOLLOW", 1);
        f20166b = kVar2;
        k kVar3 = new k("DRAG", 2);
        c = kVar3;
        k kVar4 = new k("SCROLL", 3);
        f20167d = kVar4;
        e = new k[]{kVar, kVar2, kVar3, kVar4};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) e.clone();
    }
}
