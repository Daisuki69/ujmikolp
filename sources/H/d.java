package H;

import D.S;
import D.b0;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import dOYHB6.tiZVw8.numX49;
import dOYHB6.yFtIp6.svM7M6;
import defpackage.AbstractC1414e;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import org.json.JSONException;
import org.json.JSONObject;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CleverTapInstanceConfig f2063b;
    public final S c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f2064d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str, S s9) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 5);
        j.g(context, numX49.tnTj78("PaG"));
        this.f2062a = context;
        this.f2063b = cleverTapInstanceConfig;
        this.c = s9;
        this.f2064d = context.getDatabasePath(str);
    }

    public final boolean b() {
        File file = this.f2064d;
        return !file.exists() || Math.max(file.getUsableSpace(), 20971520L) >= file.length();
    }

    public final void c(SQLiteDatabase sQLiteDatabase, String str) {
        SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement(str);
        String strH = AbstractC1414e.h(numX49.tnTj78("Pa3"), str);
        this.c.getClass();
        S.q(strH);
        sQLiteStatementCompileStatement.execute();
    }

    public final String f(String str) {
        String strTnTj78 = numX49.tnTj78("Pay");
        String strTnTj782 = numX49.tnTj78("Pav");
        String strTnTj783 = numX49.tnTj78("Pa7");
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if ((obj instanceof String) && z.w((String) obj, 2, strTnTj783, false)) {
                    long j = Long.parseLong(C2576A.M((String) obj, strTnTj783));
                    Long lValueOf = Long.valueOf(j);
                    jSONObject.put(next, j);
                    obj = lValueOf;
                }
                if (obj instanceof JSONObject) {
                    if (((JSONObject) obj).has(strTnTj782)) {
                        jSONObject.put(next, ((JSONObject) obj).getJSONArray(strTnTj782));
                    } else if (((JSONObject) obj).has(strTnTj78)) {
                        jSONObject.put(next, ((JSONObject) obj).getJSONArray(strTnTj78));
                    }
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            String strConcat = numX49.tnTj78("PaA").concat(str);
            this.c.getClass();
            S.r(strConcat, e);
            return str;
        }
    }

    public final void g(SQLiteDatabase sQLiteDatabase) throws IOException {
        String strTnTj78 = numX49.tnTj78("PaY");
        String strTnTj782 = numX49.tnTj78("PaT");
        c(sQLiteDatabase, a.f2055r);
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f2063b;
        String str = cleverTapInstanceConfig.f9439a;
        j.f(str, numX49.tnTj78("PaR"));
        String strConcat = numX49.tnTj78("Pap").concat(str);
        String strConcat2 = numX49.tnTj78("Pa0").concat(str);
        Context context = this.f2062a;
        String strG = b0.g(context, strConcat, null);
        if (strG == null) {
            if (cleverTapInstanceConfig.f9447p) {
                strG = svM7M6.getString(b0.e(context), strConcat, null);
                j.f(strG, numX49.tnTj78("Pag"));
            } else {
                strG = svM7M6.getString(b0.e(context), strConcat2, numX49.tnTj78("Paf"));
                j.d(strG);
            }
        }
        e eVar = e.f2065b;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(numX49.tnTj78("Pa1"), null);
        j.f(cursorRawQuery, numX49.tnTj78("Pan"));
        try {
            if (cursorRawQuery.moveToFirst()) {
                String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("_id"));
                String string2 = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("data"));
                j.d(string2);
                c(sQLiteDatabase, strTnTj782 + string + strTnTj78 + strG + strTnTj78 + f(string2) + "');");
            }
            Unit unit = Unit.f18162a;
            cursorRawQuery.close();
            c(sQLiteDatabase, a.f2056s);
            c(sQLiteDatabase, a.f2057t);
        } finally {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        j.g(sQLiteDatabase, numX49.tnTj78("Pax"));
        this.c.getClass();
        S.q(numX49.tnTj78("Pas"));
        c(sQLiteDatabase, a.f2045a);
        c(sQLiteDatabase, a.f2046b);
        c(sQLiteDatabase, a.c);
        c(sQLiteDatabase, a.f2054q);
        c(sQLiteDatabase, a.f2047d);
        c(sQLiteDatabase, a.h);
        c(sQLiteDatabase, a.j);
        c(sQLiteDatabase, a.f2050l);
        c(sQLiteDatabase, a.f);
        c(sQLiteDatabase, a.f2048g);
        c(sQLiteDatabase, a.f2049k);
        c(sQLiteDatabase, a.i);
        c(sQLiteDatabase, a.e);
        c(sQLiteDatabase, a.m);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i4) throws IOException {
        j.g(sQLiteDatabase, numX49.tnTj78("Pa5"));
        String str = numX49.tnTj78("PaJ") + i4;
        this.c.getClass();
        S.q(str);
        if (i == 1) {
            c(sQLiteDatabase, a.f2051n);
            c(sQLiteDatabase, a.f2052o);
            c(sQLiteDatabase, a.f2053p);
            c(sQLiteDatabase, a.f2047d);
            c(sQLiteDatabase, a.h);
            c(sQLiteDatabase, a.j);
            c(sQLiteDatabase, a.f2050l);
            c(sQLiteDatabase, a.f2049k);
            c(sQLiteDatabase, a.i);
            c(sQLiteDatabase, a.e);
            c(sQLiteDatabase, a.m);
            g(sQLiteDatabase);
        } else if (i == 2) {
            c(sQLiteDatabase, a.f2053p);
            c(sQLiteDatabase, a.f2050l);
            c(sQLiteDatabase, a.m);
            g(sQLiteDatabase);
        } else if (i == 3) {
            g(sQLiteDatabase);
        }
        if (i < 5) {
            c(sQLiteDatabase, a.f2046b);
        }
    }
}
