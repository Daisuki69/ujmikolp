package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.util.HashMap;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import pg.E;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
public class MouseCursorChannel {
    private static final String TAG = "MouseCursorChannel";

    @NonNull
    public final u channel;

    @Nullable
    private MouseCursorMethodHandler mouseCursorMethodHandler;

    @NonNull
    private final s parsingMethodCallHandler;

    public interface MouseCursorMethodHandler {
        void activateSystemCursor(@NonNull String str);
    }

    public MouseCursorChannel(@NonNull DartExecutor dartExecutor) {
        s sVar = new s() { // from class: io.flutter.embedding.engine.systemchannels.MouseCursorChannel.1
            @Override // pg.s
            public void onMethodCall(@NonNull r rVar, @NonNull t tVar) {
                if (MouseCursorChannel.this.mouseCursorMethodHandler == null) {
                    return;
                }
                String str = rVar.f19112a;
                try {
                    if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                        try {
                            MouseCursorChannel.this.mouseCursorMethodHandler.activateSystemCursor((String) ((HashMap) rVar.f19113b).get("kind"));
                            tVar.success(Boolean.TRUE);
                        } catch (Exception e) {
                            tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, "Error when setting cursors: " + e.getMessage(), null);
                        }
                    }
                } catch (Exception e7) {
                    tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, "Unhandled error: " + e7.getMessage(), null);
                }
            }
        };
        this.parsingMethodCallHandler = sVar;
        u uVar = new u(dartExecutor, "flutter/mousecursor", E.f19095b, null);
        this.channel = uVar;
        uVar.b(sVar);
    }

    public void setMethodHandler(@Nullable MouseCursorMethodHandler mouseCursorMethodHandler) {
        this.mouseCursorMethodHandler = mouseCursorMethodHandler;
    }

    @VisibleForTesting
    public void synthesizeMethodCall(@NonNull r rVar, @NonNull t tVar) {
        this.parsingMethodCallHandler.onMethodCall(rVar, tVar);
    }
}
