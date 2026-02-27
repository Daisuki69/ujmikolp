package android.support.customtabs;

import android.os.Bundle;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public interface i extends IInterface {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f7256E = "android$support$customtabs$IEngagementSignalsCallback".replace('$', '.');

    void onGreatestScrollPercentageIncreased(int i, Bundle bundle);

    void onSessionEnded(boolean z4, Bundle bundle);

    void onVerticalScrollEvent(boolean z4, Bundle bundle);
}
