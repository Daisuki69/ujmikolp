package androidx.window.embedding;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.IBinder;
import android.util.Log;
import androidx.window.RequiresWindowSdkExtension;
import androidx.window.WindowSdkExtensions;
import androidx.window.core.BuildConfig;
import androidx.window.core.ConsumerAdapter;
import androidx.window.core.ExtensionsUtil;
import androidx.window.core.VerificationMode;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.embedding.SplitController;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes2.dex */
public final class EmbeddingCompat implements EmbeddingInterfaceCompat {
    public static final Companion Companion = new Companion(null);
    public static final boolean DEBUG = true;
    private static final String TAG = "EmbeddingCompat";
    private final EmbeddingAdapter adapter;
    private final Context applicationContext;
    private final ConsumerAdapter consumerAdapter;
    private final ActivityEmbeddingComponent embeddingExtension;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ActivityEmbeddingComponent emptyActivityEmbeddingProxy() {
            Object objNewProxyInstance = Proxy.newProxyInstance(EmbeddingCompat.class.getClassLoader(), new Class[]{ActivityEmbeddingComponent.class}, new h());
            j.e(objNewProxyInstance, "null cannot be cast to non-null type androidx.window.extensions.embedding.ActivityEmbeddingComponent");
            return (ActivityEmbeddingComponent) objNewProxyInstance;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit emptyActivityEmbeddingProxy$lambda$2(Object obj, Method method, Object[] objArr) {
            return Unit.f18162a;
        }

        public final ActivityEmbeddingComponent embeddingComponent() {
            if (!isEmbeddingAvailable()) {
                return emptyActivityEmbeddingProxy();
            }
            ClassLoader classLoader = EmbeddingCompat.class.getClassLoader();
            if (classLoader != null) {
                ConsumerAdapter consumerAdapter = new ConsumerAdapter(classLoader);
                WindowExtensions windowExtensions = WindowExtensionsProvider.getWindowExtensions();
                j.f(windowExtensions, "getWindowExtensions()");
                ActivityEmbeddingComponent activityEmbeddingComponent = new SafeActivityEmbeddingComponentProvider(classLoader, consumerAdapter, windowExtensions).getActivityEmbeddingComponent();
                if (activityEmbeddingComponent != null) {
                    return activityEmbeddingComponent;
                }
            }
            return emptyActivityEmbeddingProxy();
        }

        public final boolean isEmbeddingAvailable() {
            try {
                ClassLoader classLoader = EmbeddingCompat.class.getClassLoader();
                if (classLoader != null) {
                    ConsumerAdapter consumerAdapter = new ConsumerAdapter(classLoader);
                    WindowExtensions windowExtensions = WindowExtensionsProvider.getWindowExtensions();
                    j.f(windowExtensions, "getWindowExtensions()");
                    if (new SafeActivityEmbeddingComponentProvider(classLoader, consumerAdapter, windowExtensions).getActivityEmbeddingComponent() != null) {
                        return true;
                    }
                }
                return false;
            } catch (NoClassDefFoundError unused) {
                Log.d(EmbeddingCompat.TAG, "Embedding extension version not found");
                return false;
            } catch (UnsupportedOperationException unused2) {
                Log.d(EmbeddingCompat.TAG, "Stub Extension");
                return false;
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.window.embedding.EmbeddingCompat$setEmbeddingCallback$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function1<List<?>, Unit> {
        final /* synthetic */ EmbeddingInterfaceCompat.EmbeddingCallbackInterface $embeddingCallback;
        final /* synthetic */ EmbeddingCompat this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface, EmbeddingCompat embeddingCompat) {
            super(1);
            this.$embeddingCallback = embeddingCallbackInterface;
            this.this$0 = embeddingCompat;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<?>) obj);
            return Unit.f18162a;
        }

        public final void invoke(List<?> values) {
            j.g(values, "values");
            ArrayList arrayList = new ArrayList();
            for (Object obj : values) {
                if (obj instanceof androidx.window.extensions.embedding.SplitInfo) {
                    arrayList.add(obj);
                }
            }
            this.$embeddingCallback.onSplitInfoChanged(this.this$0.adapter.translate(arrayList));
        }
    }

    public EmbeddingCompat(ActivityEmbeddingComponent embeddingExtension, EmbeddingAdapter adapter, ConsumerAdapter consumerAdapter, Context applicationContext) {
        j.g(embeddingExtension, "embeddingExtension");
        j.g(adapter, "adapter");
        j.g(consumerAdapter, "consumerAdapter");
        j.g(applicationContext, "applicationContext");
        this.embeddingExtension = embeddingExtension;
        this.adapter = adapter;
        this.consumerAdapter = consumerAdapter;
        this.applicationContext = applicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setEmbeddingCallback$lambda$0(EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallback, EmbeddingCompat this$0, List splitInfoList) {
        j.g(embeddingCallback, "$embeddingCallback");
        j.g(this$0, "this$0");
        EmbeddingAdapter embeddingAdapter = this$0.adapter;
        j.f(splitInfoList, "splitInfoList");
        embeddingCallback.onSplitInfoChanged(embeddingAdapter.translate((List<? extends androidx.window.extensions.embedding.SplitInfo>) splitInfoList));
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    @RequiresWindowSdkExtension(version = 2)
    public void clearSplitAttributesCalculator() {
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window_release(2);
        this.embeddingExtension.clearSplitAttributesCalculator();
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    @RequiresWindowSdkExtension(version = 3)
    public void invalidateTopVisibleSplitAttributes() {
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window_release(3);
        this.embeddingExtension.invalidateTopVisibleSplitAttributes();
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public boolean isActivityEmbedded(Activity activity) {
        j.g(activity, "activity");
        return this.embeddingExtension.isActivityEmbedded(activity);
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void setEmbeddingCallback(EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallback) {
        j.g(embeddingCallback, "embeddingCallback");
        if (ExtensionsUtil.INSTANCE.getSafeVendorApiLevel() < 2) {
            this.consumerAdapter.addConsumer(this.embeddingExtension, z.a(List.class), "setSplitInfoCallback", new AnonymousClass1(embeddingCallback, this));
        } else {
            this.embeddingExtension.setSplitInfoCallback(new androidx.camera.lifecycle.a(16, embeddingCallback, this));
        }
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    @RequiresWindowSdkExtension(version = 3)
    public ActivityOptions setLaunchingActivityStack(ActivityOptions options, IBinder token) {
        j.g(options, "options");
        j.g(token, "token");
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window_release(3);
        ActivityOptions launchingActivityStack = this.embeddingExtension.setLaunchingActivityStack(options, token);
        j.f(launchingActivityStack, "embeddingExtension.setLa…vityStack(options, token)");
        return launchingActivityStack;
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void setRules(Set<? extends EmbeddingRule> rules) {
        j.g(rules, "rules");
        Iterator<? extends EmbeddingRule> it = rules.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (it.next() instanceof SplitRule) {
                if (!j.b(SplitController.Companion.getInstance(this.applicationContext).getSplitSupportStatus(), SplitController.SplitSupportStatus.SPLIT_AVAILABLE)) {
                    if (BuildConfig.INSTANCE.getVerificationMode() == VerificationMode.LOG) {
                        Log.w(TAG, "Cannot set SplitRule because ActivityEmbedding Split is not supported or PROPERTY_ACTIVITY_EMBEDDING_SPLITS_ENABLED is not set.");
                        return;
                    }
                    return;
                }
            }
        }
        this.embeddingExtension.setEmbeddingRules(this.adapter.translate(this.applicationContext, rules));
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    @RequiresWindowSdkExtension(version = 2)
    public void setSplitAttributesCalculator(Function1<? super SplitAttributesCalculatorParams, SplitAttributes> calculator) {
        j.g(calculator, "calculator");
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window_release(2);
        this.embeddingExtension.setSplitAttributesCalculator(this.adapter.translateSplitAttributesCalculator(calculator));
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    @RequiresWindowSdkExtension(version = 3)
    public void updateSplitAttributes(SplitInfo splitInfo, SplitAttributes splitAttributes) {
        j.g(splitInfo, "splitInfo");
        j.g(splitAttributes, "splitAttributes");
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window_release(3);
        this.embeddingExtension.updateSplitAttributes(splitInfo.getToken$window_release(), this.adapter.translateSplitAttributes(splitAttributes));
    }
}
