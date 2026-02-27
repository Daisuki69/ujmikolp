package pc;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: pc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2032a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2032a f19083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC2032a f19084b;
    public static final EnumC2032a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC2032a[] f19085d;

    static {
        EnumC2032a enumC2032a = new EnumC2032a("NONE", 0);
        f19083a = enumC2032a;
        EnumC2032a enumC2032a2 = new EnumC2032a("FETCH_CMS_FAILURE", 1);
        f19084b = enumC2032a2;
        EnumC2032a enumC2032a3 = new EnumC2032a("PREFILL_PROFILE_FAILURE", 2);
        c = enumC2032a3;
        EnumC2032a[] enumC2032aArr = {enumC2032a, enumC2032a2, enumC2032a3, new EnumC2032a("FETCH_CMS_AND_PROFILE_DATA_FAILURE", 3)};
        f19085d = enumC2032aArr;
        v0.h(enumC2032aArr);
    }

    public static EnumC2032a valueOf(String str) {
        return (EnumC2032a) Enum.valueOf(EnumC2032a.class, str);
    }

    public static EnumC2032a[] values() {
        return (EnumC2032a[]) f19085d.clone();
    }
}
