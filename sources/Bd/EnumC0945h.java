package bd;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: bd.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC0945h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0945h f8641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0945h[] f8642b;

    static {
        EnumC0945h enumC0945h = new EnumC0945h("MAYA_DASHBOARD", 0);
        EnumC0945h enumC0945h2 = new EnumC0945h("OTHER", 1);
        f8641a = enumC0945h2;
        EnumC0945h[] enumC0945hArr = {enumC0945h, enumC0945h2};
        f8642b = enumC0945hArr;
        v0.h(enumC0945hArr);
    }

    public static EnumC0945h valueOf(String str) {
        return (EnumC0945h) Enum.valueOf(EnumC0945h.class, str);
    }

    public static EnumC0945h[] values() {
        return (EnumC0945h[]) f8642b.clone();
    }
}
