package androidx.webkit;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import androidx.webkit.WebViewCompat;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@WebViewCompat.ExperimentalAsyncStartUp
public interface WebViewStartUpResult {
    @Nullable
    @SuppressLint({"NullableCollection"})
    List<BlockingStartUpLocation> getBlockingStartUpLocations();

    @Nullable
    @SuppressLint({"AutoBoxing"})
    Long getMaxTimePerTaskInUiThreadMillis();

    @Nullable
    @SuppressLint({"AutoBoxing"})
    Long getTotalTimeInUiThreadMillis();
}
