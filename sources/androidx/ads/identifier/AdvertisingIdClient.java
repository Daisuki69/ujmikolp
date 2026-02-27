package androidx.ads.identifier;

import S1.y;
import android.content.Context;
import android.os.RemoteException;
import androidx.ads.identifier.internal.HoldingConnectionClient;
import androidx.ads.identifier.provider.IAdvertisingIdService;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class AdvertisingIdClient {
    private static final long AUTO_DISCONNECT_SECONDS = 30;
    private static final long TIMEOUT_SECONDS = 20;
    static final ExecutorService QUERY_EXECUTOR_SERVICE = Executors.newCachedThreadPool();
    static final ScheduledExecutorService SCHEDULED_EXECUTOR_SERVICE = Executors.newSingleThreadScheduledExecutor();
    private static final Object sLock = new Object();

    @NonNull
    static final AtomicReference<HoldingConnectionClient> sConnectionClient = new AtomicReference<>(null);

    public static abstract class ConnectionPair {
        @NonNull
        public static ConnectionPair of(HoldingConnectionClient holdingConnectionClient, long j) {
            return new AutoValue_AdvertisingIdClient_ConnectionPair(holdingConnectionClient, j);
        }

        @NonNull
        public abstract HoldingConnectionClient getConnectionClient();

        public abstract long getConnectionId();
    }

    private AdvertisingIdClient() {
    }

    @VisibleForTesting
    public static void clearConnectionClient() {
        sConnectionClient.set(null);
    }

    @NonNull
    public static y getAdvertisingIdInfo(@NonNull Context context) {
        final Context applicationContext = context.getApplicationContext();
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver<AdvertisingIdInfo>() { // from class: androidx.ads.identifier.AdvertisingIdClient.1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public Object attachCompleter(@NonNull CallbackToFutureAdapter.Completer<AdvertisingIdInfo> completer) {
                AdvertisingIdClient.submitAdvertisingIdInfoTask(applicationContext, completer);
                return "getAdvertisingIdInfo";
            }
        });
    }

    @NonNull
    @WorkerThread
    public static ConnectionPair getConnection(Context context) throws InterruptedException, AdvertisingIdNotAvailableException, TimeoutException, IOException {
        ConnectionPair connectionPairTryConnect;
        ConnectionPair connectionPairTryConnect2 = tryConnect();
        if (connectionPairTryConnect2 != null) {
            return connectionPairTryConnect2;
        }
        synchronized (sLock) {
            try {
                connectionPairTryConnect = tryConnect();
                if (connectionPairTryConnect == null) {
                    HoldingConnectionClient holdingConnectionClient = new HoldingConnectionClient(context);
                    sConnectionClient.set(holdingConnectionClient);
                    connectionPairTryConnect = ConnectionPair.of(holdingConnectionClient, 0L);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return connectionPairTryConnect;
    }

    @NonNull
    @VisibleForTesting
    @WorkerThread
    public static AdvertisingIdInfo getIdInfo(HoldingConnectionClient holdingConnectionClient) throws AdvertisingIdNotAvailableException, IOException {
        IAdvertisingIdService idService = holdingConnectionClient.getIdService();
        try {
            String id = idService.getId();
            if (id == null || id.trim().isEmpty()) {
                throw new AdvertisingIdNotAvailableException("Advertising ID Provider does not returns an Advertising ID.");
            }
            return AdvertisingIdInfo.builder().setId(id).setProviderPackageName(holdingConnectionClient.getPackageName()).setLimitAdTrackingEnabled(idService.isLimitAdTrackingEnabled()).build();
        } catch (RemoteException e) {
            throw new IOException("Remote exception", e);
        } catch (RuntimeException e7) {
            throw new AdvertisingIdNotAvailableException("Advertising ID Provider throws a exception.", e7);
        }
    }

    public static boolean isAdvertisingIdProviderAvailable(@NonNull Context context) {
        return !AdvertisingIdUtils.getAdvertisingIdProviderServices(context.getPackageManager()).isEmpty();
    }

    @VisibleForTesting
    public static boolean isConnected() {
        HoldingConnectionClient holdingConnectionClient = sConnectionClient.get();
        return holdingConnectionClient != null && holdingConnectionClient.isConnected();
    }

    public static void scheduleAutoDisconnect(final ConnectionPair connectionPair) {
        SCHEDULED_EXECUTOR_SERVICE.schedule(new Runnable() { // from class: androidx.ads.identifier.AdvertisingIdClient.4
            @Override // java.lang.Runnable
            public void run() {
                HoldingConnectionClient connectionClient = connectionPair.getConnectionClient();
                if (connectionClient.tryFinish(connectionPair.getConnectionId())) {
                    AtomicReference<HoldingConnectionClient> atomicReference = AdvertisingIdClient.sConnectionClient;
                    while (!atomicReference.compareAndSet(connectionClient, null) && atomicReference.get() == connectionClient) {
                    }
                }
            }
        }, AUTO_DISCONNECT_SECONDS, TimeUnit.SECONDS);
    }

    private static void scheduleTimeoutCheck(final Future<?> future, @NonNull final CallbackToFutureAdapter.Completer<AdvertisingIdInfo> completer) {
        SCHEDULED_EXECUTOR_SERVICE.schedule(new Runnable() { // from class: androidx.ads.identifier.AdvertisingIdClient.3
            @Override // java.lang.Runnable
            public void run() {
                if (future.isDone()) {
                    return;
                }
                completer.setException(new TimeoutException());
                future.cancel(true);
            }
        }, 20L, TimeUnit.SECONDS);
    }

    public static void submitAdvertisingIdInfoTask(final Context context, @NonNull final CallbackToFutureAdapter.Completer<AdvertisingIdInfo> completer) {
        scheduleTimeoutCheck(QUERY_EXECUTOR_SERVICE.submit(new Runnable() { // from class: androidx.ads.identifier.AdvertisingIdClient.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ConnectionPair connection = AdvertisingIdClient.getConnection(context);
                    AdvertisingIdClient.scheduleAutoDisconnect(connection);
                    completer.set(AdvertisingIdClient.getIdInfo(connection.getConnectionClient()));
                } catch (AdvertisingIdNotAvailableException | IOException | InterruptedException | TimeoutException e) {
                    completer.setException(e);
                }
            }
        }), completer);
    }

    @Nullable
    private static ConnectionPair tryConnect() {
        HoldingConnectionClient holdingConnectionClient = sConnectionClient.get();
        if (holdingConnectionClient == null) {
            return null;
        }
        long jAskConnectionId = holdingConnectionClient.askConnectionId();
        if (jAskConnectionId >= 0) {
            return ConnectionPair.of(holdingConnectionClient, jAskConnectionId);
        }
        return null;
    }
}
