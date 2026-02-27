package net.zetetic.database.sqlcipher;

import android.database.AbstractWindowedCursor;
import android.database.CursorWindow;
import android.os.Build;
import android.util.Log;
import io.flutter.plugin.platform.AbstractC1621e;
import java.lang.reflect.Field;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class SQLiteCursor extends AbstractWindowedCursor implements AutoCloseable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f18680g = (int) (Math.pow(1024.0d, 2.0d) * 8.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f18681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteQuery f18682b;
    public final SQLiteCursorDriver c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18683d;
    public int e;
    public HashMap f;

    @Deprecated
    public SQLiteCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this(sQLiteCursorDriver, str, sQLiteQuery);
    }

    public final void b(int i) {
        CursorWindow cursorWindow;
        SQLiteQuery sQLiteQuery = this.f18682b;
        String path = sQLiteQuery.f18711b.getPath();
        int i4 = f18680g + 512;
        CursorWindow window = getWindow();
        if (window == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                cursorWindow = AbstractC1621e.c(i4, path);
            } else {
                try {
                    Field declaredField = CursorWindow.class.getDeclaredField("sCursorWindowSize");
                    if (declaredField != null) {
                        declaredField.setAccessible(true);
                        declaredField.set(null, Integer.valueOf(i4));
                        Log.i("SQLiteCursor", "Set CursorWindow allocation size to " + i4);
                    }
                } catch (Exception e) {
                    Log.e("SQLiteCursor", "Failed to override CursorWindow allocation size", e);
                }
                cursorWindow = new CursorWindow(path);
            }
            setWindow(cursorWindow);
        } else {
            window.clear();
        }
        try {
            if (this.f18683d != -1) {
                sQLiteQuery.m(((AbstractWindowedCursor) this).mWindow, Math.max(i - (this.e / 3), 0), i, false);
                return;
            }
            this.f18683d = sQLiteQuery.m(((AbstractWindowedCursor) this).mWindow, Math.max(i, 0), i, true);
            this.e = ((AbstractWindowedCursor) this).mWindow.getNumRows();
            if (Log.isLoggable("SQLiteCursor", 3)) {
                Log.d("SQLiteCursor", "received count(*) from native_fill_window: " + this.f18683d);
            }
        } catch (RuntimeException e7) {
            setWindow(null);
            throw e7;
        }
    }

    @Override // android.database.AbstractCursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        synchronized (this) {
            this.f18682b.f();
            this.c.getClass();
        }
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final void deactivate() {
        super.deactivate();
        this.c.getClass();
    }

    @Override // android.database.AbstractCursor
    public final void finalize() {
        try {
            if (((AbstractWindowedCursor) this).mWindow != null) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final int getColumnIndex(String str) {
        if (this.f == null) {
            String[] strArr = this.f18681a;
            int length = strArr.length;
            HashMap map = new HashMap(length, 1.0f);
            for (int i = 0; i < length; i++) {
                map.put(strArr[i], Integer.valueOf(i));
            }
            this.f = map;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            Log.e("SQLiteCursor", "requesting column name with table name -- ".concat(str), new Exception());
            str = str.substring(iLastIndexOf + 1);
        }
        Integer num = (Integer) this.f.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final String[] getColumnNames() {
        return this.f18681a;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final int getCount() {
        if (this.f18683d == -1) {
            b(0);
        }
        return this.f18683d;
    }

    @Override // android.database.AbstractCursor, android.database.CrossProcessCursor
    public final boolean onMove(int i, int i4) {
        CursorWindow cursorWindow = ((AbstractWindowedCursor) this).mWindow;
        if (cursorWindow != null && i4 >= cursorWindow.getStartPosition()) {
            if (i4 < ((AbstractWindowedCursor) this).mWindow.getNumRows() + ((AbstractWindowedCursor) this).mWindow.getStartPosition()) {
                return true;
            }
        }
        b(i4);
        return true;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final boolean requery() {
        if (isClosed()) {
            return false;
        }
        synchronized (this) {
            try {
                if (!this.f18682b.f18711b.isOpen()) {
                    return false;
                }
                CursorWindow cursorWindow = ((AbstractWindowedCursor) this).mWindow;
                if (cursorWindow != null) {
                    cursorWindow.clear();
                }
                ((AbstractWindowedCursor) this).mPos = -1;
                this.f18683d = -1;
                this.c.getClass();
                try {
                    return super.requery();
                } catch (IllegalStateException e) {
                    Log.w("SQLiteCursor", "requery() failed " + e.getMessage(), e);
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.database.AbstractWindowedCursor
    public final void setWindow(CursorWindow cursorWindow) {
        super.setWindow(cursorWindow);
        this.f18683d = -1;
    }

    public SQLiteCursor(SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.f18683d = -1;
        if (sQLiteQuery == null) {
            throw new IllegalArgumentException("query object cannot be null");
        }
        this.c = sQLiteCursorDriver;
        this.f = null;
        this.f18682b = sQLiteQuery;
        this.f18681a = sQLiteQuery.e;
    }
}
