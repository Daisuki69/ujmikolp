package mx_android.support.v4.content;

import android.content.ComponentName;
import android.content.Intent;

/* JADX INFO: loaded from: classes7.dex */
class IntentCompatHoneycomb {
    IntentCompatHoneycomb() {
    }

    public static Intent makeMainActivity(ComponentName componentName) {
        return Intent.makeMainActivity(componentName);
    }

    public static Intent makeRestartActivityTask(ComponentName componentName) {
        return Intent.makeRestartActivityTask(componentName);
    }
}
