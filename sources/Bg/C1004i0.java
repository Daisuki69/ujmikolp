package bg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bg.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1004i0 extends AbstractC0988a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public M5.c f9014b;
    public final ArrayList c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0965G0 f9015d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004i0(ArrayList _fields, C0965G0 c0965g0) {
        super(c0965g0);
        kotlin.jvm.internal.j.h(_fields, "_fields");
        this.c = _fields;
        this.f9015d = c0965g0;
    }

    @Override // bg.AbstractC0988a0
    public final Object a() {
        LinkedList linkedList = new LinkedList();
        M5.c cVar = this.f9014b;
        if (cVar == null) {
            kotlin.jvm.internal.j.n("metaDataContainer");
            throw null;
        }
        for (C0994d0 c0994d0 : cVar.f3083a) {
            LinkedList linkedList2 = new LinkedList();
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                try {
                    Function1 function1 = ((C0960E) it.next()).e;
                    linkedList2.add(function1 != null ? (String) function1.invoke(c0994d0) : null);
                } catch (Exception e) {
                    linkedList2.add(X5.f.c(e));
                    C0965G0 c0965g0 = this.f9015d;
                    if (c0965g0 != null) {
                        c0965g0.b("Core", e, null);
                    }
                }
            }
            linkedList.add(linkedList2);
        }
        return linkedList;
    }

    @Override // Xf.a
    public final String d() {
        return "ExtractorsPerformance";
    }
}
