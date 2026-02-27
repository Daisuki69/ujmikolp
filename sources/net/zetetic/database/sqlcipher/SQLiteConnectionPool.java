package net.zetetic.database.sqlcipher;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.camera.core.impl.a;
import androidx.media3.common.C;
import androidx.media3.datasource.cache.c;
import com.dynatrace.android.agent.Global;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;
import net.zetetic.database.sqlcipher.SQLiteConnection;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteConnectionPool implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SQLiteDatabaseConfiguration f18667d;
    public int e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18668g;
    public ConnectionWaiter h;
    public ConnectionWaiter i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SQLiteConnection f18669k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CloseGuard f18665a = new CloseGuard();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18666b = new Object();
    public final AtomicBoolean c = new AtomicBoolean();
    public final ArrayList j = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WeakHashMap f18670l = new WeakHashMap();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AcquiredConnectionStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AcquiredConnectionStatus f18673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AcquiredConnectionStatus f18674b;
        public static final AcquiredConnectionStatus c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ AcquiredConnectionStatus[] f18675d;

        static {
            AcquiredConnectionStatus acquiredConnectionStatus = new AcquiredConnectionStatus("NORMAL", 0);
            f18673a = acquiredConnectionStatus;
            AcquiredConnectionStatus acquiredConnectionStatus2 = new AcquiredConnectionStatus("RECONFIGURE", 1);
            f18674b = acquiredConnectionStatus2;
            AcquiredConnectionStatus acquiredConnectionStatus3 = new AcquiredConnectionStatus("DISCARD", 2);
            c = acquiredConnectionStatus3;
            f18675d = new AcquiredConnectionStatus[]{acquiredConnectionStatus, acquiredConnectionStatus2, acquiredConnectionStatus3};
        }

        public static AcquiredConnectionStatus valueOf(String str) {
            return (AcquiredConnectionStatus) Enum.valueOf(AcquiredConnectionStatus.class, str);
        }

        public static AcquiredConnectionStatus[] values() {
            return (AcquiredConnectionStatus[]) f18675d.clone();
        }
    }

    public static final class ConnectionWaiter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ConnectionWaiter f18676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Thread f18677b;
        public long c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18678d;
        public boolean e;
        public String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f18679g;
        public SQLiteConnection h;
        public RuntimeException i;
        public int j;
    }

    public SQLiteConnectionPool(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.f18667d = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        y();
    }

    public static void c(SQLiteConnection sQLiteConnection) {
        try {
            sQLiteConnection.g(false);
        } catch (RuntimeException e) {
            Log.e("SQLiteConnectionPool", "Failed to close connection, its fate is now in the hands of the merciful GC: " + sQLiteConnection, e);
        }
    }

    public final SQLiteConnection B(int i, String str) {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        if (size > 1 && str != null) {
            for (int i4 = 0; i4 < size; i4++) {
                SQLiteConnection sQLiteConnection = (SQLiteConnection) arrayList.get(i4);
                if (sQLiteConnection.f18651g.get(str) != null) {
                    arrayList.remove(i4);
                    g(sQLiteConnection, i);
                    return sQLiteConnection;
                }
            }
        }
        if (size > 0) {
            SQLiteConnection sQLiteConnection2 = (SQLiteConnection) arrayList.remove(size - 1);
            g(sQLiteConnection2, i);
            return sQLiteConnection2;
        }
        int size2 = this.f18670l.size();
        if (this.f18669k != null) {
            size2++;
        }
        if (size2 >= this.e) {
            return null;
        }
        SQLiteConnection sQLiteConnectionM = m(this.f18667d, false);
        g(sQLiteConnectionM, i);
        return sQLiteConnectionM;
    }

    public final SQLiteConnection C(int i) {
        SQLiteConnection sQLiteConnection = this.f18669k;
        if (sQLiteConnection != null) {
            this.f18669k = null;
            g(sQLiteConnection, i);
            return sQLiteConnection;
        }
        Iterator it = this.f18670l.keySet().iterator();
        while (it.hasNext()) {
            if (((SQLiteConnection) it.next()).e) {
                return null;
            }
        }
        SQLiteConnection sQLiteConnectionM = m(this.f18667d, true);
        g(sQLiteConnectionM, i);
        return sQLiteConnectionM;
    }

    public final void D() {
        SQLiteConnection sQLiteConnectionC;
        ConnectionWaiter connectionWaiter = this.i;
        ConnectionWaiter connectionWaiter2 = null;
        boolean z4 = false;
        boolean z5 = false;
        while (connectionWaiter != null) {
            boolean z8 = true;
            if (this.f) {
                try {
                    if (connectionWaiter.e || z4) {
                        sQLiteConnectionC = null;
                    } else {
                        sQLiteConnectionC = B(connectionWaiter.f18679g, connectionWaiter.f);
                        if (sQLiteConnectionC == null) {
                            z4 = true;
                        }
                    }
                    if (sQLiteConnectionC == null && !z5 && (sQLiteConnectionC = C(connectionWaiter.f18679g)) == null) {
                        z5 = true;
                    }
                    if (sQLiteConnectionC != null) {
                        connectionWaiter.h = sQLiteConnectionC;
                    } else if (z4 && z5) {
                        return;
                    } else {
                        z8 = false;
                    }
                } catch (RuntimeException e) {
                    connectionWaiter.i = e;
                }
            }
            ConnectionWaiter connectionWaiter3 = connectionWaiter.f18676a;
            if (z8) {
                if (connectionWaiter2 != null) {
                    connectionWaiter2.f18676a = connectionWaiter3;
                } else {
                    this.i = connectionWaiter3;
                }
                connectionWaiter.f18676a = null;
                LockSupport.unpark(connectionWaiter.f18677b);
            } else {
                connectionWaiter2 = connectionWaiter;
            }
            connectionWaiter = connectionWaiter3;
        }
    }

    public final void b() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c((SQLiteConnection) arrayList.get(i));
        }
        arrayList.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f(false);
    }

    public final void f(boolean z4) {
        Throwable th2;
        CloseGuard closeGuard = this.f18665a;
        if (z4 && (th2 = closeGuard.f18645a) != null) {
            Log.w("A resource was acquired at attached stack trace but never released. See java.io.Closeable for information on avoiding resource leaks.", th2);
        }
        this.f18665a.f18645a = null;
        if (z4) {
            return;
        }
        synchronized (this.f18666b) {
            try {
                z();
                this.f = false;
                b();
                SQLiteConnection sQLiteConnection = this.f18669k;
                if (sQLiteConnection != null) {
                    c(sQLiteConnection);
                    this.f18669k = null;
                }
                int size = this.f18670l.size();
                if (size != 0) {
                    Log.i("SQLiteConnectionPool", "The connection pool for " + this.f18667d.f18696b + " has been closed but there are still " + size + " connections in use.  They will be closed as they are released back to the pool.");
                }
                D();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            f(true);
        } finally {
            super.finalize();
        }
    }

    public final void g(SQLiteConnection sQLiteConnection, int i) {
        try {
            sQLiteConnection.f18652k = (i & 1) != 0;
            this.f18670l.put(sQLiteConnection, AcquiredConnectionStatus.f18673a);
        } catch (RuntimeException e) {
            Log.e("SQLiteConnectionPool", "Failed to prepare acquired connection for session, closing it: " + sQLiteConnection + ", connectionFlags=" + i);
            c(sQLiteConnection);
            throw e;
        }
    }

    public final void i(int i, long j) {
        int i4;
        String string;
        Thread threadCurrentThread = Thread.currentThread();
        StringBuilder sb2 = new StringBuilder("The connection pool for database '");
        sb2.append(this.f18667d.f18696b);
        sb2.append("' has been unable to grant a connection to thread ");
        sb2.append(threadCurrentThread.getId());
        sb2.append(" (");
        sb2.append(threadCurrentThread.getName());
        sb2.append(") with flags 0x");
        sb2.append(Integer.toHexString(i));
        sb2.append(" for ");
        sb2.append(j * 0.001f);
        sb2.append(" seconds.\n");
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        if (this.f18670l.isEmpty()) {
            i4 = 0;
        } else {
            Iterator it = this.f18670l.keySet().iterator();
            i4 = 0;
            while (it.hasNext()) {
                SQLiteConnection.OperationLog operationLog = ((SQLiteConnection) it.next()).i;
                synchronized (operationLog.f18658a) {
                    try {
                        SQLiteConnection.Operation operation = operationLog.f18658a[operationLog.f18659b];
                        if (operation == null || operation.f18657g) {
                            string = null;
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            operation.a(sb3);
                            string = sb3.toString();
                        }
                    } finally {
                    }
                }
                if (string != null) {
                    arrayList.add(string);
                    i6++;
                } else {
                    i4++;
                }
            }
        }
        int size = this.j.size();
        if (this.f18669k != null) {
            size++;
        }
        c.y(sb2, "Connections: ", i6, " active, ", i4);
        sb2.append(" idle, ");
        sb2.append(size);
        sb2.append(" available.\n");
        if (!arrayList.isEmpty()) {
            sb2.append("\nRequests in progress:\n");
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a.C(sb2, "  ", (String) it2.next(), Global.NEWLINE);
            }
        }
        Log.w("SQLiteConnectionPool", sb2.toString());
    }

    public final void k(AcquiredConnectionStatus acquiredConnectionStatus) {
        WeakHashMap weakHashMap = this.f18670l;
        if (weakHashMap.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(weakHashMap.size());
        for (Map.Entry entry : weakHashMap.entrySet()) {
            AcquiredConnectionStatus acquiredConnectionStatus2 = (AcquiredConnectionStatus) entry.getValue();
            if (acquiredConnectionStatus != acquiredConnectionStatus2 && acquiredConnectionStatus2 != AcquiredConnectionStatus.c) {
                arrayList.add((SQLiteConnection) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            weakHashMap.put((SQLiteConnection) arrayList.get(i), acquiredConnectionStatus);
        }
    }

    public final SQLiteConnection m(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, boolean z4) {
        int i = this.f18668g;
        this.f18668g = i + 1;
        SQLiteConnection sQLiteConnection = new SQLiteConnection(this, sQLiteDatabaseConfiguration, i, z4);
        try {
            sQLiteConnection.p();
            return sQLiteConnection;
        } catch (SQLiteException e) {
            sQLiteConnection.g(false);
            throw e;
        }
    }

    public final void q(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("configuration must not be null.");
        }
        synchronized (this.f18666b) {
            try {
                z();
                boolean z4 = ((sQLiteDatabaseConfiguration.c ^ this.f18667d.c) & C.BUFFER_FLAG_LAST_SAMPLE) != 0;
                if (z4) {
                    if (!this.f18670l.isEmpty()) {
                        throw new IllegalStateException("Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                    }
                    b();
                }
                if (sQLiteDatabaseConfiguration.f != this.f18667d.f && !this.f18670l.isEmpty()) {
                    throw new IllegalStateException("Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                }
                if (!Arrays.equals(sQLiteDatabaseConfiguration.f18698g, this.f18667d.f18698g)) {
                    this.f18669k.e(sQLiteDatabaseConfiguration.f18698g);
                    this.f18667d.a(sQLiteDatabaseConfiguration);
                    b();
                    r();
                }
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.f18667d;
                if (sQLiteDatabaseConfiguration2.c != sQLiteDatabaseConfiguration.c) {
                    if (z4) {
                        b();
                        SQLiteConnection sQLiteConnection = this.f18669k;
                        if (sQLiteConnection != null) {
                            c(sQLiteConnection);
                            this.f18669k = null;
                        }
                    }
                    SQLiteConnection sQLiteConnectionM = m(sQLiteDatabaseConfiguration, true);
                    b();
                    SQLiteConnection sQLiteConnection2 = this.f18669k;
                    if (sQLiteConnection2 != null) {
                        c(sQLiteConnection2);
                        this.f18669k = null;
                    }
                    k(AcquiredConnectionStatus.c);
                    this.f18669k = sQLiteConnectionM;
                    this.f18667d.a(sQLiteDatabaseConfiguration);
                    y();
                } else {
                    sQLiteDatabaseConfiguration2.a(sQLiteDatabaseConfiguration);
                    y();
                    ArrayList arrayList = this.j;
                    int size = arrayList.size();
                    while (true) {
                        int i = size - 1;
                        if (size <= this.e - 1) {
                            break;
                        }
                        c((SQLiteConnection) arrayList.remove(i));
                        size = i;
                    }
                    r();
                }
                D();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void r() {
        SQLiteConnection sQLiteConnection = this.f18669k;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f18667d;
        if (sQLiteConnection != null) {
            try {
                sQLiteConnection.r(sQLiteDatabaseConfiguration);
            } catch (RuntimeException e) {
                Log.e("SQLiteConnectionPool", "Failed to reconfigure available primary connection, closing it: " + this.f18669k, e);
                c(this.f18669k);
                this.f18669k = null;
            }
        }
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            SQLiteConnection sQLiteConnection2 = (SQLiteConnection) arrayList.get(i);
            try {
                sQLiteConnection2.r(sQLiteDatabaseConfiguration);
            } catch (RuntimeException e7) {
                Log.e("SQLiteConnectionPool", "Failed to reconfigure available non-primary connection, closing it: " + sQLiteConnection2, e7);
                c(sQLiteConnection2);
                arrayList.remove(i);
                size--;
                i--;
            }
            i++;
        }
        k(AcquiredConnectionStatus.f18674b);
    }

    public final boolean t(SQLiteConnection sQLiteConnection, AcquiredConnectionStatus acquiredConnectionStatus) {
        AcquiredConnectionStatus acquiredConnectionStatus2 = AcquiredConnectionStatus.f18674b;
        AcquiredConnectionStatus acquiredConnectionStatus3 = AcquiredConnectionStatus.c;
        if (acquiredConnectionStatus == acquiredConnectionStatus2) {
            try {
                sQLiteConnection.r(this.f18667d);
            } catch (RuntimeException e) {
                Log.e("SQLiteConnectionPool", "Failed to reconfigure released connection, closing it: " + sQLiteConnection, e);
                acquiredConnectionStatus = acquiredConnectionStatus3;
            }
        }
        if (acquiredConnectionStatus != acquiredConnectionStatus3) {
            return true;
        }
        c(sQLiteConnection);
        return false;
    }

    public final String toString() {
        return "SQLiteConnectionPool: " + this.f18667d.f18695a;
    }

    public final void w(SQLiteConnection sQLiteConnection) {
        synchronized (this.f18666b) {
            try {
                AcquiredConnectionStatus acquiredConnectionStatus = (AcquiredConnectionStatus) this.f18670l.remove(sQLiteConnection);
                if (acquiredConnectionStatus == null) {
                    throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
                }
                if (!this.f) {
                    c(sQLiteConnection);
                } else if (sQLiteConnection.e) {
                    if (t(sQLiteConnection, acquiredConnectionStatus)) {
                        this.f18669k = sQLiteConnection;
                    }
                    D();
                } else if (this.j.size() >= this.e - 1) {
                    c(sQLiteConnection);
                } else {
                    if (t(sQLiteConnection, acquiredConnectionStatus)) {
                        this.j.add(sQLiteConnection);
                    }
                    D();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void y() {
        if ((this.f18667d.c & C.BUFFER_FLAG_LAST_SAMPLE) != 0) {
            this.e = Math.max(2, 10);
        } else {
            this.e = 1;
        }
    }

    public final void z() {
        if (!this.f) {
            throw new IllegalStateException("Cannot perform this operation because the connection pool has been closed.");
        }
    }
}
