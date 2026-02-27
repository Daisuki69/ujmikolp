package s5;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements InterfaceC2237a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f20011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ e[] f20012b;

    static {
        e eVar = new e("INTERNAL_AD_SCREEN", 0);
        f20011a = eVar;
        e[] eVarArr = {eVar};
        f20012b = eVarArr;
        v0.h(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f20012b.clone();
    }
}
