package bg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bg.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1017u extends AbstractC0988a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9126b = 1;
    public final ArrayList c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Xf.b f9127d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1017u(ArrayList _fields, Xf.b bVar) {
        super(bVar);
        kotlin.jvm.internal.j.h(_fields, "_fields");
        this.c = _fields;
        this.f9127d = bVar;
    }

    @Override // bg.AbstractC0988a0
    public final Object a() {
        switch (this.f9126b) {
            case 0:
                LinkedList linkedList = new LinkedList();
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    try {
                        Function1 function1 = ((C0960E) it.next()).e;
                        linkedList.add(function1 != null ? (String) function1.invoke(null) : null);
                    } catch (Exception e) {
                        linkedList.add(X5.f.c(e));
                        C0965G0 c0965g0 = (C0965G0) this.f9127d;
                        if (c0965g0 != null) {
                            c0965g0.b("Core", e, null);
                        }
                    }
                }
                return linkedList;
            default:
                LinkedList linkedList2 = new LinkedList();
                Iterator it2 = this.c.iterator();
                while (it2.hasNext()) {
                    try {
                        Function1 function12 = ((C0960E) it2.next()).e;
                        linkedList2.add(function12 != null ? (String) function12.invoke(null) : null);
                    } catch (Exception e7) {
                        linkedList2.add(X5.f.c(e7));
                        Xf.b bVar = this.f9127d;
                        if (bVar != null) {
                            bVar.b("Core", e7, null);
                        }
                    }
                }
                return linkedList2;
        }
    }

    @Override // Xf.a
    public final String d() {
        switch (this.f9126b) {
            case 0:
                return "HealthStats";
            default:
                return "GeneralInfo";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1017u(ArrayList _fields, C0965G0 c0965g0) {
        super(c0965g0);
        kotlin.jvm.internal.j.h(_fields, "_fields");
        this.c = _fields;
        this.f9127d = c0965g0;
    }
}
