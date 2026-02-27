package io.split.android.client.dtos;

import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public class TargetingRulesChange {

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    @InterfaceC1498b("ff")
    private SplitChange f17567ff;

    @InterfaceC1498b("rbs")
    private RuleBasedSegmentChange rbs;

    public static TargetingRulesChange create(SplitChange splitChange) {
        return create(splitChange, RuleBasedSegmentChange.createEmpty());
    }

    public SplitChange getFeatureFlagsChange() {
        return this.f17567ff;
    }

    public RuleBasedSegmentChange getRuleBasedSegmentsChange() {
        return this.rbs;
    }

    public static TargetingRulesChange create(SplitChange splitChange, RuleBasedSegmentChange ruleBasedSegmentChange) {
        TargetingRulesChange targetingRulesChange = new TargetingRulesChange();
        targetingRulesChange.f17567ff = splitChange;
        targetingRulesChange.rbs = ruleBasedSegmentChange;
        return targetingRulesChange;
    }
}
