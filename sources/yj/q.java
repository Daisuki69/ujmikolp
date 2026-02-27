package yj;

import cj.C1112C;
import cj.C1132s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes11.dex */
public class q extends o {
    public static int g(Sequence sequence) {
        Iterator it = sequence.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                C1132s.j();
                throw null;
            }
        }
        return i;
    }

    public static f h(Sequence sequence, Function1 predicate) {
        kotlin.jvm.internal.j.g(sequence, "<this>");
        kotlin.jvm.internal.j.g(predicate, "predicate");
        return new f(sequence, true, predicate);
    }

    public static f i(Sequence sequence) {
        return new f(sequence, false, new yc.m(18));
    }

    public static Object j(Sequence sequence) {
        kotlin.jvm.internal.j.g(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static Object k(Sequence sequence) {
        Iterator it = sequence.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static String l(Sequence sequence, String str) {
        kotlin.jvm.internal.j.g(sequence, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int i = 0;
        for (Object obj : sequence) {
            i++;
            if (i > 1) {
                sb2.append((CharSequence) str);
            }
            zj.r.a(sb2, obj, null);
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    public static Object m(Sequence sequence) {
        kotlin.jvm.internal.j.g(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static r n(Sequence sequence, Function1 function1) {
        kotlin.jvm.internal.j.g(sequence, "<this>");
        return new r(sequence, function1);
    }

    public static f o(Sequence sequence, Function1 transform) {
        kotlin.jvm.internal.j.g(sequence, "<this>");
        kotlin.jvm.internal.j.g(transform, "transform");
        return i(new r(sequence, transform));
    }

    public static boolean p(f fVar) {
        boolean z4;
        Iterator it = fVar.f21316a.iterator();
        while (true) {
            if (!it.hasNext()) {
                z4 = false;
                break;
            }
            if (((Boolean) fVar.c.invoke(it.next())).booleanValue() == fVar.f21317b) {
                z4 = true;
                break;
            }
        }
        return !(z4);
    }

    public static List q(Sequence sequence) {
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return C1112C.f9377a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return cj.r.c(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
