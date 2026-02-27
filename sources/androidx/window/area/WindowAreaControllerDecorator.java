package androidx.window.area;

import androidx.annotation.RestrictTo;
import androidx.window.core.ExperimentalWindowApi;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface WindowAreaControllerDecorator {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    WindowAreaController decorate(WindowAreaController windowAreaController);
}
