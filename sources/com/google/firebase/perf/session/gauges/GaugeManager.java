package com.google.firebase.perf.session.gauges;

import K2.a;
import K2.o;
import K2.r;
import R2.b;
import R2.c;
import R2.d;
import R2.e;
import R2.g;
import S2.f;
import U2.i;
import U2.k;
import U2.l;
import U2.m;
import U2.n;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import b2.j;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import defpackage.AbstractC1414e;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private i applicationProcessState;
    private final a configResolver;
    private final j cpuGaugeCollector;

    @Nullable
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final j gaugeManagerExecutor;

    @Nullable
    private e gaugeMetadataManager;
    private final j memoryGaugeCollector;

    @Nullable
    private String sessionId;
    private final f transportManager;
    private static final M2.a logger = M2.a.d();
    private static final GaugeManager instance = new GaugeManager();

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new j(new d(0)), f.f5648s, a.e(), null, new j(new d(1)), new j(new d(2)));
    }

    private static void collectGaugeMetricOnce(b bVar, g gVar, Timer timer) {
        synchronized (bVar) {
            try {
                bVar.f5437b.schedule(new R2.a(bVar, timer, 1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                b.f5435g.f("Unable to collect Cpu Metric: " + e.getMessage());
            }
        }
        gVar.a(timer);
    }

    private long getCpuGaugeCollectionFrequencyMs(i iVar) {
        o oVar;
        long jLongValue;
        int iOrdinal = iVar.ordinal();
        if (iOrdinal != 1) {
            jLongValue = iOrdinal != 2 ? -1L : this.configResolver.o();
        } else {
            a aVar = this.configResolver;
            aVar.getClass();
            synchronized (o.class) {
                try {
                    if (o.f2575b == null) {
                        o.f2575b = new o();
                    }
                    oVar = o.f2575b;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            T2.d dVarK = aVar.k(oVar);
            if (dVarK.b() && a.s(((Long) dVarK.a()).longValue())) {
                jLongValue = ((Long) dVarK.a()).longValue();
            } else {
                T2.d dVar = aVar.f2561a.getLong("fpr_session_gauge_cpu_capture_frequency_fg_ms");
                if (dVar.b() && a.s(((Long) dVar.a()).longValue())) {
                    aVar.c.d(((Long) dVar.a()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
                    jLongValue = ((Long) dVar.a()).longValue();
                } else {
                    T2.d dVarC = aVar.c(oVar);
                    jLongValue = (dVarC.b() && a.s(((Long) dVarC.a()).longValue())) ? ((Long) dVarC.a()).longValue() : aVar.f2561a.isLastFetchFailed() ? 300L : 100L;
                }
            }
        }
        M2.a aVar2 = b.f5435g;
        if (jLongValue <= 0) {
            return -1L;
        }
        return jLongValue;
    }

    private m getGaugeMetadata() {
        l lVarX = m.x();
        int iB = T2.i.b((AbstractC1414e.b(5) * this.gaugeMetadataManager.c.totalMem) / 1024);
        lVarX.i();
        m.u((m) lVarX.f10116b, iB);
        int iB2 = T2.i.b((AbstractC1414e.b(5) * this.gaugeMetadataManager.f5443a.maxMemory()) / 1024);
        lVarX.i();
        m.s((m) lVarX.f10116b, iB2);
        int iB3 = T2.i.b((AbstractC1414e.b(3) * ((long) this.gaugeMetadataManager.f5444b.getMemoryClass())) / 1024);
        lVarX.i();
        m.t((m) lVarX.f10116b, iB3);
        return (m) lVarX.g();
    }

    public static synchronized GaugeManager getInstance() {
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(i iVar) {
        r rVar;
        long jLongValue;
        int iOrdinal = iVar.ordinal();
        if (iOrdinal != 1) {
            jLongValue = iOrdinal != 2 ? -1L : this.configResolver.p();
        } else {
            a aVar = this.configResolver;
            aVar.getClass();
            synchronized (r.class) {
                try {
                    if (r.f2578b == null) {
                        r.f2578b = new r();
                    }
                    rVar = r.f2578b;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            T2.d dVarK = aVar.k(rVar);
            if (dVarK.b() && a.s(((Long) dVarK.a()).longValue())) {
                jLongValue = ((Long) dVarK.a()).longValue();
            } else {
                T2.d dVar = aVar.f2561a.getLong("fpr_session_gauge_memory_capture_frequency_fg_ms");
                if (dVar.b() && a.s(((Long) dVar.a()).longValue())) {
                    aVar.c.d(((Long) dVar.a()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
                    jLongValue = ((Long) dVar.a()).longValue();
                } else {
                    T2.d dVarC = aVar.c(rVar);
                    jLongValue = (dVarC.b() && a.s(((Long) dVarC.a()).longValue())) ? ((Long) dVarC.a()).longValue() : aVar.f2561a.isLastFetchFailed() ? 300L : 100L;
                }
            }
        }
        M2.a aVar2 = g.f;
        if (jLongValue <= 0) {
            return -1L;
        }
        return jLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b lambda$new$0() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g lambda$new$1() {
        return new g();
    }

    private boolean startCollectingCpuMetrics(long j, Timer timer) {
        if (j == -1) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        b bVar = (b) this.cpuGaugeCollector.get();
        long j6 = bVar.f5438d;
        if (j6 == -1 || j6 == 0 || j <= 0) {
            return true;
        }
        ScheduledFuture scheduledFuture = bVar.e;
        if (scheduledFuture == null) {
            bVar.a(j, timer);
            return true;
        }
        if (bVar.f == j) {
            return true;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            bVar.e = null;
            bVar.f = -1L;
        }
        bVar.a(j, timer);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j, Timer timer) {
        if (j == -1) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        g gVar = (g) this.memoryGaugeCollector.get();
        M2.a aVar = g.f;
        if (j <= 0) {
            gVar.getClass();
            return true;
        }
        ScheduledFuture scheduledFuture = gVar.f5449d;
        if (scheduledFuture == null) {
            gVar.b(j, timer);
            return true;
        }
        if (gVar.e == j) {
            return true;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            gVar.f5449d = null;
            gVar.e = -1L;
        }
        gVar.b(j, timer);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, i iVar) {
        n nVarC = U2.o.C();
        while (!((b) this.cpuGaugeCollector.get()).f5436a.isEmpty()) {
            k kVar = (k) ((b) this.cpuGaugeCollector.get()).f5436a.poll();
            nVarC.i();
            U2.o.v((U2.o) nVarC.f10116b, kVar);
        }
        while (!((g) this.memoryGaugeCollector.get()).f5448b.isEmpty()) {
            U2.d dVar = (U2.d) ((g) this.memoryGaugeCollector.get()).f5448b.poll();
            nVarC.i();
            U2.o.t((U2.o) nVarC.f10116b, dVar);
        }
        nVarC.i();
        U2.o.s((U2.o) nVarC.f10116b, str);
        f fVar = this.transportManager;
        fVar.i.execute(new I6.a(8, fVar, (U2.o) nVarC.g(), iVar));
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new e(context);
    }

    public boolean logGaugeMetadata(String str, i iVar) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        n nVarC = U2.o.C();
        nVarC.i();
        U2.o.s((U2.o) nVarC.f10116b, str);
        m gaugeMetadata = getGaugeMetadata();
        nVarC.i();
        U2.o.u((U2.o) nVarC.f10116b, gaugeMetadata);
        U2.o oVar = (U2.o) nVarC.g();
        f fVar = this.transportManager;
        fVar.i.execute(new I6.a(8, fVar, oVar, iVar));
        return true;
    }

    public void startCollectingGauges(PerfSession perfSession, i iVar) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(iVar, perfSession.f9857b);
        if (jStartCollectingGauges == -1) {
            logger.f("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        String str = perfSession.f9856a;
        this.sessionId = str;
        this.applicationProcessState = iVar;
        try {
            long j = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).scheduleAtFixedRate(new c(this, str, iVar, 1), j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            logger.f("Unable to start collecting Gauges: " + e.getMessage());
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str == null) {
            return;
        }
        i iVar = this.applicationProcessState;
        b bVar = (b) this.cpuGaugeCollector.get();
        ScheduledFuture scheduledFuture = bVar.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            bVar.e = null;
            bVar.f = -1L;
        }
        g gVar = (g) this.memoryGaugeCollector.get();
        ScheduledFuture scheduledFuture2 = gVar.f5449d;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            gVar.f5449d = null;
            gVar.e = -1L;
        }
        ScheduledFuture scheduledFuture3 = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture3 != null) {
            scheduledFuture3.cancel(false);
        }
        ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).schedule(new c(this, str, iVar, 0), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = i.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    @VisibleForTesting
    public GaugeManager(j jVar, f fVar, a aVar, e eVar, j jVar2, j jVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = i.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = jVar;
        this.transportManager = fVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = eVar;
        this.cpuGaugeCollector = jVar2;
        this.memoryGaugeCollector = jVar3;
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce((b) this.cpuGaugeCollector.get(), (g) this.memoryGaugeCollector.get(), timer);
    }

    private long startCollectingGauges(i iVar, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(iVar);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(iVar);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer) ? cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }
}
