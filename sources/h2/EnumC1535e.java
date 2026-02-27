package h2;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1535e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1535e f16861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f16862b;
    public static final /* synthetic */ EnumC1535e[] c;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1535e EF10;

    static {
        EnumC1535e enumC1535e = new EnumC1535e("X86_32", 0);
        EnumC1535e enumC1535e2 = new EnumC1535e("X86_64", 1);
        EnumC1535e enumC1535e3 = new EnumC1535e("ARM_UNKNOWN", 2);
        EnumC1535e enumC1535e4 = new EnumC1535e("PPC", 3);
        EnumC1535e enumC1535e5 = new EnumC1535e("PPC64", 4);
        EnumC1535e enumC1535e6 = new EnumC1535e("ARMV6", 5);
        EnumC1535e enumC1535e7 = new EnumC1535e("ARMV7", 6);
        EnumC1535e enumC1535e8 = new EnumC1535e("UNKNOWN", 7);
        f16861a = enumC1535e8;
        EnumC1535e enumC1535e9 = new EnumC1535e("ARMV7S", 8);
        EnumC1535e enumC1535e10 = new EnumC1535e("ARM64", 9);
        c = new EnumC1535e[]{enumC1535e, enumC1535e2, enumC1535e3, enumC1535e4, enumC1535e5, enumC1535e6, enumC1535e7, enumC1535e8, enumC1535e9, enumC1535e10};
        HashMap map = new HashMap(4);
        f16862b = map;
        map.put("armeabi-v7a", enumC1535e7);
        map.put("armeabi", enumC1535e6);
        map.put("arm64-v8a", enumC1535e10);
        map.put("x86", enumC1535e);
    }

    public static EnumC1535e valueOf(String str) {
        return (EnumC1535e) Enum.valueOf(EnumC1535e.class, str);
    }

    public static EnumC1535e[] values() {
        return (EnumC1535e[]) c.clone();
    }
}
