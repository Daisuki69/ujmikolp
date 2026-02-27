package com.google.android.gms.internal.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import dOYHB6.yFtIp6.ht2aO8;

/* JADX INFO: loaded from: classes3.dex */
public final class zao extends ContextCompat {
    @Nullable
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent zaa(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (zan.zaa()) {
            return ht2aO8.registerReceiver(context, broadcastReceiver, intentFilter, true != zan.zaa() ? 0 : 2);
        }
        return ht2aO8.registerReceiver(context, broadcastReceiver, intentFilter);
    }
}
