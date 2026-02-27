package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.NonNull;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.util.HashMap;
import pg.C2042e;
import pg.o;

/* JADX INFO: loaded from: classes4.dex */
public class SystemChannel {
    private static final String TAG = "SystemChannel";

    @NonNull
    public final C2042e channel;

    public SystemChannel(@NonNull DartExecutor dartExecutor) {
        this.channel = new C2042e(dartExecutor, "flutter/system", o.f19110a, null);
    }

    public void sendMemoryPressureWarning() {
        HashMap map = new HashMap(1);
        map.put(SessionDescription.ATTR_TYPE, "memoryPressure");
        this.channel.a(map, null);
    }
}
