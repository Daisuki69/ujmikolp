package net.zetetic.database.sqlcipher;

import We.s;
import android.database.DatabaseUtils;
import android.os.CancellationSignal;
import android.util.EventLog;
import androidx.camera.core.impl.a;
import androidx.sqlite.db.SupportSQLiteProgram;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SQLiteProgram extends SQLiteClosable implements SupportSQLiteProgram {
    public static final String[] h = new String[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteDatabase f18711b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18712d;
    public final String[] e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object[] f18713g;

    public SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
        this.f18711b = sQLiteDatabase;
        String strTrim = str.trim();
        this.c = strTrim;
        int sqlStatementType = DatabaseUtils.getSqlStatementType(strTrim);
        if (sqlStatementType == 4 || sqlStatementType == 5 || sqlStatementType == 6) {
            this.f18712d = false;
            this.e = h;
            this.f = 0;
        } else {
            boolean z4 = sqlStatementType == 1;
            SQLiteStatementInfo sQLiteStatementInfo = new SQLiteStatementInfo();
            SQLiteSession sQLiteSessionY = sQLiteDatabase.y();
            int iW = SQLiteDatabase.w(z4);
            sQLiteSessionY.getClass();
            if (strTrim == null) {
                throw new IllegalArgumentException("sql must not be null.");
            }
            if (cancellationSignal != null) {
                cancellationSignal.throwIfCanceled();
            }
            sQLiteSessionY.a(strTrim, iW, cancellationSignal);
            try {
                sQLiteSessionY.f18715b.q(strTrim, sQLiteStatementInfo);
                sQLiteSessionY.k();
                this.f18712d = sQLiteStatementInfo.c;
                this.e = sQLiteStatementInfo.f18721b;
                this.f = sQLiteStatementInfo.f18720a;
            } catch (Throwable th2) {
                sQLiteSessionY.k();
                throw th2;
            }
        }
        if (objArr != null && objArr.length > this.f) {
            StringBuilder sb2 = new StringBuilder("Too many bind arguments.  ");
            sb2.append(objArr.length);
            sb2.append(" arguments were provided but the statement needs ");
            throw new IllegalArgumentException(s.o(sb2, " arguments.", this.f));
        }
        int i = this.f;
        if (i == 0) {
            this.f18713g = null;
            return;
        }
        Object[] objArr2 = new Object[i];
        this.f18713g = objArr2;
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindBlob(int i, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException(s.g(i, "the bind value at index ", " is null"));
        }
        g(i, bArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindDouble(int i, double d10) {
        g(i, Double.valueOf(d10));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindLong(int i, long j) {
        g(i, Long.valueOf(j));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindNull(int i) {
        g(i, null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindString(int i, String str) {
        if (str == null) {
            throw new IllegalArgumentException(s.g(i, "the bind value at index ", " is null"));
        }
        g(i, str);
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteClosable
    public final void c() {
        clearBindings();
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void clearBindings() {
        Object[] objArr = this.f18713g;
        if (objArr != null) {
            Arrays.fill(objArr, (Object) null);
        }
    }

    public final void g(int i, Object obj) {
        int i4 = this.f;
        if (i < 1 || i > i4) {
            throw new IllegalArgumentException(a.h("Cannot bind argument at index ", i, " because the index is out of range.  The statement has ", i4, " parameters."));
        }
        this.f18713g[i - 1] = obj;
    }

    public final int i() {
        this.f18711b.getClass();
        return SQLiteDatabase.w(this.f18712d);
    }

    public final void k() {
        String str;
        SQLiteDatabase sQLiteDatabase = this.f18711b;
        synchronized (sQLiteDatabase.e) {
            str = sQLiteDatabase.f18688g.f18696b;
        }
        EventLog.writeEvent(75004, str);
        sQLiteDatabase.f18687d.a(sQLiteDatabase);
    }
}
