package V0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6025b;
    public static final a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f6026d;

    static {
        a aVar = new a("WIDTH", 0);
        f6024a = aVar;
        a aVar2 = new a("HEIGHT", 1);
        f6025b = aVar2;
        a aVar3 = new a("BOTH", 2);
        c = aVar3;
        f6026d = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f6026d.clone();
    }
}
