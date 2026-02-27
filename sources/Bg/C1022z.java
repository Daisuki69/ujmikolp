package bg;

import cj.C1110A;
import cj.C1129o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bg.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1022z extends AbstractC0988a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9143b = 0;
    public final ArrayList c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0965G0 f9144d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1022z(ArrayList _fields, ArrayList _moduleConfigurations, C0965G0 c0965g0) {
        super(c0965g0);
        kotlin.jvm.internal.j.h(_fields, "_fields");
        kotlin.jvm.internal.j.h(_moduleConfigurations, "_moduleConfigurations");
        this.c = _fields;
        this.e = _moduleConfigurations;
        this.f9144d = c0965g0;
    }

    @Override // bg.AbstractC0988a0
    public final Object a() {
        switch (this.f9143b) {
            case 0:
                LinkedList linkedList = new LinkedList();
                for (Pair pair : (ArrayList) this.e) {
                    LinkedList linkedList2 = new LinkedList();
                    Iterator it = this.c.iterator();
                    while (it.hasNext()) {
                        try {
                            Function1 function1 = ((C0960E) it.next()).e;
                            linkedList2.add(function1 != null ? (String) function1.invoke(pair) : null);
                        } catch (Exception e) {
                            linkedList2.add(X5.f.c(e));
                            C0965G0 c0965g0 = this.f9144d;
                            if (c0965g0 != null) {
                                c0965g0.b("Core", e, null);
                            }
                        }
                    }
                    linkedList.add(linkedList2);
                }
                return linkedList;
            default:
                LinkedList linkedList3 = new LinkedList();
                String[] strArr = (String[]) this.e;
                kotlin.jvm.internal.j.g(strArr, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet(cj.L.b(strArr.length));
                C1129o.y(strArr, linkedHashSet);
                for (String str : C1110A.V(linkedHashSet)) {
                    LinkedList linkedList4 = new LinkedList();
                    Iterator it2 = this.c.iterator();
                    while (it2.hasNext()) {
                        try {
                            Function1 function12 = ((C0960E) it2.next()).e;
                            linkedList4.add(function12 != null ? (String) function12.invoke(str) : null);
                        } catch (Exception e7) {
                            linkedList4.add(X5.f.c(e7));
                            C0965G0 c0965g02 = this.f9144d;
                            if (c0965g02 != null) {
                                c0965g02.b("Core", e7, null);
                            }
                        }
                    }
                    linkedList3.add(linkedList4);
                }
                return linkedList3;
        }
    }

    @Override // Xf.a
    public final String d() {
        switch (this.f9143b) {
            case 0:
                return "Modules";
            default:
                return "Permissions";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1022z(ArrayList _fields, String[] _requiredPermissions, C0965G0 c0965g0) {
        super(c0965g0);
        kotlin.jvm.internal.j.h(_fields, "_fields");
        kotlin.jvm.internal.j.h(_requiredPermissions, "_requiredPermissions");
        this.c = _fields;
        this.e = _requiredPermissions;
        this.f9144d = c0965g0;
    }
}
