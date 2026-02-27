package androidx.camera.core.impl;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.media3.common.TrackGroup;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import com.google.android.gms.tasks.TaskCompletionSource;
import h2.C1531a;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import o2.C1957b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements CallbackToFutureAdapter.Resolver, DefaultTrackSelector.TrackInfo.Factory, Z0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f7538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7539b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7540d;

    public /* synthetic */ l(boolean z4, Object obj, Object obj2, Object obj3) {
        this.f7539b = obj;
        this.c = obj2;
        this.f7538a = z4;
        this.f7540d = obj3;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return DeferrableSurfaces.lambda$surfaceListWithTimeout$1((S1.y) this.f7539b, (Executor) this.c, this.f7538a, (Collection) this.f7540d, completer);
    }

    @Override // Z0.h
    public void b(Exception exc) throws Throwable {
        C1957b c1957b = (C1957b) this.f7539b;
        c1957b.getClass();
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.f7538a) {
            boolean z4 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new io.flutter.plugins.firebase.core.a(9, c1957b, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = h2.y.f16925a;
            boolean z5 = false;
            try {
                long nanos = timeUnit.toNanos(2L);
                long jNanoTime = System.nanoTime() + nanos;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            if (z4) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        nanos = jNanoTime - System.nanoTime();
                        z5 = true;
                    }
                }
                if (z5) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th3) {
                th = th3;
                z4 = z5;
            }
        }
        taskCompletionSource.trySetResult((C1531a) this.f7540d);
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i, TrackGroup trackGroup, int[] iArr) {
        return ((DefaultTrackSelector) this.f7539b).lambda$selectAudioTrack$2((DefaultTrackSelector.Parameters) this.c, this.f7538a, (int[]) this.f7540d, i, trackGroup, iArr);
    }
}
