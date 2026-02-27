package h2;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import dOYHB6.yFtIp6.svM7M6;
import e2.C1422d;
import i2.C1588d;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f16921g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M5.b f16922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f16923b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2.e f16924d;
    public final t e;
    public C1532b f;

    public w(Context context, String str, C2.e eVar, t tVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f16923b = context;
        this.c = str;
        this.f16924d = eVar;
        this.e = tVar;
        this.f16922a = new M5.b(5);
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f16921g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final v b(boolean z4) {
        String str;
        String str2 = null;
        if (!((Boolean) new Ta.a(0, i2.e.f17091d, C1588d.class, "isNotMainThread", "isNotMainThread()Z", 0, 5).invoke()).booleanValue()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        }
        C2.e eVar = this.f16924d;
        if (z4) {
            try {
                str = ((C2.a) Tasks.await(((C2.d) eVar).e(), 10000L, TimeUnit.MILLISECONDS)).f668a;
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e);
                str = null;
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) Tasks.await(((C2.d) eVar).d(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e7) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e7);
        }
        return new v(str2, str);
    }

    public final synchronized C1532b c() {
        String str;
        C1532b c1532b = this.f;
        if (c1532b != null && (c1532b.f16856b != null || !this.e.a())) {
            return this.f;
        }
        C1422d c1422d = C1422d.f16556a;
        c1422d.f("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f16923b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = svM7M6.getString(sharedPreferences, "firebase.installation.id", null);
        c1422d.f("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            v vVarB = b(false);
            c1422d.f("Fetched Firebase Installation ID: " + vVarB.f16919a);
            if (vVarB.f16919a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                vVarB = new v(str, null);
            }
            if (Objects.equals(vVarB.f16919a, string)) {
                this.f = new C1532b(svM7M6.getString(sharedPreferences, "crashlytics.installation.id", null), vVarB.f16919a, vVarB.f16920b);
            } else {
                this.f = new C1532b(a(sharedPreferences, vVarB.f16919a), vVarB.f16919a, vVarB.f16920b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new C1532b(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f = new C1532b(svM7M6.getString(sharedPreferences, "crashlytics.installation.id", null), null, null);
        }
        c1422d.f("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        M5.b bVar = this.f16922a;
        Context context = this.f16923b;
        synchronized (bVar) {
            try {
                if (bVar.f3082b == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    bVar.f3082b = installerPackageName;
                }
                str = "".equals(bVar.f3082b) ? null : bVar.f3082b;
            } finally {
            }
        }
        return str;
    }
}
