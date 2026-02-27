package com.google.android.gms.common.data;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface DataBufferObserver {

    public interface Observable {
        void addObserver(@NonNull DataBufferObserver dataBufferObserver);

        void removeObserver(@NonNull DataBufferObserver dataBufferObserver);
    }

    void onDataChanged();

    void onDataRangeChanged(int i, int i4);

    void onDataRangeInserted(int i, int i4);

    void onDataRangeMoved(int i, int i4, int i6);

    void onDataRangeRemoved(int i, int i4);
}
