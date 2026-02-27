package Z;

import D.S;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6846b;
    public final /* synthetic */ p c;

    public /* synthetic */ o(p pVar, String str, int i) {
        this.f6845a = i;
        this.c = pVar;
        this.f6846b = str;
    }

    private final Object a() {
        p pVar = this.c;
        H.b bVar = pVar.f6847a;
        String str = this.f6846b;
        String str2 = pVar.f6849d;
        synchronized (bVar) {
            if (str == null || str2 == null) {
                return null;
            }
            H.e eVar = H.e.f2065b;
            try {
                bVar.c.getWritableDatabase().delete("inboxMessages", "_id = ? AND messageUser = ?", new String[]{str, str2});
            } catch (SQLiteException e) {
                bVar.f2059b.getClass();
                S.r("Error removing stale records from inboxMessages", e);
            }
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f6845a) {
            case 0:
                return a();
            default:
                p pVar = this.c;
                H.b bVar = pVar.f6847a;
                String str = this.f6846b;
                String str2 = pVar.f6849d;
                synchronized (bVar) {
                    if (str == null || str2 == null) {
                        return null;
                    }
                    H.e eVar = H.e.f2065b;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("isRead", (Integer) 1);
                    try {
                        bVar.c.getWritableDatabase().update("inboxMessages", contentValues, "_id = ? AND messageUser = ?", new String[]{str, str2});
                        break;
                    } catch (SQLiteException e) {
                        bVar.f2059b.getClass();
                        S.r("Error removing stale records from inboxMessages", e);
                        break;
                    }
                    return null;
                }
        }
    }
}
