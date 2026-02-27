package androidx.room.util;

import We.s;
import a.AbstractC0617a;
import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ViewInfo {
    public static final Companion Companion = new Companion(null);
    public final String name;
    public final String sql;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewInfo read(SupportSQLiteDatabase database, String viewName) {
            ViewInfo viewInfo;
            j.g(database, "database");
            j.g(viewName, "viewName");
            Cursor cursorQuery = database.query("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + viewName + '\'');
            try {
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(0);
                    j.f(string, "cursor.getString(0)");
                    viewInfo = new ViewInfo(string, cursorQuery.getString(1));
                } else {
                    viewInfo = new ViewInfo(viewName, null);
                }
                AbstractC0617a.p(cursorQuery, null);
                return viewInfo;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC0617a.p(cursorQuery, th2);
                    throw th3;
                }
            }
        }

        private Companion() {
        }
    }

    public ViewInfo(String name, String str) {
        j.g(name, "name");
        this.name = name;
        this.sql = str;
    }

    public static final ViewInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewInfo)) {
            return false;
        }
        ViewInfo viewInfo = (ViewInfo) obj;
        if (j.b(this.name, viewInfo.name)) {
            String str = this.sql;
            String str2 = viewInfo.sql;
            if (str != null ? j.b(str, str2) : str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.sql;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ViewInfo{name='");
        sb2.append(this.name);
        sb2.append("', sql='");
        return s.p(sb2, this.sql, "'}");
    }
}
