package io.flutter.plugins.webviewflutter;

import android.os.Message;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class MessageProxyApi extends PigeonApiAndroidMessage {
    public MessageProxyApi(@NonNull AndroidWebkitLibraryPigeonProxyApiRegistrar androidWebkitLibraryPigeonProxyApiRegistrar) {
        super(androidWebkitLibraryPigeonProxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiAndroidMessage
    public void sendToTarget(@NonNull Message message) {
        message.sendToTarget();
    }
}
