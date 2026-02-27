package s5;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements InterfaceC2237a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f20027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ m[] f20028b;

    static {
        m mVar = new m("INTERNAL_AD_SCREEN", 0);
        f20027a = mVar;
        m[] mVarArr = {mVar};
        f20028b = mVarArr;
        v0.h(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f20028b.clone();
    }
}
