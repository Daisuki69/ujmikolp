package H;

import D.S;
import We.s;
import Z.v;
import a.AbstractC0617a;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.dynatrace.android.agent.Global;
import dOYHB6.tiZVw8.numX49;
import e2.C1421c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile C1421c f2058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f2059b;
    public final d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2060d;

    public b(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        String strTnTj78;
        j.g(context, numX49.tnTj78("PaU"));
        S sC = cleverTapInstanceConfig.c();
        this.f2059b = sC;
        if (cleverTapInstanceConfig.f9447p) {
            strTnTj78 = numX49.tnTj78("Pae");
        } else {
            strTnTj78 = numX49.tnTj78("Pa8") + cleverTapInstanceConfig.f9439a;
        }
        j.f(sC, numX49.tnTj78("PaC"));
        this.c = new d(context, cleverTapInstanceConfig, strTnTj78, sC);
        this.f2060d = true;
    }

    public final void a(e eVar, long j) {
        String strTnTj78 = numX49.tnTj78("Pa4");
        long jCurrentTimeMillis = (System.currentTimeMillis() - j) / ((long) 1000);
        String str = eVar.f2067a;
        try {
            this.c.getWritableDatabase().delete(str, strTnTj78 + jCurrentTimeMillis, null);
        } catch (SQLiteException e) {
            String strJ = s.j(numX49.tnTj78("Pao"), str, numX49.tnTj78("PaK"));
            this.f2059b.getClass();
            S.r(strJ, e);
            e();
        }
    }

    public final synchronized void b() {
        a(e.f2066d, 0L);
    }

    public final synchronized void c(String lastId, e eVar) {
        String strTnTj78 = numX49.tnTj78("Paw");
        synchronized (this) {
            j.g(lastId, "lastId");
            String str = eVar.f2067a;
            try {
                this.c.getWritableDatabase().delete(str, "_id <= ?", new String[]{lastId});
            } catch (SQLiteException unused) {
                this.f2059b.getClass();
                S.q(strTnTj78 + str + " Recreating DB");
                e();
            }
        }
    }

    public final synchronized void d(e eVar) {
        a(eVar, 432000000L);
    }

    public final void e() {
        d dVar = this.c;
        dVar.close();
        if (dVar.f2064d.delete()) {
            return;
        }
        dVar.c.getClass();
        S.f(numX49.tnTj78("Pac"));
    }

    public final synchronized B1.a f() {
        B1.a aVar;
        try {
            aVar = new B1.a(1);
            B1.a aVarG = g(e.c, 50);
            int length = ((JSONArray) aVarG.c).length();
            for (int i = 0; i < length; i++) {
                ((JSONArray) aVar.c).put(((JSONArray) aVarG.c).getJSONObject(i));
            }
            ((ArrayList) aVar.e).addAll((ArrayList) aVarG.e);
            aVar.f336b = aVarG.f336b;
            int size = 50 - ((ArrayList) aVar.e).size();
            if (size > 0 || !aVar.f336b) {
                B1.a aVarG2 = g(e.f2065b, size);
                int length2 = ((JSONArray) aVarG2.c).length();
                for (int i4 = 0; i4 < length2; i4++) {
                    ((JSONArray) aVar.c).put(((JSONArray) aVarG2.c).getJSONObject(i4));
                }
                ((ArrayList) aVar.f337d).addAll((ArrayList) aVarG2.f337d);
                aVar.f336b = aVarG2.f336b;
            }
            S s9 = this.f2059b;
            String str = "Fetched combined batch: " + ((ArrayList) aVar.e).size() + " profile events, " + ((ArrayList) aVar.f337d).size() + " events";
            s9.getClass();
            S.q(str);
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public final synchronized B1.a g(e eVar, int i) {
        B1.a aVar;
        aVar = new B1.a(1);
        String str = eVar.f2067a;
        try {
            Cursor cursorQuery = this.c.getReadableDatabase().query(str, new String[]{"_id", "data", MPDbAdapter.KEY_CREATED_AT}, null, null, null, null, "created_at ASC", String.valueOf(i + 1));
            if (cursorQuery != null) {
                try {
                    aVar.f336b = cursorQuery.getCount() > i;
                    for (int i4 = 0; cursorQuery.moveToNext() && i4 != i; i4++) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_id"));
                        try {
                            ((JSONArray) aVar.c).put(new JSONObject(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("data"))));
                            if (eVar == e.c) {
                                ArrayList arrayList = (ArrayList) aVar.e;
                                j.d(string);
                                arrayList.add(string);
                            } else {
                                ArrayList arrayList2 = (ArrayList) aVar.f337d;
                                j.d(string);
                                arrayList2.add(string);
                            }
                        } catch (JSONException e) {
                            this.f2059b.getClass();
                            S.r("Error parsing event data for id: " + string + " from table: " + str, e);
                        }
                    }
                    Unit unit = Unit.f18162a;
                    cursorQuery.close();
                } finally {
                }
            }
        } catch (Exception e7) {
            this.f2059b.getClass();
            S.r("Could not fetch records from table " + str, e7);
        }
        int size = eVar == e.c ? ((ArrayList) aVar.e).size() : ((ArrayList) aVar.f337d).size();
        this.f2059b.getClass();
        S.q("Fetched " + size + " events from " + str);
        return aVar;
    }

    public final String h(String str) {
        Exception exc;
        S s9 = this.f2059b;
        String strTnTj78 = numX49.tnTj78("Pam");
        e eVar = e.f2065b;
        String strTnTj782 = numX49.tnTj78("PaD");
        String strTnTj783 = numX49.tnTj78("Pah");
        try {
            Cursor cursorQuery = this.c.getReadableDatabase().query(strTnTj782, null, "data =?", new String[]{str}, null, null, null);
            if (cursorQuery == null) {
                return strTnTj783;
            }
            try {
                if (cursorQuery.moveToFirst()) {
                    strTnTj783 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("data"));
                }
                s9.getClass();
                S.q(strTnTj78 + strTnTj783);
                Unit unit = Unit.f18162a;
                cursorQuery.close();
                return strTnTj783;
            } catch (Throwable th2) {
                String str2 = strTnTj783;
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        AbstractC0617a.p(cursorQuery, th2);
                        throw th3;
                    } catch (Exception e) {
                        exc = e;
                        strTnTj783 = str2;
                    }
                }
            }
        } catch (Exception e7) {
            exc = e7;
        }
        s9.getClass();
        S.r(numX49.tnTj78("PaM"), exc);
        return strTnTj783;
    }

    public final synchronized String[] i() {
        if (!this.f2060d) {
            return new String[0];
        }
        e eVar = e.f2065b;
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorQuery = this.c.getReadableDatabase().query("pushNotifications", null, "isRead = 0", null, null, null, null);
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    try {
                        int columnIndex = cursorQuery.getColumnIndex("data");
                        if (columnIndex >= 0) {
                            String string = cursorQuery.getString(columnIndex);
                            this.f2059b.getClass();
                            S.q("Fetching PID - " + string);
                            arrayList.add(string);
                        }
                    } finally {
                    }
                }
                Unit unit = Unit.f18162a;
                cursorQuery.close();
            }
        } catch (SQLiteException e) {
            this.f2059b.getClass();
            S.r("Could not fetch records out of database pushNotifications.", e);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized org.json.JSONObject j(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            r1 = 0
            if (r11 == 0) goto L6f
            if (r12 != 0) goto L8
            goto L6f
        L8:
            H.e r0 = H.e.f2065b     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = "userProfiles"
            H.d r0 = r10.c     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L56
            android.database.sqlite.SQLiteDatabase r2 = r0.getReadableDatabase()     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L56
            java.lang.String r5 = "_id = ? AND deviceID = ?"
            java.lang.String[] r6 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L56
            r4 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L56
            if (r11 == 0) goto L54
            boolean r12 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L36
            if (r12 == 0) goto L3a
            java.lang.String r12 = "data"
            int r12 = r11.getColumnIndex(r12)     // Catch: java.lang.Throwable -> L36
            if (r12 < 0) goto L3a
            java.lang.String r12 = r11.getString(r12)     // Catch: java.lang.Throwable -> L36
            goto L3b
        L36:
            r0 = move-exception
            r12 = r0
            r2 = r1
            goto L47
        L3a:
            r12 = r1
        L3b:
            kotlin.Unit r0 = kotlin.Unit.f18162a     // Catch: java.lang.Throwable -> L44
            r11.close()     // Catch: android.database.sqlite.SQLiteException -> L41 java.lang.Throwable -> L4d
            goto L63
        L41:
            r0 = move-exception
            r11 = r0
            goto L59
        L44:
            r0 = move-exception
            r2 = r12
            r12 = r0
        L47:
            throw r12     // Catch: java.lang.Throwable -> L48
        L48:
            r0 = move-exception
            a.AbstractC0617a.p(r11, r12)     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L50
            throw r0     // Catch: java.lang.Throwable -> L4d android.database.sqlite.SQLiteException -> L50
        L4d:
            r0 = move-exception
            r11 = r0
            goto L6d
        L50:
            r0 = move-exception
            r11 = r0
            r12 = r2
            goto L59
        L54:
            r12 = r1
            goto L63
        L56:
            r0 = move-exception
            r11 = r0
            r12 = r1
        L59:
            D.S r0 = r10.f2059b     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = "Could not fetch records out of database userProfiles."
            r0.getClass()     // Catch: java.lang.Throwable -> L4d
            D.S.r(r2, r11)     // Catch: java.lang.Throwable -> L4d
        L63:
            if (r12 == 0) goto L6b
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4d org.json.JSONException -> L6b
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L4d org.json.JSONException -> L6b
            r1 = r11
        L6b:
            monitor-exit(r10)
            return r1
        L6d:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L4d
            throw r11
        L6f:
            monitor-exit(r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: H.b.j(java.lang.String, java.lang.String):org.json.JSONObject");
    }

    public final synchronized ArrayList k(String userId) {
        ArrayList arrayList;
        j.g(userId, "userId");
        e eVar = e.f2065b;
        arrayList = new ArrayList();
        try {
            Cursor cursorQuery = this.c.getReadableDatabase().query("inboxMessages", null, "messageUser = ?", new String[]{userId}, null, null, "created_at DESC");
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    try {
                        v vVar = new v();
                        ArrayList arrayList2 = new ArrayList();
                        vVar.f6863g = arrayList2;
                        vVar.f6862d = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_id"));
                        vVar.e = new JSONObject(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("data")));
                        vVar.i = new JSONObject(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("wzrkParams")));
                        vVar.f6861b = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow(MPDbAdapter.KEY_CREATED_AT));
                        vVar.c = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("expires"));
                        boolean z4 = true;
                        if (cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("isRead")) != 1) {
                            z4 = false;
                        }
                        vVar.f = z4;
                        vVar.h = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("messageUser"));
                        arrayList2.addAll(Arrays.asList(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("tags")).split(",")));
                        vVar.f6860a = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("campaignId"));
                        arrayList.add(vVar);
                    } finally {
                    }
                }
                Unit unit = Unit.f18162a;
                cursorQuery.close();
            }
        } catch (Exception e) {
            this.f2059b.getClass();
            S.r("Error retrieving records from inboxMessages", e);
        }
        return arrayList;
    }

    public final synchronized void l(e eVar) {
        String strTnTj78 = numX49.tnTj78("PaN");
        synchronized (this) {
            String str = eVar.f2067a;
            try {
                this.c.getWritableDatabase().delete(str, null, null);
            } catch (SQLiteException unused) {
                this.f2059b.getClass();
                S.q(strTnTj78 + str + " Recreating DB");
                e();
            }
        }
    }

    public final synchronized long m(JSONObject jSONObject, e eVar) {
        long jSimpleQueryForLong;
        String strTnTj78 = numX49.tnTj78("Pa6");
        String strTnTj782 = numX49.tnTj78("Paa");
        synchronized (this) {
            if (!this.c.b()) {
                this.f2059b.getClass();
                S.q("There is not enough space left on the device to store data, data discarded");
                return -2L;
            }
            String str = eVar.f2067a;
            ContentValues contentValues = new ContentValues();
            contentValues.put("data", jSONObject.toString());
            contentValues.put(MPDbAdapter.KEY_CREATED_AT, Long.valueOf(System.currentTimeMillis()));
            try {
                this.c.getWritableDatabase().insert(str, null, contentValues);
                jSimpleQueryForLong = this.c.getWritableDatabase().compileStatement(strTnTj78.concat(str)).simpleQueryForLong();
            } catch (SQLiteException unused) {
                this.f2059b.getClass();
                S.q(strTnTj782 + str + " Recreating DB");
                e();
                jSimpleQueryForLong = -1;
            }
            return jSimpleQueryForLong;
        }
    }

    public final synchronized void n() {
        if (!this.c.b()) {
            this.f2059b.getClass();
            S.q("There is not enough space left on the device to store data, data discarded");
            return;
        }
        e eVar = e.f2065b;
        ContentValues contentValues = new ContentValues();
        contentValues.put(MPDbAdapter.KEY_CREATED_AT, Long.valueOf(System.currentTimeMillis()));
        try {
            this.c.getWritableDatabase().insert("uninstallTimestamp", null, contentValues);
        } catch (SQLiteException unused) {
            this.f2059b.getClass();
            S.q("Error adding data to table uninstallTimestamp Recreating DB");
            e();
        }
    }

    public final synchronized long o(JSONObject jSONObject, String str, String str2) {
        String strTnTj78 = numX49.tnTj78("PaX");
        synchronized (this) {
            long jInsertWithOnConflict = -1;
            if (str == null || str2 == null) {
                return -1L;
            }
            if (!this.c.b()) {
                this.f2059b.getClass();
                S.q("There is not enough space left on the device to store data, data discarded");
                return -2L;
            }
            e eVar = e.f2065b;
            this.f2059b.getClass();
            S.q(strTnTj78 + str + " + deviceID = " + str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("data", jSONObject.toString());
            contentValues.put("_id", str);
            contentValues.put("deviceID", str2);
            try {
                jInsertWithOnConflict = this.c.getWritableDatabase().insertWithOnConflict("userProfiles", null, contentValues, 5);
            } catch (SQLiteException unused) {
                this.f2059b.getClass();
                S.q("Error adding data to table userProfiles Recreating DB");
                e();
            }
            return jInsertWithOnConflict;
        }
    }

    public final synchronized void p(String[] strArr) {
        if (strArr.length == 0) {
            return;
        }
        if (!this.c.b()) {
            this.f2059b.getClass();
            S.q("There is not enough space left on the device to store data, data discarded");
            return;
        }
        e eVar = e.f2065b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("isRead", (Integer) 1);
        int length = strArr.length;
        StringBuilder sb2 = new StringBuilder();
        if (length > 0) {
            sb2.append(Global.QUESTION);
            int i = length - 1;
            for (int i4 = 0; i4 < i; i4++) {
                sb2.append(", ?");
            }
        }
        String string = sb2.toString();
        j.f(string, "toString(...)");
        try {
            this.c.getWritableDatabase().update("pushNotifications", contentValues, "data IN (" + string + ')', strArr);
            this.f2060d = false;
        } catch (SQLiteException unused) {
            this.f2059b.getClass();
            S.q("Error adding data to table pushNotifications Recreating DB");
            e();
        }
    }

    public final synchronized void q(ArrayList arrayList) {
        if (!this.c.b()) {
            this.f2059b.getClass();
            S.q("There is not enough space left on the device to store data, data discarded");
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("_id", vVar.f6862d);
            contentValues.put("data", vVar.e.toString());
            contentValues.put("wzrkParams", vVar.i.toString());
            contentValues.put("campaignId", vVar.f6860a);
            contentValues.put("tags", TextUtils.join(",", vVar.f6863g));
            contentValues.put("isRead", Integer.valueOf(vVar.f ? 1 : 0));
            contentValues.put("expires", Long.valueOf(vVar.c));
            contentValues.put(MPDbAdapter.KEY_CREATED_AT, Long.valueOf(vVar.f6861b));
            contentValues.put("messageUser", vVar.h);
            try {
                SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
                e eVar = e.f2065b;
                writableDatabase.insertWithOnConflict("inboxMessages", null, contentValues, 5);
            } catch (SQLiteException unused) {
                S s9 = this.f2059b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error adding data to table ");
                e eVar2 = e.f2065b;
                sb2.append("inboxMessages");
                String string = sb2.toString();
                s9.getClass();
                S.q(string);
                Unit unit = Unit.f18162a;
            }
        }
    }

    public final C1421c r() {
        C1421c c1421c;
        C1421c c1421c2 = this.f2058a;
        if (c1421c2 != null) {
            return c1421c2;
        }
        synchronized (this) {
            c1421c = this.f2058a;
            if (c1421c == null) {
                d dVar = this.c;
                S logger = this.f2059b;
                j.f(logger, "logger");
                e eVar = e.f2065b;
                c1421c = new C1421c(dVar, logger);
                this.f2058a = c1421c;
            }
        }
        return c1421c;
    }
}
