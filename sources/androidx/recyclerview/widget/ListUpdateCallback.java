package androidx.recyclerview.widget;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface ListUpdateCallback {
    void onChanged(int i, int i4, @Nullable Object obj);

    void onInserted(int i, int i4);

    void onMoved(int i, int i4);

    void onRemoved(int i, int i4);
}
