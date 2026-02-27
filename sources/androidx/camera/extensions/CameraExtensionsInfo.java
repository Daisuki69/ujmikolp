package androidx.camera.extensions;

import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;

/* JADX INFO: loaded from: classes.dex */
public interface CameraExtensionsInfo {
    @Nullable
    LiveData<Integer> getCurrentExtensionMode();

    @Nullable
    LiveData<Integer> getExtensionStrength();

    boolean isCurrentExtensionModeAvailable();

    boolean isExtensionStrengthAvailable();
}
