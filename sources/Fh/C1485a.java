package fh;

import Qh.h;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import jh.e;
import of.p;
import sh.o;
import vh.AbstractC2353d;

/* JADX INFO: renamed from: fh.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1485a implements InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f16758b;
    public Object c;

    public /* synthetic */ C1485a(int i) {
        this.f16757a = i;
    }

    private final boolean b(InterfaceC1486b interfaceC1486b) {
        if (!this.f16758b) {
            synchronized (this) {
                try {
                    if (!this.f16758b) {
                        h hVar = (h) this.c;
                        if (hVar == null) {
                            hVar = new h();
                            int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                            hVar.f5390b = iNumberOfLeadingZeros - 1;
                            hVar.f5391d = (int) (0.75f * iNumberOfLeadingZeros);
                            hVar.e = new Object[iNumberOfLeadingZeros];
                            this.c = hVar;
                        }
                        hVar.a(interfaceC1486b);
                        return true;
                    }
                } finally {
                }
            }
        }
        interfaceC1486b.dispose();
        return false;
    }

    private final boolean d(InterfaceC1486b interfaceC1486b) {
        Object obj;
        e.b(interfaceC1486b, "disposables is null");
        if (this.f16758b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f16758b) {
                    return false;
                }
                h hVar = (h) this.c;
                if (hVar != null) {
                    Object[] objArr = hVar.e;
                    int i = hVar.f5390b;
                    int iHashCode = interfaceC1486b.hashCode() * (-1640531527);
                    int i4 = (iHashCode ^ (iHashCode >>> 16)) & i;
                    Object obj2 = objArr[i4];
                    if (obj2 != null) {
                        if (obj2.equals(interfaceC1486b)) {
                            hVar.c(i4, i, objArr);
                        } else {
                            do {
                                i4 = (i4 + 1) & i;
                                obj = objArr[i4];
                                if (obj == null) {
                                }
                            } while (!obj.equals(interfaceC1486b));
                            hVar.c(i4, i, objArr);
                        }
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    public static void e(h hVar) {
        if (hVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : hVar.e) {
            if (obj instanceof InterfaceC1486b) {
                try {
                    ((InterfaceC1486b) obj).dispose();
                } catch (Throwable th2) {
                    p.F(th2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw AbstractC2353d.d((Throwable) arrayList.get(0));
        }
    }

    private final void f() {
        if (this.f16758b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f16758b) {
                    return;
                }
                this.f16758b = true;
                h hVar = (h) this.c;
                this.c = null;
                e(hVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean a(InterfaceC1486b interfaceC1486b) {
        switch (this.f16757a) {
            case 0:
                return b(interfaceC1486b);
            default:
                if (!this.f16758b) {
                    synchronized (this) {
                        try {
                            if (!this.f16758b) {
                                LinkedList linkedList = (LinkedList) this.c;
                                if (linkedList == null) {
                                    linkedList = new LinkedList();
                                    this.c = linkedList;
                                }
                                linkedList.add(interfaceC1486b);
                                return true;
                            }
                        } finally {
                        }
                    }
                }
                interfaceC1486b.dispose();
                return false;
        }
    }

    public final boolean c(InterfaceC1486b interfaceC1486b) {
        switch (this.f16757a) {
            case 0:
                return d(interfaceC1486b);
            default:
                boolean z4 = false;
                if (!this.f16758b) {
                    synchronized (this) {
                        try {
                            if (!this.f16758b) {
                                LinkedList linkedList = (LinkedList) this.c;
                                if (linkedList != null && linkedList.remove(interfaceC1486b)) {
                                    z4 = true;
                                }
                            }
                        } finally {
                        }
                    }
                    break;
                }
                return z4;
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.f16757a) {
            case 0:
                f();
                return;
            default:
                if (this.f16758b) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (!this.f16758b) {
                            this.f16758b = true;
                            LinkedList linkedList = (LinkedList) this.c;
                            ArrayList arrayList = null;
                            this.c = null;
                            if (linkedList != null) {
                                Iterator it = linkedList.iterator();
                                while (it.hasNext()) {
                                    try {
                                        ((InterfaceC1486b) it.next()).dispose();
                                    } catch (Throwable th2) {
                                        p.F(th2);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(th2);
                                    }
                                }
                                if (arrayList != null) {
                                    if (arrayList.size() != 1) {
                                        throw new CompositeException(arrayList);
                                    }
                                    throw AbstractC2353d.d((Throwable) arrayList.get(0));
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public final boolean g(InterfaceC1486b interfaceC1486b) {
        switch (this.f16757a) {
            case 0:
                if (c(interfaceC1486b)) {
                    interfaceC1486b.dispose();
                }
                break;
            default:
                if (c(interfaceC1486b)) {
                    ((o) interfaceC1486b).dispose();
                }
                break;
        }
        return true;
    }

    public int h() {
        if (this.f16758b) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.f16758b) {
                    return 0;
                }
                h hVar = (h) this.c;
                return hVar != null ? hVar.c : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
