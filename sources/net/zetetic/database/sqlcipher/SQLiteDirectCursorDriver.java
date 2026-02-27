package net.zetetic.database.sqlcipher;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteDirectCursorDriver implements SQLiteCursorDriver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f18701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18702b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CancellationSignal f18703d;

    public SQLiteDirectCursorDriver(SQLiteDatabase sQLiteDatabase, String str, String str2, CancellationSignal cancellationSignal) {
        this.f18701a = sQLiteDatabase;
        this.f18702b = str2;
        this.c = str;
        this.f18703d = cancellationSignal;
    }

    public final String toString() {
        return "SQLiteDirectCursorDriver: " + this.c;
    }
}
