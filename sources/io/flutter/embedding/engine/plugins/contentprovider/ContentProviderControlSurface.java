package io.flutter.embedding.engine.plugins.contentprovider;

import android.content.ContentProvider;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes4.dex */
public interface ContentProviderControlSurface {
    void attachToContentProvider(@NonNull ContentProvider contentProvider, @NonNull Lifecycle lifecycle);

    void detachFromContentProvider();
}
