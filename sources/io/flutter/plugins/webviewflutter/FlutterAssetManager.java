package io.flutter.plugins.webviewflutter;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FlutterAssetManager {

    @NonNull
    final AssetManager assetManager;

    public static class PluginBindingFlutterAssetManager extends FlutterAssetManager {
        final FlutterPlugin.FlutterAssets flutterAssets;

        public PluginBindingFlutterAssetManager(@NonNull AssetManager assetManager, @NonNull FlutterPlugin.FlutterAssets flutterAssets) {
            super(assetManager);
            this.flutterAssets = flutterAssets;
        }

        @Override // io.flutter.plugins.webviewflutter.FlutterAssetManager
        public String getAssetFilePathByName(@NonNull String str) {
            return this.flutterAssets.getAssetFilePathByName(str);
        }
    }

    public FlutterAssetManager(@NonNull AssetManager assetManager) {
        this.assetManager = assetManager;
    }

    @Nullable
    public abstract String getAssetFilePathByName(@NonNull String str);

    @NonNull
    public String[] list(@NonNull String str) throws IOException {
        return this.assetManager.list(str);
    }
}
