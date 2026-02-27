package R2;

import W2.j;
import android.os.Build;
import android.os.StrictMode;
import c2.ScheduledExecutorServiceC1063f;
import c2.ThreadFactoryC1058a;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.t;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements B2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5442a;

    public /* synthetic */ d(int i) {
        this.f5442a = i;
    }

    @Override // B2.b
    public final Object get() {
        switch (this.f5442a) {
            case 0:
                return Executors.newSingleThreadScheduledExecutor();
            case 1:
                return GaugeManager.lambda$new$0();
            case 2:
                return GaugeManager.lambda$new$1();
            case 3:
                Clock clock = j.j;
                return null;
            case 4:
                return Collections.EMPTY_SET;
            case 5:
                return null;
            case 6:
                b2.j jVar = ExecutorsRegistrar.f9744a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i = Build.VERSION.SDK_INT;
                builderDetectNetwork.detectResourceMismatches();
                if (i >= 26) {
                    builderDetectNetwork.detectUnbufferedIo();
                }
                return new ScheduledExecutorServiceC1063f(Executors.newFixedThreadPool(4, new ThreadFactoryC1058a("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f9746d.get());
            case 7:
                b2.j jVar2 = ExecutorsRegistrar.f9744a;
                return new ScheduledExecutorServiceC1063f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ThreadFactoryC1058a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f9746d.get());
            case 8:
                b2.j jVar3 = ExecutorsRegistrar.f9744a;
                return new ScheduledExecutorServiceC1063f(Executors.newCachedThreadPool(new ThreadFactoryC1058a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f9746d.get());
            case 9:
                b2.j jVar4 = ExecutorsRegistrar.f9744a;
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC1058a("Firebase Scheduler", 0, null));
            default:
                t tVar = FirebaseMessaging.f9758k;
                return null;
        }
    }
}
