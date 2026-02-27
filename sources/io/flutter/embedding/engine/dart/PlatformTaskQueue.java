package io.flutter.embedding.engine.dart;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import io.flutter.embedding.engine.dart.DartMessenger;

/* JADX INFO: loaded from: classes4.dex */
public class PlatformTaskQueue implements DartMessenger.DartMessengerTaskQueue {

    @NonNull
    private final Handler handler;

    public PlatformTaskQueue() {
        Looper mainLooper = Looper.getMainLooper();
        this.handler = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper);
    }

    @Override // io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue
    public void dispatch(@NonNull Runnable runnable) {
        this.handler.post(runnable);
    }
}
