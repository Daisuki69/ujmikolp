package io.flutter.embedding.engine.plugins;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineGroup;
import io.flutter.plugin.platform.m;
import io.flutter.view.t;
import pg.j;

/* JADX INFO: loaded from: classes4.dex */
public interface FlutterPlugin {

    public interface FlutterAssets {
        String getAssetFilePathByName(@NonNull String str);

        String getAssetFilePathByName(@NonNull String str, @NonNull String str2);

        String getAssetFilePathBySubpath(@NonNull String str);

        String getAssetFilePathBySubpath(@NonNull String str, @NonNull String str2);
    }

    public static class FlutterPluginBinding {
        private final Context applicationContext;
        private final j binaryMessenger;
        private final FlutterAssets flutterAssets;
        private final FlutterEngine flutterEngine;
        private final FlutterEngineGroup group;
        private final m platformViewRegistry;
        private final t textureRegistry;

        public FlutterPluginBinding(@NonNull Context context, @NonNull FlutterEngine flutterEngine, @NonNull j jVar, @NonNull t tVar, @NonNull m mVar, @NonNull FlutterAssets flutterAssets, @Nullable FlutterEngineGroup flutterEngineGroup) {
            this.applicationContext = context;
            this.flutterEngine = flutterEngine;
            this.binaryMessenger = jVar;
            this.textureRegistry = tVar;
            this.platformViewRegistry = mVar;
            this.flutterAssets = flutterAssets;
            this.group = flutterEngineGroup;
        }

        @NonNull
        public Context getApplicationContext() {
            return this.applicationContext;
        }

        @NonNull
        public j getBinaryMessenger() {
            return this.binaryMessenger;
        }

        @Nullable
        public FlutterEngineGroup getEngineGroup() {
            return this.group;
        }

        @NonNull
        public FlutterAssets getFlutterAssets() {
            return this.flutterAssets;
        }

        @NonNull
        @Deprecated
        public FlutterEngine getFlutterEngine() {
            return this.flutterEngine;
        }

        @NonNull
        public m getPlatformViewRegistry() {
            return this.platformViewRegistry;
        }

        @NonNull
        public t getTextureRegistry() {
            return this.textureRegistry;
        }
    }

    void onAttachedToEngine(@NonNull FlutterPluginBinding flutterPluginBinding);

    void onDetachedFromEngine(@NonNull FlutterPluginBinding flutterPluginBinding);
}
