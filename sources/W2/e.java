package W2;

import D.S;
import X2.k;
import X2.m;
import X2.o;
import androidx.camera.video.AudioStats;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V1.b f6216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f6217b;
    public final X2.d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X2.d f6218d;
    public final X2.d e;
    public final X2.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f6219g;
    public final o h;
    public final U8.c i;
    public final r j;

    public e(V1.b bVar, Executor executor, X2.d dVar, X2.d dVar2, X2.d dVar3, X2.j jVar, k kVar, o oVar, U8.c cVar, r rVar) {
        this.f6216a = bVar;
        this.f6217b = executor;
        this.c = dVar;
        this.f6218d = dVar2;
        this.e = dVar3;
        this.f = jVar;
        this.f6219g = kVar;
        this.h = oVar;
        this.i = cVar;
        this.j = rVar;
    }

    public static e f() {
        return ((j) U1.g.e().c(j.class)).b("firebase");
    }

    public static ArrayList i(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public final Task a() {
        Task taskB = this.c.b();
        Task taskB2 = this.f6218d.b();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskB, taskB2}).continueWithTask(this.f6217b, new Bb.c(10, this, taskB, taskB2));
    }

    public final HashMap b() {
        k kVar = this.f6219g;
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(k.c(kVar.c));
        hashSet.addAll(k.c(kVar.f6501d));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            map.put(str, kVar.e(str));
        }
        return map;
    }

    public final boolean c(String str) {
        k kVar = this.f6219g;
        X2.d dVar = kVar.c;
        String strD = k.d(dVar, str);
        Pattern pattern = k.f;
        Pattern pattern2 = k.e;
        if (strD != null) {
            if (pattern2.matcher(strD).matches()) {
                kVar.b(str, dVar.c());
                return true;
            }
            if (pattern.matcher(strD).matches()) {
                kVar.b(str, dVar.c());
                return false;
            }
        }
        String strD2 = k.d(kVar.f6501d, str);
        if (strD2 != null) {
            if (pattern2.matcher(strD2).matches()) {
                return true;
            }
            if (pattern.matcher(strD2).matches()) {
                return false;
            }
        }
        k.f(str, "Boolean");
        return false;
    }

    public final double d(String str) {
        Double dValueOf;
        k kVar = this.f6219g;
        X2.d dVar = kVar.c;
        X2.f fVarC = dVar.c();
        Double dValueOf2 = null;
        if (fVarC == null) {
            dValueOf = null;
        } else {
            try {
                dValueOf = Double.valueOf(fVarC.f6484b.getDouble(str));
            } catch (JSONException unused) {
                dValueOf = null;
            }
        }
        if (dValueOf != null) {
            kVar.b(str, dVar.c());
            return dValueOf.doubleValue();
        }
        X2.f fVarC2 = kVar.f6501d.c();
        if (fVarC2 != null) {
            try {
                dValueOf2 = Double.valueOf(fVarC2.f6484b.getDouble(str));
            } catch (JSONException unused2) {
            }
        }
        if (dValueOf2 != null) {
            return dValueOf2.doubleValue();
        }
        k.f(str, com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f16117l0);
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public final S e() {
        S s9;
        o oVar = this.h;
        synchronized (oVar.f6519b) {
            try {
                oVar.f6518a.getLong("last_fetch_time_in_millis", -1L);
                int i = oVar.f6518a.getInt("last_fetch_status", 0);
                int[] iArr = X2.j.f6494k;
                long j = oVar.f6518a.getLong("fetch_timeout_in_seconds", 60L);
                if (j < 0) {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j)));
                }
                long j6 = oVar.f6518a.getLong("minimum_fetch_interval_in_seconds", X2.j.j);
                if (j6 < 0) {
                    throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j6 + " is an invalid argument");
                }
                s9 = new S(i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return s9;
    }

    public final String g(String str) {
        k kVar = this.f6219g;
        X2.d dVar = kVar.c;
        String strD = k.d(dVar, str);
        if (strD != null) {
            kVar.b(str, dVar.c());
            return strD;
        }
        String strD2 = k.d(kVar.f6501d, str);
        if (strD2 != null) {
            return strD2;
        }
        k.f(str, "String");
        return "";
    }

    public final void h(boolean z4) {
        U8.c cVar = this.i;
        synchronized (cVar) {
            ((m) cVar.c).k(z4);
            if (!z4) {
                cVar.c();
            }
        }
    }
}
