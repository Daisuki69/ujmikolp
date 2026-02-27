package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class zze extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9727a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zze(Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.f9727a = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        TaskCompletionSource taskCompletionSource = this.f9727a;
        if (i == 1) {
            taskCompletionSource.trySetResult(-1);
        } else if (i != 2) {
            taskCompletionSource.trySetResult(1);
        } else {
            taskCompletionSource.trySetResult(0);
        }
    }
}
