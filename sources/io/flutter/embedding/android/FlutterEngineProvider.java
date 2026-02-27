package io.flutter.embedding.android;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.embedding.engine.FlutterEngine;

/* JADX INFO: loaded from: classes4.dex */
public interface FlutterEngineProvider {
    @Nullable
    FlutterEngine provideFlutterEngine(@NonNull Context context);
}
