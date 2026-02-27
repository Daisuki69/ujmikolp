package butterknife;

import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewCollections {
    private ViewCollections() {
    }

    @SafeVarargs
    @UiThread
    public static <T extends View> void run(@NonNull List<T> list, @NonNull Action<? super T>... actionArr) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            for (Action<? super T> action : actionArr) {
                action.apply(list.get(i), i);
            }
        }
    }

    @UiThread
    public static <T extends View, V> void set(@NonNull List<T> list, @NonNull Setter<? super T, V> setter, @Nullable V v7) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            setter.set(list.get(i), v7, i);
        }
    }

    @UiThread
    public static <T extends View, V> void set(@NonNull T[] tArr, @NonNull Setter<? super T, V> setter, @Nullable V v7) {
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            setter.set(tArr[i], v7, i);
        }
    }

    @SafeVarargs
    @UiThread
    public static <T extends View> void run(@NonNull T[] tArr, @NonNull Action<? super T>... actionArr) {
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            for (Action<? super T> action : actionArr) {
                action.apply(tArr[i], i);
            }
        }
    }

    @UiThread
    public static <T extends View, V> void set(@NonNull T t5, @NonNull Setter<? super T, V> setter, @Nullable V v7) {
        setter.set(t5, v7, 0);
    }

    @UiThread
    public static <T extends View, V> void set(@NonNull List<T> list, @NonNull Property<? super T, V> property, @Nullable V v7) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            property.set(list.get(i), v7);
        }
    }

    @UiThread
    public static <T extends View> void run(@NonNull List<T> list, @NonNull Action<? super T> action) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            action.apply(list.get(i), i);
        }
    }

    @UiThread
    public static <T extends View, V> void set(@NonNull T[] tArr, @NonNull Property<? super T, V> property, @Nullable V v7) {
        for (T t5 : tArr) {
            property.set(t5, v7);
        }
    }

    @UiThread
    public static <T extends View> void run(@NonNull T[] tArr, @NonNull Action<? super T> action) {
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            action.apply(tArr[i], i);
        }
    }

    @UiThread
    public static <T extends View, V> void set(@NonNull T t5, @NonNull Property<? super T, V> property, @Nullable V v7) {
        property.set(t5, v7);
    }

    @SafeVarargs
    @UiThread
    public static <T extends View> void run(@NonNull T t5, @NonNull Action<? super T>... actionArr) {
        for (Action<? super T> action : actionArr) {
            action.apply(t5, 0);
        }
    }

    @UiThread
    public static <T extends View> void run(@NonNull T t5, @NonNull Action<? super T> action) {
        action.apply(t5, 0);
    }
}
