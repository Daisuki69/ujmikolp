package net.zetetic.database.sqlcipher;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteDatabaseConfiguration {
    public static final Pattern j = Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18696b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18697d;
    public Locale e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f18698g;
    public SQLiteDatabaseHook h;
    public final ArrayList i;

    public SQLiteDatabaseConfiguration(String str, int i) {
        this(str, i, null, null);
    }

    public final void a(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("other must not be null.");
        }
        if (!this.f18695a.equals(sQLiteDatabaseConfiguration.f18695a)) {
            throw new IllegalArgumentException("other configuration must refer to the same database.");
        }
        this.c = sQLiteDatabaseConfiguration.c;
        this.f18697d = sQLiteDatabaseConfiguration.f18697d;
        this.e = sQLiteDatabaseConfiguration.e;
        this.f = sQLiteDatabaseConfiguration.f;
        this.f18698g = sQLiteDatabaseConfiguration.f18698g;
        this.h = sQLiteDatabaseConfiguration.h;
        ArrayList arrayList = this.i;
        arrayList.clear();
        arrayList.addAll(sQLiteDatabaseConfiguration.i);
    }

    public SQLiteDatabaseConfiguration(String str, int i, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this.i = new ArrayList();
        if (str == null) {
            throw new IllegalArgumentException("path must not be null.");
        }
        this.f18695a = str;
        int iIndexOf = str.indexOf(63);
        str = iIndexOf >= 0 ? (String) str.subSequence(0, iIndexOf) : str;
        this.f18696b = str.indexOf(64) != -1 ? j.matcher(str).replaceAll("XX@YY") : str;
        this.c = i;
        this.f18698g = bArr;
        this.h = sQLiteDatabaseHook;
        this.f18697d = 25;
        this.e = Locale.getDefault();
    }

    public SQLiteDatabaseConfiguration(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.i = new ArrayList();
        if (sQLiteDatabaseConfiguration != null) {
            this.f18695a = sQLiteDatabaseConfiguration.f18695a;
            this.f18696b = sQLiteDatabaseConfiguration.f18696b;
            a(sQLiteDatabaseConfiguration);
            return;
        }
        throw new IllegalArgumentException("other must not be null.");
    }
}
