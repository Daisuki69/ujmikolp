package ac;

import dOYHB6.tiZVw8.numX49;
import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ac.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC0678b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0678b f7092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0678b f7093b;
    public static final /* synthetic */ EnumC0678b[] c;

    static {
        EnumC0678b enumC0678b = new EnumC0678b(numX49.tnTj78("buO0"), 0);
        f7092a = enumC0678b;
        EnumC0678b enumC0678b2 = new EnumC0678b(numX49.tnTj78("buOg"), 1);
        f7093b = enumC0678b2;
        EnumC0678b[] enumC0678bArr = {enumC0678b, enumC0678b2};
        c = enumC0678bArr;
        v0.h(enumC0678bArr);
    }

    public static EnumC0678b valueOf(String str) {
        return (EnumC0678b) Enum.valueOf(EnumC0678b.class, str);
    }

    public static EnumC0678b[] values() {
        return (EnumC0678b[]) c.clone();
    }
}
