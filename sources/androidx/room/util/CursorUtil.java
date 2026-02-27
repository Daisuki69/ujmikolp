package androidx.room.util;

import We.s;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.media3.datasource.cache.c;
import cj.C1129o;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class CursorUtil {
    public static final Cursor copyAndClose(Cursor c) throws IOException {
        j.g(c, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(c.getColumnNames(), c.getCount());
            while (c.moveToNext()) {
                Object[] objArr = new Object[c.getColumnCount()];
                int columnCount = c.getColumnCount();
                for (int i = 0; i < columnCount; i++) {
                    int type = c.getType(i);
                    if (type == 0) {
                        objArr[i] = null;
                    } else if (type == 1) {
                        objArr[i] = Long.valueOf(c.getLong(i));
                    } else if (type == 2) {
                        objArr[i] = Double.valueOf(c.getDouble(i));
                    } else if (type == 3) {
                        objArr[i] = c.getString(i);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i] = c.getBlob(i);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            c.close();
            return matrixCursor;
        } finally {
        }
    }

    private static final int findColumnIndexBySuffix(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        j.f(columnNames, "columnNames");
        return findColumnIndexBySuffix(columnNames, str);
    }

    public static final int getColumnIndex(Cursor c, String name) {
        j.g(c, "c");
        j.g(name, "name");
        int columnIndex = c.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c.getColumnIndex("`" + name + '`');
        return columnIndex2 >= 0 ? columnIndex2 : findColumnIndexBySuffix(c, name);
    }

    public static final int getColumnIndexOrThrow(Cursor c, String name) {
        String strW;
        j.g(c, "c");
        j.g(name, "name");
        int columnIndex = getColumnIndex(c, name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = c.getColumnNames();
            j.f(columnNames, "c.columnNames");
            strW = C1129o.w(columnNames, null, null, 63);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            strW = "unknown";
        }
        throw new IllegalArgumentException(s.k("column '", name, "' does not exist. Available columns: ", strW));
    }

    public static final <R> R useCursor(Cursor cursor, Function1<? super Cursor, ? extends R> block) throws IOException {
        j.g(cursor, "<this>");
        j.g(block, "block");
        try {
            R r9 = (R) block.invoke(cursor);
            cursor.close();
            return r9;
        } finally {
        }
    }

    public static final Cursor wrapMappedColumns(Cursor cursor, final String[] columnNames, final int[] mapping) {
        j.g(cursor, "cursor");
        j.g(columnNames, "columnNames");
        j.g(mapping, "mapping");
        if (columnNames.length == mapping.length) {
            return new CursorWrapper(cursor) { // from class: androidx.room.util.CursorUtil.wrapMappedColumns.2
                @Override // android.database.CursorWrapper, android.database.Cursor
                public int getColumnIndex(String columnName) {
                    j.g(columnName, "columnName");
                    String[] strArr = columnNames;
                    int[] iArr = mapping;
                    int length = strArr.length;
                    int i = 0;
                    int i4 = 0;
                    while (i < length) {
                        int i6 = i4 + 1;
                        if (z.o(strArr[i], columnName, true)) {
                            return iArr[i4];
                        }
                        i++;
                        i4 = i6;
                    }
                    return super.getColumnIndex(columnName);
                }
            };
        }
        throw new IllegalStateException("Expected columnNames.length == mapping.length");
    }

    @VisibleForTesting
    public static final int findColumnIndexBySuffix(String[] columnNames, String name) {
        j.g(columnNames, "columnNames");
        j.g(name, "name");
        String strConcat = ".".concat(name);
        String strG = c.g('`', ".", name);
        int length = columnNames.length;
        int i = 0;
        int i4 = 0;
        while (i < length) {
            String str = columnNames[i];
            int i6 = i4 + 1;
            if (str.length() >= name.length() + 2 && (z.n(str, 2, strConcat, false) || (str.charAt(0) == '`' && z.n(str, 2, strG, false)))) {
                return i4;
            }
            i++;
            i4 = i6;
        }
        return -1;
    }
}
