package K3;

import R4.i;
import af.C0690e;
import af.h;
import b2.C0859a;
import b2.n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2596b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2597d;
    public final Serializable e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f2598g;

    public d(byte[] bArr, String str, ArrayList arrayList, String str2) {
        this(bArr, str, arrayList, str2, -1, -1);
    }

    @Override // af.h
    public synchronized void a() {
        try {
            Iterator it = ((HashSet) this.e).iterator();
            while (it.hasNext()) {
                ((af.g) it.next()).a();
            }
            Iterator it2 = ((HashSet) this.f).iterator();
            while (it2.hasNext()) {
                ((af.g) it2.next()).a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // af.h
    public void b(C0690e c0690e, Runnable runnable) {
        af.f fVar = new af.f(c0690e == null ? null : new i(c0690e, 18), runnable);
        synchronized (this) {
            ((LinkedList) this.f2597d).add(fVar);
            Iterator it = new HashSet((HashSet) this.e).iterator();
            while (it.hasNext()) {
                g((af.g) it.next());
            }
        }
    }

    public void c(b2.h hVar) {
        if (((HashSet) this.f2597d).contains(hVar.f8362a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.e).add(hVar);
    }

    public C0859a d() {
        if (((b2.c) this.f) != null) {
            return new C0859a(this.f2595a, new HashSet((HashSet) this.f2597d), new HashSet((HashSet) this.e), this.f2596b, this.c, (b2.c) this.f, (HashSet) this.f2598g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public synchronized af.f e(af.g gVar) {
        af.f fVar;
        af.g gVar2;
        try {
            ListIterator listIterator = ((LinkedList) this.f2597d).listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                fVar = (af.f) listIterator.next();
                gVar2 = fVar.a() != null ? (af.g) ((HashMap) this.f2598g).get(fVar.a()) : null;
                if (gVar2 == null) {
                    break;
                }
            } while (gVar2 != gVar);
            listIterator.remove();
            return fVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void f(int i) {
        if (!(this.f2596b == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.f2596b = i;
    }

    public synchronized void g(af.g gVar) {
        try {
            af.f fVarE = e(gVar);
            if (fVarE != null) {
                ((HashSet) this.f).add(gVar);
                ((HashSet) this.e).remove(gVar);
                if (fVarE.a() != null) {
                    ((HashMap) this.f2598g).put(fVarE.a(), gVar);
                }
                gVar.f7153d.post(new B5.g(15, gVar, fVarE));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // af.h
    public synchronized void start() {
        for (int i = 0; i < this.f2596b; i++) {
            af.g gVar = new af.g(this.f2595a + i, this.c);
            gVar.b(new B5.g(16, this, gVar));
            ((HashSet) this.e).add(gVar);
        }
    }

    public d(byte[] bArr, String str, ArrayList arrayList, String str2, int i, int i4) {
        this.f2597d = bArr;
        this.f2595a = str;
        this.f = arrayList;
        this.e = str2;
        this.f2596b = i4;
        this.c = i;
    }

    public d(int i, int i4) {
        this.f2597d = new LinkedList();
        this.e = new HashSet();
        this.f = new HashSet();
        this.f2598g = new HashMap();
        this.f2595a = "Sqflite";
        this.f2596b = i;
        this.c = i4;
    }

    public d(Class cls, Class[] clsArr) {
        this.f2595a = null;
        HashSet hashSet = new HashSet();
        this.f2597d = hashSet;
        this.e = new HashSet();
        this.f2596b = 0;
        this.c = 0;
        this.f2598g = new HashSet();
        hashSet.add(n.a(cls));
        for (Class cls2 : clsArr) {
            E1.c.d(cls2, "Null interface");
            ((HashSet) this.f2597d).add(n.a(cls2));
        }
    }

    public d(n nVar, n[] nVarArr) {
        this.f2595a = null;
        HashSet hashSet = new HashSet();
        this.f2597d = hashSet;
        this.e = new HashSet();
        this.f2596b = 0;
        this.c = 0;
        this.f2598g = new HashSet();
        hashSet.add(nVar);
        for (n nVar2 : nVarArr) {
            E1.c.d(nVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.f2597d, nVarArr);
    }
}
