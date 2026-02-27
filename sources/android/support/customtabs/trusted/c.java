package android.support.customtabs.trusted;

import android.os.Bundle;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public interface c extends IInterface {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String f7260G = "android$support$customtabs$trusted$ITrustedWebActivityCallback".replace('$', '.');

    void onExtraCallback(String str, Bundle bundle);
}
