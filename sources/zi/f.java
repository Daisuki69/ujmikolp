package zi;

import Xh.p;
import android.os.Handler;
import android.os.Looper;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import n4.RunnableC1918b;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkManager f21463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21464b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Xh.d f21465d;
    public final Constraints e;
    public WeakReference f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f21466g;
    public final p h;

    public f(WorkManager workManager, Xh.d dVar, String str, p pVar) {
        Objects.requireNonNull(workManager);
        this.f21463a = workManager;
        Objects.requireNonNull(str);
        this.f21464b = str;
        this.f21465d = dVar;
        this.c = "r7khp5rhirj501lqn5t6q1chpnc1cis703jd";
        this.f21466g = new HashSet();
        Constraints.Builder builder = new Constraints.Builder();
        builder.setRequiredNetworkType(NetworkType.CONNECTED);
        builder.setRequiresBatteryNotLow(true);
        this.e = builder.build();
        this.h = pVar;
    }

    public final Data a(Data data) {
        Data.Builder builder = new Data.Builder();
        builder.putString("databaseName", this.f21464b);
        builder.putString("apiKey", this.c);
        Xh.d dVar = this.f21465d;
        dVar.getClass();
        builder.putBoolean("encryptionEnabled", true);
        builder.putBoolean("usesProxy", dVar.f6632a != null);
        if (data != null) {
            builder.putAll(data);
        }
        return builder.build();
    }

    public final void b(String str, Class cls, Data data) {
        this.f21465d.getClass();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f21463a.enqueueUniquePeriodicWork(str, ExistingPeriodicWorkPolicy.REPLACE, new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) cls, 15L, timeUnit).setInputData(a(data)).setConstraints(this.e).setInitialDelay(15L, timeUnit).build());
        String canonicalName = cls.getCanonicalName();
        Ri.a.d("Adding work manager observer for request id " + canonicalName);
        new Handler(Looper.getMainLooper()).post(new RunnableC1918b(11, this, canonicalName));
    }
}
