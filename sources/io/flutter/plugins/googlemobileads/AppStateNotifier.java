package io.flutter.plugins.googlemobileads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.extractor.text.ttml.TtmlNode;
import pg.j;
import pg.k;
import pg.m;
import pg.n;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
final class AppStateNotifier implements LifecycleEventObserver, s, m {
    private static final String EVENT_CHANNEL_NAME = "plugins.flutter.io/google_mobile_ads/app_state_event";
    private static final String METHOD_CHANNEL_NAME = "plugins.flutter.io/google_mobile_ads/app_state_method";

    @NonNull
    private final n eventChannel;

    @Nullable
    private k events;

    @NonNull
    private final u methodChannel;

    public AppStateNotifier(j jVar) {
        u uVar = new u(jVar, METHOD_CHANNEL_NAME);
        this.methodChannel = uVar;
        uVar.b(this);
        n nVar = new n(jVar, EVENT_CHANNEL_NAME);
        this.eventChannel = nVar;
        nVar.a(this);
    }

    @Override // pg.m
    public void onCancel(Object obj) {
        this.events = null;
    }

    @Override // pg.m
    public void onListen(Object obj, k kVar) {
        this.events = kVar;
    }

    @Override // pg.s
    public void onMethodCall(@NonNull r rVar, @NonNull t tVar) {
        String str = rVar.f19112a;
        str.getClass();
        if (str.equals("stop")) {
            stop();
        } else if (str.equals(TtmlNode.START)) {
            start();
        } else {
            tVar.notImplemented();
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        k kVar;
        k kVar2;
        if (event == Lifecycle.Event.ON_START && (kVar2 = this.events) != null) {
            kVar2.success(DownloadService.KEY_FOREGROUND);
        } else {
            if (event != Lifecycle.Event.ON_STOP || (kVar = this.events) == null) {
                return;
            }
            kVar.success("background");
        }
    }

    public void start() {
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
    }

    public void stop() {
        ProcessLifecycleOwner.get().getLifecycle().removeObserver(this);
    }
}
