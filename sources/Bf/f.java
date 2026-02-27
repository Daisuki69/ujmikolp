package Bf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import yf.C2531a;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f459b;
    public int c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f460d;
    public long e;
    public final long f;

    public f(C2531a c2531a) throws IOException {
        this.f460d = 0L;
        this.e = 0L;
        this.f = 0L;
        ArrayList arrayList = c2531a.f21151a;
        int size = arrayList.size() / 2;
        this.f458a = new long[size];
        this.f459b = new long[size];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            yf.b bVar = (yf.b) it.next();
            if (!(bVar instanceof yf.i)) {
                throw new IOException("Xref stream must have integer in /Index array");
            }
            long j = ((yf.i) bVar).f21165a;
            if (!it.hasNext()) {
                break;
            }
            yf.b bVar2 = (yf.b) it.next();
            if (!(bVar2 instanceof yf.i)) {
                throw new IOException("Xref stream must have integer in /Index array");
            }
            long j6 = ((yf.i) bVar2).f21165a;
            this.f458a[i] = j;
            this.f459b[i] = j + j6;
            i++;
        }
        this.e = this.f458a[0];
        long[] jArr = this.f459b;
        this.f460d = jArr[0];
        this.f = jArr[i - 1];
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Long next() {
        long j = this.e;
        if (j >= this.f) {
            throw new NoSuchElementException();
        }
        if (j < this.f460d) {
            this.e = 1 + j;
            return Long.valueOf(j);
        }
        int i = this.c + 1;
        this.c = i;
        long j6 = this.f458a[i];
        this.e = j6;
        this.f460d = this.f459b[i];
        this.e = 1 + j6;
        return Long.valueOf(j6);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
