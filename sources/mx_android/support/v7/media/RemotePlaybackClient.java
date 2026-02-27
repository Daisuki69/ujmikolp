package mx_android.support.v7.media;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import mx_android.support.v7.media.MediaRouter;

/* JADX INFO: loaded from: classes7.dex */
public class RemotePlaybackClient {
    private final Context mContext;
    private final PendingIntent mItemStatusPendingIntent;
    private final MediaRouter.RouteInfo mRoute;
    private boolean mRouteSupportsQueuing;
    private boolean mRouteSupportsRemotePlayback;
    private boolean mRouteSupportsSessionManagement;
    private String mSessionId;
    private final PendingIntent mSessionStatusPendingIntent;
    private StatusCallback mStatusCallback;
    private final StatusReceiver mStatusReceiver;
    private static final String TAG = "RemotePlaybackClient";
    private static final boolean DEBUG = Log.isLoggable(TAG, 3);

    public static abstract class ActionCallback {
        public void onError(String str, int i, Bundle bundle) {
        }
    }

    public static abstract class ItemActionCallback extends ActionCallback {
        public void onResult(Bundle bundle, String str, MediaSessionStatus mediaSessionStatus, String str2, MediaItemStatus mediaItemStatus) {
        }
    }

    public static abstract class SessionActionCallback extends ActionCallback {
        public void onResult(Bundle bundle, String str, MediaSessionStatus mediaSessionStatus) {
        }
    }

    public static abstract class StatusCallback {
        public void onItemStatusChanged(Bundle bundle, String str, MediaSessionStatus mediaSessionStatus, String str2, MediaItemStatus mediaItemStatus) {
        }

        public void onSessionChanged(String str) {
        }

        public void onSessionStatusChanged(Bundle bundle, String str, MediaSessionStatus mediaSessionStatus) {
        }
    }

    public RemotePlaybackClient(Context context, MediaRouter.RouteInfo routeInfo) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (routeInfo == null) {
            throw new IllegalArgumentException("route must not be null");
        }
        this.mContext = context;
        this.mRoute = routeInfo;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(StatusReceiver.ACTION_ITEM_STATUS_CHANGED);
        intentFilter.addAction(StatusReceiver.ACTION_SESSION_STATUS_CHANGED);
        StatusReceiver statusReceiver = new StatusReceiver();
        this.mStatusReceiver = statusReceiver;
        context.registerReceiver(statusReceiver, intentFilter);
        Intent intent = new Intent(StatusReceiver.ACTION_ITEM_STATUS_CHANGED);
        intent.setPackage(context.getPackageName());
        this.mItemStatusPendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
        Intent intent2 = new Intent(StatusReceiver.ACTION_SESSION_STATUS_CHANGED);
        intent2.setPackage(context.getPackageName());
        this.mSessionStatusPendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 0);
        detectFeatures();
    }

    public void release() {
        this.mContext.unregisterReceiver(this.mStatusReceiver);
    }

    public boolean isRemotePlaybackSupported() {
        return this.mRouteSupportsRemotePlayback;
    }

    public boolean isQueuingSupported() {
        return this.mRouteSupportsQueuing;
    }

    public boolean isSessionManagementSupported() {
        return this.mRouteSupportsSessionManagement;
    }

    public String getSessionId() {
        return this.mSessionId;
    }

    public void setSessionId(String str) {
        String str2 = this.mSessionId;
        if (str2 != str) {
            if (str2 == null || !str2.equals(str)) {
                if (DEBUG) {
                    Log.d(TAG, "Session id is now: " + str);
                }
                this.mSessionId = str;
                StatusCallback statusCallback = this.mStatusCallback;
                if (statusCallback != null) {
                    statusCallback.onSessionChanged(str);
                }
            }
        }
    }

    public boolean hasSession() {
        return this.mSessionId != null;
    }

    public void setStatusCallback(StatusCallback statusCallback) {
        this.mStatusCallback = statusCallback;
    }

    public void play(Uri uri, String str, Bundle bundle, long j, Bundle bundle2, ItemActionCallback itemActionCallback) {
        playOrEnqueue(uri, str, bundle, j, bundle2, itemActionCallback, MediaControlIntent.ACTION_PLAY);
    }

    public void enqueue(Uri uri, String str, Bundle bundle, long j, Bundle bundle2, ItemActionCallback itemActionCallback) {
        playOrEnqueue(uri, str, bundle, j, bundle2, itemActionCallback, MediaControlIntent.ACTION_ENQUEUE);
    }

    private void playOrEnqueue(Uri uri, String str, Bundle bundle, long j, Bundle bundle2, ItemActionCallback itemActionCallback, String str2) {
        if (uri == null) {
            throw new IllegalArgumentException("contentUri must not be null");
        }
        throwIfRemotePlaybackNotSupported();
        if (str2.equals(MediaControlIntent.ACTION_ENQUEUE)) {
            throwIfQueuingNotSupported();
        }
        Intent intent = new Intent(str2);
        intent.setDataAndType(uri, str);
        intent.putExtra(MediaControlIntent.EXTRA_ITEM_STATUS_UPDATE_RECEIVER, this.mItemStatusPendingIntent);
        if (bundle != null) {
            intent.putExtra(MediaControlIntent.EXTRA_ITEM_METADATA, bundle);
        }
        if (j != 0) {
            intent.putExtra(MediaControlIntent.EXTRA_ITEM_CONTENT_POSITION, j);
        }
        performItemAction(intent, this.mSessionId, null, bundle2, itemActionCallback);
    }

    public void seek(String str, long j, Bundle bundle, ItemActionCallback itemActionCallback) {
        if (str == null) {
            throw new IllegalArgumentException("itemId must not be null");
        }
        throwIfNoCurrentSession();
        Intent intent = new Intent(MediaControlIntent.ACTION_SEEK);
        intent.putExtra(MediaControlIntent.EXTRA_ITEM_CONTENT_POSITION, j);
        performItemAction(intent, this.mSessionId, str, bundle, itemActionCallback);
    }

    public void getStatus(String str, Bundle bundle, ItemActionCallback itemActionCallback) {
        if (str == null) {
            throw new IllegalArgumentException("itemId must not be null");
        }
        throwIfNoCurrentSession();
        performItemAction(new Intent(MediaControlIntent.ACTION_GET_STATUS), this.mSessionId, str, bundle, itemActionCallback);
    }

    public void remove(String str, Bundle bundle, ItemActionCallback itemActionCallback) {
        if (str == null) {
            throw new IllegalArgumentException("itemId must not be null");
        }
        throwIfQueuingNotSupported();
        throwIfNoCurrentSession();
        performItemAction(new Intent(MediaControlIntent.ACTION_REMOVE), this.mSessionId, str, bundle, itemActionCallback);
    }

    public void pause(Bundle bundle, SessionActionCallback sessionActionCallback) {
        throwIfNoCurrentSession();
        performSessionAction(new Intent(MediaControlIntent.ACTION_PAUSE), this.mSessionId, bundle, sessionActionCallback);
    }

    public void resume(Bundle bundle, SessionActionCallback sessionActionCallback) {
        throwIfNoCurrentSession();
        performSessionAction(new Intent(MediaControlIntent.ACTION_RESUME), this.mSessionId, bundle, sessionActionCallback);
    }

    public void stop(Bundle bundle, SessionActionCallback sessionActionCallback) {
        throwIfNoCurrentSession();
        performSessionAction(new Intent(MediaControlIntent.ACTION_STOP), this.mSessionId, bundle, sessionActionCallback);
    }

    public void startSession(Bundle bundle, SessionActionCallback sessionActionCallback) {
        throwIfSessionManagementNotSupported();
        Intent intent = new Intent(MediaControlIntent.ACTION_START_SESSION);
        intent.putExtra(MediaControlIntent.EXTRA_SESSION_STATUS_UPDATE_RECEIVER, this.mSessionStatusPendingIntent);
        performSessionAction(intent, null, bundle, sessionActionCallback);
    }

    public void getSessionStatus(Bundle bundle, SessionActionCallback sessionActionCallback) {
        throwIfSessionManagementNotSupported();
        throwIfNoCurrentSession();
        performSessionAction(new Intent(MediaControlIntent.ACTION_GET_SESSION_STATUS), this.mSessionId, bundle, sessionActionCallback);
    }

    public void endSession(Bundle bundle, SessionActionCallback sessionActionCallback) {
        throwIfSessionManagementNotSupported();
        throwIfNoCurrentSession();
        performSessionAction(new Intent(MediaControlIntent.ACTION_END_SESSION), this.mSessionId, bundle, sessionActionCallback);
    }

    private void performItemAction(final Intent intent, final String str, final String str2, Bundle bundle, final ItemActionCallback itemActionCallback) {
        intent.addCategory(MediaControlIntent.CATEGORY_REMOTE_PLAYBACK);
        if (str != null) {
            intent.putExtra(MediaControlIntent.EXTRA_SESSION_ID, str);
        }
        if (str2 != null) {
            intent.putExtra(MediaControlIntent.EXTRA_ITEM_ID, str2);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        logRequest(intent);
        this.mRoute.sendControlRequest(intent, new MediaRouter.ControlRequestCallback() { // from class: mx_android.support.v7.media.RemotePlaybackClient.1
            @Override // mx_android.support.v7.media.MediaRouter.ControlRequestCallback
            public void onResult(Bundle bundle2) {
                if (bundle2 != null) {
                    String strInferMissingResult = RemotePlaybackClient.inferMissingResult(str, bundle2.getString(MediaControlIntent.EXTRA_SESSION_ID));
                    MediaSessionStatus mediaSessionStatusFromBundle = MediaSessionStatus.fromBundle(bundle2.getBundle(MediaControlIntent.EXTRA_SESSION_STATUS));
                    String strInferMissingResult2 = RemotePlaybackClient.inferMissingResult(str2, bundle2.getString(MediaControlIntent.EXTRA_ITEM_ID));
                    MediaItemStatus mediaItemStatusFromBundle = MediaItemStatus.fromBundle(bundle2.getBundle(MediaControlIntent.EXTRA_ITEM_STATUS));
                    RemotePlaybackClient.this.adoptSession(strInferMissingResult);
                    if (strInferMissingResult != null && strInferMissingResult2 != null && mediaItemStatusFromBundle != null) {
                        if (RemotePlaybackClient.DEBUG) {
                            Log.d(RemotePlaybackClient.TAG, "Received result from " + intent.getAction() + ": data=" + RemotePlaybackClient.bundleToString(bundle2) + ", sessionId=" + strInferMissingResult + ", sessionStatus=" + mediaSessionStatusFromBundle + ", itemId=" + strInferMissingResult2 + ", itemStatus=" + mediaItemStatusFromBundle);
                        }
                        itemActionCallback.onResult(bundle2, strInferMissingResult, mediaSessionStatusFromBundle, strInferMissingResult2, mediaItemStatusFromBundle);
                        return;
                    }
                }
                RemotePlaybackClient.this.handleInvalidResult(intent, itemActionCallback, bundle2);
            }

            @Override // mx_android.support.v7.media.MediaRouter.ControlRequestCallback
            public void onError(String str3, Bundle bundle2) {
                RemotePlaybackClient.this.handleError(intent, itemActionCallback, str3, bundle2);
            }
        });
    }

    private void performSessionAction(final Intent intent, final String str, Bundle bundle, final SessionActionCallback sessionActionCallback) {
        intent.addCategory(MediaControlIntent.CATEGORY_REMOTE_PLAYBACK);
        if (str != null) {
            intent.putExtra(MediaControlIntent.EXTRA_SESSION_ID, str);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        logRequest(intent);
        this.mRoute.sendControlRequest(intent, new MediaRouter.ControlRequestCallback() { // from class: mx_android.support.v7.media.RemotePlaybackClient.2
            @Override // mx_android.support.v7.media.MediaRouter.ControlRequestCallback
            public void onResult(Bundle bundle2) {
                boolean zEquals;
                boolean zEquals2;
                if (bundle2 != null) {
                    String strInferMissingResult = RemotePlaybackClient.inferMissingResult(str, bundle2.getString(MediaControlIntent.EXTRA_SESSION_ID));
                    MediaSessionStatus mediaSessionStatusFromBundle = MediaSessionStatus.fromBundle(bundle2.getBundle(MediaControlIntent.EXTRA_SESSION_STATUS));
                    RemotePlaybackClient.this.adoptSession(strInferMissingResult);
                    if (strInferMissingResult != null) {
                        if (RemotePlaybackClient.DEBUG) {
                            Log.d(RemotePlaybackClient.TAG, "Received result from " + intent.getAction() + ": data=" + RemotePlaybackClient.bundleToString(bundle2) + ", sessionId=" + strInferMissingResult + ", sessionStatus=" + mediaSessionStatusFromBundle);
                        }
                        try {
                            sessionActionCallback.onResult(bundle2, strInferMissingResult, mediaSessionStatusFromBundle);
                            if (zEquals) {
                                if (zEquals2) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        } finally {
                            if (intent.getAction().equals(MediaControlIntent.ACTION_END_SESSION) && strInferMissingResult.equals(RemotePlaybackClient.this.mSessionId)) {
                                RemotePlaybackClient.this.setSessionId(null);
                            }
                        }
                    }
                }
                RemotePlaybackClient.this.handleInvalidResult(intent, sessionActionCallback, bundle2);
            }

            @Override // mx_android.support.v7.media.MediaRouter.ControlRequestCallback
            public void onError(String str2, Bundle bundle2) {
                RemotePlaybackClient.this.handleError(intent, sessionActionCallback, str2, bundle2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void adoptSession(String str) {
        if (str != null) {
            setSessionId(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleInvalidResult(Intent intent, ActionCallback actionCallback, Bundle bundle) {
        Log.w(TAG, "Received invalid result data from " + intent.getAction() + ": data=" + bundleToString(bundle));
        actionCallback.onError(null, 0, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleError(Intent intent, ActionCallback actionCallback, String str, Bundle bundle) {
        int i = bundle != null ? bundle.getInt(MediaControlIntent.EXTRA_ERROR_CODE, 0) : 0;
        if (DEBUG) {
            Log.w(TAG, "Received error from " + intent.getAction() + ": error=" + str + ", code=" + i + ", data=" + bundleToString(bundle));
        }
        actionCallback.onError(str, i, bundle);
    }

    private void detectFeatures() {
        boolean z4 = routeSupportsAction(MediaControlIntent.ACTION_PLAY) && routeSupportsAction(MediaControlIntent.ACTION_SEEK) && routeSupportsAction(MediaControlIntent.ACTION_GET_STATUS) && routeSupportsAction(MediaControlIntent.ACTION_PAUSE) && routeSupportsAction(MediaControlIntent.ACTION_RESUME) && routeSupportsAction(MediaControlIntent.ACTION_STOP);
        this.mRouteSupportsRemotePlayback = z4;
        this.mRouteSupportsQueuing = z4 && routeSupportsAction(MediaControlIntent.ACTION_ENQUEUE) && routeSupportsAction(MediaControlIntent.ACTION_REMOVE);
        this.mRouteSupportsSessionManagement = this.mRouteSupportsRemotePlayback && routeSupportsAction(MediaControlIntent.ACTION_START_SESSION) && routeSupportsAction(MediaControlIntent.ACTION_GET_SESSION_STATUS) && routeSupportsAction(MediaControlIntent.ACTION_END_SESSION);
    }

    private boolean routeSupportsAction(String str) {
        return this.mRoute.supportsControlAction(MediaControlIntent.CATEGORY_REMOTE_PLAYBACK, str);
    }

    private void throwIfRemotePlaybackNotSupported() {
        if (!this.mRouteSupportsRemotePlayback) {
            throw new UnsupportedOperationException("The route does not support remote playback.");
        }
    }

    private void throwIfQueuingNotSupported() {
        if (!this.mRouteSupportsQueuing) {
            throw new UnsupportedOperationException("The route does not support queuing.");
        }
    }

    private void throwIfSessionManagementNotSupported() {
        if (!this.mRouteSupportsSessionManagement) {
            throw new UnsupportedOperationException("The route does not support session management.");
        }
    }

    private void throwIfNoCurrentSession() {
        if (this.mSessionId == null) {
            throw new IllegalStateException("There is no current session.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String inferMissingResult(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        if (str == null || str.equals(str2)) {
            return str2;
        }
        return null;
    }

    private static void logRequest(Intent intent) {
        if (DEBUG) {
            Log.d(TAG, "Sending request: " + intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String bundleToString(Bundle bundle) {
        if (bundle == null) {
            return "null";
        }
        bundle.size();
        return bundle.toString();
    }

    private final class StatusReceiver extends BroadcastReceiver {
        public static final String ACTION_ITEM_STATUS_CHANGED = "mx_android.support.v7.media.actions.ACTION_ITEM_STATUS_CHANGED";
        public static final String ACTION_SESSION_STATUS_CHANGED = "mx_android.support.v7.media.actions.ACTION_SESSION_STATUS_CHANGED";

        private StatusReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra(MediaControlIntent.EXTRA_SESSION_ID);
            if (stringExtra == null || !stringExtra.equals(RemotePlaybackClient.this.mSessionId)) {
                Log.w(RemotePlaybackClient.TAG, "Discarding spurious status callback with missing or invalid session id: sessionId=" + stringExtra);
                return;
            }
            MediaSessionStatus mediaSessionStatusFromBundle = MediaSessionStatus.fromBundle(intent.getBundleExtra(MediaControlIntent.EXTRA_SESSION_STATUS));
            String action = intent.getAction();
            if (action.equals(ACTION_ITEM_STATUS_CHANGED)) {
                String stringExtra2 = intent.getStringExtra(MediaControlIntent.EXTRA_ITEM_ID);
                if (stringExtra2 == null) {
                    Log.w(RemotePlaybackClient.TAG, "Discarding spurious status callback with missing item id.");
                    return;
                }
                MediaItemStatus mediaItemStatusFromBundle = MediaItemStatus.fromBundle(intent.getBundleExtra(MediaControlIntent.EXTRA_ITEM_STATUS));
                if (mediaItemStatusFromBundle != null) {
                    if (RemotePlaybackClient.DEBUG) {
                        Log.d(RemotePlaybackClient.TAG, "Received item status callback: sessionId=" + stringExtra + ", sessionStatus=" + mediaSessionStatusFromBundle + ", itemId=" + stringExtra2 + ", itemStatus=" + mediaItemStatusFromBundle);
                    }
                    if (RemotePlaybackClient.this.mStatusCallback != null) {
                        RemotePlaybackClient.this.mStatusCallback.onItemStatusChanged(intent.getExtras(), stringExtra, mediaSessionStatusFromBundle, stringExtra2, mediaItemStatusFromBundle);
                        return;
                    }
                    return;
                }
                Log.w(RemotePlaybackClient.TAG, "Discarding spurious status callback with missing item status.");
                return;
            }
            if (action.equals(ACTION_SESSION_STATUS_CHANGED)) {
                if (mediaSessionStatusFromBundle != null) {
                    if (RemotePlaybackClient.DEBUG) {
                        Log.d(RemotePlaybackClient.TAG, "Received session status callback: sessionId=" + stringExtra + ", sessionStatus=" + mediaSessionStatusFromBundle);
                    }
                    if (RemotePlaybackClient.this.mStatusCallback != null) {
                        RemotePlaybackClient.this.mStatusCallback.onSessionStatusChanged(intent.getExtras(), stringExtra, mediaSessionStatusFromBundle);
                        return;
                    }
                    return;
                }
                Log.w(RemotePlaybackClient.TAG, "Discarding spurious media status callback with missing session status.");
            }
        }
    }
}
