package bj;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: bj.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1034e {
    public static InterfaceC1033d a(EnumC1035f enumC1035f, Function0 function0) {
        int iOrdinal = enumC1035f.ordinal();
        if (iOrdinal == 0) {
            return new C1041l(function0, null, 2, null);
        }
        if (iOrdinal == 1) {
            C1040k c1040k = new C1040k();
            c1040k.f9170a = function0;
            c1040k.f9171b = C1048s.f9178a;
            return c1040k;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        C1050u c1050u = new C1050u();
        c1050u.f9179a = function0;
        c1050u.f9180b = C1048s.f9178a;
        return c1050u;
    }

    public static InterfaceC1033d b(Function0 initializer) {
        kotlin.jvm.internal.j.g(initializer, "initializer");
        return new C1041l(initializer, null, 2, null);
    }
}
