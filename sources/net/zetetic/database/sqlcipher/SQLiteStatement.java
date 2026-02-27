package net.zetetic.database.sqlcipher;

import android.database.sqlite.SQLiteDatabaseCorruptException;
import androidx.sqlite.db.SupportSQLiteStatement;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteStatement extends SQLiteProgram implements SupportSQLiteStatement {
    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final void execute() {
        b();
        try {
            try {
                this.f18711b.y().d(this.c, i(), this.f18713g);
            } catch (SQLiteDatabaseCorruptException e) {
                k();
                throw e;
            }
        } finally {
            f();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final long executeInsert() {
        b();
        try {
            try {
                return this.f18711b.y().g(this.c, i(), this.f18713g);
            } catch (SQLiteDatabaseCorruptException e) {
                k();
                throw e;
            }
        } finally {
            f();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final int executeUpdateDelete() {
        b();
        try {
            try {
                return this.f18711b.y().e(this.c, i(), this.f18713g);
            } catch (SQLiteDatabaseCorruptException e) {
                k();
                throw e;
            }
        } finally {
            f();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final long simpleQueryForLong() {
        b();
        try {
            try {
                return this.f18711b.y().h(this.c, i(), this.f18713g);
            } catch (SQLiteDatabaseCorruptException e) {
                k();
                throw e;
            }
        } finally {
            f();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final String simpleQueryForString() {
        b();
        try {
            try {
                return this.f18711b.y().i(this.c, i(), this.f18713g);
            } catch (SQLiteDatabaseCorruptException e) {
                k();
                throw e;
            }
        } finally {
            f();
        }
    }

    public final String toString() {
        return "SQLiteProgram: " + this.c;
    }
}
