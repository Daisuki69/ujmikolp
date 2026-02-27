package io.flutter.embedding.engine.systemchannels;

import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.util.ArrayList;
import java.util.Map;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import pg.E;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
public class ProcessTextChannel {
    private static final String CHANNEL_NAME = "flutter/processtext";
    private static final String METHOD_PROCESS_TEXT_ACTION = "ProcessText.processTextAction";
    private static final String METHOD_QUERY_TEXT_ACTIONS = "ProcessText.queryTextActions";
    private static final String TAG = "ProcessTextChannel";
    public final u channel;
    public final PackageManager packageManager;

    @NonNull
    public final s parsingMethodHandler;
    private ProcessTextMethodHandler processTextMethodHandler;

    public interface ProcessTextMethodHandler {
        void processTextAction(@NonNull String str, @NonNull String str2, @NonNull boolean z4, @NonNull t tVar);

        Map<String, String> queryTextActions();
    }

    public ProcessTextChannel(@NonNull DartExecutor dartExecutor, @NonNull PackageManager packageManager) {
        s sVar = new s() { // from class: io.flutter.embedding.engine.systemchannels.ProcessTextChannel.1
            @Override // pg.s
            public void onMethodCall(@NonNull r rVar, @NonNull t tVar) {
                if (ProcessTextChannel.this.processTextMethodHandler == null) {
                    return;
                }
                String str = rVar.f19112a;
                Object obj = rVar.f19113b;
                str.getClass();
                if (!str.equals(ProcessTextChannel.METHOD_PROCESS_TEXT_ACTION)) {
                    if (!str.equals(ProcessTextChannel.METHOD_QUERY_TEXT_ACTIONS)) {
                        tVar.notImplemented();
                        return;
                    }
                    try {
                        tVar.success(ProcessTextChannel.this.processTextMethodHandler.queryTextActions());
                        return;
                    } catch (IllegalStateException e) {
                        tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, e.getMessage(), null);
                        return;
                    }
                }
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    ProcessTextChannel.this.processTextMethodHandler.processTextAction((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), tVar);
                } catch (IllegalStateException e7) {
                    tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, e7.getMessage(), null);
                }
            }
        };
        this.parsingMethodHandler = sVar;
        this.packageManager = packageManager;
        u uVar = new u(dartExecutor, CHANNEL_NAME, E.f19095b, null);
        this.channel = uVar;
        uVar.b(sVar);
    }

    public void setMethodHandler(@Nullable ProcessTextMethodHandler processTextMethodHandler) {
        this.processTextMethodHandler = processTextMethodHandler;
    }
}
