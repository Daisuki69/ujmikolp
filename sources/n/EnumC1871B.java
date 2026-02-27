package n;

import dOYHB6.tiZVw8.numX49;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: n.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1871B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1871B f18451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1871B f18452b;
    public static final /* synthetic */ EnumC1871B[] c;

    static {
        EnumC1871B enumC1871B = new EnumC1871B(numX49.tnTj78("b24e"), 0);
        f18451a = enumC1871B;
        EnumC1871B enumC1871B2 = new EnumC1871B(numX49.tnTj78("b248"), 1);
        f18452b = enumC1871B2;
        c = new EnumC1871B[]{enumC1871B, enumC1871B2, new EnumC1871B(numX49.tnTj78("b24C"), 2)};
    }

    public static EnumC1871B valueOf(String str) {
        return (EnumC1871B) Enum.valueOf(EnumC1871B.class, str);
    }

    public static EnumC1871B[] values() {
        return (EnumC1871B[]) c.clone();
    }
}
