package net.zetetic.database.sqlcipher;

import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

/* JADX INFO: loaded from: classes2.dex */
public class SupportHelper implements SupportSQLiteOpenHelper, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteOpenHelper f18722a;

    public SupportHelper(SupportSQLiteOpenHelper.Configuration configuration, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z4) {
        this(configuration, bArr, sQLiteDatabaseHook, z4, 0);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f18722a.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final String getDatabaseName() {
        return this.f18722a.f18707b;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase getReadableDatabase() {
        return this.f18722a.getReadableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase getWritableDatabase() {
        return this.f18722a.getWritableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean z4) {
        this.f18722a.setWriteAheadLoggingEnabled(z4);
    }

    public SupportHelper(final SupportSQLiteOpenHelper.Configuration configuration, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z4, int i) {
        this.f18722a = new SQLiteOpenHelper(configuration.context, configuration.name, bArr, configuration.callback.version, i, sQLiteDatabaseHook, z4) { // from class: net.zetetic.database.sqlcipher.SupportHelper.1
            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public final void g(SQLiteDatabase sQLiteDatabase) {
                configuration.callback.onConfigure(sQLiteDatabase);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public final void i(SQLiteDatabase sQLiteDatabase) {
                configuration.callback.onCreate(sQLiteDatabase);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public final void k(SQLiteDatabase sQLiteDatabase, int i4, int i6) {
                configuration.callback.onDowngrade(sQLiteDatabase, i4, i6);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public final void m(SQLiteDatabase sQLiteDatabase) {
                configuration.callback.onOpen(sQLiteDatabase);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public final void q(SQLiteDatabase sQLiteDatabase, int i4, int i6) {
                configuration.callback.onUpgrade(sQLiteDatabase, i4, i6);
            }
        };
    }
}
