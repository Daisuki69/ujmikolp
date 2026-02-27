package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import og.C1978b;
import pg.E;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
public class DeferredComponentChannel {
    private static final String TAG = "DeferredComponentChannel";

    @NonNull
    private final u channel;

    @NonNull
    private Map<String, List<t>> componentNameToResults;

    @Nullable
    private DeferredComponentManager deferredComponentManager;

    @NonNull
    @VisibleForTesting
    final s parsingMethodHandler;

    public DeferredComponentChannel(@NonNull DartExecutor dartExecutor) {
        s sVar = new s() { // from class: io.flutter.embedding.engine.systemchannels.DeferredComponentChannel.1
            @Override // pg.s
            public void onMethodCall(@NonNull r rVar, @NonNull t tVar) {
                int iIntValue;
                String str;
                if (DeferredComponentChannel.this.deferredComponentManager == null) {
                }
                String str2 = rVar.f19112a;
                Map map = (Map) rVar.f19113b;
                iIntValue = ((Integer) map.get("loadingUnitId")).intValue();
                str = (String) map.get("componentName");
                str2.getClass();
                switch (str2) {
                    case "uninstallDeferredComponent":
                        DeferredComponentChannel.this.deferredComponentManager.uninstallDeferredComponent(iIntValue, str);
                        tVar.success(null);
                        break;
                    case "getDeferredComponentInstallState":
                        tVar.success(DeferredComponentChannel.this.deferredComponentManager.getDeferredComponentInstallState(iIntValue, str));
                        break;
                    case "installDeferredComponent":
                        DeferredComponentChannel.this.deferredComponentManager.installDeferredComponent(iIntValue, str);
                        if (!DeferredComponentChannel.this.componentNameToResults.containsKey(str)) {
                            DeferredComponentChannel.this.componentNameToResults.put(str, new ArrayList());
                        }
                        ((List) DeferredComponentChannel.this.componentNameToResults.get(str)).add(tVar);
                        break;
                    default:
                        tVar.notImplemented();
                        break;
                }
            }
        };
        this.parsingMethodHandler = sVar;
        u uVar = new u(dartExecutor, "flutter/deferredcomponent", E.f19095b, null);
        this.channel = uVar;
        uVar.b(sVar);
        this.deferredComponentManager = C1978b.a().f18848b;
        this.componentNameToResults = new HashMap();
    }

    public void completeInstallError(String str, String str2) {
        if (this.componentNameToResults.containsKey(str)) {
            Iterator<t> it = this.componentNameToResults.get(str).iterator();
            while (it.hasNext()) {
                it.next().error("DeferredComponent Install failure", str2, null);
            }
            this.componentNameToResults.get(str).clear();
        }
    }

    public void completeInstallSuccess(String str) {
        if (this.componentNameToResults.containsKey(str)) {
            Iterator<t> it = this.componentNameToResults.get(str).iterator();
            while (it.hasNext()) {
                it.next().success(null);
            }
            this.componentNameToResults.get(str).clear();
        }
    }

    @VisibleForTesting
    public void setDeferredComponentManager(@Nullable DeferredComponentManager deferredComponentManager) {
        this.deferredComponentManager = deferredComponentManager;
    }
}
