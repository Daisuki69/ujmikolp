package io.flutter.embedding.engine.plugins.broadcastreceiver;

import android.content.BroadcastReceiver;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes4.dex */
public interface BroadcastReceiverControlSurface {
    void attachToBroadcastReceiver(@NonNull BroadcastReceiver broadcastReceiver, @NonNull Lifecycle lifecycle);

    void detachFromBroadcastReceiver();
}
