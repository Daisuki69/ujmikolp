package net.zetetic.database.sqlcipher;

import We.s;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.camera.core.impl.a;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SQLiteOpenHelper implements SupportSQLiteOpenHelper, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18707b;
    public final SQLiteDatabase.CursorFactory c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18708d;
    public final int e;
    public SQLiteDatabase f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f18709g;
    public boolean h;
    public boolean i;
    public final DatabaseErrorHandler j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SQLiteDatabaseHook f18710k;

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(context, str, cursorFactory, i, null);
    }

    public final SQLiteDatabase b(boolean z4) {
        Context context = this.f18706a;
        SQLiteDatabase sQLiteDatabase = this.f;
        if (sQLiteDatabase != null) {
            if (!sQLiteDatabase.isOpen()) {
                this.f = null;
            } else if (!z4 || !this.f.isReadOnly()) {
                return this.f;
            }
        }
        if (this.h) {
            throw new IllegalStateException("getDatabase called recursively");
        }
        SQLiteDatabase sQLiteDatabaseB = this.f;
        try {
            this.h = true;
            String str = this.f18707b;
            if (sQLiteDatabaseB == null) {
                if (str == null) {
                    sQLiteDatabaseB = SQLiteDatabase.B(268435456, ":memory:", null, null, null, new byte[0]);
                } else {
                    try {
                        String path = !str.startsWith("file:") ? context.getDatabasePath(str).getPath() : str;
                        File file = new File(new File(path).getParent());
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        sQLiteDatabaseB = SQLiteDatabase.B(this.i ? 805306368 : 268435456, path, this.j, this.c, this.f18710k, this.f18709g);
                    } catch (SQLiteException e) {
                        if (z4) {
                            throw e;
                        }
                        Log.e("SQLiteOpenHelper", "Couldn't open " + str + " for writing (will try read-only):", e);
                        sQLiteDatabaseB = SQLiteDatabase.B(1, context.getDatabasePath(str).getPath(), this.j, this.c, this.f18710k, this.f18709g);
                    }
                }
            } else if (z4 && sQLiteDatabaseB.isReadOnly()) {
                sQLiteDatabaseB.F();
            }
            g(sQLiteDatabaseB);
            int version = sQLiteDatabaseB.getVersion();
            int i = this.f18708d;
            if (version != i) {
                if (sQLiteDatabaseB.isReadOnly()) {
                    throw new SQLiteException("Can't upgrade read-only database from version " + sQLiteDatabaseB.getVersion() + " to " + i + ": " + str);
                }
                if (version > 0 && version < this.e) {
                    File file2 = new File(sQLiteDatabaseB.getPath());
                    sQLiteDatabaseB.f();
                    if (!SQLiteDatabase.m(file2)) {
                        throw new IllegalStateException("Unable to delete obsolete database " + str + " with version " + version);
                    }
                    this.h = false;
                    SQLiteDatabase sQLiteDatabaseB2 = b(z4);
                    this.h = false;
                    if (sQLiteDatabaseB != this.f) {
                        sQLiteDatabaseB.f();
                    }
                    return sQLiteDatabaseB2;
                }
                sQLiteDatabaseB.beginTransaction();
                try {
                    if (version == 0) {
                        i(sQLiteDatabaseB);
                    } else if (version > i) {
                        k(sQLiteDatabaseB, version, i);
                    } else {
                        q(sQLiteDatabaseB, version, i);
                    }
                    sQLiteDatabaseB.setVersion(i);
                    sQLiteDatabaseB.setTransactionSuccessful();
                    sQLiteDatabaseB.endTransaction();
                } catch (Throwable th2) {
                    sQLiteDatabaseB.endTransaction();
                    throw th2;
                }
            }
            m(sQLiteDatabaseB);
            if (sQLiteDatabaseB.isReadOnly()) {
                Log.w("SQLiteOpenHelper", "Opened " + str + " in read-only mode");
            }
            this.f = sQLiteDatabaseB;
            this.h = false;
            return sQLiteDatabaseB;
        } catch (Throwable th3) {
            this.h = false;
            if (sQLiteDatabaseB != null && sQLiteDatabaseB != this.f) {
                sQLiteDatabaseB.f();
            }
            throw th3;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase sQLiteDatabaseB;
        synchronized (this) {
            sQLiteDatabaseB = b(false);
        }
        return sQLiteDatabaseB;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.h) {
            throw new IllegalStateException("Closed during initialization");
        }
        SQLiteDatabase sQLiteDatabase = this.f;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f.f();
            this.f = null;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase sQLiteDatabaseB;
        synchronized (this) {
            sQLiteDatabaseB = b(true);
        }
        return sQLiteDatabaseB;
    }

    public void g(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final String getDatabaseName() {
        return this.f18707b;
    }

    public abstract void i(SQLiteDatabase sQLiteDatabase);

    public void k(SQLiteDatabase sQLiteDatabase, int i, int i4) {
        throw new SQLiteException(a.c(i, i4, "Can't downgrade database from version ", " to "));
    }

    public void m(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void q(SQLiteDatabase sQLiteDatabase, int i, int i4);

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean z4) {
        synchronized (this) {
            try {
                if (this.i != z4) {
                    SQLiteDatabase sQLiteDatabase = this.f;
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && !this.f.isReadOnly()) {
                        if (z4) {
                            this.f.enableWriteAheadLogging();
                        } else {
                            this.f.disableWriteAheadLogging();
                        }
                    }
                    this.i = z4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        this(context, str, cursorFactory, i, 0, databaseErrorHandler);
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, int i4, DatabaseErrorHandler databaseErrorHandler) {
        this(context, str, new byte[0], cursorFactory, i, i4, databaseErrorHandler, (SQLiteDatabaseHook) null, false);
    }

    public SQLiteOpenHelper(Context context, String str, byte[] bArr, SQLiteDatabase.CursorFactory cursorFactory, int i, int i4, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z4) {
        if (i >= 1) {
            this.f18706a = context;
            this.f18707b = str;
            this.f18709g = bArr;
            this.c = cursorFactory;
            this.f18708d = i;
            this.j = databaseErrorHandler;
            this.f18710k = sQLiteDatabaseHook;
            this.i = z4;
            this.e = Math.max(0, i4);
            return;
        }
        throw new IllegalArgumentException(s.f(i, "Version must be >= 1, was "));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SQLiteOpenHelper(Context context, String str, String str2, SQLiteDatabase.CursorFactory cursorFactory, int i, int i4, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z4) {
        byte[] bArr;
        if (str2 != null && str2.length() != 0) {
            ByteBuffer byteBufferEncode = Charset.forName("UTF-8").encode(CharBuffer.wrap(str2));
            bArr = new byte[byteBufferEncode.limit()];
            byteBufferEncode.get(bArr);
        } else {
            bArr = new byte[0];
        }
        this(context, str, bArr, cursorFactory, i, i4, databaseErrorHandler, sQLiteDatabaseHook, z4);
    }
}
