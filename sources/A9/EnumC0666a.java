package a9;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC0666a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0666a f7067b;
    public static final EnumC0666a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC0666a f7068d;
    public static final EnumC0666a e;
    public static final /* synthetic */ EnumC0666a[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7069a;

    static {
        EnumC0666a enumC0666a = new EnumC0666a("STEP_ONE", 0, 1);
        f7067b = enumC0666a;
        EnumC0666a enumC0666a2 = new EnumC0666a("STEP_TWO", 1, 2);
        c = enumC0666a2;
        EnumC0666a enumC0666a3 = new EnumC0666a("STEP_THREE", 2, 3);
        f7068d = enumC0666a3;
        EnumC0666a enumC0666a4 = new EnumC0666a("STEP_FOUR", 3, 4);
        e = enumC0666a4;
        EnumC0666a[] enumC0666aArr = {enumC0666a, enumC0666a2, enumC0666a3, enumC0666a4};
        f = enumC0666aArr;
        v0.h(enumC0666aArr);
    }

    public EnumC0666a(String str, int i, int i4) {
        this.f7069a = i4;
    }

    public static EnumC0666a valueOf(String str) {
        return (EnumC0666a) Enum.valueOf(EnumC0666a.class, str);
    }

    public static EnumC0666a[] values() {
        return (EnumC0666a[]) f.clone();
    }

    public final String a() {
        return this.f7069a + "/" + values().length;
    }
}
