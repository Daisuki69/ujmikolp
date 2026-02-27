package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.flutter.plugins.webviewflutter.WebViewProxyApi;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidWebkitLibraryPigeonInstanceManager {
    public static final Companion Companion = new Companion(null);
    private static final long minHostCreatedIdentifier = 65536;
    private static final String tag = "PigeonInstanceManager";
    private long clearFinalizedWeakReferencesInterval;
    private final PigeonFinalizationListener finalizationListener;
    private final Handler handler;
    private boolean hasFinalizationListenerStopped;
    private final WeakHashMap<Object, Long> identifiers;
    private long nextIdentifier;
    private final ReferenceQueue<Object> referenceQueue;
    private final Runnable releaseAllFinalizedInstancesRunnable;
    private final HashMap<Long, Object> strongInstances;
    private final HashMap<Long, WeakReference<Object>> weakInstances;
    private final HashMap<WeakReference<Object>, Long> weakReferencesToIdentifiers;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AndroidWebkitLibraryPigeonInstanceManager create(PigeonFinalizationListener finalizationListener) {
            kotlin.jvm.internal.j.g(finalizationListener, "finalizationListener");
            return new AndroidWebkitLibraryPigeonInstanceManager(finalizationListener);
        }

        private Companion() {
        }
    }

    public interface PigeonFinalizationListener {
        void onFinalize(long j);
    }

    public AndroidWebkitLibraryPigeonInstanceManager(PigeonFinalizationListener finalizationListener) {
        kotlin.jvm.internal.j.g(finalizationListener, "finalizationListener");
        this.finalizationListener = finalizationListener;
        this.identifiers = new WeakHashMap<>();
        this.weakInstances = new HashMap<>();
        this.strongInstances = new HashMap<>();
        this.referenceQueue = new ReferenceQueue<>();
        this.weakReferencesToIdentifiers = new HashMap<>();
        Handler handler = new Handler(Looper.getMainLooper());
        this.handler = handler;
        Runnable runnable = new Runnable() { // from class: io.flutter.plugins.webviewflutter.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f17351a.releaseAllFinalizedInstances();
            }
        };
        this.releaseAllFinalizedInstancesRunnable = runnable;
        this.nextIdentifier = minHostCreatedIdentifier;
        this.clearFinalizedWeakReferencesInterval = androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
        handler.postDelayed(runnable, androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    private final void addInstance(Object obj, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.f(j, "Identifier must be >= 0: ").toString());
        }
        if (this.weakInstances.containsKey(Long.valueOf(j))) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.f(j, "Identifier has already been added: ").toString());
        }
        WeakReference<Object> weakReference = new WeakReference<>(obj, this.referenceQueue);
        this.identifiers.put(obj, Long.valueOf(j));
        this.weakInstances.put(Long.valueOf(j), weakReference);
        this.weakReferencesToIdentifiers.put(weakReference, Long.valueOf(j));
        this.strongInstances.put(Long.valueOf(j), obj);
    }

    private final void logWarningIfFinalizationListenerHasStopped() {
        if (hasFinalizationListenerStopped()) {
            Log.w(tag, "The manager was used after calls to the PigeonFinalizationListener has been stopped.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseAllFinalizedInstances() {
        if (hasFinalizationListenerStopped()) {
            return;
        }
        while (true) {
            WeakReference weakReference = (WeakReference) this.referenceQueue.poll();
            if (weakReference == null) {
                this.handler.postDelayed(this.releaseAllFinalizedInstancesRunnable, this.clearFinalizedWeakReferencesInterval);
                return;
            }
            Long l6 = (Long) kotlin.jvm.internal.D.c(this.weakReferencesToIdentifiers).remove(weakReference);
            if (l6 != null) {
                this.weakInstances.remove(l6);
                this.strongInstances.remove(l6);
                this.finalizationListener.onFinalize(l6.longValue());
            }
        }
    }

    public final void addDartCreatedInstance(Object instance, long j) {
        kotlin.jvm.internal.j.g(instance, "instance");
        logWarningIfFinalizationListenerHasStopped();
        addInstance(instance, j);
    }

    public final long addHostCreatedInstance(Object instance) {
        kotlin.jvm.internal.j.g(instance, "instance");
        logWarningIfFinalizationListenerHasStopped();
        if (!containsInstance(instance)) {
            long j = this.nextIdentifier;
            this.nextIdentifier = 1 + j;
            addInstance(instance, j);
            return j;
        }
        throw new IllegalArgumentException(("Instance of " + instance.getClass() + " has already been added.").toString());
    }

    public final void clear() {
        this.identifiers.clear();
        this.weakInstances.clear();
        this.strongInstances.clear();
        this.weakReferencesToIdentifiers.clear();
    }

    public final boolean containsInstance(Object obj) {
        logWarningIfFinalizationListenerHasStopped();
        return this.identifiers.containsKey(obj);
    }

    public final long getClearFinalizedWeakReferencesInterval() {
        return this.clearFinalizedWeakReferencesInterval;
    }

    public final Long getIdentifierForStrongReference(Object obj) {
        logWarningIfFinalizationListenerHasStopped();
        Long l6 = this.identifiers.get(obj);
        if (l6 != null) {
            HashMap<Long, Object> map = this.strongInstances;
            kotlin.jvm.internal.j.d(obj);
            map.put(l6, obj);
        }
        return l6;
    }

    public final <T> T getInstance(long j) {
        logWarningIfFinalizationListenerHasStopped();
        WeakReference<Object> weakReference = this.weakInstances.get(Long.valueOf(j));
        if (weakReference != null) {
            return (T) weakReference.get();
        }
        return null;
    }

    public final boolean hasFinalizationListenerStopped() {
        return this.hasFinalizationListenerStopped;
    }

    public final <T> T remove(long j) {
        logWarningIfFinalizationListenerHasStopped();
        Object androidWebkitLibraryPigeonInstanceManager = getInstance(j);
        if (androidWebkitLibraryPigeonInstanceManager instanceof WebViewProxyApi.WebViewPlatformView) {
            ((WebViewProxyApi.WebViewPlatformView) androidWebkitLibraryPigeonInstanceManager).destroy();
        }
        return (T) this.strongInstances.remove(Long.valueOf(j));
    }

    public final void setClearFinalizedWeakReferencesInterval(long j) {
        this.handler.removeCallbacks(this.releaseAllFinalizedInstancesRunnable);
        this.clearFinalizedWeakReferencesInterval = j;
        releaseAllFinalizedInstances();
    }

    public final void stopFinalizationListener() {
        this.handler.removeCallbacks(this.releaseAllFinalizedInstancesRunnable);
        this.hasFinalizationListenerStopped = true;
    }
}
