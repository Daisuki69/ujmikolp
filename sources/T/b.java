package T;

import D.S;
import Kh.I;
import M8.M1;
import V.c;
import V.e;
import V.f;
import V.g;
import a.AbstractC0617a;
import android.graphics.Bitmap;
import cj.C1132s;
import cj.M;
import dOYHB6.tiZVw8.numX49;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import z2.d;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final I f = new I(15);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile b f5742g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f5743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V.d f5744b;
    public final c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V.a f5745d;
    public final Object e;

    public b(File file, File file2, File file3, S s9) {
        d dVar = new d(14);
        n0.c cVar = n0.a.f18539d;
        long j = 32768;
        V.b bVar = new V.b(new f(20480L, Runtime.getRuntime().maxMemory() / j, file), s9, 2);
        V.b bVar2 = new V.b(new f(5120L, Runtime.getRuntime().maxMemory() / j, file2), s9, 1);
        V.b bVar3 = new V.b(new f(15360L, Runtime.getRuntime().maxMemory() / j, file3), s9, 0);
        if (n0.a.e == null) {
            synchronized (cVar) {
                try {
                    if (n0.a.e == null) {
                        n0.a.e = new n0.a(bVar, bVar2, bVar3);
                    }
                    Unit unit = Unit.f18162a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        n0.a aVar = n0.a.e;
        j.d(aVar);
        V.d dVar2 = new V.d(aVar, s9);
        c cVar2 = new c(aVar, s9);
        V.a aVar2 = new V.a(aVar, s9);
        this.f5743a = dVar;
        this.f5744b = dVar2;
        this.c = cVar2;
        this.f5745d = aVar2;
        this.e = M.h(new Pair(Q.a.f5194a, C1132s.g(dVar2, aVar2, cVar2)), new Pair(Q.a.f5195b, C1132s.g(cVar2, aVar2, dVar2)), new Pair(Q.a.c, C1132s.g(aVar2, dVar2, cVar2)));
    }

    public final Bitmap a(String str) {
        return (Bitmap) b(new Pair(str, Q.a.f5194a), g.c);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final Object b(Pair pair, AbstractC0617a abstractC0617a) {
        Object objF;
        String str = (String) pair.f18160a;
        Q.a aVar = (Q.a) pair.f18161b;
        aVar.name();
        if (str == null) {
            aVar.name();
            return null;
        }
        List list = (List) this.e.get(aVar);
        if (list != null) {
            List list2 = list;
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    objF = null;
                    break;
                }
                objF = ((e) it.next()).f(str, abstractC0617a);
                if (objF != null) {
                    break;
                }
            }
            if (objF != null) {
                return objF;
            }
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                Object objA = ((e) it2.next()).a(str, abstractC0617a);
                if (objA != null) {
                    return objA;
                }
            }
        }
        return null;
    }

    public final Object c(Pair pair, e eVar, Function1 function1, Function1 function12) {
        E.e eVar2;
        Object obj = pair.f18160a;
        Object objInvoke = function1.invoke(obj);
        Object obj2 = pair.f18161b;
        if (objInvoke != null) {
            ((Q.a) obj2).name();
            return objInvoke;
        }
        this.f5743a.getClass();
        String str = (String) obj;
        E.a aVar = new E.a(str, false, null, null, 0L, 62);
        Q.a aVar2 = (Q.a) obj2;
        int iOrdinal = aVar2.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            eVar2 = E.e.f1212b;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            eVar2 = E.e.c;
        }
        c0.f fVarA = E.f.a(eVar2, aVar);
        if (a.f5741a[fVarA.f9192b.ordinal()] != 1) {
            aVar2.name();
            fVarA.f9192b.toString();
            return null;
        }
        Object objInvoke2 = function12.invoke(fVarA);
        j.d(objInvoke2);
        Pair pair2 = (Pair) objInvoke2;
        File fileD = eVar.d(str, (byte[]) pair2.f18161b);
        Object obj3 = pair2.f18160a;
        eVar.e(str, new Pair(obj3, fileD));
        aVar2.name();
        return obj3;
    }

    public final byte[] d(String url) {
        j.g(url, "url");
        return (byte[]) c(new Pair(url, Q.a.c), this.f5745d, new M1(1, this, b.class, numX49.tnTj78("bPFP"), numX49.tnTj78("bPFb"), 0, 16), new M1(1, this, b.class, numX49.tnTj78("bPF2"), numX49.tnTj78("bPFL"), 0, 17));
    }

    public final byte[] e(String url) {
        j.g(url, "url");
        return (byte[]) c(new Pair(url, Q.a.f5195b), this.c, new M1(1, this, b.class, numX49.tnTj78("bPFr"), numX49.tnTj78("bPFZ"), 0, 18), new M1(1, this, b.class, numX49.tnTj78("bPFk"), numX49.tnTj78("bPFB"), 0, 19));
    }

    public final Bitmap f(String url) {
        j.g(url, "url");
        return (Bitmap) c(new Pair(url, Q.a.f5194a), this.f5744b, new M1(1, this, b.class, numX49.tnTj78("bPFu"), numX49.tnTj78("bPFV"), 0, 20), new Rg.g(8));
    }
}
