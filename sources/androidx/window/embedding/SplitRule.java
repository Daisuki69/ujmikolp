package androidx.window.embedding;

import We.s;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowMetrics;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import mx_android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes2.dex */
public class SplitRule extends EmbeddingRule {
    public static final int SPLIT_MIN_DIMENSION_ALWAYS_ALLOW = 0;
    public static final int SPLIT_MIN_DIMENSION_DP_DEFAULT = 600;
    private final SplitAttributes defaultSplitAttributes;
    private final EmbeddingAspectRatio maxAspectRatioInLandscape;
    private final EmbeddingAspectRatio maxAspectRatioInPortrait;
    private final int minHeightDp;
    private final int minSmallestWidthDp;
    private final int minWidthDp;
    public static final Companion Companion = new Companion(null);
    public static final EmbeddingAspectRatio SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT = EmbeddingAspectRatio.Companion.ratio(1.4f);
    public static final EmbeddingAspectRatio SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT = EmbeddingAspectRatio.ALWAYS_ALLOW;

    @RequiresApi(30)
    public static final class Api30Impl {
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        @DoNotInline
        public final Rect getBounds(WindowMetrics windowMetrics) {
            j.g(windowMetrics, "windowMetrics");
            Rect bounds = windowMetrics.getBounds();
            j.f(bounds, "windowMetrics.bounds");
            return bounds;
        }
    }

    @RequiresApi(34)
    public static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        @DoNotInline
        public final float getDensity(WindowMetrics windowMetrics, Context context) {
            j.g(windowMetrics, "windowMetrics");
            j.g(context, "context");
            try {
                return windowMetrics.getDensity();
            } catch (NoSuchMethodError unused) {
                return context.getResources().getDisplayMetrics().density;
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class FinishBehavior {
        private final String description;
        private final int value;
        public static final Companion Companion = new Companion(null);
        public static final FinishBehavior NEVER = new FinishBehavior("NEVER", 0);
        public static final FinishBehavior ALWAYS = new FinishBehavior("ALWAYS", 1);
        public static final FinishBehavior ADJACENT = new FinishBehavior("ADJACENT", 2);

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final FinishBehavior getFinishBehaviorFromValue$window_release(@IntRange(from = 0, to = PlaybackStateCompat.ACTION_PAUSE) int i) {
                FinishBehavior finishBehavior = FinishBehavior.NEVER;
                if (i == finishBehavior.getValue$window_release()) {
                    return finishBehavior;
                }
                FinishBehavior finishBehavior2 = FinishBehavior.ALWAYS;
                if (i == finishBehavior2.getValue$window_release()) {
                    return finishBehavior2;
                }
                FinishBehavior finishBehavior3 = FinishBehavior.ADJACENT;
                if (i == finishBehavior3.getValue$window_release()) {
                    return finishBehavior3;
                }
                throw new IllegalArgumentException(s.f(i, "Unknown finish behavior:"));
            }

            private Companion() {
            }
        }

        private FinishBehavior(String str, int i) {
            this.description = str;
            this.value = i;
        }

        public final int getValue$window_release() {
            return this.value;
        }

        public String toString() {
            return this.description;
        }
    }

    public /* synthetic */ SplitRule(String str, int i, int i4, int i6, EmbeddingAspectRatio embeddingAspectRatio, EmbeddingAspectRatio embeddingAspectRatio2, SplitAttributes splitAttributes, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? 600 : i, (i10 & 4) != 0 ? 600 : i4, (i10 & 8) != 0 ? 600 : i6, (i10 & 16) != 0 ? SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT : embeddingAspectRatio, (i10 & 32) != 0 ? SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT : embeddingAspectRatio2, splitAttributes);
    }

    private final int convertDpToPx(float f, @IntRange(from = 0) int i) {
        return (int) ((i * f) + 0.5f);
    }

    public final boolean checkParentBounds$window_release(float f, Rect bounds) {
        j.g(bounds, "bounds");
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth != 0 && iHeight != 0) {
            int iConvertDpToPx = convertDpToPx(f, this.minWidthDp);
            int iConvertDpToPx2 = convertDpToPx(f, this.minHeightDp);
            int iConvertDpToPx3 = convertDpToPx(f, this.minSmallestWidthDp);
            boolean z4 = this.minWidthDp == 0 || iWidth >= iConvertDpToPx;
            boolean z5 = this.minHeightDp == 0 || iHeight >= iConvertDpToPx2;
            boolean z8 = this.minSmallestWidthDp == 0 || Math.min(iWidth, iHeight) >= iConvertDpToPx3;
            boolean z9 = iHeight < iWidth ? j.b(this.maxAspectRatioInLandscape, EmbeddingAspectRatio.ALWAYS_ALLOW) || (((float) iWidth) * 1.0f) / ((float) iHeight) <= this.maxAspectRatioInLandscape.getValue$window_release() : j.b(this.maxAspectRatioInPortrait, EmbeddingAspectRatio.ALWAYS_ALLOW) || (((float) iHeight) * 1.0f) / ((float) iWidth) <= this.maxAspectRatioInPortrait.getValue$window_release();
            if (z4 && z5 && z8 && z9) {
                return true;
            }
        }
        return false;
    }

    public final boolean checkParentMetrics$window_release(Context context, WindowMetrics parentMetrics) {
        j.g(context, "context");
        j.g(parentMetrics, "parentMetrics");
        int i = Build.VERSION.SDK_INT;
        if (i <= 30) {
            return false;
        }
        return checkParentBounds$window_release(i <= 33 ? context.getResources().getDisplayMetrics().density : Api34Impl.INSTANCE.getDensity(parentMetrics, context), Api30Impl.INSTANCE.getBounds(parentMetrics));
    }

    @Override // androidx.window.embedding.EmbeddingRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitRule) || !super.equals(obj)) {
            return false;
        }
        SplitRule splitRule = (SplitRule) obj;
        return this.minWidthDp == splitRule.minWidthDp && this.minHeightDp == splitRule.minHeightDp && this.minSmallestWidthDp == splitRule.minSmallestWidthDp && j.b(this.maxAspectRatioInPortrait, splitRule.maxAspectRatioInPortrait) && j.b(this.maxAspectRatioInLandscape, splitRule.maxAspectRatioInLandscape) && j.b(this.defaultSplitAttributes, splitRule.defaultSplitAttributes);
    }

    public final SplitAttributes getDefaultSplitAttributes() {
        return this.defaultSplitAttributes;
    }

    public final EmbeddingAspectRatio getMaxAspectRatioInLandscape() {
        return this.maxAspectRatioInLandscape;
    }

    public final EmbeddingAspectRatio getMaxAspectRatioInPortrait() {
        return this.maxAspectRatioInPortrait;
    }

    public final int getMinHeightDp() {
        return this.minHeightDp;
    }

    public final int getMinSmallestWidthDp() {
        return this.minSmallestWidthDp;
    }

    public final int getMinWidthDp() {
        return this.minWidthDp;
    }

    @Override // androidx.window.embedding.EmbeddingRule
    public int hashCode() {
        return this.defaultSplitAttributes.hashCode() + ((this.maxAspectRatioInLandscape.hashCode() + ((this.maxAspectRatioInPortrait.hashCode() + (((((((super.hashCode() * 31) + this.minWidthDp) * 31) + this.minHeightDp) * 31) + this.minSmallestWidthDp) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "SplitRule{ tag=" + getTag() + ", defaultSplitAttributes=" + this.defaultSplitAttributes + ", minWidthDp=" + this.minWidthDp + ", minHeightDp=" + this.minHeightDp + ", minSmallestWidthDp=" + this.minSmallestWidthDp + ", maxAspectRatioInPortrait=" + this.maxAspectRatioInPortrait + ", maxAspectRatioInLandscape=" + this.maxAspectRatioInLandscape + '}';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitRule(String str, @IntRange(from = 0) int i, @IntRange(from = 0) int i4, @IntRange(from = 0) int i6, EmbeddingAspectRatio maxAspectRatioInPortrait, EmbeddingAspectRatio maxAspectRatioInLandscape, SplitAttributes defaultSplitAttributes) {
        super(str);
        j.g(maxAspectRatioInPortrait, "maxAspectRatioInPortrait");
        j.g(maxAspectRatioInLandscape, "maxAspectRatioInLandscape");
        j.g(defaultSplitAttributes, "defaultSplitAttributes");
        this.minWidthDp = i;
        this.minHeightDp = i4;
        this.minSmallestWidthDp = i6;
        this.maxAspectRatioInPortrait = maxAspectRatioInPortrait;
        this.maxAspectRatioInLandscape = maxAspectRatioInLandscape;
        this.defaultSplitAttributes = defaultSplitAttributes;
        Preconditions.checkArgumentNonnegative(i, "minWidthDp must be non-negative");
        Preconditions.checkArgumentNonnegative(i4, "minHeightDp must be non-negative");
        Preconditions.checkArgumentNonnegative(i6, "minSmallestWidthDp must be non-negative");
    }
}
