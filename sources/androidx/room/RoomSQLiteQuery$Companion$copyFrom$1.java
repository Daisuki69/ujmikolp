package androidx.room;

import androidx.sqlite.db.SupportSQLiteProgram;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class RoomSQLiteQuery$Companion$copyFrom$1 implements SupportSQLiteProgram, AutoCloseable {
    private final /* synthetic */ RoomSQLiteQuery $$delegate_0;

    public RoomSQLiteQuery$Companion$copyFrom$1(RoomSQLiteQuery roomSQLiteQuery) {
        this.$$delegate_0 = roomSQLiteQuery;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i, byte[] value) {
        j.g(value, "value");
        this.$$delegate_0.bindBlob(i, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i, double d10) {
        this.$$delegate_0.bindDouble(i, d10);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i, long j) {
        this.$$delegate_0.bindLong(i, j);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i) {
        this.$$delegate_0.bindNull(i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i, String value) {
        j.g(value, "value");
        this.$$delegate_0.bindString(i, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        this.$$delegate_0.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.$$delegate_0.close();
    }
}
