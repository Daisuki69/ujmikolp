package c3;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: c3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1072d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1072d f9282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1072d f9283b;
    public static final /* synthetic */ EnumC1072d[] c;

    static {
        EnumC1072d enumC1072d = new EnumC1072d("CRASHLYTICS", 0);
        f9282a = enumC1072d;
        EnumC1072d enumC1072d2 = new EnumC1072d("PERFORMANCE", 1);
        f9283b = enumC1072d2;
        EnumC1072d[] enumC1072dArr = {enumC1072d, enumC1072d2, new EnumC1072d("MATT_SAYS_HI", 2)};
        c = enumC1072dArr;
        v0.h(enumC1072dArr);
    }

    public static EnumC1072d valueOf(String str) {
        return (EnumC1072d) Enum.valueOf(EnumC1072d.class, str);
    }

    public static EnumC1072d[] values() {
        return (EnumC1072d[]) c.clone();
    }
}
