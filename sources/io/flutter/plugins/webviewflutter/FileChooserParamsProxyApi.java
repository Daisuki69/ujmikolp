package io.flutter.plugins.webviewflutter;

import android.webkit.WebChromeClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class FileChooserParamsProxyApi extends PigeonApiFileChooserParams {
    public FileChooserParamsProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiFileChooserParams
    @NonNull
    public List<String> acceptTypes(@NonNull WebChromeClient.FileChooserParams fileChooserParams) {
        return Arrays.asList(fileChooserParams.getAcceptTypes());
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiFileChooserParams
    @Nullable
    public String filenameHint(@NonNull WebChromeClient.FileChooserParams fileChooserParams) {
        return fileChooserParams.getFilenameHint();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiFileChooserParams
    public boolean isCaptureEnabled(@NonNull WebChromeClient.FileChooserParams fileChooserParams) {
        return fileChooserParams.isCaptureEnabled();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiFileChooserParams
    @NonNull
    public FileChooserMode mode(@NonNull WebChromeClient.FileChooserParams fileChooserParams) {
        int mode = fileChooserParams.getMode();
        return mode != 0 ? mode != 1 ? mode != 3 ? FileChooserMode.UNKNOWN : FileChooserMode.SAVE : FileChooserMode.OPEN_MULTIPLE : FileChooserMode.OPEN;
    }
}
