package l4;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f18227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f18228b;

    public a(Context context) {
        super(context, "android-devices.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f18228b = context.getApplicationContext();
        File databasePath = context.getDatabasePath("android-devices.db");
        this.f18227a = databasePath;
        if (databasePath.exists()) {
            return;
        }
        b();
    }

    public final void b() {
        try {
            getReadableDatabase();
            close();
            InputStream inputStreamOpen = this.f18228b.getAssets().open("android-devices.db");
            FileOutputStream fileOutputStream = new FileOutputStream(this.f18227a);
            byte[] bArr = new byte[2048];
            while (true) {
                int i = inputStreamOpen.read(bArr);
                if (i <= 0) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, i);
                }
            }
            fileOutputStream.flush();
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
            try {
                inputStreamOpen.close();
            } catch (IOException unused2) {
            }
        } catch (IOException e) {
            throw new SQLException("Error creating android-devices.db database", e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:8|(1:10)(3:11|(1:13)|19))(1:6)|7|14|(1:16)|24|17|22|18|19) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ag.C0707q c() {
        /*
            r14 = this;
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r1 = android.os.Build.MODEL
            android.database.sqlite.SQLiteDatabase r2 = r14.getReadableDatabase()
            java.lang.String r10 = "name"
            java.lang.String r11 = "codename"
            java.lang.String r12 = "model"
            java.lang.String[] r4 = new java.lang.String[]{r10, r11, r12}
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r13 = 0
            r5 = 1
            r6 = 0
            if (r3 != 0) goto L2d
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L2d
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r3[r6] = r0
            r3[r5] = r1
            java.lang.String r0 = "codename LIKE ? OR model LIKE ?"
        L2a:
            r5 = r0
            r6 = r3
            goto L47
        L2d:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L3a
            java.lang.String[] r3 = new java.lang.String[r5]
            r3[r6] = r0
            java.lang.String r0 = "codename LIKE ?"
            goto L2a
        L3a:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7a
            java.lang.String[] r3 = new java.lang.String[r5]
            r3[r6] = r1
            java.lang.String r0 = "model LIKE ?"
            goto L2a
        L47:
            java.lang.String r3 = "devices"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r0 = r2.query(r3, r4, r5, r6, r7, r8, r9)
            boolean r1 = r0.moveToFirst()
            if (r1 == 0) goto L74
            int r1 = r0.getColumnIndexOrThrow(r10)
            java.lang.String r1 = r0.getString(r1)
            int r3 = r0.getColumnIndexOrThrow(r11)
            java.lang.String r3 = r0.getString(r3)
            int r4 = r0.getColumnIndexOrThrow(r12)
            java.lang.String r4 = r0.getString(r4)
            ag.q r5 = new ag.q
            r5.<init>(r13, r1, r3, r4)
            r13 = r5
        L74:
            r0.close()     // Catch: java.io.IOException -> L77
        L77:
            r2.close()     // Catch: java.io.IOException -> L7a
        L7a:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.a.c():ag.q");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i4) {
        if (i4 > i) {
            if (!this.f18228b.deleteDatabase("android-devices.db")) {
                File file = this.f18227a;
                if (!file.delete() && file.exists()) {
                    return;
                }
            }
            b();
        }
    }
}
