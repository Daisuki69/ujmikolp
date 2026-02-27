package j2;

import We.s;
import android.util.Log;
import defpackage.AbstractC1414e;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n2.C1915b;
import o6.C1967a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f17681b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1915b f17682a;

    public h(C1915b c1915b) {
        this.f17682a = c1915b;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static ArrayList b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                C1967a c1967a = n.f17693a;
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("rolloutId");
                String string3 = jSONObject.getString("parameterKey");
                String string4 = jSONObject.getString("parameterValue");
                String string5 = jSONObject.getString("variantId");
                long j = jSONObject.getLong("templateVersion");
                if (string4.length() > 256) {
                    string4 = string4.substring(0, 256);
                }
                arrayList.add(new C1663b(string2, string3, string4, string5, j));
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(n.f17693a.a(list.get(i))));
            } catch (JSONException e) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", s.k("Deleted corrupt file: ", file.getAbsolutePath(), "\nReason: ", str), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    public final Map c(String str, boolean z4) throws Throwable {
        Throwable th2;
        FileInputStream fileInputStream;
        Exception e;
        C1915b c1915b = this.f17682a;
        File fileM = z4 ? c1915b.m(str, "internal-keys") : c1915b.m(str, "keys");
        if (!fileM.exists() || fileM.length() == 0) {
            g(fileM, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        try {
            try {
                fileInputStream = new FileInputStream(fileM);
                try {
                    HashMap mapA = a(h2.f.i(fileInputStream));
                    h2.f.b(fileInputStream, "Failed to close user metadata file.");
                    return mapA;
                } catch (Exception e7) {
                    e = e7;
                    Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                    f(fileM);
                    h2.f.b(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Throwable th3) {
                th2 = th3;
                h2.f.b(, "Failed to close user metadata file.");
                throw th2;
            }
        } catch (Exception e10) {
            fileInputStream = null;
            e = e10;
        } catch (Throwable th4) {
            ?? r1 = 0;
            th2 = th4;
            h2.f.b(r1, "Failed to close user metadata file.");
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    public final String d(String str) {
        FileInputStream fileInputStream;
        File fileM = this.f17682a.m(str, "user-data");
        ?? r42 = 0;
        if (fileM.exists()) {
            ?? r32 = (fileM.length() > 0L ? 1 : (fileM.length() == 0L ? 0 : -1));
            try {
                if (r32 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileM);
                        try {
                            JSONObject jSONObject = new JSONObject(h2.f.i(fileInputStream));
                            String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            String str2 = "Loaded userId " + strOptString + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            h2.f.b(fileInputStream, "Failed to close user metadata file.");
                            return strOptString;
                        } catch (Exception e) {
                            e = e;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            f(fileM);
                            h2.f.b(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        h2.f.b(r42, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                r42 = r32;
            }
        }
        String strH = AbstractC1414e.h("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strH, null);
        }
        f(fileM);
        return null;
    }

    public final void h(String str, Map map, boolean z4) {
        String string;
        BufferedWriter bufferedWriter;
        C1915b c1915b = this.f17682a;
        File fileM = z4 ? c1915b.m(str, "internal-keys") : c1915b.m(str, "keys");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                string = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM), f17681b));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedWriter.write(string);
            bufferedWriter.flush();
            h2.f.b(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e7) {
            e = e7;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
            f(fileM);
            h2.f.b(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            h2.f.b(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    public final void i(String str, List list) {
        Throwable th2;
        BufferedWriter bufferedWriter;
        Exception e;
        File fileM = this.f17682a.m(str, "rollouts-state");
        ?? IsEmpty = list.isEmpty();
        if (IsEmpty != 0) {
            g(fileM, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                String strE = e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM), f17681b));
                try {
                    bufferedWriter.write(strE);
                    bufferedWriter.flush();
                    h2.f.b(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Exception e7) {
                    e = e7;
                    Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                    f(fileM);
                    h2.f.b(bufferedWriter, "Failed to close rollouts state file.");
                }
            } catch (Throwable th3) {
                th2 = th3;
                h2.f.b(IsEmpty, "Failed to close rollouts state file.");
                throw th2;
            }
        } catch (Exception e10) {
            bufferedWriter = null;
            e = e10;
        } catch (Throwable th4) {
            IsEmpty = 0;
            th2 = th4;
            h2.f.b(IsEmpty, "Failed to close rollouts state file.");
            throw th2;
        }
    }

    public final void j(String str, String str2) {
        String string;
        BufferedWriter bufferedWriter;
        File fileM = this.f17682a.m(str, "user-data");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                g gVar = new g();
                gVar.put("userId", str2);
                string = gVar.toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM), f17681b));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedWriter.write(string);
            bufferedWriter.flush();
            h2.f.b(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e7) {
            e = e7;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
            h2.f.b(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            h2.f.b(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
