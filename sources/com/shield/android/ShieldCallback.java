package com.shield.android;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public interface ShieldCallback<T> {
    void onFailure(@Nullable ShieldException shieldException);

    void onSuccess(@Nullable T t5);
}
