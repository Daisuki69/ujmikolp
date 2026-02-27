package Xe;

import Kh.I;
import android.content.ContentValues;
import android.database.Cursor;
import java.io.Closeable;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import net.zetetic.database.sqlcipher.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteOpenHelper f6609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M2.b f6610b;
    public final ThreadLocal c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Wh.b f6611d;
    public final Wh.b e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Qd.a f6612g;
    public final eh.e h;

    public d(SQLiteOpenHelper sQLiteOpenHelper, I i, Wh.b bVar, Wh.b bVar2, eh.e eVar) {
        M2.b bVar3 = f.f6615b;
        this.c = new ThreadLocal();
        this.f = new a(this, 0);
        this.f6612g = new Qd.a(this, 15);
        System.loadLibrary("sqlcipher");
        this.f6609a = sQLiteOpenHelper;
        this.f6611d = bVar;
        this.e = bVar2;
        this.h = eVar;
        this.f6610b = bVar3;
    }

    public final int b(String str, String str2, String... strArr) {
        int iK = this.f6609a.getWritableDatabase().k(str, str2, strArr);
        if (iK > 0) {
            f(Collections.singleton(str));
        }
        return iK;
    }

    public final a c() {
        ThreadLocal threadLocal = this.c;
        c cVar = new c((c) threadLocal.get());
        threadLocal.set(cVar);
        this.f6609a.getWritableDatabase().g(cVar, true);
        return this.f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6609a.close();
    }

    public final void f(Set set) {
        c cVar = (c) this.c.get();
        if (cVar != null) {
            cVar.addAll(set);
        } else {
            this.e.onNext(set);
        }
    }

    public final long insert(String str, int i, ContentValues contentValues) {
        long jZ = this.f6609a.getWritableDatabase().z(str, i, contentValues);
        if (jZ != -1) {
            f(Collections.singleton(str));
        }
        return jZ;
    }

    public final Cursor query(String str) {
        long jNanoTime = System.nanoTime();
        Cursor cursorD = this.f6609a.getReadableDatabase().D(str);
        TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
        return cursorD;
    }
}
