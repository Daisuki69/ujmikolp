package b3;

import k2.v0;
import w2.InterfaceC2375f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0889j implements InterfaceC2375f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0889j f8476b;
    public static final EnumC0889j c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC0889j f8477d;
    public static final /* synthetic */ EnumC0889j[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8478a;

    static {
        EnumC0889j enumC0889j = new EnumC0889j("COLLECTION_UNKNOWN", 0, 0);
        EnumC0889j enumC0889j2 = new EnumC0889j("COLLECTION_SDK_NOT_INSTALLED", 1, 1);
        f8476b = enumC0889j2;
        EnumC0889j enumC0889j3 = new EnumC0889j("COLLECTION_ENABLED", 2, 2);
        c = enumC0889j3;
        EnumC0889j enumC0889j4 = new EnumC0889j("COLLECTION_DISABLED", 3, 3);
        f8477d = enumC0889j4;
        EnumC0889j[] enumC0889jArr = {enumC0889j, enumC0889j2, enumC0889j3, enumC0889j4, new EnumC0889j("COLLECTION_DISABLED_REMOTE", 4, 4), new EnumC0889j("COLLECTION_SAMPLED", 5, 5)};
        e = enumC0889jArr;
        v0.h(enumC0889jArr);
    }

    public EnumC0889j(String str, int i, int i4) {
        this.f8478a = i4;
    }

    public static EnumC0889j valueOf(String str) {
        return (EnumC0889j) Enum.valueOf(EnumC0889j.class, str);
    }

    public static EnumC0889j[] values() {
        return (EnumC0889j[]) e.clone();
    }

    @Override // w2.InterfaceC2375f
    public final int getNumber() {
        return this.f8478a;
    }
}
