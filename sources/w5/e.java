package W5;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements Y5.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f6314b;
    public static final e c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e[] f6315d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6316a;

    static {
        e eVar = new e("ANONYMOUS", 0, "anonymous");
        f6314b = eVar;
        e eVar2 = new e("USER", 1, "user");
        c = eVar2;
        e[] eVarArr = {eVar, eVar2};
        f6315d = eVarArr;
        v0.h(eVarArr);
    }

    public e(String str, int i, String str2) {
        this.f6316a = str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f6315d.clone();
    }
}
