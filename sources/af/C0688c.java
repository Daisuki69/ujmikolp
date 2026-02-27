package af;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import java.util.List;
import qj.o;

/* JADX INFO: renamed from: af.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0688c implements SQLiteDatabase.CursorFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7141b;

    public /* synthetic */ C0688c(Object obj, int i) {
        this.f7140a = i;
        this.f7141b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f7140a) {
            case 0:
                List list = ((m) this.f7141b).f7170b;
                if (list != null) {
                    int size = list.size();
                    int i = 0;
                    while (i < size) {
                        Object objA = m.a(list.get(i));
                        int i4 = i + 1;
                        if (objA == null) {
                            sQLiteQuery.bindNull(i4);
                        } else if (objA instanceof byte[]) {
                            sQLiteQuery.bindBlob(i4, (byte[]) objA);
                        } else if (objA instanceof Double) {
                            sQLiteQuery.bindDouble(i4, ((Double) objA).doubleValue());
                        } else if (objA instanceof Integer) {
                            sQLiteQuery.bindLong(i4, ((Integer) objA).intValue());
                        } else if (objA instanceof Long) {
                            sQLiteQuery.bindLong(i4, ((Long) objA).longValue());
                        } else if (objA instanceof String) {
                            sQLiteQuery.bindString(i4, (String) objA);
                        } else {
                            if (!(objA instanceof Boolean)) {
                                throw new IllegalArgumentException("Could not bind " + objA + " from index " + i + ": Supported types are null, byte[], double, long, boolean and String");
                            }
                            sQLiteQuery.bindLong(i4, ((Boolean) objA).booleanValue() ? 1L : 0L);
                        }
                        i = i4;
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            case 1:
                return FrameworkSQLiteDatabase.query$lambda$1((SupportSQLiteQuery) this.f7141b, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            default:
                return FrameworkSQLiteDatabase.query$lambda$0((o) this.f7141b, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
