package b2;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import t2.InterfaceC2267a;
import y2.C2499a;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements InterfaceC0860b, InterfaceC2267a {
    public static final R2.d h = new R2.d(4);
    public final i e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f8357g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f8354a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f8355b = new HashMap();
    public final HashMap c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f8356d = new HashSet();
    public final AtomicReference f = new AtomicReference();

    public e(Executor executor, ArrayList arrayList, ArrayList arrayList2, d dVar) {
        int i = 1;
        i iVar = new i(executor);
        this.e = iVar;
        this.f8357g = dVar;
        ArrayList<C0859a> arrayList3 = new ArrayList();
        arrayList3.add(C0859a.c(iVar, i.class, y2.d.class, y2.c.class));
        arrayList3.add(C0859a.c(this, InterfaceC2267a.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C0859a c0859a = (C0859a) it.next();
            if (c0859a != null) {
                arrayList3.add(c0859a);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((B2.b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f8357g.a(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((C0859a) it4.next()).f8350b.toArray();
                int length = array.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        Object obj = array[i4];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f8356d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f8356d.add(obj.toString());
                        }
                        i4++;
                    }
                }
            }
            if (this.f8354a.isEmpty()) {
                x3.d.k(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f8354a.keySet());
                arrayList6.addAll(arrayList3);
                x3.d.k(arrayList6);
            }
            for (C0859a c0859a2 : arrayList3) {
                this.f8354a.put(c0859a2, new j(new U1.c(i, this, c0859a2)));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            h();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) this.f.get();
        if (bool != null) {
            b(this.f8354a, bool.booleanValue());
        }
    }

    @Override // b2.InterfaceC0860b
    public final l a(n nVar) {
        B2.b bVarE = e(nVar);
        return bVarE == null ? new l(l.c, l.f8370d) : bVarE instanceof l ? (l) bVarE : new l(null, bVarE);
    }

    public final void b(HashMap map, boolean z4) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            C0859a c0859a = (C0859a) entry.getKey();
            B2.b bVar = (B2.b) entry.getValue();
            int i = c0859a.f8351d;
            if (i == 1 || (i == 2 && z4)) {
                bVar.get();
            }
        }
        i iVar = this.e;
        synchronized (iVar) {
            arrayDeque = iVar.f8365b;
            if (arrayDeque != null) {
                iVar.f8365b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                iVar.a((C2499a) it.next());
            }
        }
    }

    public final void c(boolean z4) {
        HashMap map;
        AtomicReference atomicReference = this.f;
        Boolean boolValueOf = Boolean.valueOf(z4);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            map = new HashMap(this.f8354a);
        }
        b(map, z4);
    }

    @Override // b2.InterfaceC0860b
    public final B2.b d(Class cls) {
        return e(n.a(cls));
    }

    @Override // b2.InterfaceC0860b
    public final synchronized B2.b e(n nVar) {
        E1.c.d(nVar, "Null interface requested.");
        return (B2.b) this.f8355b.get(nVar);
    }

    @Override // b2.InterfaceC0860b
    public final Object f(n nVar) {
        B2.b bVarE = e(nVar);
        if (bVarE == null) {
            return null;
        }
        return bVarE.get();
    }

    @Override // b2.InterfaceC0860b
    public final Set g(n nVar) {
        B2.b bVar;
        synchronized (this) {
            bVar = (k) this.c.get(nVar);
            if (bVar == null) {
                bVar = h;
            }
        }
        return (Set) bVar.get();
    }

    @Override // b2.InterfaceC0860b
    public final Object get(Class cls) {
        return f(n.a(cls));
    }

    public final void h() {
        for (C0859a c0859a : this.f8354a.keySet()) {
            for (h hVar : c0859a.c) {
                boolean z4 = hVar.f8363b == 2;
                n nVar = hVar.f8362a;
                if (z4) {
                    HashMap map = this.c;
                    if (!map.containsKey(nVar)) {
                        Set set = Collections.EMPTY_SET;
                        k kVar = new k();
                        kVar.f8369b = null;
                        kVar.f8368a = Collections.newSetFromMap(new ConcurrentHashMap());
                        kVar.f8368a.addAll(set);
                        map.put(nVar, kVar);
                    }
                }
                HashMap map2 = this.f8355b;
                if (map2.containsKey(nVar)) {
                    continue;
                } else {
                    int i = hVar.f8363b;
                    if (i == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + c0859a + ": " + nVar);
                    }
                    if (i != 2) {
                        map2.put(nVar, new l(l.c, l.f8370d));
                    }
                }
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0859a c0859a = (C0859a) it.next();
            if (c0859a.e == 0) {
                B2.b bVar = (B2.b) this.f8354a.get(c0859a);
                for (n nVar : c0859a.f8350b) {
                    HashMap map = this.f8355b;
                    if (map.containsKey(nVar)) {
                        arrayList2.add(new androidx.media3.common.util.g(11, (l) ((B2.b) map.get(nVar)), bVar));
                    } else {
                        map.put(nVar, bVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f8354a.entrySet()) {
            C0859a c0859a = (C0859a) entry.getKey();
            if (c0859a.e != 0) {
                B2.b bVar = (B2.b) entry.getValue();
                for (n nVar : c0859a.f8350b) {
                    if (!map.containsKey(nVar)) {
                        map.put(nVar, new HashSet());
                    }
                    ((Set) map.get(nVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = this.c;
            if (map2.containsKey(key)) {
                k kVar = (k) map2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new androidx.media3.common.util.g(12, kVar, (B2.b) it.next()));
                }
            } else {
                n nVar2 = (n) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                k kVar2 = new k();
                kVar2.f8369b = null;
                kVar2.f8368a = Collections.newSetFromMap(new ConcurrentHashMap());
                kVar2.f8368a.addAll(set);
                map2.put(nVar2, kVar2);
            }
        }
        return arrayList;
    }
}
