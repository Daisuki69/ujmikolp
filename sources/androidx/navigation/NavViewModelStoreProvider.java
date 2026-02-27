package androidx.navigation;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.ViewModelStore;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface NavViewModelStoreProvider {
    ViewModelStore getViewModelStore(String str);
}
