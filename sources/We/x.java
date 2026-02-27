package We;

import android.content.Context;
import android.os.StatFs;
import androidx.media3.datasource.cache.CacheDataSink;
import dOYHB6.tiZVw8.numX49;
import java.io.File;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f6424a;

    public x(Context context) {
        long blockCountLong;
        StringBuilder sb2 = O.f6375a;
        File file = new File(context.getApplicationContext().getCacheDir(), numX49.tnTj78("bkRPp"));
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            blockCountLong = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            blockCountLong = 5242880;
        }
        OkHttpClient okHttpClientBuild = new OkHttpClient.Builder().cache(new Cache(file, Math.max(Math.min(blockCountLong, 52428800L), CacheDataSink.DEFAULT_FRAGMENT_SIZE))).build();
        this.f6424a = okHttpClientBuild;
        okHttpClientBuild.cache();
    }
}
