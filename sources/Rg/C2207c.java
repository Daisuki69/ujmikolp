package rg;

import K2.f;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.engine.systemchannels.MouseCursorChannel;

/* JADX INFO: renamed from: rg.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2207c {
    public static f c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterView f19947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MouseCursorChannel f19948b;

    public C2207c(FlutterView flutterView, MouseCursorChannel mouseCursorChannel) {
        this.f19947a = flutterView;
        this.f19948b = mouseCursorChannel;
        mouseCursorChannel.setMethodHandler(new C2205a(this));
    }
}
