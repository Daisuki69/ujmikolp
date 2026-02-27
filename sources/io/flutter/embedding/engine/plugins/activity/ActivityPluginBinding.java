package io.flutter.embedding.engine.plugins.activity;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import pg.InterfaceC2034A;
import pg.InterfaceC2036C;
import pg.w;
import pg.x;
import pg.z;

/* JADX INFO: loaded from: classes4.dex */
public interface ActivityPluginBinding {

    public interface OnSaveInstanceStateListener {
        void onRestoreInstanceState(@Nullable Bundle bundle);

        void onSaveInstanceState(@NonNull Bundle bundle);
    }

    void addActivityResultListener(@NonNull w wVar);

    void addOnNewIntentListener(@NonNull x xVar);

    void addOnSaveStateListener(@NonNull OnSaveInstanceStateListener onSaveInstanceStateListener);

    void addOnUserLeaveHintListener(@NonNull InterfaceC2034A interfaceC2034A);

    void addOnWindowFocusChangedListener(@NonNull InterfaceC2036C interfaceC2036C);

    void addRequestPermissionsResultListener(@NonNull z zVar);

    @NonNull
    Activity getActivity();

    @NonNull
    Object getLifecycle();

    void removeActivityResultListener(@NonNull w wVar);

    void removeOnNewIntentListener(@NonNull x xVar);

    void removeOnSaveStateListener(@NonNull OnSaveInstanceStateListener onSaveInstanceStateListener);

    void removeOnUserLeaveHintListener(@NonNull InterfaceC2034A interfaceC2034A);

    void removeOnWindowFocusChangedListener(@NonNull InterfaceC2036C interfaceC2036C);

    void removeRequestPermissionsResultListener(@NonNull z zVar);
}
