package b3;

import k2.v0;
import w2.InterfaceC2375f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b3.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0904y implements InterfaceC2375f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0904y f8503b;
    public static final /* synthetic */ EnumC0904y[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8504a;

    static {
        EnumC0904y enumC0904y = new EnumC0904y("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
        EnumC0904y enumC0904y2 = new EnumC0904y("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
        EnumC0904y enumC0904y3 = new EnumC0904y("LOG_ENVIRONMENT_STAGING", 2, 2);
        EnumC0904y enumC0904y4 = new EnumC0904y("LOG_ENVIRONMENT_PROD", 3, 3);
        f8503b = enumC0904y4;
        EnumC0904y[] enumC0904yArr = {enumC0904y, enumC0904y2, enumC0904y3, enumC0904y4};
        c = enumC0904yArr;
        v0.h(enumC0904yArr);
    }

    public EnumC0904y(String str, int i, int i4) {
        this.f8504a = i4;
    }

    public static EnumC0904y valueOf(String str) {
        return (EnumC0904y) Enum.valueOf(EnumC0904y.class, str);
    }

    public static EnumC0904y[] values() {
        return (EnumC0904y[]) c.clone();
    }

    @Override // w2.InterfaceC2375f
    public final int getNumber() {
        return this.f8504a;
    }
}
