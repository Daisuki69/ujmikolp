package hj;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: hj.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1578a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1578a f17050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC1578a[] f17051b;

    static {
        EnumC1578a enumC1578a = new EnumC1578a("COROUTINE_SUSPENDED", 0);
        f17050a = enumC1578a;
        EnumC1578a[] enumC1578aArr = {enumC1578a, new EnumC1578a("UNDECIDED", 1), new EnumC1578a("RESUMED", 2)};
        f17051b = enumC1578aArr;
        v0.h(enumC1578aArr);
    }

    public static EnumC1578a valueOf(String str) {
        return (EnumC1578a) Enum.valueOf(EnumC1578a.class, str);
    }

    public static EnumC1578a[] values() {
        return (EnumC1578a[]) f17051b.clone();
    }
}
