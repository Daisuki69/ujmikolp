package io.flutter.plugins.webviewflutter;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterAssetManagerProxyApi extends PigeonApiFlutterAssetManager {
    public FlutterAssetManagerProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiFlutterAssetManager
    @NonNull
    public String getAssetFilePathByName(@NonNull FlutterAssetManager flutterAssetManager, @NonNull String str) {
        return flutterAssetManager.getAssetFilePathByName(str);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiFlutterAssetManager
    @NonNull
    public FlutterAssetManager instance() {
        return getPigeonRegistrar().getFlutterAssetManager();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiFlutterAssetManager
    @NonNull
    public List<String> list(@NonNull FlutterAssetManager flutterAssetManager, @NonNull String str) {
        try {
            String[] list = flutterAssetManager.list(str);
            return list == null ? new ArrayList() : Arrays.asList(list);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiFlutterAssetManager
    @NonNull
    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
