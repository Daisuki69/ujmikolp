package af;

import M8.A0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import bf.C0949b;
import bf.C0951d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: af.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0690e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Boolean f7142n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7144b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7145d;
    public final Context e;
    public h h;
    public SQLiteDatabase i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f7148l;
    public final ArrayList f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f7146g = new HashMap();
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7147k = 0;
    public int m = 0;

    public C0690e(Context context, String str, int i, int i4, boolean z4) {
        this.e = context;
        this.f7144b = str;
        this.f7143a = z4;
        this.c = i;
        this.f7145d = i4;
    }

    public static HashMap c(Cursor cursor, Integer num) {
        HashMap map = null;
        ArrayList arrayList = null;
        int columnCount = 0;
        while (cursor.moveToNext()) {
            if (map == null) {
                arrayList = new ArrayList();
                map = new HashMap();
                columnCount = cursor.getColumnCount();
                map.put("columns", Arrays.asList(cursor.getColumnNames()));
                map.put("rows", arrayList);
            }
            ArrayList arrayList2 = new ArrayList(columnCount);
            for (int i = 0; i < columnCount; i++) {
                int type = cursor.getType(i);
                arrayList2.add(type != 1 ? type != 2 ? type != 3 ? type != 4 ? null : cursor.getBlob(i) : cursor.getString(i) : Double.valueOf(cursor.getDouble(i)) : Long.valueOf(cursor.getLong(i)));
            }
            arrayList.add(arrayList2);
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return map == null ? new HashMap() : map;
    }

    public final void a() {
        HashMap map = this.f7146g;
        if (!map.isEmpty() && this.f7145d >= 1) {
            Log.d("Sqflite", h() + map.size() + " cursor(s) are left opened");
        }
        this.i.close();
    }

    public final void b(i iVar) {
        try {
            int i = iVar.f7154a;
            if (AbstractC0686a.a(this.f7145d)) {
                Log.d("Sqflite", h() + "closing cursor " + i);
            }
            this.f7146g.remove(Integer.valueOf(i));
            iVar.c.close();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(M8.A0 r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: af.C0690e.d(M8.A0):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [af.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [M8.A0] */
    public final boolean e(A0 a02) throws Throwable {
        Integer num = (Integer) a02.l("cursorPageSize");
        String str = (String) a02.l("sql");
        ?? mVar = new m(str, (List) a02.l("arguments"));
        if (this.f7145d >= 1) {
            Log.d("Sqflite", h() + mVar);
        }
        i iVar = null;
        try {
            try {
                mVar = this.i.rawQueryWithFactory(new C0688c(mVar, 0), str, AbstractC0686a.f7137a, null);
                try {
                    HashMap mapC = c(mVar, num);
                    if (num != null && !mVar.isLast() && !mVar.isAfterLast()) {
                        int i = this.m + 1;
                        this.m = i;
                        mapC.put("cursorId", Integer.valueOf(i));
                        i iVar2 = new i(i, num.intValue(), mVar);
                        try {
                            this.f7146g.put(Integer.valueOf(i), iVar2);
                            iVar = iVar2;
                        } catch (Exception e) {
                            e = e;
                            iVar = iVar2;
                            i(e, a02);
                            if (iVar != null) {
                                b(iVar);
                            }
                            if (iVar != null || mVar == 0) {
                                return false;
                            }
                            mVar.close();
                            return false;
                        } catch (Throwable th2) {
                            th = th2;
                            iVar = iVar2;
                            if (iVar == null && mVar != 0) {
                                mVar.close();
                            }
                            throw th;
                        }
                    }
                    a02.a(mapC);
                    if (iVar == null) {
                        mVar.close();
                    }
                    return true;
                } catch (Exception e7) {
                    e = e7;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e10) {
            e = e10;
            mVar = 0;
        } catch (Throwable th4) {
            th = th4;
            mVar = 0;
        }
    }

    public final boolean f(A0 a02) throws Throwable {
        if (g(a02)) {
            Cursor cursor = null;
            try {
                if (a02.p()) {
                    a02.a(null);
                    return true;
                }
                try {
                    Cursor cursorRawQuery = this.i.rawQuery("SELECT changes()", null);
                    if (cursorRawQuery != null) {
                        try {
                            if (cursorRawQuery.getCount() > 0 && cursorRawQuery.moveToFirst()) {
                                int i = cursorRawQuery.getInt(0);
                                if (this.f7145d >= 1) {
                                    Log.d("Sqflite", h() + "changed " + i);
                                }
                                a02.a(Integer.valueOf(i));
                                cursorRawQuery.close();
                                return true;
                            }
                        } catch (Exception e) {
                            e = e;
                            cursor = cursorRawQuery;
                            i(e, a02);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return false;
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorRawQuery;
                        }
                    }
                    Log.e("Sqflite", h() + "fail to read changes for Update/Delete");
                    a02.a(null);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return true;
                } catch (Exception e7) {
                    e = e7;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return false;
    }

    public final boolean g(A0 a02) {
        String str = (String) a02.l("sql");
        m mVar = new m(str, (List) a02.l("arguments"));
        if (this.f7145d >= 1) {
            Log.d("Sqflite", h() + mVar);
        }
        Object objL = a02.l("inTransaction");
        Boolean bool = objL instanceof Boolean ? (Boolean) objL : null;
        try {
            SQLiteDatabase sQLiteDatabase = this.i;
            ArrayList arrayList = new ArrayList();
            List list = mVar.f7170b;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(m.a(it.next()));
                }
            }
            sQLiteDatabase.execSQL(str, arrayList.toArray(new Object[0]));
            synchronized (this) {
                try {
                    if (Boolean.TRUE.equals(bool)) {
                        this.j++;
                    } else if (Boolean.FALSE.equals(bool)) {
                        this.j--;
                    }
                } finally {
                }
            }
            return true;
        } catch (Exception e) {
            i(e, a02);
            return false;
        }
    }

    public final String h() {
        StringBuilder sb2 = new StringBuilder("[");
        Thread threadCurrentThread = Thread.currentThread();
        sb2.append(this.c + "," + threadCurrentThread.getName() + "(" + threadCurrentThread.getId() + ")");
        sb2.append("] ");
        return sb2.toString();
    }

    public final void i(Exception exc, A0 a02) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            a02.b("open_failed " + this.f7144b, null);
            return;
        }
        if (exc instanceof SQLException) {
            String message = exc.getMessage();
            String str = (String) a02.l("sql");
            Collection arrayList = (List) a02.l("arguments");
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            HashMap map = new HashMap();
            map.put("sql", str);
            map.put("arguments", arrayList);
            a02.b(message, map);
            return;
        }
        String message2 = exc.getMessage();
        String str2 = (String) a02.l("sql");
        Collection arrayList2 = (List) a02.l("arguments");
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        HashMap map2 = new HashMap();
        map2.put("sql", str2);
        map2.put("arguments", arrayList2);
        a02.b(message2, map2);
    }

    public final synchronized boolean j() {
        return this.j > 0;
    }

    public final void k() {
        if (f7142n == null) {
            Context context = this.e;
            boolean z4 = false;
            try {
                String packageName = context.getPackageName();
                if ((Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(128L)) : context.getPackageManager().getApplicationInfo(packageName, 128)).metaData.getBoolean("com.tekartik.sqflite.wal_enabled", false)) {
                    z4 = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            f7142n = Boolean.valueOf(z4);
            if (z4 && AbstractC0686a.a(this.f7145d)) {
                Log.d("Sqflite", h() + "[sqflite] WAL enabled");
            }
        }
        this.i = SQLiteDatabase.openDatabase(this.f7144b, null, f7142n.booleanValue() ? 805306368 : 268435456);
    }

    public final void l(C0949b c0949b, Runnable runnable) {
        Integer num = (Integer) c0949b.l("transactionId");
        Integer num2 = this.f7148l;
        if (num2 == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f;
        if (num == null || !(num.equals(num2) || num.intValue() == -1)) {
            arrayList.add(new C0951d(runnable));
            return;
        }
        runnable.run();
        if (this.f7148l != null || arrayList.isEmpty()) {
            return;
        }
        this.h.b(this, new E8.l(this, 11));
    }
}
