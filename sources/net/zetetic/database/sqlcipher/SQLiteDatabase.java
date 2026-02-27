package net.zetetic.database.sqlcipher;

import We.s;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import android.os.Looper;
import android.text.TextUtils;
import android.util.EventLog;
import android.util.Log;
import android.util.Pair;
import androidx.media3.common.C;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.dynatrace.android.agent.Global;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import k.AbstractC1687a;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.DefaultDatabaseErrorHandler;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteDatabase extends SQLiteClosable implements SupportSQLiteDatabase {
    public static final WeakHashMap j = new WeakHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f18685k = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public final CursorFactory c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DatabaseErrorHandler f18687d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SQLiteDatabaseConfiguration f18688g;
    public SQLiteConnectionPool h;
    public boolean i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadLocal f18686b = new ThreadLocal<SQLiteSession>() { // from class: net.zetetic.database.sqlcipher.SQLiteDatabase.1
        @Override // java.lang.ThreadLocal
        public final SQLiteSession initialValue() {
            SQLiteConnectionPool sQLiteConnectionPool;
            SQLiteDatabase sQLiteDatabase = SQLiteDatabase.this;
            synchronized (sQLiteDatabase.e) {
                sQLiteDatabase.G();
                sQLiteConnectionPool = sQLiteDatabase.h;
            }
            return new SQLiteSession(sQLiteConnectionPool);
        }
    };
    public final Object e = new Object();
    public final CloseGuard f = new CloseGuard();

    public interface CursorFactory {
        Cursor a();
    }

    public interface CustomFunction {
        void callback();
    }

    public SQLiteDatabase(int i, String str, DatabaseErrorHandler databaseErrorHandler, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, byte[] bArr) {
        this.c = cursorFactory;
        this.f18687d = databaseErrorHandler == null ? new DefaultDatabaseErrorHandler() : databaseErrorHandler;
        this.f18688g = new SQLiteDatabaseConfiguration(str, i, bArr, sQLiteDatabaseHook);
    }

    public static SQLiteDatabase B(int i, String str, DatabaseErrorHandler databaseErrorHandler, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(i, str, databaseErrorHandler, cursorFactory, sQLiteDatabaseHook, bArr);
        try {
            try {
                sQLiteDatabase.C();
                return sQLiteDatabase;
            } catch (SQLiteDatabaseCorruptException unused) {
                synchronized (sQLiteDatabase.e) {
                    EventLog.writeEvent(75004, sQLiteDatabase.f18688g.f18696b);
                    sQLiteDatabase.f18687d.a(sQLiteDatabase);
                    sQLiteDatabase.C();
                    return sQLiteDatabase;
                }
            }
        } catch (SQLiteException e) {
            Log.e("SQLiteDatabase", "Failed to open database '" + sQLiteDatabase.t() + "'.", e);
            sQLiteDatabase.f();
            throw e;
        }
    }

    public static boolean m(File file) {
        boolean zDelete = file.delete() | new File(file.getPath() + "-journal").delete() | new File(file.getPath() + "-shm").delete() | new File(file.getPath() + "-wal").delete();
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            final String str = file.getName() + "-mj";
            File[] fileArrListFiles = parentFile.listFiles(new FileFilter() { // from class: net.zetetic.database.sqlcipher.SQLiteDatabase.4
                @Override // java.io.FileFilter
                public final boolean accept(File file2) {
                    return file2.getName().startsWith(str);
                }
            });
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    zDelete |= file2.delete();
                }
            }
        }
        return zDelete;
    }

    public static int w(boolean z4) {
        int i = z4 ? 1 : 2;
        Looper looperMyLooper = Looper.myLooper();
        return (looperMyLooper == null || looperMyLooper != Looper.getMainLooper()) ? i : i | 4;
    }

    public final void C() {
        synchronized (this.e) {
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f18688g;
            if (sQLiteDatabaseConfiguration == null) {
                throw new IllegalArgumentException("configuration must not be null.");
            }
            SQLiteConnectionPool sQLiteConnectionPool = new SQLiteConnectionPool(sQLiteDatabaseConfiguration);
            sQLiteConnectionPool.f18669k = sQLiteConnectionPool.m(sQLiteConnectionPool.f18667d, true);
            sQLiteConnectionPool.f = true;
            sQLiteConnectionPool.f18665a.a();
            this.h = sQLiteConnectionPool;
            this.f.a();
        }
        WeakHashMap weakHashMap = j;
        synchronized (weakHashMap) {
            weakHashMap.put(this, null);
        }
    }

    public final Cursor D(String str) {
        b();
        try {
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, null, null);
            CursorFactory cursorFactory = this.c;
            SQLiteQuery sQLiteQuery = new SQLiteQuery(sQLiteDirectCursorDriver.f18701a, sQLiteDirectCursorDriver.c, sQLiteDirectCursorDriver.f18703d);
            try {
                return cursorFactory == null ? new SQLiteCursor(sQLiteDirectCursorDriver, sQLiteDirectCursorDriver.f18702b, sQLiteQuery) : cursorFactory.a();
            } catch (RuntimeException e) {
                sQLiteQuery.f();
                throw e;
            }
        } finally {
            f();
        }
    }

    public final Cursor E(String str, Object... objArr) {
        b();
        try {
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, null, null);
            CursorFactory cursorFactory = this.c;
            SQLiteQuery sQLiteQuery = new SQLiteQuery(sQLiteDirectCursorDriver.f18701a, sQLiteDirectCursorDriver.c, sQLiteDirectCursorDriver.f18703d);
            if (objArr != null) {
                try {
                    for (int length = objArr.length; length != 0; length--) {
                        sQLiteQuery.g(length, objArr[length - 1]);
                    }
                } catch (RuntimeException e) {
                    sQLiteQuery.f();
                    throw e;
                }
            }
            return cursorFactory == null ? new SQLiteCursor(sQLiteDirectCursorDriver, sQLiteDirectCursorDriver.f18702b, sQLiteQuery) : cursorFactory.a();
        } finally {
            f();
        }
    }

    public final void F() {
        synchronized (this.e) {
            try {
                G();
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f18688g;
                int i = sQLiteDatabaseConfiguration.c;
                boolean z4 = true;
                if ((i & 1) != 1) {
                    z4 = false;
                }
                if (z4) {
                    sQLiteDatabaseConfiguration.c = i & (-2);
                    try {
                        this.h.q(sQLiteDatabaseConfiguration);
                    } catch (RuntimeException e) {
                        this.f18688g.c = i;
                        throw e;
                    }
                }
            } finally {
            }
        }
    }

    public final void G() {
        if (this.h == null) {
            throw new IllegalStateException(s.p(new StringBuilder("The database '"), this.f18688g.f18696b, "' is not open."));
        }
    }

    public final int H(String str, ContentValues contentValues, String str2, String[] strArr, int i) {
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        b();
        try {
            StringBuilder sb2 = new StringBuilder(120);
            sb2.append("UPDATE ");
            sb2.append(f18685k[i]);
            sb2.append(str);
            sb2.append(" SET ");
            int size = contentValues.size();
            int length = strArr.length + size;
            Object[] objArr = new Object[length];
            int i4 = 0;
            for (String str3 : contentValues.keySet()) {
                sb2.append(i4 > 0 ? "," : "");
                sb2.append(str3);
                objArr[i4] = contentValues.get(str3);
                sb2.append("=?");
                i4++;
            }
            for (int i6 = size; i6 < length; i6++) {
                objArr[i6] = strArr[i6 - size];
            }
            if (!TextUtils.isEmpty(str2)) {
                sb2.append(" WHERE ");
                sb2.append(str2);
            }
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, sb2.toString(), objArr, null);
            try {
                int iExecuteUpdateDelete = sQLiteStatement.executeUpdateDelete();
                f();
                return iExecuteUpdateDelete;
            } finally {
                sQLiteStatement.f();
            }
        } catch (Throwable th2) {
            f();
            throw th2;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void beginTransaction() {
        g(null, true);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void beginTransactionNonExclusive() {
        g(null, false);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void beginTransactionWithListener(final android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener) {
        g(new SQLiteTransactionListener() { // from class: net.zetetic.database.sqlcipher.SQLiteDatabase.2
            @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
            public final void a() {
                sQLiteTransactionListener.onCommit();
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
            public final void c() {
                sQLiteTransactionListener.onBegin();
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
            public final void d() {
                sQLiteTransactionListener.onRollback();
            }
        }, true);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void beginTransactionWithListenerNonExclusive(final android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener) {
        g(new SQLiteTransactionListener() { // from class: net.zetetic.database.sqlcipher.SQLiteDatabase.3
            @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
            public final void a() {
                sQLiteTransactionListener.onCommit();
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
            public final void c() {
                sQLiteTransactionListener.onBegin();
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
            public final void d() {
                sQLiteTransactionListener.onRollback();
            }
        }, false);
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteClosable
    public final void c() {
        q(false);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int delete(String str, String str2, Object[] objArr) {
        String[] strArr = new String[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            strArr[i] = objArr[i].toString();
        }
        return k(str, str2, strArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void disableWriteAheadLogging() {
        synchronized (this.e) {
            try {
                G();
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f18688g;
                int i = sQLiteDatabaseConfiguration.c;
                if ((i & C.BUFFER_FLAG_LAST_SAMPLE) == 0) {
                    return;
                }
                sQLiteDatabaseConfiguration.c = i & (-536870913);
                try {
                    this.h.q(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e) {
                    SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.f18688g;
                    sQLiteDatabaseConfiguration2.c = 536870912 | sQLiteDatabaseConfiguration2.c;
                    throw e;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean enableWriteAheadLogging() {
        synchronized (this.e) {
            try {
                G();
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f18688g;
                int i = sQLiteDatabaseConfiguration.c;
                if ((i & C.BUFFER_FLAG_LAST_SAMPLE) != 0) {
                    return true;
                }
                if ((i & 1) == 1) {
                    return false;
                }
                if (sQLiteDatabaseConfiguration.f18695a.equalsIgnoreCase(":memory:")) {
                    Log.i("SQLiteDatabase", "can't enable WAL for memory databases.");
                    return false;
                }
                if (this.i) {
                    if (Log.isLoggable("SQLiteDatabase", 3)) {
                        Log.d("SQLiteDatabase", "this database: " + this.f18688g.f18696b + " has attached databases. can't  enable WAL.");
                    }
                    return false;
                }
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.f18688g;
                sQLiteDatabaseConfiguration2.c |= C.BUFFER_FLAG_LAST_SAMPLE;
                try {
                    this.h.q(sQLiteDatabaseConfiguration2);
                    return true;
                } catch (RuntimeException e) {
                    this.f18688g.c &= -536870913;
                    throw e;
                }
            } finally {
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void endTransaction() {
        b();
        try {
            SQLiteSession sQLiteSessionY = y();
            if (sQLiteSessionY.f == null) {
                throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
            }
            sQLiteSessionY.c(null, false);
        } finally {
            f();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final /* synthetic */ void execPerConnectionSQL(String str, Object[] objArr) {
        AbstractC1687a.a(this, str, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void execSQL(String str) {
        r(str, null);
    }

    public final void finalize() throws Throwable {
        try {
            q(true);
        } finally {
            super.finalize();
        }
    }

    public final void g(SQLiteTransactionListener sQLiteTransactionListener, boolean z4) {
        b();
        try {
            SQLiteSession sQLiteSessionY = y();
            int i = z4 ? 2 : 1;
            int iW = w(false);
            sQLiteSessionY.l();
            sQLiteSessionY.b(i, sQLiteTransactionListener, iW, null);
        } finally {
            f();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final List getAttachedDbs() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.e) {
            try {
                Cursor cursorD = null;
                if (this.h == null) {
                    return null;
                }
                if (!this.i) {
                    arrayList.add(new Pair("main", this.f18688g.f18695a));
                    return arrayList;
                }
                b();
                try {
                    try {
                        cursorD = D("pragma database_list;");
                        while (cursorD.moveToNext()) {
                            arrayList.add(new Pair(cursorD.getString(1), cursorD.getString(2)));
                        }
                        cursorD.close();
                        return arrayList;
                    } catch (Throwable th2) {
                        if (cursorD != null) {
                            cursorD.close();
                        }
                        throw th2;
                    }
                } finally {
                    f();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long getMaximumSize() {
        return DatabaseUtils.b(this, "PRAGMA page_size;") * DatabaseUtils.b(this, "PRAGMA max_page_count;");
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long getPageSize() {
        return DatabaseUtils.b(this, "PRAGMA page_size;");
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final String getPath() {
        String str;
        synchronized (this.e) {
            str = this.f18688g.f18695a;
        }
        return str;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int getVersion() {
        return Long.valueOf(DatabaseUtils.b(this, "PRAGMA user_version;")).intValue();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final SQLiteStatement compileStatement(String str) {
        b();
        try {
            return new SQLiteStatement(this, str, null, null);
        } finally {
            f();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean inTransaction() {
        b();
        try {
            return y().f != null;
        } finally {
            f();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long insert(String str, int i, ContentValues contentValues) {
        return z(str, i, contentValues);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isDatabaseIntegrityOk() {
        List list;
        b();
        try {
            try {
                List attachedDbs = getAttachedDbs();
                if (attachedDbs == null) {
                    throw new IllegalStateException("databaselist for: " + getPath() + " couldn't be retrieved. probably because the database is closed");
                }
                list = attachedDbs;
            } catch (SQLiteException unused) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair("main", getPath()));
                list = arrayList;
            }
            for (int i = 0; i < list.size(); i++) {
                Pair pair = (Pair) list.get(i);
                SQLiteStatement sQLiteStatementCompileStatement = null;
                try {
                    sQLiteStatementCompileStatement = compileStatement("PRAGMA " + ((String) pair.first) + ".integrity_check(1);");
                    String strSimpleQueryForString = sQLiteStatementCompileStatement.simpleQueryForString();
                    if (!strSimpleQueryForString.equalsIgnoreCase("ok")) {
                        Log.e("SQLiteDatabase", "PRAGMA integrity_check on " + ((String) pair.second) + " returned: " + strSimpleQueryForString);
                        sQLiteStatementCompileStatement.f();
                        return false;
                    }
                    sQLiteStatementCompileStatement.f();
                } catch (Throwable th2) {
                    if (sQLiteStatementCompileStatement != null) {
                        sQLiteStatementCompileStatement.f();
                    }
                    throw th2;
                }
            }
            f();
            return true;
        } finally {
            f();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isDbLockedByCurrentThread() {
        b();
        try {
            return y().f18715b != null;
        } finally {
            f();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final /* synthetic */ boolean isExecPerConnectionSQLSupported() {
        return AbstractC1687a.b(this);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isOpen() {
        boolean z4;
        synchronized (this.e) {
            z4 = this.h != null;
        }
        return z4;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isReadOnly() {
        boolean z4;
        synchronized (this.e) {
            z4 = true;
            if ((this.f18688g.c & 1) != 1) {
                z4 = false;
            }
        }
        return z4;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isWriteAheadLoggingEnabled() {
        boolean z4;
        synchronized (this.e) {
            G();
            z4 = (this.f18688g.c & C.BUFFER_FLAG_LAST_SAMPLE) != 0;
        }
        return z4;
    }

    public final int k(String str, String str2, String[] strArr) {
        String str3;
        b();
        try {
            StringBuilder sb2 = new StringBuilder("DELETE FROM ");
            sb2.append(str);
            if (TextUtils.isEmpty(str2)) {
                str3 = "";
            } else {
                str3 = " WHERE " + str2;
            }
            sb2.append(str3);
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, sb2.toString(), strArr, null);
            try {
                int iExecuteUpdateDelete = sQLiteStatement.executeUpdateDelete();
                f();
                return iExecuteUpdateDelete;
            } finally {
                sQLiteStatement.f();
            }
        } catch (Throwable th2) {
            f();
            throw th2;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean needUpgrade(int i) {
        return i > getVersion();
    }

    public final void q(boolean z4) {
        SQLiteConnectionPool sQLiteConnectionPool;
        Throwable th2;
        synchronized (this.e) {
            try {
                CloseGuard closeGuard = this.f;
                if (closeGuard != null) {
                    if (z4 && (th2 = closeGuard.f18645a) != null) {
                        Log.w("A resource was acquired at attached stack trace but never released. See java.io.Closeable for information on avoiding resource leaks.", th2);
                    }
                    this.f.f18645a = null;
                }
                sQLiteConnectionPool = this.h;
                this.h = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z4) {
            return;
        }
        WeakHashMap weakHashMap = j;
        synchronized (weakHashMap) {
            weakHashMap.remove(this);
        }
        if (sQLiteConnectionPool != null) {
            sQLiteConnectionPool.f(false);
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor query(String str) {
        return E(str, new Object[0]);
    }

    public final void r(String str, Object[] objArr) {
        boolean z4;
        b();
        try {
            if (DatabaseUtils.a(str) == 3) {
                synchronized (this.e) {
                    try {
                        if (this.i) {
                            z4 = false;
                        } else {
                            z4 = true;
                            this.i = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z4) {
                    disableWriteAheadLogging();
                }
            }
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, str, objArr, null);
            try {
                sQLiteStatement.executeUpdateDelete();
            } finally {
                sQLiteStatement.f();
            }
        } finally {
            f();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void setForeignKeyConstraintsEnabled(boolean z4) {
        synchronized (this.e) {
            try {
                G();
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f18688g;
                if (sQLiteDatabaseConfiguration.f == z4) {
                    return;
                }
                sQLiteDatabaseConfiguration.f = z4;
                try {
                    this.h.q(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e) {
                    this.f18688g.f = !z4;
                    throw e;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void setLocale(Locale locale) {
        if (locale == null) {
            throw new IllegalArgumentException("locale must not be null.");
        }
        synchronized (this.e) {
            try {
                G();
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f18688g;
                Locale locale2 = sQLiteDatabaseConfiguration.e;
                sQLiteDatabaseConfiguration.e = locale;
                try {
                    this.h.q(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e) {
                    this.f18688g.e = locale2;
                    throw e;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void setMaxSqlCacheSize(int i) {
        if (i > 100 || i < 0) {
            throw new IllegalStateException("expected value between 0 and 100");
        }
        synchronized (this.e) {
            try {
                G();
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f18688g;
                int i4 = sQLiteDatabaseConfiguration.f18697d;
                sQLiteDatabaseConfiguration.f18697d = i;
                try {
                    this.h.q(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e) {
                    this.f18688g.f18697d = i4;
                    throw e;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long setMaximumSize(long j6) {
        long jB = DatabaseUtils.b(this, "PRAGMA page_size;");
        long j7 = j6 / jB;
        if (j6 % jB != 0) {
            j7++;
        }
        return DatabaseUtils.b(this, "PRAGMA max_page_count = " + j7) * jB;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void setPageSize(long j6) {
        r("PRAGMA page_size = " + j6, null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void setTransactionSuccessful() {
        b();
        try {
            SQLiteSession sQLiteSessionY = y();
            if (sQLiteSessionY.f == null) {
                throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
            }
            sQLiteSessionY.l();
            sQLiteSessionY.f.f18719d = true;
        } finally {
            f();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void setVersion(int i) {
        r("PRAGMA user_version = " + i, null);
    }

    public final String t() {
        String str;
        synchronized (this.e) {
            str = this.f18688g.f18696b;
        }
        return str;
    }

    public final String toString() {
        return "SQLiteDatabase: " + getPath();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        String[] strArr = new String[objArr.length];
        for (int i4 = 0; i4 < objArr.length; i4++) {
            strArr[i4] = objArr[i4].toString();
        }
        return H(str, contentValues, str2, strArr, i);
    }

    public final SQLiteSession y() {
        return (SQLiteSession) this.f18686b.get();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean yieldIfContendedSafely() {
        b();
        try {
            return y().m(-1L);
        } finally {
            f();
        }
    }

    public final long z(String str, int i, ContentValues contentValues) {
        Object[] objArr;
        b();
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("INSERT");
            sb2.append(f18685k[i]);
            sb2.append(" INTO ");
            sb2.append(str);
            sb2.append('(');
            int i4 = 0;
            int size = (contentValues == null || contentValues.size() <= 0) ? 0 : contentValues.size();
            if (size > 0) {
                objArr = new Object[size];
                int i6 = 0;
                for (String str2 : contentValues.keySet()) {
                    sb2.append(i6 > 0 ? "," : "");
                    sb2.append(str2);
                    objArr[i6] = contentValues.get(str2);
                    i6++;
                }
                sb2.append(')');
                sb2.append(" VALUES (");
                while (i4 < size) {
                    sb2.append(i4 > 0 ? ",?" : Global.QUESTION);
                    i4++;
                }
            } else {
                sb2.append("null) VALUES (NULL");
                objArr = null;
            }
            sb2.append(')');
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, sb2.toString(), objArr, null);
            try {
                long jExecuteInsert = sQLiteStatement.executeInsert();
                f();
                return jExecuteInsert;
            } finally {
                sQLiteStatement.f();
            }
        } catch (Throwable th2) {
            f();
            throw th2;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void execSQL(String str, Object[] objArr) {
        if (objArr == null) {
            throw new IllegalArgumentException("Empty bindArgs");
        }
        r(str, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor query(String str, Object[] objArr) {
        return E(str, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor query(SupportSQLiteQuery supportSQLiteQuery) {
        return query(supportSQLiteQuery, (CancellationSignal) null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor query(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        b();
        try {
            String sql = supportSQLiteQuery.getSql();
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, sql, "", cancellationSignal);
            SQLiteQuery sQLiteQuery = new SQLiteQuery(this, sql, cancellationSignal);
            supportSQLiteQuery.bindTo(sQLiteQuery);
            return new SQLiteCursor(sQLiteDirectCursorDriver, "", sQLiteQuery);
        } finally {
            f();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean yieldIfContendedSafely(long j6) {
        b();
        try {
            return y().m(j6);
        } finally {
            f();
        }
    }
}
