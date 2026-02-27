package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import pg.E;
import pg.j;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
public class KeyboardChannel {
    public final u channel;
    private KeyboardMethodHandler keyboardMethodHandler;

    @NonNull
    public final s parsingMethodHandler;

    public interface KeyboardMethodHandler {
        Map<Long, Long> getKeyboardState();
    }

    public KeyboardChannel(@NonNull j jVar) {
        s sVar = new s() { // from class: io.flutter.embedding.engine.systemchannels.KeyboardChannel.1
            Map<Long, Long> pressedState = new HashMap();

            @Override // pg.s
            public void onMethodCall(@NonNull r rVar, @NonNull t tVar) {
                if (KeyboardChannel.this.keyboardMethodHandler == null) {
                    tVar.success(this.pressedState);
                    return;
                }
                String str = rVar.f19112a;
                str.getClass();
                if (!str.equals("getKeyboardState")) {
                    tVar.notImplemented();
                    return;
                }
                try {
                    this.pressedState = KeyboardChannel.this.keyboardMethodHandler.getKeyboardState();
                } catch (IllegalStateException e) {
                    tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, e.getMessage(), null);
                }
                tVar.success(this.pressedState);
            }
        };
        this.parsingMethodHandler = sVar;
        u uVar = new u(jVar, "flutter/keyboard", E.f19095b, null);
        this.channel = uVar;
        uVar.b(sVar);
    }

    public void setKeyboardMethodHandler(@Nullable KeyboardMethodHandler keyboardMethodHandler) {
        this.keyboardMethodHandler = keyboardMethodHandler;
    }
}
