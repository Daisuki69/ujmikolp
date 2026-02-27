package defpackage;

import M2.b;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import k2.v0;
import kotlin.jvm.internal.z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0842b implements WireEnum {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f8261b;
    public static final C0616a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC0842b f8262d;
    public static final EnumC0842b e;
    public static final EnumC0842b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC0842b f8263g;
    public static final EnumC0842b h;
    public static final EnumC0842b i;
    public static final /* synthetic */ EnumC0842b[] j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8264a;

    static {
        EnumC0842b enumC0842b = new EnumC0842b("ARM32", 0, 0);
        f8262d = enumC0842b;
        EnumC0842b enumC0842b2 = new EnumC0842b("ARM64", 1, 1);
        e = enumC0842b2;
        EnumC0842b enumC0842b3 = new EnumC0842b("X86", 2, 2);
        f = enumC0842b3;
        EnumC0842b enumC0842b4 = new EnumC0842b("X86_64", 3, 3);
        f8263g = enumC0842b4;
        EnumC0842b enumC0842b5 = new EnumC0842b("RISCV64", 4, 4);
        h = enumC0842b5;
        EnumC0842b enumC0842b6 = new EnumC0842b("NONE", 5, 5);
        i = enumC0842b6;
        EnumC0842b[] enumC0842bArr = {enumC0842b, enumC0842b2, enumC0842b3, enumC0842b4, enumC0842b5, enumC0842b6};
        j = enumC0842bArr;
        v0.h(enumC0842bArr);
        f8261b = new b(1);
        c = new C0616a(z.a(EnumC0842b.class), Syntax.PROTO_3, enumC0842b);
    }

    public EnumC0842b(String str, int i4, int i6) {
        this.f8264a = i6;
    }

    public static EnumC0842b valueOf(String str) {
        return (EnumC0842b) Enum.valueOf(EnumC0842b.class, str);
    }

    public static EnumC0842b[] values() {
        return (EnumC0842b[]) j.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.f8264a;
    }
}
