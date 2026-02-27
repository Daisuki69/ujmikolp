package net.zetetic.database.sqlcipher;

import androidx.sqlite.db.SupportSQLiteOpenHelper;

/* JADX INFO: loaded from: classes2.dex */
public class SupportOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f18724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteDatabaseHook f18725b;
    public final boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18726d;

    public SupportOpenHelperFactory(byte[] bArr) {
        this(bArr, null, false);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public final SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        int i = this.f18726d;
        if (i == -1) {
            return new SupportHelper(configuration, this.f18724a, this.f18725b, this.c);
        }
        return new SupportHelper(configuration, this.f18724a, this.f18725b, this.c, i);
    }

    public SupportOpenHelperFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z4) {
        this(bArr, sQLiteDatabaseHook, z4, -1);
    }

    public SupportOpenHelperFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z4, int i) {
        this.f18724a = bArr;
        this.f18725b = sQLiteDatabaseHook;
        this.c = z4;
        this.f18726d = i;
    }
}
