package yj;

import cj.C1128n;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import yc.C2525f;

/* JADX INFO: loaded from: classes11.dex */
public class n extends m {
    public static Sequence b(Iterator it) {
        kotlin.jvm.internal.j.g(it, "<this>");
        return new C2536a(new C1128n(it, 4));
    }

    public static Sequence c() {
        return d.f21312a;
    }

    public static final g d(Sequence sequence, Function1 function1) {
        if (!(sequence instanceof r)) {
            return new g(sequence, new yc.m(17), function1);
        }
        r rVar = (r) sequence;
        return new g(rVar.f21328a, rVar.f21329b, function1);
    }

    public static Sequence e(Function1 nextFunction, Object obj) {
        kotlin.jvm.internal.j.g(nextFunction, "nextFunction");
        return obj == null ? d.f21312a : new i(new C2525f(obj, 4), nextFunction);
    }

    public static Sequence f(Object... objArr) {
        return objArr.length == 0 ? d.f21312a : new C1128n(objArr, 0);
    }
}
