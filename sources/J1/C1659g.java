package j1;

import aj.InterfaceC0716a;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import c1.p;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import f1.EnumC1457c;
import i2.C1585a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import k1.InterfaceC1690a;
import l1.InterfaceC1797a;
import m1.AbstractC1844a;

/* JADX INFO: renamed from: j1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1659g implements InterfaceC1656d, k1.b, InterfaceC1655c, AutoCloseable {
    public static final Z0.c f = new Z0.c("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1661i f17663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1797a f17664b;
    public final InterfaceC1797a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1653a f17665d;
    public final InterfaceC0716a e;

    public C1659g(InterfaceC1797a interfaceC1797a, InterfaceC1797a interfaceC1797a2, C1653a c1653a, C1661i c1661i, InterfaceC0716a interfaceC0716a) {
        this.f17663a = c1661i;
        this.f17664b = interfaceC1797a;
        this.c = interfaceC1797a2;
        this.f17665d = c1653a;
        this.e = interfaceC0716a;
    }

    public static Long c(SQLiteDatabase sQLiteDatabase, p pVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        c1.i iVar = (c1.i) pVar;
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f9230a, String.valueOf(AbstractC1844a.a(iVar.c))));
        byte[] bArr = iVar.f9231b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String m(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((C1654b) it.next()).f17659a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object q(Cursor cursor, InterfaceC1657e interfaceC1657e) {
        try {
            return interfaceC1657e.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase b() {
        C1661i c1661i = this.f17663a;
        Objects.requireNonNull(c1661i);
        InterfaceC1797a interfaceC1797a = this.c;
        long jF = interfaceC1797a.f();
        while (true) {
            try {
                return c1661i.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC1797a.f() >= ((long) this.f17665d.c) + jF) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17663a.close();
    }

    public final Object f(InterfaceC1657e interfaceC1657e) {
        SQLiteDatabase sQLiteDatabaseB = b();
        sQLiteDatabaseB.beginTransaction();
        try {
            Object objApply = interfaceC1657e.apply(sQLiteDatabaseB);
            sQLiteDatabaseB.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseB.endTransaction();
        }
    }

    public final ArrayList g(SQLiteDatabase sQLiteDatabase, c1.i iVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long lC = c(sQLiteDatabase, iVar);
        if (lC == null) {
            return arrayList;
        }
        q(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lC.toString()}, null, null, null, String.valueOf(i)), new C1585a(2, this, arrayList, iVar));
        return arrayList;
    }

    public final void i(long j, EnumC1457c enumC1457c, String str) {
        f(new X2.g(str, enumC1457c, j));
    }

    public final Object k(InterfaceC1690a interfaceC1690a) {
        SQLiteDatabase sQLiteDatabaseB = b();
        InterfaceC1797a interfaceC1797a = this.c;
        long jF = interfaceC1797a.f();
        while (true) {
            try {
                sQLiteDatabaseB.beginTransaction();
                try {
                    Object objExecute = interfaceC1690a.execute();
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return objExecute;
                } finally {
                    sQLiteDatabaseB.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC1797a.f() >= ((long) this.f17665d.c) + jF) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
