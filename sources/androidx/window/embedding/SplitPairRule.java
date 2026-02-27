package androidx.window.embedding;

import androidx.annotation.IntRange;
import androidx.window.embedding.SplitAttributes;
import androidx.window.embedding.SplitRule;
import cj.C1110A;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class SplitPairRule extends SplitRule {
    private final boolean clearTop;
    private final Set<SplitPairFilter> filters;
    private final SplitRule.FinishBehavior finishPrimaryWithSecondary;
    private final SplitRule.FinishBehavior finishSecondaryWithPrimary;

    public static final class Builder {
        private boolean clearTop;
        private SplitAttributes defaultSplitAttributes;
        private final Set<SplitPairFilter> filters;
        private SplitRule.FinishBehavior finishPrimaryWithSecondary;
        private SplitRule.FinishBehavior finishSecondaryWithPrimary;
        private EmbeddingAspectRatio maxAspectRatioInLandscape;
        private EmbeddingAspectRatio maxAspectRatioInPortrait;

        @IntRange(from = 0)
        private int minHeightDp;

        @IntRange(from = 0)
        private int minSmallestWidthDp;

        @IntRange(from = 0)
        private int minWidthDp;
        private String tag;

        public Builder(Set<SplitPairFilter> filters) {
            j.g(filters, "filters");
            this.filters = filters;
            this.minWidthDp = 600;
            this.minHeightDp = 600;
            this.minSmallestWidthDp = 600;
            this.maxAspectRatioInPortrait = SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT;
            this.maxAspectRatioInLandscape = SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT;
            this.finishPrimaryWithSecondary = SplitRule.FinishBehavior.NEVER;
            this.finishSecondaryWithPrimary = SplitRule.FinishBehavior.ALWAYS;
            this.defaultSplitAttributes = new SplitAttributes.Builder().build();
        }

        public final SplitPairRule build() {
            return new SplitPairRule(this.filters, this.defaultSplitAttributes, this.tag, this.finishPrimaryWithSecondary, this.finishSecondaryWithPrimary, this.clearTop, this.minWidthDp, this.minHeightDp, this.minSmallestWidthDp, this.maxAspectRatioInPortrait, this.maxAspectRatioInLandscape);
        }

        public final Builder setClearTop(boolean z4) {
            this.clearTop = z4;
            return this;
        }

        public final Builder setDefaultSplitAttributes(SplitAttributes defaultSplitAttributes) {
            j.g(defaultSplitAttributes, "defaultSplitAttributes");
            this.defaultSplitAttributes = defaultSplitAttributes;
            return this;
        }

        public final Builder setFinishPrimaryWithSecondary(SplitRule.FinishBehavior finishPrimaryWithSecondary) {
            j.g(finishPrimaryWithSecondary, "finishPrimaryWithSecondary");
            this.finishPrimaryWithSecondary = finishPrimaryWithSecondary;
            return this;
        }

        public final Builder setFinishSecondaryWithPrimary(SplitRule.FinishBehavior finishSecondaryWithPrimary) {
            j.g(finishSecondaryWithPrimary, "finishSecondaryWithPrimary");
            this.finishSecondaryWithPrimary = finishSecondaryWithPrimary;
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

        public final Builder setTag(String str) {
            this.tag = str;
            return this;
        }
    }

    public /* synthetic */ SplitPairRule(Set set, SplitAttributes splitAttributes, String str, SplitRule.FinishBehavior finishBehavior, SplitRule.FinishBehavior finishBehavior2, boolean z4, int i, int i4, int i6, EmbeddingAspectRatio embeddingAspectRatio, EmbeddingAspectRatio embeddingAspectRatio2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, splitAttributes, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? SplitRule.FinishBehavior.NEVER : finishBehavior, (i10 & 16) != 0 ? SplitRule.FinishBehavior.ALWAYS : finishBehavior2, (i10 & 32) != 0 ? false : z4, (i10 & 64) != 0 ? 600 : i, (i10 & 128) != 0 ? 600 : i4, (i10 & 256) != 0 ? 600 : i6, (i10 & 512) != 0 ? SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT : embeddingAspectRatio, (i10 & 1024) != 0 ? SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT : embeddingAspectRatio2);
    }

    @Override // androidx.window.embedding.SplitRule, androidx.window.embedding.EmbeddingRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPairRule) || !super.equals(obj)) {
            return false;
        }
        SplitPairRule splitPairRule = (SplitPairRule) obj;
        return j.b(this.filters, splitPairRule.filters) && j.b(this.finishPrimaryWithSecondary, splitPairRule.finishPrimaryWithSecondary) && j.b(this.finishSecondaryWithPrimary, splitPairRule.finishSecondaryWithPrimary) && this.clearTop == splitPairRule.clearTop;
    }

    public final boolean getClearTop() {
        return this.clearTop;
    }

    public final Set<SplitPairFilter> getFilters() {
        return this.filters;
    }

    public final SplitRule.FinishBehavior getFinishPrimaryWithSecondary() {
        return this.finishPrimaryWithSecondary;
    }

    public final SplitRule.FinishBehavior getFinishSecondaryWithPrimary() {
        return this.finishSecondaryWithPrimary;
    }

    @Override // androidx.window.embedding.SplitRule, androidx.window.embedding.EmbeddingRule
    public int hashCode() {
        return ((this.finishSecondaryWithPrimary.hashCode() + ((this.finishPrimaryWithSecondary.hashCode() + ((this.filters.hashCode() + (super.hashCode() * 31)) * 31)) * 31)) * 31) + (this.clearTop ? 1231 : 1237);
    }

    public final SplitPairRule plus$window_release(SplitPairFilter filter) {
        j.g(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new Builder(C1110A.Z(linkedHashSet)).setTag(getTag()).setMinWidthDp(getMinWidthDp()).setMinHeightDp(getMinHeightDp()).setMinSmallestWidthDp(getMinSmallestWidthDp()).setMaxAspectRatioInPortrait(getMaxAspectRatioInPortrait()).setMaxAspectRatioInLandscape(getMaxAspectRatioInLandscape()).setFinishPrimaryWithSecondary(this.finishPrimaryWithSecondary).setFinishSecondaryWithPrimary(this.finishSecondaryWithPrimary).setClearTop(this.clearTop).setDefaultSplitAttributes(getDefaultSplitAttributes()).build();
    }

    @Override // androidx.window.embedding.SplitRule
    public String toString() {
        return "SplitPairRule{tag=" + getTag() + ", defaultSplitAttributes=" + getDefaultSplitAttributes() + ", minWidthDp=" + getMinWidthDp() + ", minHeightDp=" + getMinHeightDp() + ", minSmallestWidthDp=" + getMinSmallestWidthDp() + ", maxAspectRatioInPortrait=" + getMaxAspectRatioInPortrait() + ", maxAspectRatioInLandscape=" + getMaxAspectRatioInLandscape() + ", clearTop=" + this.clearTop + ", finishPrimaryWithSecondary=" + this.finishPrimaryWithSecondary + ", finishSecondaryWithPrimary=" + this.finishSecondaryWithPrimary + ", filters=" + this.filters + '}';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPairRule(Set<SplitPairFilter> filters, SplitAttributes defaultSplitAttributes, String str, SplitRule.FinishBehavior finishPrimaryWithSecondary, SplitRule.FinishBehavior finishSecondaryWithPrimary, boolean z4, @IntRange(from = 0) int i, @IntRange(from = 0) int i4, @IntRange(from = 0) int i6, EmbeddingAspectRatio maxAspectRatioInPortrait, EmbeddingAspectRatio maxAspectRatioInLandscape) {
        super(str, i, i4, i6, maxAspectRatioInPortrait, maxAspectRatioInLandscape, defaultSplitAttributes);
        j.g(filters, "filters");
        j.g(defaultSplitAttributes, "defaultSplitAttributes");
        j.g(finishPrimaryWithSecondary, "finishPrimaryWithSecondary");
        j.g(finishSecondaryWithPrimary, "finishSecondaryWithPrimary");
        j.g(maxAspectRatioInPortrait, "maxAspectRatioInPortrait");
        j.g(maxAspectRatioInLandscape, "maxAspectRatioInLandscape");
        this.filters = filters;
        this.finishPrimaryWithSecondary = finishPrimaryWithSecondary;
        this.finishSecondaryWithPrimary = finishSecondaryWithPrimary;
        this.clearTop = z4;
    }
}
