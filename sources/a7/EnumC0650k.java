package a7;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a7.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC0650k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0650k f7025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0650k f7026b;
    public static final EnumC0650k c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC0650k[] f7027d;

    static {
        EnumC0650k enumC0650k = new EnumC0650k("EQUAL_SPACING", 0);
        f7025a = enumC0650k;
        EnumC0650k enumC0650k2 = new EnumC0650k("DASHBOARD", 1);
        f7026b = enumC0650k2;
        EnumC0650k enumC0650k3 = new EnumC0650k("MAYA_DASHBOARD", 2);
        c = enumC0650k3;
        EnumC0650k[] enumC0650kArr = {enumC0650k, enumC0650k2, enumC0650k3};
        f7027d = enumC0650kArr;
        v0.h(enumC0650kArr);
    }

    public static EnumC0650k valueOf(String str) {
        return (EnumC0650k) Enum.valueOf(EnumC0650k.class, str);
    }

    public static EnumC0650k[] values() {
        return (EnumC0650k[]) f7027d.clone();
    }
}
