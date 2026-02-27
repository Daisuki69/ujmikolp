package oi;

import androidx.core.util.Pair;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: oi.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1990h implements qi.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f18902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qi.g f18903b;
    public final qi.g c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f18904d;

    public C1990h(Pair pair, Pair pair2) {
        qi.g gVar = (qi.g) pair.first;
        qi.f fVar = (qi.f) pair.second;
        qi.g gVar2 = (qi.g) pair2.first;
        qi.f fVar2 = (qi.f) pair2.second;
        this.f18902a = new AtomicBoolean(true);
        Objects.requireNonNull(gVar2);
        this.f18903b = gVar2;
        Objects.requireNonNull(gVar);
        this.c = gVar;
        HashSet hashSet = new HashSet();
        this.f18904d = hashSet;
        hashSet.add(fVar);
        hashSet.add(fVar2);
    }

    @Override // qi.f
    public final void a() {
        Iterator it = this.f18904d.iterator();
        while (it.hasNext()) {
            ((qi.f) it.next()).a();
        }
    }

    @Override // qi.f
    public final void b() {
        Iterator it = this.f18904d.iterator();
        while (it.hasNext()) {
            ((qi.f) it.next()).b();
        }
    }

    @Override // qi.f
    public final void flush() {
        Iterator it = this.f18904d.iterator();
        while (it.hasNext()) {
            ((qi.f) it.next()).flush();
        }
    }
}
