package X2;

import We.s;
import android.util.Log;
import com.google.android.gms.common.util.BiConsumer;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class k {
    public static final Pattern e;
    public static final Pattern f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f6499a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f6500b;
    public final d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f6501d;

    static {
        Charset.forName("UTF-8");
        e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public k(Executor executor, d dVar, d dVar2) {
        this.f6500b = executor;
        this.c = dVar;
        this.f6501d = dVar2;
    }

    public static HashSet c(d dVar) {
        HashSet hashSet = new HashSet();
        f fVarC = dVar.c();
        if (fVarC != null) {
            Iterator<String> itKeys = fVarC.f6484b.keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }

    public static String d(d dVar, String str) {
        f fVarC = dVar.c();
        if (fVarC == null) {
            return null;
        }
        try {
            return fVarC.f6484b.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void f(String str, String str2) {
        Log.w("FirebaseRemoteConfig", s.l("No value of type '", str2, "' exists for parameter key '", str, "'."));
    }

    public final void a(W2.h hVar) {
        synchronized (this.f6499a) {
            this.f6499a.add(hVar);
        }
    }

    public final void b(String str, f fVar) {
        if (fVar == null) {
            return;
        }
        synchronized (this.f6499a) {
            try {
                Iterator it = this.f6499a.iterator();
                while (it.hasNext()) {
                    this.f6500b.execute(new I6.a(15, (BiConsumer) it.next(), str, fVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final q e(String str) {
        d dVar = this.c;
        String strD = d(dVar, str);
        if (strD != null) {
            b(str, dVar.c());
            return new q(strD, 2);
        }
        String strD2 = d(this.f6501d, str);
        if (strD2 != null) {
            return new q(strD2, 1);
        }
        f(str, "FirebaseRemoteConfigValue");
        return new q("", 0);
    }
}
