package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.IdRes;

/* JADX INFO: loaded from: classes2.dex */
public interface NavDirections {
    @IdRes
    int getActionId();

    Bundle getArguments();
}
