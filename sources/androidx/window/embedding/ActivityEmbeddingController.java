package androidx.window.embedding;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.IBinder;
import androidx.window.RequiresWindowSdkExtension;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ActivityEmbeddingController {
    public static final Companion Companion = new Companion(null);
    private final EmbeddingBackend backend;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ActivityEmbeddingController getInstance(Context context) {
            j.g(context, "context");
            return new ActivityEmbeddingController(EmbeddingBackend.Companion.getInstance(context));
        }

        private Companion() {
        }
    }

    public ActivityEmbeddingController(EmbeddingBackend backend) {
        j.g(backend, "backend");
        this.backend = backend;
    }

    public static final ActivityEmbeddingController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    @ExperimentalWindowApi
    public final ActivityStack getActivityStack(Activity activity) {
        j.g(activity, "activity");
        return this.backend.getActivityStack(activity);
    }

    public final boolean isActivityEmbedded(Activity activity) {
        j.g(activity, "activity");
        return this.backend.isActivityEmbedded(activity);
    }

    @RequiresWindowSdkExtension(version = 3)
    public final ActivityOptions setLaunchingActivityStack$window_release(ActivityOptions options, IBinder token) {
        j.g(options, "options");
        j.g(token, "token");
        return this.backend.setLaunchingActivityStack(options, token);
    }
}
