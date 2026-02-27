package android.support.customtabs;

import android.os.Bundle;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public interface l extends IInterface {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f7258F = "android$support$customtabs$IPostMessageService".replace('$', '.');

    void onMessageChannelReady(c cVar, Bundle bundle);

    void onPostMessage(c cVar, String str, Bundle bundle);
}
