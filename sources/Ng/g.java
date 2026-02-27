package Ng;

import cj.C1114E;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements w {
    public static final g c = new g();

    @Override // Rg.s
    public final Set a() {
        return C1114E.f9379a;
    }

    @Override // Rg.s
    public final void b(Function2 function2) {
        Xh.i.o(this, function2);
    }

    @Override // Rg.s
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w) && ((w) obj).isEmpty();
    }

    @Override // Rg.s
    public final boolean isEmpty() {
        return true;
    }

    public final String toString() {
        return "Parameters " + C1114E.f9379a;
    }
}
