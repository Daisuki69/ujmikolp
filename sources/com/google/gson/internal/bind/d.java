package com.google.gson.internal.bind;

import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.stream.MalformedJsonException;
import d4.AbstractC1331a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends j3.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f9938t = new c();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Object f9939u = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object[] f9940p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9941q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String[] f9942r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f9943s;

    public d(o oVar) {
        super(f9938t);
        this.f9940p = new Object[32];
        this.f9941q = 0;
        this.f9942r = new String[32];
        this.f9943s = new int[32];
        Z(oVar);
    }

    @Override // j3.a
    public final double B() throws MalformedJsonException {
        int iPeek = peek();
        if (iPeek != 7 && iPeek != 6) {
            throw new IllegalStateException("Expected " + AbstractC1331a.x(7) + " but was " + AbstractC1331a.x(iPeek) + V());
        }
        double d10 = ((r) X()).d();
        if (this.f17701o != 1 && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d10);
        }
        Y();
        int i = this.f9941q;
        if (i > 0) {
            int[] iArr = this.f9943s;
            int i4 = i - 1;
            iArr[i4] = iArr[i4] + 1;
        }
        return d10;
    }

    @Override // j3.a
    public final int C() throws MalformedJsonException {
        int iPeek = peek();
        if (iPeek != 7 && iPeek != 6) {
            throw new IllegalStateException("Expected " + AbstractC1331a.x(7) + " but was " + AbstractC1331a.x(iPeek) + V());
        }
        int iE = ((r) X()).e();
        Y();
        int i = this.f9941q;
        if (i > 0) {
            int[] iArr = this.f9943s;
            int i4 = i - 1;
            iArr[i4] = iArr[i4] + 1;
        }
        return iE;
    }

    @Override // j3.a
    public final long D() throws MalformedJsonException {
        int iPeek = peek();
        if (iPeek != 7 && iPeek != 6) {
            throw new IllegalStateException("Expected " + AbstractC1331a.x(7) + " but was " + AbstractC1331a.x(iPeek) + V());
        }
        long jI = ((r) X()).i();
        Y();
        int i = this.f9941q;
        if (i > 0) {
            int[] iArr = this.f9943s;
            int i4 = i - 1;
            iArr[i4] = iArr[i4] + 1;
        }
        return jI;
    }

    @Override // j3.a
    public final String E() {
        return W(false);
    }

    @Override // j3.a
    public final void G() {
        T(9);
        Y();
        int i = this.f9941q;
        if (i > 0) {
            int[] iArr = this.f9943s;
            int i4 = i - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    @Override // j3.a
    public final String I() throws MalformedJsonException {
        int iPeek = peek();
        if (iPeek != 6 && iPeek != 7) {
            throw new IllegalStateException("Expected " + AbstractC1331a.x(6) + " but was " + AbstractC1331a.x(iPeek) + V());
        }
        String strJ = ((r) Y()).j();
        int i = this.f9941q;
        if (i > 0) {
            int[] iArr = this.f9943s;
            int i4 = i - 1;
            iArr[i4] = iArr[i4] + 1;
        }
        return strJ;
    }

    @Override // j3.a
    public final void Q() {
        int iC = AbstractC2217b.c(peek());
        if (iC == 1) {
            i();
            return;
        }
        if (iC != 9) {
            if (iC == 3) {
                k();
                return;
            }
            if (iC == 4) {
                W(true);
                return;
            }
            Y();
            int i = this.f9941q;
            if (i > 0) {
                int[] iArr = this.f9943s;
                int i4 = i - 1;
                iArr[i4] = iArr[i4] + 1;
            }
        }
    }

    public final void T(int i) {
        if (peek() == i) {
            return;
        }
        throw new IllegalStateException("Expected " + AbstractC1331a.x(i) + " but was " + AbstractC1331a.x(peek()) + V());
    }

    public final String U(boolean z4) {
        StringBuilder sb2 = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i4 = this.f9941q;
            if (i >= i4) {
                return sb2.toString();
            }
            Object[] objArr = this.f9940p;
            Object obj = objArr[i];
            if (obj instanceof l) {
                i++;
                if (i < i4 && (objArr[i] instanceof Iterator)) {
                    int i6 = this.f9943s[i];
                    if (z4 && i6 > 0 && (i == i4 - 1 || i == i4 - 2)) {
                        i6--;
                    }
                    sb2.append('[');
                    sb2.append(i6);
                    sb2.append(']');
                }
            } else if ((obj instanceof q) && (i = i + 1) < i4 && (objArr[i] instanceof Iterator)) {
                sb2.append('.');
                String str = this.f9942r[i];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i++;
        }
    }

    public final String V() {
        return " at path " + U(false);
    }

    public final String W(boolean z4) {
        T(5);
        Map.Entry entry = (Map.Entry) ((Iterator) X()).next();
        String str = (String) entry.getKey();
        this.f9942r[this.f9941q - 1] = z4 ? "<skipped>" : str;
        Z(entry.getValue());
        return str;
    }

    public final Object X() {
        return this.f9940p[this.f9941q - 1];
    }

    public final Object Y() {
        Object[] objArr = this.f9940p;
        int i = this.f9941q - 1;
        this.f9941q = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void Z(Object obj) {
        int i = this.f9941q;
        Object[] objArr = this.f9940p;
        if (i == objArr.length) {
            int i4 = i * 2;
            this.f9940p = Arrays.copyOf(objArr, i4);
            this.f9943s = Arrays.copyOf(this.f9943s, i4);
            this.f9942r = (String[]) Arrays.copyOf(this.f9942r, i4);
        }
        Object[] objArr2 = this.f9940p;
        int i6 = this.f9941q;
        this.f9941q = i6 + 1;
        objArr2[i6] = obj;
    }

    @Override // j3.a
    public final void b() {
        T(1);
        Z(((l) X()).f10032a.iterator());
        this.f9943s[this.f9941q - 1] = 0;
    }

    @Override // j3.a
    public final void c() {
        T(3);
        Z(((com.google.gson.internal.i) ((q) X()).f10034a.entrySet()).iterator());
    }

    @Override // j3.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9940p = new Object[]{f9939u};
        this.f9941q = 1;
    }

    @Override // j3.a
    public final String getPath() {
        return U(false);
    }

    @Override // j3.a
    public final void i() {
        T(2);
        Y();
        Y();
        int i = this.f9941q;
        if (i > 0) {
            int[] iArr = this.f9943s;
            int i4 = i - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    @Override // j3.a
    public final void k() {
        T(4);
        this.f9942r[this.f9941q - 1] = null;
        Y();
        Y();
        int i = this.f9941q;
        if (i > 0) {
            int[] iArr = this.f9943s;
            int i4 = i - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    @Override // j3.a
    public final int peek() throws MalformedJsonException {
        if (this.f9941q == 0) {
            return 10;
        }
        Object objX = X();
        if (objX instanceof Iterator) {
            boolean z4 = this.f9940p[this.f9941q - 2] instanceof q;
            Iterator it = (Iterator) objX;
            if (!it.hasNext()) {
                return z4 ? 4 : 2;
            }
            if (z4) {
                return 5;
            }
            Z(it.next());
            return peek();
        }
        if (objX instanceof q) {
            return 3;
        }
        if (objX instanceof l) {
            return 1;
        }
        if (objX instanceof r) {
            Serializable serializable = ((r) objX).f10035a;
            if (serializable instanceof String) {
                return 6;
            }
            if (serializable instanceof Boolean) {
                return 8;
            }
            if (serializable instanceof Number) {
                return 7;
            }
            throw new AssertionError();
        }
        if (objX instanceof p) {
            return 9;
        }
        if (objX == f9939u) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + objX.getClass().getName() + " is not supported");
    }

    @Override // j3.a
    public final String r() {
        return U(true);
    }

    @Override // j3.a
    public final boolean t() throws MalformedJsonException {
        int iPeek = peek();
        return (iPeek == 4 || iPeek == 2 || iPeek == 10) ? false : true;
    }

    @Override // j3.a
    public final String toString() {
        return d.class.getSimpleName() + V();
    }

    @Override // j3.a
    public final boolean z() {
        T(8);
        boolean zC = ((r) Y()).c();
        int i = this.f9941q;
        if (i > 0) {
            int[] iArr = this.f9943s;
            int i4 = i - 1;
            iArr[i4] = iArr[i4] + 1;
        }
        return zC;
    }
}
