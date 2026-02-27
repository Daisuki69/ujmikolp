package io.flutter.embedding.engine.systemchannels;

import io.flutter.embedding.engine.systemchannels.KeyEventChannel;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import pg.InterfaceC2041d;
import pg.t;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements PlatformViewsChannel.PlatformViewBufferResized, InterfaceC2041d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f17172a;

    public /* synthetic */ b(Object obj) {
        this.f17172a = obj;
    }

    @Override // pg.InterfaceC2041d
    public void reply(Object obj) {
        KeyEventChannel.lambda$createReplyHandler$0((KeyEventChannel.EventResponseHandler) this.f17172a, obj);
    }

    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewBufferResized
    public void run(PlatformViewsChannel.PlatformViewBufferSize platformViewBufferSize) {
        PlatformViewsChannel.AnonymousClass1.lambda$resize$0((t) this.f17172a, platformViewBufferSize);
    }
}
