package androidx.window.embedding;

import We.s;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import androidx.core.util.Consumer;
import androidx.window.RequiresWindowSdkExtension;
import androidx.window.WindowProperties;
import androidx.window.core.BuildConfig;
import androidx.window.core.ConsumerAdapter;
import androidx.window.core.ExtensionsUtil;
import androidx.window.core.PredicateAdapter;
import androidx.window.core.VerificationMode;
import androidx.window.embedding.EmbeddingCompat;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.embedding.SplitController;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1110A;
import cj.C1112C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ExtensionEmbeddingBackend implements EmbeddingBackend {
    private static final String TAG = "EmbeddingBackend";
    private static volatile ExtensionEmbeddingBackend globalInstance;
    private final Context applicationContext;

    @GuardedBy("globalLock")
    @VisibleForTesting
    private EmbeddingInterfaceCompat embeddingExtension;

    @GuardedBy("globalLock")
    private final RuleTracker ruleTracker;
    private final CopyOnWriteArrayList<SplitListenerWrapper> splitChangeCallbacks;
    private final EmbeddingCallbackImpl splitInfoEmbeddingCallback;
    private final InterfaceC1033d splitSupportStatus$delegate;
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock globalLock = new ReentrantLock();

    @RequiresApi(31)
    public static final class Api31Impl {
        public static final Api31Impl INSTANCE = new Api31Impl();

        private Api31Impl() {
        }

        @DoNotInline
        public final SplitController.SplitSupportStatus isSplitPropertyEnabled(Context context) {
            j.g(context, "context");
            try {
                PackageManager.Property property = context.getPackageManager().getProperty(WindowProperties.PROPERTY_ACTIVITY_EMBEDDING_SPLITS_ENABLED, context.getPackageName());
                j.f(property, "try {\n                co…OT_DECLARED\n            }");
                if (property.isBoolean()) {
                    return property.getBoolean() ? SplitController.SplitSupportStatus.SPLIT_AVAILABLE : SplitController.SplitSupportStatus.SPLIT_UNAVAILABLE;
                }
                if (BuildConfig.INSTANCE.getVerificationMode() == VerificationMode.LOG) {
                    Log.w(ExtensionEmbeddingBackend.TAG, "android.window.PROPERTY_ACTIVITY_EMBEDDING_SPLITS_ENABLED must have a boolean value");
                }
                return SplitController.SplitSupportStatus.SPLIT_ERROR_PROPERTY_NOT_DECLARED;
            } catch (PackageManager.NameNotFoundException unused) {
                if (BuildConfig.INSTANCE.getVerificationMode() == VerificationMode.LOG) {
                    Log.w(ExtensionEmbeddingBackend.TAG, "android.window.PROPERTY_ACTIVITY_EMBEDDING_SPLITS_ENABLED must be set and enabled in AndroidManifest.xml to use splits APIs.");
                }
                return SplitController.SplitSupportStatus.SPLIT_ERROR_PROPERTY_NOT_DECLARED;
            } catch (Exception e) {
                if (BuildConfig.INSTANCE.getVerificationMode() == VerificationMode.LOG) {
                    Log.e(ExtensionEmbeddingBackend.TAG, "PackageManager.getProperty is not supported", e);
                }
                return SplitController.SplitSupportStatus.SPLIT_ERROR_PROPERTY_NOT_DECLARED;
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final EmbeddingInterfaceCompat initAndVerifyEmbeddingExtension(Context context) {
            ClassLoader classLoader;
            EmbeddingCompat embeddingCompat = null;
            try {
                if (isExtensionVersionSupported(Integer.valueOf(ExtensionsUtil.INSTANCE.getSafeVendorApiLevel()))) {
                    EmbeddingCompat.Companion companion = EmbeddingCompat.Companion;
                    if (companion.isEmbeddingAvailable() && (classLoader = EmbeddingBackend.class.getClassLoader()) != null) {
                        embeddingCompat = new EmbeddingCompat(companion.embeddingComponent(), new EmbeddingAdapter(new PredicateAdapter(classLoader)), new ConsumerAdapter(classLoader), context);
                    }
                }
            } catch (Throwable th2) {
                Log.d(ExtensionEmbeddingBackend.TAG, "Failed to load embedding extension: " + th2);
            }
            if (embeddingCompat == null) {
                Log.d(ExtensionEmbeddingBackend.TAG, "No supported embedding extension found");
            }
            return embeddingCompat;
        }

        public final EmbeddingBackend getInstance(Context context) {
            j.g(context, "context");
            if (ExtensionEmbeddingBackend.globalInstance == null) {
                ReentrantLock reentrantLock = ExtensionEmbeddingBackend.globalLock;
                reentrantLock.lock();
                try {
                    if (ExtensionEmbeddingBackend.globalInstance == null) {
                        Context applicationContext = context.getApplicationContext();
                        Companion companion = ExtensionEmbeddingBackend.Companion;
                        j.f(applicationContext, "applicationContext");
                        ExtensionEmbeddingBackend.globalInstance = new ExtensionEmbeddingBackend(applicationContext, companion.initAndVerifyEmbeddingExtension(applicationContext));
                    }
                    Unit unit = Unit.f18162a;
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            ExtensionEmbeddingBackend extensionEmbeddingBackend = ExtensionEmbeddingBackend.globalInstance;
            j.d(extensionEmbeddingBackend);
            return extensionEmbeddingBackend;
        }

        @VisibleForTesting
        public final boolean isExtensionVersionSupported(Integer num) {
            return num != null && num.intValue() >= 1;
        }

        private Companion() {
        }
    }

    public final class EmbeddingCallbackImpl implements EmbeddingInterfaceCompat.EmbeddingCallbackInterface {
        private List<SplitInfo> lastInfo;

        public EmbeddingCallbackImpl() {
        }

        public final List<SplitInfo> getLastInfo() {
            return this.lastInfo;
        }

        @Override // androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface
        public void onSplitInfoChanged(List<SplitInfo> splitInfo) {
            j.g(splitInfo, "splitInfo");
            this.lastInfo = splitInfo;
            Iterator<SplitListenerWrapper> it = ExtensionEmbeddingBackend.this.getSplitChangeCallbacks().iterator();
            while (it.hasNext()) {
                it.next().accept(splitInfo);
            }
        }

        public final void setLastInfo(List<SplitInfo> list) {
            this.lastInfo = list;
        }
    }

    public static final class RuleTracker {
        private final ArraySet<EmbeddingRule> splitRules = new ArraySet<>();
        private final HashMap<String, EmbeddingRule> tagRuleMap = new HashMap<>();

        public static /* synthetic */ void addOrUpdateRule$default(RuleTracker ruleTracker, EmbeddingRule embeddingRule, boolean z4, int i, Object obj) {
            if ((i & 2) != 0) {
                z4 = false;
            }
            ruleTracker.addOrUpdateRule(embeddingRule, z4);
        }

        public final void addOrUpdateRule(EmbeddingRule rule, boolean z4) {
            j.g(rule, "rule");
            if (this.splitRules.contains(rule)) {
                return;
            }
            String tag = rule.getTag();
            if (tag == null) {
                this.splitRules.add(rule);
                return;
            }
            if (!this.tagRuleMap.containsKey(tag)) {
                this.tagRuleMap.put(tag, rule);
                this.splitRules.add(rule);
            } else {
                if (z4) {
                    throw new IllegalArgumentException(s.j("Duplicated tag: ", tag, ". Tag must be unique among all registered rules"));
                }
                this.splitRules.remove(this.tagRuleMap.get(tag));
                this.tagRuleMap.put(tag, rule);
                this.splitRules.add(rule);
            }
        }

        public final void clearRules() {
            this.splitRules.clear();
            this.tagRuleMap.clear();
        }

        public final boolean contains(EmbeddingRule rule) {
            j.g(rule, "rule");
            return this.splitRules.contains(rule);
        }

        public final ArraySet<EmbeddingRule> getSplitRules() {
            return this.splitRules;
        }

        public final void removeRule(EmbeddingRule rule) {
            j.g(rule, "rule");
            if (this.splitRules.contains(rule)) {
                this.splitRules.remove(rule);
                if (rule.getTag() != null) {
                    this.tagRuleMap.remove(rule.getTag());
                }
            }
        }

        public final void setRules(Set<? extends EmbeddingRule> rules) {
            j.g(rules, "rules");
            clearRules();
            Iterator<T> it = rules.iterator();
            while (it.hasNext()) {
                addOrUpdateRule((EmbeddingRule) it.next(), true);
            }
        }
    }

    public static final class SplitListenerWrapper {
        private final Activity activity;
        private final Consumer<List<SplitInfo>> callback;
        private final Executor executor;
        private List<SplitInfo> lastValue;

        public SplitListenerWrapper(Activity activity, Executor executor, Consumer<List<SplitInfo>> callback) {
            j.g(activity, "activity");
            j.g(executor, "executor");
            j.g(callback, "callback");
            this.activity = activity;
            this.executor = executor;
            this.callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void accept$lambda$1(SplitListenerWrapper this$0, List splitsWithActivity) {
            j.g(this$0, "this$0");
            j.g(splitsWithActivity, "$splitsWithActivity");
            this$0.callback.accept(splitsWithActivity);
        }

        public final void accept(List<SplitInfo> splitInfoList) {
            j.g(splitInfoList, "splitInfoList");
            ArrayList arrayList = new ArrayList();
            for (Object obj : splitInfoList) {
                if (((SplitInfo) obj).contains(this.activity)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.equals(this.lastValue)) {
                return;
            }
            this.lastValue = arrayList;
            this.executor.execute(new androidx.media3.common.util.g(7, this, arrayList));
        }

        public final Consumer<List<SplitInfo>> getCallback() {
            return this.callback;
        }
    }

    @VisibleForTesting
    public ExtensionEmbeddingBackend(Context applicationContext, EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        j.g(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
        this.embeddingExtension = embeddingInterfaceCompat;
        EmbeddingCallbackImpl embeddingCallbackImpl = new EmbeddingCallbackImpl();
        this.splitInfoEmbeddingCallback = embeddingCallbackImpl;
        this.splitChangeCallbacks = new CopyOnWriteArrayList<>();
        EmbeddingInterfaceCompat embeddingInterfaceCompat2 = this.embeddingExtension;
        if (embeddingInterfaceCompat2 != null) {
            embeddingInterfaceCompat2.setEmbeddingCallback(embeddingCallbackImpl);
        }
        this.ruleTracker = new RuleTracker();
        this.splitSupportStatus$delegate = C1034e.b(new ExtensionEmbeddingBackend$splitSupportStatus$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean areExtensionsAvailable() {
        return this.embeddingExtension != null;
    }

    @VisibleForTesting
    public static /* synthetic */ void getSplitChangeCallbacks$annotations() {
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    @GuardedBy("globalLock")
    public void addRule(EmbeddingRule rule) {
        j.g(rule, "rule");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            if (!this.ruleTracker.contains(rule)) {
                RuleTracker.addOrUpdateRule$default(this.ruleTracker, rule, false, 2, null);
                EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
                if (embeddingInterfaceCompat != null) {
                    embeddingInterfaceCompat.setRules(getRules());
                }
            }
            Unit unit = Unit.f18162a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void addSplitListenerForActivity(Activity activity, Executor executor, Consumer<List<SplitInfo>> callback) {
        j.g(activity, "activity");
        j.g(executor, "executor");
        j.g(callback, "callback");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            if (this.embeddingExtension == null) {
                Log.v(TAG, "Extension not loaded, skipping callback registration.");
                callback.accept(C1112C.f9377a);
                return;
            }
            SplitListenerWrapper splitListenerWrapper = new SplitListenerWrapper(activity, executor, callback);
            this.splitChangeCallbacks.add(splitListenerWrapper);
            if (this.splitInfoEmbeddingCallback.getLastInfo() != null) {
                List<SplitInfo> lastInfo = this.splitInfoEmbeddingCallback.getLastInfo();
                j.d(lastInfo);
                splitListenerWrapper.accept(lastInfo);
            } else {
                splitListenerWrapper.accept(C1112C.f9377a);
            }
            Unit unit = Unit.f18162a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    @RequiresWindowSdkExtension(version = 2)
    public void clearSplitAttributesCalculator() {
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
            if (embeddingInterfaceCompat != null) {
                embeddingInterfaceCompat.clearSplitAttributesCalculator();
                Unit unit = Unit.f18162a;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public ActivityStack getActivityStack(Activity activity) {
        j.g(activity, "activity");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            List<SplitInfo> lastInfo = this.splitInfoEmbeddingCallback.getLastInfo();
            if (lastInfo == null) {
                return null;
            }
            for (SplitInfo splitInfo : lastInfo) {
                if (splitInfo.contains(activity)) {
                    if (splitInfo.getPrimaryActivityStack().contains(activity)) {
                        return splitInfo.getPrimaryActivityStack();
                    }
                    if (splitInfo.getSecondaryActivityStack().contains(activity)) {
                        return splitInfo.getSecondaryActivityStack();
                    }
                }
            }
            return null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final EmbeddingInterfaceCompat getEmbeddingExtension() {
        return this.embeddingExtension;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    @GuardedBy("globalLock")
    public Set<EmbeddingRule> getRules() {
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            return C1110A.Z(this.ruleTracker.getSplitRules());
        } finally {
            reentrantLock.unlock();
        }
    }

    public final CopyOnWriteArrayList<SplitListenerWrapper> getSplitChangeCallbacks() {
        return this.splitChangeCallbacks;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public SplitController.SplitSupportStatus getSplitSupportStatus() {
        return (SplitController.SplitSupportStatus) this.splitSupportStatus$delegate.getValue();
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    @RequiresWindowSdkExtension(version = 3)
    public void invalidateTopVisibleSplitAttributes() {
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            embeddingInterfaceCompat.invalidateTopVisibleSplitAttributes();
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public boolean isActivityEmbedded(Activity activity) {
        j.g(activity, "activity");
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            return embeddingInterfaceCompat.isActivityEmbedded(activity);
        }
        return false;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    @GuardedBy("globalLock")
    public void removeRule(EmbeddingRule rule) {
        j.g(rule, "rule");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            if (this.ruleTracker.contains(rule)) {
                this.ruleTracker.removeRule(rule);
                EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
                if (embeddingInterfaceCompat != null) {
                    embeddingInterfaceCompat.setRules(getRules());
                }
            }
            Unit unit = Unit.f18162a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void removeSplitListenerForActivity(Consumer<List<SplitInfo>> consumer) {
        j.g(consumer, "consumer");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            Iterator<SplitListenerWrapper> it = this.splitChangeCallbacks.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SplitListenerWrapper next = it.next();
                if (j.b(next.getCallback(), consumer)) {
                    this.splitChangeCallbacks.remove(next);
                    break;
                }
            }
            Unit unit = Unit.f18162a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void setEmbeddingExtension(EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.embeddingExtension = embeddingInterfaceCompat;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    @RequiresWindowSdkExtension(version = 3)
    public ActivityOptions setLaunchingActivityStack(ActivityOptions options, IBinder token) {
        ActivityOptions launchingActivityStack;
        j.g(options, "options");
        j.g(token, "token");
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        return (embeddingInterfaceCompat == null || (launchingActivityStack = embeddingInterfaceCompat.setLaunchingActivityStack(options, token)) == null) ? options : launchingActivityStack;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    @GuardedBy("globalLock")
    public void setRules(Set<? extends EmbeddingRule> rules) {
        j.g(rules, "rules");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            this.ruleTracker.setRules(rules);
            EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
            if (embeddingInterfaceCompat != null) {
                embeddingInterfaceCompat.setRules(getRules());
                Unit unit = Unit.f18162a;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    @RequiresWindowSdkExtension(version = 2)
    public void setSplitAttributesCalculator(Function1<? super SplitAttributesCalculatorParams, SplitAttributes> calculator) {
        j.g(calculator, "calculator");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
            if (embeddingInterfaceCompat != null) {
                embeddingInterfaceCompat.setSplitAttributesCalculator(calculator);
                Unit unit = Unit.f18162a;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    @RequiresWindowSdkExtension(version = 3)
    public void updateSplitAttributes(SplitInfo splitInfo, SplitAttributes splitAttributes) {
        j.g(splitInfo, "splitInfo");
        j.g(splitAttributes, "splitAttributes");
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            embeddingInterfaceCompat.updateSplitAttributes(splitInfo, splitAttributes);
        }
    }
}
