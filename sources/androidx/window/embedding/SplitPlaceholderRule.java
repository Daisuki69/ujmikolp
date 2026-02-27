package androidx.window.embedding;

import android.content.Intent;
import androidx.annotation.IntRange;
import androidx.core.util.Preconditions;
import androidx.window.embedding.SplitAttributes;
import androidx.window.embedding.SplitRule;
import cj.C1110A;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class SplitPlaceholderRule extends SplitRule {
    private final Set<ActivityFilter> filters;
    private final SplitRule.FinishBehavior finishPrimaryWithPlaceholder;
    private final boolean isSticky;
    private final Intent placeholderIntent;

    public static final class Builder {
        private SplitAttributes defaultSplitAttributes;
        private final Set<ActivityFilter> filters;
        private SplitRule.FinishBehavior finishPrimaryWithPlaceholder;
        private boolean isSticky;
        private EmbeddingAspectRatio maxAspectRatioInLandscape;
        private EmbeddingAspectRatio maxAspectRatioInPortrait;

        @IntRange(from = 0)
        private int minHeightDp;

        @IntRange(from = 0)
        private int minSmallestWidthDp;

        @IntRange(from = 0)
        private int minWidthDp;
        private final Intent placeholderIntent;
        private String tag;

        public Builder(Set<ActivityFilter> filters, Intent placeholderIntent) {
            j.g(filters, "filters");
            j.g(placeholderIntent, "placeholderIntent");
            this.filters = filters;
            this.placeholderIntent = placeholderIntent;
            this.minWidthDp = 600;
            this.minHeightDp = 600;
            this.minSmallestWidthDp = 600;
            this.maxAspectRatioInPortrait = SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT;
            this.maxAspectRatioInLandscape = SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT;
            this.finishPrimaryWithPlaceholder = SplitRule.FinishBehavior.ALWAYS;
            this.defaultSplitAttributes = new SplitAttributes.Builder().build();
        }

        public final SplitPlaceholderRule build() {
            return new SplitPlaceholderRule(this.tag, this.filters, this.placeholderIntent, this.isSticky, this.finishPrimaryWithPlaceholder, this.minWidthDp, this.minHeightDp, this.minSmallestWidthDp, this.maxAspectRatioInPortrait, this.maxAspectRatioInLandscape, this.defaultSplitAttributes);
        }

        public final Builder setDefaultSplitAttributes(SplitAttributes defaultSplitAttributes) {
            j.g(defaultSplitAttributes, "defaultSplitAttributes");
            this.defaultSplitAttributes = defaultSplitAttributes;
            return this;
        }

        public final Builder setFinishPrimaryWithPlaceholder(SplitRule.FinishBehavior finishPrimaryWithPlaceholder) {
            j.g(finishPrimaryWithPlaceholder, "finishPrimaryWithPlaceholder");
            this.finishPrimaryWithPlaceholder = finishPrimaryWithPlaceholder;
            return this;
        }

        public final Builder setMaxAspectRatioInLandscape(EmbeddingAspectRatio aspectRatio) {
            j.g(aspectRatio, "aspectRatio");
            this.maxAspectRatioInLandscape = aspectRatio;
            return this;
        }

        public final Builder setMaxAspectRatioInPortrait(EmbeddingAspectRatio aspectRatio) {
            j.g(aspectRatio, "aspectRatio");
            this.maxAspectRatioInPortrait = aspectRatio;
            return this;
        }

        public final Builder setMinHeightDp(@IntRange(from = 0) int i) {
            this.minHeightDp = i;
            return this;
        }

        public final Builder setMinSmallestWidthDp(@IntRange(from = 0) int i) {
            this.minSmallestWidthDp = i;
            return this;
        }

        public final Builder setMinWidthDp(@IntRange(from = 0) int i) {
            this.minWidthDp = i;
            return this;
        }

        public final Builder setSticky(boolean z4) {
            this.isSticky = z4;
            return this;
        }

        public final Builder setTag(String str) {
            this.tag = str;
            return this;
        }
    }

    public /* synthetic */ SplitPlaceholderRule(String str, Set set, Intent intent, boolean z4, SplitRule.FinishBehavior finishBehavior, int i, int i4, int i6, EmbeddingAspectRatio embeddingAspectRatio, EmbeddingAspectRatio embeddingAspectRatio2, SplitAttributes splitAttributes, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, set, intent, z4, (i10 & 16) != 0 ? SplitRule.FinishBehavior.ALWAYS : finishBehavior, (i10 & 32) != 0 ? 600 : i, (i10 & 64) != 0 ? 600 : i4, (i10 & 128) != 0 ? 600 : i6, (i10 & 256) != 0 ? SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT : embeddingAspectRatio, (i10 & 512) != 0 ? SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT : embeddingAspectRatio2, splitAttributes);
    }

    @Override // androidx.window.embedding.SplitRule, androidx.window.embedding.EmbeddingRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPlaceholderRule) || !super.equals(obj)) {
            return false;
        }
        SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule) obj;
        return j.b(this.placeholderIntent, splitPlaceholderRule.placeholderIntent) && this.isSticky == splitPlaceholderRule.isSticky && j.b(this.finishPrimaryWithPlaceholder, splitPlaceholderRule.finishPrimaryWithPlaceholder) && j.b(this.filters, splitPlaceholderRule.filters);
    }

    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    public final SplitRule.FinishBehavior getFinishPrimaryWithPlaceholder() {
        return this.finishPrimaryWithPlaceholder;
    }

    public final Intent getPlaceholderIntent() {
        return this.placeholderIntent;
    }

    @Override // androidx.window.embedding.SplitRule, androidx.window.embedding.EmbeddingRule
    public int hashCode() {
        return this.filters.hashCode() + ((this.finishPrimaryWithPlaceholder.hashCode() + ((((this.placeholderIntent.hashCode() + (super.hashCode() * 31)) * 31) + (this.isSticky ? 1231 : 1237)) * 31)) * 31);
    }

    public final boolean isSticky() {
        return this.isSticky;
    }

    public final SplitPlaceholderRule plus$window_release(ActivityFilter filter) {
        j.g(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new Builder(C1110A.Z(linkedHashSet), this.placeholderIntent).setTag(getTag()).setMinWidthDp(getMinWidthDp()).setMinHeightDp(getMinHeightDp()).setMinSmallestWidthDp(getMinSmallestWidthDp()).setMaxAspectRatioInPortrait(getMaxAspectRatioInPortrait()).setMaxAspectRatioInLandscape(getMaxAspectRatioInLandscape()).setSticky(this.isSticky).setFinishPrimaryWithPlaceholder(this.finishPrimaryWithPlaceholder).setDefaultSplitAttributes(getDefaultSplitAttributes()).build();
    }

    @Override // androidx.window.embedding.SplitRule
    public String toString() {
        return "SplitPlaceholderRule{tag=" + getTag() + ", defaultSplitAttributes=" + getDefaultSplitAttributes() + ", minWidthDp=" + getMinWidthDp() + ", minHeightDp=" + getMinHeightDp() + ", minSmallestWidthDp=" + getMinSmallestWidthDp() + ", maxAspectRatioInPortrait=" + getMaxAspectRatioInPortrait() + ", maxAspectRatioInLandscape=" + getMaxAspectRatioInLandscape() + ", placeholderIntent=" + this.placeholderIntent + ", isSticky=" + this.isSticky + ", finishPrimaryWithPlaceholder=" + this.finishPrimaryWithPlaceholder + ", filters=" + this.filters + '}';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPlaceholderRule(String str, Set<ActivityFilter> filters, Intent placeholderIntent, boolean z4, SplitRule.FinishBehavior finishPrimaryWithPlaceholder, @IntRange(from = 0) int i, @IntRange(from = 0) int i4, @IntRange(from = 0) int i6, EmbeddingAspectRatio maxAspectRatioInPortrait, EmbeddingAspectRatio maxAspectRatioInLandscape, SplitAttributes defaultSplitAttributes) {
        super(str, i, i4, i6, maxAspectRatioInPortrait, maxAspectRatioInLandscape, defaultSplitAttributes);
        j.g(filters, "filters");
        j.g(placeholderIntent, "placeholderIntent");
        j.g(finishPrimaryWithPlaceholder, "finishPrimaryWithPlaceholder");
        j.g(maxAspectRatioInPortrait, "maxAspectRatioInPortrait");
        j.g(maxAspectRatioInLandscape, "maxAspectRatioInLandscape");
        j.g(defaultSplitAttributes, "defaultSplitAttributes");
        Preconditions.checkArgument(!finishPrimaryWithPlaceholder.equals(SplitRule.FinishBehavior.NEVER), "NEVER is not a valid configuration for SplitPlaceholderRule. Please use FINISH_ALWAYS or FINISH_ADJACENT instead or refer to the current API.", new Object[0]);
        this.filters = C1110A.Z(filters);
        this.placeholderIntent = placeholderIntent;
        this.isSticky = z4;
        this.finishPrimaryWithPlaceholder = finishPrimaryWithPlaceholder;
    }
}
