package Z0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f6874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f6875b;
    public static final e c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e[] f6876d;

    static {
        e eVar = new e("DEFAULT", 0);
        f6874a = eVar;
        e eVar2 = new e("VERY_LOW", 1);
        f6875b = eVar2;
        e eVar3 = new e("HIGHEST", 2);
        c = eVar3;
        f6876d = new e[]{eVar, eVar2, eVar3};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f6876d.clone();
    }
}
