package androidx.ads.identifier.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import androidx.ads.identifier.AdvertisingIdNotAvailableException;
import androidx.ads.identifier.AdvertisingIdUtils;
import androidx.ads.identifier.provider.IAdvertisingIdService;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class HoldingConnectionClient {
    private static final long SERVICE_CONNECTION_TIMEOUT_SECONDS = 10;

    @NonNull
    private final BlockingServiceConnection mConnection;
    private final Context mContext;

    @NonNull
    private final IAdvertisingIdService mIdService;
    private final AtomicLong mLastConnectionId = new AtomicLong(0);

    @NonNull
    private final String mPackageName;

    public class BlockingServiceConnection implements ServiceConnection {
        private final BlockingQueue<IBinder> mBlockingQueue = new LinkedBlockingQueue();

        public BlockingServiceConnection() {
        }

        @NonNull
        @WorkerThread
        public IBinder getServiceWithTimeout() throws InterruptedException, TimeoutException {
            IBinder iBinderPoll = this.mBlockingQueue.poll(HoldingConnectionClient.SERVICE_CONNECTION_TIMEOUT_SECONDS, TimeUnit.SECONDS);
            if (iBinderPoll != null) {
                return iBinderPoll;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.mBlockingQueue.add(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            HoldingConnectionClient.this.finish();
        }
    }

    @WorkerThread
    public HoldingConnectionClient(@NonNull Context context) throws InterruptedException, AdvertisingIdNotAvailableException, TimeoutException, IOException {
        this.mContext = context;
        ComponentName providerComponentName = getProviderComponentName(context);
        this.mConnection = getServiceConnection(providerComponentName);
        this.mIdService = getIdServiceFromConnection();
        this.mPackageName = providerComponentName.getPackageName();
    }

    private static ComponentName getProviderComponentName(Context context) throws AdvertisingIdNotAvailableException {
        PackageManager packageManager = context.getPackageManager();
        ServiceInfo serviceInfoSelectServiceByPriority = AdvertisingIdUtils.selectServiceByPriority(AdvertisingIdUtils.getAdvertisingIdProviderServices(packageManager), packageManager);
        if (serviceInfoSelectServiceByPriority != null) {
            return new ComponentName(serviceInfoSelectServiceByPriority.packageName, serviceInfoSelectServiceByPriority.name);
        }
        throw new AdvertisingIdNotAvailableException("No compatible AndroidX Advertising ID Provider available.");
    }

    public long askConnectionId() {
        return this.mLastConnectionId.incrementAndGet();
    }

    public void finish() {
        if (this.mLastConnectionId.getAndSet(Long.MIN_VALUE) >= 0) {
            this.mContext.unbindService(this.mConnection);
        }
    }

    @NonNull
    public IAdvertisingIdService getIdService() {
        return this.mIdService;
    }

    @VisibleForTesting
    @WorkerThread
    public IAdvertisingIdService getIdServiceFromConnection() throws InterruptedException, TimeoutException {
        return IAdvertisingIdService.Stub.asInterface(this.mConnection.getServiceWithTimeout());
    }

    @NonNull
    public String getPackageName() {
        return this.mPackageName;
    }

    @VisibleForTesting
    public BlockingServiceConnection getServiceConnection(ComponentName componentName) throws IOException {
        Intent intent = new Intent(AdvertisingIdUtils.GET_AD_ID_ACTION);
        intent.setComponent(componentName);
        BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
        if (this.mContext.bindService(intent, blockingServiceConnection, 1)) {
            return blockingServiceConnection;
        }
        throw new IOException("Connection failure");
    }

    public boolean isConnected() {
        return this.mLastConnectionId.get() >= 0;
    }

    public boolean tryFinish(long j) {
        if (!this.mLastConnectionId.compareAndSet(j, Long.MIN_VALUE)) {
            return !isConnected();
        }
        this.mContext.unbindService(this.mConnection);
        return true;
    }
}
