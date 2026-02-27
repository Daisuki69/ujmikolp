package Dh;

import Nh.q;
import Qh.e;
import Qh.h;
import bg.AbstractC0983W;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements io.reactivex.rxjava3.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f1159b;
    public Object c;

    public /* synthetic */ c(int i) {
        this.f1158a = i;
    }

    private final boolean b(io.reactivex.rxjava3.disposables.b bVar) {
        if (!this.f1159b) {
            synchronized (this) {
                try {
                    if (!this.f1159b) {
                        LinkedList linkedList = (LinkedList) this.c;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.c = linkedList;
                        }
                        linkedList.add(bVar);
                        return true;
                    }
                } finally {
                }
            }
        }
        bVar.dispose();
        return false;
    }

    private final boolean f(io.reactivex.rxjava3.disposables.b bVar) {
        if (this.f1159b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f1159b) {
                    return false;
                }
                LinkedList linkedList = (LinkedList) this.c;
                if (linkedList != null && linkedList.remove(bVar)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public static void g(h hVar) {
        if (hVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : hVar.e) {
            if (obj instanceof io.reactivex.rxjava3.disposables.b) {
                try {
                    ((io.reactivex.rxjava3.disposables.b) obj).dispose();
                } catch (Throwable th2) {
                    AbstractC0983W.G(th2);
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
            throw e.e((Throwable) arrayList.get(0));
        }
    }

    private final void h() {
        if (this.f1159b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f1159b) {
                    return;
                }
                this.f1159b = true;
                LinkedList linkedList = (LinkedList) this.c;
                ArrayList arrayList = null;
                this.c = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        ((io.reactivex.rxjava3.disposables.b) it.next()).dispose();
                    } catch (Throwable th2) {
                        AbstractC0983W.G(th2);
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
                    throw e.e((Throwable) arrayList.get(0));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean a(io.reactivex.rxjava3.disposables.b bVar) {
        switch (this.f1158a) {
            case 0:
                return b(bVar);
            default:
                Objects.requireNonNull(bVar, "disposable is null");
                if (!this.f1159b) {
                    synchronized (this) {
                        try {
                            if (!this.f1159b) {
                                h hVar = (h) this.c;
                                if (hVar == null) {
                                    hVar = new h(16);
                                    this.c = hVar;
                                }
                                hVar.b(bVar);
                                return true;
                            }
                        } finally {
                        }
                    }
                }
                bVar.dispose();
                return false;
        }
    }

    public void c(io.reactivex.rxjava3.disposables.b... bVarArr) {
        Objects.requireNonNull(bVarArr, "disposables is null");
        int i = 0;
        if (!this.f1159b) {
            synchronized (this) {
                try {
                    if (!this.f1159b) {
                        h hVar = (h) this.c;
                        if (hVar == null) {
                            hVar = new h(bVarArr.length + 1);
                            this.c = hVar;
                        }
                        int length = bVarArr.length;
                        while (i < length) {
                            io.reactivex.rxjava3.disposables.b bVar = bVarArr[i];
                            Objects.requireNonNull(bVar, "A Disposable in the disposables array is null");
                            hVar.b(bVar);
                            i++;
                        }
                        return;
                    }
                } finally {
                }
            }
        }
        int length2 = bVarArr.length;
        while (i < length2) {
            bVarArr[i].dispose();
            i++;
        }
    }

    public void d() {
        if (this.f1159b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f1159b) {
                    return;
                }
                h hVar = (h) this.c;
                this.c = null;
                g(hVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        switch (this.f1158a) {
            case 0:
                h();
                return;
            default:
                if (this.f1159b) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (!this.f1159b) {
                            this.f1159b = true;
                            h hVar = (h) this.c;
                            this.c = null;
                            g(hVar);
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public final boolean e(io.reactivex.rxjava3.disposables.b bVar) {
        Object obj;
        switch (this.f1158a) {
            case 0:
                return f(bVar);
            default:
                if (this.f1159b) {
                    return false;
                }
                synchronized (this) {
                    try {
                        if (this.f1159b) {
                            return false;
                        }
                        h hVar = (h) this.c;
                        if (hVar != null) {
                            Object[] objArr = hVar.e;
                            int i = hVar.f5390b;
                            int iHashCode = bVar.hashCode() * (-1640531527);
                            int i4 = (iHashCode ^ (iHashCode >>> 16)) & i;
                            Object obj2 = objArr[i4];
                            if (obj2 != null) {
                                if (obj2.equals(bVar)) {
                                    hVar.c(i4, i, objArr);
                                } else {
                                    do {
                                        i4 = (i4 + 1) & i;
                                        obj = objArr[i4];
                                        if (obj == null) {
                                        }
                                    } while (!obj.equals(bVar));
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
    }

    public final boolean i(io.reactivex.rxjava3.disposables.b bVar) {
        switch (this.f1158a) {
            case 0:
                if (e(bVar)) {
                    ((q) bVar).dispose();
                }
                break;
            default:
                if (e(bVar)) {
                    bVar.dispose();
                }
                break;
        }
        return true;
    }
}
