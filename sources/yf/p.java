package yf;

import M8.T2;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends d implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Af.e f21276b;
    public final Af.d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21277d;

    public p(Af.d dVar) {
        D(j.f21177F0, 0);
        if (dVar == null) {
            try {
                dVar = new Af.d(new U1.b());
            } catch (IOException e) {
                Log.e("PdfBox-Android", "Unexpected exception occurred creating main memory scratch file instance: " + e.getMessage());
                dVar = null;
            }
        }
        this.c = dVar;
    }

    public final void I() throws IOException {
        Af.e eVar = this.f21276b;
        if (eVar != null && eVar.f274b == null) {
            throw new IOException("COSStream has been closed and cannot be read. Perhaps its enclosing PDDocument has been closed?");
        }
    }

    public final h J() throws IOException {
        ArrayList arrayList;
        I();
        if (this.f21277d) {
            throw new IllegalStateException("Cannot read while there is an open stream writer");
        }
        Af.e eVar = this.f21276b;
        Af.d dVar = this.c;
        if (eVar == null) {
            dVar.getClass();
            this.f21276b = new Af.e(dVar);
        }
        InputStream bVar = new Af.b(this.f21276b);
        b bVarQ = q(j.m0);
        if (bVarQ instanceof j) {
            arrayList = new ArrayList(1);
            arrayList.add(zf.f.f21418b.a((j) bVarQ));
        } else if (bVarQ instanceof C2531a) {
            C2531a c2531a = (C2531a) bVarQ;
            arrayList = new ArrayList(c2531a.f21151a.size());
            for (int i = 0; i < c2531a.f21151a.size(); i++) {
                b bVarG = c2531a.g(i);
                if (!(bVarG instanceof j)) {
                    throw new IOException("Forbidden type in filter array: ".concat(bVarG == null ? "null" : bVarG.getClass().getName()));
                }
                arrayList.add(zf.f.f21418b.a((j) bVarG));
            }
        } else {
            arrayList = new ArrayList();
        }
        int i4 = h.f21161b;
        if (arrayList.isEmpty()) {
            return new h(bVar, Collections.EMPTY_LIST);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (arrayList.size() > 1 && new HashSet(arrayList).size() != arrayList.size()) {
            throw new IOException("Duplicate");
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            if (dVar != null) {
                Af.e eVar2 = new Af.e(dVar);
                arrayList2.add(((zf.b) arrayList.get(i6)).b(bVar, new Af.c(eVar2), this, i6));
                bVar = new g(eVar2, eVar2);
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                arrayList2.add(((zf.b) arrayList.get(i6)).b(bVar, byteArrayOutputStream, this, i6));
                bVar = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            }
        }
        return new h(bVar, arrayList2);
    }

    public final Af.b K() {
        I();
        if (this.f21277d) {
            throw new IllegalStateException("Cannot read while there is an open stream writer");
        }
        if (this.f21276b == null) {
            Af.d dVar = this.c;
            dVar.getClass();
            this.f21276b = new Af.e(dVar);
        }
        return new Af.b(this.f21276b);
    }

    public final o L() throws IOException {
        I();
        if (this.f21277d) {
            throw new IllegalStateException("Cannot have more than one open stream writer.");
        }
        T2.d(this.f21276b);
        Af.d dVar = this.c;
        dVar.getClass();
        this.f21276b = new Af.e(dVar);
        Af.c cVar = new Af.c(this.f21276b);
        this.f21277d = true;
        return new o(this, cVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Af.e eVar = this.f21276b;
        if (eVar != null) {
            eVar.close();
        }
    }
}
