package Mj;

import cj.C1127m;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f3432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3433b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f3434d;
    public boolean e;
    public g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f3435g;

    public g() {
        this.f3432a = new byte[8192];
        this.e = true;
        this.f3434d = null;
    }

    public final /* synthetic */ int a() {
        return this.f3432a.length - this.c;
    }

    public final /* synthetic */ int b() {
        return this.c - this.f3433b;
    }

    public final g c() {
        g gVar = this.f;
        g gVar2 = this.f3435g;
        if (gVar2 != null) {
            kotlin.jvm.internal.j.d(gVar2);
            gVar2.f = this.f;
        }
        g gVar3 = this.f;
        if (gVar3 != null) {
            kotlin.jvm.internal.j.d(gVar3);
            gVar3.f3435g = this.f3435g;
        }
        this.f = null;
        this.f3435g = null;
        return gVar;
    }

    public final void d(g segment) {
        kotlin.jvm.internal.j.g(segment, "segment");
        segment.f3435g = this;
        segment.f = this.f;
        g gVar = this.f;
        if (gVar != null) {
            gVar.f3435g = segment;
        }
        this.f = segment;
    }

    public final g e() {
        j fVar = this.f3434d;
        if (fVar == null) {
            g gVar = h.f3436a;
            fVar = new f();
            this.f3434d = fVar;
        }
        int i = this.f3433b;
        int i4 = this.c;
        f.c.incrementAndGet((f) fVar);
        Unit unit = Unit.f18162a;
        return new g(this.f3432a, i, i4, fVar);
    }

    public final void f(g sink, int i) {
        kotlin.jvm.internal.j.g(sink, "sink");
        if (!sink.e) {
            throw new IllegalStateException("only owner can write");
        }
        if (sink.c + i > 8192) {
            j jVar = sink.f3434d;
            if (jVar != null && ((f) jVar).f3431b > 0) {
                throw new IllegalArgumentException();
            }
            int i4 = sink.c;
            int i6 = sink.f3433b;
            if ((i4 + i) - i6 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f3432a;
            C1127m.d(0, i6, i4, bArr, bArr);
            sink.c -= sink.f3433b;
            sink.f3433b = 0;
        }
        int i10 = sink.c;
        int i11 = this.f3433b;
        C1127m.d(i10, i11, i11 + i, this.f3432a, sink.f3432a);
        sink.c += i;
        this.f3433b += i;
    }

    public g(byte[] bArr, int i, int i4, j jVar) {
        this.f3432a = bArr;
        this.f3433b = i;
        this.c = i4;
        this.f3434d = jVar;
        this.e = false;
    }
}
