package bg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bg.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0993d extends AbstractC0988a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8937b;
    public final n0 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f8938d;
    public final C0965G0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0993d(n0 _permissionHelper, ArrayList _fields, C0965G0 c0965g0, int i) {
        super(c0965g0);
        this.f8937b = i;
        switch (i) {
            case 1:
                kotlin.jvm.internal.j.h(_permissionHelper, "_permissionHelper");
                kotlin.jvm.internal.j.h(_fields, "_fields");
                super(c0965g0);
                this.c = _permissionHelper;
                this.f8938d = _fields;
                this.e = c0965g0;
                break;
            case 2:
                kotlin.jvm.internal.j.h(_permissionHelper, "_permissionHelper");
                kotlin.jvm.internal.j.h(_fields, "_rules");
                super(c0965g0);
                this.c = _permissionHelper;
                this.f8938d = _fields;
                this.e = c0965g0;
                break;
            case 3:
                kotlin.jvm.internal.j.h(_permissionHelper, "_permissionHelper");
                kotlin.jvm.internal.j.h(_fields, "_rules");
                super(c0965g0);
                this.c = _permissionHelper;
                this.f8938d = _fields;
                this.e = c0965g0;
                break;
            default:
                kotlin.jvm.internal.j.h(_permissionHelper, "_permissionHelper");
                kotlin.jvm.internal.j.h(_fields, "_fields");
                this.c = _permissionHelper;
                this.f8938d = _fields;
                this.e = c0965g0;
                break;
        }
    }

    @Override // bg.AbstractC0988a0
    public final Object a() throws IllegalAccessException {
        C0965G0 c0965g0;
        C0965G0 c0965g02;
        C0965G0 c0965g03;
        String str;
        C0965G0 c0965g04;
        switch (this.f8937b) {
            case 0:
                LinkedList linkedList = new LinkedList();
                for (C0960E c0960e : this.f8938d) {
                    try {
                        Iterator it = c0960e.c.iterator();
                        while (it.hasNext()) {
                            this.c.c((String) it.next());
                            break;
                        }
                        Function1 function1 = c0960e.e;
                        linkedList.add(function1 != null ? (String) function1.invoke(null) : null);
                    } catch (Exception e) {
                        linkedList.add(X5.f.c(e));
                        if (!(e instanceof IllegalAccessException) && (c0965g0 = this.e) != null) {
                            c0965g0.b("Core", e, null);
                        }
                    }
                }
                return linkedList;
            case 1:
                n0 n0Var = this.c;
                n0Var.c("android.permission.ACCESS_NETWORK_STATE");
                LinkedList linkedList2 = new LinkedList();
                for (C0960E c0960e2 : this.f8938d) {
                    try {
                        Iterator it2 = c0960e2.c.iterator();
                        while (it2.hasNext()) {
                            n0Var.c((String) it2.next());
                            break;
                        }
                        Function1 function12 = c0960e2.e;
                        linkedList2.add(function12 != null ? (String) function12.invoke(null) : null);
                    } catch (Exception e7) {
                        linkedList2.add(X5.f.c(e7));
                        if (!(e7 instanceof IllegalAccessException) && (c0965g02 = this.e) != null) {
                            c0965g02.b("Core", e7, null);
                        }
                    }
                }
                return linkedList2;
            case 2:
                LinkedList linkedList3 = new LinkedList();
                for (C0960E c0960e3 : this.f8938d) {
                    try {
                        Iterator it3 = c0960e3.c.iterator();
                        while (it3.hasNext()) {
                            this.c.c((String) it3.next());
                            break;
                        }
                        Function1 function13 = c0960e3.e;
                        String str2 = function13 != null ? (String) function13.invoke(null) : null;
                        Function1 function14 = c0960e3.f;
                        if (function14 != null && (str = (String) function14.invoke(str2)) != null) {
                            str2 = str;
                        }
                        linkedList3.add(str2);
                    } catch (Exception e10) {
                        linkedList3.add(X5.f.c(e10));
                        if (!(e10 instanceof IllegalAccessException) && (c0965g03 = this.e) != null) {
                            c0965g03.b("Core", e10, null);
                        }
                    }
                }
                return linkedList3;
            default:
                LinkedList linkedList4 = new LinkedList();
                for (C0960E c0960e4 : this.f8938d) {
                    try {
                        Iterator it4 = c0960e4.c.iterator();
                        while (it4.hasNext()) {
                            this.c.c((String) it4.next());
                            break;
                        }
                        Function1 function15 = c0960e4.e;
                        linkedList4.add(function15 != null ? (String) function15.invoke(null) : null);
                    } catch (Exception e11) {
                        linkedList4.add(X5.f.c(e11));
                        if (!(e11 instanceof IllegalAccessException) && (c0965g04 = this.e) != null) {
                            c0965g04.b("Core", e11, null);
                        }
                    }
                }
                return linkedList4;
        }
    }

    @Override // Xf.a
    public final String d() {
        switch (this.f8937b) {
            case 0:
                return "Hardware";
            case 1:
                return "Network";
            case 2:
                return "GeneralData";
            default:
                return "PhoneSettings";
        }
    }
}
