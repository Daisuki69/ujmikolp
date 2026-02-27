package androidx.window.embedding;

import We.s;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.IBinder;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.camera.video.AudioStats;
import androidx.window.WindowSdkExtensions;
import androidx.window.core.PredicateAdapter;
import androidx.window.embedding.SplitAttributes;
import androidx.window.embedding.SplitRule;
import androidx.window.extensions.core.util.function.Function;
import androidx.window.extensions.core.util.function.Predicate;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.SplitAttributes;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.WindowMetricsCalculator;
import androidx.window.layout.adapter.extensions.ExtensionsWindowLayoutInfoAdapter;
import cj.C1110A;
import cj.C1114E;
import cj.C1129o;
import cj.t;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes2.dex */
public final class EmbeddingAdapter {
    private final VendorApiLevel1Impl api1Impl;
    private final VendorApiLevel2Impl api2Impl;
    private final PredicateAdapter predicateAdapter;
    public static final Companion Companion = new Companion(null);
    private static final Binder INVALID_SPLIT_INFO_TOKEN = new Binder();
    private static final Binder INVALID_ACTIVITY_STACK_TOKEN = new Binder();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Binder getINVALID_ACTIVITY_STACK_TOKEN() {
            return EmbeddingAdapter.INVALID_ACTIVITY_STACK_TOKEN;
        }

        public final Binder getINVALID_SPLIT_INFO_TOKEN() {
            return EmbeddingAdapter.INVALID_SPLIT_INFO_TOKEN;
        }

        private Companion() {
        }
    }

    public final class VendorApiLevel2Impl {
        public VendorApiLevel2Impl() {
        }

        public final SplitInfo translateCompat(androidx.window.extensions.embedding.SplitInfo splitInfo) {
            j.g(splitInfo, "splitInfo");
            androidx.window.extensions.embedding.ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
            j.f(primaryActivityStack, "splitInfo.primaryActivityStack");
            List activities = primaryActivityStack.getActivities();
            j.f(activities, "primaryActivityStack.activities");
            ActivityStack activityStack = new ActivityStack(activities, primaryActivityStack.isEmpty());
            androidx.window.extensions.embedding.ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
            j.f(secondaryActivityStack, "splitInfo.secondaryActivityStack");
            List activities2 = secondaryActivityStack.getActivities();
            j.f(activities2, "secondaryActivityStack.activities");
            ActivityStack activityStack2 = new ActivityStack(activities2, secondaryActivityStack.isEmpty());
            EmbeddingAdapter embeddingAdapter = EmbeddingAdapter.this;
            androidx.window.extensions.embedding.SplitAttributes splitAttributes = splitInfo.getSplitAttributes();
            j.f(splitAttributes, "splitInfo.splitAttributes");
            return new SplitInfo(activityStack, activityStack2, embeddingAdapter.translate$window_release(splitAttributes), EmbeddingAdapter.Companion.getINVALID_SPLIT_INFO_TOKEN());
        }
    }

    public EmbeddingAdapter(PredicateAdapter predicateAdapter) {
        j.g(predicateAdapter, "predicateAdapter");
        this.predicateAdapter = predicateAdapter;
        this.api1Impl = new VendorApiLevel1Impl(this, predicateAdapter);
        this.api2Impl = new VendorApiLevel2Impl();
    }

    private final int getVendorApiLevel() {
        return WindowSdkExtensions.Companion.getInstance().getExtensionVersion();
    }

    private final androidx.window.extensions.embedding.ActivityRule translateActivityRule(final ActivityRule activityRule, Class<?> cls) {
        if (getVendorApiLevel() < 2) {
            return this.api1Impl.translateActivityRuleCompat(activityRule, cls);
        }
        final int i = 0;
        final int i4 = 1;
        ActivityRule.Builder shouldAlwaysExpand = new ActivityRule.Builder(new Predicate() { // from class: androidx.window.embedding.e
            @Override // androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                switch (i) {
                    case 0:
                        return EmbeddingAdapter.translateActivityRule$lambda$13(activityRule, (Activity) obj);
                    default:
                        return EmbeddingAdapter.translateActivityRule$lambda$15(activityRule, (Intent) obj);
                }
            }
        }, new Predicate() { // from class: androidx.window.embedding.e
            @Override // androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                switch (i4) {
                    case 0:
                        return EmbeddingAdapter.translateActivityRule$lambda$13(activityRule, (Activity) obj);
                    default:
                        return EmbeddingAdapter.translateActivityRule$lambda$15(activityRule, (Intent) obj);
                }
            }
        }).setShouldAlwaysExpand(activityRule.getAlwaysExpand());
        j.f(shouldAlwaysExpand, "ActivityRuleBuilder(acti…Expand(rule.alwaysExpand)");
        String tag = activityRule.getTag();
        if (tag != null) {
            shouldAlwaysExpand.setTag(tag);
        }
        androidx.window.extensions.embedding.ActivityRule activityRuleBuild = shouldAlwaysExpand.build();
        j.f(activityRuleBuild, "builder.build()");
        return activityRuleBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean translateActivityRule$lambda$13(ActivityRule rule, Activity activity) {
        j.g(rule, "$rule");
        Set<ActivityFilter> filters = rule.getFilters();
        if (!(filters != null) || !filters.isEmpty()) {
            for (ActivityFilter activityFilter : filters) {
                j.f(activity, "activity");
                if (activityFilter.matchesActivity(activity)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean translateActivityRule$lambda$15(ActivityRule rule, Intent intent) {
        j.g(rule, "$rule");
        Set<ActivityFilter> filters = rule.getFilters();
        if (!(filters != null) || !filters.isEmpty()) {
            for (ActivityFilter activityFilter : filters) {
                j.f(intent, "intent");
                if (activityFilter.matchesIntent(intent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.window.extensions.embedding.SplitAttributes translateSplitAttributesCalculator$lambda$0(EmbeddingAdapter this$0, Function1 calculator, androidx.window.extensions.embedding.SplitAttributesCalculatorParams oemParams) {
        j.g(this$0, "this$0");
        j.g(calculator, "$calculator");
        j.f(oemParams, "oemParams");
        return this$0.translateSplitAttributes((SplitAttributes) calculator.invoke(this$0.translate(oemParams)));
    }

    private final androidx.window.extensions.embedding.SplitPairRule translateSplitPairRule(Context context, final SplitPairRule splitPairRule, Class<?> cls) {
        if (getVendorApiLevel() < 2) {
            return this.api1Impl.translateSplitPairRuleCompat(context, splitPairRule, cls);
        }
        final int i = 0;
        Predicate predicate = new Predicate() { // from class: androidx.window.embedding.d
            @Override // androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                switch (i) {
                    case 0:
                        return EmbeddingAdapter.translateSplitPairRule$lambda$3(splitPairRule, (Pair) obj);
                    default:
                        return EmbeddingAdapter.translateSplitPairRule$lambda$5(splitPairRule, (Pair) obj);
                }
            }
        };
        final int i4 = 1;
        Predicate predicate2 = new Predicate() { // from class: androidx.window.embedding.d
            @Override // androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                switch (i4) {
                    case 0:
                        return EmbeddingAdapter.translateSplitPairRule$lambda$3(splitPairRule, (Pair) obj);
                    default:
                        return EmbeddingAdapter.translateSplitPairRule$lambda$5(splitPairRule, (Pair) obj);
                }
            }
        };
        b bVar = new b(splitPairRule, context, 1);
        String tag = splitPairRule.getTag();
        SplitPairRule.Builder shouldClearTop = new SplitPairRule.Builder(predicate, predicate2, bVar).setDefaultSplitAttributes(translateSplitAttributes(splitPairRule.getDefaultSplitAttributes())).setFinishPrimaryWithSecondary(translateFinishBehavior(splitPairRule.getFinishPrimaryWithSecondary())).setFinishSecondaryWithPrimary(translateFinishBehavior(splitPairRule.getFinishSecondaryWithPrimary())).setShouldClearTop(splitPairRule.getClearTop());
        j.f(shouldClearTop, "SplitPairRuleBuilder(\n  …ldClearTop(rule.clearTop)");
        if (tag != null) {
            shouldClearTop.setTag(tag);
        }
        androidx.window.extensions.embedding.SplitPairRule splitPairRuleBuild = shouldClearTop.build();
        j.f(splitPairRuleBuild, "builder.build()");
        return splitPairRuleBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean translateSplitPairRule$lambda$3(SplitPairRule rule, Pair pair) {
        j.g(rule, "$rule");
        Set<SplitPairFilter> filters = rule.getFilters();
        if (!(filters != null) || !filters.isEmpty()) {
            for (SplitPairFilter splitPairFilter : filters) {
                Object obj = pair.first;
                j.f(obj, "activitiesPair.first");
                Object obj2 = pair.second;
                j.f(obj2, "activitiesPair.second");
                if (splitPairFilter.matchesActivityPair((Activity) obj, (Activity) obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean translateSplitPairRule$lambda$5(SplitPairRule rule, Pair pair) {
        j.g(rule, "$rule");
        Set<SplitPairFilter> filters = rule.getFilters();
        if (!(filters != null) || !filters.isEmpty()) {
            for (SplitPairFilter splitPairFilter : filters) {
                Object obj = pair.first;
                j.f(obj, "activityIntentPair.first");
                Object obj2 = pair.second;
                j.f(obj2, "activityIntentPair.second");
                if (splitPairFilter.matchesActivityIntentPair((Activity) obj, (Intent) obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean translateSplitPairRule$lambda$6(SplitPairRule rule, Context context, WindowMetrics windowMetrics) {
        j.g(rule, "$rule");
        j.g(context, "$context");
        j.f(windowMetrics, "windowMetrics");
        return rule.checkParentMetrics$window_release(context, windowMetrics);
    }

    private final androidx.window.extensions.embedding.SplitPlaceholderRule translateSplitPlaceholderRule(Context context, final SplitPlaceholderRule splitPlaceholderRule, Class<?> cls) {
        if (getVendorApiLevel() < 2) {
            return this.api1Impl.translateSplitPlaceholderRuleCompat(context, splitPlaceholderRule, cls);
        }
        final int i = 0;
        Predicate predicate = new Predicate() { // from class: androidx.window.embedding.a
            @Override // androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                switch (i) {
                    case 0:
                        return EmbeddingAdapter.translateSplitPlaceholderRule$lambda$8(splitPlaceholderRule, (Activity) obj);
                    default:
                        return EmbeddingAdapter.translateSplitPlaceholderRule$lambda$10(splitPlaceholderRule, (Intent) obj);
                }
            }
        };
        final int i4 = 1;
        Predicate predicate2 = new Predicate() { // from class: androidx.window.embedding.a
            @Override // androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                switch (i4) {
                    case 0:
                        return EmbeddingAdapter.translateSplitPlaceholderRule$lambda$8(splitPlaceholderRule, (Activity) obj);
                    default:
                        return EmbeddingAdapter.translateSplitPlaceholderRule$lambda$10(splitPlaceholderRule, (Intent) obj);
                }
            }
        };
        b bVar = new b(splitPlaceholderRule, context, 0);
        String tag = splitPlaceholderRule.getTag();
        SplitPlaceholderRule.Builder finishPrimaryWithPlaceholder = new SplitPlaceholderRule.Builder(splitPlaceholderRule.getPlaceholderIntent(), predicate, predicate2, bVar).setSticky(splitPlaceholderRule.isSticky()).setDefaultSplitAttributes(translateSplitAttributes(splitPlaceholderRule.getDefaultSplitAttributes())).setFinishPrimaryWithPlaceholder(translateFinishBehavior(splitPlaceholderRule.getFinishPrimaryWithPlaceholder()));
        j.f(finishPrimaryWithPlaceholder, "SplitPlaceholderRuleBuil…holder)\n                )");
        if (tag != null) {
            finishPrimaryWithPlaceholder.setTag(tag);
        }
        androidx.window.extensions.embedding.SplitPlaceholderRule splitPlaceholderRuleBuild = finishPrimaryWithPlaceholder.build();
        j.f(splitPlaceholderRuleBuild, "builder.build()");
        return splitPlaceholderRuleBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean translateSplitPlaceholderRule$lambda$10(SplitPlaceholderRule rule, Intent intent) {
        j.g(rule, "$rule");
        Set<ActivityFilter> filters = rule.getFilters();
        if (!(filters != null) || !filters.isEmpty()) {
            for (ActivityFilter activityFilter : filters) {
                j.f(intent, "intent");
                if (activityFilter.matchesIntent(intent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean translateSplitPlaceholderRule$lambda$11(SplitPlaceholderRule rule, Context context, WindowMetrics windowMetrics) {
        j.g(rule, "$rule");
        j.g(context, "$context");
        j.f(windowMetrics, "windowMetrics");
        return rule.checkParentMetrics$window_release(context, windowMetrics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean translateSplitPlaceholderRule$lambda$8(SplitPlaceholderRule rule, Activity activity) {
        j.g(rule, "$rule");
        Set<ActivityFilter> filters = rule.getFilters();
        if (!(filters != null) || !filters.isEmpty()) {
            for (ActivityFilter activityFilter : filters) {
                j.f(activity, "activity");
                if (activityFilter.matchesActivity(activity)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final SplitAttributes.SplitType translateSplitType(SplitAttributes.SplitType splitType) {
        if (getVendorApiLevel() < 2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (j.b(splitType, SplitAttributes.SplitType.SPLIT_TYPE_HINGE)) {
            return new SplitAttributes.SplitType.HingeSplitType(translateSplitType(SplitAttributes.SplitType.SPLIT_TYPE_EQUAL));
        }
        if (j.b(splitType, SplitAttributes.SplitType.SPLIT_TYPE_EXPAND)) {
            return new SplitAttributes.SplitType.ExpandContainersSplitType();
        }
        float value$window_release = splitType.getValue$window_release();
        double d10 = value$window_release;
        if (d10 > AudioStats.AUDIO_AMPLITUDE_NONE && d10 < 1.0d) {
            return new SplitAttributes.SplitType.RatioSplitType(value$window_release);
        }
        throw new IllegalArgumentException("Unsupported SplitType: " + splitType + " with value: " + splitType.getValue$window_release());
    }

    public final List<SplitInfo> translate(List<? extends androidx.window.extensions.embedding.SplitInfo> splitInfoList) {
        j.g(splitInfoList, "splitInfoList");
        List<? extends androidx.window.extensions.embedding.SplitInfo> list = splitInfoList;
        ArrayList arrayList = new ArrayList(t.l(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(translate((androidx.window.extensions.embedding.SplitInfo) it.next()));
        }
        return arrayList;
    }

    public final SplitAttributes translate$window_release(androidx.window.extensions.embedding.SplitAttributes splitAttributes) {
        SplitAttributes.SplitType splitTypeRatio;
        SplitAttributes.LayoutDirection layoutDirection;
        j.g(splitAttributes, "splitAttributes");
        SplitAttributes.Builder builder = new SplitAttributes.Builder();
        SplitAttributes.SplitType.RatioSplitType splitType = splitAttributes.getSplitType();
        j.f(splitType, "splitAttributes.splitType");
        if (splitType instanceof SplitAttributes.SplitType.HingeSplitType) {
            splitTypeRatio = SplitAttributes.SplitType.SPLIT_TYPE_HINGE;
        } else if (splitType instanceof SplitAttributes.SplitType.ExpandContainersSplitType) {
            splitTypeRatio = SplitAttributes.SplitType.SPLIT_TYPE_EXPAND;
        } else {
            if (!(splitType instanceof SplitAttributes.SplitType.RatioSplitType)) {
                throw new IllegalArgumentException("Unknown split type: " + splitType);
            }
            splitTypeRatio = SplitAttributes.SplitType.Companion.ratio(splitType.getRatio());
        }
        SplitAttributes.Builder splitType2 = builder.setSplitType(splitTypeRatio);
        int layoutDirection2 = splitAttributes.getLayoutDirection();
        if (layoutDirection2 == 0) {
            layoutDirection = SplitAttributes.LayoutDirection.LEFT_TO_RIGHT;
        } else if (layoutDirection2 == 1) {
            layoutDirection = SplitAttributes.LayoutDirection.RIGHT_TO_LEFT;
        } else if (layoutDirection2 == 3) {
            layoutDirection = SplitAttributes.LayoutDirection.LOCALE;
        } else if (layoutDirection2 == 4) {
            layoutDirection = SplitAttributes.LayoutDirection.TOP_TO_BOTTOM;
        } else {
            if (layoutDirection2 != 5) {
                throw new IllegalArgumentException(s.f(layoutDirection2, "Unknown layout direction: "));
            }
            layoutDirection = SplitAttributes.LayoutDirection.BOTTOM_TO_TOP;
        }
        return splitType2.setLayoutDirection(layoutDirection).build();
    }

    public final int translateFinishBehavior(SplitRule.FinishBehavior behavior) {
        j.g(behavior, "behavior");
        if (behavior.equals(SplitRule.FinishBehavior.NEVER)) {
            return 0;
        }
        if (behavior.equals(SplitRule.FinishBehavior.ALWAYS)) {
            return 1;
        }
        if (behavior.equals(SplitRule.FinishBehavior.ADJACENT)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown finish behavior:" + behavior);
    }

    public final androidx.window.extensions.embedding.SplitAttributes translateSplitAttributes(SplitAttributes splitAttributes) {
        int i;
        j.g(splitAttributes, "splitAttributes");
        if (getVendorApiLevel() < 2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SplitAttributes.Builder splitType = new SplitAttributes.Builder().setSplitType(translateSplitType(splitAttributes.getSplitType()));
        SplitAttributes.LayoutDirection layoutDirection = splitAttributes.getLayoutDirection();
        if (j.b(layoutDirection, SplitAttributes.LayoutDirection.LOCALE)) {
            i = 3;
        } else if (j.b(layoutDirection, SplitAttributes.LayoutDirection.LEFT_TO_RIGHT)) {
            i = 0;
        } else if (j.b(layoutDirection, SplitAttributes.LayoutDirection.RIGHT_TO_LEFT)) {
            i = 1;
        } else if (j.b(layoutDirection, SplitAttributes.LayoutDirection.TOP_TO_BOTTOM)) {
            i = 4;
        } else {
            if (!j.b(layoutDirection, SplitAttributes.LayoutDirection.BOTTOM_TO_TOP)) {
                throw new IllegalArgumentException("Unsupported layoutDirection:" + splitAttributes + ".layoutDirection");
            }
            i = 5;
        }
        androidx.window.extensions.embedding.SplitAttributes splitAttributesBuild = splitType.setLayoutDirection(i).build();
        j.f(splitAttributesBuild, "Builder()\n            .s…   )\n            .build()");
        return splitAttributesBuild;
    }

    public final Function<androidx.window.extensions.embedding.SplitAttributesCalculatorParams, androidx.window.extensions.embedding.SplitAttributes> translateSplitAttributesCalculator(final Function1<? super SplitAttributesCalculatorParams, SplitAttributes> calculator) {
        j.g(calculator, "calculator");
        return new Function() { // from class: androidx.window.embedding.c
            @Override // androidx.window.extensions.core.util.function.Function
            public final Object apply(Object obj) {
                return EmbeddingAdapter.translateSplitAttributesCalculator$lambda$0(this.f8211a, calculator, (androidx.window.extensions.embedding.SplitAttributesCalculatorParams) obj);
            }
        };
    }

    public final class VendorApiLevel1Impl {
        private final PredicateAdapter predicateAdapter;
        final /* synthetic */ EmbeddingAdapter this$0;

        public VendorApiLevel1Impl(EmbeddingAdapter embeddingAdapter, PredicateAdapter predicateAdapter) {
            j.g(predicateAdapter, "predicateAdapter");
            this.this$0 = embeddingAdapter;
            this.predicateAdapter = predicateAdapter;
        }

        private final boolean isSplitAttributesSupported(SplitAttributes splitAttributes) {
            double value$window_release = splitAttributes.getSplitType().getValue$window_release();
            return AudioStats.AUDIO_AMPLITUDE_NONE <= value$window_release && value$window_release <= 1.0d && splitAttributes.getSplitType().getValue$window_release() != 1.0f && C1129o.p(new SplitAttributes.LayoutDirection[]{SplitAttributes.LayoutDirection.LEFT_TO_RIGHT, SplitAttributes.LayoutDirection.RIGHT_TO_LEFT, SplitAttributes.LayoutDirection.LOCALE}, splitAttributes.getLayoutDirection());
        }

        private final SplitPlaceholderRule.Builder setDefaultSplitAttributesCompat(SplitPlaceholderRule.Builder builder, SplitAttributes splitAttributes) {
            kotlin.Pair<Float, Integer> pairTranslateSplitAttributesCompatInternal = translateSplitAttributesCompatInternal(splitAttributes);
            float fFloatValue = ((Number) pairTranslateSplitAttributesCompatInternal.f18160a).floatValue();
            int iIntValue = ((Number) pairTranslateSplitAttributesCompatInternal.f18161b).intValue();
            builder.setSplitRatio(fFloatValue);
            builder.setLayoutDirection(iIntValue);
            return builder;
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        private final Object translateActivityIntentPredicates(Set<SplitPairFilter> set) {
            return this.predicateAdapter.buildPairPredicate(z.a(Activity.class), z.a(Intent.class), new EmbeddingAdapter$VendorApiLevel1Impl$translateActivityIntentPredicates$1(set));
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        private final Object translateActivityPairPredicates(Set<SplitPairFilter> set) {
            return this.predicateAdapter.buildPairPredicate(z.a(Activity.class), z.a(Activity.class), new EmbeddingAdapter$VendorApiLevel1Impl$translateActivityPairPredicates$1(set));
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        private final Object translateActivityPredicates(Set<ActivityFilter> set) {
            return this.predicateAdapter.buildPredicate(z.a(Activity.class), new EmbeddingAdapter$VendorApiLevel1Impl$translateActivityPredicates$1(set));
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        private final Object translateIntentPredicates(Set<ActivityFilter> set) {
            return this.predicateAdapter.buildPredicate(z.a(Intent.class), new EmbeddingAdapter$VendorApiLevel1Impl$translateIntentPredicates$1(set));
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        private final Object translateParentMetricsPredicate(Context context, SplitRule splitRule) {
            return this.predicateAdapter.buildPredicate(z.a(androidx.media3.exoplayer.hls.e.o()), new EmbeddingAdapter$VendorApiLevel1Impl$translateParentMetricsPredicate$1(splitRule, context));
        }

        private final kotlin.Pair<Float, Integer> translateSplitAttributesCompatInternal(SplitAttributes splitAttributes) {
            int i = 3;
            if (!isSplitAttributesSupported(splitAttributes)) {
                return new kotlin.Pair<>(Float.valueOf(0.0f), 3);
            }
            Float fValueOf = Float.valueOf(splitAttributes.getSplitType().getValue$window_release());
            SplitAttributes.LayoutDirection layoutDirection = splitAttributes.getLayoutDirection();
            if (!j.b(layoutDirection, SplitAttributes.LayoutDirection.LOCALE)) {
                if (j.b(layoutDirection, SplitAttributes.LayoutDirection.LEFT_TO_RIGHT)) {
                    i = 0;
                } else {
                    if (!j.b(layoutDirection, SplitAttributes.LayoutDirection.RIGHT_TO_LEFT)) {
                        throw new IllegalStateException("Unsupported layout direction must be covered in @isSplitAttributesSupported!");
                    }
                    i = 1;
                }
            }
            return new kotlin.Pair<>(fValueOf, Integer.valueOf(i));
        }

        public final PredicateAdapter getPredicateAdapter() {
            return this.predicateAdapter;
        }

        public final SplitAttributes getSplitAttributesCompat(androidx.window.extensions.embedding.SplitInfo splitInfo) {
            j.g(splitInfo, "splitInfo");
            return new SplitAttributes.Builder().setSplitType(SplitAttributes.SplitType.Companion.buildSplitTypeFromValue$window_release(splitInfo.getSplitRatio())).setLayoutDirection(SplitAttributes.LayoutDirection.LOCALE).build();
        }

        public final androidx.window.extensions.embedding.ActivityRule translateActivityRuleCompat(ActivityRule rule, Class<?> predicateClass) {
            j.g(rule, "rule");
            j.g(predicateClass, "predicateClass");
            androidx.window.extensions.embedding.ActivityRule activityRuleBuild = ((ActivityRule.Builder) ActivityRule.Builder.class.getConstructor(predicateClass, predicateClass).newInstance(translateActivityPredicates(rule.getFilters()), translateIntentPredicates(rule.getFilters()))).setShouldAlwaysExpand(rule.getAlwaysExpand()).build();
            j.f(activityRuleBuild, "ActivityRuleBuilder::cla…\n                .build()");
            return activityRuleBuild;
        }

        public final SplitInfo translateCompat(androidx.window.extensions.embedding.SplitInfo splitInfo) {
            j.g(splitInfo, "splitInfo");
            List activities = splitInfo.getPrimaryActivityStack().getActivities();
            j.f(activities, "splitInfo.primaryActivityStack.activities");
            ActivityStack activityStack = new ActivityStack(activities, splitInfo.getPrimaryActivityStack().isEmpty());
            List activities2 = splitInfo.getSecondaryActivityStack().getActivities();
            j.f(activities2, "splitInfo.secondaryActivityStack.activities");
            return new SplitInfo(activityStack, new ActivityStack(activities2, splitInfo.getSecondaryActivityStack().isEmpty()), getSplitAttributesCompat(splitInfo), EmbeddingAdapter.Companion.getINVALID_SPLIT_INFO_TOKEN());
        }

        public final androidx.window.extensions.embedding.SplitPairRule translateSplitPairRuleCompat(Context context, SplitPairRule rule, Class<?> predicateClass) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            j.g(context, "context");
            j.g(rule, "rule");
            j.g(predicateClass, "predicateClass");
            Object objNewInstance = SplitPairRule.Builder.class.getConstructor(predicateClass, predicateClass, predicateClass).newInstance(translateActivityPairPredicates(rule.getFilters()), translateActivityIntentPredicates(rule.getFilters()), translateParentMetricsPredicate(context, rule));
            j.f(objNewInstance, "SplitPairRuleBuilder::cl…text, rule)\n            )");
            androidx.window.extensions.embedding.SplitPairRule splitPairRuleBuild = setDefaultSplitAttributesCompat((SplitPairRule.Builder) objNewInstance, rule.getDefaultSplitAttributes()).setShouldClearTop(rule.getClearTop()).setFinishPrimaryWithSecondary(this.this$0.translateFinishBehavior(rule.getFinishPrimaryWithSecondary())).setFinishSecondaryWithPrimary(this.this$0.translateFinishBehavior(rule.getFinishSecondaryWithPrimary())).build();
            j.f(splitPairRuleBuild, "SplitPairRuleBuilder::cl…                ).build()");
            return splitPairRuleBuild;
        }

        public final androidx.window.extensions.embedding.SplitPlaceholderRule translateSplitPlaceholderRuleCompat(Context context, SplitPlaceholderRule rule, Class<?> predicateClass) {
            j.g(context, "context");
            j.g(rule, "rule");
            j.g(predicateClass, "predicateClass");
            SplitPlaceholderRule.Builder finishPrimaryWithSecondary = ((SplitPlaceholderRule.Builder) SplitPlaceholderRule.Builder.class.getConstructor(Intent.class, predicateClass, predicateClass, predicateClass).newInstance(rule.getPlaceholderIntent(), translateActivityPredicates(rule.getFilters()), translateIntentPredicates(rule.getFilters()), translateParentMetricsPredicate(context, rule))).setSticky(rule.isSticky()).setFinishPrimaryWithSecondary(this.this$0.translateFinishBehavior(rule.getFinishPrimaryWithPlaceholder()));
            j.f(finishPrimaryWithSecondary, "SplitPlaceholderRuleBuil…holder)\n                )");
            androidx.window.extensions.embedding.SplitPlaceholderRule splitPlaceholderRuleBuild = setDefaultSplitAttributesCompat(finishPrimaryWithSecondary, rule.getDefaultSplitAttributes()).build();
            j.f(splitPlaceholderRuleBuild, "SplitPlaceholderRuleBuil…\n                .build()");
            return splitPlaceholderRuleBuild;
        }

        private final SplitPairRule.Builder setDefaultSplitAttributesCompat(SplitPairRule.Builder builder, SplitAttributes splitAttributes) {
            kotlin.Pair<Float, Integer> pairTranslateSplitAttributesCompatInternal = translateSplitAttributesCompatInternal(splitAttributes);
            float fFloatValue = ((Number) pairTranslateSplitAttributesCompatInternal.f18160a).floatValue();
            int iIntValue = ((Number) pairTranslateSplitAttributesCompatInternal.f18161b).intValue();
            builder.setSplitRatio(fFloatValue);
            builder.setLayoutDirection(iIntValue);
            return builder;
        }
    }

    private final SplitInfo translate(androidx.window.extensions.embedding.SplitInfo splitInfo) {
        int vendorApiLevel = getVendorApiLevel();
        if (vendorApiLevel == 1) {
            return this.api1Impl.translateCompat(splitInfo);
        }
        if (vendorApiLevel != 2) {
            androidx.window.extensions.embedding.ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
            j.f(primaryActivityStack, "splitInfo.primaryActivityStack");
            androidx.window.extensions.embedding.ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
            j.f(secondaryActivityStack, "splitInfo.secondaryActivityStack");
            List activities = primaryActivityStack.getActivities();
            j.f(activities, "primaryActivityStack.activities");
            ActivityStack activityStack = new ActivityStack(activities, primaryActivityStack.isEmpty());
            List activities2 = secondaryActivityStack.getActivities();
            j.f(activities2, "secondaryActivityStack.activities");
            ActivityStack activityStack2 = new ActivityStack(activities2, secondaryActivityStack.isEmpty());
            androidx.window.extensions.embedding.SplitAttributes splitAttributes = splitInfo.getSplitAttributes();
            j.f(splitAttributes, "splitInfo.splitAttributes");
            SplitAttributes splitAttributesTranslate$window_release = translate$window_release(splitAttributes);
            IBinder token = splitInfo.getToken();
            j.f(token, "splitInfo.token");
            return new SplitInfo(activityStack, activityStack2, splitAttributesTranslate$window_release, token);
        }
        return this.api2Impl.translateCompat(splitInfo);
    }

    @SuppressLint({"NewApi"})
    public final SplitAttributesCalculatorParams translate(androidx.window.extensions.embedding.SplitAttributesCalculatorParams params) {
        j.g(params, "params");
        WindowMetrics parentWindowMetrics = params.getParentWindowMetrics();
        j.f(parentWindowMetrics, "params.parentWindowMetrics");
        Configuration parentConfiguration = params.getParentConfiguration();
        j.f(parentConfiguration, "params.parentConfiguration");
        WindowLayoutInfo parentWindowLayoutInfo = params.getParentWindowLayoutInfo();
        j.f(parentWindowLayoutInfo, "params.parentWindowLayoutInfo");
        androidx.window.extensions.embedding.SplitAttributes defaultSplitAttributes = params.getDefaultSplitAttributes();
        j.f(defaultSplitAttributes, "params.defaultSplitAttributes");
        boolean zAreDefaultConstraintsSatisfied = params.areDefaultConstraintsSatisfied();
        String splitRuleTag = params.getSplitRuleTag();
        androidx.window.layout.WindowMetrics windowMetricsTranslateWindowMetrics$window_release = WindowMetricsCalculator.Companion.translateWindowMetrics$window_release(parentWindowMetrics);
        return new SplitAttributesCalculatorParams(windowMetricsTranslateWindowMetrics$window_release, parentConfiguration, ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window_release(windowMetricsTranslateWindowMetrics$window_release, parentWindowLayoutInfo), translate$window_release(defaultSplitAttributes), zAreDefaultConstraintsSatisfied, splitRuleTag);
    }

    public final Set<androidx.window.extensions.embedding.EmbeddingRule> translate(Context context, Set<? extends EmbeddingRule> rules) {
        androidx.window.extensions.embedding.SplitPairRule splitPairRuleTranslateActivityRule;
        j.g(context, "context");
        j.g(rules, "rules");
        Class<?> clsPredicateClassOrNull$window_release = this.predicateAdapter.predicateClassOrNull$window_release();
        if (clsPredicateClassOrNull$window_release == null) {
            return C1114E.f9379a;
        }
        ArrayList arrayList = new ArrayList(t.l(rules, 10));
        for (EmbeddingRule embeddingRule : rules) {
            if (embeddingRule instanceof SplitPairRule) {
                splitPairRuleTranslateActivityRule = translateSplitPairRule(context, (SplitPairRule) embeddingRule, clsPredicateClassOrNull$window_release);
            } else if (embeddingRule instanceof SplitPlaceholderRule) {
                splitPairRuleTranslateActivityRule = translateSplitPlaceholderRule(context, (SplitPlaceholderRule) embeddingRule, clsPredicateClassOrNull$window_release);
            } else {
                if (!(embeddingRule instanceof ActivityRule)) {
                    throw new IllegalArgumentException("Unsupported rule type");
                }
                splitPairRuleTranslateActivityRule = translateActivityRule((ActivityRule) embeddingRule, clsPredicateClassOrNull$window_release);
            }
            arrayList.add((androidx.window.extensions.embedding.EmbeddingRule) splitPairRuleTranslateActivityRule);
        }
        return C1110A.Z(arrayList);
    }
}
