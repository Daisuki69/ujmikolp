package io.flutter.embedding.engine.systemchannels;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.Map;
import pg.E;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
public class RestorationChannel {
    private static final String TAG = "RestorationChannel";
    private u channel;
    private boolean engineHasProvidedData;
    private boolean frameworkHasRequestedData;
    private final s handler;
    private t pendingFrameworkRestorationChannelRequest;
    private byte[] restorationData;
    public final boolean waitForRestorationData;

    public RestorationChannel(@NonNull DartExecutor dartExecutor, @NonNull boolean z4) {
        this(new u(dartExecutor, "flutter/restoration", E.f19095b, null), z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> packageData(byte[] bArr) {
        HashMap map = new HashMap();
        map.put(Constants.ENABLED, Boolean.TRUE);
        map.put("data", bArr);
        return map;
    }

    public void clearData() {
        this.restorationData = null;
    }

    @Nullable
    public byte[] getRestorationData() {
        return this.restorationData;
    }

    public void setRestorationData(@NonNull final byte[] bArr) {
        this.engineHasProvidedData = true;
        t tVar = this.pendingFrameworkRestorationChannelRequest;
        if (tVar != null) {
            tVar.success(packageData(bArr));
            this.pendingFrameworkRestorationChannelRequest = null;
            this.restorationData = bArr;
        } else if (this.frameworkHasRequestedData) {
            this.channel.a("push", packageData(bArr), new t() { // from class: io.flutter.embedding.engine.systemchannels.RestorationChannel.1
                @Override // pg.t
                public void error(String str, String str2, Object obj) {
                    Log.e(RestorationChannel.TAG, "Error " + str + " while sending restoration data to framework: " + str2);
                }

                @Override // pg.t
                public void notImplemented() {
                }

                @Override // pg.t
                public void success(Object obj) {
                    RestorationChannel.this.restorationData = bArr;
                }
            });
        } else {
            this.restorationData = bArr;
        }
    }

    public RestorationChannel(u uVar, @NonNull boolean z4) {
        this.engineHasProvidedData = false;
        this.frameworkHasRequestedData = false;
        s sVar = new s() { // from class: io.flutter.embedding.engine.systemchannels.RestorationChannel.2
            @Override // pg.s
            public void onMethodCall(@NonNull r rVar, @NonNull t tVar) {
                String str = rVar.f19112a;
                str.getClass();
                if (!str.equals("get")) {
                    if (!str.equals("put")) {
                        tVar.notImplemented();
                        return;
                    }
                    RestorationChannel.this.restorationData = (byte[]) rVar.f19113b;
                    tVar.success(null);
                    return;
                }
                RestorationChannel.this.frameworkHasRequestedData = true;
                if (!RestorationChannel.this.engineHasProvidedData) {
                    RestorationChannel restorationChannel = RestorationChannel.this;
                    if (restorationChannel.waitForRestorationData) {
                        restorationChannel.pendingFrameworkRestorationChannelRequest = tVar;
                        return;
                    }
                }
                RestorationChannel restorationChannel2 = RestorationChannel.this;
                tVar.success(restorationChannel2.packageData(restorationChannel2.restorationData));
            }
        };
        this.handler = sVar;
        this.channel = uVar;
        this.waitForRestorationData = z4;
        uVar.b(sVar);
    }
}
