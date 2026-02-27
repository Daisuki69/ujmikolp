package net.zetetic.database.sqlcipher;

import android.database.CursorWindow;
import android.database.DatabaseUtils;
import android.os.CancellationSignal;
import net.zetetic.database.sqlcipher.SQLiteConnectionPool;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteConnectionPool f18714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SQLiteConnection f18715b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18716d;
    public Transaction e;
    public Transaction f;

    public static final class Transaction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Transaction f18717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18718b;
        public SQLiteTransactionListener c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f18719d;
        public boolean e;
    }

    public SQLiteSession(SQLiteConnectionPool sQLiteConnectionPool) {
        if (sQLiteConnectionPool == null) {
            throw new IllegalArgumentException("connectionPool must not be null");
        }
        this.f18714a = sQLiteConnectionPool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f5  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r21, int r22, android.os.CancellationSignal r23) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.zetetic.database.sqlcipher.SQLiteSession.a(java.lang.String, int, android.os.CancellationSignal):void");
    }

    public final void b(int i, SQLiteTransactionListener sQLiteTransactionListener, int i4, CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        if (this.f == null) {
            a(null, i4, cancellationSignal);
        }
        try {
            if (this.f == null) {
                if (i == 1) {
                    this.f18715b.h("BEGIN IMMEDIATE;", null, cancellationSignal);
                } else if (i != 2) {
                    this.f18715b.h("BEGIN;", null, cancellationSignal);
                } else {
                    this.f18715b.h("BEGIN EXCLUSIVE;", null, cancellationSignal);
                }
            }
            if (sQLiteTransactionListener != null) {
                try {
                    sQLiteTransactionListener.c();
                } catch (RuntimeException e) {
                    if (this.f == null) {
                        this.f18715b.h("ROLLBACK;", null, cancellationSignal);
                    }
                    throw e;
                }
            }
            Transaction transaction = this.e;
            if (transaction != null) {
                this.e = transaction.f18717a;
                transaction.f18717a = null;
                transaction.f18719d = false;
                transaction.e = false;
            } else {
                transaction = new Transaction();
            }
            transaction.f18718b = i;
            transaction.c = sQLiteTransactionListener;
            transaction.f18717a = this.f;
            this.f = transaction;
        } catch (Throwable th2) {
            if (this.f == null) {
                k();
            }
            throw th2;
        }
    }

    public final void c(CancellationSignal cancellationSignal, boolean z4) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        Transaction transaction = this.f;
        boolean z5 = false;
        boolean z8 = (transaction.f18719d || z4) && !transaction.e;
        SQLiteTransactionListener sQLiteTransactionListener = transaction.c;
        if (sQLiteTransactionListener != null) {
            try {
                if (z8) {
                    sQLiteTransactionListener.a();
                } else {
                    sQLiteTransactionListener.d();
                }
                z5 = z8;
                e = null;
            } catch (RuntimeException e) {
                e = e;
            }
        } else {
            z5 = z8;
            e = null;
        }
        Transaction transaction2 = transaction.f18717a;
        this.f = transaction2;
        transaction.f18717a = this.e;
        transaction.c = null;
        this.e = transaction;
        if (transaction2 == null) {
            try {
                if (z5) {
                    this.f18715b.h("COMMIT;", null, cancellationSignal);
                } else {
                    this.f18715b.h("ROLLBACK;", null, cancellationSignal);
                }
                k();
            } catch (Throwable th2) {
                k();
                throw th2;
            }
        } else if (!z5) {
            transaction2.e = true;
        }
        if (e != null) {
            throw e;
        }
    }

    public final void d(String str, int i, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (j(str, i, null)) {
            return;
        }
        a(str, i, null);
        try {
            this.f18715b.h(str, objArr, null);
        } finally {
            k();
        }
    }

    public final int e(String str, int i, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (j(str, i, null)) {
            return 0;
        }
        a(str, i, null);
        try {
            return this.f18715b.i(str, objArr);
        } finally {
            k();
        }
    }

    public final int f(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i4, boolean z4, int i6, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (cursorWindow == null) {
            throw new IllegalArgumentException("window must not be null.");
        }
        if (j(str, i6, cancellationSignal)) {
            cursorWindow.clear();
            return 0;
        }
        a(str, i6, cancellationSignal);
        try {
            return this.f18715b.j(str, objArr, cursorWindow, i, i4, z4, cancellationSignal);
        } finally {
            k();
        }
    }

    public final long g(String str, int i, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (j(str, i, null)) {
            return 0L;
        }
        a(str, i, null);
        try {
            return this.f18715b.k(str, objArr);
        } finally {
            k();
        }
    }

    public final long h(String str, int i, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (j(str, i, null)) {
            return 0L;
        }
        a(str, i, null);
        try {
            return this.f18715b.l(str, objArr);
        } finally {
            k();
        }
    }

    public final String i(String str, int i, Object[] objArr) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (j(str, i, null)) {
            return null;
        }
        a(str, i, null);
        try {
            return this.f18715b.m(str, objArr);
        } finally {
            k();
        }
    }

    public final boolean j(String str, int i, CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        int sqlStatementType = DatabaseUtils.getSqlStatementType(str);
        if (sqlStatementType == 4) {
            l();
            b(2, null, i, cancellationSignal);
            return true;
        }
        if (sqlStatementType != 5) {
            if (sqlStatementType != 6) {
                return false;
            }
            if (this.f == null) {
                throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
            }
            c(cancellationSignal, false);
            return true;
        }
        if (this.f == null) {
            throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
        l();
        Transaction transaction = this.f;
        transaction.f18719d = true;
        if (transaction == null) {
            throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
        c(cancellationSignal, false);
        return true;
    }

    public final void k() {
        int i = this.f18716d - 1;
        this.f18716d = i;
        if (i == 0) {
            try {
                this.f18714a.w(this.f18715b);
            } finally {
                this.f18715b = null;
            }
        }
    }

    public final void l() {
        Transaction transaction = this.f;
        if (transaction != null && transaction.f18719d) {
            throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
        }
    }

    public final boolean m(long j) {
        boolean z4;
        if (this.f == null) {
            throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
        l();
        Transaction transaction = this.f;
        if (transaction != null && transaction.f18717a != null) {
            throw new IllegalStateException("Cannot perform this operation because a nested transaction is in progress.");
        }
        if (!transaction.e) {
            SQLiteConnectionPool sQLiteConnectionPool = this.f18714a;
            SQLiteConnection sQLiteConnection = this.f18715b;
            int i = this.c;
            synchronized (sQLiteConnectionPool.f18666b) {
                try {
                    if (!sQLiteConnectionPool.f18670l.containsKey(sQLiteConnection)) {
                        throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
                    }
                    if (sQLiteConnectionPool.f) {
                        boolean z5 = sQLiteConnection.e;
                        SQLiteConnectionPool.ConnectionWaiter connectionWaiter = sQLiteConnectionPool.i;
                        if (connectionWaiter == null) {
                            z4 = false;
                        } else {
                            int i4 = (i & 4) != 0 ? 1 : 0;
                            while (i4 <= connectionWaiter.f18678d) {
                                if (!z5 && connectionWaiter.e) {
                                    connectionWaiter = connectionWaiter.f18676a;
                                    if (connectionWaiter == null) {
                                        break;
                                    }
                                }
                                z4 = true;
                            }
                            z4 = false;
                        }
                    } else {
                        z4 = false;
                    }
                } finally {
                }
            }
            if (z4) {
                Transaction transaction2 = this.f;
                int i6 = transaction2.f18718b;
                SQLiteTransactionListener sQLiteTransactionListener = transaction2.c;
                int i10 = this.c;
                c(null, true);
                if (j > 0) {
                    try {
                        Thread.sleep(j);
                    } catch (InterruptedException unused) {
                    }
                }
                b(i6, sQLiteTransactionListener, i10, null);
                return true;
            }
        }
        return false;
    }
}
