package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.datasource.cache.c;
import io.flutter.embedding.engine.dart.DartExecutor;
import pg.p;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
public class NavigationChannel {
    private static final String TAG = "NavigationChannel";

    @NonNull
    public final u channel;
    private final s defaultHandler;

    public NavigationChannel(@NonNull DartExecutor dartExecutor) {
        s sVar = new s() { // from class: io.flutter.embedding.engine.systemchannels.NavigationChannel.1
            @Override // pg.s
            public void onMethodCall(@NonNull r rVar, @NonNull t tVar) {
                tVar.success(null);
            }
        };
        this.defaultHandler = sVar;
        u uVar = new u(dartExecutor, "flutter/navigation", p.f19111a, null);
        this.channel = uVar;
        uVar.b(sVar);
    }

    public void popRoute() {
        this.channel.a("popRoute", null, null);
    }

    public void pushRoute(@NonNull String str) {
        this.channel.a("pushRoute", str, null);
    }

    public void pushRouteInformation(@NonNull String str) {
        this.channel.a("pushRouteInformation", c.p("location", str), null);
    }

    public void setInitialRoute(@NonNull String str) {
        this.channel.a("setInitialRoute", str, null);
    }

    public void setMethodCallHandler(@Nullable s sVar) {
        this.channel.b(sVar);
    }
}
