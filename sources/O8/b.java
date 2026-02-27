package O8;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f4762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f4763b;
    public static final /* synthetic */ b[] c;

    static {
        b bVar = new b("NORMAL", 0);
        f4762a = bVar;
        b bVar2 = new b("ERROR", 1);
        b bVar3 = new b("WARNING", 2);
        f4763b = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        c = bVarArr;
        v0.h(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) c.clone();
    }
}
