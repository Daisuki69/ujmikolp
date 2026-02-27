package io.flutter.embedding.engine.plugins.service;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public interface ServiceAware {

    public interface OnModeChangeListener {
        void onMoveToBackground();

        void onMoveToForeground();
    }

    void onAttachedToService(@NonNull ServicePluginBinding servicePluginBinding);

    void onDetachedFromService();
}
