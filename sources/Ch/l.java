package ch;

import D.CallableC0192z;
import D.S;
import Kh.C0301f;
import com.paymaya.domain.store.A0;
import com.paymaya.domain.store.C1258f0;
import com.paymaya.domain.store.L;
import com.paymaya.domain.store.M;
import com.paymaya.domain.store.T;
import dOYHB6.tiZVw8.numX49;
import e2.C1421c;
import fh.InterfaceC1486b;
import g4.C1499a;
import hh.InterfaceC1568a;
import hh.InterfaceC1569b;
import hh.InterfaceC1570c;
import hh.InterfaceC1571d;
import hh.InterfaceC1572e;
import hh.InterfaceC1573f;
import hh.InterfaceC1574g;
import hh.InterfaceC1575h;
import ih.EnumC1604b;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import jh.CallableC1682a;
import jh.EnumC1683b;
import kh.InterfaceC1774a;
import kh.InterfaceCallableC1777d;
import lh.C1833d;
import lh.C1837h;
import lh.C1840k;
import lh.FutureC1838i;
import n.CallableC1879f;
import n3.C1916a;
import o6.C1967a;
import oh.C1981c;
import oi.C1983a;
import p3.C2011b;
import pg.C2038a;
import ph.B0;
import ph.B2;
import ph.C1;
import ph.C2044A;
import ph.C2049a0;
import ph.C2054b1;
import ph.C2056c;
import ph.C2058c1;
import ph.C2063d2;
import ph.C2064e;
import ph.C2065e0;
import ph.C2066e1;
import ph.C2070f1;
import ph.C2075g2;
import ph.C2076h;
import ph.C2077h0;
import ph.C2081i0;
import ph.C2082i1;
import ph.C2089k0;
import ph.C2090k1;
import ph.C2092l;
import ph.C2094l1;
import ph.C2100n;
import ph.C2102n1;
import ph.C2106o1;
import ph.C2112q;
import ph.C2120s0;
import ph.C2121s1;
import ph.C2122s2;
import ph.C2123t;
import ph.C2129u1;
import ph.C2130u2;
import ph.C2138w2;
import ph.C2139x;
import ph.C2144y0;
import ph.C2145y1;
import ph.C2149z1;
import ph.C2150z2;
import ph.CallableC2062d1;
import ph.CallableC2074g1;
import ph.E0;
import ph.F1;
import ph.G;
import ph.G1;
import ph.H0;
import ph.H1;
import ph.H2;
import ph.I;
import ph.I1;
import ph.J0;
import ph.K;
import ph.L1;
import ph.N;
import ph.N0;
import ph.N1;
import ph.O0;
import ph.S0;
import ph.S2;
import ph.V;
import ph.V1;
import ph.W;
import ph.W0;
import ph.X;
import ph.X2;
import ph.Z;
import ph.Z1;
import ph.a3;
import ph.c3;
import ph.g3;
import ph.n3;
import vh.AbstractC2353d;
import vh.C2351b;
import vh.EnumC2350a;
import vh.EnumC2354e;
import wh.AbstractC2439a;
import xh.C2478b;
import xh.C2481e;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l implements p {
    public static <T> l amb(Iterable<? extends p> iterable) {
        jh.e.b(iterable, numX49.tnTj78("bt8j"));
        return new C2112q(0, null, iterable);
    }

    public static <T> l ambArray(p... pVarArr) {
        jh.e.b(pVarArr, numX49.tnTj78("bt8d"));
        int length = pVarArr.length;
        if (length == 0) {
            return empty();
        }
        if (length == 1) {
            return wrap(pVarArr[0]);
        }
        return new C2112q(0, pVarArr, null);
    }

    public static int bufferSize() {
        return AbstractC1107f.f9367a;
    }

    public static <T, R> l combineLatest(hh.n nVar, int i, p... pVarArr) {
        return combineLatest(pVarArr, nVar, i);
    }

    public static <T, R> l combineLatestDelayError(p[] pVarArr, hh.n nVar) {
        return combineLatestDelayError(pVarArr, nVar, bufferSize());
    }

    public static <T> l concat(Iterable<? extends p> iterable) {
        jh.e.b(iterable, numX49.tnTj78("bt8Po"));
        return fromIterable(iterable).concatMapDelayError(jh.e.f17815a, bufferSize(), false);
    }

    public static <T> l concatArray(p... pVarArr) {
        return pVarArr.length == 0 ? empty() : pVarArr.length == 1 ? wrap(pVarArr[0]) : new C2123t(fromArray(pVarArr), jh.e.f17815a, bufferSize(), 2);
    }

    public static <T> l concatArrayDelayError(p... pVarArr) {
        return pVarArr.length == 0 ? empty() : pVarArr.length == 1 ? wrap(pVarArr[0]) : concatDelayError(fromArray(pVarArr));
    }

    public static <T> l concatArrayEager(p... pVarArr) {
        return concatArrayEager(bufferSize(), bufferSize(), pVarArr);
    }

    public static <T> l concatArrayEagerDelayError(p... pVarArr) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), pVarArr);
    }

    public static <T> l concatDelayError(Iterable<? extends p> iterable) {
        jh.e.b(iterable, numX49.tnTj78("bt8Pc"));
        return concatDelayError(fromIterable(iterable));
    }

    public static <T> l concatEager(p pVar) {
        return concatEager(pVar, bufferSize(), bufferSize());
    }

    public static <T> l create(n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8Pm"));
        return new C2121s1(1);
    }

    public static <T> l defer(Callable<? extends p> callable) {
        jh.e.b(callable, numX49.tnTj78("bt8PD"));
        return new C2081i0(callable, 0);
    }

    public static <T> l empty() {
        return B0.f19125a;
    }

    public static <T> l error(Callable<? extends Throwable> callable) {
        jh.e.b(callable, numX49.tnTj78("bt8PM"));
        return new C2081i0(callable, 1);
    }

    public static <T> l fromArray(T... tArr) {
        jh.e.b(tArr, numX49.tnTj78("bt8PN"));
        return tArr.length == 0 ? empty() : tArr.length == 1 ? just(tArr[0]) : new C1499a(tArr, 2);
    }

    public static <T> l fromCallable(Callable<? extends T> callable) {
        jh.e.b(callable, numX49.tnTj78("bt8P6"));
        return new N0(callable);
    }

    public static <T> l fromFuture(Future<? extends T> future) {
        jh.e.b(future, numX49.tnTj78("bt8Pa"));
        return new O0(future, 0L, (TimeUnit) null);
    }

    public static <T> l fromIterable(Iterable<? extends T> iterable) {
        jh.e.b(iterable, numX49.tnTj78("bt8Pv"));
        return new C1499a(iterable, 3);
    }

    public static <T> l fromPublisher(nk.a aVar) {
        jh.e.b(aVar, numX49.tnTj78("bt8P7"));
        return new C1499a(aVar, 4);
    }

    public static <T> l generate(InterfaceC1573f interfaceC1573f) {
        jh.e.b(interfaceC1573f, numX49.tnTj78("bt8PA"));
        return generate(jh.e.h, new C1983a(interfaceC1573f, 2), jh.e.f17817d);
    }

    public static l interval(long j, long j6, TimeUnit timeUnit) {
        return interval(j, j6, timeUnit, Vh.f.f6126a);
    }

    public static l intervalRange(long j, long j6, long j7, long j9, TimeUnit timeUnit) {
        return intervalRange(j, j6, j7, j9, timeUnit, Vh.f.f6126a);
    }

    public static <T> l just(T t5) {
        jh.e.b(t5, numX49.tnTj78("bt8P5"));
        return new C2094l1(t5);
    }

    public static <T> l merge(Iterable<? extends p> iterable, int i, int i4) {
        return fromIterable(iterable).flatMap((hh.n) jh.e.f17815a, false, i, i4);
    }

    public static <T> l mergeArray(int i, int i4, p... pVarArr) {
        return fromArray(pVarArr).flatMap((hh.n) jh.e.f17815a, false, i, i4);
    }

    public static <T> l mergeArrayDelayError(int i, int i4, p... pVarArr) {
        return fromArray(pVarArr).flatMap((hh.n) jh.e.f17815a, true, i, i4);
    }

    public static <T> l mergeDelayError(Iterable<? extends p> iterable) {
        return fromIterable(iterable).flatMap((hh.n) jh.e.f17815a, true);
    }

    public static <T> l never() {
        return C2121s1.f19630b;
    }

    public static l range(int i, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(We.s.f(i4, numX49.tnTj78("bt82S")));
        }
        if (i4 == 0) {
            return empty();
        }
        if (i4 == 1) {
            return just(Integer.valueOf(i));
        }
        if (((long) i) + ((long) (i4 - 1)) <= 2147483647L) {
            return new F1(i, i4);
        }
        throw new IllegalArgumentException(numX49.tnTj78("bt82V"));
    }

    public static l rangeLong(long j, long j6) {
        if (j6 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.f(j6, numX49.tnTj78("bt82d")));
        }
        if (j6 == 0) {
            return empty();
        }
        if (j6 == 1) {
            return just(Long.valueOf(j));
        }
        long j7 = (j6 - 1) + j;
        if (j <= 0 || j7 >= 0) {
            return new G1(j, j6);
        }
        throw new IllegalArgumentException(numX49.tnTj78("bt82j"));
    }

    public static <T> w sequenceEqual(p pVar, p pVar2) {
        return sequenceEqual(pVar, pVar2, jh.e.j, bufferSize());
    }

    public static <T> l switchOnNext(p pVar, int i) {
        jh.e.b(pVar, numX49.tnTj78("bt82O"));
        jh.e.c(i, numX49.tnTj78("bt82Q"));
        return new C2129u1(pVar, (hh.n) jh.e.f17815a, i, false);
    }

    public static <T> l switchOnNextDelayError(p pVar) {
        return switchOnNextDelayError(pVar, bufferSize());
    }

    public static l timer(long j, TimeUnit timeUnit) {
        return timer(j, timeUnit, Vh.f.f6126a);
    }

    public static <T> l unsafeCreate(p pVar) {
        jh.e.b(pVar, numX49.tnTj78("bt82C"));
        if (pVar instanceof l) {
            throw new IllegalArgumentException(numX49.tnTj78("bt824"));
        }
        return new C1499a(pVar, 5);
    }

    public static <T, D> l using(Callable<? extends D> callable, hh.n nVar, InterfaceC1573f interfaceC1573f) {
        return using(callable, nVar, interfaceC1573f, true);
    }

    public static <T> l wrap(p pVar) {
        jh.e.b(pVar, numX49.tnTj78("bt82c"));
        return pVar instanceof l ? (l) pVar : new C1499a(pVar, 5);
    }

    public static <T, R> l zip(Iterable<? extends p> iterable, hh.n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8Lw"));
        jh.e.b(iterable, numX49.tnTj78("bt8Lc"));
        return new N(null, iterable, nVar, bufferSize(), false, 1);
    }

    public static <T, R> l zipArray(hh.n nVar, boolean z4, int i, p... pVarArr) {
        if (pVarArr.length == 0) {
            return empty();
        }
        jh.e.b(nVar, numX49.tnTj78("bt8Lm"));
        jh.e.c(i, numX49.tnTj78("bt8LD"));
        return new N(pVarArr, null, nVar, i, z4, 1);
    }

    public static <T, R> l zipIterable(Iterable<? extends p> iterable, hh.n nVar, boolean z4, int i) {
        jh.e.b(nVar, numX49.tnTj78("bt8Lh"));
        jh.e.b(iterable, numX49.tnTj78("bt8LM"));
        jh.e.c(i, numX49.tnTj78("bt8LN"));
        return new N(null, iterable, nVar, i, z4, 1);
    }

    public final w all(hh.o oVar) {
        jh.e.b(oVar, numX49.tnTj78("bt8L6"));
        return new C2100n(this, oVar, 0);
    }

    public final l ambWith(p pVar) {
        jh.e.b(pVar, numX49.tnTj78("bt8La"));
        return ambArray(this, pVar);
    }

    public final w any(hh.o oVar) {
        jh.e.b(oVar, numX49.tnTj78("bt8LX"));
        return new C2100n(this, oVar, 1);
    }

    public final <R> R as(m mVar) {
        jh.e.b(mVar, numX49.tnTj78("bt8LG"));
        return (R) new C0301f(this, 2);
    }

    public final C2054b1 b(InterfaceC1573f interfaceC1573f, InterfaceC1573f interfaceC1573f2, InterfaceC1568a interfaceC1568a, InterfaceC1568a interfaceC1568a2) {
        jh.e.b(interfaceC1573f, numX49.tnTj78("bt8L3"));
        jh.e.b(interfaceC1573f2, numX49.tnTj78("bt8Ly"));
        jh.e.b(interfaceC1568a, numX49.tnTj78("bt8Lv"));
        return new C2054b1(this, interfaceC1573f, interfaceC1573f2, interfaceC1568a, interfaceC1568a2, 2);
    }

    public final Object blockingFirst() {
        C1833d c1833d = new C1833d(1, 0);
        subscribe(c1833d);
        Object objA = c1833d.a();
        if (objA != null) {
            return objA;
        }
        throw new NoSuchElementException();
    }

    public final void blockingForEach(InterfaceC1573f interfaceC1573f) {
        Iterator<Object> it = blockingIterable().iterator();
        while (it.hasNext()) {
            try {
                interfaceC1573f.accept(it.next());
            } catch (Throwable th2) {
                of.p.F(th2);
                ((InterfaceC1486b) it).dispose();
                throw AbstractC2353d.d(th2);
            }
        }
    }

    public final Iterable<Object> blockingIterable() {
        return blockingIterable(bufferSize());
    }

    public final Object blockingLast() {
        C1833d c1833d = new C1833d(1, 1);
        subscribe(c1833d);
        Object objA = c1833d.a();
        if (objA != null) {
            return objA;
        }
        throw new NoSuchElementException();
    }

    public final Iterable<Object> blockingLatest() {
        return new C2064e(this, 0);
    }

    public final Iterable<Object> blockingMostRecent(Object obj) {
        return new C2076h(this, obj);
    }

    public final Iterable<Object> blockingNext() {
        return new C2064e(this, 1);
    }

    public final Object blockingSingle() {
        AbstractC1109h abstractC1109hSingleElement = singleElement();
        abstractC1109hSingleElement.getClass();
        Gh.c cVar = new Gh.c(1, 1);
        abstractC1109hSingleElement.b(cVar);
        Object objB = cVar.b();
        if (objB != null) {
            return objB;
        }
        throw new NoSuchElementException();
    }

    public final void blockingSubscribe() {
        C2351b c2351b = new C2351b(1);
        z2.d dVar = jh.e.f17817d;
        C1840k c1840k = new C1840k(dVar, c2351b, c2351b, dVar);
        subscribe(c1840k);
        if (c2351b.getCount() != 0) {
            try {
                c2351b.await();
            } catch (InterruptedException e) {
                EnumC1604b.a(c1840k);
                Thread.currentThread().interrupt();
                throw new IllegalStateException(numX49.tnTj78("bt8LA"), e);
            }
        }
        Throwable th2 = c2351b.f20498a;
        if (th2 != null) {
            throw AbstractC2353d.d(th2);
        }
    }

    public final l buffer(long j, long j6, TimeUnit timeUnit) {
        return buffer(j, j6, timeUnit, Vh.f.f6126a, EnumC2350a.f20496a);
    }

    public final S2 c(long j, TimeUnit timeUnit, v vVar, p pVar) {
        jh.e.b(timeUnit, numX49.tnTj78("bt8r9"));
        jh.e.b(vVar, numX49.tnTj78("bt8rP"));
        return new S2(this, j, timeUnit, vVar, pVar);
    }

    public final l cache() {
        return cacheWithInitialCapacity(16);
    }

    public final l cacheWithInitialCapacity(int i) {
        jh.e.c(i, numX49.tnTj78("bt8rb"));
        return new I(this, i);
    }

    public final <U> l cast(Class<U> cls) {
        jh.e.b(cls, numX49.tnTj78("bt8r2"));
        return map(new A0(cls, 15));
    }

    public final <U> w collect(Callable<? extends U> callable, InterfaceC1569b interfaceC1569b) {
        jh.e.b(callable, numX49.tnTj78("bt8rL"));
        jh.e.b(interfaceC1569b, numX49.tnTj78("bt8rr"));
        return new K(this, callable, interfaceC1569b);
    }

    public final <U> w collectInto(U u3, InterfaceC1569b interfaceC1569b) {
        jh.e.b(u3, numX49.tnTj78("bt8rZ"));
        return collect(new CallableC0192z(u3, 4), interfaceC1569b);
    }

    public final <R> l compose(q qVar) {
        jh.e.b(qVar, numX49.tnTj78("bt8rk"));
        return wrap(qVar.O(this));
    }

    public final <R> l concatMap(hh.n nVar) {
        return concatMap(nVar, 2);
    }

    public final AbstractC1103b concatMapCompletable(hh.n nVar) {
        return concatMapCompletable(nVar, 2);
    }

    public final AbstractC1103b concatMapCompletableDelayError(hh.n nVar) {
        return concatMapCompletableDelayError(nVar, true, 2);
    }

    public final <R> l concatMapDelayError(hh.n nVar) {
        return concatMapDelayError(nVar, bufferSize(), true);
    }

    public final <R> l concatMapEager(hh.n nVar) {
        return concatMapEager(nVar, Integer.MAX_VALUE, bufferSize());
    }

    public final <R> l concatMapEagerDelayError(hh.n nVar, boolean z4) {
        return concatMapEagerDelayError(nVar, Integer.MAX_VALUE, bufferSize(), z4);
    }

    public final <U> l concatMapIterable(hh.n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8re"));
        return new C2065e0(this, nVar, 2);
    }

    public final <R> l concatMapMaybe(hh.n nVar) {
        return concatMapMaybe(nVar, 2);
    }

    public final <R> l concatMapMaybeDelayError(hh.n nVar) {
        return concatMapMaybeDelayError(nVar, true, 2);
    }

    public final <R> l concatMapSingle(hh.n nVar) {
        return concatMapSingle(nVar, 2);
    }

    public final <R> l concatMapSingleDelayError(hh.n nVar) {
        return concatMapSingleDelayError(nVar, true, 2);
    }

    public final l concatWith(p pVar) {
        jh.e.b(pVar, numX49.tnTj78("bt8r6"));
        return concat(this, pVar);
    }

    public final w contains(Object obj) {
        jh.e.b(obj, numX49.tnTj78("bt8rX"));
        return any(new T(obj, 17));
    }

    public final w count() {
        return new C2049a0(this);
    }

    public final l debounce(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit, Vh.f.f6126a);
    }

    public final l defaultIfEmpty(Object obj) {
        jh.e.b(obj, numX49.tnTj78("bt8rv"));
        return switchIfEmpty(just(obj));
    }

    public final l delay(long j, TimeUnit timeUnit) {
        return delay(j, timeUnit, Vh.f.f6126a, false);
    }

    public final l delaySubscription(long j, TimeUnit timeUnit) {
        return delaySubscription(j, timeUnit, Vh.f.f6126a);
    }

    @Deprecated
    public final <T2> l dematerialize() {
        return new C2065e0(this, jh.e.f17815a, 1);
    }

    public final l distinct() {
        return distinct(jh.e.f17815a, EnumC1683b.f17810a);
    }

    public final l distinctUntilChanged() {
        return distinctUntilChanged(jh.e.f17815a);
    }

    public final l doAfterNext(InterfaceC1573f interfaceC1573f) {
        jh.e.b(interfaceC1573f, numX49.tnTj78("bt8r1"));
        return new C2120s0(this, interfaceC1573f, 0);
    }

    public final l doAfterTerminate(InterfaceC1568a interfaceC1568a) {
        jh.e.b(interfaceC1568a, numX49.tnTj78("bt8rn"));
        z2.d dVar = jh.e.f17817d;
        return b(dVar, dVar, jh.e.c, interfaceC1568a);
    }

    public final l doFinally(InterfaceC1568a interfaceC1568a) {
        jh.e.b(interfaceC1568a, numX49.tnTj78("bt8rx"));
        return new C2120s0(this, interfaceC1568a, 1);
    }

    public final l doOnComplete(InterfaceC1568a interfaceC1568a) {
        z2.d dVar = jh.e.f17817d;
        return b(dVar, dVar, interfaceC1568a, jh.e.c);
    }

    public final l doOnDispose(InterfaceC1568a interfaceC1568a) {
        return doOnLifecycle(jh.e.f17817d, interfaceC1568a);
    }

    public final l doOnEach(InterfaceC1573f interfaceC1573f) {
        jh.e.b(interfaceC1573f, numX49.tnTj78("bt8r5"));
        return b(new A0(interfaceC1573f, 16), new com.google.firebase.messaging.p(interfaceC1573f, 18), new M(interfaceC1573f, 15), jh.e.c);
    }

    public final l doOnError(InterfaceC1573f interfaceC1573f) {
        z2.d dVar = jh.e.f17817d;
        C2011b c2011b = jh.e.c;
        return b(dVar, interfaceC1573f, c2011b, c2011b);
    }

    public final l doOnLifecycle(InterfaceC1573f interfaceC1573f, InterfaceC1568a interfaceC1568a) {
        jh.e.b(interfaceC1573f, numX49.tnTj78("bt8rJ"));
        jh.e.b(interfaceC1568a, numX49.tnTj78("bt8rI"));
        return new C2044A(this, interfaceC1573f, interfaceC1568a, 5);
    }

    public final l doOnNext(InterfaceC1573f interfaceC1573f) {
        z2.d dVar = jh.e.f17817d;
        C2011b c2011b = jh.e.c;
        return b(interfaceC1573f, dVar, c2011b, c2011b);
    }

    public final l doOnSubscribe(InterfaceC1573f interfaceC1573f) {
        return doOnLifecycle(interfaceC1573f, jh.e.c);
    }

    public final l doOnTerminate(InterfaceC1568a interfaceC1568a) {
        jh.e.b(interfaceC1568a, numX49.tnTj78("bt8rq"));
        return b(jh.e.f17817d, new M(interfaceC1568a, 14), interfaceC1568a, jh.e.c);
    }

    public final AbstractC1109h elementAt(long j) {
        if (j >= 0) {
            return new C2144y0(this, j);
        }
        throw new IndexOutOfBoundsException(androidx.camera.core.impl.a.f(j, numX49.tnTj78("bt8rz")));
    }

    public final w elementAtOrError(long j) {
        if (j >= 0) {
            return new ph.A0(this, j, null);
        }
        throw new IndexOutOfBoundsException(androidx.camera.core.impl.a.f(j, numX49.tnTj78("bt8Z9")));
    }

    public final l filter(hh.o oVar) {
        jh.e.b(oVar, numX49.tnTj78("bt8ZP"));
        return new C2092l(this, oVar, 2);
    }

    public final w first(Object obj) {
        return elementAt(0L, obj);
    }

    public final AbstractC1109h firstElement() {
        return elementAt(0L);
    }

    public final w firstOrError() {
        return elementAtOrError(0L);
    }

    public final <R> l flatMap(hh.n nVar) {
        return flatMap(nVar, false);
    }

    public final AbstractC1103b flatMapCompletable(hh.n nVar) {
        return flatMapCompletable(nVar, false);
    }

    public final <U> l flatMapIterable(hh.n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8Zi"));
        return new C2065e0(this, nVar, 2);
    }

    public final <R> l flatMapMaybe(hh.n nVar) {
        return flatMapMaybe(nVar, false);
    }

    public final <R> l flatMapSingle(hh.n nVar) {
        return flatMapSingle(nVar, false);
    }

    public final InterfaceC1486b forEach(InterfaceC1573f interfaceC1573f) {
        return subscribe(interfaceC1573f);
    }

    public final InterfaceC1486b forEachWhile(hh.o oVar) {
        return forEachWhile(oVar, jh.e.e, jh.e.c);
    }

    public final <K> l groupBy(hh.n nVar) {
        return groupBy(nVar, jh.e.f17815a, false, bufferSize());
    }

    public final <TRight, TLeftEnd, TRightEnd, R> l groupJoin(p pVar, hh.n nVar, hh.n nVar2, InterfaceC1570c interfaceC1570c) {
        jh.e.b(pVar, numX49.tnTj78("bt8Z4"));
        jh.e.b(nVar, numX49.tnTj78("bt8Zo"));
        jh.e.b(nVar2, numX49.tnTj78("bt8ZK"));
        jh.e.b(interfaceC1570c, numX49.tnTj78("bt8Zw"));
        return new C2054b1(this, pVar, nVar, nVar2, interfaceC1570c, 0);
    }

    public final l hide() {
        return new Z(this, 2);
    }

    public final AbstractC1103b ignoreElements() {
        return new C2058c1(this);
    }

    public final w isEmpty() {
        return all(jh.e.f17818g);
    }

    public final <TRight, TLeftEnd, TRightEnd, R> l join(p pVar, hh.n nVar, hh.n nVar2, InterfaceC1570c interfaceC1570c) {
        jh.e.b(pVar, numX49.tnTj78("bt8Zc"));
        jh.e.b(nVar, numX49.tnTj78("bt8Zm"));
        jh.e.b(nVar2, numX49.tnTj78("bt8ZD"));
        jh.e.b(interfaceC1570c, numX49.tnTj78("bt8Zh"));
        return new C2054b1(this, pVar, nVar, nVar2, interfaceC1570c, 1);
    }

    public final w last(Object obj) {
        jh.e.b(obj, numX49.tnTj78("bt8ZM"));
        return new C2106o1(0, this, obj);
    }

    public final AbstractC1109h lastElement() {
        return new C2102n1(this, 0);
    }

    public final w lastOrError() {
        return new C2106o1(0, this, null);
    }

    public final <R> l lift(o oVar) {
        jh.e.b(oVar, numX49.tnTj78("bt8ZN"));
        return new Z(this, 4);
    }

    public final <R> l map(hh.n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8Z6"));
        return new C2065e0(this, nVar, 3);
    }

    public final l materialize() {
        return new Z(this, 5);
    }

    public final l mergeWith(p pVar) {
        jh.e.b(pVar, numX49.tnTj78("bt8ZG"));
        return merge(this, pVar);
    }

    public final l observeOn(v vVar) {
        return observeOn(vVar, false, bufferSize());
    }

    public final <U> l ofType(Class<U> cls) {
        jh.e.b(cls, numX49.tnTj78("bt8Z7"));
        return filter(new C1258f0(cls, 16)).cast(cls);
    }

    public final l onErrorResumeNext(hh.n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8ZY"));
        return new H0(this, nVar, false, 3);
    }

    public final l onErrorReturn(hh.n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8ZT"));
        return new C2065e0(this, nVar, 4);
    }

    public final l onErrorReturnItem(Object obj) {
        jh.e.b(obj, numX49.tnTj78("bt8ZR"));
        return onErrorReturn(new CallableC0192z(obj, 4));
    }

    public final l onExceptionResumeNext(p pVar) {
        jh.e.b(pVar, numX49.tnTj78("bt8Zp"));
        return new H0(this, new CallableC0192z(pVar, 4), true, 3);
    }

    public final l onTerminateDetach() {
        return new Z(this, 1);
    }

    public final AbstractC2439a publish() {
        AtomicReference atomicReference = new AtomicReference();
        return new C2149z1(new C2145y1(atomicReference), this, atomicReference);
    }

    public final AbstractC1109h reduce(InterfaceC1570c interfaceC1570c) {
        jh.e.b(interfaceC1570c, numX49.tnTj78("bt8Zg"));
        return new H1(this, interfaceC1570c);
    }

    public final <R> w reduceWith(Callable<R> callable, InterfaceC1570c interfaceC1570c) {
        jh.e.b(callable, numX49.tnTj78("bt8Zn"));
        jh.e.b(interfaceC1570c, numX49.tnTj78("bt8Zx"));
        return new I1(this, callable, interfaceC1570c, 1);
    }

    public final l repeat() {
        return repeat(Long.MAX_VALUE);
    }

    public final l repeatUntil(InterfaceC1572e interfaceC1572e) {
        jh.e.b(interfaceC1572e, numX49.tnTj78("bt8Z5"));
        return new Z(this, 6);
    }

    public final l repeatWhen(hh.n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8ZJ"));
        return new C2065e0(this, nVar, 6);
    }

    public final AbstractC2439a replay() {
        return C2063d2.e(this, C2063d2.e);
    }

    public final l retry() {
        return retry(Long.MAX_VALUE, jh.e.f);
    }

    public final l retryUntil(InterfaceC1572e interfaceC1572e) {
        jh.e.b(interfaceC1572e, numX49.tnTj78("bt8kU"));
        return retry(Long.MAX_VALUE, new C1916a(25));
    }

    public final l retryWhen(hh.n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8ke"));
        return new C2065e0(this, nVar, 7);
    }

    public final void safeSubscribe(r rVar) {
        jh.e.b(rVar, numX49.tnTj78("bt8k8"));
        if (rVar instanceof C2478b) {
            subscribe(rVar);
        } else {
            subscribe(new C2478b(rVar));
        }
    }

    public final l sample(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit, Vh.f.f6126a);
    }

    public final l scan(InterfaceC1570c interfaceC1570c) {
        jh.e.b(interfaceC1570c, numX49.tnTj78("bt8km"));
        return new C2120s0(this, interfaceC1570c, 3);
    }

    public final <R> l scanWith(Callable<R> callable, InterfaceC1570c interfaceC1570c) {
        jh.e.b(callable, numX49.tnTj78("bt8kh"));
        jh.e.b(interfaceC1570c, numX49.tnTj78("bt8kM"));
        return new C2044A(this, callable, interfaceC1570c, 6);
    }

    public final l serialize() {
        return new Z(this, 7);
    }

    public final l share() {
        AbstractC2439a abstractC2439aPublish = publish();
        abstractC2439aPublish.getClass();
        if (abstractC2439aPublish instanceof C2149z1) {
            abstractC2439aPublish = new C1(((C2149z1) abstractC2439aPublish).f19704a);
        }
        return new L1(abstractC2439aPublish);
    }

    public final w single(Object obj) {
        jh.e.b(obj, numX49.tnTj78("bt8kN"));
        return new C2106o1(1, this, obj);
    }

    public final AbstractC1109h singleElement() {
        return new C2102n1(this, 1);
    }

    public final w singleOrError() {
        return new C2106o1(1, this, null);
    }

    public final l skip(long j) {
        return j <= 0 ? this : new N1(this, j, 1);
    }

    public final l skipLast(long j, TimeUnit timeUnit) {
        return skipLast(j, timeUnit, Vh.f.f6127b, false, bufferSize());
    }

    public final <U> l skipUntil(p pVar) {
        jh.e.b(pVar, numX49.tnTj78("bt8k3"));
        return new C2150z2(this, pVar, 0);
    }

    public final l skipWhile(hh.o oVar) {
        jh.e.b(oVar, numX49.tnTj78("bt8ky"));
        return new C2092l(this, oVar, 3);
    }

    public final l sorted() {
        Object list = toList();
        list.getClass();
        return (list instanceof InterfaceC1774a ? ((InterfaceC1774a) list).a() : new C1499a(list, 6)).map(new L(jh.c.f17812a, 18)).flatMapIterable(jh.e.f17815a);
    }

    public final l startWith(Iterable<Object> iterable) {
        return concatArray(fromIterable(iterable), this);
    }

    public final l startWithArray(Object... objArr) {
        l lVarFromArray = fromArray(objArr);
        return lVarFromArray == empty() ? this : concatArray(lVarFromArray, this);
    }

    public final InterfaceC1486b subscribe() {
        z2.d dVar = jh.e.f17817d;
        return subscribe(dVar, jh.e.e, jh.e.c, dVar);
    }

    public abstract void subscribeActual(r rVar);

    public final l subscribeOn(v vVar) {
        jh.e.b(vVar, numX49.tnTj78("bt8kf"));
        return new B2(this, vVar, 0);
    }

    public final <E extends r> E subscribeWith(E e) {
        subscribe(e);
        return e;
    }

    public final l switchIfEmpty(p pVar) {
        jh.e.b(pVar, numX49.tnTj78("bt8k1"));
        return new C2150z2(this, pVar, 1);
    }

    public final <R> l switchMap(hh.n nVar) {
        return switchMap(nVar, bufferSize());
    }

    public final AbstractC1103b switchMapCompletable(hh.n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8ks"));
        return new oh.h(this, nVar, false);
    }

    public final AbstractC1103b switchMapCompletableDelayError(hh.n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8k5"));
        return new oh.h(this, nVar, true);
    }

    public final <R> l switchMapDelayError(hh.n nVar) {
        return switchMapDelayError(nVar, bufferSize());
    }

    public final <R> l switchMapMaybe(hh.n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8kq"));
        return new oh.k(this, nVar, false, 0);
    }

    public final <R> l switchMapMaybeDelayError(hh.n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8kz"));
        return new oh.k(this, nVar, true, 0);
    }

    public final <R> l switchMapSingle(hh.n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8kl"));
        return new oh.k(this, nVar, false, 1);
    }

    public final <R> l switchMapSingleDelayError(hh.n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8kW"));
        return new oh.k(this, nVar, true, 1);
    }

    public final l take(long j) {
        if (j >= 0) {
            return new N1(this, j, 2);
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.a.f(j, numX49.tnTj78("bt8B9")));
    }

    public final l takeLast(long j, long j6, TimeUnit timeUnit) {
        return takeLast(j, j6, timeUnit, Vh.f.f6127b, false, bufferSize());
    }

    public final <U> l takeUntil(p pVar) {
        jh.e.b(pVar, numX49.tnTj78("bt8BZ"));
        return new C2150z2(this, pVar, 2);
    }

    public final l takeWhile(hh.o oVar) {
        jh.e.b(oVar, numX49.tnTj78("bt8BB"));
        return new C2092l(this, oVar, 5);
    }

    public final C2481e test() {
        C2481e c2481e = new C2481e();
        subscribe(c2481e);
        return c2481e;
    }

    public final l throttleFirst(long j, TimeUnit timeUnit) {
        return throttleFirst(j, timeUnit, Vh.f.f6126a);
    }

    public final l throttleLast(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit);
    }

    public final l throttleLatest(long j, TimeUnit timeUnit) {
        return throttleLatest(j, timeUnit, Vh.f.f6126a, false);
    }

    public final l throttleWithTimeout(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit);
    }

    public final l timeInterval(TimeUnit timeUnit) {
        return timeInterval(timeUnit, Vh.f.f6126a);
    }

    public final l timeout(long j, TimeUnit timeUnit) {
        return c(j, timeUnit, Vh.f.f6126a, null);
    }

    public final l timestamp(TimeUnit timeUnit) {
        return timestamp(timeUnit, Vh.f.f6126a);
    }

    public final <R> R to(hh.n nVar) {
        try {
            jh.e.b(nVar, "converter is null");
            return (R) nVar.apply(this);
        } catch (Throwable th2) {
            of.p.F(th2);
            throw AbstractC2353d.d(th2);
        }
    }

    public final AbstractC1107f toFlowable(EnumC1102a enumC1102a) {
        mh.c cVar = new mh.c(this);
        int iOrdinal = enumC1102a.ordinal();
        if (iOrdinal == 0) {
            return cVar;
        }
        if (iOrdinal == 1) {
            return new mh.i(cVar, 0);
        }
        if (iOrdinal == 3) {
            return new mh.g(cVar);
        }
        if (iOrdinal == 4) {
            return new mh.i(cVar, 1);
        }
        int i = AbstractC1107f.f9367a;
        jh.e.c(i, numX49.tnTj78("bt8BK"));
        return new mh.e(cVar, i);
    }

    public final Future<Object> toFuture() {
        return (Future) subscribeWith(new FutureC1838i());
    }

    public final w toList() {
        return toList(16);
    }

    public final <K> w toMap(hh.n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8Bm"));
        return collect(EnumC2354e.f20502a, new jh.d(nVar));
    }

    public final <K> w toMultimap(hh.n nVar) {
        return toMultimap(nVar, jh.e.f17815a, EnumC2354e.f20502a, EnumC2350a.f20496a);
    }

    public final w toSortedList() {
        return toSortedList(jh.e.i);
    }

    public final l unsubscribeOn(v vVar) {
        jh.e.b(vVar, numX49.tnTj78("bt8B7"));
        return new B2(this, vVar, 1);
    }

    public final l window(long j, long j6, TimeUnit timeUnit) {
        return window(j, j6, timeUnit, Vh.f.f6126a, bufferSize());
    }

    public final <U, R> l withLatestFrom(p pVar, InterfaceC1570c interfaceC1570c) {
        jh.e.b(pVar, numX49.tnTj78("bt8uE"));
        jh.e.b(interfaceC1570c, numX49.tnTj78("bt8uF"));
        return new C2044A(this, interfaceC1570c, pVar, 8);
    }

    public final <U, R> l zipWith(Iterable<U> iterable, InterfaceC1570c interfaceC1570c) {
        jh.e.b(iterable, numX49.tnTj78("bt8ue"));
        jh.e.b(interfaceC1570c, numX49.tnTj78("bt8u8"));
        return new S0(this, iterable, interfaceC1570c);
    }

    public static <T, R> l combineLatest(Iterable<? extends p> iterable, hh.n nVar) {
        return combineLatest(iterable, nVar, bufferSize());
    }

    public static <T, R> l combineLatestDelayError(hh.n nVar, int i, p... pVarArr) {
        return combineLatestDelayError(pVarArr, nVar, i);
    }

    public static <T> l concatArrayEager(int i, int i4, p... pVarArr) {
        return fromArray(pVarArr).concatMapEagerDelayError(jh.e.f17815a, i, i4, false);
    }

    public static <T> l concatArrayEagerDelayError(int i, int i4, p... pVarArr) {
        return fromArray(pVarArr).concatMapEagerDelayError(jh.e.f17815a, i, i4, true);
    }

    public static <T> l concatEager(p pVar, int i, int i4) {
        return wrap(pVar).concatMapEager(jh.e.f17815a, i, i4);
    }

    public static <T> l merge(Iterable<? extends p> iterable) {
        return fromIterable(iterable).flatMap(jh.e.f17815a);
    }

    public static <T> l mergeArray(p... pVarArr) {
        return fromArray(pVarArr).flatMap(jh.e.f17815a, pVarArr.length);
    }

    public static <T> l mergeArrayDelayError(p... pVarArr) {
        return fromArray(pVarArr).flatMap((hh.n) jh.e.f17815a, true, pVarArr.length);
    }

    public static <T> l mergeDelayError(Iterable<? extends p> iterable, int i, int i4) {
        return fromIterable(iterable).flatMap((hh.n) jh.e.f17815a, true, i, i4);
    }

    public static <T> w sequenceEqual(p pVar, p pVar2, InterfaceC1571d interfaceC1571d) {
        return sequenceEqual(pVar, pVar2, interfaceC1571d, bufferSize());
    }

    public static <T> l switchOnNextDelayError(p pVar, int i) {
        jh.e.b(pVar, numX49.tnTj78("bt82t"));
        jh.e.c(i, numX49.tnTj78("bt82U"));
        return new C2129u1(pVar, (hh.n) jh.e.f17815a, i, true);
    }

    public static <T, D> l using(Callable<? extends D> callable, hh.n nVar, InterfaceC1573f interfaceC1573f, boolean z4) {
        jh.e.b(callable, numX49.tnTj78("bt82o"));
        jh.e.b(nVar, numX49.tnTj78("bt82K"));
        jh.e.b(interfaceC1573f, numX49.tnTj78("bt82w"));
        return new X2(callable, nVar, interfaceC1573f, z4);
    }

    public final Iterable<Object> blockingIterable(int i) {
        jh.e.c(i, numX49.tnTj78("bt8L7"));
        return new C2056c(this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> l concatMap(hh.n nVar, int i) throws Exception {
        jh.e.b(nVar, numX49.tnTj78("bt8rB"));
        jh.e.c(i, numX49.tnTj78("bt8ru"));
        if (!(this instanceof InterfaceCallableC1777d)) {
            return new C2123t(this, nVar, i, 1);
        }
        Object objCall = ((InterfaceCallableC1777d) this).call();
        return objCall == null ? empty() : new C2112q(3, objCall, nVar);
    }

    public final AbstractC1103b concatMapCompletable(hh.n nVar, int i) {
        jh.e.b(nVar, numX49.tnTj78("bt8rV"));
        jh.e.c(i, numX49.tnTj78("bt8rS"));
        return new C1981c(this, nVar, 1, i);
    }

    public final AbstractC1103b concatMapCompletableDelayError(hh.n nVar, boolean z4) {
        return concatMapCompletableDelayError(nVar, z4, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> l concatMapDelayError(hh.n nVar, int i, boolean z4) throws Exception {
        jh.e.b(nVar, numX49.tnTj78("bt8ri"));
        jh.e.c(i, numX49.tnTj78("bt8rE"));
        if (!(this instanceof InterfaceCallableC1777d)) {
            return new C2123t(this, nVar, i, z4 ? 3 : 2);
        }
        Object objCall = ((InterfaceCallableC1777d) this).call();
        return objCall == null ? empty() : new C2112q(3, objCall, nVar);
    }

    public final <R> l concatMapEager(hh.n nVar, int i, int i4) {
        jh.e.b(nVar, numX49.tnTj78("bt8rF"));
        jh.e.c(i, numX49.tnTj78("bt8rH"));
        jh.e.c(i4, numX49.tnTj78("bt8rO"));
        return new ph.T(this, nVar, 1, i, i4);
    }

    public final <R> l concatMapEagerDelayError(hh.n nVar, int i, int i4, boolean z4) {
        jh.e.b(nVar, numX49.tnTj78("bt8rQ"));
        jh.e.c(i, numX49.tnTj78("bt8rt"));
        jh.e.c(i4, numX49.tnTj78("bt8rU"));
        return new ph.T(this, nVar, z4 ? 3 : 2, i, i4);
    }

    public final <R> l concatMapMaybe(hh.n nVar, int i) {
        jh.e.b(nVar, numX49.tnTj78("bt8r4"));
        jh.e.c(i, numX49.tnTj78("bt8ro"));
        return new oh.e(this, nVar, 1, i, 0);
    }

    public final <R> l concatMapMaybeDelayError(hh.n nVar, boolean z4) {
        return concatMapMaybeDelayError(nVar, z4, 2);
    }

    public final <R> l concatMapSingle(hh.n nVar, int i) {
        jh.e.b(nVar, numX49.tnTj78("bt8rc"));
        jh.e.c(i, numX49.tnTj78("bt8rm"));
        return new oh.e(this, nVar, 1, i, 1);
    }

    public final <R> l concatMapSingleDelayError(hh.n nVar, boolean z4) {
        return concatMapSingleDelayError(nVar, z4, 2);
    }

    public final <R> l dematerialize(hh.n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8rR"));
        return new C2065e0(this, nVar, 1);
    }

    public final <K> l distinct(hh.n nVar) {
        return distinct(nVar, EnumC1683b.f17810a);
    }

    public final <K> l distinctUntilChanged(hh.n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8rf"));
        return new C2044A(this, nVar, jh.e.j, 4);
    }

    public final <R> l flatMap(hh.n nVar, boolean z4) {
        return flatMap(nVar, z4, Integer.MAX_VALUE);
    }

    public final AbstractC1103b flatMapCompletable(hh.n nVar, boolean z4) {
        jh.e.b(nVar, numX49.tnTj78("bt8Zd"));
        return new J0(this, nVar, z4);
    }

    public final <R> l flatMapMaybe(hh.n nVar, boolean z4) {
        jh.e.b(nVar, numX49.tnTj78("bt8ZH"));
        return new H0(this, nVar, z4, 1);
    }

    public final <R> l flatMapSingle(hh.n nVar, boolean z4) {
        jh.e.b(nVar, numX49.tnTj78("bt8ZO"));
        return new H0(this, nVar, z4, 2);
    }

    public final InterfaceC1486b forEachWhile(hh.o oVar, InterfaceC1573f interfaceC1573f) {
        return forEachWhile(oVar, interfaceC1573f, jh.e.c);
    }

    public final <K> l groupBy(hh.n nVar, boolean z4) {
        return groupBy(nVar, jh.e.f17815a, z4, bufferSize());
    }

    public final l observeOn(v vVar, boolean z4) {
        return observeOn(vVar, z4, bufferSize());
    }

    public final l repeat(long j) {
        if (j >= 0) {
            return j == 0 ? empty() : new N1(this, j, 0);
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.a.f(j, numX49.tnTj78("bt8Zs")));
    }

    public final <R> l replay(hh.n nVar, int i, long j, TimeUnit timeUnit) {
        return replay(nVar, i, j, timeUnit, Vh.f.f6126a);
    }

    public final l retry(InterfaceC1571d interfaceC1571d) {
        jh.e.b(interfaceC1571d, numX49.tnTj78("bt8kt"));
        return new C2120s0(this, interfaceC1571d, 2);
    }

    public final l skip(long j, TimeUnit timeUnit) {
        return skipUntil(timer(j, timeUnit));
    }

    public final l startWith(p pVar) {
        jh.e.b(pVar, numX49.tnTj78("bt8k7"));
        return concatArray(pVar, this);
    }

    public final InterfaceC1486b subscribe(InterfaceC1573f interfaceC1573f) {
        return subscribe(interfaceC1573f, jh.e.e, jh.e.c, jh.e.f17817d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> l switchMap(hh.n nVar, int i) throws Exception {
        jh.e.b(nVar, numX49.tnTj78("bt8kn"));
        jh.e.c(i, numX49.tnTj78("bt8kx"));
        if (!(this instanceof InterfaceCallableC1777d)) {
            return new C2129u1((p) this, nVar, i, false);
        }
        Object objCall = ((InterfaceCallableC1777d) this).call();
        return objCall == null ? empty() : new C2112q(3, objCall, nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> l switchMapDelayError(hh.n nVar, int i) throws Exception {
        jh.e.b(nVar, numX49.tnTj78("bt8kJ"));
        jh.e.c(i, numX49.tnTj78("bt8kI"));
        if (!(this instanceof InterfaceCallableC1777d)) {
            return new C2129u1((p) this, nVar, i, true);
        }
        Object objCall = ((InterfaceCallableC1777d) this).call();
        return objCall == null ? empty() : new C2112q(3, objCall, nVar);
    }

    public final l throttleLast(long j, TimeUnit timeUnit, v vVar) {
        return sample(j, timeUnit, vVar);
    }

    public final l throttleWithTimeout(long j, TimeUnit timeUnit, v vVar) {
        return debounce(j, timeUnit, vVar);
    }

    public final w toList(int i) {
        jh.e.c(i, numX49.tnTj78("bt8Bw"));
        return new C2100n(this, i);
    }

    public final w toSortedList(Comparator<Object> comparator) {
        jh.e.b(comparator, numX49.tnTj78("bt8By"));
        w list = toList();
        L l6 = new L(comparator, 18);
        list.getClass();
        return new C2106o1(2, list, l6);
    }

    public static <T, R> l combineLatest(Iterable<? extends p> iterable, hh.n nVar, int i) {
        jh.e.b(iterable, numX49.tnTj78("bt8PL"));
        jh.e.b(nVar, numX49.tnTj78("bt8Pr"));
        jh.e.c(i, numX49.tnTj78("bt8PZ"));
        return new N(null, iterable, nVar, i << 1, false, 0);
    }

    public static <T, R> l combineLatestDelayError(p[] pVarArr, hh.n nVar, int i) {
        jh.e.c(i, numX49.tnTj78("bt8Pd"));
        jh.e.b(nVar, numX49.tnTj78("bt8Pi"));
        if (pVarArr.length == 0) {
            return empty();
        }
        return new N(pVarArr, null, nVar, i << 1, true, 0);
    }

    public static <T> l concat(p pVar) {
        return concat(pVar, bufferSize());
    }

    public static <T> l concatDelayError(p pVar) {
        return concatDelayError(pVar, bufferSize(), true);
    }

    public static <T> l concatEager(Iterable<? extends p> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }

    public static <T> l error(Throwable th2) {
        jh.e.b(th2, numX49.tnTj78("bt8Ph"));
        return error(new CallableC0192z(th2, 4));
    }

    public static <T> l fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        jh.e.b(future, numX49.tnTj78("bt8PX"));
        jh.e.b(timeUnit, numX49.tnTj78("bt8PG"));
        return new O0(future, j, timeUnit);
    }

    public static l interval(long j, TimeUnit timeUnit) {
        return interval(j, j, timeUnit, Vh.f.f6126a);
    }

    public static l intervalRange(long j, long j6, long j7, long j9, TimeUnit timeUnit, v vVar) {
        if (j6 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.f(j6, numX49.tnTj78("bt8Ps")));
        }
        if (j6 == 0) {
            return empty().delay(j7, timeUnit, vVar);
        }
        long j10 = (j6 - 1) + j;
        if (j > 0 && j10 < 0) {
            throw new IllegalArgumentException(numX49.tnTj78("bt8P1"));
        }
        jh.e.b(timeUnit, numX49.tnTj78("bt8Pn"));
        jh.e.b(vVar, numX49.tnTj78("bt8Px"));
        return new C2090k1(j, j10, Math.max(0L, j7), Math.max(0L, j9), timeUnit, vVar);
    }

    public static <T> l just(T t5, T t10) {
        jh.e.b(t5, numX49.tnTj78("bt8PJ"));
        jh.e.b(t10, numX49.tnTj78("bt8PI"));
        return fromArray(t5, t10);
    }

    public static <T> l merge(Iterable<? extends p> iterable, int i) {
        return fromIterable(iterable).flatMap(jh.e.f17815a, i);
    }

    public static <T> l mergeDelayError(Iterable<? extends p> iterable, int i) {
        return fromIterable(iterable).flatMap((hh.n) jh.e.f17815a, true, i);
    }

    public static <T> w sequenceEqual(p pVar, p pVar2, InterfaceC1571d interfaceC1571d, int i) {
        jh.e.b(pVar, numX49.tnTj78("bt82i"));
        jh.e.b(pVar2, numX49.tnTj78("bt82E"));
        jh.e.b(interfaceC1571d, numX49.tnTj78("bt82F"));
        jh.e.c(i, numX49.tnTj78("bt82H"));
        return new C2122s2(pVar, pVar2, interfaceC1571d, i);
    }

    public static l timer(long j, TimeUnit timeUnit, v vVar) {
        jh.e.b(timeUnit, numX49.tnTj78("bt82e"));
        jh.e.b(vVar, numX49.tnTj78("bt828"));
        return new O0(Math.max(j, 0L), timeUnit, vVar);
    }

    public final l buffer(long j, TimeUnit timeUnit) {
        return buffer(j, timeUnit, Vh.f.f6126a, Integer.MAX_VALUE);
    }

    public final AbstractC1103b concatMapCompletableDelayError(hh.n nVar, boolean z4, int i) {
        jh.e.b(nVar, numX49.tnTj78("bt8rj"));
        jh.e.c(i, numX49.tnTj78("bt8rd"));
        return new C1981c(this, nVar, z4 ? 3 : 2, i);
    }

    public final <U> l concatMapIterable(hh.n nVar, int i) {
        jh.e.b(nVar, numX49.tnTj78("bt8r8"));
        jh.e.c(i, numX49.tnTj78("bt8rC"));
        return concatMap(new jh.d(nVar), i);
    }

    public final <R> l concatMapMaybeDelayError(hh.n nVar, boolean z4, int i) {
        jh.e.b(nVar, numX49.tnTj78("bt8rK"));
        jh.e.c(i, numX49.tnTj78("bt8rw"));
        return new oh.e(this, nVar, z4 ? 3 : 2, i, 0);
    }

    public final <R> l concatMapSingleDelayError(hh.n nVar, boolean z4, int i) {
        jh.e.b(nVar, numX49.tnTj78("bt8rD"));
        jh.e.c(i, numX49.tnTj78("bt8rh"));
        return new oh.e(this, nVar, z4 ? 3 : 2, i, 1);
    }

    public final l concatWith(y yVar) {
        jh.e.b(yVar, numX49.tnTj78("bt8ra"));
        return new X(this, yVar, 0);
    }

    public final <U> l debounce(hh.n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8ry"));
        return new C2065e0(this, nVar, 0);
    }

    public final l delay(long j, TimeUnit timeUnit, boolean z4) {
        return delay(j, timeUnit, Vh.f.f6126a, z4);
    }

    public final <U> l delaySubscription(p pVar) {
        jh.e.b(pVar, numX49.tnTj78("bt8rT"));
        return new C2112q(1, this, pVar);
    }

    public final <K> l distinct(hh.n nVar, Callable<? extends Collection<? super K>> callable) {
        jh.e.b(nVar, numX49.tnTj78("bt8rp"));
        jh.e.b(callable, numX49.tnTj78("bt8r0"));
        return new C2044A(this, nVar, callable, 3, false);
    }

    public final <R> l flatMap(hh.n nVar, boolean z4, int i) {
        return flatMap(nVar, z4, i, bufferSize());
    }

    public final <U, V> l flatMapIterable(hh.n nVar, InterfaceC1570c interfaceC1570c) {
        jh.e.b(nVar, numX49.tnTj78("bt8ZE"));
        jh.e.b(interfaceC1570c, numX49.tnTj78("bt8ZF"));
        return flatMap(new jh.d(nVar), interfaceC1570c, false, bufferSize(), bufferSize());
    }

    public final InterfaceC1486b forEachWhile(hh.o oVar, InterfaceC1573f interfaceC1573f, InterfaceC1568a interfaceC1568a) {
        jh.e.b(oVar, numX49.tnTj78("bt8ZQ"));
        jh.e.b(interfaceC1573f, numX49.tnTj78("bt8Zt"));
        jh.e.b(interfaceC1568a, numX49.tnTj78("bt8ZU"));
        C1837h c1837h = new C1837h(oVar, interfaceC1573f, interfaceC1568a);
        subscribe(c1837h);
        return c1837h;
    }

    public final <K, V> l groupBy(hh.n nVar, hh.n nVar2) {
        return groupBy(nVar, nVar2, false, bufferSize());
    }

    public final l mergeWith(y yVar) {
        jh.e.b(yVar, numX49.tnTj78("bt8Z3"));
        return new X(this, yVar, 1);
    }

    public final l observeOn(v vVar, boolean z4, int i) {
        jh.e.b(vVar, numX49.tnTj78("bt8Zy"));
        jh.e.c(i, numX49.tnTj78("bt8Zv"));
        return new C2129u1(this, vVar, z4, i);
    }

    public final l onErrorResumeNext(p pVar) {
        jh.e.b(pVar, numX49.tnTj78("bt8ZA"));
        return onErrorResumeNext(new CallableC0192z(pVar, 4));
    }

    public final <R> w reduce(R r9, InterfaceC1570c interfaceC1570c) {
        jh.e.b(r9, numX49.tnTj78("bt8Zf"));
        jh.e.b(interfaceC1570c, numX49.tnTj78("bt8Z1"));
        return new I1(this, r9, interfaceC1570c, 0);
    }

    public final l sample(long j, TimeUnit timeUnit, boolean z4) {
        return sample(j, timeUnit, Vh.f.f6126a, z4);
    }

    public final <R> l scan(R r9, InterfaceC1570c interfaceC1570c) {
        jh.e.b(r9, numX49.tnTj78("bt8kD"));
        return scanWith(new CallableC0192z(r9, 4), interfaceC1570c);
    }

    public final l skip(long j, TimeUnit timeUnit, v vVar) {
        return skipUntil(timer(j, timeUnit, vVar));
    }

    public final l skipLast(long j, TimeUnit timeUnit, boolean z4) {
        return skipLast(j, timeUnit, Vh.f.f6127b, z4, bufferSize());
    }

    public final InterfaceC1486b subscribe(InterfaceC1573f interfaceC1573f, InterfaceC1573f interfaceC1573f2) {
        return subscribe(interfaceC1573f, interfaceC1573f2, jh.e.c, jh.e.f17817d);
    }

    public final l takeLast(long j, TimeUnit timeUnit) {
        return takeLast(j, timeUnit, Vh.f.f6127b, false, bufferSize());
    }

    public final l takeUntil(hh.o oVar) {
        jh.e.b(oVar, numX49.tnTj78("bt8Bk"));
        return new C2092l(this, oVar, 4);
    }

    public final C2481e test(boolean z4) {
        C2481e c2481e = new C2481e();
        if (z4) {
            c2481e.dispose();
        }
        subscribe(c2481e);
        return c2481e;
    }

    public final l throttleFirst(long j, TimeUnit timeUnit, v vVar) {
        jh.e.b(timeUnit, numX49.tnTj78("bt8Bu"));
        jh.e.b(vVar, numX49.tnTj78("bt8BV"));
        return new C2077h0(1, j, this, vVar, timeUnit);
    }

    public final l throttleLatest(long j, TimeUnit timeUnit, boolean z4) {
        return throttleLatest(j, timeUnit, Vh.f.f6126a, z4);
    }

    public final l timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, Vh.f.f6126a);
    }

    public final <V> l timeout(hh.n nVar, p pVar) {
        jh.e.b(pVar, numX49.tnTj78("bt8B8"));
        jh.e.b(nVar, numX49.tnTj78("bt8BC"));
        return new C2139x(this, null, nVar, pVar, 2);
    }

    public final l timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, Vh.f.f6126a);
    }

    public final l window(long j, TimeUnit timeUnit) {
        return window(j, timeUnit, Vh.f.f6126a, Long.MAX_VALUE, false);
    }

    public static <T> l concat(p pVar, int i) {
        jh.e.b(pVar, numX49.tnTj78("bt8PE"));
        jh.e.c(i, numX49.tnTj78("bt8PF"));
        return new C2123t(pVar, jh.e.f17815a, i, 1);
    }

    public static <T> l concatDelayError(p pVar, int i, boolean z4) {
        jh.e.b(pVar, numX49.tnTj78("bt8PK"));
        jh.e.c(i, numX49.tnTj78("bt8Pw"));
        return new C2123t(pVar, jh.e.f17815a, i, z4 ? 3 : 2);
    }

    public static <T> l concatEager(Iterable<? extends p> iterable, int i, int i4) {
        return fromIterable(iterable).concatMapEagerDelayError(jh.e.f17815a, i, i4, false);
    }

    public static <T> l merge(p pVar) {
        jh.e.b(pVar, numX49.tnTj78("bt8b0"));
        return new E0(pVar, jh.e.f17815a, false, Integer.MAX_VALUE, bufferSize());
    }

    public static <T> l mergeDelayError(p pVar) {
        jh.e.b(pVar, numX49.tnTj78("bt8bl"));
        return new E0(pVar, jh.e.f17815a, true, Integer.MAX_VALUE, bufferSize());
    }

    public static <T> l switchOnNext(p pVar) {
        return switchOnNext(pVar, bufferSize());
    }

    public static <T, R> l zip(p pVar, hh.n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8Lo"));
        jh.e.b(pVar, numX49.tnTj78("bt8LK"));
        return new C2120s0(pVar).flatMap(new C2066e1(nVar, 1));
    }

    public final l distinctUntilChanged(InterfaceC1571d interfaceC1571d) {
        jh.e.b(interfaceC1571d, numX49.tnTj78("bt8rg"));
        return new C2044A(this, jh.e.f17815a, interfaceC1571d, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> l flatMap(hh.n nVar, boolean z4, int i, int i4) throws Exception {
        jh.e.b(nVar, numX49.tnTj78("bt8ZV"));
        jh.e.c(i, numX49.tnTj78("bt8ZS"));
        jh.e.c(i4, numX49.tnTj78("bt8Zj"));
        if (this instanceof InterfaceCallableC1777d) {
            Object objCall = ((InterfaceCallableC1777d) this).call();
            if (objCall == null) {
                return empty();
            }
            return new C2112q(3, objCall, nVar);
        }
        return new E0(this, nVar, z4, i, i4);
    }

    public final <K, V> l groupBy(hh.n nVar, hh.n nVar2, boolean z4) {
        return groupBy(nVar, nVar2, z4, bufferSize());
    }

    public final <R> l publish(hh.n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8Z0"));
        return new C2065e0(this, nVar, 5);
    }

    public final <R> l replay(hh.n nVar, long j, TimeUnit timeUnit) {
        return replay(nVar, j, timeUnit, Vh.f.f6126a);
    }

    public final l retry(long j) {
        return retry(j, jh.e.f);
    }

    public final l startWith(Object obj) {
        jh.e.b(obj, numX49.tnTj78("bt8kA"));
        return concatArray(just(obj), this);
    }

    public final InterfaceC1486b subscribe(InterfaceC1573f interfaceC1573f, InterfaceC1573f interfaceC1573f2, InterfaceC1568a interfaceC1568a) {
        return subscribe(interfaceC1573f, interfaceC1573f2, interfaceC1568a, jh.e.f17817d);
    }

    public final <U extends Collection<Object>> w toList(Callable<U> callable) {
        jh.e.b(callable, numX49.tnTj78("bt8Bc"));
        return new C2100n(this, callable, 2);
    }

    public final <T1, T2, R> l withLatestFrom(p pVar, p pVar2, InterfaceC1574g interfaceC1574g) {
        jh.e.b(pVar, numX49.tnTj78("bt8uS"));
        jh.e.b(pVar2, numX49.tnTj78("bt8uj"));
        jh.e.b(interfaceC1574g, numX49.tnTj78("bt8ud"));
        jh.e.b(null, numX49.tnTj78("bt8ui"));
        throw null;
    }

    public final <U, R> l zipWith(p pVar, InterfaceC1570c interfaceC1570c) {
        jh.e.b(pVar, numX49.tnTj78("bt8uU"));
        return zip(this, pVar, interfaceC1570c);
    }

    public static l interval(long j, long j6, TimeUnit timeUnit, v vVar) {
        jh.e.b(timeUnit, numX49.tnTj78("bt8Pg"));
        jh.e.b(vVar, numX49.tnTj78("bt8Pf"));
        return new C2082i1(Math.max(0L, j), Math.max(0L, j6), timeUnit, vVar);
    }

    public final l buffer(long j, TimeUnit timeUnit, int i) {
        return buffer(j, timeUnit, Vh.f.f6126a, i);
    }

    public final l concatWith(j jVar) {
        jh.e.b(jVar, numX49.tnTj78("bt8rN"));
        return new W(this, jVar, 0);
    }

    public final l debounce(long j, TimeUnit timeUnit, v vVar) {
        jh.e.b(timeUnit, numX49.tnTj78("bt8rG"));
        jh.e.b(vVar, numX49.tnTj78("bt8r3"));
        return new C2077h0(0, j, this, vVar, timeUnit);
    }

    public final <U> l delay(hh.n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8rY"));
        return flatMap(new C2066e1(nVar, 0));
    }

    public final l delaySubscription(long j, TimeUnit timeUnit, v vVar) {
        return delaySubscription(timer(j, timeUnit, vVar));
    }

    public final <K, V> l groupBy(hh.n nVar, hh.n nVar2, boolean z4, int i) {
        jh.e.b(nVar, numX49.tnTj78("bt8Ze"));
        jh.e.b(nVar2, numX49.tnTj78("bt8Z8"));
        jh.e.c(i, numX49.tnTj78("bt8ZC"));
        return new W0(this, nVar, nVar2, i, z4);
    }

    public final l mergeWith(j jVar) {
        jh.e.b(jVar, numX49.tnTj78("bt8ZX"));
        return new W(this, jVar, 1);
    }

    public final l retry(long j, hh.o oVar) {
        if (j >= 0) {
            jh.e.b(oVar, numX49.tnTj78("bt8kO"));
            return new C2075g2(this, j, oVar);
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.a.f(j, numX49.tnTj78("bt8kQ")));
    }

    public final l sample(long j, TimeUnit timeUnit, v vVar) {
        jh.e.b(timeUnit, numX49.tnTj78("bt8kC"));
        jh.e.b(vVar, numX49.tnTj78("bt8k4"));
        return new C2089k0(1, j, this, vVar, timeUnit, false);
    }

    public final l skipLast(int i) {
        if (i >= 0) {
            return i == 0 ? this : new C2130u2(this, i, 0);
        }
        throw new IndexOutOfBoundsException(We.s.f(i, numX49.tnTj78("bt8k6")));
    }

    public final InterfaceC1486b subscribe(InterfaceC1573f interfaceC1573f, InterfaceC1573f interfaceC1573f2, InterfaceC1568a interfaceC1568a, InterfaceC1573f interfaceC1573f3) {
        jh.e.b(interfaceC1573f, numX49.tnTj78("bt8kY"));
        jh.e.b(interfaceC1573f2, numX49.tnTj78("bt8kT"));
        jh.e.b(interfaceC1568a, numX49.tnTj78("bt8kR"));
        jh.e.b(interfaceC1573f3, numX49.tnTj78("bt8kp"));
        C1840k c1840k = new C1840k(interfaceC1573f, interfaceC1573f2, interfaceC1568a, interfaceC1573f3);
        subscribe(c1840k);
        return c1840k;
    }

    public final l takeLast(long j, TimeUnit timeUnit, boolean z4) {
        return takeLast(j, timeUnit, Vh.f.f6127b, z4, bufferSize());
    }

    public final l throttleLatest(long j, TimeUnit timeUnit, v vVar) {
        return throttleLatest(j, timeUnit, vVar, false);
    }

    public final <K, V> w toMap(hh.n nVar, hh.n nVar2) {
        jh.e.b(nVar, numX49.tnTj78("bt8BD"));
        jh.e.b(nVar2, numX49.tnTj78("bt8Bh"));
        return collect(EnumC2354e.f20502a, new C1421c(17, nVar2, nVar));
    }

    public final <K, V> w toMultimap(hh.n nVar, hh.n nVar2) {
        return toMultimap(nVar, nVar2, EnumC2354e.f20502a, EnumC2350a.f20496a);
    }

    public final l window(long j, TimeUnit timeUnit, long j6) {
        return window(j, timeUnit, Vh.f.f6126a, j6, false);
    }

    public static <T> l fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit, v vVar) {
        jh.e.b(vVar, numX49.tnTj78("bt8P3"));
        return fromFuture(future, j, timeUnit).subscribeOn(vVar);
    }

    public static <T, S> l generate(Callable<S> callable, InterfaceC1569b interfaceC1569b) {
        jh.e.b(interfaceC1569b, numX49.tnTj78("bt8PY"));
        return generate(callable, new p8.a(interfaceC1569b, 2), jh.e.f17817d);
    }

    public static <T> l just(T t5, T t10, T t11) {
        jh.e.b(t5, numX49.tnTj78("bt8Pq"));
        jh.e.b(t10, numX49.tnTj78("bt8Pz"));
        jh.e.b(t11, numX49.tnTj78("bt8Pl"));
        return fromArray(t5, t10, t11);
    }

    public static <T> l merge(p pVar, int i) {
        jh.e.b(pVar, numX49.tnTj78("bt8bg"));
        jh.e.c(i, numX49.tnTj78("bt8bf"));
        return new E0(pVar, jh.e.f17815a, false, i, bufferSize());
    }

    public static <T> l mergeDelayError(p pVar, int i) {
        jh.e.b(pVar, numX49.tnTj78("bt8bW"));
        jh.e.c(i, numX49.tnTj78("bt829"));
        return new E0(pVar, jh.e.f17815a, true, i, bufferSize());
    }

    public final Object blockingFirst(Object obj) {
        C1833d c1833d = new C1833d(1, 0);
        subscribe(c1833d);
        Object objA = c1833d.a();
        return objA != null ? objA : obj;
    }

    public final Object blockingLast(Object obj) {
        C1833d c1833d = new C1833d(1, 1);
        subscribe(c1833d);
        Object objA = c1833d.a();
        return objA != null ? objA : obj;
    }

    public final AbstractC2439a replay(int i, long j, TimeUnit timeUnit) {
        return replay(i, j, timeUnit, Vh.f.f6126a);
    }

    public final l throttleLatest(long j, TimeUnit timeUnit, v vVar, boolean z4) {
        jh.e.b(timeUnit, numX49.tnTj78("bt8BS"));
        jh.e.b(vVar, numX49.tnTj78("bt8Bj"));
        return new C2089k0(2, j, this, vVar, timeUnit, z4);
    }

    public final l timeInterval(v vVar) {
        return timeInterval(TimeUnit.MILLISECONDS, vVar);
    }

    public final l timeout(long j, TimeUnit timeUnit, p pVar) {
        jh.e.b(pVar, numX49.tnTj78("bt8BE"));
        return c(j, timeUnit, Vh.f.f6126a, pVar);
    }

    public final l timestamp(v vVar) {
        return timestamp(TimeUnit.MILLISECONDS, vVar);
    }

    public final <U, R> l zipWith(p pVar, InterfaceC1570c interfaceC1570c, boolean z4) {
        return zip(this, pVar, interfaceC1570c, z4);
    }

    public static <T, R> l combineLatest(p[] pVarArr, hh.n nVar) {
        return combineLatest(pVarArr, nVar, bufferSize());
    }

    public static <T> l concat(p pVar, p pVar2) {
        jh.e.b(pVar, numX49.tnTj78("bt8PH"));
        jh.e.b(pVar2, numX49.tnTj78("bt8PO"));
        return concatArray(pVar, pVar2);
    }

    public final Object blockingSingle(Object obj) {
        return single(obj).b();
    }

    public final l buffer(int i) {
        return buffer(i, i);
    }

    public final l concatWith(InterfaceC1105d interfaceC1105d) {
        jh.e.b(interfaceC1105d, numX49.tnTj78("bt8rM"));
        return new V(this, interfaceC1105d, 0);
    }

    public final l doOnEach(r rVar) {
        jh.e.b(rVar, numX49.tnTj78("bt8rs"));
        return b(new C2070f1(rVar, 0), new M(rVar, 28), new C1967a(rVar, 5), jh.e.c);
    }

    public final l mergeWith(InterfaceC1105d interfaceC1105d) {
        jh.e.b(interfaceC1105d, numX49.tnTj78("bt8Za"));
        return new V(this, interfaceC1105d, 1);
    }

    public final l takeLast(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(We.s.f(i, numX49.tnTj78("bt8BP")));
        }
        if (i == 0) {
            return new Z(this, 3);
        }
        if (i == 1) {
            return new Z(this, 8);
        }
        return new C2130u2(this, i, 1);
    }

    public final l timeInterval(TimeUnit timeUnit, v vVar) {
        jh.e.b(timeUnit, numX49.tnTj78("bt8Bd"));
        jh.e.b(vVar, numX49.tnTj78("bt8Bi"));
        return new C2044A(this, timeUnit, vVar, 7, false);
    }

    public final l timestamp(TimeUnit timeUnit, v vVar) {
        jh.e.b(timeUnit, numX49.tnTj78("bt8B4"));
        jh.e.b(vVar, numX49.tnTj78("bt8Bo"));
        return map(new C1421c(16, timeUnit, vVar));
    }

    public final w toSortedList(Comparator<Object> comparator, int i) {
        jh.e.b(comparator, numX49.tnTj78("bt8Bv"));
        w list = toList(i);
        L l6 = new L(comparator, 18);
        list.getClass();
        return new C2106o1(2, list, l6);
    }

    public final l window(long j, TimeUnit timeUnit, long j6, boolean z4) {
        return window(j, timeUnit, Vh.f.f6126a, j6, z4);
    }

    public final <U, R> l zipWith(p pVar, InterfaceC1570c interfaceC1570c, boolean z4, int i) {
        return zip(this, pVar, interfaceC1570c, z4, i);
    }

    public static <T, R> l combineLatest(p[] pVarArr, hh.n nVar, int i) {
        jh.e.b(pVarArr, numX49.tnTj78("bt8Pk"));
        if (pVarArr.length == 0) {
            return empty();
        }
        jh.e.b(nVar, numX49.tnTj78("bt8PB"));
        jh.e.c(i, numX49.tnTj78("bt8Pu"));
        return new N(pVarArr, null, nVar, i << 1, false, 0);
    }

    public static <T, R> l combineLatestDelayError(Iterable<? extends p> iterable, hh.n nVar) {
        return combineLatestDelayError(iterable, nVar, bufferSize());
    }

    public static l interval(long j, TimeUnit timeUnit, v vVar) {
        return interval(j, j, timeUnit, vVar);
    }

    public static <T> w sequenceEqual(p pVar, p pVar2, int i) {
        return sequenceEqual(pVar, pVar2, jh.e.j, i);
    }

    public final l buffer(int i, int i4) {
        return buffer(i, i4, EnumC2350a.f20496a);
    }

    public final l delay(long j, TimeUnit timeUnit, v vVar) {
        return delay(j, timeUnit, vVar, false);
    }

    public final AbstractC2439a replay(long j, TimeUnit timeUnit) {
        return replay(j, timeUnit, Vh.f.f6126a);
    }

    public final l sample(long j, TimeUnit timeUnit, v vVar, boolean z4) {
        jh.e.b(timeUnit, numX49.tnTj78("bt8ko"));
        jh.e.b(vVar, numX49.tnTj78("bt8kK"));
        return new C2089k0(1, j, this, vVar, timeUnit, z4);
    }

    public final l sorted(Comparator<Object> comparator) {
        l c1499a;
        jh.e.b(comparator, numX49.tnTj78("bt8kv"));
        Object list = toList();
        list.getClass();
        if (list instanceof InterfaceC1774a) {
            c1499a = ((InterfaceC1774a) list).a();
        } else {
            c1499a = new C1499a(list, 6);
        }
        return c1499a.map(new L(comparator, 18)).flatMapIterable(jh.e.f17815a);
    }

    public final <K, V> w toMultimap(hh.n nVar, hh.n nVar2, Callable<? extends Map<K, Collection<V>>> callable, hh.n nVar3) {
        jh.e.b(nVar, numX49.tnTj78("bt8Ba"));
        jh.e.b(nVar2, numX49.tnTj78("bt8BX"));
        jh.e.b(callable, numX49.tnTj78("bt8BG"));
        jh.e.b(nVar3, numX49.tnTj78("bt8B3"));
        return collect(callable, new U8.c(24, nVar3, nVar2, nVar));
    }

    public final <T1, T2, T3, R> l withLatestFrom(p pVar, p pVar2, p pVar3, InterfaceC1575h interfaceC1575h) {
        jh.e.b(pVar, numX49.tnTj78("bt8uZ"));
        jh.e.b(pVar2, numX49.tnTj78("bt8uk"));
        jh.e.b(pVar3, numX49.tnTj78("bt8uB"));
        jh.e.b(interfaceC1575h, numX49.tnTj78("bt8uu"));
        jh.e.b(null, numX49.tnTj78("bt8uV"));
        throw null;
    }

    public static <T, R> l combineLatestDelayError(Iterable<? extends p> iterable, hh.n nVar, int i) {
        jh.e.b(iterable, numX49.tnTj78("bt8PV"));
        jh.e.b(nVar, numX49.tnTj78("bt8PS"));
        jh.e.c(i, numX49.tnTj78("bt8Pj"));
        return new N(null, iterable, nVar, i << 1, true, 0);
    }

    public static <T> l fromFuture(Future<? extends T> future, v vVar) {
        jh.e.b(vVar, numX49.tnTj78("bt8Py"));
        return fromFuture(future).subscribeOn(vVar);
    }

    public static <T, S> l generate(Callable<S> callable, InterfaceC1569b interfaceC1569b, InterfaceC1573f interfaceC1573f) {
        jh.e.b(interfaceC1569b, numX49.tnTj78("bt8PT"));
        return generate(callable, new p8.a(interfaceC1569b, 2), interfaceC1573f);
    }

    public static <T> l merge(p pVar, p pVar2) {
        jh.e.b(pVar, numX49.tnTj78("bt8b1"));
        jh.e.b(pVar2, numX49.tnTj78("bt8bn"));
        return fromArray(pVar, pVar2).flatMap((hh.n) jh.e.f17815a, false, 2);
    }

    public static <T> l mergeDelayError(p pVar, p pVar2) {
        jh.e.b(pVar, numX49.tnTj78("bt82P"));
        jh.e.b(pVar2, numX49.tnTj78("bt82b"));
        return fromArray(pVar, pVar2).flatMap((hh.n) jh.e.f17815a, true, 2);
    }

    public static <T1, T2, R> l zip(p pVar, p pVar2, InterfaceC1570c interfaceC1570c) {
        jh.e.b(pVar, numX49.tnTj78("bt8LH"));
        jh.e.b(pVar2, numX49.tnTj78("bt8LO"));
        jh.e.b(interfaceC1570c, numX49.tnTj78("bt8LQ"));
        return zipArray(new com.google.firebase.messaging.p(interfaceC1570c, 17), false, bufferSize(), pVar, pVar2);
    }

    public final <U extends Collection<Object>> l buffer(int i, int i4, Callable<U> callable) {
        jh.e.c(i, numX49.tnTj78("bt8LY"));
        jh.e.c(i4, numX49.tnTj78("bt8LT"));
        jh.e.b(callable, numX49.tnTj78("bt8LR"));
        return new C2123t(this, i, i4, callable);
    }

    public final l delay(long j, TimeUnit timeUnit, v vVar, boolean z4) {
        jh.e.b(timeUnit, numX49.tnTj78("bt8r7"));
        jh.e.b(vVar, numX49.tnTj78("bt8rA"));
        return new C2089k0(0, j, this, vVar, timeUnit, z4);
    }

    public final w elementAt(long j, Object obj) {
        if (j >= 0) {
            jh.e.b(obj, numX49.tnTj78("bt8rl"));
            return new ph.A0(this, j, obj);
        }
        throw new IndexOutOfBoundsException(androidx.camera.core.impl.a.f(j, numX49.tnTj78("bt8rW")));
    }

    public final l take(long j, TimeUnit timeUnit) {
        return takeUntil(timer(j, timeUnit));
    }

    public final l timeout(long j, TimeUnit timeUnit, v vVar, p pVar) {
        jh.e.b(pVar, numX49.tnTj78("bt8BF"));
        return c(j, timeUnit, vVar, pVar);
    }

    public final l window(long j) {
        return window(j, j, bufferSize());
    }

    public static <T> l concat(p pVar, p pVar2, p pVar3) {
        jh.e.b(pVar, numX49.tnTj78("bt8PQ"));
        jh.e.b(pVar2, numX49.tnTj78("bt8Pt"));
        jh.e.b(pVar3, numX49.tnTj78("bt8PU"));
        return concatArray(pVar, pVar2, pVar3);
    }

    public static <T> l just(T t5, T t10, T t11, T t12) {
        jh.e.b(t5, numX49.tnTj78("bt8PW"));
        jh.e.b(t10, numX49.tnTj78("bt8b9"));
        jh.e.b(t11, numX49.tnTj78("bt8bP"));
        jh.e.b(t12, numX49.tnTj78("bt8bb"));
        return fromArray(t5, t10, t11, t12);
    }

    public final <R> l replay(hh.n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8ZI"));
        return new C2112q(2, new CallableC0192z(this, 8), nVar);
    }

    public final l take(long j, TimeUnit timeUnit, v vVar) {
        return takeUntil(timer(j, timeUnit, vVar));
    }

    public final <K, V> w toMap(hh.n nVar, hh.n nVar2, Callable<? extends Map<K, V>> callable) {
        jh.e.b(nVar, numX49.tnTj78("bt8BM"));
        jh.e.b(nVar2, numX49.tnTj78("bt8BN"));
        jh.e.b(callable, numX49.tnTj78("bt8B6"));
        return collect(callable, new C1421c(17, nVar2, nVar));
    }

    public final l window(long j, long j6) {
        return window(j, j6, bufferSize());
    }

    public final <U> l sample(p pVar) {
        jh.e.b(pVar, numX49.tnTj78("bt8kw"));
        return new H0(this, pVar, false, 4);
    }

    @Override // ch.p
    public final void subscribe(r rVar) {
        jh.e.b(rVar, numX49.tnTj78("bt8k0"));
        try {
            subscribeActual(rVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            of.p.F(th2);
            S1.s.r(th2);
            NullPointerException nullPointerException = new NullPointerException(numX49.tnTj78("bt8kg"));
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final l timeout(long j, TimeUnit timeUnit, v vVar) {
        return c(j, timeUnit, vVar, null);
    }

    public final l window(long j, long j6, int i) {
        jh.e.d(j, numX49.tnTj78("bt8BA"));
        jh.e.d(j6, numX49.tnTj78("bt8BY"));
        jh.e.c(i, numX49.tnTj78("bt8BT"));
        return new a3(this, j, j6, i);
    }

    public static <T, S> l generate(Callable<S> callable, InterfaceC1570c interfaceC1570c) {
        return generate(callable, interfaceC1570c, jh.e.f17817d);
    }

    public static <T> l merge(p pVar, p pVar2, p pVar3) {
        jh.e.b(pVar, numX49.tnTj78("bt8bx"));
        jh.e.b(pVar2, numX49.tnTj78("bt8bs"));
        jh.e.b(pVar3, numX49.tnTj78("bt8b5"));
        return fromArray(pVar, pVar2, pVar3).flatMap((hh.n) jh.e.f17815a, false, 3);
    }

    public static <T> l mergeDelayError(p pVar, p pVar2, p pVar3) {
        jh.e.b(pVar, numX49.tnTj78("bt822"));
        jh.e.b(pVar2, numX49.tnTj78("bt82L"));
        jh.e.b(pVar3, numX49.tnTj78("bt82r"));
        return fromArray(pVar, pVar2, pVar3).flatMap((hh.n) jh.e.f17815a, true, 3);
    }

    public final <U, V> l delay(p pVar, hh.n nVar) {
        return delaySubscription(pVar).delay(nVar);
    }

    public final <R> l flatMap(hh.n nVar, hh.n nVar2, Callable<? extends p> callable) {
        jh.e.b(nVar, numX49.tnTj78("bt8ZL"));
        jh.e.b(nVar2, numX49.tnTj78("bt8Zr"));
        jh.e.b(callable, numX49.tnTj78("bt8ZZ"));
        return merge(new C2139x(this, nVar, nVar2, callable));
    }

    public final <U, V> l timeout(p pVar, hh.n nVar) {
        jh.e.b(pVar, numX49.tnTj78("bt8BH"));
        jh.e.b(nVar, numX49.tnTj78("bt8BO"));
        return new C2139x(this, pVar, nVar, null, 2);
    }

    public final w toSortedList(int i) {
        return toSortedList(jh.e.i, i);
    }

    public static <T, S> l generate(Callable<S> callable, InterfaceC1570c interfaceC1570c, InterfaceC1573f interfaceC1573f) {
        jh.e.b(callable, numX49.tnTj78("bt8PR"));
        jh.e.b(interfaceC1570c, numX49.tnTj78("bt8Pp"));
        jh.e.b(interfaceC1573f, numX49.tnTj78("bt8P0"));
        return new S0(callable, interfaceC1570c, interfaceC1573f);
    }

    public final void blockingSubscribe(InterfaceC1573f interfaceC1573f) {
        S1.r.x(this, interfaceC1573f, jh.e.e, jh.e.c);
    }

    public final <U extends Collection<Object>> l buffer(int i, Callable<U> callable) {
        return buffer(i, i, callable);
    }

    public final <R> l replay(hh.n nVar, int i) {
        jh.e.b(nVar, numX49.tnTj78("bt8Zq"));
        jh.e.c(i, numX49.tnTj78("bt8Zz"));
        return new C2112q(2, new CallableC1879f(this, i, 1), nVar);
    }

    public final <U> l sample(p pVar, boolean z4) {
        jh.e.b(pVar, numX49.tnTj78("bt8kc"));
        return new H0(this, pVar, z4, 4);
    }

    public final l skipLast(long j, TimeUnit timeUnit, v vVar) {
        return skipLast(j, timeUnit, vVar, false, bufferSize());
    }

    public final <T1, T2, T3, T4, R> l withLatestFrom(p pVar, p pVar2, p pVar3, p pVar4, hh.i iVar) {
        jh.e.b(pVar, numX49.tnTj78("bt8u9"));
        jh.e.b(pVar2, numX49.tnTj78("bt8uP"));
        jh.e.b(pVar3, numX49.tnTj78("bt8ub"));
        jh.e.b(pVar4, numX49.tnTj78("bt8u2"));
        jh.e.b(iVar, numX49.tnTj78("bt8uL"));
        jh.e.b(null, numX49.tnTj78("bt8ur"));
        throw null;
    }

    public static <T1, T2, R> l combineLatest(p pVar, p pVar2, InterfaceC1570c interfaceC1570c) {
        jh.e.b(pVar, numX49.tnTj78("bt8PP"));
        jh.e.b(pVar2, numX49.tnTj78("bt8Pb"));
        jh.e.b(interfaceC1570c, numX49.tnTj78("bt8P2"));
        return combineLatest(new com.google.firebase.messaging.p(interfaceC1570c, 17), bufferSize(), pVar, pVar2);
    }

    public static <T> l concat(p pVar, p pVar2, p pVar3, p pVar4) {
        jh.e.b(pVar, numX49.tnTj78("bt8Pe"));
        jh.e.b(pVar2, numX49.tnTj78("bt8P8"));
        jh.e.b(pVar3, numX49.tnTj78("bt8PC"));
        jh.e.b(pVar4, numX49.tnTj78("bt8P4"));
        return concatArray(pVar, pVar2, pVar3, pVar4);
    }

    public static <T1, T2, R> l zip(p pVar, p pVar2, InterfaceC1570c interfaceC1570c, boolean z4) {
        jh.e.b(pVar, numX49.tnTj78("bt8Lt"));
        jh.e.b(pVar2, numX49.tnTj78("bt8LU"));
        jh.e.b(interfaceC1570c, numX49.tnTj78("bt8Le"));
        return zipArray(new com.google.firebase.messaging.p(interfaceC1570c, 17), z4, bufferSize(), pVar, pVar2);
    }

    public final void blockingSubscribe(InterfaceC1573f interfaceC1573f, InterfaceC1573f interfaceC1573f2) {
        S1.r.x(this, interfaceC1573f, interfaceC1573f2, jh.e.c);
    }

    public final l buffer(long j, long j6, TimeUnit timeUnit, v vVar) {
        return buffer(j, j6, timeUnit, vVar, EnumC2350a.f20496a);
    }

    public final l retry(hh.o oVar) {
        return retry(Long.MAX_VALUE, oVar);
    }

    public final l skipLast(long j, TimeUnit timeUnit, v vVar, boolean z4) {
        return skipLast(j, timeUnit, vVar, z4, bufferSize());
    }

    public final <K, V> w toMultimap(hh.n nVar, hh.n nVar2, Callable<Map<K, Collection<V>>> callable) {
        return toMultimap(nVar, nVar2, callable, EnumC2350a.f20496a);
    }

    public static <T> l just(T t5, T t10, T t11, T t12, T t13) {
        jh.e.b(t5, numX49.tnTj78("bt8b2"));
        jh.e.b(t10, numX49.tnTj78("bt8bL"));
        jh.e.b(t11, numX49.tnTj78("bt8br"));
        jh.e.b(t12, numX49.tnTj78("bt8bZ"));
        jh.e.b(t13, numX49.tnTj78("bt8bk"));
        return fromArray(t5, t10, t11, t12, t13);
    }

    public final void blockingSubscribe(InterfaceC1573f interfaceC1573f, InterfaceC1573f interfaceC1573f2, InterfaceC1568a interfaceC1568a) {
        S1.r.x(this, interfaceC1573f, interfaceC1573f2, interfaceC1568a);
    }

    public final <U extends Collection<Object>> l buffer(long j, long j6, TimeUnit timeUnit, v vVar, Callable<U> callable) {
        jh.e.b(timeUnit, numX49.tnTj78("bt8Lp"));
        jh.e.b(vVar, numX49.tnTj78("bt8L0"));
        jh.e.b(callable, numX49.tnTj78("bt8Lg"));
        return new G(this, j, j6, timeUnit, vVar, callable, Integer.MAX_VALUE, false);
    }

    public final l skipLast(long j, TimeUnit timeUnit, v vVar, boolean z4, int i) {
        jh.e.b(timeUnit, numX49.tnTj78("bt8ka"));
        jh.e.b(vVar, numX49.tnTj78("bt8kX"));
        jh.e.c(i, numX49.tnTj78("bt8kG"));
        return new C2138w2(i << 1, j, this, vVar, timeUnit, z4);
    }

    public final <U, V> l timeout(p pVar, hh.n nVar, p pVar2) {
        jh.e.b(pVar, numX49.tnTj78("bt8BQ"));
        jh.e.b(pVar2, numX49.tnTj78("bt8Bt"));
        jh.e.b(nVar, numX49.tnTj78("bt8BU"));
        return new C2139x(this, pVar, nVar, pVar2, 2);
    }

    public final l window(long j, long j6, TimeUnit timeUnit, v vVar) {
        return window(j, j6, timeUnit, vVar, bufferSize());
    }

    public static <T> l merge(p pVar, p pVar2, p pVar3, p pVar4) {
        jh.e.b(pVar, numX49.tnTj78("bt8bJ"));
        jh.e.b(pVar2, numX49.tnTj78("bt8bI"));
        jh.e.b(pVar3, numX49.tnTj78("bt8bq"));
        jh.e.b(pVar4, numX49.tnTj78("bt8bz"));
        return fromArray(pVar, pVar2, pVar3, pVar4).flatMap((hh.n) jh.e.f17815a, false, 4);
    }

    public static <T> l mergeDelayError(p pVar, p pVar2, p pVar3, p pVar4) {
        jh.e.b(pVar, numX49.tnTj78("bt82Z"));
        jh.e.b(pVar2, numX49.tnTj78("bt82k"));
        jh.e.b(pVar3, numX49.tnTj78("bt82B"));
        jh.e.b(pVar4, numX49.tnTj78("bt82u"));
        return fromArray(pVar, pVar2, pVar3, pVar4).flatMap((hh.n) jh.e.f17815a, true, 4);
    }

    public final void blockingSubscribe(r rVar) {
        S1.r.w(this, rVar);
    }

    public final <R> l flatMap(hh.n nVar, hh.n nVar2, Callable<? extends p> callable, int i) {
        jh.e.b(nVar, numX49.tnTj78("bt8Zk"));
        jh.e.b(nVar2, numX49.tnTj78("bt8ZB"));
        jh.e.b(callable, numX49.tnTj78("bt8Zu"));
        return merge(new C2139x(this, nVar, nVar2, callable), i);
    }

    public final l window(long j, long j6, TimeUnit timeUnit, v vVar, int i) {
        jh.e.d(j, numX49.tnTj78("bt8BR"));
        jh.e.d(j6, numX49.tnTj78("bt8Bp"));
        jh.e.c(i, numX49.tnTj78("bt8B0"));
        jh.e.b(vVar, numX49.tnTj78("bt8Bg"));
        jh.e.b(timeUnit, numX49.tnTj78("bt8Bf"));
        return new n3(this, j, j6, timeUnit, vVar, Long.MAX_VALUE, i, false);
    }

    public final <R> l replay(hh.n nVar, int i, long j, TimeUnit timeUnit, v vVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8Zl"));
        jh.e.c(i, numX49.tnTj78("bt8ZW"));
        jh.e.b(timeUnit, numX49.tnTj78("bt8k9"));
        jh.e.b(vVar, numX49.tnTj78("bt8kP"));
        return new C2112q(2, new CallableC2062d1(i, j, this, vVar, timeUnit), nVar);
    }

    public static <T1, T2, T3, R> l combineLatest(p pVar, p pVar2, p pVar3, InterfaceC1574g interfaceC1574g) {
        jh.e.b(pVar, numX49.tnTj78("bt8z"));
        jh.e.b(pVar2, numX49.tnTj78("bt8l"));
        jh.e.b(pVar3, numX49.tnTj78("bt8W"));
        jh.e.b(null, numX49.tnTj78("bt8P9"));
        throw null;
    }

    public static <T1, T2, R> l zip(p pVar, p pVar2, InterfaceC1570c interfaceC1570c, boolean z4, int i) {
        jh.e.b(pVar, numX49.tnTj78("bt8L8"));
        jh.e.b(pVar2, numX49.tnTj78("bt8LC"));
        jh.e.b(interfaceC1570c, numX49.tnTj78("bt8L4"));
        return zipArray(new com.google.firebase.messaging.p(interfaceC1570c, 17), z4, i, pVar, pVar2);
    }

    public final l buffer(long j, TimeUnit timeUnit, v vVar, int i) {
        return buffer(j, timeUnit, vVar, i, EnumC2350a.f20496a, false);
    }

    public final l takeLast(long j, long j6, TimeUnit timeUnit, v vVar) {
        return takeLast(j, j6, timeUnit, vVar, false, bufferSize());
    }

    public final <V> l timeout(hh.n nVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8Be"));
        p pVar = null;
        return new C2139x(this, pVar, nVar, pVar, 2);
    }

    public final <R> l withLatestFrom(p[] pVarArr, hh.n nVar) {
        jh.e.b(pVarArr, numX49.tnTj78("bt8uQ"));
        jh.e.b(nVar, numX49.tnTj78("bt8ut"));
        return new C2139x(this, pVarArr, nVar);
    }

    public final <U extends Collection<Object>> l buffer(long j, TimeUnit timeUnit, v vVar, int i, Callable<U> callable, boolean z4) {
        jh.e.b(timeUnit, numX49.tnTj78("bt8Lf"));
        jh.e.b(vVar, numX49.tnTj78("bt8L1"));
        jh.e.b(callable, numX49.tnTj78("bt8Ln"));
        jh.e.c(i, numX49.tnTj78("bt8Lx"));
        return new G(this, j, j, timeUnit, vVar, callable, i, z4);
    }

    public final <R> l flatMap(hh.n nVar, int i) {
        return flatMap(nVar, false, i, bufferSize());
    }

    public final l takeLast(long j, long j6, TimeUnit timeUnit, v vVar, boolean z4, int i) {
        jh.e.b(timeUnit, numX49.tnTj78("bt8Bb"));
        jh.e.b(vVar, numX49.tnTj78("bt8B2"));
        jh.e.c(i, numX49.tnTj78("bt8BL"));
        if (j >= 0) {
            return new H2(this, j, j6, timeUnit, vVar, i, z4);
        }
        throw new IndexOutOfBoundsException(androidx.camera.core.impl.a.f(j, numX49.tnTj78("bt8Br")));
    }

    public static <T> l just(T t5, T t10, T t11, T t12, T t13, T t14) {
        jh.e.b(t5, numX49.tnTj78("bt8bB"));
        jh.e.b(t10, numX49.tnTj78("bt8bu"));
        jh.e.b(t11, numX49.tnTj78("bt8bV"));
        jh.e.b(t12, numX49.tnTj78("bt8bS"));
        jh.e.b(t13, numX49.tnTj78("bt8bj"));
        jh.e.b(t14, numX49.tnTj78("bt8bd"));
        return fromArray(t5, t10, t11, t12, t13, t14);
    }

    public final <U, R> l flatMap(hh.n nVar, InterfaceC1570c interfaceC1570c) {
        return flatMap(nVar, interfaceC1570c, false, bufferSize(), bufferSize());
    }

    public final <U, R> l flatMap(hh.n nVar, InterfaceC1570c interfaceC1570c, boolean z4) {
        return flatMap(nVar, interfaceC1570c, z4, bufferSize(), bufferSize());
    }

    public final l window(long j, TimeUnit timeUnit, v vVar) {
        return window(j, timeUnit, vVar, Long.MAX_VALUE, false);
    }

    public final <R> l withLatestFrom(Iterable<? extends p> iterable, hh.n nVar) {
        jh.e.b(iterable, numX49.tnTj78("bt8uH"));
        jh.e.b(nVar, numX49.tnTj78("bt8uO"));
        return new C2139x(this, iterable, nVar);
    }

    public static <T1, T2, T3, T4, R> l combineLatest(p pVar, p pVar2, p pVar3, p pVar4, InterfaceC1575h interfaceC1575h) {
        jh.e.b(pVar, numX49.tnTj78("bt8s"));
        jh.e.b(pVar2, numX49.tnTj78("bt85"));
        jh.e.b(pVar3, numX49.tnTj78("bt8J"));
        jh.e.b(pVar4, numX49.tnTj78("bt8I"));
        jh.e.b(null, numX49.tnTj78("bt8q"));
        throw null;
    }

    public final <U, R> l flatMap(hh.n nVar, InterfaceC1570c interfaceC1570c, boolean z4, int i) {
        return flatMap(nVar, interfaceC1570c, z4, i, bufferSize());
    }

    public final <R> l replay(hh.n nVar, int i, v vVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8kb"));
        jh.e.b(vVar, numX49.tnTj78("bt8k2"));
        jh.e.c(i, numX49.tnTj78("bt8kL"));
        return new C2112q(2, new CallableC1879f(this, i, 1), new C2038a(4, nVar, vVar, false));
    }

    public final l window(long j, TimeUnit timeUnit, v vVar, long j6) {
        return window(j, timeUnit, vVar, j6, false);
    }

    public static <T1, T2, T3, R> l zip(p pVar, p pVar2, p pVar3, InterfaceC1574g interfaceC1574g) {
        jh.e.b(pVar, numX49.tnTj78("bt8Ld"));
        jh.e.b(pVar2, numX49.tnTj78("bt8Li"));
        jh.e.b(pVar3, numX49.tnTj78("bt8LE"));
        jh.e.b(null, numX49.tnTj78("bt8LF"));
        throw null;
    }

    public final <U, R> l flatMap(hh.n nVar, InterfaceC1570c interfaceC1570c, boolean z4, int i, int i4) {
        jh.e.b(nVar, numX49.tnTj78("bt8Zb"));
        jh.e.b(interfaceC1570c, numX49.tnTj78("bt8Z2"));
        return flatMap(new C2038a(3, interfaceC1570c, nVar, false), z4, i, i4);
    }

    public final l window(long j, TimeUnit timeUnit, v vVar, long j6, boolean z4) {
        return window(j, timeUnit, vVar, j6, z4, bufferSize());
    }

    public final l buffer(long j, TimeUnit timeUnit, v vVar) {
        return buffer(j, timeUnit, vVar, Integer.MAX_VALUE, EnumC2350a.f20496a, false);
    }

    public final l window(long j, TimeUnit timeUnit, v vVar, long j6, boolean z4, int i) {
        jh.e.c(i, numX49.tnTj78("bt8B1"));
        jh.e.b(vVar, numX49.tnTj78("bt8Bn"));
        jh.e.b(timeUnit, numX49.tnTj78("bt8Bx"));
        jh.e.d(j6, numX49.tnTj78("bt8Bs"));
        return new n3(this, j, j, timeUnit, vVar, j6, i, z4);
    }

    public final <TOpening, TClosing> l buffer(p pVar, hh.n nVar) {
        return buffer(pVar, nVar, EnumC2350a.f20496a);
    }

    public final <TOpening, TClosing, U extends Collection<Object>> l buffer(p pVar, hh.n nVar, Callable<U> callable) {
        jh.e.b(pVar, numX49.tnTj78("bt8L5"));
        jh.e.b(nVar, numX49.tnTj78("bt8LJ"));
        jh.e.b(callable, numX49.tnTj78("bt8LI"));
        return new C2139x(this, pVar, nVar, callable, 0);
    }

    public static <T1, T2, T3, T4, T5, R> l combineLatest(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, hh.i iVar) {
        jh.e.b(pVar, numX49.tnTj78("bt80"));
        jh.e.b(pVar2, numX49.tnTj78("bt8g"));
        jh.e.b(pVar3, numX49.tnTj78("bt8f"));
        jh.e.b(pVar4, numX49.tnTj78("bt81"));
        jh.e.b(pVar5, numX49.tnTj78("bt8n"));
        jh.e.b(null, numX49.tnTj78("bt8x"));
        throw null;
    }

    public static <T> l just(T t5, T t10, T t11, T t12, T t13, T t14, T t15) {
        jh.e.b(t5, numX49.tnTj78("bt8bi"));
        jh.e.b(t10, numX49.tnTj78("bt8bE"));
        jh.e.b(t11, numX49.tnTj78("bt8bF"));
        jh.e.b(t12, numX49.tnTj78("bt8bH"));
        jh.e.b(t13, numX49.tnTj78("bt8bO"));
        jh.e.b(t14, numX49.tnTj78("bt8bQ"));
        jh.e.b(t15, numX49.tnTj78("bt8bt"));
        return fromArray(t5, t10, t11, t12, t13, t14, t15);
    }

    public static <T1, T2, T3, T4, R> l zip(p pVar, p pVar2, p pVar3, p pVar4, InterfaceC1575h interfaceC1575h) {
        jh.e.b(pVar, numX49.tnTj78("bt8LB"));
        jh.e.b(pVar2, numX49.tnTj78("bt8Lu"));
        jh.e.b(pVar3, numX49.tnTj78("bt8LV"));
        jh.e.b(pVar4, numX49.tnTj78("bt8LS"));
        jh.e.b(null, numX49.tnTj78("bt8Lj"));
        throw null;
    }

    public final <U, R> l flatMap(hh.n nVar, InterfaceC1570c interfaceC1570c, int i) {
        return flatMap(nVar, interfaceC1570c, false, i, bufferSize());
    }

    public final <R> l replay(hh.n nVar, long j, TimeUnit timeUnit, v vVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8kr"));
        jh.e.b(timeUnit, numX49.tnTj78("bt8kZ"));
        jh.e.b(vVar, numX49.tnTj78("bt8kk"));
        return new C2112q(2, new CallableC2074g1(this, j, timeUnit, vVar), nVar);
    }

    public final <B> l window(p pVar) {
        return window(pVar, bufferSize());
    }

    public final <B> l buffer(p pVar) {
        return buffer(pVar, (Callable) EnumC2350a.f20496a);
    }

    public final l takeLast(long j, TimeUnit timeUnit, v vVar) {
        return takeLast(j, timeUnit, vVar, false, bufferSize());
    }

    public final <B> l window(p pVar, int i) {
        jh.e.b(pVar, numX49.tnTj78("bt8B5"));
        jh.e.c(i, numX49.tnTj78("bt8BJ"));
        return new c3(this, pVar, i, 0);
    }

    public final <B> l buffer(p pVar, int i) {
        jh.e.c(i, numX49.tnTj78("bt8Ls"));
        return buffer(pVar, new CallableC1682a(i));
    }

    public final l takeLast(long j, TimeUnit timeUnit, v vVar, boolean z4) {
        return takeLast(j, timeUnit, vVar, z4, bufferSize());
    }

    public static <T1, T2, T3, T4, T5, R> l zip(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, hh.i iVar) {
        jh.e.b(pVar, numX49.tnTj78("bt8Lb"));
        jh.e.b(pVar2, numX49.tnTj78("bt8L2"));
        jh.e.b(pVar3, numX49.tnTj78("bt8LL"));
        jh.e.b(pVar4, numX49.tnTj78("bt8Lr"));
        jh.e.b(pVar5, numX49.tnTj78("bt8LZ"));
        jh.e.b(null, numX49.tnTj78("bt8Lk"));
        throw null;
    }

    public final l takeLast(long j, TimeUnit timeUnit, v vVar, boolean z4, int i) {
        return takeLast(Long.MAX_VALUE, j, timeUnit, vVar, z4, i);
    }

    public static <T1, T2, T3, T4, T5, T6, R> l combineLatest(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, hh.j jVar) {
        jh.e.b(pVar, numX49.tnTj78("bt8v"));
        jh.e.b(pVar2, numX49.tnTj78("bt87"));
        jh.e.b(pVar3, numX49.tnTj78("bt8A"));
        jh.e.b(pVar4, numX49.tnTj78("bt8Y"));
        jh.e.b(pVar5, numX49.tnTj78("bt8T"));
        jh.e.b(pVar6, numX49.tnTj78("bt8R"));
        jh.e.b(null, numX49.tnTj78("bt8p"));
        throw null;
    }

    public final <R> l replay(hh.n nVar, v vVar) {
        jh.e.b(nVar, numX49.tnTj78("bt8kB"));
        jh.e.b(vVar, numX49.tnTj78("bt8ku"));
        return new C2112q(2, new CallableC0192z(this, 8), new C2038a(4, nVar, vVar, false));
    }

    public final <U, V> l window(p pVar, hh.n nVar) {
        return window(pVar, nVar, bufferSize());
    }

    public final <B, U extends Collection<Object>> l buffer(p pVar, Callable<U> callable) {
        jh.e.b(pVar, numX49.tnTj78("bt8Lq"));
        jh.e.b(callable, numX49.tnTj78("bt8Lz"));
        return new C2044A(this, pVar, callable, 1, false);
    }

    public final <U, V> l window(p pVar, hh.n nVar, int i) {
        jh.e.b(pVar, numX49.tnTj78("bt8BI"));
        jh.e.b(nVar, numX49.tnTj78("bt8Bq"));
        jh.e.c(i, numX49.tnTj78("bt8Bz"));
        return new g3(this, pVar, nVar, i);
    }

    public static <T> l just(T t5, T t10, T t11, T t12, T t13, T t14, T t15, T t16) {
        jh.e.b(t5, numX49.tnTj78("bt8bU"));
        jh.e.b(t10, numX49.tnTj78("bt8be"));
        jh.e.b(t11, numX49.tnTj78("bt8b8"));
        jh.e.b(t12, numX49.tnTj78("bt8bC"));
        jh.e.b(t13, numX49.tnTj78("bt8b4"));
        jh.e.b(t14, numX49.tnTj78("bt8bo"));
        jh.e.b(t15, numX49.tnTj78("bt8bK"));
        jh.e.b(t16, numX49.tnTj78("bt8bw"));
        return fromArray(t5, t10, t11, t12, t13, t14, t15, t16);
    }

    public final <B> l buffer(Callable<? extends p> callable) {
        return buffer(callable, EnumC2350a.f20496a);
    }

    public static <T1, T2, T3, T4, T5, T6, R> l zip(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, hh.j jVar) {
        jh.e.b(pVar, numX49.tnTj78("bt82I"));
        jh.e.b(pVar2, numX49.tnTj78("bt82q"));
        jh.e.b(pVar3, numX49.tnTj78("bt82z"));
        jh.e.b(pVar4, numX49.tnTj78("bt82l"));
        jh.e.b(pVar5, numX49.tnTj78("bt82W"));
        jh.e.b(pVar6, numX49.tnTj78("bt8L9"));
        jh.e.b(null, numX49.tnTj78("bt8LP"));
        throw null;
    }

    public final <B, U extends Collection<Object>> l buffer(Callable<? extends p> callable, Callable<U> callable2) {
        jh.e.b(callable, numX49.tnTj78("bt8Ll"));
        jh.e.b(callable2, numX49.tnTj78("bt8LW"));
        return new C2044A(this, callable, callable2, 0);
    }

    public final AbstractC2439a replay(int i) {
        jh.e.c(i, numX49.tnTj78("bt8kV"));
        if (i == Integer.MAX_VALUE) {
            return C2063d2.e(this, C2063d2.e);
        }
        return C2063d2.e(this, new S(i));
    }

    public final <B> l window(Callable<? extends p> callable) {
        return window(callable, bufferSize());
    }

    public final <B> l window(Callable<? extends p> callable, int i) {
        jh.e.b(callable, numX49.tnTj78("bt8Bl"));
        jh.e.c(i, numX49.tnTj78("bt8BW"));
        return new c3(this, callable, i, 1);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> l combineLatest(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, hh.k kVar) {
        jh.e.b(pVar, numX49.tnTj78("bt8M"));
        jh.e.b(pVar2, numX49.tnTj78("bt8N"));
        jh.e.b(pVar3, numX49.tnTj78("bt86"));
        jh.e.b(pVar4, numX49.tnTj78("bt8a"));
        jh.e.b(pVar5, numX49.tnTj78("bt8X"));
        jh.e.b(pVar6, numX49.tnTj78("bt8G"));
        jh.e.b(pVar7, numX49.tnTj78("bt83"));
        jh.e.b(null, numX49.tnTj78("bt8y"));
        throw null;
    }

    public final AbstractC2439a replay(int i, long j, TimeUnit timeUnit, v vVar) {
        jh.e.c(i, numX49.tnTj78("bt8kS"));
        jh.e.b(timeUnit, numX49.tnTj78("bt8kj"));
        jh.e.b(vVar, numX49.tnTj78("bt8kd"));
        return C2063d2.e(this, new Z1(i, j, timeUnit, vVar));
    }

    public static <T> l just(T t5, T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17) {
        jh.e.b(t5, numX49.tnTj78("bt8bc"));
        jh.e.b(t10, numX49.tnTj78("bt8bm"));
        jh.e.b(t11, numX49.tnTj78("bt8bD"));
        jh.e.b(t12, numX49.tnTj78("bt8bh"));
        jh.e.b(t13, numX49.tnTj78("bt8bM"));
        jh.e.b(t14, numX49.tnTj78("bt8bN"));
        jh.e.b(t15, numX49.tnTj78("bt8b6"));
        jh.e.b(t16, numX49.tnTj78("bt8ba"));
        jh.e.b(t17, numX49.tnTj78("bt8bX"));
        return fromArray(t5, t10, t11, t12, t13, t14, t15, t16, t17);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> l zip(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, hh.k kVar) {
        jh.e.b(pVar, numX49.tnTj78("bt82g"));
        jh.e.b(pVar2, numX49.tnTj78("bt82f"));
        jh.e.b(pVar3, numX49.tnTj78("bt821"));
        jh.e.b(pVar4, numX49.tnTj78("bt82n"));
        jh.e.b(pVar5, numX49.tnTj78("bt82x"));
        jh.e.b(pVar6, numX49.tnTj78("bt82s"));
        jh.e.b(pVar7, numX49.tnTj78("bt825"));
        jh.e.b(null, numX49.tnTj78("bt82J"));
        throw null;
    }

    public final AbstractC2439a replay(int i, v vVar) {
        jh.e.c(i, numX49.tnTj78("bt8ki"));
        AbstractC2439a abstractC2439aReplay = replay(i);
        return new V1(abstractC2439aReplay, abstractC2439aReplay.observeOn(vVar));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> l combineLatest(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, p pVar8, hh.l lVar) {
        jh.e.b(pVar, numX49.tnTj78("bt8C"));
        jh.e.b(pVar2, numX49.tnTj78("bt84"));
        jh.e.b(pVar3, numX49.tnTj78("bt8o"));
        jh.e.b(pVar4, numX49.tnTj78("bt8K"));
        jh.e.b(pVar5, numX49.tnTj78("bt8w"));
        jh.e.b(pVar6, numX49.tnTj78("bt8c"));
        jh.e.b(pVar7, numX49.tnTj78("bt8m"));
        jh.e.b(pVar8, numX49.tnTj78("bt8D"));
        jh.e.b(null, numX49.tnTj78("bt8h"));
        throw null;
    }

    public final AbstractC2439a replay(long j, TimeUnit timeUnit, v vVar) {
        jh.e.b(timeUnit, numX49.tnTj78("bt8kE"));
        jh.e.b(vVar, numX49.tnTj78("bt8kF"));
        return C2063d2.e(this, new Z1(Integer.MAX_VALUE, j, timeUnit, vVar));
    }

    public final AbstractC2439a replay(v vVar) {
        jh.e.b(vVar, numX49.tnTj78("bt8kH"));
        AbstractC2439a abstractC2439aReplay = replay();
        return new V1(abstractC2439aReplay, abstractC2439aReplay.observeOn(vVar));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> l zip(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, p pVar8, hh.l lVar) {
        jh.e.b(pVar, numX49.tnTj78("bt82y"));
        jh.e.b(pVar2, numX49.tnTj78("bt82v"));
        jh.e.b(pVar3, numX49.tnTj78("bt827"));
        jh.e.b(pVar4, numX49.tnTj78("bt82A"));
        jh.e.b(pVar5, numX49.tnTj78("bt82Y"));
        jh.e.b(pVar6, numX49.tnTj78("bt82T"));
        jh.e.b(pVar7, numX49.tnTj78("bt82R"));
        jh.e.b(pVar8, numX49.tnTj78("bt82p"));
        jh.e.b(null, numX49.tnTj78("bt820"));
        throw null;
    }

    public static <T> l just(T t5, T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18) {
        jh.e.b(t5, numX49.tnTj78("bt8bG"));
        jh.e.b(t10, numX49.tnTj78("bt8b3"));
        jh.e.b(t11, numX49.tnTj78("bt8by"));
        jh.e.b(t12, numX49.tnTj78("bt8bv"));
        jh.e.b(t13, numX49.tnTj78("bt8b7"));
        jh.e.b(t14, numX49.tnTj78("bt8bA"));
        jh.e.b(t15, numX49.tnTj78("bt8bY"));
        jh.e.b(t16, numX49.tnTj78("bt8bT"));
        jh.e.b(t17, numX49.tnTj78("bt8bR"));
        jh.e.b(t18, numX49.tnTj78("bt8bp"));
        return fromArray(t5, t10, t11, t12, t13, t14, t15, t16, t17, t18);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> l combineLatest(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, p pVar8, p pVar9, hh.m mVar) {
        jh.e.b(pVar, numX49.tnTj78("bt8i"));
        jh.e.b(pVar2, numX49.tnTj78("bt8E"));
        jh.e.b(pVar3, numX49.tnTj78("bt8F"));
        jh.e.b(pVar4, numX49.tnTj78("bt8H"));
        jh.e.b(pVar5, numX49.tnTj78("bt8O"));
        jh.e.b(pVar6, numX49.tnTj78("bt8Q"));
        jh.e.b(pVar7, numX49.tnTj78("bt8t"));
        jh.e.b(pVar8, numX49.tnTj78("bt8U"));
        jh.e.b(pVar9, numX49.tnTj78("bt8e"));
        jh.e.b(null, numX49.tnTj78("bt88"));
        throw null;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> l zip(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, p pVar8, p pVar9, hh.m mVar) {
        jh.e.b(pVar, numX49.tnTj78("bt82m"));
        jh.e.b(pVar2, numX49.tnTj78("bt82D"));
        jh.e.b(pVar3, numX49.tnTj78("bt82h"));
        jh.e.b(pVar4, numX49.tnTj78("bt82M"));
        jh.e.b(pVar5, numX49.tnTj78("bt82N"));
        jh.e.b(pVar6, numX49.tnTj78("bt826"));
        jh.e.b(pVar7, numX49.tnTj78("bt82a"));
        jh.e.b(pVar8, numX49.tnTj78("bt82X"));
        jh.e.b(pVar9, numX49.tnTj78("bt82G"));
        jh.e.b(null, numX49.tnTj78("bt823"));
        throw null;
    }
}
