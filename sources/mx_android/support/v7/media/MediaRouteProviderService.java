package mx_android.support.v7.media;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import mx_android.support.v7.media.MediaRouteProvider;
import mx_android.support.v7.media.MediaRouteSelector;
import mx_android.support.v7.media.MediaRouter;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MediaRouteProviderService extends Service {
    private static final int PRIVATE_MSG_CLIENT_DIED = 1;
    public static final String SERVICE_INTERFACE = "android.media.MediaRouteProviderService";
    private final ArrayList<ClientRecord> mClients = new ArrayList<>();
    private MediaRouteDiscoveryRequest mCompositeDiscoveryRequest;
    private final PrivateHandler mPrivateHandler;
    private MediaRouteProvider mProvider;
    private final ProviderCallback mProviderCallback;
    private final ReceiveHandler mReceiveHandler;
    private final Messenger mReceiveMessenger;
    private static final String TAG = "MediaRouteProviderSrv";
    private static final boolean DEBUG = Log.isLoggable(TAG, 3);

    public abstract MediaRouteProvider onCreateMediaRouteProvider();

    public MediaRouteProviderService() {
        ReceiveHandler receiveHandler = new ReceiveHandler(this);
        this.mReceiveHandler = receiveHandler;
        this.mReceiveMessenger = new Messenger(receiveHandler);
        this.mPrivateHandler = new PrivateHandler();
        this.mProviderCallback = new ProviderCallback();
    }

    public MediaRouteProvider getMediaRouteProvider() {
        return this.mProvider;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        MediaRouteProvider mediaRouteProviderOnCreateMediaRouteProvider;
        if (!intent.getAction().equals("android.media.MediaRouteProviderService")) {
            return null;
        }
        if (this.mProvider == null && (mediaRouteProviderOnCreateMediaRouteProvider = onCreateMediaRouteProvider()) != null) {
            String packageName = mediaRouteProviderOnCreateMediaRouteProvider.getMetadata().getPackageName();
            if (!packageName.equals(getPackageName())) {
                throw new IllegalStateException("onCreateMediaRouteProvider() returned a provider whose package name does not match the package name of the service.  A media route provider service can only export its own media route providers.  Provider package name: " + packageName + ".  Service package name: " + getPackageName() + ".");
            }
            this.mProvider = mediaRouteProviderOnCreateMediaRouteProvider;
            mediaRouteProviderOnCreateMediaRouteProvider.setCallback(this.mProviderCallback);
        }
        if (this.mProvider != null) {
            return this.mReceiveMessenger.getBinder();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onRegisterClient(Messenger messenger, int i, int i4) {
        if (i4 < 1 || findClient(messenger) >= 0) {
            return false;
        }
        ClientRecord clientRecord = new ClientRecord(messenger, i4);
        if (!clientRecord.register()) {
            return false;
        }
        this.mClients.add(clientRecord);
        if (DEBUG) {
            Log.d(TAG, clientRecord + ": Registered, version=" + i4);
        }
        if (i != 0) {
            MediaRouteProviderDescriptor descriptor = this.mProvider.getDescriptor();
            sendReply(messenger, 2, i, 1, descriptor != null ? descriptor.asBundle() : null, null);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onUnregisterClient(Messenger messenger, int i) {
        int iFindClient = findClient(messenger);
        if (iFindClient < 0) {
            return false;
        }
        ClientRecord clientRecordRemove = this.mClients.remove(iFindClient);
        if (DEBUG) {
            Log.d(TAG, clientRecordRemove + ": Unregistered");
        }
        clientRecordRemove.dispose();
        sendGenericSuccess(messenger, i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBinderDied(Messenger messenger) {
        int iFindClient = findClient(messenger);
        if (iFindClient >= 0) {
            ClientRecord clientRecordRemove = this.mClients.remove(iFindClient);
            if (DEBUG) {
                Log.d(TAG, clientRecordRemove + ": Binder died");
            }
            clientRecordRemove.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onCreateRouteController(Messenger messenger, int i, int i4, String str) {
        ClientRecord client = getClient(messenger);
        if (client == null || !client.createRouteController(str, i4)) {
            return false;
        }
        if (DEBUG) {
            Log.d(TAG, client + ": Route controller created, controllerId=" + i4 + ", routeId=" + str);
        }
        sendGenericSuccess(messenger, i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onReleaseRouteController(Messenger messenger, int i, int i4) {
        ClientRecord client = getClient(messenger);
        if (client == null || !client.releaseRouteController(i4)) {
            return false;
        }
        if (DEBUG) {
            Log.d(TAG, client + ": Route controller released, controllerId=" + i4);
        }
        sendGenericSuccess(messenger, i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onSelectRoute(Messenger messenger, int i, int i4) {
        MediaRouteProvider.RouteController routeController;
        ClientRecord client = getClient(messenger);
        if (client == null || (routeController = client.getRouteController(i4)) == null) {
            return false;
        }
        routeController.onSelect();
        if (DEBUG) {
            Log.d(TAG, client + ": Route selected, controllerId=" + i4);
        }
        sendGenericSuccess(messenger, i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onUnselectRoute(Messenger messenger, int i, int i4, int i6) {
        MediaRouteProvider.RouteController routeController;
        ClientRecord client = getClient(messenger);
        if (client == null || (routeController = client.getRouteController(i4)) == null) {
            return false;
        }
        routeController.onUnselect(i6);
        if (DEBUG) {
            Log.d(TAG, client + ": Route unselected, controllerId=" + i4);
        }
        sendGenericSuccess(messenger, i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onSetRouteVolume(Messenger messenger, int i, int i4, int i6) {
        MediaRouteProvider.RouteController routeController;
        ClientRecord client = getClient(messenger);
        if (client == null || (routeController = client.getRouteController(i4)) == null) {
            return false;
        }
        routeController.onSetVolume(i6);
        if (DEBUG) {
            Log.d(TAG, client + ": Route volume changed, controllerId=" + i4 + ", volume=" + i6);
        }
        sendGenericSuccess(messenger, i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onUpdateRouteVolume(Messenger messenger, int i, int i4, int i6) {
        MediaRouteProvider.RouteController routeController;
        ClientRecord client = getClient(messenger);
        if (client == null || (routeController = client.getRouteController(i4)) == null) {
            return false;
        }
        routeController.onUpdateVolume(i6);
        if (DEBUG) {
            Log.d(TAG, client + ": Route volume updated, controllerId=" + i4 + ", delta=" + i6);
        }
        sendGenericSuccess(messenger, i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onRouteControlRequest(final Messenger messenger, final int i, final int i4, final Intent intent) {
        MediaRouteProvider.RouteController routeController;
        final ClientRecord client = getClient(messenger);
        if (client == null || (routeController = client.getRouteController(i4)) == null) {
            return false;
        }
        if (!routeController.onControlRequest(intent, i != 0 ? new MediaRouter.ControlRequestCallback() { // from class: mx_android.support.v7.media.MediaRouteProviderService.1
            @Override // mx_android.support.v7.media.MediaRouter.ControlRequestCallback
            public void onResult(Bundle bundle) {
                if (MediaRouteProviderService.DEBUG) {
                    Log.d(MediaRouteProviderService.TAG, client + ": Route control request succeeded, controllerId=" + i4 + ", intent=" + intent + ", data=" + bundle);
                }
                if (MediaRouteProviderService.this.findClient(messenger) >= 0) {
                    MediaRouteProviderService.sendReply(messenger, 3, i, 0, bundle, null);
                }
            }

            @Override // mx_android.support.v7.media.MediaRouter.ControlRequestCallback
            public void onError(String str, Bundle bundle) {
                if (MediaRouteProviderService.DEBUG) {
                    Log.d(MediaRouteProviderService.TAG, client + ": Route control request failed, controllerId=" + i4 + ", intent=" + intent + ", error=" + str + ", data=" + bundle);
                }
                if (MediaRouteProviderService.this.findClient(messenger) >= 0) {
                    if (str == null) {
                        MediaRouteProviderService.sendReply(messenger, 4, i, 0, bundle, null);
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, str);
                    MediaRouteProviderService.sendReply(messenger, 4, i, 0, bundle, bundle2);
                }
            }
        } : null)) {
            return false;
        }
        if (!DEBUG) {
            return true;
        }
        Log.d(TAG, client + ": Route control request delivered, controllerId=" + i4 + ", intent=" + intent);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onSetDiscoveryRequest(Messenger messenger, int i, MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
        ClientRecord client = getClient(messenger);
        if (client == null) {
            return false;
        }
        boolean discoveryRequest = client.setDiscoveryRequest(mediaRouteDiscoveryRequest);
        if (DEBUG) {
            Log.d(TAG, client + ": Set discovery request, request=" + mediaRouteDiscoveryRequest + ", actuallyChanged=" + discoveryRequest + ", compositeDiscoveryRequest=" + this.mCompositeDiscoveryRequest);
        }
        sendGenericSuccess(messenger, i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendDescriptorChanged(MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
        Bundle bundleAsBundle = mediaRouteProviderDescriptor != null ? mediaRouteProviderDescriptor.asBundle() : null;
        int size = this.mClients.size();
        for (int i = 0; i < size; i++) {
            ClientRecord clientRecord = this.mClients.get(i);
            sendReply(clientRecord.mMessenger, 5, 0, 0, bundleAsBundle, null);
            if (DEBUG) {
                Log.d(TAG, clientRecord + ": Sent descriptor change event, descriptor=" + mediaRouteProviderDescriptor);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean updateCompositeDiscoveryRequest() {
        int size = this.mClients.size();
        MediaRouteSelector.Builder builder = null;
        MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest = null;
        boolean zIsActiveScan = false;
        for (int i = 0; i < size; i++) {
            MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest2 = this.mClients.get(i).mDiscoveryRequest;
            if (mediaRouteDiscoveryRequest2 != null && (!mediaRouteDiscoveryRequest2.getSelector().isEmpty() || mediaRouteDiscoveryRequest2.isActiveScan())) {
                zIsActiveScan |= mediaRouteDiscoveryRequest2.isActiveScan();
                if (mediaRouteDiscoveryRequest == null) {
                    mediaRouteDiscoveryRequest = mediaRouteDiscoveryRequest2;
                } else {
                    if (builder == null) {
                        builder = new MediaRouteSelector.Builder(mediaRouteDiscoveryRequest.getSelector());
                    }
                    builder.addSelector(mediaRouteDiscoveryRequest2.getSelector());
                }
            }
        }
        if (builder != null) {
            mediaRouteDiscoveryRequest = new MediaRouteDiscoveryRequest(builder.build(), zIsActiveScan);
        }
        MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest3 = this.mCompositeDiscoveryRequest;
        if (mediaRouteDiscoveryRequest3 == mediaRouteDiscoveryRequest || (mediaRouteDiscoveryRequest3 != null && mediaRouteDiscoveryRequest3.equals(mediaRouteDiscoveryRequest))) {
            return false;
        }
        this.mCompositeDiscoveryRequest = mediaRouteDiscoveryRequest;
        this.mProvider.setDiscoveryRequest(mediaRouteDiscoveryRequest);
        return true;
    }

    private ClientRecord getClient(Messenger messenger) {
        int iFindClient = findClient(messenger);
        if (iFindClient >= 0) {
            return this.mClients.get(iFindClient);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int findClient(Messenger messenger) {
        int size = this.mClients.size();
        for (int i = 0; i < size; i++) {
            if (this.mClients.get(i).hasMessenger(messenger)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sendGenericFailure(Messenger messenger, int i) {
        if (i != 0) {
            sendReply(messenger, 0, i, 0, null, null);
        }
    }

    private static void sendGenericSuccess(Messenger messenger, int i) {
        if (i != 0) {
            sendReply(messenger, 1, i, 0, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sendReply(Messenger messenger, int i, int i4, int i6, Object obj, Bundle bundle) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = i4;
        messageObtain.arg2 = i6;
        messageObtain.obj = obj;
        messageObtain.setData(bundle);
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e) {
            Log.e(TAG, "Could not send message to " + getClientId(messenger), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getClientId(Messenger messenger) {
        return "Client connection " + messenger.getBinder().toString();
    }

    private final class PrivateHandler extends Handler {
        private PrivateHandler() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            MediaRouteProviderService.this.onBinderDied((Messenger) message.obj);
        }
    }

    private final class ProviderCallback extends MediaRouteProvider.Callback {
        private ProviderCallback() {
        }

        @Override // mx_android.support.v7.media.MediaRouteProvider.Callback
        public void onDescriptorChanged(MediaRouteProvider mediaRouteProvider, MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
            MediaRouteProviderService.this.sendDescriptorChanged(mediaRouteProviderDescriptor);
        }
    }

    private final class ClientRecord implements IBinder.DeathRecipient {
        private final SparseArray<MediaRouteProvider.RouteController> mControllers = new SparseArray<>();
        public MediaRouteDiscoveryRequest mDiscoveryRequest;
        public final Messenger mMessenger;
        public final int mVersion;

        public ClientRecord(Messenger messenger, int i) {
            this.mMessenger = messenger;
            this.mVersion = i;
        }

        public boolean register() {
            try {
                this.mMessenger.getBinder().linkToDeath(this, 0);
                return true;
            } catch (RemoteException unused) {
                binderDied();
                return false;
            }
        }

        public void dispose() {
            int size = this.mControllers.size();
            for (int i = 0; i < size; i++) {
                this.mControllers.valueAt(i).onRelease();
            }
            this.mControllers.clear();
            this.mMessenger.getBinder().unlinkToDeath(this, 0);
            setDiscoveryRequest(null);
        }

        public boolean hasMessenger(Messenger messenger) {
            return this.mMessenger.getBinder() == messenger.getBinder();
        }

        public boolean createRouteController(String str, int i) {
            MediaRouteProvider.RouteController routeControllerOnCreateRouteController;
            if (this.mControllers.indexOfKey(i) >= 0 || (routeControllerOnCreateRouteController = MediaRouteProviderService.this.mProvider.onCreateRouteController(str)) == null) {
                return false;
            }
            this.mControllers.put(i, routeControllerOnCreateRouteController);
            return true;
        }

        public boolean releaseRouteController(int i) {
            MediaRouteProvider.RouteController routeController = this.mControllers.get(i);
            if (routeController == null) {
                return false;
            }
            this.mControllers.remove(i);
            routeController.onRelease();
            return true;
        }

        public MediaRouteProvider.RouteController getRouteController(int i) {
            return this.mControllers.get(i);
        }

        public boolean setDiscoveryRequest(MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
            MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest2 = this.mDiscoveryRequest;
            if (mediaRouteDiscoveryRequest2 == mediaRouteDiscoveryRequest) {
                return false;
            }
            if (mediaRouteDiscoveryRequest2 != null && mediaRouteDiscoveryRequest2.equals(mediaRouteDiscoveryRequest)) {
                return false;
            }
            this.mDiscoveryRequest = mediaRouteDiscoveryRequest;
            return MediaRouteProviderService.this.updateCompositeDiscoveryRequest();
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            MediaRouteProviderService.this.mPrivateHandler.obtainMessage(1, this.mMessenger).sendToTarget();
        }

        public String toString() {
            return MediaRouteProviderService.getClientId(this.mMessenger);
        }
    }

    private static final class ReceiveHandler extends Handler {
        private final WeakReference<MediaRouteProviderService> mServiceRef;

        public ReceiveHandler(MediaRouteProviderService mediaRouteProviderService) {
            this.mServiceRef = new WeakReference<>(mediaRouteProviderService);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Messenger messenger = message.replyTo;
            if (!MediaRouteProviderProtocol.isValidRemoteMessenger(messenger)) {
                if (MediaRouteProviderService.DEBUG) {
                    Log.d(MediaRouteProviderService.TAG, "Ignoring message without valid reply messenger.");
                    return;
                }
                return;
            }
            int i = message.what;
            int i4 = message.arg1;
            int i6 = message.arg2;
            Object obj = message.obj;
            Bundle bundlePeekData = message.peekData();
            if (processMessage(i, messenger, i4, i6, obj, bundlePeekData)) {
                return;
            }
            if (MediaRouteProviderService.DEBUG) {
                Log.d(MediaRouteProviderService.TAG, MediaRouteProviderService.getClientId(messenger) + ": Message failed, what=" + i + ", requestId=" + i4 + ", arg=" + i6 + ", obj=" + obj + ", data=" + bundlePeekData);
            }
            MediaRouteProviderService.sendGenericFailure(messenger, i4);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private boolean processMessage(int i, Messenger messenger, int i4, int i6, Object obj, Bundle bundle) {
            MediaRouteProviderService mediaRouteProviderService = this.mServiceRef.get();
            if (mediaRouteProviderService != null) {
                switch (i) {
                    case 1:
                        return mediaRouteProviderService.onRegisterClient(messenger, i4, i6);
                    case 2:
                        return mediaRouteProviderService.onUnregisterClient(messenger, i4);
                    case 3:
                        String string = bundle.getString(MediaRouteProviderProtocol.CLIENT_DATA_ROUTE_ID);
                        if (string != null) {
                            return mediaRouteProviderService.onCreateRouteController(messenger, i4, i6, string);
                        }
                        break;
                    case 4:
                        return mediaRouteProviderService.onReleaseRouteController(messenger, i4, i6);
                    case 5:
                        return mediaRouteProviderService.onSelectRoute(messenger, i4, i6);
                    case 6:
                        return mediaRouteProviderService.onUnselectRoute(messenger, i4, i6, bundle != null ? bundle.getInt(MediaRouteProviderProtocol.CLIENT_DATA_UNSELECT_REASON, 0) : 0);
                    case 7:
                        int i10 = bundle.getInt(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, -1);
                        if (i10 >= 0) {
                            return mediaRouteProviderService.onSetRouteVolume(messenger, i4, i6, i10);
                        }
                        break;
                    case 8:
                        int i11 = bundle.getInt(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, 0);
                        if (i11 != 0) {
                            return mediaRouteProviderService.onUpdateRouteVolume(messenger, i4, i6, i11);
                        }
                        break;
                    case 9:
                        if (obj instanceof Intent) {
                            return mediaRouteProviderService.onRouteControlRequest(messenger, i4, i6, (Intent) obj);
                        }
                        break;
                    case 10:
                        if (obj == null || (obj instanceof Bundle)) {
                            MediaRouteDiscoveryRequest mediaRouteDiscoveryRequestFromBundle = MediaRouteDiscoveryRequest.fromBundle((Bundle) obj);
                            if (mediaRouteDiscoveryRequestFromBundle == null || !mediaRouteDiscoveryRequestFromBundle.isValid()) {
                                mediaRouteDiscoveryRequestFromBundle = null;
                            }
                            return mediaRouteProviderService.onSetDiscoveryRequest(messenger, i4, mediaRouteDiscoveryRequestFromBundle);
                        }
                        break;
                }
            }
            return false;
        }
    }
}
