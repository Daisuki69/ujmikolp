package I2;

import C2.e;
import S2.f;
import U1.g;
import U1.i;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M2.a f2204b = M2.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f2205a = new ConcurrentHashMap();

    public c(g gVar, B2.b bVar, e eVar, B2.b bVar2, RemoteConfigManager remoteConfigManager, K2.a aVar, SessionManager sessionManager) {
        Bundle bundle;
        if (gVar == null) {
            new T2.c(new Bundle());
            return;
        }
        f fVar = f.f5648s;
        fVar.f5651d = gVar;
        gVar.a();
        i iVar = gVar.c;
        fVar.f5657p = iVar.f5914g;
        fVar.f = eVar;
        fVar.f5652g = bVar2;
        fVar.i.execute(new S2.e(fVar, 1));
        gVar.a();
        Context context = gVar.f5904a;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            Log.d("isEnabled", "No perf enable meta data found " + e.getMessage());
            bundle = null;
        }
        T2.c cVar = bundle != null ? new T2.c(bundle) : new T2.c();
        remoteConfigManager.setFirebaseRemoteConfigProvider(bVar);
        aVar.f2562b = cVar;
        K2.a.f2560d.f3046b = T2.i.a(context);
        aVar.c.c(context);
        sessionManager.setApplicationContext(context);
        Boolean boolG = aVar.g();
        M2.a aVar2 = f2204b;
        if (aVar2.f3046b) {
            if (boolG != null ? boolG.booleanValue() : g.e().k()) {
                gVar.a();
                String strConcat = "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: ".concat(X5.f.q(iVar.f5914g, context.getPackageName()).concat("/trends?utm_source=perf-android-sdk&utm_medium=android-ide"));
                if (aVar2.f3046b) {
                    aVar2.f3045a.getClass();
                    Log.i("FirebasePerformance", strConcat);
                }
            }
        }
    }
}
