package bi;

import Xh.r;
import android.os.Handler;
import android.os.Looper;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import ki.AbstractC1780a;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends AbstractRunnableC1025c implements InterfaceC1027e {
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Qd.a f9154d;
    public final ConcurrentHashMap e;
    public final AbstractC1780a f;

    public h(AbstractC1780a abstractC1780a, int i) {
        this.f = abstractC1780a;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.e = concurrentHashMap;
        this.f9154d = new Qd.a(28);
        concurrentHashMap.put(EnumC1028f.f9151a, 1);
        concurrentHashMap.put(EnumC1028f.c, 1);
        concurrentHashMap.put(EnumC1028f.f9152b, 1);
        concurrentHashMap.put(EnumC1028f.f9153d, -1);
        new Thread(new Xj.b(this, i, 1)).start();
    }

    @Override // bi.InterfaceC1027e
    public final void a(i iVar) {
        Objects.requireNonNull(iVar);
        if ((iVar == i.e || iVar == i.c) && d(EnumC1028f.f9151a)) {
            return;
        }
        try {
            this.f9148a.add(iVar);
        } catch (IllegalStateException unused) {
            Ri.a.d(numX49.tnTj78("bu6V"));
        }
    }

    @Override // bi.AbstractRunnableC1025c
    public final void b() {
        Set set = this.f9149b;
        try {
            i iVar = (i) this.f9148a.take();
            set.add(iVar);
            int iOrdinal = iVar.ordinal();
            EnumC1028f enumC1028f = EnumC1028f.f9153d;
            EnumC1028f enumC1028f2 = EnumC1028f.f9151a;
            switch (iOrdinal) {
                case 0:
                case 1:
                case 8:
                case 9:
                    if (set.contains(i.f9156b) && set.contains(i.f9155a) && set.contains(i.i) && set.contains(i.j)) {
                        f(EnumC1028f.f9152b);
                        break;
                    }
                    break;
                case 2:
                case 4:
                    if (!d(enumC1028f2)) {
                        g();
                    }
                    break;
                case 3:
                case 5:
                case 10:
                case 11:
                    if (!d(enumC1028f2)) {
                        g();
                    } else {
                        f(enumC1028f);
                    }
                    break;
                case 6:
                    if (!d(enumC1028f2)) {
                        f(EnumC1028f.c);
                    }
                    break;
                case 7:
                    if (d(enumC1028f2)) {
                        f(enumC1028f);
                    }
                    break;
            }
        } catch (InterruptedException e) {
            Ri.a.d(e.getMessage());
        }
    }

    public final void c(EnumC1028f enumC1028f, AbstractC1029g abstractC1029g) {
        if (abstractC1029g != null) {
            int iOrdinal = enumC1028f.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new IllegalArgumentException();
            }
            Xh.h hVar = (Xh.h) this.f9154d.f5354b;
            AbstractC1780a abstractC1780a = this.f;
            Objects.requireNonNull(abstractC1780a);
            r rVar = new r(abstractC1029g, hVar, false);
            r rVar2 = new r(abstractC1029g, hVar, true);
            abstractC1780a.l(rVar, null);
            if (((Handler) abstractC1780a.c) == null) {
                abstractC1780a.c = new Handler(Looper.getMainLooper());
            }
            Handler handler = (Handler) abstractC1780a.c;
            if (((Yi.a) abstractC1780a.f18135a).isShutdown()) {
                return;
            }
            handler.post(new C.h(rVar2, 23));
        }
    }

    public final boolean d(EnumC1028f enumC1028f) {
        Integer num = (Integer) this.e.get(enumC1028f);
        return num != null && num.intValue() == 0;
    }

    public final void e(EnumC1028f enumC1028f, AbstractC1029g abstractC1029g) {
        ConcurrentHashMap concurrentHashMap = this.e;
        if (concurrentHashMap.containsKey(enumC1028f) && ((Integer) concurrentHashMap.get(enumC1028f)).intValue() == 0) {
            c(enumC1028f, abstractC1029g);
            return;
        }
        ConcurrentHashMap concurrentHashMap2 = this.c;
        if (!concurrentHashMap2.containsKey(enumC1028f)) {
            concurrentHashMap2.put(enumC1028f, new ArrayList());
        }
        ((List) concurrentHashMap2.get(enumC1028f)).add(abstractC1029g);
    }

    public final void f(EnumC1028f enumC1028f) {
        List list;
        ConcurrentHashMap concurrentHashMap = this.e;
        if (((Integer) concurrentHashMap.get(enumC1028f)).intValue() == 0) {
            return;
        }
        if (((Integer) concurrentHashMap.get(enumC1028f)).intValue() > 0) {
            concurrentHashMap.put(enumC1028f, Integer.valueOf(((Integer) concurrentHashMap.get(enumC1028f)).intValue() - 1));
        }
        Ri.a.d(enumC1028f.name() + numX49.tnTj78("bu6S"));
        ConcurrentHashMap concurrentHashMap2 = this.c;
        if (!concurrentHashMap2.containsKey(enumC1028f) || (list = (List) concurrentHashMap2.get(enumC1028f)) == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c(enumC1028f, (AbstractC1029g) it.next());
        }
    }

    public final void g() {
        i iVar = i.f9157d;
        Set set = this.f9149b;
        if (set.contains(iVar) || set.contains(i.c) || set.contains(i.f9159k)) {
            if (set.contains(i.f) || set.contains(i.e)) {
                EnumC1028f enumC1028f = EnumC1028f.f9151a;
                if (d(enumC1028f)) {
                    return;
                }
                EnumC1028f enumC1028f2 = EnumC1028f.f9152b;
                if (!d(enumC1028f2)) {
                    f(enumC1028f2);
                }
                f(enumC1028f);
            }
        }
    }
}
