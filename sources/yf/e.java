package yf;

import M8.T2;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends b implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f21157d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Af.d f21158g;
    public long h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f21155a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f21156b = new HashMap();
    public final ArrayList c = new ArrayList();
    public final boolean e = true;
    public boolean f = false;

    public e(Af.d dVar) {
        this.f21158g = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f) {
            return;
        }
        Iterator it = new ArrayList(this.f21155a.values()).iterator();
        IOException iOExceptionC = null;
        while (it.hasNext()) {
            b bVar = ((m) it.next()).f21270a;
            if (bVar instanceof p) {
                iOExceptionC = T2.c((p) bVar, "COSStream", iOExceptionC);
            }
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            iOExceptionC = T2.c((p) it2.next(), "COSStream", iOExceptionC);
        }
        Af.d dVar = this.f21158g;
        if (dVar != null) {
            iOExceptionC = T2.c(dVar, "ScratchFile", iOExceptionC);
        }
        this.f = true;
        if (iOExceptionC != null) {
            throw iOExceptionC;
        }
    }

    public final m f(n nVar) {
        HashMap map = this.f21155a;
        m mVar = nVar != null ? (m) map.get(nVar) : null;
        if (mVar == null) {
            mVar = new m(null);
            if (nVar != null) {
                mVar.f21271b = nVar.f21273a;
                mVar.c = nVar.f21274b;
                map.put(nVar, mVar);
            }
        }
        return mVar;
    }

    public final void finalize() throws IOException {
        if (this.f) {
            return;
        }
        if (this.e) {
            Log.w("PdfBox-Android", "Warning: You did not close a PDF Document");
        }
        close();
    }
}
