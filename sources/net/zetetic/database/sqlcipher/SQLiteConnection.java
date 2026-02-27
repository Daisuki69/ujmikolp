package net.zetetic.database.sqlcipher;

import We.s;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteBindOrColumnIndexOutOfRangeException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.Log;
import android.util.LruCache;
import androidx.camera.core.impl.a;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.C;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.dynatrace.android.agent.Global;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.ArrayList;
import java.util.WeakHashMap;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteConnection implements CancellationSignal.OnCancelListener {
    public static final String[] m = new String[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f18647n = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CloseGuard f18648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteConnectionPool f18649b;
    public final SQLiteDatabaseConfiguration c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18650d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PreparedStatementCache f18651g;
    public PreparedStatement h;
    public final OperationLog i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f18652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18653l;

    public static final class Operation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f18654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f18655b;
        public long c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f18656d;
        public String e;
        public ArrayList f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f18657g;
        public RuntimeException h;
        public int i;

        public final void a(StringBuilder sb2) {
            sb2.append(this.f18656d);
            if (this.f18657g) {
                sb2.append(" took ");
                sb2.append(this.c - this.f18655b);
                sb2.append("ms");
            } else {
                sb2.append(" started ");
                sb2.append(System.currentTimeMillis() - this.f18654a);
                sb2.append("ms ago");
            }
            sb2.append(" - ");
            sb2.append(!this.f18657g ? "running" : this.h != null ? StateEvent.ProcessResult.FAILED : "succeeded");
            if (this.e != null) {
                sb2.append(", sql=\"");
                sb2.append(this.e.replaceAll("[\\s]*\\n+[\\s]*", Global.BLANK));
                sb2.append("\"");
            }
            if (this.h != null) {
                sb2.append(", exception=\"");
                sb2.append(this.h.getMessage());
                sb2.append("\"");
            }
        }
    }

    public static final class OperationLog {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Operation[] f18658a = new Operation[20];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18659b;
        public int c;

        public final int a(String str, String str2, Object[] objArr) {
            int i;
            synchronized (this.f18658a) {
                try {
                    int i4 = (this.f18659b + 1) % 20;
                    Operation[] operationArr = this.f18658a;
                    Operation operation = operationArr[i4];
                    if (operation == null) {
                        operation = new Operation();
                        operationArr[i4] = operation;
                    } else {
                        operation.f18657g = false;
                        operation.h = null;
                        ArrayList arrayList = operation.f;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                    }
                    operation.f18654a = System.currentTimeMillis();
                    operation.f18655b = SystemClock.uptimeMillis();
                    operation.f18656d = str;
                    operation.e = str2;
                    if (objArr != null) {
                        ArrayList arrayList2 = operation.f;
                        if (arrayList2 == null) {
                            operation.f = new ArrayList();
                        } else {
                            arrayList2.clear();
                        }
                        for (Object obj : objArr) {
                            if (obj == null || !(obj instanceof byte[])) {
                                operation.f.add(obj);
                            } else {
                                operation.f.add(SQLiteConnection.f18647n);
                            }
                        }
                    }
                    int i6 = this.c;
                    this.c = i6 + 1;
                    i = (i6 << 8) | i4;
                    operation.i = i;
                    this.f18659b = i4;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i;
        }

        public final void b(int i) {
            synchronized (this.f18658a) {
                Operation operation = this.f18658a[i & 255];
                if (operation.i != i) {
                    operation = null;
                }
                if (operation != null) {
                    operation.c = SystemClock.uptimeMillis();
                    operation.f18657g = true;
                }
            }
        }

        public final void c(int i) {
            synchronized (this.f18658a) {
                Operation operation = this.f18658a[i & 255];
                if (operation.i != i) {
                    operation = null;
                }
                if (operation != null) {
                    operation.c = SystemClock.uptimeMillis();
                    operation.f18657g = true;
                }
            }
        }

        public final void d(RuntimeException runtimeException, int i) {
            synchronized (this.f18658a) {
                Operation operation = this.f18658a[i & 255];
                if (operation.i != i) {
                    operation = null;
                }
                if (operation != null) {
                    operation.h = runtimeException;
                }
            }
        }
    }

    public static final class PreparedStatement {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PreparedStatement f18660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f18661b;
        public long c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18662d;
        public boolean e;
        public boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f18663g;
    }

    public final class PreparedStatementCache extends LruCache<String, PreparedStatement> {
        public PreparedStatementCache(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        public final void entryRemoved(boolean z4, String str, PreparedStatement preparedStatement, PreparedStatement preparedStatement2) {
            PreparedStatement preparedStatement3 = preparedStatement;
            preparedStatement3.f = false;
            if (preparedStatement3.f18663g) {
                return;
            }
            SQLiteConnection.this.n(preparedStatement3);
        }
    }

    public SQLiteConnection(SQLiteConnectionPool sQLiteConnectionPool, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i, boolean z4) {
        CloseGuard closeGuard = new CloseGuard();
        this.f18648a = closeGuard;
        this.i = new OperationLog();
        this.f18649b = sQLiteConnectionPool;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        this.c = sQLiteDatabaseConfiguration2;
        this.f18650d = i;
        this.e = z4;
        this.f = (sQLiteDatabaseConfiguration.c & 1) != 0;
        this.f18651g = new PreparedStatementCache(sQLiteDatabaseConfiguration2.f18697d);
        closeGuard.a();
    }

    public static String d(String str) {
        return str.equals("0") ? "OFF" : str.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) ? "NORMAL" : str.equals(ExifInterface.GPS_MEASUREMENT_2D) ? "FULL" : str;
    }

    private static native void nativeBindBlob(long j, long j6, int i, byte[] bArr);

    private static native void nativeBindDouble(long j, long j6, int i, double d10);

    private static native void nativeBindLong(long j, long j6, int i, long j7);

    private static native void nativeBindNull(long j, long j6, int i);

    private static native void nativeBindString(long j, long j6, int i, String str);

    private static native void nativeCancel(long j);

    private static native void nativeClose(long j);

    private static native void nativeExecute(long j, long j6);

    private static native int nativeExecuteForBlobFileDescriptor(long j, long j6);

    private static native int nativeExecuteForChangedRowCount(long j, long j6);

    private static native long nativeExecuteForCursorWindow(long j, long j6, CursorWindow cursorWindow, int i, int i4, boolean z4);

    private static native long nativeExecuteForLastInsertedRowId(long j, long j6);

    private static native long nativeExecuteForLong(long j, long j6);

    private static native String nativeExecuteForString(long j, long j6);

    private static native void nativeExecuteRaw(long j, long j6);

    private static native void nativeFinalizeStatement(long j, long j6);

    private static native int nativeGetColumnCount(long j, long j6);

    private static native String nativeGetColumnName(long j, long j6, int i);

    private static native int nativeGetDbLookaside(long j);

    private static native int nativeGetParameterCount(long j, long j6);

    private static native boolean nativeHasCodec();

    private static native boolean nativeIsReadOnly(long j, long j6);

    private static native int nativeKey(long j, byte[] bArr);

    private static native long nativeOpen(String str, int i, String str2, boolean z4, boolean z5);

    private static native long nativePrepareStatement(long j, String str);

    private static native int nativeReKey(long j, byte[] bArr);

    private static native void nativeRegisterCustomFunction(long j, SQLiteCustomFunction sQLiteCustomFunction);

    private static native void nativeRegisterLocalizedCollators(long j, String str);

    private static native void nativeResetCancel(long j, boolean z4);

    private static native void nativeResetStatementAndClearBindings(long j, long j6);

    public static boolean o() {
        return nativeHasCodec();
    }

    public final PreparedStatement a(String str) {
        boolean z4;
        PreparedStatementCache preparedStatementCache = this.f18651g;
        PreparedStatement preparedStatement = preparedStatementCache.get(str);
        if (preparedStatement == null) {
            z4 = false;
        } else {
            if (!preparedStatement.f18663g) {
                return preparedStatement;
            }
            z4 = true;
        }
        long jNativePrepareStatement = nativePrepareStatement(this.j, str);
        try {
            int iNativeGetParameterCount = nativeGetParameterCount(this.j, jNativePrepareStatement);
            int iA = DatabaseUtils.a(str);
            boolean zNativeIsReadOnly = nativeIsReadOnly(this.j, jNativePrepareStatement);
            PreparedStatement preparedStatement2 = this.h;
            if (preparedStatement2 != null) {
                this.h = preparedStatement2.f18660a;
                preparedStatement2.f18660a = null;
                preparedStatement2.f = false;
            } else {
                preparedStatement2 = new PreparedStatement();
            }
            preparedStatement2.f18661b = str;
            preparedStatement2.c = jNativePrepareStatement;
            preparedStatement2.f18662d = iNativeGetParameterCount;
            preparedStatement2.e = zNativeIsReadOnly;
            if (!z4 && (iA == 2 || iA == 1)) {
                try {
                    preparedStatementCache.put(str, preparedStatement2);
                    preparedStatement2.f = true;
                } catch (RuntimeException e) {
                    e = e;
                    preparedStatement = preparedStatement2;
                    if (preparedStatement == null || !preparedStatement.f) {
                        nativeFinalizeStatement(this.j, jNativePrepareStatement);
                    }
                    throw e;
                }
            }
            preparedStatement2.f18663g = true;
            return preparedStatement2;
        } catch (RuntimeException e7) {
            e = e7;
        }
    }

    public final void b(CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
            int i = this.f18653l + 1;
            this.f18653l = i;
            if (i == 1) {
                nativeResetCancel(this.j, true);
                cancellationSignal.setOnCancelListener(this);
            }
        }
    }

    public final void c(PreparedStatement preparedStatement, Object[] objArr) {
        int length = objArr != null ? objArr.length : 0;
        if (length != preparedStatement.f18662d) {
            throw new SQLiteBindOrColumnIndexOutOfRangeException("Expected " + preparedStatement.f18662d + " bind arguments but " + length + " were provided.");
        }
        if (length == 0) {
            return;
        }
        long j = preparedStatement.c;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            char c = obj == null ? (char) 0 : obj instanceof byte[] ? (char) 4 : ((obj instanceof Float) || (obj instanceof Double)) ? (char) 2 : ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) ? (char) 1 : (char) 3;
            if (c == 0) {
                nativeBindNull(this.j, j, i + 1);
            } else if (c == 1) {
                nativeBindLong(this.j, j, i + 1, ((Number) obj).longValue());
            } else if (c == 2) {
                nativeBindDouble(this.j, j, i + 1, ((Number) obj).doubleValue());
            } else if (c == 4) {
                nativeBindBlob(this.j, j, i + 1, (byte[]) obj);
            } else if (obj instanceof Boolean) {
                nativeBindLong(this.j, j, i + 1, ((Boolean) obj).booleanValue() ? 1L : 0L);
            } else {
                nativeBindString(this.j, j, i + 1, obj.toString());
            }
        }
    }

    public final void e(byte[] bArr) {
        int iNativeReKey = nativeReKey(this.j, bArr);
        Log.i("SQLiteConnection", "Database rekey operation returned:" + iNativeReKey);
        if (iNativeReKey != 0) {
            throw new SQLiteException(s.f(iNativeReKey, "Failed to rekey database, result code:"));
        }
    }

    public final void f(CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            int i = this.f18653l - 1;
            this.f18653l = i;
            if (i == 0) {
                cancellationSignal.setOnCancelListener(null);
                nativeResetCancel(this.j, false);
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            SQLiteConnectionPool sQLiteConnectionPool = this.f18649b;
            if (sQLiteConnectionPool != null && this.j != 0) {
                Log.w("SQLiteConnectionPool", "A SQLiteConnection object for database '" + sQLiteConnectionPool.f18667d.f18696b + "' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.");
                sQLiteConnectionPool.c.set(true);
            }
            g(true);
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    public final void g(boolean z4) {
        Throwable th2;
        CloseGuard closeGuard = this.f18648a;
        if (z4 && (th2 = closeGuard.f18645a) != null) {
            Log.w("A resource was acquired at attached stack trace but never released. See java.io.Closeable for information on avoiding resource leaks.", th2);
        }
        closeGuard.f18645a = null;
        if (this.j != 0) {
            OperationLog operationLog = this.i;
            int iA = operationLog.a("close", null, null);
            try {
                this.f18651g.evictAll();
                nativeClose(this.j);
                this.j = 0L;
            } finally {
                operationLog.b(iA);
            }
        }
    }

    public final void h(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        OperationLog operationLog = this.i;
        int iA = operationLog.a("execute", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementA = a(str);
                try {
                    x(preparedStatementA);
                    c(preparedStatementA, objArr);
                    b(cancellationSignal);
                    try {
                        nativeExecute(this.j, preparedStatementA.c);
                    } finally {
                        f(cancellationSignal);
                    }
                } finally {
                    s(preparedStatementA);
                }
            } finally {
                operationLog.b(iA);
            }
        } catch (RuntimeException e) {
            operationLog.d(e, iA);
            throw e;
        }
    }

    public final int i(String str, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        OperationLog operationLog = this.i;
        int iA = operationLog.a("executeForChangedRowCount", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementA = a(str);
                try {
                    x(preparedStatementA);
                    c(preparedStatementA, objArr);
                    return nativeExecuteForChangedRowCount(this.j, preparedStatementA.c);
                } finally {
                    s(preparedStatementA);
                }
            } catch (RuntimeException e) {
                operationLog.d(e, iA);
                throw e;
            }
        } finally {
            operationLog.c(iA);
        }
    }

    public final int j(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i4, boolean z4, CancellationSignal cancellationSignal) {
        int iA;
        OperationLog operationLog = this.i;
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (cursorWindow == null) {
            throw new IllegalArgumentException("window must not be null.");
        }
        cursorWindow.acquireReference();
        try {
            try {
                iA = operationLog.a("executeForCursorWindow", str, objArr);
                try {
                    PreparedStatement preparedStatementA = a(str);
                    try {
                        x(preparedStatementA);
                        c(preparedStatementA, objArr);
                        b(cancellationSignal);
                        try {
                            long jNativeExecuteForCursorWindow = nativeExecuteForCursorWindow(this.j, preparedStatementA.c, cursorWindow, i, i4, z4);
                            int i6 = (int) (jNativeExecuteForCursorWindow >> 32);
                            int i10 = (int) jNativeExecuteForCursorWindow;
                            cursorWindow.getNumRows();
                            cursorWindow.setStartPosition(i6);
                            f(cancellationSignal);
                            s(preparedStatementA);
                            operationLog.c(iA);
                            return i10;
                        } catch (Throwable th2) {
                            f(cancellationSignal);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        s(preparedStatementA);
                        throw th3;
                    }
                } catch (RuntimeException e) {
                    operationLog.d(e, iA);
                    throw e;
                }
            } finally {
                cursorWindow.releaseReference();
            }
        } catch (Throwable th4) {
            operationLog.c(iA);
            throw th4;
        }
    }

    public final long k(String str, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        OperationLog operationLog = this.i;
        int iA = operationLog.a("executeForLastInsertedRowId", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementA = a(str);
                try {
                    x(preparedStatementA);
                    c(preparedStatementA, objArr);
                    return nativeExecuteForLastInsertedRowId(this.j, preparedStatementA.c);
                } finally {
                    s(preparedStatementA);
                }
            } catch (RuntimeException e) {
                operationLog.d(e, iA);
                throw e;
            }
        } finally {
            operationLog.b(iA);
        }
    }

    public final long l(String str, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        OperationLog operationLog = this.i;
        int iA = operationLog.a("executeForLong", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementA = a(str);
                try {
                    x(preparedStatementA);
                    c(preparedStatementA, objArr);
                    return nativeExecuteForLong(this.j, preparedStatementA.c);
                } finally {
                    s(preparedStatementA);
                }
            } catch (RuntimeException e) {
                operationLog.d(e, iA);
                throw e;
            }
        } finally {
            operationLog.b(iA);
        }
    }

    public final String m(String str, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        OperationLog operationLog = this.i;
        int iA = operationLog.a("executeForString", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementA = a(str);
                try {
                    x(preparedStatementA);
                    c(preparedStatementA, objArr);
                    return nativeExecuteForString(this.j, preparedStatementA.c);
                } finally {
                    s(preparedStatementA);
                }
            } catch (RuntimeException e) {
                operationLog.d(e, iA);
                throw e;
            }
        } finally {
            operationLog.b(iA);
        }
    }

    public final void n(PreparedStatement preparedStatement) {
        nativeFinalizeStatement(this.j, preparedStatement.c);
        preparedStatement.f18661b = null;
        preparedStatement.f18660a = this.h;
        this.h = preparedStatement;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        nativeCancel(this.j);
    }

    public final void p() {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.c;
        long jNativeOpen = nativeOpen(sQLiteDatabaseConfiguration.f18695a, sQLiteDatabaseConfiguration.c, sQLiteDatabaseConfiguration.f18696b, SQLiteDebug.f18699a, SQLiteDebug.f18700b);
        this.j = jNativeOpen;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.c;
        SQLiteDatabaseHook sQLiteDatabaseHook = sQLiteDatabaseConfiguration2.h;
        byte[] bArr = sQLiteDatabaseConfiguration2.f18698g;
        if (bArr != null && bArr.length > 0) {
            Log.i("SQLiteConnection", "Database keying operation returned:" + nativeKey(jNativeOpen, bArr));
        }
        SQLiteDatabaseHook sQLiteDatabaseHook2 = this.c.h;
        if (sQLiteDatabaseHook2 != null) {
            sQLiteDatabaseHook2.c(this);
        }
        byte[] bArr2 = this.c.f18698g;
        if (bArr2 != null && bArr2.length > 0) {
            l("SELECT COUNT(*) FROM sqlite_schema;", null);
        }
        if (!this.c.f18695a.equalsIgnoreCase(":memory:") && !this.f) {
            WeakHashMap weakHashMap = SQLiteDatabase.j;
            if (!nativeHasCodec()) {
                synchronized (SQLiteGlobal.f18704a) {
                    try {
                        if (SQLiteGlobal.f18705b == 0) {
                            SQLiteGlobal.f18705b = new StatFs("/data").getBlockSize();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (l("PRAGMA page_size", null) != 4096) {
                    h("PRAGMA page_size=4096", null, null);
                }
            }
        }
        t();
        if (!this.c.f18695a.equalsIgnoreCase(":memory:") && !this.f) {
            if (l("PRAGMA journal_size_limit", null) != 10000) {
                l("PRAGMA journal_size_limit=10000", null);
            }
        }
        if (!this.c.f18695a.equalsIgnoreCase(":memory:") && !this.f) {
            long jMax = Math.max(1, 1000);
            if (l("PRAGMA wal_autocheckpoint", null) != jMax) {
                l("PRAGMA wal_autocheckpoint=" + jMax, null);
            }
        }
        w();
        if (!nativeHasCodec()) {
            v();
        }
        int size = this.c.i.size();
        for (int i = 0; i < size; i++) {
            nativeRegisterCustomFunction(this.j, (SQLiteCustomFunction) this.c.i.get(i));
        }
    }

    public final void q(String str, SQLiteStatementInfo sQLiteStatementInfo) {
        OperationLog operationLog = this.i;
        int iA = operationLog.a("prepare", str, null);
        try {
            try {
                PreparedStatement preparedStatementA = a(str);
                try {
                    sQLiteStatementInfo.f18720a = preparedStatementA.f18662d;
                    sQLiteStatementInfo.c = preparedStatementA.e;
                    int iNativeGetColumnCount = nativeGetColumnCount(this.j, preparedStatementA.c);
                    if (iNativeGetColumnCount == 0) {
                        sQLiteStatementInfo.f18721b = m;
                    } else {
                        sQLiteStatementInfo.f18721b = new String[iNativeGetColumnCount];
                        for (int i = 0; i < iNativeGetColumnCount; i++) {
                            sQLiteStatementInfo.f18721b[i] = nativeGetColumnName(this.j, preparedStatementA.c, i);
                        }
                    }
                    s(preparedStatementA);
                } catch (Throwable th2) {
                    s(preparedStatementA);
                    throw th2;
                }
            } catch (RuntimeException e) {
                operationLog.d(e, iA);
                throw e;
            }
        } finally {
            operationLog.b(iA);
        }
    }

    public final void r(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2;
        this.f18652k = false;
        int size = sQLiteDatabaseConfiguration.i.size();
        int i = 0;
        while (true) {
            sQLiteDatabaseConfiguration2 = this.c;
            if (i >= size) {
                break;
            }
            SQLiteCustomFunction sQLiteCustomFunction = (SQLiteCustomFunction) sQLiteDatabaseConfiguration.i.get(i);
            if (!sQLiteDatabaseConfiguration2.i.contains(sQLiteCustomFunction)) {
                nativeRegisterCustomFunction(this.j, sQLiteCustomFunction);
            }
            i++;
        }
        boolean z4 = sQLiteDatabaseConfiguration.f != sQLiteDatabaseConfiguration2.f;
        boolean z5 = ((sQLiteDatabaseConfiguration.c ^ sQLiteDatabaseConfiguration2.c) & C.BUFFER_FLAG_LAST_SAMPLE) != 0;
        boolean zEquals = sQLiteDatabaseConfiguration.e.equals(sQLiteDatabaseConfiguration2.e);
        sQLiteDatabaseConfiguration2.a(sQLiteDatabaseConfiguration);
        if (z4) {
            t();
        }
        if (z5) {
            w();
        }
        if (zEquals) {
            return;
        }
        v();
    }

    public final void s(PreparedStatement preparedStatement) {
        preparedStatement.f18663g = false;
        if (!preparedStatement.f) {
            n(preparedStatement);
            return;
        }
        try {
            nativeResetStatementAndClearBindings(this.j, preparedStatement.c);
        } catch (SQLiteException unused) {
            this.f18651g.remove(preparedStatement.f18661b);
        }
    }

    public final void t() {
        if (this.f) {
            return;
        }
        long j = this.c.f ? 1L : 0L;
        if (l("PRAGMA foreign_keys", null) != j) {
            h(a.f(j, "PRAGMA foreign_keys="), null, null);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SQLiteConnection: ");
        sb2.append(this.c.f18695a);
        sb2.append(" (");
        return s.o(sb2, ")", this.f18650d);
    }

    public final void u(String str) {
        String strM = m("PRAGMA journal_mode", null);
        if (strM.equalsIgnoreCase(str)) {
            return;
        }
        try {
            if (m("PRAGMA journal_mode=".concat(str), null).equalsIgnoreCase(str)) {
                return;
            }
        } catch (SQLiteDatabaseLockedException unused) {
        }
        StringBuilder sb2 = new StringBuilder("Could not change the database journal mode of '");
        c.A(sb2, this.c.f18696b, "' from '", strM, "' to '");
        sb2.append(str);
        sb2.append("' because the database is locked.  This usually means that there are other open connections to the database which prevents the database from enabling or disabling write-ahead logging mode.  Proceeding without changing the journal mode.");
        Log.w("SQLiteConnection", sb2.toString());
    }

    public final void v() {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.c;
        if ((sQLiteDatabaseConfiguration.c & 16) != 0) {
            return;
        }
        String string = sQLiteDatabaseConfiguration.e.toString();
        nativeRegisterLocalizedCollators(this.j, string);
        if (this.f) {
            return;
        }
        try {
            h("CREATE TABLE IF NOT EXISTS android_metadata (locale TEXT)", null, null);
            String strM = m("SELECT locale FROM android_metadata UNION SELECT NULL ORDER BY locale DESC LIMIT 1", null);
            if (strM == null || !strM.equals(string)) {
                h("BEGIN", null, null);
                try {
                    h("DELETE FROM android_metadata", null, null);
                    h("INSERT INTO android_metadata (locale) VALUES(?)", new Object[]{string}, null);
                    h("REINDEX LOCALIZED", null, null);
                    h("COMMIT", null, null);
                } catch (Throwable th2) {
                    h("ROLLBACK", null, null);
                    throw th2;
                }
            }
        } catch (RuntimeException e) {
            throw new SQLiteException(a.p(new StringBuilder("Failed to change locale for db '"), sQLiteDatabaseConfiguration.f18696b, "' to '", string, "'."), e);
        }
    }

    public final void w() {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.c;
        if (sQLiteDatabaseConfiguration.f18695a.equalsIgnoreCase(":memory:") || this.f) {
            return;
        }
        if ((sQLiteDatabaseConfiguration.c & C.BUFFER_FLAG_LAST_SAMPLE) != 0) {
            u("WAL");
            if (d(m("PRAGMA synchronous", null)).equalsIgnoreCase(d("normal"))) {
                return;
            }
            h("PRAGMA synchronous=".concat("normal"), null, null);
            return;
        }
        u("delete");
        if (d(m("PRAGMA synchronous", null)).equalsIgnoreCase(d("normal"))) {
            return;
        }
        h("PRAGMA synchronous=".concat("normal"), null, null);
    }

    public final void x(PreparedStatement preparedStatement) {
        if (this.f18652k && !preparedStatement.e) {
            throw new SQLiteException("Cannot execute this statement because it might modify the database but the connection is read-only.");
        }
    }
}
