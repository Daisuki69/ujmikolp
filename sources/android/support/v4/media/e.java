package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import android.support.v4.media.session.MediaSessionCompat$Token;
import androidx.collection.ArrayMap;
import androidx.media.MediaBrowserProtocol;

/* JADX INFO: loaded from: classes.dex */
public class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaBrowser f7278b;
    public final Bundle c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f7279d = new a(this);
    public final ArrayMap e = new ArrayMap();
    public Y.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Messenger f7280g;
    public MediaSessionCompat$Token h;

    public e(Context context, ComponentName componentName, d dVar) {
        this.f7277a = context;
        Bundle bundle = new Bundle();
        this.c = bundle;
        bundle.putInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 1);
        bundle.putInt(MediaBrowserProtocol.EXTRA_CALLING_PID, Process.myPid());
        dVar.setInternalConnectionCallback(this);
        this.f7278b = new MediaBrowser(context, componentName, dVar.mConnectionCallbackFwk, bundle);
    }
}
