package androidx.webkit;

import androidx.webkit.WebViewCompat;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
@WebViewCompat.ExperimentalAsyncStartUp
public final class WebViewStartUpConfig {
    private final Executor mExecutor;
    private final boolean mShouldRunUiThreadStartUpTasks;

    @WebViewCompat.ExperimentalAsyncStartUp
    public static final class Builder {
        private final Executor mExecutor;
        private boolean mShouldRunUiThreadStartUpTasks = true;

        public Builder(Executor executor) {
            this.mExecutor = executor;
        }

        public WebViewStartUpConfig build() {
            return new WebViewStartUpConfig(this.mExecutor, this.mShouldRunUiThreadStartUpTasks);
        }

        public Builder setShouldRunUiThreadStartUpTasks(boolean z4) {
            this.mShouldRunUiThreadStartUpTasks = z4;
            return this;
        }
    }

    public Executor getBackgroundExecutor() {
        return this.mExecutor;
    }

    public boolean shouldRunUiThreadStartUpTasks() {
        return this.mShouldRunUiThreadStartUpTasks;
    }

    private WebViewStartUpConfig(Executor executor, boolean z4) {
        this.mExecutor = executor;
        this.mShouldRunUiThreadStartUpTasks = z4;
    }
}
