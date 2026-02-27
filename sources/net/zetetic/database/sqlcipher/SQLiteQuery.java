package net.zetetic.database.sqlcipher;

import android.database.CursorWindow;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteQuery extends SQLiteProgram {
    public final CancellationSignal i;

    public SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, CancellationSignal cancellationSignal) {
        super(sQLiteDatabase, str, null, cancellationSignal);
        this.i = cancellationSignal;
    }

    public final int m(CursorWindow cursorWindow, int i, int i4, boolean z4) {
        b();
        try {
            try {
                cursorWindow.acquireReference();
            } catch (Throwable th2) {
                f();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
        } catch (SQLiteDatabaseCorruptException e) {
            e = e;
        } catch (SQLiteException e7) {
            e = e7;
        } catch (Throwable th4) {
            th = th4;
            Throwable th5 = th;
            cursorWindow.releaseReference();
            throw th5;
        }
        try {
            int iF = this.f18711b.y().f(this.c, this.f18713g, cursorWindow, i, i4, z4, i(), this.i);
            cursorWindow.releaseReference();
            f();
            return iF;
        } catch (SQLiteDatabaseCorruptException e10) {
            e = e10;
            SQLiteDatabaseCorruptException sQLiteDatabaseCorruptException = e;
            k();
            throw sQLiteDatabaseCorruptException;
        } catch (SQLiteException e11) {
            e = e11;
            SQLiteException sQLiteException = e;
            Log.e("SQLiteQuery", "exception: " + sQLiteException.getMessage() + "; query: " + this.c);
            throw sQLiteException;
        }
    }

    public final String toString() {
        return "SQLiteQuery: " + this.c;
    }
}
