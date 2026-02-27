package androidx.core.view;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public class ScrollFeedbackProviderCompat {
    private final ScrollFeedbackProviderImpl mImpl;

    @RequiresApi(35)
    public static class ScrollFeedbackProviderApi35Impl implements ScrollFeedbackProviderImpl {
        private final ScrollFeedbackProvider mProvider;

        public ScrollFeedbackProviderApi35Impl(View view) {
            this.mProvider = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onScrollLimit(int i, int i4, int i6, boolean z4) {
            this.mProvider.onScrollLimit(i, i4, i6, z4);
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onScrollProgress(int i, int i4, int i6, int i10) {
            this.mProvider.onScrollProgress(i, i4, i6, i10);
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onSnapToItem(int i, int i4, int i6) {
            this.mProvider.onSnapToItem(i, i4, i6);
        }
    }

    public static class ScrollFeedbackProviderBaseImpl implements ScrollFeedbackProviderImpl {
        private ScrollFeedbackProviderBaseImpl() {
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onScrollLimit(int i, int i4, int i6, boolean z4) {
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onScrollProgress(int i, int i4, int i6, int i10) {
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onSnapToItem(int i, int i4, int i6) {
        }
    }

    public interface ScrollFeedbackProviderImpl {
        void onScrollLimit(int i, int i4, int i6, boolean z4);

        void onScrollProgress(int i, int i4, int i6, int i10);

        void onSnapToItem(int i, int i4, int i6);
    }

    private ScrollFeedbackProviderCompat(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.mImpl = new ScrollFeedbackProviderApi35Impl(view);
        } else {
            this.mImpl = new ScrollFeedbackProviderBaseImpl();
        }
    }

    public static ScrollFeedbackProviderCompat createProvider(View view) {
        return new ScrollFeedbackProviderCompat(view);
    }

    public void onScrollLimit(int i, int i4, int i6, boolean z4) {
        this.mImpl.onScrollLimit(i, i4, i6, z4);
    }

    public void onScrollProgress(int i, int i4, int i6, int i10) {
        this.mImpl.onScrollProgress(i, i4, i6, i10);
    }

    public void onSnapToItem(int i, int i4, int i6) {
        this.mImpl.onSnapToItem(i, i4, i6);
    }
}
