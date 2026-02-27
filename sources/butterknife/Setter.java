package butterknife;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;

/* JADX INFO: loaded from: classes2.dex */
public interface Setter<T extends View, V> {
    @UiThread
    void set(@NonNull T t5, @Nullable V v7, int i);
}
