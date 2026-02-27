package Xh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f6667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f6668b;
    public static final /* synthetic */ o[] c;

    static {
        o oVar = new o("BY_NAME", 0);
        f6667a = oVar;
        o oVar2 = new o("BY_PREFIX", 1);
        o oVar3 = new o("BY_SET", 2);
        f6668b = oVar3;
        c = new o[]{oVar, oVar2, oVar3};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) c.clone();
    }

    public final String a() {
        int iOrdinal = ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? "unknown" : "sets" : "prefixes" : "names";
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? "Invalid type" : "by flag set" : "by split prefix" : "by split name";
    }
}
