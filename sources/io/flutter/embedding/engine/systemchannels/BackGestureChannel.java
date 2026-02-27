package io.flutter.embedding.engine.systemchannels;

import android.annotation.TargetApi;
import android.window.BackEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import pg.E;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
public class BackGestureChannel {
    private static final String TAG = "BackGestureChannel";

    @NonNull
    public final u channel;
    private final s defaultHandler;

    public BackGestureChannel(@NonNull DartExecutor dartExecutor) {
        s sVar = new s() { // from class: io.flutter.embedding.engine.systemchannels.BackGestureChannel.1
            @Override // pg.s
            public void onMethodCall(@NonNull r rVar, @NonNull t tVar) {
                tVar.success(null);
            }
        };
        this.defaultHandler = sVar;
        u uVar = new u(dartExecutor, "flutter/backgesture", E.f19095b, null);
        this.channel = uVar;
        uVar.b(sVar);
    }

    @RequiresApi(34)
    @TargetApi(34)
    private Map<String, Object> backEventToJsonMap(@NonNull BackEvent backEvent) {
        HashMap map = new HashMap(3);
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        map.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        map.put("progress", Float.valueOf(backEvent.getProgress()));
        map.put("swipeEdge", Integer.valueOf(backEvent.getSwipeEdge()));
        return map;
    }

    @RequiresApi(34)
    @TargetApi(34)
    public void cancelBackGesture() {
        this.channel.a("cancelBackGesture", null, null);
    }

    @RequiresApi(34)
    @TargetApi(34)
    public void commitBackGesture() {
        this.channel.a("commitBackGesture", null, null);
    }

    public void setMethodCallHandler(@Nullable s sVar) {
        this.channel.b(sVar);
    }

    @RequiresApi(34)
    @TargetApi(34)
    public void startBackGesture(@NonNull BackEvent backEvent) {
        this.channel.a("startBackGesture", backEventToJsonMap(backEvent), null);
    }

    @RequiresApi(34)
    @TargetApi(34)
    public void updateBackGestureProgress(@NonNull BackEvent backEvent) {
        this.channel.a("updateBackGestureProgress", backEventToJsonMap(backEvent), null);
    }
}
