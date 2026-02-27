package androidx.media3.datasource;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface TransferListener {
    void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z4, int i);

    void onTransferEnd(DataSource dataSource, DataSpec dataSpec, boolean z4);

    void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z4);

    void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z4);
}
