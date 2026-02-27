package Cf;

import Af.d;
import M8.T2;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import yf.e;
import yf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Af.a f762b;
    public final HashSet c;

    static {
        Hf.c cVar = Hf.c.f2169b;
        cVar.getClass();
        Hf.a aVar = cVar.f2170a;
        float[] fArr = aVar.f2167a;
        if (aVar.f2168b == null) {
            fArr.clone();
        } else {
            Arrays.copyOf(fArr, 3);
        }
        try {
            l.g("0");
            l.g(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        } catch (IOException unused) {
        }
    }

    public a(e eVar, Af.a aVar) {
        new HashSet();
        this.c = new HashSet();
        new HashMap();
        new HashMap();
        new HashMap();
        new HashMap();
        new HashMap();
        new HashMap();
        new HashMap();
        this.f761a = eVar;
        this.f762b = aVar;
    }

    public static a b(byte[] bArr) throws IOException {
        d dVar = new d(new U1.b());
        Af.a aVar = new Af.a();
        aVar.f262a = 1024;
        aVar.f263b = null;
        ArrayList arrayList = new ArrayList(1);
        aVar.f263b = arrayList;
        int length = bArr.length;
        aVar.f262a = length;
        aVar.c = bArr;
        arrayList.add(bArr);
        aVar.f264d = 0L;
        aVar.e = 0;
        aVar.f = length;
        aVar.f265g = 0;
        aVar.h = 0;
        Bf.e eVar = new Bf.e(aVar, dVar);
        try {
            if (!eVar.J("%PDF-", "1.4") && !eVar.J("%FDF-", "1.0")) {
                throw new IOException("Error: Header doesn't contain versioninfo");
            }
            if (!eVar.f448k) {
                eVar.C();
            }
            e eVar2 = eVar.c;
            if (eVar2 == null) {
                throw new IOException("You must parse the document first before calling getDocument()");
            }
            if (eVar2 == null) {
                throw new IOException("You must parse the document first before calling getAccessPermission()");
            }
            a aVar2 = new a(eVar2, eVar.f);
            if (eVar.c != null) {
                return aVar2;
            }
            throw new IOException("You must parse the document first before calling getEncryption()");
        } catch (Throwable th2) {
            e eVar3 = eVar.c;
            if (eVar3 != null) {
                T2.d(eVar3);
                eVar.c = null;
            }
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        e eVar = this.f761a;
        if (eVar.f) {
            return;
        }
        IOException iOExceptionC = T2.c(eVar, "COSDocument", null);
        Af.a aVar = this.f762b;
        if (aVar != null) {
            iOExceptionC = T2.c(aVar, "RandomAccessRead pdfSource", iOExceptionC);
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            iOExceptionC = T2.c(null, "TrueTypeFont", iOExceptionC);
        }
        if (iOExceptionC != null) {
            throw iOExceptionC;
        }
    }
}
