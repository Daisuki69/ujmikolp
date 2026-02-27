package androidx.window.embedding;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.IBinder;
import androidx.annotation.RestrictTo;
import androidx.core.util.Consumer;
import androidx.window.RequiresWindowSdkExtension;
import androidx.window.embedding.SplitController;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface EmbeddingBackend {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static Function1<? super EmbeddingBackend, ? extends EmbeddingBackend> decorator = EmbeddingBackend$Companion$decorator$1.INSTANCE;

        private Companion() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public final EmbeddingBackend getInstance(Context context) {
            j.g(context, "context");
            return (EmbeddingBackend) decorator.invoke(ExtensionEmbeddingBackend.Companion.getInstance(context));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void overrideDecorator(EmbeddingBackendDecorator overridingDecorator) {
            j.g(overridingDecorator, "overridingDecorator");
            decorator = new EmbeddingBackend$Companion$overrideDecorator$1(overridingDecorator);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void reset() {
            decorator = EmbeddingBackend$Companion$reset$1.INSTANCE;
        }
    }

    void addRule(EmbeddingRule embeddingRule);

    void addSplitListenerForActivity(Activity activity, Executor executor, Consumer<List<SplitInfo>> consumer);

    @RequiresWindowSdkExtension(version = 2)
    void clearSplitAttributesCalculator();

    ActivityStack getActivityStack(Activity activity);

    Set<EmbeddingRule> getRules();

    SplitController.SplitSupportStatus getSplitSupportStatus();

    @RequiresWindowSdkExtension(version = 3)
    void invalidateTopVisibleSplitAttributes();

    boolean isActivityEmbedded(Activity activity);

    void removeRule(EmbeddingRule embeddingRule);

    void removeSplitListenerForActivity(Consumer<List<SplitInfo>> consumer);

    @RequiresWindowSdkExtension(version = 3)
    ActivityOptions setLaunchingActivityStack(ActivityOptions activityOptions, IBinder iBinder);

    void setRules(Set<? extends EmbeddingRule> set);

    @RequiresWindowSdkExtension(version = 2)
    void setSplitAttributesCalculator(Function1<? super SplitAttributesCalculatorParams, SplitAttributes> function1);

    @RequiresWindowSdkExtension(version = 3)
    void updateSplitAttributes(SplitInfo splitInfo, SplitAttributes splitAttributes);
}
