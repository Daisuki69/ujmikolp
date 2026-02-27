package androidx.media3.datasource.cache;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class CacheWriter {
    public static final int DEFAULT_BUFFER_SIZE_BYTES = 131072;
    private long bytesCached;
    private final Cache cache;
    private final String cacheKey;
    private final CacheDataSource dataSource;
    private final DataSpec dataSpec;
    private long endPosition;
    private volatile boolean isCanceled;
    private long nextPosition;

    @Nullable
    private final ProgressListener progressListener;
    private final byte[] temporaryBuffer;

    public interface ProgressListener {
        void onProgress(long j, long j6, long j7);
    }

    public CacheWriter(CacheDataSource cacheDataSource, DataSpec dataSpec, @Nullable byte[] bArr, @Nullable ProgressListener progressListener) {
        this.dataSource = cacheDataSource;
        this.cache = cacheDataSource.getCache();
        this.dataSpec = dataSpec;
        this.temporaryBuffer = bArr == null ? new byte[131072] : bArr;
        this.progressListener = progressListener;
        this.cacheKey = cacheDataSource.getCacheKeyFactory().buildCacheKey(dataSpec);
        this.nextPosition = dataSpec.position;
    }

    private long getLength() {
        long j = this.endPosition;
        if (j == -1) {
            return -1L;
        }
        return j - this.dataSpec.position;
    }

    private void onNewBytesCached(long j) {
        this.bytesCached += j;
        ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, j);
        }
    }

    private void onRequestEndPosition(long j) {
        if (this.endPosition == j) {
            return;
        }
        this.endPosition = j;
        ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, 0L);
        }
    }

    private long readBlockToCache(long j, long j6) throws IOException {
        long jOpen;
        boolean z4 = true;
        boolean z5 = j + j6 == this.endPosition || j6 == -1;
        if (j6 != -1) {
            try {
                jOpen = this.dataSource.open(this.dataSpec.buildUpon().setPosition(j).setLength(j6).build());
            } catch (IOException unused) {
                DataSourceUtil.closeQuietly(this.dataSource);
                z4 = false;
                jOpen = -1;
            }
        } else {
            z4 = false;
            jOpen = -1;
        }
        if (!z4) {
            throwIfCanceled();
            try {
                jOpen = this.dataSource.open(this.dataSpec.buildUpon().setPosition(j).setLength(-1L).build());
            } catch (IOException e) {
                DataSourceUtil.closeQuietly(this.dataSource);
                throw e;
            }
        }
        if (z5 && jOpen != -1) {
            try {
                onRequestEndPosition(jOpen + j);
            } catch (IOException e7) {
                DataSourceUtil.closeQuietly(this.dataSource);
                throw e7;
            }
        }
        int i = 0;
        int i4 = 0;
        while (i != -1) {
            throwIfCanceled();
            CacheDataSource cacheDataSource = this.dataSource;
            byte[] bArr = this.temporaryBuffer;
            i = cacheDataSource.read(bArr, 0, bArr.length);
            if (i != -1) {
                onNewBytesCached(i);
                i4 += i;
            }
        }
        if (z5) {
            onRequestEndPosition(j + ((long) i4));
        }
        this.dataSource.close();
        return i4;
    }

    private void throwIfCanceled() throws InterruptedIOException {
        if (this.isCanceled) {
            throw new InterruptedIOException();
        }
    }

    @WorkerThread
    public void cache() throws IOException {
        throwIfCanceled();
        Cache cache = this.cache;
        String str = this.cacheKey;
        DataSpec dataSpec = this.dataSpec;
        this.bytesCached = cache.getCachedBytes(str, dataSpec.position, dataSpec.length);
        DataSpec dataSpec2 = this.dataSpec;
        long j = dataSpec2.length;
        if (j != -1) {
            this.endPosition = dataSpec2.position + j;
        } else {
            long jA = b.a(this.cache.getContentMetadata(this.cacheKey));
            if (jA == -1) {
                jA = -1;
            }
            this.endPosition = jA;
        }
        ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, 0L);
        }
        while (true) {
            long j6 = this.endPosition;
            if (j6 != -1 && this.nextPosition >= j6) {
                return;
            }
            throwIfCanceled();
            long j7 = this.endPosition;
            long cachedLength = this.cache.getCachedLength(this.cacheKey, this.nextPosition, j7 == -1 ? Long.MAX_VALUE : j7 - this.nextPosition);
            if (cachedLength > 0) {
                this.nextPosition += cachedLength;
            } else {
                long j9 = -cachedLength;
                if (j9 == Long.MAX_VALUE) {
                    j9 = -1;
                }
                long j10 = this.nextPosition;
                this.nextPosition = j10 + readBlockToCache(j10, j9);
            }
        }
    }

    public void cancel() {
        this.isCanceled = true;
    }
}
