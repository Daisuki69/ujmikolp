package b3;

import k2.v0;
import w2.InterfaceC2375f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0892m implements InterfaceC2375f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0892m f8484b;
    public static final /* synthetic */ EnumC0892m[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8485a;

    static {
        EnumC0892m enumC0892m = new EnumC0892m("EVENT_TYPE_UNKNOWN", 0, 0);
        EnumC0892m enumC0892m2 = new EnumC0892m("SESSION_START", 1, 1);
        f8484b = enumC0892m2;
        EnumC0892m[] enumC0892mArr = {enumC0892m, enumC0892m2};
        c = enumC0892mArr;
        v0.h(enumC0892mArr);
    }

    public EnumC0892m(String str, int i, int i4) {
        this.f8485a = i4;
    }

    public static EnumC0892m valueOf(String str) {
        return (EnumC0892m) Enum.valueOf(EnumC0892m.class, str);
    }

    public static EnumC0892m[] values() {
        return (EnumC0892m[]) c.clone();
    }

    @Override // w2.InterfaceC2375f
    public final int getNumber() {
        return this.f8485a;
    }
}
