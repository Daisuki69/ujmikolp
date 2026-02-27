package defpackage;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import k2.v0;
import kotlin.jvm.internal.z;
import n3.C1916a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC1491g0 implements WireEnum {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1916a f16766b;
    public static final C1453f0 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC1491g0 f16767d;
    public static final EnumC1491g0 e;
    public static final /* synthetic */ EnumC1491g0[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16768a;

    static {
        EnumC1491g0 enumC1491g0 = new EnumC1491g0("GWP_ASAN", 0, 0);
        f16767d = enumC1491g0;
        EnumC1491g0 enumC1491g02 = new EnumC1491g0("SCUDO", 1, 1);
        e = enumC1491g02;
        EnumC1491g0[] enumC1491g0Arr = {enumC1491g0, enumC1491g02};
        f = enumC1491g0Arr;
        v0.h(enumC1491g0Arr);
        f16766b = new C1916a(9);
        c = new C1453f0(z.a(EnumC1491g0.class), Syntax.PROTO_3, enumC1491g0);
    }

    public EnumC1491g0(String str, int i, int i4) {
        this.f16768a = i4;
    }

    public static EnumC1491g0 valueOf(String str) {
        return (EnumC1491g0) Enum.valueOf(EnumC1491g0.class, str);
    }

    public static EnumC1491g0[] values() {
        return (EnumC1491g0[]) f.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.f16768a;
    }
}
