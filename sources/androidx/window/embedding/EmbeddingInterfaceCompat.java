package androidx.window.embedding;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.IBinder;
import androidx.window.RequiresWindowSdkExtension;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public interface EmbeddingInterfaceCompat {

    public interface EmbeddingCallbackInterface {
        void onSplitInfoChanged(List<SplitInfo> list);
    }

    @RequiresWindowSdkExtension(version = 2)
    void clearSplitAttributesCalculator();

    @RequiresWindowSdkExtension(version = 3)
    void invalidateTopVisibleSplitAttributes();

    boolean isActivityEmbedded(Activity activity);

    void setEmbeddingCallback(EmbeddingCallbackInterface embeddingCallbackInterface);

    @RequiresWindowSdkExtension(version = 3)
    ActivityOptions setLaunchingActivityStack(ActivityOptions activityOptions, IBinder iBinder);

    void setRules(Set<? extends EmbeddingRule> set);

    @RequiresWindowSdkExtension(version = 2)
    void setSplitAttributesCalculator(Function1<? super SplitAttributesCalculatorParams, SplitAttributes> function1);

    @RequiresWindowSdkExtension(version = 3)
    void updateSplitAttributes(SplitInfo splitInfo, SplitAttributes splitAttributes);
}
