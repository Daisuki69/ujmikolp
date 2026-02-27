package androidx.room.util;

import a.AbstractC0617a;
import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteDatabase;
import cj.C1110A;
import cj.C1114E;
import cj.P;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import dj.C1413k;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class FtsTableInfo {
    public static final Companion Companion = new Companion(null);
    private static final String[] FTS_OPTIONS = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};
    public final Set<String> columns;
    public final String name;
    public final Set<String> options;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Set<String> readColumns(SupportSQLiteDatabase supportSQLiteDatabase, String str) throws IOException {
            C1413k c1413k = new C1413k();
            Cursor cursorQuery = supportSQLiteDatabase.query("PRAGMA table_info(`" + str + "`)");
            try {
                if (cursorQuery.getColumnCount() > 0) {
                    int columnIndex = cursorQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(columnIndex);
                        j.f(string, "cursor.getString(nameIndex)");
                        c1413k.add(string);
                    }
                }
                Unit unit = Unit.f18162a;
                cursorQuery.close();
                return P.a(c1413k);
            } finally {
            }
        }

        private final Set<String> readOptions(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
            Cursor cursorQuery = supportSQLiteDatabase.query("SELECT * FROM sqlite_master WHERE `name` = '" + str + '\'');
            try {
                String sql = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("sql")) : "";
                AbstractC0617a.p(cursorQuery, null);
                j.f(sql, "sql");
                return parseOptions(sql);
            } finally {
            }
        }

        @VisibleForTesting
        public final Set<String> parseOptions(String createStatement) {
            Character ch2;
            j.g(createStatement, "createStatement");
            if (createStatement.length() == 0) {
                return C1114E.f9379a;
            }
            String strSubstring = createStatement.substring(C2576A.E(createStatement, '(', 0, 6) + 1, C2576A.I(createStatement, ')', 0, 6));
            j.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            ArrayList arrayList = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            int i = -1;
            int i4 = 0;
            int i6 = 0;
            while (i4 < strSubstring.length()) {
                char cCharAt = strSubstring.charAt(i4);
                int i10 = i6 + 1;
                if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '`') {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(cCharAt));
                    } else {
                        Character ch3 = (Character) arrayDeque.peek();
                        if (ch3 != null && ch3.charValue() == cCharAt) {
                            arrayDeque.pop();
                        }
                    }
                } else if (cCharAt == '[') {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(cCharAt));
                    }
                } else if (cCharAt == ']') {
                    if (!arrayDeque.isEmpty() && (ch2 = (Character) arrayDeque.peek()) != null && ch2.charValue() == '[') {
                        arrayDeque.pop();
                    }
                } else if (cCharAt == ',' && arrayDeque.isEmpty()) {
                    String strSubstring2 = strSubstring.substring(i + 1, i6);
                    j.f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    int length = strSubstring2.length() - 1;
                    int i11 = 0;
                    boolean z4 = false;
                    while (i11 <= length) {
                        boolean z5 = j.i(strSubstring2.charAt(!z4 ? i11 : length), 32) <= 0;
                        if (z4) {
                            if (!z5) {
                                break;
                            }
                            length--;
                        } else if (z5) {
                            i11++;
                        } else {
                            z4 = true;
                        }
                    }
                    arrayList.add(strSubstring2.subSequence(i11, length + 1).toString());
                    i = i6;
                }
                i4++;
                i6 = i10;
            }
            String strSubstring3 = strSubstring.substring(i + 1);
            j.f(strSubstring3, "this as java.lang.String).substring(startIndex)");
            arrayList.add(C2576A.b0(strSubstring3).toString());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String str = (String) obj;
                String[] strArr = FtsTableInfo.FTS_OPTIONS;
                int length2 = strArr.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        break;
                    }
                    if (z.w(str, 2, strArr[i12], false)) {
                        arrayList2.add(obj);
                        break;
                    }
                    i12++;
                }
            }
            return C1110A.Z(arrayList2);
        }

        public final FtsTableInfo read(SupportSQLiteDatabase database, String tableName) {
            j.g(database, "database");
            j.g(tableName, "tableName");
            return new FtsTableInfo(tableName, readColumns(database, tableName), readOptions(database, tableName));
        }

        private Companion() {
        }
    }

    public FtsTableInfo(String name, Set<String> columns, Set<String> options) {
        j.g(name, "name");
        j.g(columns, "columns");
        j.g(options, "options");
        this.name = name;
        this.columns = columns;
        this.options = options;
    }

    @VisibleForTesting
    public static final Set<String> parseOptions(String str) {
        return Companion.parseOptions(str);
    }

    public static final FtsTableInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FtsTableInfo)) {
            return false;
        }
        FtsTableInfo ftsTableInfo = (FtsTableInfo) obj;
        if (j.b(this.name, ftsTableInfo.name) && j.b(this.columns, ftsTableInfo.columns)) {
            return j.b(this.options, ftsTableInfo.options);
        }
        return false;
    }

    public int hashCode() {
        return this.options.hashCode() + ((this.columns.hashCode() + (this.name.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "FtsTableInfo{name='" + this.name + "', columns=" + this.columns + ", options=" + this.options + "'}";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FtsTableInfo(String name, Set<String> columns, String createSql) {
        this(name, columns, Companion.parseOptions(createSql));
        j.g(name, "name");
        j.g(columns, "columns");
        j.g(createSql, "createSql");
    }
}
