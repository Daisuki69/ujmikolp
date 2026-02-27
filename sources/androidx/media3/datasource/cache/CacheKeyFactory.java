package androidx.media3.datasource.cache;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface CacheKeyFactory {
    public static final CacheKeyFactory DEFAULT = new androidx.constraintlayout.core.state.a(21);

    String buildCacheKey(DataSpec dataSpec);
}
