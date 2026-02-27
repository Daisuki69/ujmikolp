package androidx.media3.datasource;

import D.CallableC0170c;
import N1.o;
import S1.A;
import S1.D;
import S1.y;
import S1.z;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BitmapLoader;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DataSourceBitmapLoader implements BitmapLoader {
    public static final o DEFAULT_EXECUTOR_SERVICE = E1.c.j(new c());
    private final DataSource.Factory dataSourceFactory;
    private final z listeningExecutorService;

    @Nullable
    private final BitmapFactory.Options options;

    public DataSourceBitmapLoader(Context context) {
        this((z) Assertions.checkStateNotNull((z) DEFAULT_EXECUTOR_SERVICE.get()), new DefaultDataSource.Factory(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bitmap lambda$decodeBitmap$1(byte[] bArr) throws Exception {
        return BitmapUtil.decode(bArr, bArr.length, this.options);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bitmap lambda$loadBitmap$2(Uri uri) throws Exception {
        return load(this.dataSourceFactory.createDataSource(), uri, this.options);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static z lambda$static$0() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        return executorServiceNewSingleThreadExecutor instanceof z ? (z) executorServiceNewSingleThreadExecutor : executorServiceNewSingleThreadExecutor instanceof ScheduledExecutorService ? new D((ScheduledExecutorService) executorServiceNewSingleThreadExecutor) : new A(executorServiceNewSingleThreadExecutor);
    }

    private static Bitmap load(DataSource dataSource, Uri uri, @Nullable BitmapFactory.Options options) throws IOException {
        try {
            dataSource.open(new DataSpec(uri));
            byte[] toEnd = DataSourceUtil.readToEnd(dataSource);
            return BitmapUtil.decode(toEnd, toEnd.length, options);
        } finally {
            dataSource.close();
        }
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public y decodeBitmap(byte[] bArr) {
        return ((A) this.listeningExecutorService).a(new CallableC0170c(11, this, bArr));
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public y loadBitmap(Uri uri) {
        return ((A) this.listeningExecutorService).a(new CallableC0170c(12, this, uri));
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public final /* synthetic */ y loadBitmapFromMetadata(MediaMetadata mediaMetadata) {
        return androidx.media3.common.util.a.a(this, mediaMetadata);
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public boolean supportsMimeType(String str) {
        return Util.isBitmapFactorySupportedMimeType(str);
    }

    public DataSourceBitmapLoader(z zVar, DataSource.Factory factory) {
        this(zVar, factory, null);
    }

    public DataSourceBitmapLoader(z zVar, DataSource.Factory factory, @Nullable BitmapFactory.Options options) {
        this.listeningExecutorService = zVar;
        this.dataSourceFactory = factory;
        this.options = options;
    }
}
