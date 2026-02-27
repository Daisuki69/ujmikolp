package bj;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: bj.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1035f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1035f f9163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1035f f9164b;
    public static final EnumC1035f c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC1035f[] f9165d;

    static {
        EnumC1035f enumC1035f = new EnumC1035f("SYNCHRONIZED", 0);
        f9163a = enumC1035f;
        EnumC1035f enumC1035f2 = new EnumC1035f("PUBLICATION", 1);
        f9164b = enumC1035f2;
        EnumC1035f enumC1035f3 = new EnumC1035f("NONE", 2);
        c = enumC1035f3;
        EnumC1035f[] enumC1035fArr = {enumC1035f, enumC1035f2, enumC1035f3};
        f9165d = enumC1035fArr;
        v0.h(enumC1035fArr);
    }

    public static EnumC1035f valueOf(String str) {
        return (EnumC1035f) Enum.valueOf(EnumC1035f.class, str);
    }

    public static EnumC1035f[] values() {
        return (EnumC1035f[]) f9165d.clone();
    }
}
