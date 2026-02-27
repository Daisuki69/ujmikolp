package androidx.window.embedding;

import android.content.res.Configuration;
import androidx.annotation.RestrictTo;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.WindowMetrics;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class SplitAttributesCalculatorParams {
    private final boolean areDefaultConstraintsSatisfied;
    private final SplitAttributes defaultSplitAttributes;
    private final Configuration parentConfiguration;
    private final WindowLayoutInfo parentWindowLayoutInfo;
    private final WindowMetrics parentWindowMetrics;
    private final String splitRuleTag;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SplitAttributesCalculatorParams(WindowMetrics parentWindowMetrics, Configuration parentConfiguration, WindowLayoutInfo parentWindowLayoutInfo, SplitAttributes defaultSplitAttributes, boolean z4, String str) {
        j.g(parentWindowMetrics, "parentWindowMetrics");
        j.g(parentConfiguration, "parentConfiguration");
        j.g(parentWindowLayoutInfo, "parentWindowLayoutInfo");
        j.g(defaultSplitAttributes, "defaultSplitAttributes");
        this.parentWindowMetrics = parentWindowMetrics;
        this.parentConfiguration = parentConfiguration;
        this.parentWindowLayoutInfo = parentWindowLayoutInfo;
        this.defaultSplitAttributes = defaultSplitAttributes;
        this.areDefaultConstraintsSatisfied = z4;
        this.splitRuleTag = str;
    }

    public final boolean areDefaultConstraintsSatisfied() {
        return this.areDefaultConstraintsSatisfied;
    }

    public final SplitAttributes getDefaultSplitAttributes() {
        return this.defaultSplitAttributes;
    }

    public final Configuration getParentConfiguration() {
        return this.parentConfiguration;
    }

    public final WindowLayoutInfo getParentWindowLayoutInfo() {
        return this.parentWindowLayoutInfo;
    }

    public final WindowMetrics getParentWindowMetrics() {
        return this.parentWindowMetrics;
    }

    public final String getSplitRuleTag() {
        return this.splitRuleTag;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SplitAttributesCalculatorParams:{windowMetrics=");
        sb2.append(this.parentWindowMetrics);
        sb2.append(", configuration=");
        sb2.append(this.parentConfiguration);
        sb2.append(", windowLayoutInfo=");
        sb2.append(this.parentWindowLayoutInfo);
        sb2.append(", defaultSplitAttributes=");
        sb2.append(this.defaultSplitAttributes);
        sb2.append(", areDefaultConstraintsSatisfied=");
        sb2.append(this.areDefaultConstraintsSatisfied);
        sb2.append(", tag=");
        return androidx.camera.core.impl.a.n(sb2, this.splitRuleTag, '}');
    }
}
