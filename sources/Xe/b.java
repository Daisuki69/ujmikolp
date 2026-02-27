package Xe;

import android.database.Cursor;
import hh.n;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f6606b;

    public b(d dVar, M5.b bVar, String str) {
        this.f6606b = dVar;
        this.f6605a = str;
    }

    public final Cursor a() {
        d dVar = this.f6606b;
        if (dVar.c.get() != null) {
            throw new IllegalStateException("Cannot execute observable query in a transaction.");
        }
        System.nanoTime();
        Cursor cursorD = dVar.f6609a.getReadableDatabase().D(this.f6605a);
        dVar.getClass();
        return cursorD;
    }

    @Override // hh.n
    public final Object apply(Object obj) {
        return this;
    }

    public final String toString() {
        return this.f6605a;
    }
}
