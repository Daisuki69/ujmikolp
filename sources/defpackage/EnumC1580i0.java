package defpackage;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import k2.v0;
import kotlin.jvm.internal.z;
import p3.C2011b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC1580i0 implements WireEnum {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2011b f17061b;
    public static final C1529h0 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC1580i0 f17062d;
    public static final EnumC1580i0 e;
    public static final EnumC1580i0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC1580i0 f17063g;
    public static final EnumC1580i0 h;
    public static final EnumC1580i0 i;
    public static final /* synthetic */ EnumC1580i0[] j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17064a;

    static {
        EnumC1580i0 enumC1580i0 = new EnumC1580i0("UNKNOWN", 0, 0);
        f17062d = enumC1580i0;
        EnumC1580i0 enumC1580i02 = new EnumC1580i0("USE_AFTER_FREE", 1, 1);
        e = enumC1580i02;
        EnumC1580i0 enumC1580i03 = new EnumC1580i0("DOUBLE_FREE", 2, 2);
        f = enumC1580i03;
        EnumC1580i0 enumC1580i04 = new EnumC1580i0("INVALID_FREE", 3, 3);
        f17063g = enumC1580i04;
        EnumC1580i0 enumC1580i05 = new EnumC1580i0("BUFFER_OVERFLOW", 4, 4);
        h = enumC1580i05;
        EnumC1580i0 enumC1580i06 = new EnumC1580i0("BUFFER_UNDERFLOW", 5, 5);
        i = enumC1580i06;
        EnumC1580i0[] enumC1580i0Arr = {enumC1580i0, enumC1580i02, enumC1580i03, enumC1580i04, enumC1580i05, enumC1580i06};
        j = enumC1580i0Arr;
        v0.h(enumC1580i0Arr);
        f17061b = new C2011b(9);
        c = new C1529h0(z.a(EnumC1580i0.class), Syntax.PROTO_3, enumC1580i0);
    }

    public EnumC1580i0(String str, int i4, int i6) {
        this.f17064a = i6;
    }

    public static EnumC1580i0 valueOf(String str) {
        return (EnumC1580i0) Enum.valueOf(EnumC1580i0.class, str);
    }

    public static EnumC1580i0[] values() {
        return (EnumC1580i0[]) j.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.f17064a;
    }
}
