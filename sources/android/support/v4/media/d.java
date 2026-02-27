package android.support.v4.media;

import android.media.browse.MediaBrowser;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    final MediaBrowser.ConnectionCallback mConnectionCallbackFwk = new b(this);
    c mConnectionCallbackInternal;

    public abstract void onConnected();

    public abstract void onConnectionFailed();

    public abstract void onConnectionSuspended();

    public void setInternalConnectionCallback(c cVar) {
        this.mConnectionCallbackInternal = cVar;
    }
}
