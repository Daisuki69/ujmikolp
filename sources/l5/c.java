package L5;

import android.content.Context;
import java.io.FileOutputStream;
import java.io.InputStream;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import net.zetetic.database.sqlcipher.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f2813l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Context f2814n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.paymaya.data.preference.a f2815o;

    @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
    public final void i(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
    public final void q(SQLiteDatabase sQLiteDatabase, int i, int i4) {
    }

    public final void r() throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th2;
        InputStream inputStreamOpen;
        try {
            inputStreamOpen = this.f2814n.getAssets().open(this.m);
            try {
                fileOutputStream = new FileOutputStream(this.f2813l);
            } catch (Throwable th3) {
                fileOutputStream = null;
                th2 = th3;
            }
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStreamOpen.read(bArr);
                    if (i <= 0) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStreamOpen.close();
                        this.f2815o.f11330b.edit().putInt("key_resource_database_version", 13).apply();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th4) {
                th2 = th4;
                if (fileOutputStream != null) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                }
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                throw th2;
            }
        } catch (Throwable th5) {
            fileOutputStream = null;
            th2 = th5;
            inputStreamOpen = null;
        }
    }

    public final void t() {
        SQLiteDatabase sQLiteDatabaseB = SQLiteDatabase.B(0, this.f2813l, null, null, null, new byte[0]);
        sQLiteDatabaseB.r(" CREATE TABLE country (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, code TEXT NOT NULL, UNIQUE (code) ON CONFLICT REPLACE)", null);
        sQLiteDatabaseB.r(" CREATE TABLE income_source (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, UNIQUE (name) ON CONFLICT REPLACE)", null);
        sQLiteDatabaseB.r(" CREATE TABLE income_source_v2 (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, UNIQUE (name) ON CONFLICT REPLACE)", null);
        sQLiteDatabaseB.r("CREATE TABLE nationality (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, code TEXT NOT NULL, UNIQUE (code) ON CONFLICT REPLACE)", null);
        sQLiteDatabaseB.r(" CREATE TABLE identification_type (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, UNIQUE (name) ON CONFLICT REPLACE)", null);
        sQLiteDatabaseB.r(" CREATE TABLE work_nature (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, UNIQUE (name) ON CONFLICT REPLACE)", null);
        sQLiteDatabaseB.r(" CREATE TABLE work_nature_v2 (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, UNIQUE (name) ON CONFLICT REPLACE)", null);
        sQLiteDatabaseB.r(" CREATE TABLE account_type (_id INTEGER PRIMARY KEY AUTOINCREMENT, account_type TEXT NOT NULL, classification TEXT NOT NULL, type TEXT NOT NULL, name TEXT NOT NULL, UNIQUE(account_type,classification,name,type)ON CONFLICT REPLACE)", null);
        sQLiteDatabaseB.r(" CREATE TABLE financial_document (_id INTEGER PRIMARY KEY AUTOINCREMENT, type TEXT NOT NULL, name TEXT NOT NULL, UNIQUE (type) ON CONFLICT REPLACE)", null);
        sQLiteDatabaseB.r(" CREATE TABLE usage (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, requires_details INTEGER NOT NULL, UNIQUE (name) ON CONFLICT REPLACE)", null);
        sQLiteDatabaseB.r(" CREATE TABLE kyc_settings (_id INTEGER PRIMARY KEY AUTOINCREMENT, max_banks INTEGER NOT NULL, max_alternative_income_sources INTEGER NOT NULL, max_related_companies INTEGER NOT NULL, max_financial_docs INTEGER NOT NULL, ", null);
        sQLiteDatabaseB.r(" CREATE TABLE shop_provider_category (id INTEGER NOT NULL, name TEXT NOT NULL, code TEXT NOT NULL, priority INTEGER NOT NULL, UNIQUE (code) ON CONFLICT REPLACE)", null);
        sQLiteDatabaseB.f();
        this.f2815o.f11330b.edit().putInt("key_resource_database_version", 13).apply();
    }
}
