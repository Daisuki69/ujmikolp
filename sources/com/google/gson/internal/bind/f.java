package com.google.gson.internal.bind;

import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends j3.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f9944r = new e();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final r f9945s = new r("closed");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f9946o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f9947p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public o f9948q;

    public f() {
        super(f9944r);
        this.f9946o = new ArrayList();
        this.f9948q = p.f10033a;
    }

    @Override // j3.b
    public final void B(long j) {
        J(new r(Long.valueOf(j)));
    }

    @Override // j3.b
    public final void C(Boolean bool) {
        if (bool == null) {
            J(p.f10033a);
        } else {
            J(new r(bool));
        }
    }

    @Override // j3.b
    public final void D(Number number) {
        if (number == null) {
            J(p.f10033a);
            return;
        }
        if (this.h != 1) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        J(new r(number));
    }

    @Override // j3.b
    public final void E(String str) {
        if (str == null) {
            J(p.f10033a);
        } else {
            J(new r(str));
        }
    }

    @Override // j3.b
    public final void F(boolean z4) {
        J(new r(Boolean.valueOf(z4)));
    }

    public final o H() {
        ArrayList arrayList = this.f9946o;
        if (arrayList.isEmpty()) {
            return this.f9948q;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final o I() {
        return (o) androidx.camera.core.impl.a.b(1, this.f9946o);
    }

    public final void J(o oVar) {
        if (this.f9947p != null) {
            if (!(oVar instanceof p) || this.f17708k) {
                ((q) I()).k(this.f9947p, oVar);
            }
            this.f9947p = null;
            return;
        }
        if (this.f9946o.isEmpty()) {
            this.f9948q = oVar;
            return;
        }
        o oVarI = I();
        if (!(oVarI instanceof l)) {
            throw new IllegalStateException();
        }
        ((l) oVarI).f10032a.add(oVar);
    }

    @Override // j3.b
    public final void c() {
        l lVar = new l();
        J(lVar);
        this.f9946o.add(lVar);
    }

    @Override // j3.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f9946o;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f9945s);
    }

    @Override // j3.b
    public final void f() {
        q qVar = new q();
        J(qVar);
        this.f9946o.add(qVar);
    }

    @Override // j3.b, java.io.Flushable
    public final void flush() {
    }

    @Override // j3.b
    public final void i() {
        ArrayList arrayList = this.f9946o;
        if (arrayList.isEmpty() || this.f9947p != null) {
            throw new IllegalStateException();
        }
        if (!(I() instanceof l)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // j3.b
    public final void k() {
        ArrayList arrayList = this.f9946o;
        if (arrayList.isEmpty() || this.f9947p != null) {
            throw new IllegalStateException();
        }
        if (!(I() instanceof q)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // j3.b
    public final void m(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f9946o.isEmpty() || this.f9947p != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(I() instanceof q)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f9947p = str;
    }

    @Override // j3.b
    public final j3.b r() {
        J(p.f10033a);
        return this;
    }

    @Override // j3.b
    public final void z(double d10) {
        if (this.h == 1 || (!Double.isNaN(d10) && !Double.isInfinite(d10))) {
            J(new r(Double.valueOf(d10)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
        }
    }
}
